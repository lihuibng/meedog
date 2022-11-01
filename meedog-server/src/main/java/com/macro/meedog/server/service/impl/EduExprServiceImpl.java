package com.macro.meedog.server.service.impl;


import com.macro.meedog.mapper.EduExperiencePictureMapper;
import com.macro.meedog.mapper.UserEduExperienceMapper;
import com.macro.meedog.model.*;
import com.macro.meedog.server.domain.ItemStatus;
import com.macro.meedog.server.domain.vo.UserBasicInfoVo;
import com.macro.meedog.server.domain.vo.UserEduExperienceVo;
import com.macro.meedog.server.service.EduExprService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 会员管理Service实现类
 * Created by macro on 2018/8/3.
 */
@Service
public class EduExprServiceImpl implements EduExprService {
    @Autowired
    private UserEduExperienceMapper userEduExperienceMapper;

    @Autowired
    private EduExperiencePictureMapper eduExperiencePictureMapper;

    @Override
    public List<UserEduExperience> getEduExprs(Long uid) {
        UserEduExperienceExample example = new UserEduExperienceExample();
        example.createCriteria().andUidEqualTo(uid).andStatusEqualTo(ItemStatus.ENABLED);
        return userEduExperienceMapper.selectByExample(example);
    }

    @Override
    public List<UserEduExperienceVo> getEduExprVos(Long uid) {
        List<UserEduExperienceVo> eduExperienceVoList = new ArrayList<>();
        UserEduExperienceExample example = new UserEduExperienceExample();
        example.createCriteria().andUidEqualTo(uid).andStatusEqualTo(ItemStatus.ENABLED);
        List<UserEduExperience> eduExperiences = userEduExperienceMapper.selectByExample(example);
        for (UserEduExperience e : eduExperiences) {
            UserEduExperienceVo evo = UserEduExperienceVo.modelToView(e);
            EduExperiencePictureExample eduExperiencePictureExample = new EduExperiencePictureExample();
            eduExperiencePictureExample.createCriteria().andEduExperienceIdEqualTo(e.getId())
                    .andStatusEqualTo(ItemStatus.ENABLED);
            List<EduExperiencePicture> eduExperiencePictureList = eduExperiencePictureMapper.selectByExample(eduExperiencePictureExample);
            List<Long> pids = eduExperiencePictureList.stream().map(EduExperiencePicture::getPicId).collect(Collectors.toList());
            List<String> picIds = pids.stream().map(String::valueOf).collect(Collectors.toList());
            evo.setPicIds(picIds);
            eduExperienceVoList.add(evo);
        }
        return eduExperienceVoList;
    }

    @Override
    public int insertEduExpr(UserEduExperienceVo v) {
        int count = 0;
        UserEduExperience u = UserEduExperienceVo.viewToModel(v);
        UserEduExperienceExample example = new UserEduExperienceExample();
        example.createCriteria().andUidEqualTo(u.getUid())
                .andDegreeEqualTo(u.getDegree())
                .andSchoolEqualTo(u.getSchool())
                .andStatusEqualTo(ItemStatus.ENABLED);
        List<UserEduExperience> userEduExperienceList = userEduExperienceMapper.selectByExample(example);
        if (v.getPicIds() != null && !v.getPicIds().isEmpty()){
            u.setPicId(Long.parseLong(v.getPicIds().get(0)));
        }
        u.setStatus(ItemStatus.ENABLED);
        u.setModifiedTime(new Date());
        if (!userEduExperienceList.isEmpty()) {
            count = userEduExperienceMapper.updateByExampleSelective(u, example);
            List<Long> picIds = v.getPicIds().stream().map(Long::parseLong).collect(Collectors.toList());
            picInsertEduExperience(userEduExperienceList.get(0).getId(), picIds);
        } else {
            u.setCreateTime(new Date());
            count = userEduExperienceMapper.insert(u);
            List<Long> picIds = v.getPicIds().stream().map(Long::parseLong).collect(Collectors.toList());
            picInsertEduExperience(u.getId(), picIds);
        }
        return count;
    }

    @Override
    public int updateEduExpr(UserEduExperienceVo v) {
        int count = 0;
        UserEduExperience u = UserEduExperienceVo.viewToModel(v);
        UserEduExperienceExample example = new UserEduExperienceExample();
        example.createCriteria().andUidEqualTo(u.getUid())
                .andDegreeEqualTo(u.getDegree())
                .andSchoolEqualTo(u.getSchool())
                .andStatusEqualTo(ItemStatus.ENABLED);
        List<UserEduExperience> userEduExperienceList = userEduExperienceMapper.selectByExample(example);
        u.setStatus(ItemStatus.ENABLED);
        u.setModifiedTime(new Date());
        if (!userEduExperienceList.isEmpty()) {
            count = userEduExperienceMapper.updateByExampleSelective(u, example);
            List<Long> picIds = v.getPicIds().stream().map(Long::parseLong).collect(Collectors.toList());
            picInsertEduExperience(userEduExperienceList.get(0).getId(), picIds);
        } else {
            u.setCreateTime(new Date());
            count = userEduExperienceMapper.insert(u);
            List<Long> picIds = v.getPicIds().stream().map(Long::parseLong).collect(Collectors.toList());
            picInsertEduExperience(u.getId(), picIds);
        }
        return count;
    }

    @Override
    public UserEduExperience getEduExprById(Long eduExprId) {
        UserEduExperienceExample example = new UserEduExperienceExample();
        example.createCriteria().andUidEqualTo(eduExprId)
                .andStatusEqualTo(ItemStatus.ENABLED);
        List<UserEduExperience> uEduExprs = userEduExperienceMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(uEduExprs)) {
            return uEduExprs.get(0);
        }
        return null;
    }

    @Override
    public UserEduExperience getEduExprId(Long uid) {
        UserEduExperienceExample example = new UserEduExperienceExample();
        example.createCriteria().andUidEqualTo(uid)
                .andStatusEqualTo(ItemStatus.ENABLED);
        List<UserEduExperience> uEduExprs = userEduExperienceMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(uEduExprs)) {
            return uEduExprs.get(0);
        } else {
            UserEduExperience u = new UserEduExperience();
            u.setUid(uid);
            u.setStatus(ItemStatus.ENABLED);
            u.setCreateTime(new Date());
            u.setModifiedTime(new Date());
            userEduExperienceMapper.insert(u);
            return u;
        }
    }

    @Override
    public int deleteEduExpr(Long id) {
        int count = 0;
        UserEduExperienceExample example = new UserEduExperienceExample();
        example.createCriteria().andIdEqualTo(id).andStatusEqualTo(ItemStatus.ENABLED);
        List<UserEduExperience> uEduExprs = userEduExperienceMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(uEduExprs)) {
            for (UserEduExperience e : uEduExprs) {
                e.setStatus(ItemStatus.DELETED);
                count += userEduExperienceMapper.updateByExample(e, example);
            }
        }
        return count;
    }

    @Override
    public int clear(Long uid) {
        int count = 0;
        UserEduExperienceExample example = new UserEduExperienceExample();
        example.createCriteria().andUidEqualTo(uid).andStatusEqualTo(ItemStatus.ENABLED);
        List<UserEduExperience> uEduExprs = userEduExperienceMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(uEduExprs)) {
            for (UserEduExperience e : uEduExprs) {
                e.setStatus(ItemStatus.DELETED);
                count += userEduExperienceMapper.updateByExample(e, example);
            }
        }
        return count;
    }


    @Override
    public int picInsertEduExperience(Long id, List<Long> picIds) {
        int count = 0;
        for (Long picId : picIds) {
            EduExperiencePictureExample example = new EduExperiencePictureExample();
            example.createCriteria().andIdEqualTo(id).andPicIdEqualTo(picId)
                    .andStatusEqualTo(ItemStatus.ENABLED);
            List<EduExperiencePicture> basicInfoPictureList = eduExperiencePictureMapper.selectByExample(example);
            if (CollectionUtils.isEmpty(basicInfoPictureList)) {
                EduExperiencePicture eduExperiencePicture = new EduExperiencePicture();
                eduExperiencePicture.setEduExperienceId(id);
                eduExperiencePicture.setPicId(picId);
                eduExperiencePicture.setStatus(ItemStatus.ENABLED);
                eduExperiencePicture.setCreateTime(new Date());
                eduExperiencePicture.setModifiedTime(new Date());
                count += eduExperiencePictureMapper.insert(eduExperiencePicture);
            }
        }
        return count;
    }
}
