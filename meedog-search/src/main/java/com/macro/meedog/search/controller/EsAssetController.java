package com.macro.meedog.search.controller;

import com.macro.meedog.common.api.CommonPage;
import com.macro.meedog.common.api.CommonResult;
import com.macro.meedog.search.domain.EsAssetSalary;
import com.macro.meedog.search.service.EsAssetSalaryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 搜索商品管理Controller
 *
 * @author macro
 * @date 2018/6/19
 */
@Controller
@Api(tags = "EsAssetController", description = "搜索商品管理")
@RequestMapping("/search/esAsset")
public class EsAssetController {
    @Autowired
    private EsAssetSalaryService esAssetSalaryService;


    @ApiOperation(value = "简单搜索")
    @RequestMapping(value = "/search/simple", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<EsAssetSalary>> search(@RequestParam(required = false, defaultValue = "10") Integer asset,
                                                          @RequestParam(required = false, defaultValue = "10") Integer salary,
                                                          @RequestParam(required = false, defaultValue = "10") Integer deposit,
                                                          @RequestParam(required = false, defaultValue = "10") Integer other,


                                                          @RequestParam(required = false, defaultValue = "0") Integer pageNum,
                                                          @RequestParam(required = false, defaultValue = "5") Integer pageSize) {
        Page<EsAssetSalary> esAssetSalaryPage = esAssetSalaryService.search(asset, salary, deposit, other, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(esAssetSalaryPage));
    }

    @ApiOperation(value = "综合搜索、筛选、排序")
    @ApiImplicitParam(name = "sort", value = "排序字段:0->按相关度；1->按新品；2->按销量；3->价格从低到高；4->价格从高到低",
            defaultValue = "0", allowableValues = "0,1,2,3,4", paramType = "query", dataType = "integer")
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<EsAssetSalary>> search(@RequestParam(required = false, defaultValue = "10") Integer asset,
                                                          @RequestParam(required = false, defaultValue = "10") Integer salary,
                                                          @RequestParam(required = false, defaultValue = "10") Integer deposit,
                                                          @RequestParam(required = false, defaultValue = "10") Integer other,
                                                          @RequestParam(required = false) Long uid,
                                                          @RequestParam(required = false, defaultValue = "0") Integer pageNum,
                                                          @RequestParam(required = false, defaultValue = "5") Integer pageSize,
                                                          @RequestParam(required = false, defaultValue = "0") Integer sort) {
        Page<EsAssetSalary> esAssetSalaryPage = esAssetSalaryService.search(asset, salary, deposit, other, uid, pageNum, pageSize, sort);
        return CommonResult.success(CommonPage.restPage(esAssetSalaryPage));
    }

    @ApiOperation(value = "根据人id推荐人")
    @RequestMapping(value = "/recommend/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<EsAssetSalary>> recommend(@PathVariable Long id,
                                                             @RequestParam(required = false, defaultValue = "0") Integer pageNum,
                                                             @RequestParam(required = false, defaultValue = "5") Integer pageSize) {
        Page<EsAssetSalary> esAssetSalaryPage = esAssetSalaryService.recommend(id, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(esAssetSalaryPage));
    }

}
