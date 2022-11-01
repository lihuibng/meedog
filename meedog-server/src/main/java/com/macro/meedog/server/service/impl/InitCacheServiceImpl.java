package com.macro.meedog.server.service.impl;

import com.macro.meedog.common.service.RedisService;
import com.macro.meedog.mapper.UserMapper;
import com.macro.meedog.model.*;
import com.macro.meedog.security.annotation.CacheException;
import com.macro.meedog.server.service.InitCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author "xxxxxx"
 * @modified 2021/3/22 11:24 下午
 */
@Service
public class InitCacheServiceImpl implements InitCacheService {
    @Autowired
    private RedisService redisService;
    @Autowired
    private UserMapper userMapper;
    @Value("${redis.database}")
    private String REDIS_DATABASE;
    @Value("${redis.expire.common}")
    private Long REDIS_EXPIRE;
    @Value("${redis.key.province}")
    private String REDIS_KEY_PROVINCE;
    @Value("${redis.key.zodiac}")
    private String REDIS_KEY_ZODIAC;
    @Value("${redis.key.constellation}")
    private String REDIS_KEY_CONSTELLATION;
    @Value("${redis.key.degree}")
    private String REDIS_KEY_DEGREE;
    @Value("${redis.key.city}")
    private String REDIS_KEY_CITY;
    @Value("${redis.key.country}")
    private String REDIS_KEY_COUNTRY;
    @Value("${redis.key.area}")
    private String REDIS_KEY_AREA;
    @Value("${redis.key.user_city}")
    private String REDIS_KEY_USER_CITY;
    @Value("${redis.key.marriage}")
    private String REDIS_KEY_MARRIAGE;
    @Value("${redis.key.households}")
    private String REDIS_KEY_HOUSEHOLDS;
    @Value("${redis.key.college_status}")
    private String REDIS_KEY_COLLEGE_STATUS;
    @Value("${redis.key.house_district}")
    private String REDIS_KEY_HOUSE_DISTRICT;

    @CacheException
    @Override
    public List<Province> getProvince() {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_PROVINCE;
        return (List<Province>) redisService.get(key);
    }

    @CacheException
    @Override
    public void setProvince(List<Province> provinceList) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_PROVINCE;
        redisService.set(key, provinceList, REDIS_EXPIRE);
    }

    @CacheException
    @Override
    public void delProvince() {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_PROVINCE;
        redisService.del(key);
    }

    @CacheException
    @Override
    public List<Zodiac> getZodiac() {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_ZODIAC;
        return (List<Zodiac>) redisService.get(key);
    }

    @CacheException
    @Override
    public void setZodiac(List<Zodiac> zodiacsList) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_ZODIAC;
        redisService.set(key, zodiacsList, REDIS_EXPIRE);
    }

    @CacheException
    @Override
    public void delZodiac() {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_ZODIAC;
        redisService.del(key);
    }

    @CacheException
    @Override
    public List<Constellation> getConstellation() {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_CONSTELLATION;
        return (List<Constellation>) redisService.get(key);
    }

    @CacheException
    @Override
    public void setConstellation(List<Constellation> constellationList) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_CONSTELLATION;
        redisService.set(key, constellationList, REDIS_EXPIRE);
    }

    @CacheException
    @Override
    public void delConstellation() {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_CONSTELLATION;
        redisService.del(key);
    }

    @CacheException
    @Override
    public List<Degree> getDegree() {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_DEGREE;
        return (List<Degree>) redisService.get(key);
    }

    @CacheException
    @Override
    public void setDegree(List<Degree> degreeList) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_DEGREE;
        redisService.set(key, degreeList, REDIS_EXPIRE);
    }

    @CacheException
    @Override
    public void delDegree() {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_DEGREE;
        redisService.del(key);
    }

    @CacheException
    @Override
    public void setWorldCity(String k, List<WorldCity> cityList) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_CITY + ":" + k;
        redisService.set(key, cityList, REDIS_EXPIRE);
    }

    @CacheException
    @Override
    public List<WorldCity> getWorldCity(String k) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_CITY + ":" + k;
        return (List<WorldCity>) redisService.get(key);
    }

    @CacheException
    @Override
    public void delWorldCity(String k) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_CITY + ":" + k;
        redisService.del(key);
    }

    @CacheException
    @Override
    public List<WorldCountry> getWorldCountry() {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_COUNTRY;
        return (List<WorldCountry>) redisService.get(key);
    }

    @CacheException
    @Override
    public void setWorldCountry(List<WorldCountry> countryList) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_COUNTRY;
        redisService.set(key, countryList, REDIS_EXPIRE);
    }

    @CacheException
    @Override
    public void delWorldCountry() {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_COUNTRY;
        redisService.del(key);
    }

    @CacheException
    @Override
    public void setArea(String k, List<Area> areaList) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_AREA + ":" + k;
        redisService.set(key, areaList, REDIS_EXPIRE);
    }

    @CacheException
    @Override
    public List<Area> getArea(String k) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_AREA + ":" + k;
        return (List<Area>) redisService.get(key);
    }

    @CacheException
    @Override
    public void delArea(String k) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_AREA + ":" + k;
        redisService.del(key);
    }

    @CacheException
    @Override
    public void setUserCity(String k, List<UserCity> userCityList) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_USER_CITY + ":" + k;
        redisService.set(key, userCityList, REDIS_EXPIRE);
    }

    @CacheException
    @Override
    public List<UserCity> getUserCity(String k) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_USER_CITY + ":" + k;
        return (List<UserCity>) redisService.get(key);
    }

    @CacheException
    @Override
    public void delUserCity(String k) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_USER_CITY + ":" + k;
        redisService.del(key);
    }
    @CacheException
    @Override
    public void setMarriageStatus(List<MarriageStatus> marriageStatusList) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_MARRIAGE;
        redisService.set(key, marriageStatusList, REDIS_EXPIRE);
    }

    @CacheException
    @Override
    public List<MarriageStatus> getMarriageStatus() {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_MARRIAGE;
        return (List<MarriageStatus>) redisService.get(key);
    }

    @CacheException
    @Override
    public void delMarriageStatus() {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_MARRIAGE;
        redisService.del(key);
    }

    @CacheException
    @Override
    public void setHouseholds(List<UserCity> householdsList) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_HOUSEHOLDS;
        redisService.set(key, householdsList, REDIS_EXPIRE);
    }

    @CacheException
    @Override
    public List<UserCity> getHouseholds() {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_HOUSEHOLDS;
        return (List<UserCity>) redisService.get(key);
    }

    @CacheException
    @Override
    public void delHouseholds() {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_HOUSEHOLDS;
        redisService.del(key);
    }

    @CacheException
    @Override
    public void delCollegeStatus(){
        String key = REDIS_DATABASE + ":" + REDIS_KEY_COLLEGE_STATUS;
        redisService.del(key);
    }

    @CacheException
    @Override
    public List<CollegeStatus> getCollegeStatus(){
        String key = REDIS_DATABASE + ":" + REDIS_KEY_COLLEGE_STATUS;
        return (List<CollegeStatus>) redisService.get(key);
    }

    @CacheException
    @Override
    public void setCollegeStatus(List<CollegeStatus> collegeStatusList) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_COLLEGE_STATUS;
        redisService.set(key, collegeStatusList, REDIS_EXPIRE);
    }

    @CacheException
    @Override
    public void delHouseDistrict(String cid){
        String key = REDIS_DATABASE + ":" + REDIS_KEY_HOUSE_DISTRICT + ":" + cid;
        redisService.del(key);
    }

    @CacheException
    @Override
    public List<AssetBenchmark>  getHouseDistrict(String cid){
        String key = REDIS_DATABASE + ":" + REDIS_KEY_HOUSE_DISTRICT + ":" + cid;
        return (List<AssetBenchmark>) redisService.get(key);
    }

    @CacheException
    @Override
    public void setHouseDistrict(String cid, List<AssetBenchmark>  houseDistricts) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_HOUSE_DISTRICT + ":" + cid;
        redisService.set(key, houseDistricts, REDIS_EXPIRE);
    }
}
