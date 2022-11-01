package com.macro.meedog.server.controller;

import com.macro.meedog.common.api.CommonResult;
import com.macro.meedog.server.domain.vo.*;
import com.macro.meedog.server.service.InitService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;

/**
 * @author "xxxxxx"
 * @modified 2021/3/22 8:50 下午
 */

@Api(tags = "global init")
@RestController
@RequestMapping("/user/init")
public class InitController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private InitService initService;


    @ApiOperation(value = "获取省信息")
    @PostMapping("province")
    public CommonResult getProvince(HttpServletRequest request) {
        ProvinceVo provinceVo = initService.getProvince();
        return CommonResult.success(provinceVo);
    }

    @ApiOperation(value = "获取生肖信息")
    @PostMapping("zodiac")
    public CommonResult getZodiac(HttpServletRequest request) {
        ZodiacVo zodiacVo = initService.getZodiac();
        return CommonResult.success(zodiacVo);
    }

    @ApiOperation(value = "获取星座信息")
    @PostMapping("constellation")
    public CommonResult getConstellation(HttpServletRequest request) {
        ConstellationVo constellationVo = initService.getConstellation();
        return CommonResult.success(constellationVo);
    }

    @ApiOperation(value = "获取房产信息")
    @PostMapping("district")
    public CommonResult getHouseDistrictList(@RequestParam String uid) {
        HouseDistrictVo houseDistrictVo = initService.getHouseDistrict(Long.parseLong(uid));
        return CommonResult.success(houseDistrictVo);
    }

    @ApiOperation(value = "获取性别信息")
    @PostMapping("gender")
    public CommonResult getGender(HttpServletRequest request) {
        GenderVo genderVo = initService.getGender();
        return CommonResult.success(genderVo);
    }

    @ApiOperation(value = "获取性取向信息")
    @PostMapping("sexual_type")
    public CommonResult getSexualType(HttpServletRequest request) {
        SexualTypeVo sexualTypeVo = initService.getSexualType();
        return CommonResult.success(sexualTypeVo);
    }

    @ApiOperation(value = "获取婚姻信息")
    @PostMapping("marriage")
    public CommonResult getMarriageList(HttpServletRequest request) {
        MarriageStatusVo marriageStatusVo = initService.getMarriageStatus();
        return CommonResult.success(marriageStatusVo);
    }

    @ApiOperation(value = "获取户籍信息")
    @PostMapping("households")
    public CommonResult getHouseholdsList(HttpServletRequest request) {
        HouseholdsVo householdsVo = initService.getHouseholds();
        return CommonResult.success(householdsVo);
    }

    @ApiOperation(value = "获取学校等级信息")
    @PostMapping("college_status")
    public CommonResult getCollegeStatusList(HttpServletRequest request) {
        CollegeStatusVo collegeStatusVo = initService.getCollegeStatus();
        return CommonResult.success(collegeStatusVo);
    }

    @ApiOperation(value = "获取基本信息")
    @PostMapping("info")
    public CommonResult getGlobalList(HttpServletRequest request) {
        InitVo initVo = initService.getInits();
        return CommonResult.success(initVo);
    }

    @ApiOperation(value = "获取学位信息")
    @PostMapping("degree")
    public CommonResult getDegreeList(HttpServletRequest request) {
        DegreeVo degreeVo = initService.getDegree();
        return CommonResult.success(degreeVo);
    }

    @ApiOperation(value = "获取州省信息")
    @PostMapping("region")
    public CommonResult getRegionList(HttpServletRequest request) {
        RegionVo regionVo = initService.getRegion();
        return CommonResult.success(regionVo);
    }

    @ApiOperation(value = "获取城市信息")
    @PostMapping("city")
    public CommonResult getCityList(@RequestParam String uid) {
        Long id = Long.parseLong(uid);
        CityVo cityVo = initService.getCity(id);
        return CommonResult.success(cityVo);
    }

    @ApiOperation(value = "获取城市信息")
    @PostMapping("all_city")
    public CommonResult getCityList(HttpServletRequest request) {
        CityVo cityVo = initService.getAllCity();
        return CommonResult.success(cityVo);
    }

}
