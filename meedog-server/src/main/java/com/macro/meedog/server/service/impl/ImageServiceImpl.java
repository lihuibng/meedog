package com.macro.meedog.server.service.impl;

import com.alibaba.fastjson.JSON;
import com.macro.meedog.common.leaf.IDGenerator;
import com.macro.meedog.common.tair.TairClientUtil;
import com.macro.meedog.mapper.PictureMapper;
import com.macro.meedog.model.Picture;
import com.macro.meedog.server.config.TairConfig;
import com.macro.meedog.server.domain.Image;
import com.macro.meedog.server.domain.ItemStatus;
import com.macro.meedog.server.service.ImageService;
import com.macro.meedog.server.util.CompressUtil;
import com.taobao.tair.DataEntry;
import com.taobao.tair.ResultCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author "xxxxxx"
 * @modified 2021/1/3 4:01 下午
 */
@Service
public class ImageServiceImpl implements ImageService {

    private static final Logger LOG = LoggerFactory.getLogger(ImageServiceImpl.class);

    TairConfig tairConfig = new TairConfig();
    private final TairClientUtil tairClientUtil = new TairClientUtil(
            tairConfig.getConfigServers(),
            tairConfig.getGroup());
    @Autowired
    IDGenerator idGen;
    @Autowired
    PictureMapper pictureMapper;

    @Override
    public void init(TairConfig tairConfig) {
        tairClientUtil.init(tairConfig.getConfigServers(), tairConfig.getGroup());
    }

    @Override
    public Long store(String imageName, byte[] imageContent) {
        Image dbImage = new Image();
        dbImage.setId(idGen.generate());
        dbImage.setName(imageName);
        LOG.info("store id: " + dbImage.getId() + ", name: "
                + dbImage.getName() + ", len: " + imageContent.length);
        dbImage.setContent(CompressUtil.compressBytes(imageContent));
        ResultCode result = tairClientUtil.put(0, dbImage.getId(), JSON.toJSONString(dbImage));
        LOG.info("store id: " + dbImage.getId() + ", name: "
                + dbImage.getName() + ", len: " + imageContent.length + ", code: " + result.toString());

        if (result.isSuccess()) {
            Picture picture = new Picture();
            ByteArrayInputStream in = new ByteArrayInputStream(dbImage.getContent()); //将b作为输入流；
            try {
                BufferedImage image = ImageIO.read(in);
                if (image != null) {
                    picture.setHeight(image.getHeight());
                    picture.setWidth(image.getWidth());
                    picture.setFileType(image.getType());

                    LOG.info("image prop: " + image.getPropertyNames().toString());
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

            picture.setPicId(dbImage.getId());
            picture.setName(dbImage.getName());
            picture.setSize(dbImage.getContent().length);
            picture.setStatus(ItemStatus.ENABLED);
            picture.setPicMd5(DigestUtils.md5DigestAsHex(dbImage.getContent()));
            picture.setCreateTime(new Date());
            picture.setModifiedTime(new Date());

            pictureMapper.insert(picture);
            return dbImage.getId();
        }
        return 0L;
    }

    @Override
    public List<Image> loadAll() {
        return new ArrayList<Image>();
    }

    @Override
    public Image load(Long id) {
        LOG.info("load id: " + id);
        DataEntry dataEntry = tairClientUtil.get(0, id);
        try {
            if (dataEntry != null) {
                Image image = JSON.parseObject((String) dataEntry.getValue(), Image.class);
                LOG.info("load id: " + id + ", image name: " + image.getName());
                return image;
            } else {
                LOG.info("error, id: " + id + ", load failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void deleteAll() {

    }
}
