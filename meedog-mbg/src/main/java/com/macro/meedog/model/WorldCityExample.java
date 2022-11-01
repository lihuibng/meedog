package com.macro.meedog.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WorldCityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorldCityExample() {
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
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
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

        public Criteria andCountryIdIsNull() {
            addCriterion("country_id is null");
            return (Criteria) this;
        }

        public Criteria andCountryIdIsNotNull() {
            addCriterion("country_id is not null");
            return (Criteria) this;
        }

        public Criteria andCountryIdEqualTo(Long value) {
            addCriterion("country_id =", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotEqualTo(Long value) {
            addCriterion("country_id <>", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThan(Long value) {
            addCriterion("country_id >", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("country_id >=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThan(Long value) {
            addCriterion("country_id <", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThanOrEqualTo(Long value) {
            addCriterion("country_id <=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdIn(List<Long> values) {
            addCriterion("country_id in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotIn(List<Long> values) {
            addCriterion("country_id not in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdBetween(Long value1, Long value2) {
            addCriterion("country_id between", value1, value2, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotBetween(Long value1, Long value2) {
            addCriterion("country_id not between", value1, value2, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNull() {
            addCriterion("country_code is null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNotNull() {
            addCriterion("country_code is not null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeEqualTo(String value) {
            addCriterion("country_code =", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotEqualTo(String value) {
            addCriterion("country_code <>", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThan(String value) {
            addCriterion("country_code >", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("country_code >=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThan(String value) {
            addCriterion("country_code <", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThanOrEqualTo(String value) {
            addCriterion("country_code <=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLike(String value) {
            addCriterion("country_code like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotLike(String value) {
            addCriterion("country_code not like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIn(List<String> values) {
            addCriterion("country_code in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotIn(List<String> values) {
            addCriterion("country_code not in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeBetween(String value1, String value2) {
            addCriterion("country_code between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotBetween(String value1, String value2) {
            addCriterion("country_code not between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andChineseCountryNameIsNull() {
            addCriterion("chinese_country_name is null");
            return (Criteria) this;
        }

        public Criteria andChineseCountryNameIsNotNull() {
            addCriterion("chinese_country_name is not null");
            return (Criteria) this;
        }

        public Criteria andChineseCountryNameEqualTo(String value) {
            addCriterion("chinese_country_name =", value, "chineseCountryName");
            return (Criteria) this;
        }

        public Criteria andChineseCountryNameNotEqualTo(String value) {
            addCriterion("chinese_country_name <>", value, "chineseCountryName");
            return (Criteria) this;
        }

        public Criteria andChineseCountryNameGreaterThan(String value) {
            addCriterion("chinese_country_name >", value, "chineseCountryName");
            return (Criteria) this;
        }

        public Criteria andChineseCountryNameGreaterThanOrEqualTo(String value) {
            addCriterion("chinese_country_name >=", value, "chineseCountryName");
            return (Criteria) this;
        }

        public Criteria andChineseCountryNameLessThan(String value) {
            addCriterion("chinese_country_name <", value, "chineseCountryName");
            return (Criteria) this;
        }

        public Criteria andChineseCountryNameLessThanOrEqualTo(String value) {
            addCriterion("chinese_country_name <=", value, "chineseCountryName");
            return (Criteria) this;
        }

        public Criteria andChineseCountryNameLike(String value) {
            addCriterion("chinese_country_name like", value, "chineseCountryName");
            return (Criteria) this;
        }

        public Criteria andChineseCountryNameNotLike(String value) {
            addCriterion("chinese_country_name not like", value, "chineseCountryName");
            return (Criteria) this;
        }

        public Criteria andChineseCountryNameIn(List<String> values) {
            addCriterion("chinese_country_name in", values, "chineseCountryName");
            return (Criteria) this;
        }

        public Criteria andChineseCountryNameNotIn(List<String> values) {
            addCriterion("chinese_country_name not in", values, "chineseCountryName");
            return (Criteria) this;
        }

        public Criteria andChineseCountryNameBetween(String value1, String value2) {
            addCriterion("chinese_country_name between", value1, value2, "chineseCountryName");
            return (Criteria) this;
        }

        public Criteria andChineseCountryNameNotBetween(String value1, String value2) {
            addCriterion("chinese_country_name not between", value1, value2, "chineseCountryName");
            return (Criteria) this;
        }

        public Criteria andEnglishCountryNameIsNull() {
            addCriterion("english_country_name is null");
            return (Criteria) this;
        }

        public Criteria andEnglishCountryNameIsNotNull() {
            addCriterion("english_country_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnglishCountryNameEqualTo(String value) {
            addCriterion("english_country_name =", value, "englishCountryName");
            return (Criteria) this;
        }

        public Criteria andEnglishCountryNameNotEqualTo(String value) {
            addCriterion("english_country_name <>", value, "englishCountryName");
            return (Criteria) this;
        }

        public Criteria andEnglishCountryNameGreaterThan(String value) {
            addCriterion("english_country_name >", value, "englishCountryName");
            return (Criteria) this;
        }

        public Criteria andEnglishCountryNameGreaterThanOrEqualTo(String value) {
            addCriterion("english_country_name >=", value, "englishCountryName");
            return (Criteria) this;
        }

        public Criteria andEnglishCountryNameLessThan(String value) {
            addCriterion("english_country_name <", value, "englishCountryName");
            return (Criteria) this;
        }

        public Criteria andEnglishCountryNameLessThanOrEqualTo(String value) {
            addCriterion("english_country_name <=", value, "englishCountryName");
            return (Criteria) this;
        }

        public Criteria andEnglishCountryNameLike(String value) {
            addCriterion("english_country_name like", value, "englishCountryName");
            return (Criteria) this;
        }

        public Criteria andEnglishCountryNameNotLike(String value) {
            addCriterion("english_country_name not like", value, "englishCountryName");
            return (Criteria) this;
        }

        public Criteria andEnglishCountryNameIn(List<String> values) {
            addCriterion("english_country_name in", values, "englishCountryName");
            return (Criteria) this;
        }

        public Criteria andEnglishCountryNameNotIn(List<String> values) {
            addCriterion("english_country_name not in", values, "englishCountryName");
            return (Criteria) this;
        }

        public Criteria andEnglishCountryNameBetween(String value1, String value2) {
            addCriterion("english_country_name between", value1, value2, "englishCountryName");
            return (Criteria) this;
        }

        public Criteria andEnglishCountryNameNotBetween(String value1, String value2) {
            addCriterion("english_country_name not between", value1, value2, "englishCountryName");
            return (Criteria) this;
        }

        public Criteria andStateCodeIsNull() {
            addCriterion("state_code is null");
            return (Criteria) this;
        }

        public Criteria andStateCodeIsNotNull() {
            addCriterion("state_code is not null");
            return (Criteria) this;
        }

        public Criteria andStateCodeEqualTo(String value) {
            addCriterion("state_code =", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeNotEqualTo(String value) {
            addCriterion("state_code <>", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeGreaterThan(String value) {
            addCriterion("state_code >", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeGreaterThanOrEqualTo(String value) {
            addCriterion("state_code >=", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeLessThan(String value) {
            addCriterion("state_code <", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeLessThanOrEqualTo(String value) {
            addCriterion("state_code <=", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeLike(String value) {
            addCriterion("state_code like", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeNotLike(String value) {
            addCriterion("state_code not like", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeIn(List<String> values) {
            addCriterion("state_code in", values, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeNotIn(List<String> values) {
            addCriterion("state_code not in", values, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeBetween(String value1, String value2) {
            addCriterion("state_code between", value1, value2, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeNotBetween(String value1, String value2) {
            addCriterion("state_code not between", value1, value2, "stateCode");
            return (Criteria) this;
        }

        public Criteria andChineseStateNameIsNull() {
            addCriterion("chinese_state_name is null");
            return (Criteria) this;
        }

        public Criteria andChineseStateNameIsNotNull() {
            addCriterion("chinese_state_name is not null");
            return (Criteria) this;
        }

        public Criteria andChineseStateNameEqualTo(String value) {
            addCriterion("chinese_state_name =", value, "chineseStateName");
            return (Criteria) this;
        }

        public Criteria andChineseStateNameNotEqualTo(String value) {
            addCriterion("chinese_state_name <>", value, "chineseStateName");
            return (Criteria) this;
        }

        public Criteria andChineseStateNameGreaterThan(String value) {
            addCriterion("chinese_state_name >", value, "chineseStateName");
            return (Criteria) this;
        }

        public Criteria andChineseStateNameGreaterThanOrEqualTo(String value) {
            addCriterion("chinese_state_name >=", value, "chineseStateName");
            return (Criteria) this;
        }

        public Criteria andChineseStateNameLessThan(String value) {
            addCriterion("chinese_state_name <", value, "chineseStateName");
            return (Criteria) this;
        }

        public Criteria andChineseStateNameLessThanOrEqualTo(String value) {
            addCriterion("chinese_state_name <=", value, "chineseStateName");
            return (Criteria) this;
        }

        public Criteria andChineseStateNameLike(String value) {
            addCriterion("chinese_state_name like", value, "chineseStateName");
            return (Criteria) this;
        }

        public Criteria andChineseStateNameNotLike(String value) {
            addCriterion("chinese_state_name not like", value, "chineseStateName");
            return (Criteria) this;
        }

        public Criteria andChineseStateNameIn(List<String> values) {
            addCriterion("chinese_state_name in", values, "chineseStateName");
            return (Criteria) this;
        }

        public Criteria andChineseStateNameNotIn(List<String> values) {
            addCriterion("chinese_state_name not in", values, "chineseStateName");
            return (Criteria) this;
        }

        public Criteria andChineseStateNameBetween(String value1, String value2) {
            addCriterion("chinese_state_name between", value1, value2, "chineseStateName");
            return (Criteria) this;
        }

        public Criteria andChineseStateNameNotBetween(String value1, String value2) {
            addCriterion("chinese_state_name not between", value1, value2, "chineseStateName");
            return (Criteria) this;
        }

        public Criteria andEnglishStateNameIsNull() {
            addCriterion("english_state_name is null");
            return (Criteria) this;
        }

        public Criteria andEnglishStateNameIsNotNull() {
            addCriterion("english_state_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnglishStateNameEqualTo(String value) {
            addCriterion("english_state_name =", value, "englishStateName");
            return (Criteria) this;
        }

        public Criteria andEnglishStateNameNotEqualTo(String value) {
            addCriterion("english_state_name <>", value, "englishStateName");
            return (Criteria) this;
        }

        public Criteria andEnglishStateNameGreaterThan(String value) {
            addCriterion("english_state_name >", value, "englishStateName");
            return (Criteria) this;
        }

        public Criteria andEnglishStateNameGreaterThanOrEqualTo(String value) {
            addCriterion("english_state_name >=", value, "englishStateName");
            return (Criteria) this;
        }

        public Criteria andEnglishStateNameLessThan(String value) {
            addCriterion("english_state_name <", value, "englishStateName");
            return (Criteria) this;
        }

        public Criteria andEnglishStateNameLessThanOrEqualTo(String value) {
            addCriterion("english_state_name <=", value, "englishStateName");
            return (Criteria) this;
        }

        public Criteria andEnglishStateNameLike(String value) {
            addCriterion("english_state_name like", value, "englishStateName");
            return (Criteria) this;
        }

        public Criteria andEnglishStateNameNotLike(String value) {
            addCriterion("english_state_name not like", value, "englishStateName");
            return (Criteria) this;
        }

        public Criteria andEnglishStateNameIn(List<String> values) {
            addCriterion("english_state_name in", values, "englishStateName");
            return (Criteria) this;
        }

        public Criteria andEnglishStateNameNotIn(List<String> values) {
            addCriterion("english_state_name not in", values, "englishStateName");
            return (Criteria) this;
        }

        public Criteria andEnglishStateNameBetween(String value1, String value2) {
            addCriterion("english_state_name between", value1, value2, "englishStateName");
            return (Criteria) this;
        }

        public Criteria andEnglishStateNameNotBetween(String value1, String value2) {
            addCriterion("english_state_name not between", value1, value2, "englishStateName");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNull() {
            addCriterion("city_code is null");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNotNull() {
            addCriterion("city_code is not null");
            return (Criteria) this;
        }

        public Criteria andCityCodeEqualTo(String value) {
            addCriterion("city_code =", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotEqualTo(String value) {
            addCriterion("city_code <>", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThan(String value) {
            addCriterion("city_code >", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("city_code >=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThan(String value) {
            addCriterion("city_code <", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThanOrEqualTo(String value) {
            addCriterion("city_code <=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLike(String value) {
            addCriterion("city_code like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotLike(String value) {
            addCriterion("city_code not like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIn(List<String> values) {
            addCriterion("city_code in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotIn(List<String> values) {
            addCriterion("city_code not in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeBetween(String value1, String value2) {
            addCriterion("city_code between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotBetween(String value1, String value2) {
            addCriterion("city_code not between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andChineseCityNameIsNull() {
            addCriterion("chinese_city_name is null");
            return (Criteria) this;
        }

        public Criteria andChineseCityNameIsNotNull() {
            addCriterion("chinese_city_name is not null");
            return (Criteria) this;
        }

        public Criteria andChineseCityNameEqualTo(String value) {
            addCriterion("chinese_city_name =", value, "chineseCityName");
            return (Criteria) this;
        }

        public Criteria andChineseCityNameNotEqualTo(String value) {
            addCriterion("chinese_city_name <>", value, "chineseCityName");
            return (Criteria) this;
        }

        public Criteria andChineseCityNameGreaterThan(String value) {
            addCriterion("chinese_city_name >", value, "chineseCityName");
            return (Criteria) this;
        }

        public Criteria andChineseCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("chinese_city_name >=", value, "chineseCityName");
            return (Criteria) this;
        }

        public Criteria andChineseCityNameLessThan(String value) {
            addCriterion("chinese_city_name <", value, "chineseCityName");
            return (Criteria) this;
        }

        public Criteria andChineseCityNameLessThanOrEqualTo(String value) {
            addCriterion("chinese_city_name <=", value, "chineseCityName");
            return (Criteria) this;
        }

        public Criteria andChineseCityNameLike(String value) {
            addCriterion("chinese_city_name like", value, "chineseCityName");
            return (Criteria) this;
        }

        public Criteria andChineseCityNameNotLike(String value) {
            addCriterion("chinese_city_name not like", value, "chineseCityName");
            return (Criteria) this;
        }

        public Criteria andChineseCityNameIn(List<String> values) {
            addCriterion("chinese_city_name in", values, "chineseCityName");
            return (Criteria) this;
        }

        public Criteria andChineseCityNameNotIn(List<String> values) {
            addCriterion("chinese_city_name not in", values, "chineseCityName");
            return (Criteria) this;
        }

        public Criteria andChineseCityNameBetween(String value1, String value2) {
            addCriterion("chinese_city_name between", value1, value2, "chineseCityName");
            return (Criteria) this;
        }

        public Criteria andChineseCityNameNotBetween(String value1, String value2) {
            addCriterion("chinese_city_name not between", value1, value2, "chineseCityName");
            return (Criteria) this;
        }

        public Criteria andEnglishCityNameIsNull() {
            addCriterion("english_city_name is null");
            return (Criteria) this;
        }

        public Criteria andEnglishCityNameIsNotNull() {
            addCriterion("english_city_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnglishCityNameEqualTo(String value) {
            addCriterion("english_city_name =", value, "englishCityName");
            return (Criteria) this;
        }

        public Criteria andEnglishCityNameNotEqualTo(String value) {
            addCriterion("english_city_name <>", value, "englishCityName");
            return (Criteria) this;
        }

        public Criteria andEnglishCityNameGreaterThan(String value) {
            addCriterion("english_city_name >", value, "englishCityName");
            return (Criteria) this;
        }

        public Criteria andEnglishCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("english_city_name >=", value, "englishCityName");
            return (Criteria) this;
        }

        public Criteria andEnglishCityNameLessThan(String value) {
            addCriterion("english_city_name <", value, "englishCityName");
            return (Criteria) this;
        }

        public Criteria andEnglishCityNameLessThanOrEqualTo(String value) {
            addCriterion("english_city_name <=", value, "englishCityName");
            return (Criteria) this;
        }

        public Criteria andEnglishCityNameLike(String value) {
            addCriterion("english_city_name like", value, "englishCityName");
            return (Criteria) this;
        }

        public Criteria andEnglishCityNameNotLike(String value) {
            addCriterion("english_city_name not like", value, "englishCityName");
            return (Criteria) this;
        }

        public Criteria andEnglishCityNameIn(List<String> values) {
            addCriterion("english_city_name in", values, "englishCityName");
            return (Criteria) this;
        }

        public Criteria andEnglishCityNameNotIn(List<String> values) {
            addCriterion("english_city_name not in", values, "englishCityName");
            return (Criteria) this;
        }

        public Criteria andEnglishCityNameBetween(String value1, String value2) {
            addCriterion("english_city_name between", value1, value2, "englishCityName");
            return (Criteria) this;
        }

        public Criteria andEnglishCityNameNotBetween(String value1, String value2) {
            addCriterion("english_city_name not between", value1, value2, "englishCityName");
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