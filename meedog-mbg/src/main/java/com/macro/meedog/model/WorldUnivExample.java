package com.macro.meedog.model;

import com.macro.meedog.common.geo.GeoPoint;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WorldUnivExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorldUnivExample() {
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

        public Criteria andCountryNameIsNull() {
            addCriterion("country_name is null");
            return (Criteria) this;
        }

        public Criteria andCountryNameIsNotNull() {
            addCriterion("country_name is not null");
            return (Criteria) this;
        }

        public Criteria andCountryNameEqualTo(String value) {
            addCriterion("country_name =", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotEqualTo(String value) {
            addCriterion("country_name <>", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameGreaterThan(String value) {
            addCriterion("country_name >", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameGreaterThanOrEqualTo(String value) {
            addCriterion("country_name >=", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameLessThan(String value) {
            addCriterion("country_name <", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameLessThanOrEqualTo(String value) {
            addCriterion("country_name <=", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameLike(String value) {
            addCriterion("country_name like", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotLike(String value) {
            addCriterion("country_name not like", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameIn(List<String> values) {
            addCriterion("country_name in", values, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotIn(List<String> values) {
            addCriterion("country_name not in", values, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameBetween(String value1, String value2) {
            addCriterion("country_name between", value1, value2, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotBetween(String value1, String value2) {
            addCriterion("country_name not between", value1, value2, "countryName");
            return (Criteria) this;
        }

        public Criteria andEnCountryNameIsNull() {
            addCriterion("en_country_name is null");
            return (Criteria) this;
        }

        public Criteria andEnCountryNameIsNotNull() {
            addCriterion("en_country_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnCountryNameEqualTo(String value) {
            addCriterion("en_country_name =", value, "enCountryName");
            return (Criteria) this;
        }

        public Criteria andEnCountryNameNotEqualTo(String value) {
            addCriterion("en_country_name <>", value, "enCountryName");
            return (Criteria) this;
        }

        public Criteria andEnCountryNameGreaterThan(String value) {
            addCriterion("en_country_name >", value, "enCountryName");
            return (Criteria) this;
        }

        public Criteria andEnCountryNameGreaterThanOrEqualTo(String value) {
            addCriterion("en_country_name >=", value, "enCountryName");
            return (Criteria) this;
        }

        public Criteria andEnCountryNameLessThan(String value) {
            addCriterion("en_country_name <", value, "enCountryName");
            return (Criteria) this;
        }

        public Criteria andEnCountryNameLessThanOrEqualTo(String value) {
            addCriterion("en_country_name <=", value, "enCountryName");
            return (Criteria) this;
        }

        public Criteria andEnCountryNameLike(String value) {
            addCriterion("en_country_name like", value, "enCountryName");
            return (Criteria) this;
        }

        public Criteria andEnCountryNameNotLike(String value) {
            addCriterion("en_country_name not like", value, "enCountryName");
            return (Criteria) this;
        }

        public Criteria andEnCountryNameIn(List<String> values) {
            addCriterion("en_country_name in", values, "enCountryName");
            return (Criteria) this;
        }

        public Criteria andEnCountryNameNotIn(List<String> values) {
            addCriterion("en_country_name not in", values, "enCountryName");
            return (Criteria) this;
        }

        public Criteria andEnCountryNameBetween(String value1, String value2) {
            addCriterion("en_country_name between", value1, value2, "enCountryName");
            return (Criteria) this;
        }

        public Criteria andEnCountryNameNotBetween(String value1, String value2) {
            addCriterion("en_country_name not between", value1, value2, "enCountryName");
            return (Criteria) this;
        }

        public Criteria andCountryRankIsNull() {
            addCriterion("country_rank is null");
            return (Criteria) this;
        }

        public Criteria andCountryRankIsNotNull() {
            addCriterion("country_rank is not null");
            return (Criteria) this;
        }

        public Criteria andCountryRankEqualTo(Integer value) {
            addCriterion("country_rank =", value, "countryRank");
            return (Criteria) this;
        }

        public Criteria andCountryRankNotEqualTo(Integer value) {
            addCriterion("country_rank <>", value, "countryRank");
            return (Criteria) this;
        }

        public Criteria andCountryRankGreaterThan(Integer value) {
            addCriterion("country_rank >", value, "countryRank");
            return (Criteria) this;
        }

        public Criteria andCountryRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("country_rank >=", value, "countryRank");
            return (Criteria) this;
        }

        public Criteria andCountryRankLessThan(Integer value) {
            addCriterion("country_rank <", value, "countryRank");
            return (Criteria) this;
        }

        public Criteria andCountryRankLessThanOrEqualTo(Integer value) {
            addCriterion("country_rank <=", value, "countryRank");
            return (Criteria) this;
        }

        public Criteria andCountryRankIn(List<Integer> values) {
            addCriterion("country_rank in", values, "countryRank");
            return (Criteria) this;
        }

        public Criteria andCountryRankNotIn(List<Integer> values) {
            addCriterion("country_rank not in", values, "countryRank");
            return (Criteria) this;
        }

        public Criteria andCountryRankBetween(Integer value1, Integer value2) {
            addCriterion("country_rank between", value1, value2, "countryRank");
            return (Criteria) this;
        }

        public Criteria andCountryRankNotBetween(Integer value1, Integer value2) {
            addCriterion("country_rank not between", value1, value2, "countryRank");
            return (Criteria) this;
        }

        public Criteria andWorldRankIsNull() {
            addCriterion("world_rank is null");
            return (Criteria) this;
        }

        public Criteria andWorldRankIsNotNull() {
            addCriterion("world_rank is not null");
            return (Criteria) this;
        }

        public Criteria andWorldRankEqualTo(Integer value) {
            addCriterion("world_rank =", value, "worldRank");
            return (Criteria) this;
        }

        public Criteria andWorldRankNotEqualTo(Integer value) {
            addCriterion("world_rank <>", value, "worldRank");
            return (Criteria) this;
        }

        public Criteria andWorldRankGreaterThan(Integer value) {
            addCriterion("world_rank >", value, "worldRank");
            return (Criteria) this;
        }

        public Criteria andWorldRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("world_rank >=", value, "worldRank");
            return (Criteria) this;
        }

        public Criteria andWorldRankLessThan(Integer value) {
            addCriterion("world_rank <", value, "worldRank");
            return (Criteria) this;
        }

        public Criteria andWorldRankLessThanOrEqualTo(Integer value) {
            addCriterion("world_rank <=", value, "worldRank");
            return (Criteria) this;
        }

        public Criteria andWorldRankIn(List<Integer> values) {
            addCriterion("world_rank in", values, "worldRank");
            return (Criteria) this;
        }

        public Criteria andWorldRankNotIn(List<Integer> values) {
            addCriterion("world_rank not in", values, "worldRank");
            return (Criteria) this;
        }

        public Criteria andWorldRankBetween(Integer value1, Integer value2) {
            addCriterion("world_rank between", value1, value2, "worldRank");
            return (Criteria) this;
        }

        public Criteria andWorldRankNotBetween(Integer value1, Integer value2) {
            addCriterion("world_rank not between", value1, value2, "worldRank");
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

        public Criteria andAlterEnglishNameIsNull() {
            addCriterion("alter_english_name is null");
            return (Criteria) this;
        }

        public Criteria andAlterEnglishNameIsNotNull() {
            addCriterion("alter_english_name is not null");
            return (Criteria) this;
        }

        public Criteria andAlterEnglishNameEqualTo(String value) {
            addCriterion("alter_english_name =", value, "alterEnglishName");
            return (Criteria) this;
        }

        public Criteria andAlterEnglishNameNotEqualTo(String value) {
            addCriterion("alter_english_name <>", value, "alterEnglishName");
            return (Criteria) this;
        }

        public Criteria andAlterEnglishNameGreaterThan(String value) {
            addCriterion("alter_english_name >", value, "alterEnglishName");
            return (Criteria) this;
        }

        public Criteria andAlterEnglishNameGreaterThanOrEqualTo(String value) {
            addCriterion("alter_english_name >=", value, "alterEnglishName");
            return (Criteria) this;
        }

        public Criteria andAlterEnglishNameLessThan(String value) {
            addCriterion("alter_english_name <", value, "alterEnglishName");
            return (Criteria) this;
        }

        public Criteria andAlterEnglishNameLessThanOrEqualTo(String value) {
            addCriterion("alter_english_name <=", value, "alterEnglishName");
            return (Criteria) this;
        }

        public Criteria andAlterEnglishNameLike(String value) {
            addCriterion("alter_english_name like", value, "alterEnglishName");
            return (Criteria) this;
        }

        public Criteria andAlterEnglishNameNotLike(String value) {
            addCriterion("alter_english_name not like", value, "alterEnglishName");
            return (Criteria) this;
        }

        public Criteria andAlterEnglishNameIn(List<String> values) {
            addCriterion("alter_english_name in", values, "alterEnglishName");
            return (Criteria) this;
        }

        public Criteria andAlterEnglishNameNotIn(List<String> values) {
            addCriterion("alter_english_name not in", values, "alterEnglishName");
            return (Criteria) this;
        }

        public Criteria andAlterEnglishNameBetween(String value1, String value2) {
            addCriterion("alter_english_name between", value1, value2, "alterEnglishName");
            return (Criteria) this;
        }

        public Criteria andAlterEnglishNameNotBetween(String value1, String value2) {
            addCriterion("alter_english_name not between", value1, value2, "alterEnglishName");
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

        public Criteria andAcronymIsNull() {
            addCriterion("acronym is null");
            return (Criteria) this;
        }

        public Criteria andAcronymIsNotNull() {
            addCriterion("acronym is not null");
            return (Criteria) this;
        }

        public Criteria andAcronymEqualTo(String value) {
            addCriterion("acronym =", value, "acronym");
            return (Criteria) this;
        }

        public Criteria andAcronymNotEqualTo(String value) {
            addCriterion("acronym <>", value, "acronym");
            return (Criteria) this;
        }

        public Criteria andAcronymGreaterThan(String value) {
            addCriterion("acronym >", value, "acronym");
            return (Criteria) this;
        }

        public Criteria andAcronymGreaterThanOrEqualTo(String value) {
            addCriterion("acronym >=", value, "acronym");
            return (Criteria) this;
        }

        public Criteria andAcronymLessThan(String value) {
            addCriterion("acronym <", value, "acronym");
            return (Criteria) this;
        }

        public Criteria andAcronymLessThanOrEqualTo(String value) {
            addCriterion("acronym <=", value, "acronym");
            return (Criteria) this;
        }

        public Criteria andAcronymLike(String value) {
            addCriterion("acronym like", value, "acronym");
            return (Criteria) this;
        }

        public Criteria andAcronymNotLike(String value) {
            addCriterion("acronym not like", value, "acronym");
            return (Criteria) this;
        }

        public Criteria andAcronymIn(List<String> values) {
            addCriterion("acronym in", values, "acronym");
            return (Criteria) this;
        }

        public Criteria andAcronymNotIn(List<String> values) {
            addCriterion("acronym not in", values, "acronym");
            return (Criteria) this;
        }

        public Criteria andAcronymBetween(String value1, String value2) {
            addCriterion("acronym between", value1, value2, "acronym");
            return (Criteria) this;
        }

        public Criteria andAcronymNotBetween(String value1, String value2) {
            addCriterion("acronym not between", value1, value2, "acronym");
            return (Criteria) this;
        }

        public Criteria andLogoIsNull() {
            addCriterion("logo is null");
            return (Criteria) this;
        }

        public Criteria andLogoIsNotNull() {
            addCriterion("logo is not null");
            return (Criteria) this;
        }

        public Criteria andLogoEqualTo(String value) {
            addCriterion("logo =", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotEqualTo(String value) {
            addCriterion("logo <>", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThan(String value) {
            addCriterion("logo >", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThanOrEqualTo(String value) {
            addCriterion("logo >=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThan(String value) {
            addCriterion("logo <", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThanOrEqualTo(String value) {
            addCriterion("logo <=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLike(String value) {
            addCriterion("logo like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotLike(String value) {
            addCriterion("logo not like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoIn(List<String> values) {
            addCriterion("logo in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotIn(List<String> values) {
            addCriterion("logo not in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoBetween(String value1, String value2) {
            addCriterion("logo between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotBetween(String value1, String value2) {
            addCriterion("logo not between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andWebsiteIsNull() {
            addCriterion("website is null");
            return (Criteria) this;
        }

        public Criteria andWebsiteIsNotNull() {
            addCriterion("website is not null");
            return (Criteria) this;
        }

        public Criteria andWebsiteEqualTo(String value) {
            addCriterion("website =", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotEqualTo(String value) {
            addCriterion("website <>", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteGreaterThan(String value) {
            addCriterion("website >", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("website >=", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLessThan(String value) {
            addCriterion("website <", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLessThanOrEqualTo(String value) {
            addCriterion("website <=", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLike(String value) {
            addCriterion("website like", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotLike(String value) {
            addCriterion("website not like", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteIn(List<String> values) {
            addCriterion("website in", values, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotIn(List<String> values) {
            addCriterion("website not in", values, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteBetween(String value1, String value2) {
            addCriterion("website between", value1, value2, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotBetween(String value1, String value2) {
            addCriterion("website not between", value1, value2, "website");
            return (Criteria) this;
        }

        public Criteria andFoundedIsNull() {
            addCriterion("founded is null");
            return (Criteria) this;
        }

        public Criteria andFoundedIsNotNull() {
            addCriterion("founded is not null");
            return (Criteria) this;
        }

        public Criteria andFoundedEqualTo(String value) {
            addCriterion("founded =", value, "founded");
            return (Criteria) this;
        }

        public Criteria andFoundedNotEqualTo(String value) {
            addCriterion("founded <>", value, "founded");
            return (Criteria) this;
        }

        public Criteria andFoundedGreaterThan(String value) {
            addCriterion("founded >", value, "founded");
            return (Criteria) this;
        }

        public Criteria andFoundedGreaterThanOrEqualTo(String value) {
            addCriterion("founded >=", value, "founded");
            return (Criteria) this;
        }

        public Criteria andFoundedLessThan(String value) {
            addCriterion("founded <", value, "founded");
            return (Criteria) this;
        }

        public Criteria andFoundedLessThanOrEqualTo(String value) {
            addCriterion("founded <=", value, "founded");
            return (Criteria) this;
        }

        public Criteria andFoundedLike(String value) {
            addCriterion("founded like", value, "founded");
            return (Criteria) this;
        }

        public Criteria andFoundedNotLike(String value) {
            addCriterion("founded not like", value, "founded");
            return (Criteria) this;
        }

        public Criteria andFoundedIn(List<String> values) {
            addCriterion("founded in", values, "founded");
            return (Criteria) this;
        }

        public Criteria andFoundedNotIn(List<String> values) {
            addCriterion("founded not in", values, "founded");
            return (Criteria) this;
        }

        public Criteria andFoundedBetween(String value1, String value2) {
            addCriterion("founded between", value1, value2, "founded");
            return (Criteria) this;
        }

        public Criteria andFoundedNotBetween(String value1, String value2) {
            addCriterion("founded not between", value1, value2, "founded");
            return (Criteria) this;
        }

        public Criteria andMottoIsNull() {
            addCriterion("motto is null");
            return (Criteria) this;
        }

        public Criteria andMottoIsNotNull() {
            addCriterion("motto is not null");
            return (Criteria) this;
        }

        public Criteria andMottoEqualTo(String value) {
            addCriterion("motto =", value, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoNotEqualTo(String value) {
            addCriterion("motto <>", value, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoGreaterThan(String value) {
            addCriterion("motto >", value, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoGreaterThanOrEqualTo(String value) {
            addCriterion("motto >=", value, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoLessThan(String value) {
            addCriterion("motto <", value, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoLessThanOrEqualTo(String value) {
            addCriterion("motto <=", value, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoLike(String value) {
            addCriterion("motto like", value, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoNotLike(String value) {
            addCriterion("motto not like", value, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoIn(List<String> values) {
            addCriterion("motto in", values, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoNotIn(List<String> values) {
            addCriterion("motto not in", values, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoBetween(String value1, String value2) {
            addCriterion("motto between", value1, value2, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoNotBetween(String value1, String value2) {
            addCriterion("motto not between", value1, value2, "motto");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNull() {
            addCriterion("introduction is null");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNotNull() {
            addCriterion("introduction is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductionEqualTo(String value) {
            addCriterion("introduction =", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotEqualTo(String value) {
            addCriterion("introduction <>", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThan(String value) {
            addCriterion("introduction >", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("introduction >=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThan(String value) {
            addCriterion("introduction <", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThanOrEqualTo(String value) {
            addCriterion("introduction <=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLike(String value) {
            addCriterion("introduction like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotLike(String value) {
            addCriterion("introduction not like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionIn(List<String> values) {
            addCriterion("introduction in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotIn(List<String> values) {
            addCriterion("introduction not in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionBetween(String value1, String value2) {
            addCriterion("introduction between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotBetween(String value1, String value2) {
            addCriterion("introduction not between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNull() {
            addCriterion("postcode is null");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNotNull() {
            addCriterion("postcode is not null");
            return (Criteria) this;
        }

        public Criteria andPostcodeEqualTo(String value) {
            addCriterion("postcode =", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotEqualTo(String value) {
            addCriterion("postcode <>", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThan(String value) {
            addCriterion("postcode >", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("postcode >=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThan(String value) {
            addCriterion("postcode <", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThanOrEqualTo(String value) {
            addCriterion("postcode <=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLike(String value) {
            addCriterion("postcode like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotLike(String value) {
            addCriterion("postcode not like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeIn(List<String> values) {
            addCriterion("postcode in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotIn(List<String> values) {
            addCriterion("postcode not in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeBetween(String value1, String value2) {
            addCriterion("postcode between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotBetween(String value1, String value2) {
            addCriterion("postcode not between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("fax is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("fax is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("fax =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("fax <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("fax >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("fax >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("fax <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("fax <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("fax like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("fax not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("fax in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("fax not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("fax between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("fax not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andIs211IsNull() {
            addCriterion("is211 is null");
            return (Criteria) this;
        }

        public Criteria andIs211IsNotNull() {
            addCriterion("is211 is not null");
            return (Criteria) this;
        }

        public Criteria andIs211EqualTo(Integer value) {
            addCriterion("is211 =", value, "is211");
            return (Criteria) this;
        }

        public Criteria andIs211NotEqualTo(Integer value) {
            addCriterion("is211 <>", value, "is211");
            return (Criteria) this;
        }

        public Criteria andIs211GreaterThan(Integer value) {
            addCriterion("is211 >", value, "is211");
            return (Criteria) this;
        }

        public Criteria andIs211GreaterThanOrEqualTo(Integer value) {
            addCriterion("is211 >=", value, "is211");
            return (Criteria) this;
        }

        public Criteria andIs211LessThan(Integer value) {
            addCriterion("is211 <", value, "is211");
            return (Criteria) this;
        }

        public Criteria andIs211LessThanOrEqualTo(Integer value) {
            addCriterion("is211 <=", value, "is211");
            return (Criteria) this;
        }

        public Criteria andIs211In(List<Integer> values) {
            addCriterion("is211 in", values, "is211");
            return (Criteria) this;
        }

        public Criteria andIs211NotIn(List<Integer> values) {
            addCriterion("is211 not in", values, "is211");
            return (Criteria) this;
        }

        public Criteria andIs211Between(Integer value1, Integer value2) {
            addCriterion("is211 between", value1, value2, "is211");
            return (Criteria) this;
        }

        public Criteria andIs211NotBetween(Integer value1, Integer value2) {
            addCriterion("is211 not between", value1, value2, "is211");
            return (Criteria) this;
        }

        public Criteria andIs985IsNull() {
            addCriterion("is985 is null");
            return (Criteria) this;
        }

        public Criteria andIs985IsNotNull() {
            addCriterion("is985 is not null");
            return (Criteria) this;
        }

        public Criteria andIs985EqualTo(Integer value) {
            addCriterion("is985 =", value, "is985");
            return (Criteria) this;
        }

        public Criteria andIs985NotEqualTo(Integer value) {
            addCriterion("is985 <>", value, "is985");
            return (Criteria) this;
        }

        public Criteria andIs985GreaterThan(Integer value) {
            addCriterion("is985 >", value, "is985");
            return (Criteria) this;
        }

        public Criteria andIs985GreaterThanOrEqualTo(Integer value) {
            addCriterion("is985 >=", value, "is985");
            return (Criteria) this;
        }

        public Criteria andIs985LessThan(Integer value) {
            addCriterion("is985 <", value, "is985");
            return (Criteria) this;
        }

        public Criteria andIs985LessThanOrEqualTo(Integer value) {
            addCriterion("is985 <=", value, "is985");
            return (Criteria) this;
        }

        public Criteria andIs985In(List<Integer> values) {
            addCriterion("is985 in", values, "is985");
            return (Criteria) this;
        }

        public Criteria andIs985NotIn(List<Integer> values) {
            addCriterion("is985 not in", values, "is985");
            return (Criteria) this;
        }

        public Criteria andIs985Between(Integer value1, Integer value2) {
            addCriterion("is985 between", value1, value2, "is985");
            return (Criteria) this;
        }

        public Criteria andIs985NotBetween(Integer value1, Integer value2) {
            addCriterion("is985 not between", value1, value2, "is985");
            return (Criteria) this;
        }

        public Criteria andIndependentRecruitIsNull() {
            addCriterion("independent_recruit is null");
            return (Criteria) this;
        }

        public Criteria andIndependentRecruitIsNotNull() {
            addCriterion("independent_recruit is not null");
            return (Criteria) this;
        }

        public Criteria andIndependentRecruitEqualTo(Integer value) {
            addCriterion("independent_recruit =", value, "independentRecruit");
            return (Criteria) this;
        }

        public Criteria andIndependentRecruitNotEqualTo(Integer value) {
            addCriterion("independent_recruit <>", value, "independentRecruit");
            return (Criteria) this;
        }

        public Criteria andIndependentRecruitGreaterThan(Integer value) {
            addCriterion("independent_recruit >", value, "independentRecruit");
            return (Criteria) this;
        }

        public Criteria andIndependentRecruitGreaterThanOrEqualTo(Integer value) {
            addCriterion("independent_recruit >=", value, "independentRecruit");
            return (Criteria) this;
        }

        public Criteria andIndependentRecruitLessThan(Integer value) {
            addCriterion("independent_recruit <", value, "independentRecruit");
            return (Criteria) this;
        }

        public Criteria andIndependentRecruitLessThanOrEqualTo(Integer value) {
            addCriterion("independent_recruit <=", value, "independentRecruit");
            return (Criteria) this;
        }

        public Criteria andIndependentRecruitIn(List<Integer> values) {
            addCriterion("independent_recruit in", values, "independentRecruit");
            return (Criteria) this;
        }

        public Criteria andIndependentRecruitNotIn(List<Integer> values) {
            addCriterion("independent_recruit not in", values, "independentRecruit");
            return (Criteria) this;
        }

        public Criteria andIndependentRecruitBetween(Integer value1, Integer value2) {
            addCriterion("independent_recruit between", value1, value2, "independentRecruit");
            return (Criteria) this;
        }

        public Criteria andIndependentRecruitNotBetween(Integer value1, Integer value2) {
            addCriterion("independent_recruit not between", value1, value2, "independentRecruit");
            return (Criteria) this;
        }

        public Criteria andIsGraduateSchoolIsNull() {
            addCriterion("is_graduate_school is null");
            return (Criteria) this;
        }

        public Criteria andIsGraduateSchoolIsNotNull() {
            addCriterion("is_graduate_school is not null");
            return (Criteria) this;
        }

        public Criteria andIsGraduateSchoolEqualTo(Integer value) {
            addCriterion("is_graduate_school =", value, "isGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andIsGraduateSchoolNotEqualTo(Integer value) {
            addCriterion("is_graduate_school <>", value, "isGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andIsGraduateSchoolGreaterThan(Integer value) {
            addCriterion("is_graduate_school >", value, "isGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andIsGraduateSchoolGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_graduate_school >=", value, "isGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andIsGraduateSchoolLessThan(Integer value) {
            addCriterion("is_graduate_school <", value, "isGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andIsGraduateSchoolLessThanOrEqualTo(Integer value) {
            addCriterion("is_graduate_school <=", value, "isGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andIsGraduateSchoolIn(List<Integer> values) {
            addCriterion("is_graduate_school in", values, "isGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andIsGraduateSchoolNotIn(List<Integer> values) {
            addCriterion("is_graduate_school not in", values, "isGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andIsGraduateSchoolBetween(Integer value1, Integer value2) {
            addCriterion("is_graduate_school between", value1, value2, "isGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andIsGraduateSchoolNotBetween(Integer value1, Integer value2) {
            addCriterion("is_graduate_school not between", value1, value2, "isGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andKeyDisciplineCountIsNull() {
            addCriterion("key_discipline_count is null");
            return (Criteria) this;
        }

        public Criteria andKeyDisciplineCountIsNotNull() {
            addCriterion("key_discipline_count is not null");
            return (Criteria) this;
        }

        public Criteria andKeyDisciplineCountEqualTo(Integer value) {
            addCriterion("key_discipline_count =", value, "keyDisciplineCount");
            return (Criteria) this;
        }

        public Criteria andKeyDisciplineCountNotEqualTo(Integer value) {
            addCriterion("key_discipline_count <>", value, "keyDisciplineCount");
            return (Criteria) this;
        }

        public Criteria andKeyDisciplineCountGreaterThan(Integer value) {
            addCriterion("key_discipline_count >", value, "keyDisciplineCount");
            return (Criteria) this;
        }

        public Criteria andKeyDisciplineCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("key_discipline_count >=", value, "keyDisciplineCount");
            return (Criteria) this;
        }

        public Criteria andKeyDisciplineCountLessThan(Integer value) {
            addCriterion("key_discipline_count <", value, "keyDisciplineCount");
            return (Criteria) this;
        }

        public Criteria andKeyDisciplineCountLessThanOrEqualTo(Integer value) {
            addCriterion("key_discipline_count <=", value, "keyDisciplineCount");
            return (Criteria) this;
        }

        public Criteria andKeyDisciplineCountIn(List<Integer> values) {
            addCriterion("key_discipline_count in", values, "keyDisciplineCount");
            return (Criteria) this;
        }

        public Criteria andKeyDisciplineCountNotIn(List<Integer> values) {
            addCriterion("key_discipline_count not in", values, "keyDisciplineCount");
            return (Criteria) this;
        }

        public Criteria andKeyDisciplineCountBetween(Integer value1, Integer value2) {
            addCriterion("key_discipline_count between", value1, value2, "keyDisciplineCount");
            return (Criteria) this;
        }

        public Criteria andKeyDisciplineCountNotBetween(Integer value1, Integer value2) {
            addCriterion("key_discipline_count not between", value1, value2, "keyDisciplineCount");
            return (Criteria) this;
        }

        public Criteria andSubordinateIsNull() {
            addCriterion("subordinate is null");
            return (Criteria) this;
        }

        public Criteria andSubordinateIsNotNull() {
            addCriterion("subordinate is not null");
            return (Criteria) this;
        }

        public Criteria andSubordinateEqualTo(String value) {
            addCriterion("subordinate =", value, "subordinate");
            return (Criteria) this;
        }

        public Criteria andSubordinateNotEqualTo(String value) {
            addCriterion("subordinate <>", value, "subordinate");
            return (Criteria) this;
        }

        public Criteria andSubordinateGreaterThan(String value) {
            addCriterion("subordinate >", value, "subordinate");
            return (Criteria) this;
        }

        public Criteria andSubordinateGreaterThanOrEqualTo(String value) {
            addCriterion("subordinate >=", value, "subordinate");
            return (Criteria) this;
        }

        public Criteria andSubordinateLessThan(String value) {
            addCriterion("subordinate <", value, "subordinate");
            return (Criteria) this;
        }

        public Criteria andSubordinateLessThanOrEqualTo(String value) {
            addCriterion("subordinate <=", value, "subordinate");
            return (Criteria) this;
        }

        public Criteria andSubordinateLike(String value) {
            addCriterion("subordinate like", value, "subordinate");
            return (Criteria) this;
        }

        public Criteria andSubordinateNotLike(String value) {
            addCriterion("subordinate not like", value, "subordinate");
            return (Criteria) this;
        }

        public Criteria andSubordinateIn(List<String> values) {
            addCriterion("subordinate in", values, "subordinate");
            return (Criteria) this;
        }

        public Criteria andSubordinateNotIn(List<String> values) {
            addCriterion("subordinate not in", values, "subordinate");
            return (Criteria) this;
        }

        public Criteria andSubordinateBetween(String value1, String value2) {
            addCriterion("subordinate between", value1, value2, "subordinate");
            return (Criteria) this;
        }

        public Criteria andSubordinateNotBetween(String value1, String value2) {
            addCriterion("subordinate not between", value1, value2, "subordinate");
            return (Criteria) this;
        }

        public Criteria andDocProgramCountIsNull() {
            addCriterion("doc_program_count is null");
            return (Criteria) this;
        }

        public Criteria andDocProgramCountIsNotNull() {
            addCriterion("doc_program_count is not null");
            return (Criteria) this;
        }

        public Criteria andDocProgramCountEqualTo(Integer value) {
            addCriterion("doc_program_count =", value, "docProgramCount");
            return (Criteria) this;
        }

        public Criteria andDocProgramCountNotEqualTo(Integer value) {
            addCriterion("doc_program_count <>", value, "docProgramCount");
            return (Criteria) this;
        }

        public Criteria andDocProgramCountGreaterThan(Integer value) {
            addCriterion("doc_program_count >", value, "docProgramCount");
            return (Criteria) this;
        }

        public Criteria andDocProgramCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("doc_program_count >=", value, "docProgramCount");
            return (Criteria) this;
        }

        public Criteria andDocProgramCountLessThan(Integer value) {
            addCriterion("doc_program_count <", value, "docProgramCount");
            return (Criteria) this;
        }

        public Criteria andDocProgramCountLessThanOrEqualTo(Integer value) {
            addCriterion("doc_program_count <=", value, "docProgramCount");
            return (Criteria) this;
        }

        public Criteria andDocProgramCountIn(List<Integer> values) {
            addCriterion("doc_program_count in", values, "docProgramCount");
            return (Criteria) this;
        }

        public Criteria andDocProgramCountNotIn(List<Integer> values) {
            addCriterion("doc_program_count not in", values, "docProgramCount");
            return (Criteria) this;
        }

        public Criteria andDocProgramCountBetween(Integer value1, Integer value2) {
            addCriterion("doc_program_count between", value1, value2, "docProgramCount");
            return (Criteria) this;
        }

        public Criteria andDocProgramCountNotBetween(Integer value1, Integer value2) {
            addCriterion("doc_program_count not between", value1, value2, "docProgramCount");
            return (Criteria) this;
        }

        public Criteria andMasterProgramCountIsNull() {
            addCriterion("master_program_count is null");
            return (Criteria) this;
        }

        public Criteria andMasterProgramCountIsNotNull() {
            addCriterion("master_program_count is not null");
            return (Criteria) this;
        }

        public Criteria andMasterProgramCountEqualTo(Integer value) {
            addCriterion("master_program_count =", value, "masterProgramCount");
            return (Criteria) this;
        }

        public Criteria andMasterProgramCountNotEqualTo(Integer value) {
            addCriterion("master_program_count <>", value, "masterProgramCount");
            return (Criteria) this;
        }

        public Criteria andMasterProgramCountGreaterThan(Integer value) {
            addCriterion("master_program_count >", value, "masterProgramCount");
            return (Criteria) this;
        }

        public Criteria andMasterProgramCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("master_program_count >=", value, "masterProgramCount");
            return (Criteria) this;
        }

        public Criteria andMasterProgramCountLessThan(Integer value) {
            addCriterion("master_program_count <", value, "masterProgramCount");
            return (Criteria) this;
        }

        public Criteria andMasterProgramCountLessThanOrEqualTo(Integer value) {
            addCriterion("master_program_count <=", value, "masterProgramCount");
            return (Criteria) this;
        }

        public Criteria andMasterProgramCountIn(List<Integer> values) {
            addCriterion("master_program_count in", values, "masterProgramCount");
            return (Criteria) this;
        }

        public Criteria andMasterProgramCountNotIn(List<Integer> values) {
            addCriterion("master_program_count not in", values, "masterProgramCount");
            return (Criteria) this;
        }

        public Criteria andMasterProgramCountBetween(Integer value1, Integer value2) {
            addCriterion("master_program_count between", value1, value2, "masterProgramCount");
            return (Criteria) this;
        }

        public Criteria andMasterProgramCountNotBetween(Integer value1, Integer value2) {
            addCriterion("master_program_count not between", value1, value2, "masterProgramCount");
            return (Criteria) this;
        }

        public Criteria andAcademicianCountIsNull() {
            addCriterion("academician_count is null");
            return (Criteria) this;
        }

        public Criteria andAcademicianCountIsNotNull() {
            addCriterion("academician_count is not null");
            return (Criteria) this;
        }

        public Criteria andAcademicianCountEqualTo(Integer value) {
            addCriterion("academician_count =", value, "academicianCount");
            return (Criteria) this;
        }

        public Criteria andAcademicianCountNotEqualTo(Integer value) {
            addCriterion("academician_count <>", value, "academicianCount");
            return (Criteria) this;
        }

        public Criteria andAcademicianCountGreaterThan(Integer value) {
            addCriterion("academician_count >", value, "academicianCount");
            return (Criteria) this;
        }

        public Criteria andAcademicianCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("academician_count >=", value, "academicianCount");
            return (Criteria) this;
        }

        public Criteria andAcademicianCountLessThan(Integer value) {
            addCriterion("academician_count <", value, "academicianCount");
            return (Criteria) this;
        }

        public Criteria andAcademicianCountLessThanOrEqualTo(Integer value) {
            addCriterion("academician_count <=", value, "academicianCount");
            return (Criteria) this;
        }

        public Criteria andAcademicianCountIn(List<Integer> values) {
            addCriterion("academician_count in", values, "academicianCount");
            return (Criteria) this;
        }

        public Criteria andAcademicianCountNotIn(List<Integer> values) {
            addCriterion("academician_count not in", values, "academicianCount");
            return (Criteria) this;
        }

        public Criteria andAcademicianCountBetween(Integer value1, Integer value2) {
            addCriterion("academician_count between", value1, value2, "academicianCount");
            return (Criteria) this;
        }

        public Criteria andAcademicianCountNotBetween(Integer value1, Integer value2) {
            addCriterion("academician_count not between", value1, value2, "academicianCount");
            return (Criteria) this;
        }

        public Criteria andRecruitPhoneIsNull() {
            addCriterion("recruit_phone is null");
            return (Criteria) this;
        }

        public Criteria andRecruitPhoneIsNotNull() {
            addCriterion("recruit_phone is not null");
            return (Criteria) this;
        }

        public Criteria andRecruitPhoneEqualTo(String value) {
            addCriterion("recruit_phone =", value, "recruitPhone");
            return (Criteria) this;
        }

        public Criteria andRecruitPhoneNotEqualTo(String value) {
            addCriterion("recruit_phone <>", value, "recruitPhone");
            return (Criteria) this;
        }

        public Criteria andRecruitPhoneGreaterThan(String value) {
            addCriterion("recruit_phone >", value, "recruitPhone");
            return (Criteria) this;
        }

        public Criteria andRecruitPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("recruit_phone >=", value, "recruitPhone");
            return (Criteria) this;
        }

        public Criteria andRecruitPhoneLessThan(String value) {
            addCriterion("recruit_phone <", value, "recruitPhone");
            return (Criteria) this;
        }

        public Criteria andRecruitPhoneLessThanOrEqualTo(String value) {
            addCriterion("recruit_phone <=", value, "recruitPhone");
            return (Criteria) this;
        }

        public Criteria andRecruitPhoneLike(String value) {
            addCriterion("recruit_phone like", value, "recruitPhone");
            return (Criteria) this;
        }

        public Criteria andRecruitPhoneNotLike(String value) {
            addCriterion("recruit_phone not like", value, "recruitPhone");
            return (Criteria) this;
        }

        public Criteria andRecruitPhoneIn(List<String> values) {
            addCriterion("recruit_phone in", values, "recruitPhone");
            return (Criteria) this;
        }

        public Criteria andRecruitPhoneNotIn(List<String> values) {
            addCriterion("recruit_phone not in", values, "recruitPhone");
            return (Criteria) this;
        }

        public Criteria andRecruitPhoneBetween(String value1, String value2) {
            addCriterion("recruit_phone between", value1, value2, "recruitPhone");
            return (Criteria) this;
        }

        public Criteria andRecruitPhoneNotBetween(String value1, String value2) {
            addCriterion("recruit_phone not between", value1, value2, "recruitPhone");
            return (Criteria) this;
        }

        public Criteria andMalePercentageIsNull() {
            addCriterion("male_percentage is null");
            return (Criteria) this;
        }

        public Criteria andMalePercentageIsNotNull() {
            addCriterion("male_percentage is not null");
            return (Criteria) this;
        }

        public Criteria andMalePercentageEqualTo(String value) {
            addCriterion("male_percentage =", value, "malePercentage");
            return (Criteria) this;
        }

        public Criteria andMalePercentageNotEqualTo(String value) {
            addCriterion("male_percentage <>", value, "malePercentage");
            return (Criteria) this;
        }

        public Criteria andMalePercentageGreaterThan(String value) {
            addCriterion("male_percentage >", value, "malePercentage");
            return (Criteria) this;
        }

        public Criteria andMalePercentageGreaterThanOrEqualTo(String value) {
            addCriterion("male_percentage >=", value, "malePercentage");
            return (Criteria) this;
        }

        public Criteria andMalePercentageLessThan(String value) {
            addCriterion("male_percentage <", value, "malePercentage");
            return (Criteria) this;
        }

        public Criteria andMalePercentageLessThanOrEqualTo(String value) {
            addCriterion("male_percentage <=", value, "malePercentage");
            return (Criteria) this;
        }

        public Criteria andMalePercentageLike(String value) {
            addCriterion("male_percentage like", value, "malePercentage");
            return (Criteria) this;
        }

        public Criteria andMalePercentageNotLike(String value) {
            addCriterion("male_percentage not like", value, "malePercentage");
            return (Criteria) this;
        }

        public Criteria andMalePercentageIn(List<String> values) {
            addCriterion("male_percentage in", values, "malePercentage");
            return (Criteria) this;
        }

        public Criteria andMalePercentageNotIn(List<String> values) {
            addCriterion("male_percentage not in", values, "malePercentage");
            return (Criteria) this;
        }

        public Criteria andMalePercentageBetween(String value1, String value2) {
            addCriterion("male_percentage between", value1, value2, "malePercentage");
            return (Criteria) this;
        }

        public Criteria andMalePercentageNotBetween(String value1, String value2) {
            addCriterion("male_percentage not between", value1, value2, "malePercentage");
            return (Criteria) this;
        }

        public Criteria andFemalePercentageIsNull() {
            addCriterion("female_percentage is null");
            return (Criteria) this;
        }

        public Criteria andFemalePercentageIsNotNull() {
            addCriterion("female_percentage is not null");
            return (Criteria) this;
        }

        public Criteria andFemalePercentageEqualTo(String value) {
            addCriterion("female_percentage =", value, "femalePercentage");
            return (Criteria) this;
        }

        public Criteria andFemalePercentageNotEqualTo(String value) {
            addCriterion("female_percentage <>", value, "femalePercentage");
            return (Criteria) this;
        }

        public Criteria andFemalePercentageGreaterThan(String value) {
            addCriterion("female_percentage >", value, "femalePercentage");
            return (Criteria) this;
        }

        public Criteria andFemalePercentageGreaterThanOrEqualTo(String value) {
            addCriterion("female_percentage >=", value, "femalePercentage");
            return (Criteria) this;
        }

        public Criteria andFemalePercentageLessThan(String value) {
            addCriterion("female_percentage <", value, "femalePercentage");
            return (Criteria) this;
        }

        public Criteria andFemalePercentageLessThanOrEqualTo(String value) {
            addCriterion("female_percentage <=", value, "femalePercentage");
            return (Criteria) this;
        }

        public Criteria andFemalePercentageLike(String value) {
            addCriterion("female_percentage like", value, "femalePercentage");
            return (Criteria) this;
        }

        public Criteria andFemalePercentageNotLike(String value) {
            addCriterion("female_percentage not like", value, "femalePercentage");
            return (Criteria) this;
        }

        public Criteria andFemalePercentageIn(List<String> values) {
            addCriterion("female_percentage in", values, "femalePercentage");
            return (Criteria) this;
        }

        public Criteria andFemalePercentageNotIn(List<String> values) {
            addCriterion("female_percentage not in", values, "femalePercentage");
            return (Criteria) this;
        }

        public Criteria andFemalePercentageBetween(String value1, String value2) {
            addCriterion("female_percentage between", value1, value2, "femalePercentage");
            return (Criteria) this;
        }

        public Criteria andFemalePercentageNotBetween(String value1, String value2) {
            addCriterion("female_percentage not between", value1, value2, "femalePercentage");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andRecruitWebsiteIsNull() {
            addCriterion("recruit_website is null");
            return (Criteria) this;
        }

        public Criteria andRecruitWebsiteIsNotNull() {
            addCriterion("recruit_website is not null");
            return (Criteria) this;
        }

        public Criteria andRecruitWebsiteEqualTo(String value) {
            addCriterion("recruit_website =", value, "recruitWebsite");
            return (Criteria) this;
        }

        public Criteria andRecruitWebsiteNotEqualTo(String value) {
            addCriterion("recruit_website <>", value, "recruitWebsite");
            return (Criteria) this;
        }

        public Criteria andRecruitWebsiteGreaterThan(String value) {
            addCriterion("recruit_website >", value, "recruitWebsite");
            return (Criteria) this;
        }

        public Criteria andRecruitWebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("recruit_website >=", value, "recruitWebsite");
            return (Criteria) this;
        }

        public Criteria andRecruitWebsiteLessThan(String value) {
            addCriterion("recruit_website <", value, "recruitWebsite");
            return (Criteria) this;
        }

        public Criteria andRecruitWebsiteLessThanOrEqualTo(String value) {
            addCriterion("recruit_website <=", value, "recruitWebsite");
            return (Criteria) this;
        }

        public Criteria andRecruitWebsiteLike(String value) {
            addCriterion("recruit_website like", value, "recruitWebsite");
            return (Criteria) this;
        }

        public Criteria andRecruitWebsiteNotLike(String value) {
            addCriterion("recruit_website not like", value, "recruitWebsite");
            return (Criteria) this;
        }

        public Criteria andRecruitWebsiteIn(List<String> values) {
            addCriterion("recruit_website in", values, "recruitWebsite");
            return (Criteria) this;
        }

        public Criteria andRecruitWebsiteNotIn(List<String> values) {
            addCriterion("recruit_website not in", values, "recruitWebsite");
            return (Criteria) this;
        }

        public Criteria andRecruitWebsiteBetween(String value1, String value2) {
            addCriterion("recruit_website between", value1, value2, "recruitWebsite");
            return (Criteria) this;
        }

        public Criteria andRecruitWebsiteNotBetween(String value1, String value2) {
            addCriterion("recruit_website not between", value1, value2, "recruitWebsite");
            return (Criteria) this;
        }

        public Criteria andRecruitAddressIsNull() {
            addCriterion("recruit_address is null");
            return (Criteria) this;
        }

        public Criteria andRecruitAddressIsNotNull() {
            addCriterion("recruit_address is not null");
            return (Criteria) this;
        }

        public Criteria andRecruitAddressEqualTo(String value) {
            addCriterion("recruit_address =", value, "recruitAddress");
            return (Criteria) this;
        }

        public Criteria andRecruitAddressNotEqualTo(String value) {
            addCriterion("recruit_address <>", value, "recruitAddress");
            return (Criteria) this;
        }

        public Criteria andRecruitAddressGreaterThan(String value) {
            addCriterion("recruit_address >", value, "recruitAddress");
            return (Criteria) this;
        }

        public Criteria andRecruitAddressGreaterThanOrEqualTo(String value) {
            addCriterion("recruit_address >=", value, "recruitAddress");
            return (Criteria) this;
        }

        public Criteria andRecruitAddressLessThan(String value) {
            addCriterion("recruit_address <", value, "recruitAddress");
            return (Criteria) this;
        }

        public Criteria andRecruitAddressLessThanOrEqualTo(String value) {
            addCriterion("recruit_address <=", value, "recruitAddress");
            return (Criteria) this;
        }

        public Criteria andRecruitAddressLike(String value) {
            addCriterion("recruit_address like", value, "recruitAddress");
            return (Criteria) this;
        }

        public Criteria andRecruitAddressNotLike(String value) {
            addCriterion("recruit_address not like", value, "recruitAddress");
            return (Criteria) this;
        }

        public Criteria andRecruitAddressIn(List<String> values) {
            addCriterion("recruit_address in", values, "recruitAddress");
            return (Criteria) this;
        }

        public Criteria andRecruitAddressNotIn(List<String> values) {
            addCriterion("recruit_address not in", values, "recruitAddress");
            return (Criteria) this;
        }

        public Criteria andRecruitAddressBetween(String value1, String value2) {
            addCriterion("recruit_address between", value1, value2, "recruitAddress");
            return (Criteria) this;
        }

        public Criteria andRecruitAddressNotBetween(String value1, String value2) {
            addCriterion("recruit_address not between", value1, value2, "recruitAddress");
            return (Criteria) this;
        }

        public Criteria andQsRankIsNull() {
            addCriterion("qs_rank is null");
            return (Criteria) this;
        }

        public Criteria andQsRankIsNotNull() {
            addCriterion("qs_rank is not null");
            return (Criteria) this;
        }

        public Criteria andQsRankEqualTo(Integer value) {
            addCriterion("qs_rank =", value, "qsRank");
            return (Criteria) this;
        }

        public Criteria andQsRankNotEqualTo(Integer value) {
            addCriterion("qs_rank <>", value, "qsRank");
            return (Criteria) this;
        }

        public Criteria andQsRankGreaterThan(Integer value) {
            addCriterion("qs_rank >", value, "qsRank");
            return (Criteria) this;
        }

        public Criteria andQsRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("qs_rank >=", value, "qsRank");
            return (Criteria) this;
        }

        public Criteria andQsRankLessThan(Integer value) {
            addCriterion("qs_rank <", value, "qsRank");
            return (Criteria) this;
        }

        public Criteria andQsRankLessThanOrEqualTo(Integer value) {
            addCriterion("qs_rank <=", value, "qsRank");
            return (Criteria) this;
        }

        public Criteria andQsRankIn(List<Integer> values) {
            addCriterion("qs_rank in", values, "qsRank");
            return (Criteria) this;
        }

        public Criteria andQsRankNotIn(List<Integer> values) {
            addCriterion("qs_rank not in", values, "qsRank");
            return (Criteria) this;
        }

        public Criteria andQsRankBetween(Integer value1, Integer value2) {
            addCriterion("qs_rank between", value1, value2, "qsRank");
            return (Criteria) this;
        }

        public Criteria andQsRankNotBetween(Integer value1, Integer value2) {
            addCriterion("qs_rank not between", value1, value2, "qsRank");
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

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andStreetAddressIsNull() {
            addCriterion("street_address is null");
            return (Criteria) this;
        }

        public Criteria andStreetAddressIsNotNull() {
            addCriterion("street_address is not null");
            return (Criteria) this;
        }

        public Criteria andStreetAddressEqualTo(String value) {
            addCriterion("street_address =", value, "streetAddress");
            return (Criteria) this;
        }

        public Criteria andStreetAddressNotEqualTo(String value) {
            addCriterion("street_address <>", value, "streetAddress");
            return (Criteria) this;
        }

        public Criteria andStreetAddressGreaterThan(String value) {
            addCriterion("street_address >", value, "streetAddress");
            return (Criteria) this;
        }

        public Criteria andStreetAddressGreaterThanOrEqualTo(String value) {
            addCriterion("street_address >=", value, "streetAddress");
            return (Criteria) this;
        }

        public Criteria andStreetAddressLessThan(String value) {
            addCriterion("street_address <", value, "streetAddress");
            return (Criteria) this;
        }

        public Criteria andStreetAddressLessThanOrEqualTo(String value) {
            addCriterion("street_address <=", value, "streetAddress");
            return (Criteria) this;
        }

        public Criteria andStreetAddressLike(String value) {
            addCriterion("street_address like", value, "streetAddress");
            return (Criteria) this;
        }

        public Criteria andStreetAddressNotLike(String value) {
            addCriterion("street_address not like", value, "streetAddress");
            return (Criteria) this;
        }

        public Criteria andStreetAddressIn(List<String> values) {
            addCriterion("street_address in", values, "streetAddress");
            return (Criteria) this;
        }

        public Criteria andStreetAddressNotIn(List<String> values) {
            addCriterion("street_address not in", values, "streetAddress");
            return (Criteria) this;
        }

        public Criteria andStreetAddressBetween(String value1, String value2) {
            addCriterion("street_address between", value1, value2, "streetAddress");
            return (Criteria) this;
        }

        public Criteria andStreetAddressNotBetween(String value1, String value2) {
            addCriterion("street_address not between", value1, value2, "streetAddress");
            return (Criteria) this;
        }

        public Criteria andAddressLocalityIsNull() {
            addCriterion("address_locality is null");
            return (Criteria) this;
        }

        public Criteria andAddressLocalityIsNotNull() {
            addCriterion("address_locality is not null");
            return (Criteria) this;
        }

        public Criteria andAddressLocalityEqualTo(String value) {
            addCriterion("address_locality =", value, "addressLocality");
            return (Criteria) this;
        }

        public Criteria andAddressLocalityNotEqualTo(String value) {
            addCriterion("address_locality <>", value, "addressLocality");
            return (Criteria) this;
        }

        public Criteria andAddressLocalityGreaterThan(String value) {
            addCriterion("address_locality >", value, "addressLocality");
            return (Criteria) this;
        }

        public Criteria andAddressLocalityGreaterThanOrEqualTo(String value) {
            addCriterion("address_locality >=", value, "addressLocality");
            return (Criteria) this;
        }

        public Criteria andAddressLocalityLessThan(String value) {
            addCriterion("address_locality <", value, "addressLocality");
            return (Criteria) this;
        }

        public Criteria andAddressLocalityLessThanOrEqualTo(String value) {
            addCriterion("address_locality <=", value, "addressLocality");
            return (Criteria) this;
        }

        public Criteria andAddressLocalityLike(String value) {
            addCriterion("address_locality like", value, "addressLocality");
            return (Criteria) this;
        }

        public Criteria andAddressLocalityNotLike(String value) {
            addCriterion("address_locality not like", value, "addressLocality");
            return (Criteria) this;
        }

        public Criteria andAddressLocalityIn(List<String> values) {
            addCriterion("address_locality in", values, "addressLocality");
            return (Criteria) this;
        }

        public Criteria andAddressLocalityNotIn(List<String> values) {
            addCriterion("address_locality not in", values, "addressLocality");
            return (Criteria) this;
        }

        public Criteria andAddressLocalityBetween(String value1, String value2) {
            addCriterion("address_locality between", value1, value2, "addressLocality");
            return (Criteria) this;
        }

        public Criteria andAddressLocalityNotBetween(String value1, String value2) {
            addCriterion("address_locality not between", value1, value2, "addressLocality");
            return (Criteria) this;
        }

        public Criteria andRegionIsNull() {
            addCriterion("region is null");
            return (Criteria) this;
        }

        public Criteria andRegionIsNotNull() {
            addCriterion("region is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(String value) {
            addCriterion("region =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(String value) {
            addCriterion("region <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(String value) {
            addCriterion("region >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(String value) {
            addCriterion("region >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(String value) {
            addCriterion("region <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(String value) {
            addCriterion("region <=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLike(String value) {
            addCriterion("region like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotLike(String value) {
            addCriterion("region not like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<String> values) {
            addCriterion("region in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<String> values) {
            addCriterion("region not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(String value1, String value2) {
            addCriterion("region between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(String value1, String value2) {
            addCriterion("region not between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIdIsNull() {
            addCriterion("region_id is null");
            return (Criteria) this;
        }

        public Criteria andRegionIdIsNotNull() {
            addCriterion("region_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegionIdEqualTo(Long value) {
            addCriterion("region_id =", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotEqualTo(Long value) {
            addCriterion("region_id <>", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdGreaterThan(Long value) {
            addCriterion("region_id >", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("region_id >=", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdLessThan(Long value) {
            addCriterion("region_id <", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdLessThanOrEqualTo(Long value) {
            addCriterion("region_id <=", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdIn(List<Long> values) {
            addCriterion("region_id in", values, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotIn(List<Long> values) {
            addCriterion("region_id not in", values, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdBetween(Long value1, Long value2) {
            addCriterion("region_id between", value1, value2, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotBetween(Long value1, Long value2) {
            addCriterion("region_id not between", value1, value2, "regionId");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(Long value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(Long value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(Long value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(Long value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(Long value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<Long> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<Long> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(Long value1, Long value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(Long value1, Long value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCrawlLinkIsNull() {
            addCriterion("crawl_link is null");
            return (Criteria) this;
        }

        public Criteria andCrawlLinkIsNotNull() {
            addCriterion("crawl_link is not null");
            return (Criteria) this;
        }

        public Criteria andCrawlLinkEqualTo(String value) {
            addCriterion("crawl_link =", value, "crawlLink");
            return (Criteria) this;
        }

        public Criteria andCrawlLinkNotEqualTo(String value) {
            addCriterion("crawl_link <>", value, "crawlLink");
            return (Criteria) this;
        }

        public Criteria andCrawlLinkGreaterThan(String value) {
            addCriterion("crawl_link >", value, "crawlLink");
            return (Criteria) this;
        }

        public Criteria andCrawlLinkGreaterThanOrEqualTo(String value) {
            addCriterion("crawl_link >=", value, "crawlLink");
            return (Criteria) this;
        }

        public Criteria andCrawlLinkLessThan(String value) {
            addCriterion("crawl_link <", value, "crawlLink");
            return (Criteria) this;
        }

        public Criteria andCrawlLinkLessThanOrEqualTo(String value) {
            addCriterion("crawl_link <=", value, "crawlLink");
            return (Criteria) this;
        }

        public Criteria andCrawlLinkLike(String value) {
            addCriterion("crawl_link like", value, "crawlLink");
            return (Criteria) this;
        }

        public Criteria andCrawlLinkNotLike(String value) {
            addCriterion("crawl_link not like", value, "crawlLink");
            return (Criteria) this;
        }

        public Criteria andCrawlLinkIn(List<String> values) {
            addCriterion("crawl_link in", values, "crawlLink");
            return (Criteria) this;
        }

        public Criteria andCrawlLinkNotIn(List<String> values) {
            addCriterion("crawl_link not in", values, "crawlLink");
            return (Criteria) this;
        }

        public Criteria andCrawlLinkBetween(String value1, String value2) {
            addCriterion("crawl_link between", value1, value2, "crawlLink");
            return (Criteria) this;
        }

        public Criteria andCrawlLinkNotBetween(String value1, String value2) {
            addCriterion("crawl_link not between", value1, value2, "crawlLink");
            return (Criteria) this;
        }

        public Criteria andLocalStudentUndergraduateIsNull() {
            addCriterion("local_student_undergraduate is null");
            return (Criteria) this;
        }

        public Criteria andLocalStudentUndergraduateIsNotNull() {
            addCriterion("local_student_undergraduate is not null");
            return (Criteria) this;
        }

        public Criteria andLocalStudentUndergraduateEqualTo(String value) {
            addCriterion("local_student_undergraduate =", value, "localStudentUndergraduate");
            return (Criteria) this;
        }

        public Criteria andLocalStudentUndergraduateNotEqualTo(String value) {
            addCriterion("local_student_undergraduate <>", value, "localStudentUndergraduate");
            return (Criteria) this;
        }

        public Criteria andLocalStudentUndergraduateGreaterThan(String value) {
            addCriterion("local_student_undergraduate >", value, "localStudentUndergraduate");
            return (Criteria) this;
        }

        public Criteria andLocalStudentUndergraduateGreaterThanOrEqualTo(String value) {
            addCriterion("local_student_undergraduate >=", value, "localStudentUndergraduate");
            return (Criteria) this;
        }

        public Criteria andLocalStudentUndergraduateLessThan(String value) {
            addCriterion("local_student_undergraduate <", value, "localStudentUndergraduate");
            return (Criteria) this;
        }

        public Criteria andLocalStudentUndergraduateLessThanOrEqualTo(String value) {
            addCriterion("local_student_undergraduate <=", value, "localStudentUndergraduate");
            return (Criteria) this;
        }

        public Criteria andLocalStudentUndergraduateLike(String value) {
            addCriterion("local_student_undergraduate like", value, "localStudentUndergraduate");
            return (Criteria) this;
        }

        public Criteria andLocalStudentUndergraduateNotLike(String value) {
            addCriterion("local_student_undergraduate not like", value, "localStudentUndergraduate");
            return (Criteria) this;
        }

        public Criteria andLocalStudentUndergraduateIn(List<String> values) {
            addCriterion("local_student_undergraduate in", values, "localStudentUndergraduate");
            return (Criteria) this;
        }

        public Criteria andLocalStudentUndergraduateNotIn(List<String> values) {
            addCriterion("local_student_undergraduate not in", values, "localStudentUndergraduate");
            return (Criteria) this;
        }

        public Criteria andLocalStudentUndergraduateBetween(String value1, String value2) {
            addCriterion("local_student_undergraduate between", value1, value2, "localStudentUndergraduate");
            return (Criteria) this;
        }

        public Criteria andLocalStudentUndergraduateNotBetween(String value1, String value2) {
            addCriterion("local_student_undergraduate not between", value1, value2, "localStudentUndergraduate");
            return (Criteria) this;
        }

        public Criteria andInterStudentUndergraduateIsNull() {
            addCriterion("inter_student_undergraduate is null");
            return (Criteria) this;
        }

        public Criteria andInterStudentUndergraduateIsNotNull() {
            addCriterion("inter_student_undergraduate is not null");
            return (Criteria) this;
        }

        public Criteria andInterStudentUndergraduateEqualTo(String value) {
            addCriterion("inter_student_undergraduate =", value, "interStudentUndergraduate");
            return (Criteria) this;
        }

        public Criteria andInterStudentUndergraduateNotEqualTo(String value) {
            addCriterion("inter_student_undergraduate <>", value, "interStudentUndergraduate");
            return (Criteria) this;
        }

        public Criteria andInterStudentUndergraduateGreaterThan(String value) {
            addCriterion("inter_student_undergraduate >", value, "interStudentUndergraduate");
            return (Criteria) this;
        }

        public Criteria andInterStudentUndergraduateGreaterThanOrEqualTo(String value) {
            addCriterion("inter_student_undergraduate >=", value, "interStudentUndergraduate");
            return (Criteria) this;
        }

        public Criteria andInterStudentUndergraduateLessThan(String value) {
            addCriterion("inter_student_undergraduate <", value, "interStudentUndergraduate");
            return (Criteria) this;
        }

        public Criteria andInterStudentUndergraduateLessThanOrEqualTo(String value) {
            addCriterion("inter_student_undergraduate <=", value, "interStudentUndergraduate");
            return (Criteria) this;
        }

        public Criteria andInterStudentUndergraduateLike(String value) {
            addCriterion("inter_student_undergraduate like", value, "interStudentUndergraduate");
            return (Criteria) this;
        }

        public Criteria andInterStudentUndergraduateNotLike(String value) {
            addCriterion("inter_student_undergraduate not like", value, "interStudentUndergraduate");
            return (Criteria) this;
        }

        public Criteria andInterStudentUndergraduateIn(List<String> values) {
            addCriterion("inter_student_undergraduate in", values, "interStudentUndergraduate");
            return (Criteria) this;
        }

        public Criteria andInterStudentUndergraduateNotIn(List<String> values) {
            addCriterion("inter_student_undergraduate not in", values, "interStudentUndergraduate");
            return (Criteria) this;
        }

        public Criteria andInterStudentUndergraduateBetween(String value1, String value2) {
            addCriterion("inter_student_undergraduate between", value1, value2, "interStudentUndergraduate");
            return (Criteria) this;
        }

        public Criteria andInterStudentUndergraduateNotBetween(String value1, String value2) {
            addCriterion("inter_student_undergraduate not between", value1, value2, "interStudentUndergraduate");
            return (Criteria) this;
        }

        public Criteria andLocalStudentPostgraduateIsNull() {
            addCriterion("local_student_postgraduate is null");
            return (Criteria) this;
        }

        public Criteria andLocalStudentPostgraduateIsNotNull() {
            addCriterion("local_student_postgraduate is not null");
            return (Criteria) this;
        }

        public Criteria andLocalStudentPostgraduateEqualTo(String value) {
            addCriterion("local_student_postgraduate =", value, "localStudentPostgraduate");
            return (Criteria) this;
        }

        public Criteria andLocalStudentPostgraduateNotEqualTo(String value) {
            addCriterion("local_student_postgraduate <>", value, "localStudentPostgraduate");
            return (Criteria) this;
        }

        public Criteria andLocalStudentPostgraduateGreaterThan(String value) {
            addCriterion("local_student_postgraduate >", value, "localStudentPostgraduate");
            return (Criteria) this;
        }

        public Criteria andLocalStudentPostgraduateGreaterThanOrEqualTo(String value) {
            addCriterion("local_student_postgraduate >=", value, "localStudentPostgraduate");
            return (Criteria) this;
        }

        public Criteria andLocalStudentPostgraduateLessThan(String value) {
            addCriterion("local_student_postgraduate <", value, "localStudentPostgraduate");
            return (Criteria) this;
        }

        public Criteria andLocalStudentPostgraduateLessThanOrEqualTo(String value) {
            addCriterion("local_student_postgraduate <=", value, "localStudentPostgraduate");
            return (Criteria) this;
        }

        public Criteria andLocalStudentPostgraduateLike(String value) {
            addCriterion("local_student_postgraduate like", value, "localStudentPostgraduate");
            return (Criteria) this;
        }

        public Criteria andLocalStudentPostgraduateNotLike(String value) {
            addCriterion("local_student_postgraduate not like", value, "localStudentPostgraduate");
            return (Criteria) this;
        }

        public Criteria andLocalStudentPostgraduateIn(List<String> values) {
            addCriterion("local_student_postgraduate in", values, "localStudentPostgraduate");
            return (Criteria) this;
        }

        public Criteria andLocalStudentPostgraduateNotIn(List<String> values) {
            addCriterion("local_student_postgraduate not in", values, "localStudentPostgraduate");
            return (Criteria) this;
        }

        public Criteria andLocalStudentPostgraduateBetween(String value1, String value2) {
            addCriterion("local_student_postgraduate between", value1, value2, "localStudentPostgraduate");
            return (Criteria) this;
        }

        public Criteria andLocalStudentPostgraduateNotBetween(String value1, String value2) {
            addCriterion("local_student_postgraduate not between", value1, value2, "localStudentPostgraduate");
            return (Criteria) this;
        }

        public Criteria andInterStudentPostgraduateIsNull() {
            addCriterion("inter_student_postgraduate is null");
            return (Criteria) this;
        }

        public Criteria andInterStudentPostgraduateIsNotNull() {
            addCriterion("inter_student_postgraduate is not null");
            return (Criteria) this;
        }

        public Criteria andInterStudentPostgraduateEqualTo(String value) {
            addCriterion("inter_student_postgraduate =", value, "interStudentPostgraduate");
            return (Criteria) this;
        }

        public Criteria andInterStudentPostgraduateNotEqualTo(String value) {
            addCriterion("inter_student_postgraduate <>", value, "interStudentPostgraduate");
            return (Criteria) this;
        }

        public Criteria andInterStudentPostgraduateGreaterThan(String value) {
            addCriterion("inter_student_postgraduate >", value, "interStudentPostgraduate");
            return (Criteria) this;
        }

        public Criteria andInterStudentPostgraduateGreaterThanOrEqualTo(String value) {
            addCriterion("inter_student_postgraduate >=", value, "interStudentPostgraduate");
            return (Criteria) this;
        }

        public Criteria andInterStudentPostgraduateLessThan(String value) {
            addCriterion("inter_student_postgraduate <", value, "interStudentPostgraduate");
            return (Criteria) this;
        }

        public Criteria andInterStudentPostgraduateLessThanOrEqualTo(String value) {
            addCriterion("inter_student_postgraduate <=", value, "interStudentPostgraduate");
            return (Criteria) this;
        }

        public Criteria andInterStudentPostgraduateLike(String value) {
            addCriterion("inter_student_postgraduate like", value, "interStudentPostgraduate");
            return (Criteria) this;
        }

        public Criteria andInterStudentPostgraduateNotLike(String value) {
            addCriterion("inter_student_postgraduate not like", value, "interStudentPostgraduate");
            return (Criteria) this;
        }

        public Criteria andInterStudentPostgraduateIn(List<String> values) {
            addCriterion("inter_student_postgraduate in", values, "interStudentPostgraduate");
            return (Criteria) this;
        }

        public Criteria andInterStudentPostgraduateNotIn(List<String> values) {
            addCriterion("inter_student_postgraduate not in", values, "interStudentPostgraduate");
            return (Criteria) this;
        }

        public Criteria andInterStudentPostgraduateBetween(String value1, String value2) {
            addCriterion("inter_student_postgraduate between", value1, value2, "interStudentPostgraduate");
            return (Criteria) this;
        }

        public Criteria andInterStudentPostgraduateNotBetween(String value1, String value2) {
            addCriterion("inter_student_postgraduate not between", value1, value2, "interStudentPostgraduate");
            return (Criteria) this;
        }

        public Criteria andStudentEnrollmentIsNull() {
            addCriterion("student_enrollment is null");
            return (Criteria) this;
        }

        public Criteria andStudentEnrollmentIsNotNull() {
            addCriterion("student_enrollment is not null");
            return (Criteria) this;
        }

        public Criteria andStudentEnrollmentEqualTo(String value) {
            addCriterion("student_enrollment =", value, "studentEnrollment");
            return (Criteria) this;
        }

        public Criteria andStudentEnrollmentNotEqualTo(String value) {
            addCriterion("student_enrollment <>", value, "studentEnrollment");
            return (Criteria) this;
        }

        public Criteria andStudentEnrollmentGreaterThan(String value) {
            addCriterion("student_enrollment >", value, "studentEnrollment");
            return (Criteria) this;
        }

        public Criteria andStudentEnrollmentGreaterThanOrEqualTo(String value) {
            addCriterion("student_enrollment >=", value, "studentEnrollment");
            return (Criteria) this;
        }

        public Criteria andStudentEnrollmentLessThan(String value) {
            addCriterion("student_enrollment <", value, "studentEnrollment");
            return (Criteria) this;
        }

        public Criteria andStudentEnrollmentLessThanOrEqualTo(String value) {
            addCriterion("student_enrollment <=", value, "studentEnrollment");
            return (Criteria) this;
        }

        public Criteria andStudentEnrollmentLike(String value) {
            addCriterion("student_enrollment like", value, "studentEnrollment");
            return (Criteria) this;
        }

        public Criteria andStudentEnrollmentNotLike(String value) {
            addCriterion("student_enrollment not like", value, "studentEnrollment");
            return (Criteria) this;
        }

        public Criteria andStudentEnrollmentIn(List<String> values) {
            addCriterion("student_enrollment in", values, "studentEnrollment");
            return (Criteria) this;
        }

        public Criteria andStudentEnrollmentNotIn(List<String> values) {
            addCriterion("student_enrollment not in", values, "studentEnrollment");
            return (Criteria) this;
        }

        public Criteria andStudentEnrollmentBetween(String value1, String value2) {
            addCriterion("student_enrollment between", value1, value2, "studentEnrollment");
            return (Criteria) this;
        }

        public Criteria andStudentEnrollmentNotBetween(String value1, String value2) {
            addCriterion("student_enrollment not between", value1, value2, "studentEnrollment");
            return (Criteria) this;
        }

        public Criteria andAcademicStaffIsNull() {
            addCriterion("academic_staff is null");
            return (Criteria) this;
        }

        public Criteria andAcademicStaffIsNotNull() {
            addCriterion("academic_staff is not null");
            return (Criteria) this;
        }

        public Criteria andAcademicStaffEqualTo(String value) {
            addCriterion("academic_staff =", value, "academicStaff");
            return (Criteria) this;
        }

        public Criteria andAcademicStaffNotEqualTo(String value) {
            addCriterion("academic_staff <>", value, "academicStaff");
            return (Criteria) this;
        }

        public Criteria andAcademicStaffGreaterThan(String value) {
            addCriterion("academic_staff >", value, "academicStaff");
            return (Criteria) this;
        }

        public Criteria andAcademicStaffGreaterThanOrEqualTo(String value) {
            addCriterion("academic_staff >=", value, "academicStaff");
            return (Criteria) this;
        }

        public Criteria andAcademicStaffLessThan(String value) {
            addCriterion("academic_staff <", value, "academicStaff");
            return (Criteria) this;
        }

        public Criteria andAcademicStaffLessThanOrEqualTo(String value) {
            addCriterion("academic_staff <=", value, "academicStaff");
            return (Criteria) this;
        }

        public Criteria andAcademicStaffLike(String value) {
            addCriterion("academic_staff like", value, "academicStaff");
            return (Criteria) this;
        }

        public Criteria andAcademicStaffNotLike(String value) {
            addCriterion("academic_staff not like", value, "academicStaff");
            return (Criteria) this;
        }

        public Criteria andAcademicStaffIn(List<String> values) {
            addCriterion("academic_staff in", values, "academicStaff");
            return (Criteria) this;
        }

        public Criteria andAcademicStaffNotIn(List<String> values) {
            addCriterion("academic_staff not in", values, "academicStaff");
            return (Criteria) this;
        }

        public Criteria andAcademicStaffBetween(String value1, String value2) {
            addCriterion("academic_staff between", value1, value2, "academicStaff");
            return (Criteria) this;
        }

        public Criteria andAcademicStaffNotBetween(String value1, String value2) {
            addCriterion("academic_staff not between", value1, value2, "academicStaff");
            return (Criteria) this;
        }

        public Criteria andAcademicTypeIsNull() {
            addCriterion("academic_type is null");
            return (Criteria) this;
        }

        public Criteria andAcademicTypeIsNotNull() {
            addCriterion("academic_type is not null");
            return (Criteria) this;
        }

        public Criteria andAcademicTypeEqualTo(String value) {
            addCriterion("academic_type =", value, "academicType");
            return (Criteria) this;
        }

        public Criteria andAcademicTypeNotEqualTo(String value) {
            addCriterion("academic_type <>", value, "academicType");
            return (Criteria) this;
        }

        public Criteria andAcademicTypeGreaterThan(String value) {
            addCriterion("academic_type >", value, "academicType");
            return (Criteria) this;
        }

        public Criteria andAcademicTypeGreaterThanOrEqualTo(String value) {
            addCriterion("academic_type >=", value, "academicType");
            return (Criteria) this;
        }

        public Criteria andAcademicTypeLessThan(String value) {
            addCriterion("academic_type <", value, "academicType");
            return (Criteria) this;
        }

        public Criteria andAcademicTypeLessThanOrEqualTo(String value) {
            addCriterion("academic_type <=", value, "academicType");
            return (Criteria) this;
        }

        public Criteria andAcademicTypeLike(String value) {
            addCriterion("academic_type like", value, "academicType");
            return (Criteria) this;
        }

        public Criteria andAcademicTypeNotLike(String value) {
            addCriterion("academic_type not like", value, "academicType");
            return (Criteria) this;
        }

        public Criteria andAcademicTypeIn(List<String> values) {
            addCriterion("academic_type in", values, "academicType");
            return (Criteria) this;
        }

        public Criteria andAcademicTypeNotIn(List<String> values) {
            addCriterion("academic_type not in", values, "academicType");
            return (Criteria) this;
        }

        public Criteria andAcademicTypeBetween(String value1, String value2) {
            addCriterion("academic_type between", value1, value2, "academicType");
            return (Criteria) this;
        }

        public Criteria andAcademicTypeNotBetween(String value1, String value2) {
            addCriterion("academic_type not between", value1, value2, "academicType");
            return (Criteria) this;
        }

        public Criteria andControlTypeIsNull() {
            addCriterion("control_type is null");
            return (Criteria) this;
        }

        public Criteria andControlTypeIsNotNull() {
            addCriterion("control_type is not null");
            return (Criteria) this;
        }

        public Criteria andControlTypeEqualTo(String value) {
            addCriterion("control_type =", value, "controlType");
            return (Criteria) this;
        }

        public Criteria andControlTypeNotEqualTo(String value) {
            addCriterion("control_type <>", value, "controlType");
            return (Criteria) this;
        }

        public Criteria andControlTypeGreaterThan(String value) {
            addCriterion("control_type >", value, "controlType");
            return (Criteria) this;
        }

        public Criteria andControlTypeGreaterThanOrEqualTo(String value) {
            addCriterion("control_type >=", value, "controlType");
            return (Criteria) this;
        }

        public Criteria andControlTypeLessThan(String value) {
            addCriterion("control_type <", value, "controlType");
            return (Criteria) this;
        }

        public Criteria andControlTypeLessThanOrEqualTo(String value) {
            addCriterion("control_type <=", value, "controlType");
            return (Criteria) this;
        }

        public Criteria andControlTypeLike(String value) {
            addCriterion("control_type like", value, "controlType");
            return (Criteria) this;
        }

        public Criteria andControlTypeNotLike(String value) {
            addCriterion("control_type not like", value, "controlType");
            return (Criteria) this;
        }

        public Criteria andControlTypeIn(List<String> values) {
            addCriterion("control_type in", values, "controlType");
            return (Criteria) this;
        }

        public Criteria andControlTypeNotIn(List<String> values) {
            addCriterion("control_type not in", values, "controlType");
            return (Criteria) this;
        }

        public Criteria andControlTypeBetween(String value1, String value2) {
            addCriterion("control_type between", value1, value2, "controlType");
            return (Criteria) this;
        }

        public Criteria andControlTypeNotBetween(String value1, String value2) {
            addCriterion("control_type not between", value1, value2, "controlType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeIsNull() {
            addCriterion("entity_type is null");
            return (Criteria) this;
        }

        public Criteria andEntityTypeIsNotNull() {
            addCriterion("entity_type is not null");
            return (Criteria) this;
        }

        public Criteria andEntityTypeEqualTo(String value) {
            addCriterion("entity_type =", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeNotEqualTo(String value) {
            addCriterion("entity_type <>", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeGreaterThan(String value) {
            addCriterion("entity_type >", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeGreaterThanOrEqualTo(String value) {
            addCriterion("entity_type >=", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeLessThan(String value) {
            addCriterion("entity_type <", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeLessThanOrEqualTo(String value) {
            addCriterion("entity_type <=", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeLike(String value) {
            addCriterion("entity_type like", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeNotLike(String value) {
            addCriterion("entity_type not like", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeIn(List<String> values) {
            addCriterion("entity_type in", values, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeNotIn(List<String> values) {
            addCriterion("entity_type not in", values, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeBetween(String value1, String value2) {
            addCriterion("entity_type between", value1, value2, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeNotBetween(String value1, String value2) {
            addCriterion("entity_type not between", value1, value2, "entityType");
            return (Criteria) this;
        }

        public Criteria andPicsIsNull() {
            addCriterion("pics is null");
            return (Criteria) this;
        }

        public Criteria andPicsIsNotNull() {
            addCriterion("pics is not null");
            return (Criteria) this;
        }

        public Criteria andPicsEqualTo(String value) {
            addCriterion("pics =", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsNotEqualTo(String value) {
            addCriterion("pics <>", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsGreaterThan(String value) {
            addCriterion("pics >", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsGreaterThanOrEqualTo(String value) {
            addCriterion("pics >=", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsLessThan(String value) {
            addCriterion("pics <", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsLessThanOrEqualTo(String value) {
            addCriterion("pics <=", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsLike(String value) {
            addCriterion("pics like", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsNotLike(String value) {
            addCriterion("pics not like", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsIn(List<String> values) {
            addCriterion("pics in", values, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsNotIn(List<String> values) {
            addCriterion("pics not in", values, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsBetween(String value1, String value2) {
            addCriterion("pics between", value1, value2, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsNotBetween(String value1, String value2) {
            addCriterion("pics not between", value1, value2, "pics");
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

        public Criteria andFbIsNull() {
            addCriterion("fb is null");
            return (Criteria) this;
        }

        public Criteria andFbIsNotNull() {
            addCriterion("fb is not null");
            return (Criteria) this;
        }

        public Criteria andFbEqualTo(String value) {
            addCriterion("fb =", value, "fb");
            return (Criteria) this;
        }

        public Criteria andFbNotEqualTo(String value) {
            addCriterion("fb <>", value, "fb");
            return (Criteria) this;
        }

        public Criteria andFbGreaterThan(String value) {
            addCriterion("fb >", value, "fb");
            return (Criteria) this;
        }

        public Criteria andFbGreaterThanOrEqualTo(String value) {
            addCriterion("fb >=", value, "fb");
            return (Criteria) this;
        }

        public Criteria andFbLessThan(String value) {
            addCriterion("fb <", value, "fb");
            return (Criteria) this;
        }

        public Criteria andFbLessThanOrEqualTo(String value) {
            addCriterion("fb <=", value, "fb");
            return (Criteria) this;
        }

        public Criteria andFbLike(String value) {
            addCriterion("fb like", value, "fb");
            return (Criteria) this;
        }

        public Criteria andFbNotLike(String value) {
            addCriterion("fb not like", value, "fb");
            return (Criteria) this;
        }

        public Criteria andFbIn(List<String> values) {
            addCriterion("fb in", values, "fb");
            return (Criteria) this;
        }

        public Criteria andFbNotIn(List<String> values) {
            addCriterion("fb not in", values, "fb");
            return (Criteria) this;
        }

        public Criteria andFbBetween(String value1, String value2) {
            addCriterion("fb between", value1, value2, "fb");
            return (Criteria) this;
        }

        public Criteria andFbNotBetween(String value1, String value2) {
            addCriterion("fb not between", value1, value2, "fb");
            return (Criteria) this;
        }

        public Criteria andFbLinkIsNull() {
            addCriterion("fb_link is null");
            return (Criteria) this;
        }

        public Criteria andFbLinkIsNotNull() {
            addCriterion("fb_link is not null");
            return (Criteria) this;
        }

        public Criteria andFbLinkEqualTo(String value) {
            addCriterion("fb_link =", value, "fbLink");
            return (Criteria) this;
        }

        public Criteria andFbLinkNotEqualTo(String value) {
            addCriterion("fb_link <>", value, "fbLink");
            return (Criteria) this;
        }

        public Criteria andFbLinkGreaterThan(String value) {
            addCriterion("fb_link >", value, "fbLink");
            return (Criteria) this;
        }

        public Criteria andFbLinkGreaterThanOrEqualTo(String value) {
            addCriterion("fb_link >=", value, "fbLink");
            return (Criteria) this;
        }

        public Criteria andFbLinkLessThan(String value) {
            addCriterion("fb_link <", value, "fbLink");
            return (Criteria) this;
        }

        public Criteria andFbLinkLessThanOrEqualTo(String value) {
            addCriterion("fb_link <=", value, "fbLink");
            return (Criteria) this;
        }

        public Criteria andFbLinkLike(String value) {
            addCriterion("fb_link like", value, "fbLink");
            return (Criteria) this;
        }

        public Criteria andFbLinkNotLike(String value) {
            addCriterion("fb_link not like", value, "fbLink");
            return (Criteria) this;
        }

        public Criteria andFbLinkIn(List<String> values) {
            addCriterion("fb_link in", values, "fbLink");
            return (Criteria) this;
        }

        public Criteria andFbLinkNotIn(List<String> values) {
            addCriterion("fb_link not in", values, "fbLink");
            return (Criteria) this;
        }

        public Criteria andFbLinkBetween(String value1, String value2) {
            addCriterion("fb_link between", value1, value2, "fbLink");
            return (Criteria) this;
        }

        public Criteria andFbLinkNotBetween(String value1, String value2) {
            addCriterion("fb_link not between", value1, value2, "fbLink");
            return (Criteria) this;
        }

        public Criteria andTwIsNull() {
            addCriterion("tw is null");
            return (Criteria) this;
        }

        public Criteria andTwIsNotNull() {
            addCriterion("tw is not null");
            return (Criteria) this;
        }

        public Criteria andTwEqualTo(String value) {
            addCriterion("tw =", value, "tw");
            return (Criteria) this;
        }

        public Criteria andTwNotEqualTo(String value) {
            addCriterion("tw <>", value, "tw");
            return (Criteria) this;
        }

        public Criteria andTwGreaterThan(String value) {
            addCriterion("tw >", value, "tw");
            return (Criteria) this;
        }

        public Criteria andTwGreaterThanOrEqualTo(String value) {
            addCriterion("tw >=", value, "tw");
            return (Criteria) this;
        }

        public Criteria andTwLessThan(String value) {
            addCriterion("tw <", value, "tw");
            return (Criteria) this;
        }

        public Criteria andTwLessThanOrEqualTo(String value) {
            addCriterion("tw <=", value, "tw");
            return (Criteria) this;
        }

        public Criteria andTwLike(String value) {
            addCriterion("tw like", value, "tw");
            return (Criteria) this;
        }

        public Criteria andTwNotLike(String value) {
            addCriterion("tw not like", value, "tw");
            return (Criteria) this;
        }

        public Criteria andTwIn(List<String> values) {
            addCriterion("tw in", values, "tw");
            return (Criteria) this;
        }

        public Criteria andTwNotIn(List<String> values) {
            addCriterion("tw not in", values, "tw");
            return (Criteria) this;
        }

        public Criteria andTwBetween(String value1, String value2) {
            addCriterion("tw between", value1, value2, "tw");
            return (Criteria) this;
        }

        public Criteria andTwNotBetween(String value1, String value2) {
            addCriterion("tw not between", value1, value2, "tw");
            return (Criteria) this;
        }

        public Criteria andTwLinkIsNull() {
            addCriterion("tw_link is null");
            return (Criteria) this;
        }

        public Criteria andTwLinkIsNotNull() {
            addCriterion("tw_link is not null");
            return (Criteria) this;
        }

        public Criteria andTwLinkEqualTo(String value) {
            addCriterion("tw_link =", value, "twLink");
            return (Criteria) this;
        }

        public Criteria andTwLinkNotEqualTo(String value) {
            addCriterion("tw_link <>", value, "twLink");
            return (Criteria) this;
        }

        public Criteria andTwLinkGreaterThan(String value) {
            addCriterion("tw_link >", value, "twLink");
            return (Criteria) this;
        }

        public Criteria andTwLinkGreaterThanOrEqualTo(String value) {
            addCriterion("tw_link >=", value, "twLink");
            return (Criteria) this;
        }

        public Criteria andTwLinkLessThan(String value) {
            addCriterion("tw_link <", value, "twLink");
            return (Criteria) this;
        }

        public Criteria andTwLinkLessThanOrEqualTo(String value) {
            addCriterion("tw_link <=", value, "twLink");
            return (Criteria) this;
        }

        public Criteria andTwLinkLike(String value) {
            addCriterion("tw_link like", value, "twLink");
            return (Criteria) this;
        }

        public Criteria andTwLinkNotLike(String value) {
            addCriterion("tw_link not like", value, "twLink");
            return (Criteria) this;
        }

        public Criteria andTwLinkIn(List<String> values) {
            addCriterion("tw_link in", values, "twLink");
            return (Criteria) this;
        }

        public Criteria andTwLinkNotIn(List<String> values) {
            addCriterion("tw_link not in", values, "twLink");
            return (Criteria) this;
        }

        public Criteria andTwLinkBetween(String value1, String value2) {
            addCriterion("tw_link between", value1, value2, "twLink");
            return (Criteria) this;
        }

        public Criteria andTwLinkNotBetween(String value1, String value2) {
            addCriterion("tw_link not between", value1, value2, "twLink");
            return (Criteria) this;
        }

        public Criteria andLnIsNull() {
            addCriterion("ln is null");
            return (Criteria) this;
        }

        public Criteria andLnIsNotNull() {
            addCriterion("ln is not null");
            return (Criteria) this;
        }

        public Criteria andLnEqualTo(String value) {
            addCriterion("ln =", value, "ln");
            return (Criteria) this;
        }

        public Criteria andLnNotEqualTo(String value) {
            addCriterion("ln <>", value, "ln");
            return (Criteria) this;
        }

        public Criteria andLnGreaterThan(String value) {
            addCriterion("ln >", value, "ln");
            return (Criteria) this;
        }

        public Criteria andLnGreaterThanOrEqualTo(String value) {
            addCriterion("ln >=", value, "ln");
            return (Criteria) this;
        }

        public Criteria andLnLessThan(String value) {
            addCriterion("ln <", value, "ln");
            return (Criteria) this;
        }

        public Criteria andLnLessThanOrEqualTo(String value) {
            addCriterion("ln <=", value, "ln");
            return (Criteria) this;
        }

        public Criteria andLnLike(String value) {
            addCriterion("ln like", value, "ln");
            return (Criteria) this;
        }

        public Criteria andLnNotLike(String value) {
            addCriterion("ln not like", value, "ln");
            return (Criteria) this;
        }

        public Criteria andLnIn(List<String> values) {
            addCriterion("ln in", values, "ln");
            return (Criteria) this;
        }

        public Criteria andLnNotIn(List<String> values) {
            addCriterion("ln not in", values, "ln");
            return (Criteria) this;
        }

        public Criteria andLnBetween(String value1, String value2) {
            addCriterion("ln between", value1, value2, "ln");
            return (Criteria) this;
        }

        public Criteria andLnNotBetween(String value1, String value2) {
            addCriterion("ln not between", value1, value2, "ln");
            return (Criteria) this;
        }

        public Criteria andLnLinkIsNull() {
            addCriterion("ln_link is null");
            return (Criteria) this;
        }

        public Criteria andLnLinkIsNotNull() {
            addCriterion("ln_link is not null");
            return (Criteria) this;
        }

        public Criteria andLnLinkEqualTo(String value) {
            addCriterion("ln_link =", value, "lnLink");
            return (Criteria) this;
        }

        public Criteria andLnLinkNotEqualTo(String value) {
            addCriterion("ln_link <>", value, "lnLink");
            return (Criteria) this;
        }

        public Criteria andLnLinkGreaterThan(String value) {
            addCriterion("ln_link >", value, "lnLink");
            return (Criteria) this;
        }

        public Criteria andLnLinkGreaterThanOrEqualTo(String value) {
            addCriterion("ln_link >=", value, "lnLink");
            return (Criteria) this;
        }

        public Criteria andLnLinkLessThan(String value) {
            addCriterion("ln_link <", value, "lnLink");
            return (Criteria) this;
        }

        public Criteria andLnLinkLessThanOrEqualTo(String value) {
            addCriterion("ln_link <=", value, "lnLink");
            return (Criteria) this;
        }

        public Criteria andLnLinkLike(String value) {
            addCriterion("ln_link like", value, "lnLink");
            return (Criteria) this;
        }

        public Criteria andLnLinkNotLike(String value) {
            addCriterion("ln_link not like", value, "lnLink");
            return (Criteria) this;
        }

        public Criteria andLnLinkIn(List<String> values) {
            addCriterion("ln_link in", values, "lnLink");
            return (Criteria) this;
        }

        public Criteria andLnLinkNotIn(List<String> values) {
            addCriterion("ln_link not in", values, "lnLink");
            return (Criteria) this;
        }

        public Criteria andLnLinkBetween(String value1, String value2) {
            addCriterion("ln_link between", value1, value2, "lnLink");
            return (Criteria) this;
        }

        public Criteria andLnLinkNotBetween(String value1, String value2) {
            addCriterion("ln_link not between", value1, value2, "lnLink");
            return (Criteria) this;
        }

        public Criteria andYtbIsNull() {
            addCriterion("ytb is null");
            return (Criteria) this;
        }

        public Criteria andYtbIsNotNull() {
            addCriterion("ytb is not null");
            return (Criteria) this;
        }

        public Criteria andYtbEqualTo(String value) {
            addCriterion("ytb =", value, "ytb");
            return (Criteria) this;
        }

        public Criteria andYtbNotEqualTo(String value) {
            addCriterion("ytb <>", value, "ytb");
            return (Criteria) this;
        }

        public Criteria andYtbGreaterThan(String value) {
            addCriterion("ytb >", value, "ytb");
            return (Criteria) this;
        }

        public Criteria andYtbGreaterThanOrEqualTo(String value) {
            addCriterion("ytb >=", value, "ytb");
            return (Criteria) this;
        }

        public Criteria andYtbLessThan(String value) {
            addCriterion("ytb <", value, "ytb");
            return (Criteria) this;
        }

        public Criteria andYtbLessThanOrEqualTo(String value) {
            addCriterion("ytb <=", value, "ytb");
            return (Criteria) this;
        }

        public Criteria andYtbLike(String value) {
            addCriterion("ytb like", value, "ytb");
            return (Criteria) this;
        }

        public Criteria andYtbNotLike(String value) {
            addCriterion("ytb not like", value, "ytb");
            return (Criteria) this;
        }

        public Criteria andYtbIn(List<String> values) {
            addCriterion("ytb in", values, "ytb");
            return (Criteria) this;
        }

        public Criteria andYtbNotIn(List<String> values) {
            addCriterion("ytb not in", values, "ytb");
            return (Criteria) this;
        }

        public Criteria andYtbBetween(String value1, String value2) {
            addCriterion("ytb between", value1, value2, "ytb");
            return (Criteria) this;
        }

        public Criteria andYtbNotBetween(String value1, String value2) {
            addCriterion("ytb not between", value1, value2, "ytb");
            return (Criteria) this;
        }

        public Criteria andYtbLinkIsNull() {
            addCriterion("ytb_link is null");
            return (Criteria) this;
        }

        public Criteria andYtbLinkIsNotNull() {
            addCriterion("ytb_link is not null");
            return (Criteria) this;
        }

        public Criteria andYtbLinkEqualTo(String value) {
            addCriterion("ytb_link =", value, "ytbLink");
            return (Criteria) this;
        }

        public Criteria andYtbLinkNotEqualTo(String value) {
            addCriterion("ytb_link <>", value, "ytbLink");
            return (Criteria) this;
        }

        public Criteria andYtbLinkGreaterThan(String value) {
            addCriterion("ytb_link >", value, "ytbLink");
            return (Criteria) this;
        }

        public Criteria andYtbLinkGreaterThanOrEqualTo(String value) {
            addCriterion("ytb_link >=", value, "ytbLink");
            return (Criteria) this;
        }

        public Criteria andYtbLinkLessThan(String value) {
            addCriterion("ytb_link <", value, "ytbLink");
            return (Criteria) this;
        }

        public Criteria andYtbLinkLessThanOrEqualTo(String value) {
            addCriterion("ytb_link <=", value, "ytbLink");
            return (Criteria) this;
        }

        public Criteria andYtbLinkLike(String value) {
            addCriterion("ytb_link like", value, "ytbLink");
            return (Criteria) this;
        }

        public Criteria andYtbLinkNotLike(String value) {
            addCriterion("ytb_link not like", value, "ytbLink");
            return (Criteria) this;
        }

        public Criteria andYtbLinkIn(List<String> values) {
            addCriterion("ytb_link in", values, "ytbLink");
            return (Criteria) this;
        }

        public Criteria andYtbLinkNotIn(List<String> values) {
            addCriterion("ytb_link not in", values, "ytbLink");
            return (Criteria) this;
        }

        public Criteria andYtbLinkBetween(String value1, String value2) {
            addCriterion("ytb_link between", value1, value2, "ytbLink");
            return (Criteria) this;
        }

        public Criteria andYtbLinkNotBetween(String value1, String value2) {
            addCriterion("ytb_link not between", value1, value2, "ytbLink");
            return (Criteria) this;
        }

        public Criteria andInsIsNull() {
            addCriterion("ins is null");
            return (Criteria) this;
        }

        public Criteria andInsIsNotNull() {
            addCriterion("ins is not null");
            return (Criteria) this;
        }

        public Criteria andInsEqualTo(String value) {
            addCriterion("ins =", value, "ins");
            return (Criteria) this;
        }

        public Criteria andInsNotEqualTo(String value) {
            addCriterion("ins <>", value, "ins");
            return (Criteria) this;
        }

        public Criteria andInsGreaterThan(String value) {
            addCriterion("ins >", value, "ins");
            return (Criteria) this;
        }

        public Criteria andInsGreaterThanOrEqualTo(String value) {
            addCriterion("ins >=", value, "ins");
            return (Criteria) this;
        }

        public Criteria andInsLessThan(String value) {
            addCriterion("ins <", value, "ins");
            return (Criteria) this;
        }

        public Criteria andInsLessThanOrEqualTo(String value) {
            addCriterion("ins <=", value, "ins");
            return (Criteria) this;
        }

        public Criteria andInsLike(String value) {
            addCriterion("ins like", value, "ins");
            return (Criteria) this;
        }

        public Criteria andInsNotLike(String value) {
            addCriterion("ins not like", value, "ins");
            return (Criteria) this;
        }

        public Criteria andInsIn(List<String> values) {
            addCriterion("ins in", values, "ins");
            return (Criteria) this;
        }

        public Criteria andInsNotIn(List<String> values) {
            addCriterion("ins not in", values, "ins");
            return (Criteria) this;
        }

        public Criteria andInsBetween(String value1, String value2) {
            addCriterion("ins between", value1, value2, "ins");
            return (Criteria) this;
        }

        public Criteria andInsNotBetween(String value1, String value2) {
            addCriterion("ins not between", value1, value2, "ins");
            return (Criteria) this;
        }

        public Criteria andInsLinkIsNull() {
            addCriterion("ins_link is null");
            return (Criteria) this;
        }

        public Criteria andInsLinkIsNotNull() {
            addCriterion("ins_link is not null");
            return (Criteria) this;
        }

        public Criteria andInsLinkEqualTo(String value) {
            addCriterion("ins_link =", value, "insLink");
            return (Criteria) this;
        }

        public Criteria andInsLinkNotEqualTo(String value) {
            addCriterion("ins_link <>", value, "insLink");
            return (Criteria) this;
        }

        public Criteria andInsLinkGreaterThan(String value) {
            addCriterion("ins_link >", value, "insLink");
            return (Criteria) this;
        }

        public Criteria andInsLinkGreaterThanOrEqualTo(String value) {
            addCriterion("ins_link >=", value, "insLink");
            return (Criteria) this;
        }

        public Criteria andInsLinkLessThan(String value) {
            addCriterion("ins_link <", value, "insLink");
            return (Criteria) this;
        }

        public Criteria andInsLinkLessThanOrEqualTo(String value) {
            addCriterion("ins_link <=", value, "insLink");
            return (Criteria) this;
        }

        public Criteria andInsLinkLike(String value) {
            addCriterion("ins_link like", value, "insLink");
            return (Criteria) this;
        }

        public Criteria andInsLinkNotLike(String value) {
            addCriterion("ins_link not like", value, "insLink");
            return (Criteria) this;
        }

        public Criteria andInsLinkIn(List<String> values) {
            addCriterion("ins_link in", values, "insLink");
            return (Criteria) this;
        }

        public Criteria andInsLinkNotIn(List<String> values) {
            addCriterion("ins_link not in", values, "insLink");
            return (Criteria) this;
        }

        public Criteria andInsLinkBetween(String value1, String value2) {
            addCriterion("ins_link between", value1, value2, "insLink");
            return (Criteria) this;
        }

        public Criteria andInsLinkNotBetween(String value1, String value2) {
            addCriterion("ins_link not between", value1, value2, "insLink");
            return (Criteria) this;
        }

        public Criteria andWikiIsNull() {
            addCriterion("wiki is null");
            return (Criteria) this;
        }

        public Criteria andWikiIsNotNull() {
            addCriterion("wiki is not null");
            return (Criteria) this;
        }

        public Criteria andWikiEqualTo(String value) {
            addCriterion("wiki =", value, "wiki");
            return (Criteria) this;
        }

        public Criteria andWikiNotEqualTo(String value) {
            addCriterion("wiki <>", value, "wiki");
            return (Criteria) this;
        }

        public Criteria andWikiGreaterThan(String value) {
            addCriterion("wiki >", value, "wiki");
            return (Criteria) this;
        }

        public Criteria andWikiGreaterThanOrEqualTo(String value) {
            addCriterion("wiki >=", value, "wiki");
            return (Criteria) this;
        }

        public Criteria andWikiLessThan(String value) {
            addCriterion("wiki <", value, "wiki");
            return (Criteria) this;
        }

        public Criteria andWikiLessThanOrEqualTo(String value) {
            addCriterion("wiki <=", value, "wiki");
            return (Criteria) this;
        }

        public Criteria andWikiLike(String value) {
            addCriterion("wiki like", value, "wiki");
            return (Criteria) this;
        }

        public Criteria andWikiNotLike(String value) {
            addCriterion("wiki not like", value, "wiki");
            return (Criteria) this;
        }

        public Criteria andWikiIn(List<String> values) {
            addCriterion("wiki in", values, "wiki");
            return (Criteria) this;
        }

        public Criteria andWikiNotIn(List<String> values) {
            addCriterion("wiki not in", values, "wiki");
            return (Criteria) this;
        }

        public Criteria andWikiBetween(String value1, String value2) {
            addCriterion("wiki between", value1, value2, "wiki");
            return (Criteria) this;
        }

        public Criteria andWikiNotBetween(String value1, String value2) {
            addCriterion("wiki not between", value1, value2, "wiki");
            return (Criteria) this;
        }

        public Criteria andWikiLinkIsNull() {
            addCriterion("wiki_link is null");
            return (Criteria) this;
        }

        public Criteria andWikiLinkIsNotNull() {
            addCriterion("wiki_link is not null");
            return (Criteria) this;
        }

        public Criteria andWikiLinkEqualTo(String value) {
            addCriterion("wiki_link =", value, "wikiLink");
            return (Criteria) this;
        }

        public Criteria andWikiLinkNotEqualTo(String value) {
            addCriterion("wiki_link <>", value, "wikiLink");
            return (Criteria) this;
        }

        public Criteria andWikiLinkGreaterThan(String value) {
            addCriterion("wiki_link >", value, "wikiLink");
            return (Criteria) this;
        }

        public Criteria andWikiLinkGreaterThanOrEqualTo(String value) {
            addCriterion("wiki_link >=", value, "wikiLink");
            return (Criteria) this;
        }

        public Criteria andWikiLinkLessThan(String value) {
            addCriterion("wiki_link <", value, "wikiLink");
            return (Criteria) this;
        }

        public Criteria andWikiLinkLessThanOrEqualTo(String value) {
            addCriterion("wiki_link <=", value, "wikiLink");
            return (Criteria) this;
        }

        public Criteria andWikiLinkLike(String value) {
            addCriterion("wiki_link like", value, "wikiLink");
            return (Criteria) this;
        }

        public Criteria andWikiLinkNotLike(String value) {
            addCriterion("wiki_link not like", value, "wikiLink");
            return (Criteria) this;
        }

        public Criteria andWikiLinkIn(List<String> values) {
            addCriterion("wiki_link in", values, "wikiLink");
            return (Criteria) this;
        }

        public Criteria andWikiLinkNotIn(List<String> values) {
            addCriterion("wiki_link not in", values, "wikiLink");
            return (Criteria) this;
        }

        public Criteria andWikiLinkBetween(String value1, String value2) {
            addCriterion("wiki_link between", value1, value2, "wikiLink");
            return (Criteria) this;
        }

        public Criteria andWikiLinkNotBetween(String value1, String value2) {
            addCriterion("wiki_link not between", value1, value2, "wikiLink");
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