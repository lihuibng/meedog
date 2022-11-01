package com.macro.meedog.activity.service.impl;

import com.macro.meedog.activity.domain.vo.ActivityVo;
import com.macro.meedog.activity.service.ActivityService;
import com.macro.meedog.mapper.ActivityMapper;
import com.macro.meedog.model.Activity;
import com.macro.meedog.model.ActivityExample;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * DemoService实现类
 */
@Service
public class ActivityServiceImpl implements ActivityService {
    @Autowired
    private ActivityMapper activityMapper;

    @Override
    public List<Activity> listAllActivity() {
        return activityMapper.selectByExample(new ActivityExample());
    }

    @Override
    public int createActivity(ActivityVo activityVo) {
        Activity activity = new Activity();
        BeanUtils.copyProperties(activityVo, activity);
        return activityMapper.insertSelective(activity);
    }

    @Override
    public int updateActivity(Long id, ActivityVo activityVo) {
        Activity activity = new Activity();
        BeanUtils.copyProperties(activityVo, activity);
        activity.setId(id);
        return activityMapper.updateByPrimaryKeySelective(activity);
    }

    @Override
    public int deleteActivity(Long id) {
        return activityMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Activity> listActivity(int pageNum, int pageSize) {
        return activityMapper.selectByExample(new ActivityExample());
    }

    @Override
    public Activity getActivity(Long id) {
        return activityMapper.selectByPrimaryKey(id);
    }

    @Override
    public void addActivity(ActivityVo vo) {
        Activity activity = new Activity();
        activityMapper.insert(activity);
    }
}
