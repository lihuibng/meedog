package com.macro.meedog.server.service.impl;

import com.macro.meedog.mapper.*;
import com.macro.meedog.model.*;
import com.macro.meedog.server.domain.ItemStatus;
import com.macro.meedog.server.domain.vo.*;
import com.macro.meedog.server.service.InitCacheService;
import com.macro.meedog.server.service.InitService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

@Service
public class InitServiceImpl implements InitService {
    private static final Logger LOG = LoggerFactory.getLogger(InitServiceImpl.class);
    @Autowired
    private ZodiacMapper zodiacMapper;

    @Autowired
    private ConstellationMapper constellationMapper;

    @Autowired
    private DegreeMapper degreeMapper;

    @Autowired
    private MarriageStatusMapper marriageStatusMapper;

    @Autowired
    private ProvinceMapper provinceMapper;

    @Autowired
    private UserCityMapper userCityMapper;

    @Autowired
    private GenderMapper genderMapper;

    @Autowired
    private SexualTypeMapper sexualTypeMapper;

    @Autowired
    private AssetBenchmarkMapper assetBenchmarkMapper;

    @Autowired
    private CollegeStatusMapper collegeStatusMapper;

    @Autowired
    private WorldCountryMapper worldCountryMapper;

    @Autowired
    private UserBasicInfoMapper basicInfoMapper;

    @Autowired
    private AreaMapper areaMapper;

    @Autowired
    private WorldCityMapper worldCityMapper;

    @Autowired
    private InitCacheService initCacheService;

    @Override
    public HouseDistrictVo getHouseDistrict(Long uid) {
        HouseDistrictVo vo = new HouseDistrictVo();
        vo.setUid(uid);
        UserBasicInfoExample basicInfoExample = new UserBasicInfoExample();
        basicInfoExample.createCriteria().andUidEqualTo(uid).andStatusEqualTo(ItemStatus.ENABLED);
        List<UserBasicInfo> basicInfoList = basicInfoMapper.selectByExample(basicInfoExample);
        if (CollectionUtils.isEmpty(basicInfoList)) {
            return vo;
        }
        String residenceCountry = basicInfoList.get(0).getResidenceCountry();
        String residenceProvince = basicInfoList.get(0).getResidenceProvince();
        String residenceCity = basicInfoList.get(0).getResidenceCity();


        if (residenceCountry == null || residenceCountry.isEmpty()
                || residenceProvince == null || residenceProvince.isEmpty()
                || residenceCity == null || residenceCity.isEmpty()) {
            return vo;
        }
        ProvinceExample provinceExample = new ProvinceExample();
        provinceExample.createCriteria().andNameLike(residenceProvince);
        List<Province> provinceList = provinceMapper.selectByExample(provinceExample);
        List<DataItem> items = new ArrayList<>();
        if (!CollectionUtils.isEmpty(provinceList)) {
            String provinceCode = provinceList.get(0).getCode();
            List<UserCity> userCityList = initCacheService.getUserCity(provinceCode);
            if (CollectionUtils.isEmpty(userCityList)) {
                UserCityExample userCityExample = new UserCityExample();
                userCityExample.setOrderByClause("city_rank asc, house_benchmark desc");
                userCityExample.createCriteria().andPcidEqualTo(Long.parseLong(provinceCode))
                        .andCountryLike(residenceCountry)
                        .andCityLike(residenceCity)
                        .andHouseBenchmarkGreaterThan(0);
                userCityList = userCityMapper.selectByExample(userCityExample);
                initCacheService.setUserCity(provinceCode, userCityList);
            }

            if (!CollectionUtils.isEmpty(userCityList)) {
                for (UserCity uc : userCityList) {
                    List<AssetBenchmark> assetList = initCacheService.getHouseDistrict(String.valueOf(uc.getCid()));
                    if (CollectionUtils.isEmpty(assetList)) {
                        AssetBenchmarkExample assetExample = new AssetBenchmarkExample();
                        assetExample.setOrderByClause("house_benchmark desc");
                        assetExample.createCriteria().andCityIdEqualTo(uc.getCid());
                        assetList = assetBenchmarkMapper.selectByExample(assetExample);
                        initCacheService.setHouseDistrict(uc.getCid().toString(), assetList);
                    }
                    if (!CollectionUtils.isEmpty(assetList)) {

                        for (AssetBenchmark a : assetList) {
                            items.add(new DataItem(a.getDistrict(), a.getDistrictId()));
                        }
                    }
                }
            }
        }
        vo.setHouseDistrictItems(items);
        return vo;
    }

    @Override
    public CollegeStatusVo getCollegeStatus() {
        CollegeStatusVo vo = new CollegeStatusVo();
        List<CollegeStatus> collegeStatusList = initCacheService.getCollegeStatus();
        if (CollectionUtils.isEmpty(collegeStatusList)) {
            CollegeStatusExample collegeStatusExample = new CollegeStatusExample();
            collegeStatusExample.createCriteria().andStatusEqualTo(ItemStatus.ENABLED);
            collegeStatusList = collegeStatusMapper.selectByExample(collegeStatusExample);
            initCacheService.setCollegeStatus(collegeStatusList);
        }

        List<DataItem> collegeStatus = new ArrayList<>();
        for (CollegeStatus c : collegeStatusList) {
            collegeStatus.add(new DataItem(c.getCollegeStatusCn(), c.getCollegeStatus()));
        }
        vo.setCollegeStatusItems(collegeStatus);
        return vo;
    }

    @Override
    public MarriageStatusVo getMarriageStatus() {
        MarriageStatusVo vo = new MarriageStatusVo();
        List<MarriageStatus> marriageStatusList = initCacheService.getMarriageStatus();
        if (CollectionUtils.isEmpty(marriageStatusList)) {
            MarriageStatusExample marriageExample = new MarriageStatusExample();
            marriageExample.createCriteria().andStatusEqualTo(ItemStatus.ENABLED).andMarriageStatusLessThan(5);
            marriageStatusList = marriageStatusMapper.selectByExample(marriageExample);
            initCacheService.setMarriageStatus(marriageStatusList);
        }

        List<DataItem> marriageStatus = new ArrayList<>();
        for (MarriageStatus m : marriageStatusList) {
            marriageStatus.add(new DataItem(m.getMarrigeStatueCn(), m.getMarriageStatus()));
        }
        vo.setMarriageStatusItems(marriageStatus);
        return vo;
    }

    @Override
    public GenderVo getGender() {
        GenderVo vo = new GenderVo();
        List<Gender> genderList = new ArrayList<Gender>();
        if (CollectionUtils.isEmpty(genderList)) {
            GenderExample genderExample = new GenderExample();
            genderExample.createCriteria().andStatusEqualTo(ItemStatus.ENABLED);
            genderList = genderMapper.selectByExample(genderExample);
        }

        List<DataItem> genders = new ArrayList<>();
        for (Gender g : genderList) {
            genders.add(new DataItem(g.getGenderCn(), g.getGender()));
        }
        vo.setGenderItems(genders);
        return vo;
    }

    @Override
    public SexualTypeVo getSexualType() {
        SexualTypeVo vo = new SexualTypeVo();
        List<SexualType> sexualTypeList = new ArrayList<SexualType>();
        if (CollectionUtils.isEmpty(sexualTypeList)) {
            SexualTypeExample sexualTypeExample = new SexualTypeExample();
            sexualTypeExample.createCriteria().andStatusEqualTo(ItemStatus.ENABLED);
            sexualTypeList = sexualTypeMapper.selectByExample(sexualTypeExample);
        }

        List<DataItem> sexualTypes = new ArrayList<>();
        for (SexualType s : sexualTypeList) {
            sexualTypes.add(new DataItem(s.getSexualTypeCn(), s.getSexualType()));
        }
        vo.setSexualTypeItems(sexualTypes);
        return vo;
    }

    @Override
    public HouseholdsVo getHouseholds() {
        HouseholdsVo vo = new HouseholdsVo();
        List<UserCity> userCityList = initCacheService.getHouseholds();
        if (CollectionUtils.isEmpty(userCityList)) {
            UserCityExample userCityExample = new UserCityExample();
            userCityExample.createCriteria().andStatusEqualTo(ItemStatus.ENABLED)
                    .andLevelLessThanOrEqualTo(0)
                    .andCidLessThan(7701L); // 7701 8801 9901港澳台
            userCityList = userCityMapper.selectByExample(userCityExample);
            initCacheService.setHouseholds(userCityList);
        }

        List<DataItem> households = new ArrayList<>();
        for (UserCity u : userCityList) {
            households.add(new DataItem(u.getCity(), u.getCid().intValue()));
        }
        vo.setHouseholdsItems(households);
        return vo;
    }

    @Override
    public DegreeVo getDegree() {
        DegreeVo vo = new DegreeVo();
        List<Degree> degreeList = initCacheService.getDegree();
        if (CollectionUtils.isEmpty(degreeList)) {
            DegreeExample degreeExample = new DegreeExample();
            degreeExample.createCriteria().andStatusEqualTo(ItemStatus.ENABLED);
            degreeList = degreeMapper.selectByExample(degreeExample);
            initCacheService.setDegree(degreeList);
        }

        List<DataItem> degrees = new ArrayList<>();
        for (Degree d : degreeList) {
            degrees.add(new DataItem(d.getDegreeCn(), d.getDegree()));
        }
        vo.setDegreeItems(degrees);
        return vo;
    }

    @Override
    public CityVo getAllCity() {
        CityVo vo = new CityVo();
        List<MapDataItem> cities = new ArrayList<MapDataItem>();
        ProvinceExample provinceExample = new ProvinceExample();
        provinceExample.createCriteria().getAllCriteria();
        List<Province> provinceList = provinceMapper.selectByExample(provinceExample);
        if (!CollectionUtils.isEmpty(provinceList)) {
            for (Province p : provinceList) {
                String provinceCode = p.getCode();

                List<UserCity> userCityList = initCacheService.getUserCity(provinceCode);
                if (CollectionUtils.isEmpty(userCityList)) {
                    UserCityExample userCityExample = new UserCityExample();
                    userCityExample.setOrderByClause("city_rank asc, house_benchmark desc");
                    userCityExample.createCriteria().andPcidEqualTo(Long.parseLong(provinceCode));
                    userCityList = userCityMapper.selectByExample(userCityExample);
                    initCacheService.setUserCity(provinceCode, userCityList);
                }

                List<DataItem> cityItems = new ArrayList<DataItem>();
                if (!CollectionUtils.isEmpty(userCityList)) {
                    for (UserCity uc : userCityList) {
                        cityItems.add(new DataItem(uc.getCity(), uc.getCid().intValue()));
                    }
                }
                cities.add(new MapDataItem(p.getName(), Integer.parseInt(p.getCode()), cityItems));
            }
        }
        vo.setCityItems(cities);
        return vo;
    }

    @Override
    public CityVo getCity(Long uid) {
        CityVo vo = new CityVo();
        vo.setUid(uid);
        List<MapDataItem> cities = new ArrayList<MapDataItem>();
        UserBasicInfoExample basicInfoExample = new UserBasicInfoExample();
        basicInfoExample.createCriteria().andUidEqualTo(uid).andStatusEqualTo(ItemStatus.ENABLED);
        List<UserBasicInfo> basicInfoList = basicInfoMapper.selectByExample(basicInfoExample);
        if (CollectionUtils.isEmpty(basicInfoList)) {
            return vo;
        }
        String residenceCountry = basicInfoList.get(0).getResidenceCountry();
        String residenceProvince = basicInfoList.get(0).getResidenceProvince();
        String residenceCity = basicInfoList.get(0).getResidenceCity();

        ProvinceExample provinceExample = new ProvinceExample();
        provinceExample.createCriteria().andNameLike(residenceProvince);
        List<Province> provinceList = provinceMapper.selectByExample(provinceExample);
        if (!CollectionUtils.isEmpty(provinceList)) {
            String provinceCode = provinceList.get(0).getCode();
            List<UserCity> userCityList = new ArrayList<UserCity>();
            if (CollectionUtils.isEmpty(userCityList)) {
                UserCityExample userCityExample = new UserCityExample();
                userCityExample.setOrderByClause("city_rank asc, house_benchmark desc");
                userCityExample.createCriteria().andPcidEqualTo(Long.parseLong(provinceCode))
                        .andCountryLike(residenceCountry)
                        .andCityLike(residenceCity);
                userCityList = userCityMapper.selectByExample(userCityExample);
            }

            if (!CollectionUtils.isEmpty(userCityList)) {
                for (UserCity uc : userCityList) {
                    List<Area> areaList = initCacheService.getArea(String.valueOf(uc.getCid()));
                    if (CollectionUtils.isEmpty(areaList)) {
                        AreaExample areaExample = new AreaExample();
                        areaExample.createCriteria().andCitycodeEqualTo(uc.getCid().toString());
                        areaList = areaMapper.selectByExample(areaExample);
                        initCacheService.setArea(uc.getCid().toString(), areaList);
                    }
                    if (!CollectionUtils.isEmpty(areaList)) {
                        List<DataItem> areaItems = new ArrayList<DataItem>();
                        for (Area a : areaList) {
                            areaItems.add(new DataItem(a.getName(), Integer.parseInt(a.getCode())));
                        }
                        MapDataItem mapItem = new MapDataItem(uc.getCity(), uc.getCid().intValue(), areaItems);
                        cities.add(mapItem);
                    }
                }
            }
        }
        vo.setCityItems(cities);
        return vo;
    }

    @Override
    public RegionVo getRegion() {
        RegionVo vo = new RegionVo();
        List<MapDataItem> regions = new ArrayList<>();
        List<WorldCountry> worldCountryList = initCacheService.getWorldCountry();
        if (CollectionUtils.isEmpty(worldCountryList)) {
            WorldCountryExample worldCountryExample = new WorldCountryExample();
            worldCountryExample.createCriteria().andIdGreaterThan(0L)
                    .andNcpLessThanOrEqualTo(22)
                    .andNcpGreaterThan(0)
                    .andStatusEqualTo(ItemStatus.ENABLED);
            if (worldCountryList == null) {
                worldCountryList = new ArrayList<WorldCountry>();
            }
            worldCountryList = worldCountryMapper.selectByExample(worldCountryExample);
            initCacheService.setWorldCountry(worldCountryList);
        }

        for (WorldCountry wc : worldCountryList) {
            List<WorldCity> tempList = initCacheService.getWorldCity(wc.getId().toString());

            if (CollectionUtils.isEmpty(tempList)) {
                WorldCityExample worldCityExample = new WorldCityExample();
                worldCityExample.createCriteria()
                        .andIdGreaterThan(0L)
                        .andCountryIdEqualTo(wc.getId())
                        .andStatusEqualTo(ItemStatus.ENABLED);
                tempList = worldCityMapper.selectByExample(worldCityExample);
                initCacheService.setWorldCity(wc.getId().toString(), tempList);
            }
            List<DataItem> cities = new ArrayList<>();
            for (WorldCity city : tempList) {
                if (!city.getChineseStateName().isEmpty()) {
                    cities.add(new DataItem(city.getChineseStateName(), city.getId().intValue()));
                } else {
                    cities.add(new DataItem(city.getChineseCityName(), city.getId().intValue()));

                }
            }
            MapDataItem stateItem = new MapDataItem(wc.getChineseName(), wc.getDigitCode().intValue(), cities);
            regions.add(stateItem);
        }
        vo.setRegionItems(regions);
        return vo;
    }


    @Override
    public ZodiacVo getZodiac() {
        ZodiacVo vo = new ZodiacVo();
        List<Zodiac> zodiacList = initCacheService.getZodiac();

        if (CollectionUtils.isEmpty(zodiacList)) {
            ZodiacExample zodiacExample = new ZodiacExample();
            zodiacExample.createCriteria().andStatusEqualTo(ItemStatus.ENABLED);
            zodiacList = zodiacMapper.selectByExample(zodiacExample);
            initCacheService.setZodiac(zodiacList);
        }
        List<DataItem> zodiacs = new ArrayList<>();
        for (Zodiac z : zodiacList) {
            zodiacs.add(new DataItem(z.getZodiac(), z.getId().intValue()));
        }
        vo.setZodiacItems(zodiacs);
        return vo;
    }

    @Override
    public ConstellationVo getConstellation() {
        ConstellationVo vo = new ConstellationVo();
        List<Constellation> constellationList = initCacheService.getConstellation();
        if (CollectionUtils.isEmpty(constellationList)) {
            ConstellationExample constellationExample = new ConstellationExample();
            constellationExample.createCriteria().andStatusEqualTo(ItemStatus.ENABLED);
            constellationList = constellationMapper.selectByExample(constellationExample);
            initCacheService.setConstellation(constellationList);
        }

        List<DataItem> constellations = new ArrayList<>();
        for (Constellation c : constellationList) {
            constellations.add(new DataItem(c.getConstellation(), c.getId().intValue()));
        }
        vo.setConstellationItems(constellations);
        return vo;
    }

    @Override
    public ProvinceVo getProvince() {
        ProvinceVo vo = new ProvinceVo();
        List<Province> provinceList = initCacheService.getProvince();
        if (CollectionUtils.isEmpty(provinceList)) {
            ProvinceExample provinceExample = new ProvinceExample();
            provinceExample.createCriteria();
            provinceList = provinceMapper.selectByExample(provinceExample);
            initCacheService.setProvince(provinceList);
        }

        List<DataItem> provinces = new ArrayList<>();
        for (Province p : provinceList) {
            provinces.add(new DataItem(p.getName(), Integer.parseInt(p.getCode())));
        }
        vo.setProvinceItems(provinces);
        return vo;
    }

    @Override
    public InitVo getInits() {
        InitVo vo = new InitVo();
        ZodiacVo zodiacVo = getZodiac();
        ConstellationVo constellationVo = getConstellation();
        ProvinceVo provinceVo = getProvince();
        vo.setZodiacItems(zodiacVo.getZodiacItems());
        vo.setConstellationItems(constellationVo.getConstellationItems());
        vo.setProvinceItems(provinceVo.getProvinceItems());
        return vo;
    }
}
