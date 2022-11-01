package com.macro.meedog.server.service;

import com.macro.meedog.model.UserAssetSalary;

import java.util.List;

/**
 * @author "xxxxxx"
 * @modified 2021/3/29 11:17 下午
 */

public interface AssetSalaryService {

    /**
     * getAssetSalarys
     *
     * @param uid
     * @return List<UserAssetSalary>
     */
    List<UserAssetSalary> getAssetSalarys(Long uid);

    /**
     * insertAssetSalary
     *
     * @param uAssetSalary
     * @return int
     */
    int insertAssetSalary(UserAssetSalary uAssetSalary);

    /**
     * updateAssetSalary
     *
     * @param uAssetSalary
     * @return int
     */
    int updateAssetSalary(UserAssetSalary uAssetSalary);


    /**
     * getAssetSalaryById
     *
     * @param id
     * @return UserAssetSalary
     */
    UserAssetSalary getAssetSalaryById(Long id);

    /**
     * delete
     *
     * @param id
     * @return int
     */
    int deleteAssetSalary(Long id);

    /**
     * clear
     *
     * @param uid
     * @return int
     */
    int clear(Long uid);

}
