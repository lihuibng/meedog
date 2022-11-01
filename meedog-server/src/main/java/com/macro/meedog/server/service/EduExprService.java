package com.macro.meedog.server.service;

import com.macro.meedog.model.UserEduExperience;
import com.macro.meedog.server.domain.vo.UserEduExperienceVo;

import java.util.List;

/**
 * @author "xxxxxx"
 */

public interface EduExprService {

    List<UserEduExperienceVo> getEduExprVos(Long uid);

    /**
     * getEduExprs
     *
     * @param uid
     * @return List<UserEduExperience>
     */
    List<UserEduExperience> getEduExprs(Long uid);

    /**
     * insertEduExpr
     *
     * @param v
     * @return UserEduExperience
     */
    int insertEduExpr(UserEduExperienceVo v);

    /**
     * updateEduExpr
     *
     * @param v
     * @return UserEduExperience
     */
    int updateEduExpr(UserEduExperienceVo v);


    /**
     * getEduExprById
     *
     * @param eeid
     * @return UserEduExperience
     */
    UserEduExperience getEduExprById(Long eeid);

    /**
     * getEduExprId
     *
     * @param
     * @return UserEduExperience
     */
    UserEduExperience getEduExprId(Long uid);

    /**
     * delete
     *
     * @param id dbid
     * @return int
     */
    int deleteEduExpr(Long id);

    /**
     * clear
     *
     * @param
     * @return int
     */
    int clear(Long id);


    /**
     * picInsertBasicInfo
     *
     * @param id
     * @param picIds
     * @return int
     */
    int picInsertEduExperience(Long id, List<Long> picIds);
}
