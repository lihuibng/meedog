package com.macro.meedog.activity.controller;

import com.macro.meedog.activity.domain.vo.ActivityVo;
import com.macro.meedog.activity.service.ActivityService;
import com.macro.meedog.common.api.CommonPage;
import com.macro.meedog.common.api.CommonResult;
import com.macro.meedog.model.Activity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ActivityController
 */
@Api(tags = "ActivityController", description = "活动管理示例接口")
@Controller
@RequestMapping("/dating")
public class ActivityController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ActivityController.class);
    @Autowired
    private ActivityService activityService;

    @ApiOperation(value = "获取全部活动")
    @RequestMapping(value = "/activity/listall", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<Activity>> getActivityList() {
        return CommonResult.success(activityService.listAllActivity());
    }

    @ApiOperation(value = "添加活动")
    @RequestMapping(value = "/activity/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult createActivity(@Validated @RequestBody ActivityVo activityVo) {
        CommonResult commonResult;
        int count = activityService.createActivity(activityVo);
        if (count == 1) {
            commonResult = CommonResult.success(activityVo);
            LOGGER.debug("createActivity success:{}", activityVo);
        } else {
            commonResult = CommonResult.failed("操作失败");
            LOGGER.debug("createActivity failed:{}", activityVo);
        }
        return commonResult;
    }

    @ApiOperation(value = "更新活动")
    @RequestMapping(value = "/activity/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateActivity(@PathVariable("id") Long id, @Validated @RequestBody ActivityVo activityVo) {
        CommonResult commonResult;
        LOGGER.debug("updateActivity received : {} vo: {}", id, activityVo);
        int count = activityService.updateActivity(id, activityVo);
        if (count == 1) {
            commonResult = CommonResult.success(activityVo);
            LOGGER.debug("updateActivity success:{}", activityVo);
        } else {
            commonResult = CommonResult.failed("操作失败");
            LOGGER.debug("updateActivity failed:{}", activityVo);
        }
        return commonResult;
    }

    @ApiOperation(value = "删除活动")
    @RequestMapping(value = "/activity/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult deleteActivity(@PathVariable("id") Long id) {
        LOGGER.debug("updateActivity received : {}", id);
        int count = activityService.deleteActivity(id);
        if (count == 1) {
            LOGGER.debug("deleteActivity success :id={}", id);
            return CommonResult.success(null);
        } else {
            LOGGER.debug("deleteActivity failed :id={}", id);
            return CommonResult.failed("操作失败");
        }
    }

    @ApiOperation(value = "分页获取活动列表")
    @RequestMapping(value = "/activity/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<Activity>> listActivity(@RequestParam(value = "pageNum", defaultValue = "0") Integer pageNum,
                                                           @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        List<Activity> activityList = activityService.listActivity(pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(activityList));
    }

    @ApiOperation(value = "根据编号查询活动信息")
    @RequestMapping(value = "/activity/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<Activity> activity(@PathVariable("id") Long id) {
        return CommonResult.success(activityService.getActivity(id));
    }
}
