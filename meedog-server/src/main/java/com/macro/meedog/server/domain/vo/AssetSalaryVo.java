package com.macro.meedog.server.domain.vo;

import com.macro.meedog.model.UserAssetSalary;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author "xxxxxx"
 * @modified 2021/3/29 11:32 下午
 */
@Data
public class AssetSalaryVo {

    @ApiModelProperty(value = "用户 id")
    private String uid;

    @ApiModelProperty(value = "资产")
    private Integer asset;

    @ApiModelProperty(value = "房产描述")
    private String houseDesc;

    @ApiModelProperty(value = "收入 divied / 600w * 100分")
    private Integer salary;

    @ApiModelProperty(value = "储蓄")
    private Integer deposit;

    @ApiModelProperty(value = "其他")
    private Integer other;

    @ApiModelProperty(value = "评估分")
    private Integer score;

    @ApiModelProperty(value = "收入排行")
    private Integer toprank;

    static public UserAssetSalary viewToModel(AssetSalaryVo v) {
        UserAssetSalary u = new UserAssetSalary();
        BeanUtils.copyProperties(v, u);
        if (v.getUid() != null) {
            u.setUid(Long.parseLong(v.getUid()));
        }
        return u;
    }

    static public AssetSalaryVo modelToView(UserAssetSalary u) {
        AssetSalaryVo v = new AssetSalaryVo();
        BeanUtils.copyProperties(u, v);
        if (u.getUid() != null) {
            v.setUid(String.valueOf(u.getUid()));
        }
        return v;
    }

    static public List<UserAssetSalary> viewToModel(List<AssetSalaryVo> vList) {
        List<UserAssetSalary> uList = new ArrayList<UserAssetSalary>();
        for (AssetSalaryVo v : vList) {
            uList.add(AssetSalaryVo.viewToModel(v));
        }
        return uList;
    }

    static public List<AssetSalaryVo> modelToView(List<UserAssetSalary> uList) {
        List<AssetSalaryVo> vList = new ArrayList<AssetSalaryVo>();
        for (UserAssetSalary u : uList) {
            vList.add(AssetSalaryVo.modelToView(u));
        }
        return vList;
    }

}
