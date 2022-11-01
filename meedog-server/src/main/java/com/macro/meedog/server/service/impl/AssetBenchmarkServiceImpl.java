package com.macro.meedog.server.service.impl;

import com.macro.meedog.common.leaf.IDGenerator;
import com.macro.meedog.mapper.AssetBenchmarkMapper;
import com.macro.meedog.mapper.UserBasicInfoMapper;
import com.macro.meedog.model.AssetBenchmark;
import com.macro.meedog.model.AssetBenchmarkExample;
import com.macro.meedog.model.UserBasicInfo;
import com.macro.meedog.model.UserBasicInfoExample;
import com.macro.meedog.security.util.JwtTokenUtil;
import com.macro.meedog.server.domain.ItemStatus;
import com.macro.meedog.server.domain.vo.AssetBenchmarkVo;
import com.macro.meedog.server.service.AssetBenchmarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;


/**
 * @author "xxxxxx"
 * @modified 2021/3/2 10:35 下午
 */

@Service
public class AssetBenchmarkServiceImpl implements AssetBenchmarkService {
    @Autowired
    IDGenerator idGen;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private AssetBenchmarkMapper assetBenchmarkMapper;
    @Autowired
    private UserBasicInfoMapper basicInfoMapper;

    @Override
    public List<AssetBenchmark> getAssetBenchmarks() {
        AssetBenchmarkExample example = new AssetBenchmarkExample();
        example.createCriteria().andStatusEqualTo(ItemStatus.ENABLED);
        return assetBenchmarkMapper.selectByExample(example);
    }

    @Override
    public List<AssetBenchmarkVo> getAssetBenchmarkById(Long id) {
        UserBasicInfoExample basicInfoExample = new UserBasicInfoExample();
        basicInfoExample.createCriteria().andUidEqualTo(id).andStatusEqualTo(ItemStatus.ENABLED);
        List<UserBasicInfo> basicInfoList = basicInfoMapper.selectByExample(basicInfoExample);
        if (!CollectionUtils.isEmpty(basicInfoList)) {
            String residenceProvince = basicInfoList.get(0).getResidenceProvince();
            String residenceCity = basicInfoList.get(0).getResidenceCity();
            String residenceCountry = basicInfoList.get(0).getResidenceCountry();
            AssetBenchmarkExample benchmarkExample = new AssetBenchmarkExample();
            benchmarkExample.createCriteria().andIdGreaterThan(0L)
                    .andProvinceLike(residenceProvince)
                    .andCityLike(residenceCity)
                    .andCountryLike(residenceCountry)
                    .andStatusEqualTo(ItemStatus.ENABLED);
            List<AssetBenchmark> assetBenchmarks = assetBenchmarkMapper.selectByExample(benchmarkExample);
            List<AssetBenchmarkVo> assetBenchmarkVos = new ArrayList<>();
            for (AssetBenchmark ab : assetBenchmarks) {
                AssetBenchmarkVo abv = new AssetBenchmarkVo();
                abv.setCity(ab.getCity());
                abv.setDistrict(ab.getDistrict());
                abv.setHouseBenchmark(ab.getHouseBenchmark() / 10000);
                abv.setSalaryBenchmark(ab.getSalaryBenchmark() / 10000);
                abv.setDepositBenchmark(ab.getDepositBenchmark() / 10000);
                abv.setOtherAssetBenchmark(ab.getOtherAssetBenchmark() / 10000);
                abv.setCityHouseBenchmark(ab.getCityHouseBenchmark() / 10000);
                abv.setAreaHouseBenchmark(ab.getAreaHouseBenchmark() / 10000);
                assetBenchmarkVos.add(abv);
            }
            return assetBenchmarkVos;
        }

        return null;
    }

    @Override
    public AssetBenchmark getAssetBenchmarkByCityId(Long cityId) {
        AssetBenchmarkExample example = new AssetBenchmarkExample();
        example.createCriteria().andCityIdEqualTo(cityId).andStatusEqualTo(ItemStatus.ENABLED);
        List<AssetBenchmark> assetBenchmarks = assetBenchmarkMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(assetBenchmarks)) {
            return assetBenchmarks.get(0);
        }
        return null;
    }


    @Override
    public int insertAssetBenchmark(AssetBenchmark benchmark) {
        // TODO
        return 0;
    }

    @Override
    public int updateAssetBenchmark(AssetBenchmark benchmark) {
        // TODO
        return 0;
    }

    @Override
    public int deleteAssetBenchmark(Long id) {
        // TODO
        return 0;
    }

    @Override
    public int clear(Long id) {
        // TODO
        return 0;
    }
}
