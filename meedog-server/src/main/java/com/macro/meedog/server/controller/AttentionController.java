package com.macro.meedog.server.controller;

import com.macro.meedog.common.api.CommonPage;
import com.macro.meedog.common.api.CommonResult;
import com.macro.meedog.server.domain.Attention;
import com.macro.meedog.server.service.AttentionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 会员关注品牌管理Controller
 * Created by macro on 2018/8/2.
 */
@Controller
@Api(tags = "AttentionController", description = "会员关注品牌管理")
@RequestMapping("/user/attention")
public class AttentionController {
    @Autowired
    private AttentionService attentionService;

    @ApiOperation("添加品牌关注")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult add(@RequestBody Attention attention) {
        int count = attentionService.add(attention);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("取消关注")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult delete(Long id) {
        int count = attentionService.delete(id);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("显示关注列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<Attention>> list(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                    @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize) {
        Page<Attention> page = attentionService.list(pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(page));
    }

    @ApiOperation("显示关注品牌详情")
    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<Attention> detail(@RequestParam Long brandId) {
        Attention attention = attentionService.detail(brandId);
        return CommonResult.success(attention);
    }

    @ApiOperation("清空关注列表")
    @RequestMapping(value = "/clear", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult clear() {
        attentionService.clear();
        return CommonResult.success(null);
    }
}
