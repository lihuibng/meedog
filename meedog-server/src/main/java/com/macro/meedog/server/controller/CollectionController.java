package com.macro.meedog.server.controller;

import com.macro.meedog.common.api.CommonPage;
import com.macro.meedog.common.api.CommonResult;
import com.macro.meedog.server.domain.Collection;
import com.macro.meedog.server.service.CollectionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 会员收藏管理Controller
 * Created by macro on 2018/8/2.
 */
@Controller
@Api(tags = "CollectionController", description = "会员收藏管理")
@RequestMapping("/user/collection")
public class CollectionController {
    @Autowired
    private CollectionService userCollectionService;

    @ApiOperation("添加商品收藏")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult add(@RequestBody Collection collection) {
        int count = userCollectionService.add(collection);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("删除收藏商品")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult delete(Long productId) {
        int count = userCollectionService.delete(productId);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("显示收藏列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<Collection>> list(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                     @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize) {
        Page<Collection> page = userCollectionService.list(pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(page));
    }

    @ApiOperation("显示收藏商品详情")
    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<Collection> detail(@RequestParam Long productId) {
        Collection collection = userCollectionService.detail(productId);
        return CommonResult.success(collection);
    }

    @ApiOperation("清空收藏列表")
    @RequestMapping(value = "/clear", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult clear() {
        userCollectionService.clear();
        return CommonResult.success(null);
    }
}
