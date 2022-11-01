package com.macro.meedog.server.service.impl;

import com.macro.meedog.mapper.BasicInfoPictureMapper;
import com.macro.meedog.mapper.UserBasicInfoMapper;
import com.macro.meedog.model.*;
import com.macro.meedog.server.domain.ItemStatus;
import com.macro.meedog.server.domain.vo.UserBasicInfoVo;
import com.macro.meedog.server.service.BasicInfoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author "xxxxxx"
 * @modified 2020/12/17 10:10 下午
 */

@Service
public class BasicInfoServiceImpl implements BasicInfoService {
    @Autowired
    private UserBasicInfoMapper userBasicInfoMapper;
    @Autowired
    private BasicInfoPictureMapper basicInfoPictureMapper;

    @Override
    public List<UserBasicInfoVo> getBasicInfoVos(Long uid) {
        List<UserBasicInfoVo> basicInfoVoList = new ArrayList<>();
        UserBasicInfoExample example = new UserBasicInfoExample();
        example.createCriteria().andUidEqualTo(uid).andStatusEqualTo(ItemStatus.ENABLED);
        List<UserBasicInfo> uBasicInfos = userBasicInfoMapper.selectByExample(example);
        for (UserBasicInfo u : uBasicInfos) {
            UserBasicInfoVo uvo = UserBasicInfoVo.modelToView(u);
            BasicInfoPictureExample basicInfoPictureExample = new BasicInfoPictureExample();
            basicInfoPictureExample.createCriteria().andBasicInfoIdEqualTo(u.getId())
                    .andStatusEqualTo(ItemStatus.ENABLED);
            List<BasicInfoPicture> basicInfoPictureList = basicInfoPictureMapper.selectByExample(basicInfoPictureExample);
            List<Long> pids = basicInfoPictureList.stream().map(BasicInfoPicture::getPicId).collect(Collectors.toList());
            List<String> picIds = pids.stream().map(String::valueOf).collect(Collectors.toList());
            uvo.setPicIds(picIds);
            basicInfoVoList.add(uvo);
        }
        return basicInfoVoList;
    }

    @Override
    public int insertBasicInfo(UserBasicInfo u) {
        UserBasicInfoExample example = new UserBasicInfoExample();
        example.createCriteria().andUidEqualTo(u.getUid()).andStatusEqualTo(ItemStatus.ENABLED);
        List<UserBasicInfo> userBasicInfoList = userBasicInfoMapper.selectByExample(example);
        u.setStatus(ItemStatus.ENABLED);
        u.setModifiedTime(new Date());
        if (!userBasicInfoList.isEmpty()) {
            return userBasicInfoMapper.updateByExampleSelective(u, example);
        } else {
            u.setCreateTime(new Date());
            return userBasicInfoMapper.insert(u);
        }
    }

    @Override
    public int updateBasicInfo(UserBasicInfo u) {
        UserBasicInfoExample example = new UserBasicInfoExample();
        example.createCriteria().andUidEqualTo(u.getUid()).andStatusEqualTo(ItemStatus.ENABLED);
        List<UserBasicInfo> userBasicInfoList = userBasicInfoMapper.selectByExample(example);
        u.setStatus(ItemStatus.ENABLED);
        u.setModifiedTime(new Date());
        if (!userBasicInfoList.isEmpty()) {
            return userBasicInfoMapper.updateByExampleSelective(u, example);
        } else {
            u.setCreateTime(new Date());
            return userBasicInfoMapper.insert(u);
        }
    }

    @Override
    public UserBasicInfoVo getBasicInfoVoById(Long id) {
        UserBasicInfoVo uvo = new UserBasicInfoVo();
        List<UserBasicInfoVo> basicInfoVos = getBasicInfoVos(id);
        if (!basicInfoVos.isEmpty()) {
            return basicInfoVos.get(0);
        }
        return uvo;
    }

    @Override
    public int deleteBasicInfo(Long id) {
        UserBasicInfoExample example = new UserBasicInfoExample();
        example.createCriteria().andIdEqualTo(id).andStatusEqualTo(ItemStatus.ENABLED);
        UserBasicInfo userBasicInfo = new UserBasicInfo();
        userBasicInfo.setStatus(ItemStatus.DELETED);
        return userBasicInfoMapper.updateByExampleSelective(userBasicInfo, example);
    }

    @Override
    public int clear(Long uid) {
        int count = 0;
        UserBasicInfoExample example = new UserBasicInfoExample();
        example.createCriteria().andUidEqualTo(uid).andStatusEqualTo(ItemStatus.ENABLED);
        List<UserBasicInfo> uBasicInfos = userBasicInfoMapper.selectByExample(example);
        for (UserBasicInfo u : uBasicInfos) {
            u.setStatus(ItemStatus.DELETED);
            count += userBasicInfoMapper.updateByExampleSelective(u, example);
        }
        return count;
    }

    @Override
    public int picInsertBasicInfo(Long id, List<Long> picIds) {
        int count = 0;
        if (CollectionUtils.isEmpty(picIds)) {
            return count;
        }
        for (Long picId : picIds) {
            BasicInfoPictureExample example = new BasicInfoPictureExample();
            example.createCriteria().andIdEqualTo(id).andPicIdEqualTo(picId)
                    .andStatusEqualTo(ItemStatus.ENABLED);
            List<BasicInfoPicture> basicInfoPictureList = basicInfoPictureMapper.selectByExample(example);
            if (CollectionUtils.isEmpty(basicInfoPictureList)) {
                BasicInfoPicture basicInfoPicture = new BasicInfoPicture();
                basicInfoPicture.setBasicInfoId(id);
                basicInfoPicture.setPicId(picId);
                basicInfoPicture.setStatus(ItemStatus.ENABLED);
                basicInfoPicture.setCreateTime(new Date());
                basicInfoPicture.setModifiedTime(new Date());
                count += basicInfoPictureMapper.insert(basicInfoPicture);
            }
        }
        UserBasicInfoExample basicInfoExample = new UserBasicInfoExample();
        basicInfoExample.createCriteria().andIdEqualTo(id).andStatusEqualTo(ItemStatus.ENABLED);
        List<UserBasicInfo> basicInfoList = userBasicInfoMapper.selectByExample(basicInfoExample);
        if (CollectionUtils.isEmpty(basicInfoList)) {
            if (basicInfoList.get(0).getPicId() == null) {
                basicInfoList.get(0).setPicId(picIds.get(0));
            }
        }
        return count;
    }
}
