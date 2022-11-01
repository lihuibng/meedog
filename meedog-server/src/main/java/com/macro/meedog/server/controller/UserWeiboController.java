package com.macro.meedog.server.controller;

import com.macro.meedog.common.api.CommonResult;
import com.macro.meedog.model.UserWeiboComment;
import com.macro.meedog.server.domain.WechatInfo;
import com.macro.meedog.server.domain.vo.UserWeiboVo;
import com.macro.meedog.server.domain.vo.WeiboCommentVo;
import com.macro.meedog.server.service.WeiboCommentService;
import com.macro.meedog.server.service.WeiboService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * UserWeibo Controller
 * Created by macro on 2019/1/28.
 */
@Controller
@Api(tags = "UserWeiboController", description = "UserWeibo")
@RequestMapping("/user/msg")
public class UserWeiboController {
    @Autowired
    private WeiboService weiboService;

    @Autowired
    private WeiboCommentService weiboCommentService;

    @ApiOperation("列表")
    @RequestMapping(value = "/weibo", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<UserWeiboVo>> ListWeibo(@RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
                                                     @RequestParam(value = "pageNum", defaultValue = "0") Integer pageNum) {
        List<UserWeiboVo> userWeiboVoList = weiboService.list(pageNum, pageSize);
        return CommonResult.success(userWeiboVoList);
    }

    @ApiOperation("add")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Integer> add(@RequestBody UserWeiboVo userWeiboVo) {
        int count = weiboService.add(userWeiboVo);
        return CommonResult.success(count);
    }

    @ApiOperation("like")
    @RequestMapping(value = "/like", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<Integer> like(@RequestParam Long id) {
        Integer count = weiboService.like(id);
        return CommonResult.success(count);
    }

    @ApiOperation("share")
    @RequestMapping(value = "/share", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<Integer> share(@RequestParam Long id) {
        Integer count = weiboService.share(id);
        return CommonResult.success(count);
    }

    @ApiOperation("comment")
    @RequestMapping(value = "/comment", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<UserWeiboComment>> comment(@RequestParam Long id,
                                                  @RequestParam(value = "cid", defaultValue = "0") Integer commendId,
                                                  @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
                                                  @RequestParam(value = "pageNum", defaultValue = "0") Integer pageNum) {
        List<UserWeiboComment> commentList = weiboCommentService.list(id, Long.valueOf(commendId), pageNum, pageSize);
        return CommonResult.success(commentList);
    }

    @ApiOperation("add_comment")
    @RequestMapping(value = "/add_comment", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Integer> addComment(@RequestBody WeiboCommentVo weiboCommentVo) {
        Integer count = weiboCommentService.add(weiboCommentVo);
        return CommonResult.success(count);
    }
}


