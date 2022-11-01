package com.macro.meedog.server.controller;

import com.macro.meedog.common.api.CommonResult;
import com.macro.meedog.model.UserAssetSalary;
import com.macro.meedog.server.domain.vo.AssetSalaryVo;
import com.macro.meedog.server.service.AssetSalaryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author "xxxxxx"
 * @modified 2021/3/29 11:30 下午
 */

@Api(tags = "资产收入")
@RestController
@RequestMapping("/user/asset")
public class AssetSalaryController {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @Autowired
    private AssetSalaryService assetSalaryService;

    @ApiOperation(value = "获取基本信息")
    @PostMapping("list")
    public CommonResult getAssetSalaryList(@RequestParam String uid, HttpServletRequest request) {
        Long id = Long.parseLong(uid);
        List<UserAssetSalary> userAssetSalaryList = assetSalaryService.getAssetSalarys(id);
        List<AssetSalaryVo> uAssetSalaryVoLiset = AssetSalaryVo.modelToView(userAssetSalaryList);
        return CommonResult.success(uAssetSalaryVoLiset);
    }

    @ApiOperation(value = "插入基本信息")
    @PostMapping("insert")
    public CommonResult insertAssetSalary(@RequestBody AssetSalaryVo uAssetSalary,
                                        HttpServletRequest request) {
        int res = assetSalaryService.insertAssetSalary(AssetSalaryVo.viewToModel(uAssetSalary));
        return CommonResult.success(res);
    }

    @ApiOperation(value = "更新基本信息")
    @PostMapping("update")
    public CommonResult updateAssetSalary(@RequestBody AssetSalaryVo uAssetSalary,
                                        HttpServletRequest request) {
        int res = assetSalaryService.updateAssetSalary(AssetSalaryVo.viewToModel(uAssetSalary));
        return CommonResult.success(res);
    }

    @ApiOperation(value = "获取基本信息")
    @PostMapping("detail")
    public CommonResult getAssetSalary(@RequestParam String id, HttpServletRequest request) {
        Long tmpId = Long.parseLong(id);
        UserAssetSalary uAssetSalary = assetSalaryService.getAssetSalaryById(tmpId);
        return CommonResult.success(AssetSalaryVo.modelToView(uAssetSalary));
    }

    @ApiOperation("清空基本信息")
    @RequestMapping(value = "/clear", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult clear(@RequestParam String uid) {
        Long id = Long.parseLong(uid);
        int res = assetSalaryService.clear(id);
        return CommonResult.success(res);
    }

    @ApiOperation("删除基本信息")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult deleteAssetSalary(@RequestParam String pid) {
        Long id = Long.parseLong(pid);
        int count = assetSalaryService.deleteAssetSalary(id);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

}

