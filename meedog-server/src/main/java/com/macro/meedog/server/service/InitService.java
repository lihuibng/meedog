package com.macro.meedog.server.service;

import com.macro.meedog.model.CollegeStatus;
import com.macro.meedog.server.domain.vo.*;

/**
 * @author "xxxxxx"
 * @modified 2021/3/22 8:53 下午
 */

public interface InitService {

    /**
     * getProvince
     *
     * @return ProvinceVo
     */
    ProvinceVo getProvince();

    /**
     * getConstellation
     *
     * @return ConstellationVo
     */
    ConstellationVo getConstellation();

    /**
     * getZodiac
     *
     * @return ZodiacVo
     */
    ZodiacVo getZodiac();

    /**
     * getInits
     *
     * @return InitVo
     */
    InitVo getInits();

    /**
     * getDegree
     *
     * @return DegreeVo
     */
    DegreeVo getDegree();

    /**
     * getRegion
     *
     * @return RegionVo
     */
    RegionVo getRegion();

    /**
     * getCity
     *
     * @param uid
     * @return CityVo
     */
    CityVo getCity(Long uid);

    /**
     * getAllCity
     *
     * @return CityVo
     */
    CityVo getAllCity();


    /**
     * getGender
     *
     * @return GenderVo
     */
    GenderVo getGender();


    /**
     * getSexualType
     *
     * @return SexualTypeVo
     */
    SexualTypeVo getSexualType();


    /**
     * getMarriageStatus
     *
     * @param
     * @return MarriageStatusVo
     */
    MarriageStatusVo getMarriageStatus();

    /**
     * getHouseHolds
     *
     * @param
     * @return HouseholdsVo
     */
    HouseholdsVo getHouseholds();

    /**
     * getCollegeStatus
     *
     * @param
     * @return CollegeStatusVo
     */
    CollegeStatusVo getCollegeStatus();

    /**
     * getHouseDistrict
     *
     * @param
     * @return HouseholdsVo
     */
    HouseDistrictVo getHouseDistrict(Long uid);
}
