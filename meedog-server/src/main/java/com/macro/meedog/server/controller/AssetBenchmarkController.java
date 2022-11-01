package com.macro.meedog.server.controller;


import com.macro.meedog.common.api.CommonResult;
import com.macro.meedog.model.AssetBenchmark;
import com.macro.meedog.server.domain.vo.AssetBenchmarkVo;
import com.macro.meedog.server.service.AssetBenchmarkService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author "xxxxxx"
 * @modified 2021/3/2 10:22 下午
 */

@Api(tags = "学习经历相关")
@RestController
@RequestMapping("/user/benchmark/")
public class AssetBenchmarkController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @Autowired
    private AssetBenchmarkService assetBenchmarkService;

    @ApiOperation(value = "获取基本信息")
    @PostMapping("list")
    public CommonResult getAssetBenchmarks(HttpServletRequest request) {
        List<AssetBenchmark> assetBenchmarkList = assetBenchmarkService.getAssetBenchmarks();
        return CommonResult.success(assetBenchmarkList);
    }

    @ApiOperation(value = "获取基本信息")
    @PostMapping("detail")
    public CommonResult getAssetBenchmark(@RequestParam String id, HttpServletRequest request) {
        Long tmpId = Long.parseLong(id);
        List<AssetBenchmarkVo> assetCityBenchmark = assetBenchmarkService.getAssetBenchmarkById(tmpId);
        return CommonResult.success(assetCityBenchmark);
    }

}



