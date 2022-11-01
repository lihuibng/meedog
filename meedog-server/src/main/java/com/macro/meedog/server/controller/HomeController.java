package com.macro.meedog.server.controller;

import com.macro.meedog.common.api.CommonResult;
import com.macro.meedog.model.Activity;
import com.macro.meedog.model.User;
import com.macro.meedog.server.domain.HomeContentResult;
import com.macro.meedog.server.service.HomeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 首页内容管理Controller
 * Created by macro on 2019/1/28.
 */
@Controller
@Api(tags = "HomeController", description = "首页内容管理")
@RequestMapping("/user/home")
public class HomeController {
    @Autowired
    private HomeService homeService;

    @ApiOperation("首页内容页信息展示")
    @RequestMapping(value = "/content", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<HomeContentResult> content() {
        HomeContentResult contentResult = homeService.content();
        return CommonResult.success(contentResult);
    }

    @ApiOperation("分页获取推荐商品")
    @RequestMapping(value = "/recommend", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<User>> getRecommendUserList(@RequestParam(value = "pageSize", defaultValue = "4") Integer pageSize,
                                                         @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<User> userList = homeService.getRecommendUserList(pageSize, pageNum);
        return CommonResult.success(userList);
    }

    @ApiOperation("分页获取人气推荐活动")
    @RequestMapping(value = "/hotActivity", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<Activity>> hotActivityList(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                        @RequestParam(value = "pageSize", defaultValue = "6") Integer pageSize) {
        List<Activity> activityList = homeService.getHotActivityList(pageNum, pageSize);
        return CommonResult.success(activityList);
    }

    @ApiOperation("分页获取新人推荐")
    @RequestMapping(value = "/newUser", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<User>> newUserList(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                @RequestParam(value = "pageSize", defaultValue = "6") Integer pageSize) {
        List<User> userList = homeService.getNewUserList(pageNum, pageSize);
        return CommonResult.success(userList);
    }

    @ApiOperation("获得人总数")
    @RequestMapping(value = "/total", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult count() {
        long total = homeService.count();
        return CommonResult.success(total);
    }

    @ApiOperation("分页获取推广人推荐")
    @RequestMapping(value = "/ad", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<User>> avUserList(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                               @RequestParam(value = "pageSize", defaultValue = "6") Integer pageSize) {
        List<User> userList = homeService.getAdUserList(pageNum, pageSize);
        return CommonResult.success(userList);
    }

}


