package com.macro.meedog.server.domain.vo;

/**
 * @author "xxxxxx"
 * @modified 2021/3/22 8:45 下午
 */

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class InitVo {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "生肖")
    private List<DataItem> zodiacItems;

    @ApiModelProperty(value = "星座")
    private List<DataItem> constellationItems;

    @ApiModelProperty(value = "省份")
    private List<DataItem> provinceItems;

    /*static public UserBasicInfo viewToModel(UserBasicInfoVo v) {
        UserBasicInfo u = new UserBasicInfo();
        BeanUtils.copyProperties(v, u);
        if (v.getId() != null) {
            u.setId(Long.parseLong(v.getId()));
        }
        if (v.getUid() != null) {
            u.setUid(Long.parseLong(v.getUid()));
        }
        return u;
    }

    static public UserBasicInfoVo modelToView(UserBasicInfo u) {
        UserBasicInfoVo v = new UserBasicInfoVo();
        BeanUtils.copyProperties(u, v);
        if (u.getId() != null) {
            v.setId(String.valueOf(u.getId()));
        }
        if (u.getUid() != null) {
            v.setUid(String.valueOf(u.getUid()));
        }
        return v;
    }

    static public List<UserBasicInfo> viewToModel(List<UserBasicInfoVo> vList) {
        List<UserBasicInfo> uList = new ArrayList<UserBasicInfo>();
        for (UserBasicInfoVo v : vList) {
            uList.add(UserBasicInfoVo.viewToModel(v));
        }
        return uList;
    }

    static public List<UserBasicInfoVo> modelToView(List<UserBasicInfo> uList) {
        List<UserBasicInfoVo> vList = new ArrayList<UserBasicInfoVo>();
        for (UserBasicInfo u : uList) {
            vList.add(UserBasicInfoVo.modelToView(u));
        }
        return vList;
    }*/
}
