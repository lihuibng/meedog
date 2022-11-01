package com.macro.meedog.server.service.impl;

import com.macro.meedog.mapper.UserMapper;
import com.macro.meedog.mapper.UserWeiboMapper;
import com.macro.meedog.mapper.UserWeiboPictureMapper;
import com.macro.meedog.model.*;
import com.macro.meedog.server.dao.UserWeiboDao;
import com.macro.meedog.server.domain.ItemStatus;
import com.macro.meedog.server.domain.WechatInfo;
import com.macro.meedog.server.domain.vo.UserWeiboVo;
import com.macro.meedog.server.service.UserService;
import com.macro.meedog.server.service.WeiboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Service实现类
 * Created by macro on 2018/8/2.
 */
@Service
public class WeiboServiceImpl implements WeiboService {
    @Autowired
    UserWeiboMapper userWeiboMapper;
    @Autowired
    UserMapper userMapper;
    @Autowired
    UserWeiboPictureMapper weiboPictureMapper;

    @Autowired
    UserWeiboDao userWeiboDao;

    @Override
    public int add(UserWeiboVo userWeiboVo) {
        int count = 0;
        UserWeibo userWeibo = UserWeiboVo.viewToModel(userWeiboVo);
        WechatInfo wechatInfo = userWeiboVo.getWechatInfo();
        userWeibo.setLikeCount(0);
        userWeibo.setCommentCount(0);
        userWeibo.setForwardCount(0);
        userWeibo.setCollectCount(0);
        userWeibo.setReadCount(0);
        userWeibo.setStatus(ItemStatus.ENABLED);
        userWeibo.setCreateTime(new Date());
        userWeibo.setModifiedTime(new Date());
        count = userWeiboMapper.insert(userWeibo);
        if (count > 0 && !CollectionUtils.isEmpty(userWeiboVo.getPicIds())) {
            for (int i = 0; i < userWeiboVo.getPicIds().size(); i++) {
                UserWeiboPicture userWeiboPicture = new UserWeiboPicture();
                userWeiboPicture.setUserWeiboId(userWeibo.getId());
                userWeiboPicture.setPicId(Long.parseLong(userWeiboVo.getPicIds().get(i)));
                userWeiboPicture.setStatus(ItemStatus.ENABLED);
                userWeiboPicture.setCreateTime(new Date());
                userWeiboPicture.setModifiedTime(new Date());
                weiboPictureMapper.insert(userWeiboPicture);
            }
        }
        UserExample userExample = new UserExample();
        userExample.createCriteria()
                .andUidEqualTo(Long.parseLong(userWeiboVo.getUid()))
                .andStatusEqualTo(ItemStatus.ENABLED);
        User u = new User();
        u.setUid(Long.parseLong(userWeiboVo.getUid()));
        u.setStatus(ItemStatus.ENABLED);
        if (wechatInfo != null) {
            u.setWechatGender(wechatInfo.getUserInfo().getGender());
            u.setWechatNickname(wechatInfo.getUserInfo().getNickName());
            u.setWechatAvatarUrl(wechatInfo.getUserInfo().getAvatarUrl());
            u.setWechatCity(wechatInfo.getUserInfo().getCity());
            u.setWechatProvince(wechatInfo.getUserInfo().getProvince());
            u.setWechatCountry(wechatInfo.getUserInfo().getCountry());
            u.setWechatCloudid(wechatInfo.getCloudID());
            u.setWechatEncryptedData(wechatInfo.getEncryptedData());
            u.setWechatIv(wechatInfo.getIv());
            u.setWechatRawData(wechatInfo.getRawData());
            u.setWechatSignature(wechatInfo.getSignature());
            u.setWechatLanguage(wechatInfo.getUserInfo().getLanguage());
        }
        u.setModifiedTime(new Date());
        userMapper.updateByExampleSelective(u, userExample);

        return count;
    }

    @Override
    public int delete(Long id) {
        return userWeiboMapper.deleteByPrimaryKey(id);

    }

    @Override
    public List<UserWeiboVo> list(Integer pageNum, Integer pageSize) {
        List<UserWeiboVo> weiboVoList = new ArrayList<>();
        List<UserWeibo> weiboList = userWeiboDao.getUserWeiboList(pageNum, pageSize);

        if (!CollectionUtils.isEmpty(weiboList)) {
            for (int i = 0; i < weiboList.size(); i++) {
                UserWeiboPictureExample weiboPictureExample = new UserWeiboPictureExample();
                weiboPictureExample.createCriteria()
                        .andUserWeiboIdEqualTo(weiboList.get(i).getId())
                        .andStatusEqualTo(ItemStatus.ENABLED);
                List<UserWeiboPicture> weiboPictureList = weiboPictureMapper.selectByExample(weiboPictureExample);
                UserWeiboVo v = UserWeiboVo.modelToView(weiboList.get(i));
                if (!CollectionUtils.isEmpty(weiboPictureList)) {
                    v.setPicIds(weiboPictureList.stream()
                            .map(UserWeiboPicture::getPicId)
                            .map(String::valueOf)
                            .collect(Collectors.toList()));

                }
                UserExample userExample = new UserExample();
                userExample.createCriteria().andUidEqualTo(weiboList.get(i).getUid())
                        .andStatusEqualTo(ItemStatus.ENABLED);
                List<User> userList = userMapper.selectByExample(userExample);
                if (!CollectionUtils.isEmpty(userList)) {
                    v.setUserIcon(userList.get(0).getWechatAvatarUrl());
                    v.setUserNickName(userList.get(0).getWechatNickname());

                }
                weiboVoList.add(v);

            }
        }

        return weiboVoList;
    }

    @Override
    public UserWeiboVo detail(Long id) {
        UserWeiboExample userWeiboExample = new UserWeiboExample();
        userWeiboExample.createCriteria().andIdEqualTo(id).andStatusEqualTo(ItemStatus.ENABLED);
        List<UserWeibo> userWeiboList = userWeiboMapper.selectByExample(userWeiboExample);
        if (!CollectionUtils.isEmpty(userWeiboList)) {
            return UserWeiboVo.modelToView(userWeiboList.get(0));
        } else {
            return new UserWeiboVo();
        }
    }

    @Override
    public int clear(Long uid) {
        UserWeiboExample userWeiboExample = new UserWeiboExample();
        userWeiboExample.createCriteria().andUidEqualTo(uid).andStatusEqualTo(ItemStatus.ENABLED);
        int count = userWeiboMapper.deleteByExample(userWeiboExample);
        return count;
    }


    @Override
    public int like(Long id) {
        UserWeibo userWeibo = userWeiboMapper.selectByPrimaryKey(id);
        UserWeiboExample userWeiboExample = new UserWeiboExample();
        userWeiboExample.createCriteria().andIdEqualTo(id).andStatusEqualTo(ItemStatus.ENABLED);
        userWeibo.setLikeCount(userWeibo.getLikeCount() + 1);
        int count = userWeiboMapper.updateByExample(userWeibo, userWeiboExample);
        return count;
    }

    @Override
    public int share(Long id) {
        UserWeibo userWeibo = userWeiboMapper.selectByPrimaryKey(id);
        UserWeiboExample userWeiboExample = new UserWeiboExample();
        userWeiboExample.createCriteria().andIdEqualTo(id).andStatusEqualTo(ItemStatus.ENABLED);
        userWeibo.setForwardCount(userWeibo.getForwardCount() + 1);
        int count = userWeiboMapper.updateByExample(userWeibo, userWeiboExample);
        return count;
    }

    /**
     * comment
     */
    @Override
    public int comment(Long id) {
        UserWeibo userWeibo = userWeiboMapper.selectByPrimaryKey(id);
        UserWeiboExample userWeiboExample = new UserWeiboExample();
        userWeiboExample.createCriteria().andIdEqualTo(id).andStatusEqualTo(ItemStatus.ENABLED);
        userWeibo.setCommentCount(userWeibo.getCommentCount() + 1);
        int count = userWeiboMapper.updateByExample(userWeibo, userWeiboExample);
        return count;
    }
}
