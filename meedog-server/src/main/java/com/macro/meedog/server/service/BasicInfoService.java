package com.macro.meedog.server.service;

import com.macro.meedog.model.UserBasicInfo;
import com.macro.meedog.server.domain.vo.UserBasicInfoVo;

import java.util.List;

/**
 * @author "xxxxxx"
 */

public interface BasicInfoService {

    /**
     * getBasicInfos
     *
     * @param uid
     * @return List<UserBasicInfo>
     */
    List<UserBasicInfoVo> getBasicInfoVos(Long uid);

    /**
     * insertBasicInfo
     *
     * @param uBasicInfo
     * @return UserBasicInfo
     */
    int insertBasicInfo(UserBasicInfo uBasicInfo);

    /**
     * updateBasicInfo
     *
     * @param uBasicInfo
     * @return UserBasicInfo
     */
    int updateBasicInfo(UserBasicInfo uBasicInfo);


    /**
     * getBasicInfoById
     *
     * @param id
     * @return UserBasicInfo
     */
    UserBasicInfoVo getBasicInfoVoById(Long id);

    /**
     * delete
     *
     * @param id dbid
     * @return int
     */
    int deleteBasicInfo(Long id);

    /**
     * clear
     *
     * @param
     * @return int
     */
    int clear(Long uid);


    /**
     * clear
     *
     * @param id
     * @param picIds
     * @return int
     */
    int picInsertBasicInfo(Long id, List<Long> picIds);
}
