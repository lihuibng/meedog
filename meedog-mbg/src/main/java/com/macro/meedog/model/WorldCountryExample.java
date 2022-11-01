package com.macro.meedog.model;

import com.macro.meedog.common.geo.GeoPoint;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WorldCountryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorldCountryExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> locationCriteria;

        protected List<Criterion> allCriteria;

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
            locationCriteria = new ArrayList<>();
        }

        public List<Criterion> getLocationCriteria() {
            return locationCriteria;
        }

        protected void addLocationCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            locationCriteria.add(new Criterion(condition, value, "com.macro.meedog.common.geo.MysqlGeoPointTypeHandler"));
            allCriteria = null;
        }

        protected void addLocationCriterion(String condition, GeoPoint value1, GeoPoint value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            locationCriteria.add(new Criterion(condition, value1, value2, "com.macro.meedog.common.geo.MysqlGeoPointTypeHandler"));
            allCriteria = null;
        }

        public boolean isValid() {
            return criteria.size() > 0
                || locationCriteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            if (allCriteria == null) {
                allCriteria = new ArrayList<>();
                allCriteria.addAll(criteria);
                allCriteria.addAll(locationCriteria);
            }
            return allCriteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
            allCriteria = null;
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
            allCriteria = null;
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
            allCriteria = null;
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andChineseNameIsNull() {
            addCriterion("chinese_name is null");
            return (Criteria) this;
        }

        public Criteria andChineseNameIsNotNull() {
            addCriterion("chinese_name is not null");
            return (Criteria) this;
        }

        public Criteria andChineseNameEqualTo(String value) {
            addCriterion("chinese_name =", value, "chineseName");
            return (Criteria) this;
        }

        public Criteria andChineseNameNotEqualTo(String value) {
            addCriterion("chinese_name <>", value, "chineseName");
            return (Criteria) this;
        }

        public Criteria andChineseNameGreaterThan(String value) {
            addCriterion("chinese_name >", value, "chineseName");
            return (Criteria) this;
        }

        public Criteria andChineseNameGreaterThanOrEqualTo(String value) {
            addCriterion("chinese_name >=", value, "chineseName");
            return (Criteria) this;
        }

        public Criteria andChineseNameLessThan(String value) {
            addCriterion("chinese_name <", value, "chineseName");
            return (Criteria) this;
        }

        public Criteria andChineseNameLessThanOrEqualTo(String value) {
            addCriterion("chinese_name <=", value, "chineseName");
            return (Criteria) this;
        }

        public Criteria andChineseNameLike(String value) {
            addCriterion("chinese_name like", value, "chineseName");
            return (Criteria) this;
        }

        public Criteria andChineseNameNotLike(String value) {
            addCriterion("chinese_name not like", value, "chineseName");
            return (Criteria) this;
        }

        public Criteria andChineseNameIn(List<String> values) {
            addCriterion("chinese_name in", values, "chineseName");
            return (Criteria) this;
        }

        public Criteria andChineseNameNotIn(List<String> values) {
            addCriterion("chinese_name not in", values, "chineseName");
            return (Criteria) this;
        }

        public Criteria andChineseNameBetween(String value1, String value2) {
            addCriterion("chinese_name between", value1, value2, "chineseName");
            return (Criteria) this;
        }

        public Criteria andChineseNameNotBetween(String value1, String value2) {
            addCriterion("chinese_name not between", value1, value2, "chineseName");
            return (Criteria) this;
        }

        public Criteria andNcpIsNull() {
            addCriterion("ncp is null");
            return (Criteria) this;
        }

        public Criteria andNcpIsNotNull() {
            addCriterion("ncp is not null");
            return (Criteria) this;
        }

        public Criteria andNcpEqualTo(Integer value) {
            addCriterion("ncp =", value, "ncp");
            return (Criteria) this;
        }

        public Criteria andNcpNotEqualTo(Integer value) {
            addCriterion("ncp <>", value, "ncp");
            return (Criteria) this;
        }

        public Criteria andNcpGreaterThan(Integer value) {
            addCriterion("ncp >", value, "ncp");
            return (Criteria) this;
        }

        public Criteria andNcpGreaterThanOrEqualTo(Integer value) {
            addCriterion("ncp >=", value, "ncp");
            return (Criteria) this;
        }

        public Criteria andNcpLessThan(Integer value) {
            addCriterion("ncp <", value, "ncp");
            return (Criteria) this;
        }

        public Criteria andNcpLessThanOrEqualTo(Integer value) {
            addCriterion("ncp <=", value, "ncp");
            return (Criteria) this;
        }

        public Criteria andNcpIn(List<Integer> values) {
            addCriterion("ncp in", values, "ncp");
            return (Criteria) this;
        }

        public Criteria andNcpNotIn(List<Integer> values) {
            addCriterion("ncp not in", values, "ncp");
            return (Criteria) this;
        }

        public Criteria andNcpBetween(Integer value1, Integer value2) {
            addCriterion("ncp between", value1, value2, "ncp");
            return (Criteria) this;
        }

        public Criteria andNcpNotBetween(Integer value1, Integer value2) {
            addCriterion("ncp not between", value1, value2, "ncp");
            return (Criteria) this;
        }

        public Criteria andLogoLinkIsNull() {
            addCriterion("logo_link is null");
            return (Criteria) this;
        }

        public Criteria andLogoLinkIsNotNull() {
            addCriterion("logo_link is not null");
            return (Criteria) this;
        }

        public Criteria andLogoLinkEqualTo(String value) {
            addCriterion("logo_link =", value, "logoLink");
            return (Criteria) this;
        }

        public Criteria andLogoLinkNotEqualTo(String value) {
            addCriterion("logo_link <>", value, "logoLink");
            return (Criteria) this;
        }

        public Criteria andLogoLinkGreaterThan(String value) {
            addCriterion("logo_link >", value, "logoLink");
            return (Criteria) this;
        }

        public Criteria andLogoLinkGreaterThanOrEqualTo(String value) {
            addCriterion("logo_link >=", value, "logoLink");
            return (Criteria) this;
        }

        public Criteria andLogoLinkLessThan(String value) {
            addCriterion("logo_link <", value, "logoLink");
            return (Criteria) this;
        }

        public Criteria andLogoLinkLessThanOrEqualTo(String value) {
            addCriterion("logo_link <=", value, "logoLink");
            return (Criteria) this;
        }

        public Criteria andLogoLinkLike(String value) {
            addCriterion("logo_link like", value, "logoLink");
            return (Criteria) this;
        }

        public Criteria andLogoLinkNotLike(String value) {
            addCriterion("logo_link not like", value, "logoLink");
            return (Criteria) this;
        }

        public Criteria andLogoLinkIn(List<String> values) {
            addCriterion("logo_link in", values, "logoLink");
            return (Criteria) this;
        }

        public Criteria andLogoLinkNotIn(List<String> values) {
            addCriterion("logo_link not in", values, "logoLink");
            return (Criteria) this;
        }

        public Criteria andLogoLinkBetween(String value1, String value2) {
            addCriterion("logo_link between", value1, value2, "logoLink");
            return (Criteria) this;
        }

        public Criteria andLogoLinkNotBetween(String value1, String value2) {
            addCriterion("logo_link not between", value1, value2, "logoLink");
            return (Criteria) this;
        }

        public Criteria andPictureIsNull() {
            addCriterion("picture is null");
            return (Criteria) this;
        }

        public Criteria andPictureIsNotNull() {
            addCriterion("picture is not null");
            return (Criteria) this;
        }

        public Criteria andPictureEqualTo(String value) {
            addCriterion("picture =", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotEqualTo(String value) {
            addCriterion("picture <>", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThan(String value) {
            addCriterion("picture >", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThanOrEqualTo(String value) {
            addCriterion("picture >=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThan(String value) {
            addCriterion("picture <", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThanOrEqualTo(String value) {
            addCriterion("picture <=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLike(String value) {
            addCriterion("picture like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotLike(String value) {
            addCriterion("picture not like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureIn(List<String> values) {
            addCriterion("picture in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotIn(List<String> values) {
            addCriterion("picture not in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureBetween(String value1, String value2) {
            addCriterion("picture between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotBetween(String value1, String value2) {
            addCriterion("picture not between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andEnglishNameIsNull() {
            addCriterion("english_name is null");
            return (Criteria) this;
        }

        public Criteria andEnglishNameIsNotNull() {
            addCriterion("english_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnglishNameEqualTo(String value) {
            addCriterion("english_name =", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameNotEqualTo(String value) {
            addCriterion("english_name <>", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameGreaterThan(String value) {
            addCriterion("english_name >", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameGreaterThanOrEqualTo(String value) {
            addCriterion("english_name >=", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameLessThan(String value) {
            addCriterion("english_name <", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameLessThanOrEqualTo(String value) {
            addCriterion("english_name <=", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameLike(String value) {
            addCriterion("english_name like", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameNotLike(String value) {
            addCriterion("english_name not like", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameIn(List<String> values) {
            addCriterion("english_name in", values, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameNotIn(List<String> values) {
            addCriterion("english_name not in", values, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameBetween(String value1, String value2) {
            addCriterion("english_name between", value1, value2, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameNotBetween(String value1, String value2) {
            addCriterion("english_name not between", value1, value2, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishFullNameIsNull() {
            addCriterion("english_full_name is null");
            return (Criteria) this;
        }

        public Criteria andEnglishFullNameIsNotNull() {
            addCriterion("english_full_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnglishFullNameEqualTo(String value) {
            addCriterion("english_full_name =", value, "englishFullName");
            return (Criteria) this;
        }

        public Criteria andEnglishFullNameNotEqualTo(String value) {
            addCriterion("english_full_name <>", value, "englishFullName");
            return (Criteria) this;
        }

        public Criteria andEnglishFullNameGreaterThan(String value) {
            addCriterion("english_full_name >", value, "englishFullName");
            return (Criteria) this;
        }

        public Criteria andEnglishFullNameGreaterThanOrEqualTo(String value) {
            addCriterion("english_full_name >=", value, "englishFullName");
            return (Criteria) this;
        }

        public Criteria andEnglishFullNameLessThan(String value) {
            addCriterion("english_full_name <", value, "englishFullName");
            return (Criteria) this;
        }

        public Criteria andEnglishFullNameLessThanOrEqualTo(String value) {
            addCriterion("english_full_name <=", value, "englishFullName");
            return (Criteria) this;
        }

        public Criteria andEnglishFullNameLike(String value) {
            addCriterion("english_full_name like", value, "englishFullName");
            return (Criteria) this;
        }

        public Criteria andEnglishFullNameNotLike(String value) {
            addCriterion("english_full_name not like", value, "englishFullName");
            return (Criteria) this;
        }

        public Criteria andEnglishFullNameIn(List<String> values) {
            addCriterion("english_full_name in", values, "englishFullName");
            return (Criteria) this;
        }

        public Criteria andEnglishFullNameNotIn(List<String> values) {
            addCriterion("english_full_name not in", values, "englishFullName");
            return (Criteria) this;
        }

        public Criteria andEnglishFullNameBetween(String value1, String value2) {
            addCriterion("english_full_name between", value1, value2, "englishFullName");
            return (Criteria) this;
        }

        public Criteria andEnglishFullNameNotBetween(String value1, String value2) {
            addCriterion("english_full_name not between", value1, value2, "englishFullName");
            return (Criteria) this;
        }

        public Criteria andGdpIsNull() {
            addCriterion("gdp is null");
            return (Criteria) this;
        }

        public Criteria andGdpIsNotNull() {
            addCriterion("gdp is not null");
            return (Criteria) this;
        }

        public Criteria andGdpEqualTo(Double value) {
            addCriterion("gdp =", value, "gdp");
            return (Criteria) this;
        }

        public Criteria andGdpNotEqualTo(Double value) {
            addCriterion("gdp <>", value, "gdp");
            return (Criteria) this;
        }

        public Criteria andGdpGreaterThan(Double value) {
            addCriterion("gdp >", value, "gdp");
            return (Criteria) this;
        }

        public Criteria andGdpGreaterThanOrEqualTo(Double value) {
            addCriterion("gdp >=", value, "gdp");
            return (Criteria) this;
        }

        public Criteria andGdpLessThan(Double value) {
            addCriterion("gdp <", value, "gdp");
            return (Criteria) this;
        }

        public Criteria andGdpLessThanOrEqualTo(Double value) {
            addCriterion("gdp <=", value, "gdp");
            return (Criteria) this;
        }

        public Criteria andGdpIn(List<Double> values) {
            addCriterion("gdp in", values, "gdp");
            return (Criteria) this;
        }

        public Criteria andGdpNotIn(List<Double> values) {
            addCriterion("gdp not in", values, "gdp");
            return (Criteria) this;
        }

        public Criteria andGdpBetween(Double value1, Double value2) {
            addCriterion("gdp between", value1, value2, "gdp");
            return (Criteria) this;
        }

        public Criteria andGdpNotBetween(Double value1, Double value2) {
            addCriterion("gdp not between", value1, value2, "gdp");
            return (Criteria) this;
        }

        public Criteria andPopulationIsNull() {
            addCriterion("population is null");
            return (Criteria) this;
        }

        public Criteria andPopulationIsNotNull() {
            addCriterion("population is not null");
            return (Criteria) this;
        }

        public Criteria andPopulationEqualTo(Double value) {
            addCriterion("population =", value, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationNotEqualTo(Double value) {
            addCriterion("population <>", value, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationGreaterThan(Double value) {
            addCriterion("population >", value, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationGreaterThanOrEqualTo(Double value) {
            addCriterion("population >=", value, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationLessThan(Double value) {
            addCriterion("population <", value, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationLessThanOrEqualTo(Double value) {
            addCriterion("population <=", value, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationIn(List<Double> values) {
            addCriterion("population in", values, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationNotIn(List<Double> values) {
            addCriterion("population not in", values, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationBetween(Double value1, Double value2) {
            addCriterion("population between", value1, value2, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationNotBetween(Double value1, Double value2) {
            addCriterion("population not between", value1, value2, "population");
            return (Criteria) this;
        }

        public Criteria andGdpPerCapitaIsNull() {
            addCriterion("gdp_per_capita is null");
            return (Criteria) this;
        }

        public Criteria andGdpPerCapitaIsNotNull() {
            addCriterion("gdp_per_capita is not null");
            return (Criteria) this;
        }

        public Criteria andGdpPerCapitaEqualTo(Integer value) {
            addCriterion("gdp_per_capita =", value, "gdpPerCapita");
            return (Criteria) this;
        }

        public Criteria andGdpPerCapitaNotEqualTo(Integer value) {
            addCriterion("gdp_per_capita <>", value, "gdpPerCapita");
            return (Criteria) this;
        }

        public Criteria andGdpPerCapitaGreaterThan(Integer value) {
            addCriterion("gdp_per_capita >", value, "gdpPerCapita");
            return (Criteria) this;
        }

        public Criteria andGdpPerCapitaGreaterThanOrEqualTo(Integer value) {
            addCriterion("gdp_per_capita >=", value, "gdpPerCapita");
            return (Criteria) this;
        }

        public Criteria andGdpPerCapitaLessThan(Integer value) {
            addCriterion("gdp_per_capita <", value, "gdpPerCapita");
            return (Criteria) this;
        }

        public Criteria andGdpPerCapitaLessThanOrEqualTo(Integer value) {
            addCriterion("gdp_per_capita <=", value, "gdpPerCapita");
            return (Criteria) this;
        }

        public Criteria andGdpPerCapitaIn(List<Integer> values) {
            addCriterion("gdp_per_capita in", values, "gdpPerCapita");
            return (Criteria) this;
        }

        public Criteria andGdpPerCapitaNotIn(List<Integer> values) {
            addCriterion("gdp_per_capita not in", values, "gdpPerCapita");
            return (Criteria) this;
        }

        public Criteria andGdpPerCapitaBetween(Integer value1, Integer value2) {
            addCriterion("gdp_per_capita between", value1, value2, "gdpPerCapita");
            return (Criteria) this;
        }

        public Criteria andGdpPerCapitaNotBetween(Integer value1, Integer value2) {
            addCriterion("gdp_per_capita not between", value1, value2, "gdpPerCapita");
            return (Criteria) this;
        }

        public Criteria andLetter2NameIsNull() {
            addCriterion("letter2_name is null");
            return (Criteria) this;
        }

        public Criteria andLetter2NameIsNotNull() {
            addCriterion("letter2_name is not null");
            return (Criteria) this;
        }

        public Criteria andLetter2NameEqualTo(String value) {
            addCriterion("letter2_name =", value, "letter2Name");
            return (Criteria) this;
        }

        public Criteria andLetter2NameNotEqualTo(String value) {
            addCriterion("letter2_name <>", value, "letter2Name");
            return (Criteria) this;
        }

        public Criteria andLetter2NameGreaterThan(String value) {
            addCriterion("letter2_name >", value, "letter2Name");
            return (Criteria) this;
        }

        public Criteria andLetter2NameGreaterThanOrEqualTo(String value) {
            addCriterion("letter2_name >=", value, "letter2Name");
            return (Criteria) this;
        }

        public Criteria andLetter2NameLessThan(String value) {
            addCriterion("letter2_name <", value, "letter2Name");
            return (Criteria) this;
        }

        public Criteria andLetter2NameLessThanOrEqualTo(String value) {
            addCriterion("letter2_name <=", value, "letter2Name");
            return (Criteria) this;
        }

        public Criteria andLetter2NameLike(String value) {
            addCriterion("letter2_name like", value, "letter2Name");
            return (Criteria) this;
        }

        public Criteria andLetter2NameNotLike(String value) {
            addCriterion("letter2_name not like", value, "letter2Name");
            return (Criteria) this;
        }

        public Criteria andLetter2NameIn(List<String> values) {
            addCriterion("letter2_name in", values, "letter2Name");
            return (Criteria) this;
        }

        public Criteria andLetter2NameNotIn(List<String> values) {
            addCriterion("letter2_name not in", values, "letter2Name");
            return (Criteria) this;
        }

        public Criteria andLetter2NameBetween(String value1, String value2) {
            addCriterion("letter2_name between", value1, value2, "letter2Name");
            return (Criteria) this;
        }

        public Criteria andLetter2NameNotBetween(String value1, String value2) {
            addCriterion("letter2_name not between", value1, value2, "letter2Name");
            return (Criteria) this;
        }

        public Criteria andLetter3NameIsNull() {
            addCriterion("letter3_name is null");
            return (Criteria) this;
        }

        public Criteria andLetter3NameIsNotNull() {
            addCriterion("letter3_name is not null");
            return (Criteria) this;
        }

        public Criteria andLetter3NameEqualTo(String value) {
            addCriterion("letter3_name =", value, "letter3Name");
            return (Criteria) this;
        }

        public Criteria andLetter3NameNotEqualTo(String value) {
            addCriterion("letter3_name <>", value, "letter3Name");
            return (Criteria) this;
        }

        public Criteria andLetter3NameGreaterThan(String value) {
            addCriterion("letter3_name >", value, "letter3Name");
            return (Criteria) this;
        }

        public Criteria andLetter3NameGreaterThanOrEqualTo(String value) {
            addCriterion("letter3_name >=", value, "letter3Name");
            return (Criteria) this;
        }

        public Criteria andLetter3NameLessThan(String value) {
            addCriterion("letter3_name <", value, "letter3Name");
            return (Criteria) this;
        }

        public Criteria andLetter3NameLessThanOrEqualTo(String value) {
            addCriterion("letter3_name <=", value, "letter3Name");
            return (Criteria) this;
        }

        public Criteria andLetter3NameLike(String value) {
            addCriterion("letter3_name like", value, "letter3Name");
            return (Criteria) this;
        }

        public Criteria andLetter3NameNotLike(String value) {
            addCriterion("letter3_name not like", value, "letter3Name");
            return (Criteria) this;
        }

        public Criteria andLetter3NameIn(List<String> values) {
            addCriterion("letter3_name in", values, "letter3Name");
            return (Criteria) this;
        }

        public Criteria andLetter3NameNotIn(List<String> values) {
            addCriterion("letter3_name not in", values, "letter3Name");
            return (Criteria) this;
        }

        public Criteria andLetter3NameBetween(String value1, String value2) {
            addCriterion("letter3_name between", value1, value2, "letter3Name");
            return (Criteria) this;
        }

        public Criteria andLetter3NameNotBetween(String value1, String value2) {
            addCriterion("letter3_name not between", value1, value2, "letter3Name");
            return (Criteria) this;
        }

        public Criteria andDigitCodeIsNull() {
            addCriterion("digit_code is null");
            return (Criteria) this;
        }

        public Criteria andDigitCodeIsNotNull() {
            addCriterion("digit_code is not null");
            return (Criteria) this;
        }

        public Criteria andDigitCodeEqualTo(Integer value) {
            addCriterion("digit_code =", value, "digitCode");
            return (Criteria) this;
        }

        public Criteria andDigitCodeNotEqualTo(Integer value) {
            addCriterion("digit_code <>", value, "digitCode");
            return (Criteria) this;
        }

        public Criteria andDigitCodeGreaterThan(Integer value) {
            addCriterion("digit_code >", value, "digitCode");
            return (Criteria) this;
        }

        public Criteria andDigitCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("digit_code >=", value, "digitCode");
            return (Criteria) this;
        }

        public Criteria andDigitCodeLessThan(Integer value) {
            addCriterion("digit_code <", value, "digitCode");
            return (Criteria) this;
        }

        public Criteria andDigitCodeLessThanOrEqualTo(Integer value) {
            addCriterion("digit_code <=", value, "digitCode");
            return (Criteria) this;
        }

        public Criteria andDigitCodeIn(List<Integer> values) {
            addCriterion("digit_code in", values, "digitCode");
            return (Criteria) this;
        }

        public Criteria andDigitCodeNotIn(List<Integer> values) {
            addCriterion("digit_code not in", values, "digitCode");
            return (Criteria) this;
        }

        public Criteria andDigitCodeBetween(Integer value1, Integer value2) {
            addCriterion("digit_code between", value1, value2, "digitCode");
            return (Criteria) this;
        }

        public Criteria andDigitCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("digit_code not between", value1, value2, "digitCode");
            return (Criteria) this;
        }

        public Criteria andOldDigitCodeIsNull() {
            addCriterion("old_digit_code is null");
            return (Criteria) this;
        }

        public Criteria andOldDigitCodeIsNotNull() {
            addCriterion("old_digit_code is not null");
            return (Criteria) this;
        }

        public Criteria andOldDigitCodeEqualTo(Integer value) {
            addCriterion("old_digit_code =", value, "oldDigitCode");
            return (Criteria) this;
        }

        public Criteria andOldDigitCodeNotEqualTo(Integer value) {
            addCriterion("old_digit_code <>", value, "oldDigitCode");
            return (Criteria) this;
        }

        public Criteria andOldDigitCodeGreaterThan(Integer value) {
            addCriterion("old_digit_code >", value, "oldDigitCode");
            return (Criteria) this;
        }

        public Criteria andOldDigitCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("old_digit_code >=", value, "oldDigitCode");
            return (Criteria) this;
        }

        public Criteria andOldDigitCodeLessThan(Integer value) {
            addCriterion("old_digit_code <", value, "oldDigitCode");
            return (Criteria) this;
        }

        public Criteria andOldDigitCodeLessThanOrEqualTo(Integer value) {
            addCriterion("old_digit_code <=", value, "oldDigitCode");
            return (Criteria) this;
        }

        public Criteria andOldDigitCodeIn(List<Integer> values) {
            addCriterion("old_digit_code in", values, "oldDigitCode");
            return (Criteria) this;
        }

        public Criteria andOldDigitCodeNotIn(List<Integer> values) {
            addCriterion("old_digit_code not in", values, "oldDigitCode");
            return (Criteria) this;
        }

        public Criteria andOldDigitCodeBetween(Integer value1, Integer value2) {
            addCriterion("old_digit_code between", value1, value2, "oldDigitCode");
            return (Criteria) this;
        }

        public Criteria andOldDigitCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("old_digit_code not between", value1, value2, "oldDigitCode");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(GeoPoint value) {
            addLocationCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(GeoPoint value) {
            addLocationCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(GeoPoint value) {
            addLocationCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(GeoPoint value) {
            addLocationCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(GeoPoint value) {
            addLocationCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(GeoPoint value) {
            addLocationCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<GeoPoint> values) {
            addLocationCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<GeoPoint> values) {
            addLocationCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(GeoPoint value1, GeoPoint value2) {
            addLocationCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(GeoPoint value1, GeoPoint value2) {
            addLocationCriterion("location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andCapitalIsNull() {
            addCriterion("capital is null");
            return (Criteria) this;
        }

        public Criteria andCapitalIsNotNull() {
            addCriterion("capital is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalEqualTo(String value) {
            addCriterion("capital =", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotEqualTo(String value) {
            addCriterion("capital <>", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalGreaterThan(String value) {
            addCriterion("capital >", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalGreaterThanOrEqualTo(String value) {
            addCriterion("capital >=", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalLessThan(String value) {
            addCriterion("capital <", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalLessThanOrEqualTo(String value) {
            addCriterion("capital <=", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalLike(String value) {
            addCriterion("capital like", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotLike(String value) {
            addCriterion("capital not like", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalIn(List<String> values) {
            addCriterion("capital in", values, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotIn(List<String> values) {
            addCriterion("capital not in", values, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalBetween(String value1, String value2) {
            addCriterion("capital between", value1, value2, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotBetween(String value1, String value2) {
            addCriterion("capital not between", value1, value2, "capital");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIsNull() {
            addCriterion("modified_time is null");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIsNotNull() {
            addCriterion("modified_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeEqualTo(Date value) {
            addCriterion("modified_time =", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotEqualTo(Date value) {
            addCriterion("modified_time <>", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeGreaterThan(Date value) {
            addCriterion("modified_time >", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modified_time >=", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeLessThan(Date value) {
            addCriterion("modified_time <", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeLessThanOrEqualTo(Date value) {
            addCriterion("modified_time <=", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIn(List<Date> values) {
            addCriterion("modified_time in", values, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotIn(List<Date> values) {
            addCriterion("modified_time not in", values, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeBetween(Date value1, Date value2) {
            addCriterion("modified_time between", value1, value2, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotBetween(Date value1, Date value2) {
            addCriterion("modified_time not between", value1, value2, "modifiedTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}