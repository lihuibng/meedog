package com.macro.meedog.search.controller;

import com.macro.meedog.common.api.CommonPage;
import com.macro.meedog.common.api.CommonResult;
import com.macro.meedog.search.domain.EsUser;
import com.macro.meedog.search.domain.SearchParam;
import com.macro.meedog.search.service.EsUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 搜索商品管理Controller
 *
 * @author macro
 * @date 2018/6/19
 */
@Controller
@Api(tags = "EsUserController")
@RequestMapping("/search/esUser")
public class EsUserController {
    @Autowired
    private EsUserService esUserService;

    /*@ApiOperation(value = "简单搜索")
    @RequestMapping(value = "/search/simple", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<EsUser>> search(@RequestParam(required = false) String keyword,
                                                   @RequestParam(required = false, defaultValue = "0") Integer pageNum,
                                                   @RequestParam(required = false, defaultValue = "5") Integer pageSize) {
        Page<EsUser> esUserPage = esUserService.search(keyword, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(esUserPage));
    }*/

    @ApiOperation(value = "综合搜索、筛选、排序")
    @ApiImplicitParam(name = "sort", value = "排序字段:0->按相关度；1->按新品；2->按销量；3->价格从低到高；4->价格从高到低",
            defaultValue = "0", allowableValues = "0,1,2,3,4", paramType = "query", dataType = "integer")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<CommonPage<EsUser>> search(@RequestBody(required = false) SearchParam searchParam,
                                                   @RequestParam(required = false, defaultValue = "0") Integer pageNum,
                                                   @RequestParam(required = false, defaultValue = "5") Integer pageSize,
                                                   @RequestParam(required = false, defaultValue = "0") Integer sort) {

        Page<EsUser> esUserPage = esUserService.search(searchParam, pageNum, pageSize, sort);
        return CommonResult.success(CommonPage.restPage(esUserPage));
    }

    /*@ApiOperation(value = "根据人id推荐人")
    @RequestMapping(value = "/recommend/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<CommonPage<EsUser>> recommend(@PathVariable Long id,
                                                      @RequestParam(required = false, defaultValue = "0") Integer pageNum,
                                                      @RequestParam(required = false, defaultValue = "5") Integer pageSize) {
        Page<EsUser> esUserPage = esUserService.recommend(id, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(esUserPage));
    }
    */
}
