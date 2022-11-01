package com.macro.meedog.activity.service;

import com.macro.meedog.activity.domain.vo.ActivityVo;
import com.macro.meedog.model.Activity;

import java.util.List;

/**
 * DemoService接口
 */
public interface ActivityService {
    List<Activity> listAllActivity();

    int createActivity(ActivityVo activityDto);

    int updateActivity(Long id, ActivityVo activityDto);

    int deleteActivity(Long id);

    List<Activity> listActivity(int pageNum, int pageSize);

    Activity getActivity(Long id);

    void addActivity(ActivityVo vo);
}
