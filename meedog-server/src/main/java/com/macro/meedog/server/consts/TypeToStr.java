package com.macro.meedog.server.consts;

import com.macro.meedog.common.proto.EducationExperience.CountryType;
import com.macro.meedog.common.proto.EducationExperience.DegreeType;

import java.util.HashMap;
import java.util.Map;

/**
 * @author "xxxxxx"
 */

public class TypeToStr {
    private final Map degreeMap = new HashMap() {
        {
            // 0: 没读过书 1: 小学 2: 初中 3: 中专 4: 高中 5: 大专
            // 6: 成人本科 7: 本科 8: 研究生 9: 在职研究生 10: MBA 11: 博士 12: 博士后 13: 其他
            put(DegreeType.NoSchool, "没读过书");
            put(DegreeType.PrimarySchool, "小学");
            put(DegreeType.JuniorSchool, "初中");
            put(DegreeType.TechSecondarySchool, "中专");
            put(DegreeType.HighSchool, "高中");
            put(DegreeType.JuniorCollege, "大专");
            put(DegreeType.AdultUndergraduate, "成人本科");
            put(DegreeType.Bachelor, "本科");
            put(DegreeType.Master, "研究生");
            put(DegreeType.ParttimeGraduate, "在职研究生");
            put(DegreeType.MBA, "MBA");
            put(DegreeType.Doctor, "博士");
            put(DegreeType.PostDoctor, "博士后");
            put(DegreeType.OtherDegree, "其他");
        }
    };

    private final Map countryMap = new HashMap() {
        {
            // 0: 国内 1: 港澳台 2: 美国 3: 加拿大 4: 英国 5: 欧洲 6: 澳洲 7: 其他
            put(CountryType.China, "国内");
            put(CountryType.ChinaHKAMTW, "港澳台");
            put(CountryType.America, "美国");
            put(CountryType.Canada, "加拿大");
            put(CountryType.UK, "英国");
            put(CountryType.Europe, "欧洲");
            put(CountryType.Australia, "澳洲");
            put(CountryType.OtherCountry, "本科");
        }
    };

    public String getDegreeString(DegreeType degree) {
        return (String) degreeMap.get(degree);
    }

    public String getCountryString(CountryType country) {
        return (String) countryMap.get(country);
    }
}

