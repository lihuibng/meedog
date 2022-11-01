package com.macro.meedog.search.controller;

import com.macro.meedog.common.api.CommonPage;
import com.macro.meedog.common.api.CommonResult;
import com.macro.meedog.search.domain.EsEducation;
import com.macro.meedog.search.service.EsEducationService;
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
@Api(tags = "EsEduController", description = "搜索商品管理")
@RequestMapping("/search/esEdu")
public class EsEduController {
    @Autowired
    private EsEducationService esEducationService;

    @ApiOperation(value = "简单搜索")
    @RequestMapping(value = "/search/simple", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<EsEducation>> search(@RequestParam(required = false) String school,
                                                        @RequestParam(required = false, defaultValue = "7") Integer degree,
                                                        @RequestParam(required = false, defaultValue = "0") Integer pageNum,
                                                        @RequestParam(required = false, defaultValue = "5") Integer pageSize) {
        Page<EsEducation> esEducationPage = esEducationService.search(school, degree, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(esEducationPage));
    }

    @ApiOperation(value = "综合搜索、筛选、排序")
    @ApiImplicitParam(name = "sort", value = "排序字段:0->按相关度；1->按新品；2->按销量；3->价格从低到高；4->价格从高到低",
            defaultValue = "0", allowableValues = "0,1,2,3,4", paramType = "query", dataType = "integer")
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<EsEducation>> search(@RequestParam(required = false) String school,
                                                        @RequestParam(required = false) Long uid,
                                                        @RequestParam(required = false, defaultValue = "0") Integer pageNum,
                                                        @RequestParam(required = false, defaultValue = "5") Integer pageSize,
                                                        @RequestParam(required = false, defaultValue = "0") Integer sort) {
        Page<EsEducation> esEducationPage = esEducationService.search(school, uid, pageNum, pageSize, sort);
        return CommonResult.success(CommonPage.restPage(esEducationPage));
    }

    @ApiOperation(value = "根据人id推荐人")
    @RequestMapping(value = "/recommend/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<EsEducation>> recommend(@PathVariable Long id,
                                                           @RequestParam(required = false, defaultValue = "0") Integer pageNum,
                                                           @RequestParam(required = false, defaultValue = "5") Integer pageSize) {
        Page<EsEducation> esEducationPage = esEducationService.recommend(id, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(esEducationPage));
    }

}
