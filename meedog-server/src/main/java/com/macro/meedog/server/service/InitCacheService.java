package com.macro.meedog.server.service;

import com.macro.meedog.model.*;

import java.util.List;

/**
 * @author "xxxxxx"
 * @modified 2021/3/22 11:18 下午
 */

public interface InitCacheService {
    /**
     * 删除 Province 列表缓存
     */
    void delProvince();

    /**
     * 获取 Province 列表缓存
     */
    List<Province> getProvince();

    /**
     * 设置 Province 列表缓存
     */
    void setProvince(List<Province> provinceList);

    /**
     * 删除 Zodiac 列表缓存
     */
    void delZodiac();

    /**
     * 获取 Zodiac 列表缓存
     */
    List<Zodiac> getZodiac();

    /**
     * 设置 Zodiac 列表缓存
     */
    void setZodiac(List<Zodiac> zodiacList);

    /**
     * 删除 Constellation 列表缓存
     */
    void delConstellation();

    /**
     * 获取 Constellation 列表缓存
     */
    List<Constellation> getConstellation();

    /**
     * 设置 Constellation 列表缓存
     */
    void setConstellation(List<Constellation> constellationList);

    /**
     * 删除 Degree 列表缓存
     */
    void delDegree();

    /**
     * 获取 Degree 列表缓存
     */
    List<Degree> getDegree();

    /**
     * 设置 Degree 列表缓存
     */
    void setDegree(List<Degree> degreeList);

    /**
     * 删除 WorldCity 列表缓存
     */
    void delWorldCity(String key);

    /**
     * 获取 WorldCity 列表缓存
     */
    List<WorldCity> getWorldCity(String key);

    /**
     * 设置 WorldCity 列表缓存
     */
    void setWorldCity(String key, List<WorldCity> cityList);

    /**
     * 删除 WorldCountry 列表缓存
     */
    void delWorldCountry();

    /**
     * 获取 WorldCountry 列表缓存
     */
    List<WorldCountry> getWorldCountry();

    /**
     * 设置 WorldCountry 列表缓存
     */
    void setWorldCountry(List<WorldCountry> countryList);

    /**
     * 删除 UserCity 列表缓存
     */
    void delUserCity(String key);

    /**
     * 获取 UserCity 列表缓存
     */
    List<UserCity> getUserCity(String key);

    /**
     * 设置 UserCity 列表缓存
     */
    void setUserCity(String key, List<UserCity> cityList);

    /**
     * 删除 Area 列表缓存
     */
    void delArea(String key);

    /**
     * 获取 Area 列表缓存
     */
    List<Area> getArea(String key);

    /**
     * 设置 Area 列表缓存
     */
    void setArea(String key, List<Area> areaList);


    /**
     * 删除 MarriageStatus 列表缓存
     */
    void delMarriageStatus();

    /**
     * 获取 MarriageStatus 列表缓存
     */
    List<MarriageStatus> getMarriageStatus();

    /**
     * 设置 MarriageStatus 列表缓存
     */
    void setMarriageStatus(List<MarriageStatus> marriageStatusList);


    /**
     * 删除 MarriageStatus 列表缓存
     */
    void delHouseholds();

    /**
     * 获取 MarriageStatus 列表缓存
     */
    List<UserCity> getHouseholds();

    /**
     * 设置 MarriageStatus 列表缓存
     */
    void setHouseholds(List<UserCity> userCityList);

    /**
     * 删除 CollegeStatus 列表缓存
     */
    void delCollegeStatus();

    /**
     * 获取 CollegeStatus 列表缓存
     */
    List<CollegeStatus> getCollegeStatus();

    /**
     * 设置 CollegeStatus 列表缓存
     */
    void setCollegeStatus(List<CollegeStatus> collegeStatusList);

    /**
     * 删除 HouseDistrict 列表缓存
     */
    void delHouseDistrict(String key);

    /**
     * 获取 HouseDistrict 列表缓存
     */
    List<AssetBenchmark> getHouseDistrict(String key);

    /**
     * 设置 houseDistrictList 列表缓存
     */
    void setHouseDistrict(String key, List<AssetBenchmark> houseDistrictList);

}
