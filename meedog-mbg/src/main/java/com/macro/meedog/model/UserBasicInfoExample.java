package com.macro.meedog.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserBasicInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserBasicInfoExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Long value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Long value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Long value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Long value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Long value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Long value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Long> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Long> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Long value1, Long value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Long value1, Long value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Integer value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Integer value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Integer value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Integer value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Integer value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Integer> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Integer> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Integer value1, Integer value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNull() {
            addCriterion("degree is null");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNotNull() {
            addCriterion("degree is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeEqualTo(Integer value) {
            addCriterion("degree =", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotEqualTo(Integer value) {
            addCriterion("degree <>", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThan(Integer value) {
            addCriterion("degree >", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("degree >=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThan(Integer value) {
            addCriterion("degree <", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThanOrEqualTo(Integer value) {
            addCriterion("degree <=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeIn(List<Integer> values) {
            addCriterion("degree in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotIn(List<Integer> values) {
            addCriterion("degree not in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeBetween(Integer value1, Integer value2) {
            addCriterion("degree between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotBetween(Integer value1, Integer value2) {
            addCriterion("degree not between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andPicIdIsNull() {
            addCriterion("pic_id is null");
            return (Criteria) this;
        }

        public Criteria andPicIdIsNotNull() {
            addCriterion("pic_id is not null");
            return (Criteria) this;
        }

        public Criteria andPicIdEqualTo(Long value) {
            addCriterion("pic_id =", value, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdNotEqualTo(Long value) {
            addCriterion("pic_id <>", value, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdGreaterThan(Long value) {
            addCriterion("pic_id >", value, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdGreaterThanOrEqualTo(Long value) {
            addCriterion("pic_id >=", value, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdLessThan(Long value) {
            addCriterion("pic_id <", value, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdLessThanOrEqualTo(Long value) {
            addCriterion("pic_id <=", value, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdIn(List<Long> values) {
            addCriterion("pic_id in", values, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdNotIn(List<Long> values) {
            addCriterion("pic_id not in", values, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdBetween(Long value1, Long value2) {
            addCriterion("pic_id between", value1, value2, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdNotBetween(Long value1, Long value2) {
            addCriterion("pic_id not between", value1, value2, "picId");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusIsNull() {
            addCriterion("marriage_status is null");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusIsNotNull() {
            addCriterion("marriage_status is not null");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusEqualTo(Integer value) {
            addCriterion("marriage_status =", value, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusNotEqualTo(Integer value) {
            addCriterion("marriage_status <>", value, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusGreaterThan(Integer value) {
            addCriterion("marriage_status >", value, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("marriage_status >=", value, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusLessThan(Integer value) {
            addCriterion("marriage_status <", value, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusLessThanOrEqualTo(Integer value) {
            addCriterion("marriage_status <=", value, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusIn(List<Integer> values) {
            addCriterion("marriage_status in", values, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusNotIn(List<Integer> values) {
            addCriterion("marriage_status not in", values, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusBetween(Integer value1, Integer value2) {
            addCriterion("marriage_status between", value1, value2, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("marriage_status not between", value1, value2, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andSexualOrientationIsNull() {
            addCriterion("sexual_orientation is null");
            return (Criteria) this;
        }

        public Criteria andSexualOrientationIsNotNull() {
            addCriterion("sexual_orientation is not null");
            return (Criteria) this;
        }

        public Criteria andSexualOrientationEqualTo(Integer value) {
            addCriterion("sexual_orientation =", value, "sexualOrientation");
            return (Criteria) this;
        }

        public Criteria andSexualOrientationNotEqualTo(Integer value) {
            addCriterion("sexual_orientation <>", value, "sexualOrientation");
            return (Criteria) this;
        }

        public Criteria andSexualOrientationGreaterThan(Integer value) {
            addCriterion("sexual_orientation >", value, "sexualOrientation");
            return (Criteria) this;
        }

        public Criteria andSexualOrientationGreaterThanOrEqualTo(Integer value) {
            addCriterion("sexual_orientation >=", value, "sexualOrientation");
            return (Criteria) this;
        }

        public Criteria andSexualOrientationLessThan(Integer value) {
            addCriterion("sexual_orientation <", value, "sexualOrientation");
            return (Criteria) this;
        }

        public Criteria andSexualOrientationLessThanOrEqualTo(Integer value) {
            addCriterion("sexual_orientation <=", value, "sexualOrientation");
            return (Criteria) this;
        }

        public Criteria andSexualOrientationIn(List<Integer> values) {
            addCriterion("sexual_orientation in", values, "sexualOrientation");
            return (Criteria) this;
        }

        public Criteria andSexualOrientationNotIn(List<Integer> values) {
            addCriterion("sexual_orientation not in", values, "sexualOrientation");
            return (Criteria) this;
        }

        public Criteria andSexualOrientationBetween(Integer value1, Integer value2) {
            addCriterion("sexual_orientation between", value1, value2, "sexualOrientation");
            return (Criteria) this;
        }

        public Criteria andSexualOrientationNotBetween(Integer value1, Integer value2) {
            addCriterion("sexual_orientation not between", value1, value2, "sexualOrientation");
            return (Criteria) this;
        }

        public Criteria andSexualOrientationDescIsNull() {
            addCriterion("sexual_orientation_desc is null");
            return (Criteria) this;
        }

        public Criteria andSexualOrientationDescIsNotNull() {
            addCriterion("sexual_orientation_desc is not null");
            return (Criteria) this;
        }

        public Criteria andSexualOrientationDescEqualTo(String value) {
            addCriterion("sexual_orientation_desc =", value, "sexualOrientationDesc");
            return (Criteria) this;
        }

        public Criteria andSexualOrientationDescNotEqualTo(String value) {
            addCriterion("sexual_orientation_desc <>", value, "sexualOrientationDesc");
            return (Criteria) this;
        }

        public Criteria andSexualOrientationDescGreaterThan(String value) {
            addCriterion("sexual_orientation_desc >", value, "sexualOrientationDesc");
            return (Criteria) this;
        }

        public Criteria andSexualOrientationDescGreaterThanOrEqualTo(String value) {
            addCriterion("sexual_orientation_desc >=", value, "sexualOrientationDesc");
            return (Criteria) this;
        }

        public Criteria andSexualOrientationDescLessThan(String value) {
            addCriterion("sexual_orientation_desc <", value, "sexualOrientationDesc");
            return (Criteria) this;
        }

        public Criteria andSexualOrientationDescLessThanOrEqualTo(String value) {
            addCriterion("sexual_orientation_desc <=", value, "sexualOrientationDesc");
            return (Criteria) this;
        }

        public Criteria andSexualOrientationDescLike(String value) {
            addCriterion("sexual_orientation_desc like", value, "sexualOrientationDesc");
            return (Criteria) this;
        }

        public Criteria andSexualOrientationDescNotLike(String value) {
            addCriterion("sexual_orientation_desc not like", value, "sexualOrientationDesc");
            return (Criteria) this;
        }

        public Criteria andSexualOrientationDescIn(List<String> values) {
            addCriterion("sexual_orientation_desc in", values, "sexualOrientationDesc");
            return (Criteria) this;
        }

        public Criteria andSexualOrientationDescNotIn(List<String> values) {
            addCriterion("sexual_orientation_desc not in", values, "sexualOrientationDesc");
            return (Criteria) this;
        }

        public Criteria andSexualOrientationDescBetween(String value1, String value2) {
            addCriterion("sexual_orientation_desc between", value1, value2, "sexualOrientationDesc");
            return (Criteria) this;
        }

        public Criteria andSexualOrientationDescNotBetween(String value1, String value2) {
            addCriterion("sexual_orientation_desc not between", value1, value2, "sexualOrientationDesc");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthCountryIsNull() {
            addCriterion("birth_country is null");
            return (Criteria) this;
        }

        public Criteria andBirthCountryIsNotNull() {
            addCriterion("birth_country is not null");
            return (Criteria) this;
        }

        public Criteria andBirthCountryEqualTo(String value) {
            addCriterion("birth_country =", value, "birthCountry");
            return (Criteria) this;
        }

        public Criteria andBirthCountryNotEqualTo(String value) {
            addCriterion("birth_country <>", value, "birthCountry");
            return (Criteria) this;
        }

        public Criteria andBirthCountryGreaterThan(String value) {
            addCriterion("birth_country >", value, "birthCountry");
            return (Criteria) this;
        }

        public Criteria andBirthCountryGreaterThanOrEqualTo(String value) {
            addCriterion("birth_country >=", value, "birthCountry");
            return (Criteria) this;
        }

        public Criteria andBirthCountryLessThan(String value) {
            addCriterion("birth_country <", value, "birthCountry");
            return (Criteria) this;
        }

        public Criteria andBirthCountryLessThanOrEqualTo(String value) {
            addCriterion("birth_country <=", value, "birthCountry");
            return (Criteria) this;
        }

        public Criteria andBirthCountryLike(String value) {
            addCriterion("birth_country like", value, "birthCountry");
            return (Criteria) this;
        }

        public Criteria andBirthCountryNotLike(String value) {
            addCriterion("birth_country not like", value, "birthCountry");
            return (Criteria) this;
        }

        public Criteria andBirthCountryIn(List<String> values) {
            addCriterion("birth_country in", values, "birthCountry");
            return (Criteria) this;
        }

        public Criteria andBirthCountryNotIn(List<String> values) {
            addCriterion("birth_country not in", values, "birthCountry");
            return (Criteria) this;
        }

        public Criteria andBirthCountryBetween(String value1, String value2) {
            addCriterion("birth_country between", value1, value2, "birthCountry");
            return (Criteria) this;
        }

        public Criteria andBirthCountryNotBetween(String value1, String value2) {
            addCriterion("birth_country not between", value1, value2, "birthCountry");
            return (Criteria) this;
        }

        public Criteria andBirthProvinceIsNull() {
            addCriterion("birth_province is null");
            return (Criteria) this;
        }

        public Criteria andBirthProvinceIsNotNull() {
            addCriterion("birth_province is not null");
            return (Criteria) this;
        }

        public Criteria andBirthProvinceEqualTo(String value) {
            addCriterion("birth_province =", value, "birthProvince");
            return (Criteria) this;
        }

        public Criteria andBirthProvinceNotEqualTo(String value) {
            addCriterion("birth_province <>", value, "birthProvince");
            return (Criteria) this;
        }

        public Criteria andBirthProvinceGreaterThan(String value) {
            addCriterion("birth_province >", value, "birthProvince");
            return (Criteria) this;
        }

        public Criteria andBirthProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("birth_province >=", value, "birthProvince");
            return (Criteria) this;
        }

        public Criteria andBirthProvinceLessThan(String value) {
            addCriterion("birth_province <", value, "birthProvince");
            return (Criteria) this;
        }

        public Criteria andBirthProvinceLessThanOrEqualTo(String value) {
            addCriterion("birth_province <=", value, "birthProvince");
            return (Criteria) this;
        }

        public Criteria andBirthProvinceLike(String value) {
            addCriterion("birth_province like", value, "birthProvince");
            return (Criteria) this;
        }

        public Criteria andBirthProvinceNotLike(String value) {
            addCriterion("birth_province not like", value, "birthProvince");
            return (Criteria) this;
        }

        public Criteria andBirthProvinceIn(List<String> values) {
            addCriterion("birth_province in", values, "birthProvince");
            return (Criteria) this;
        }

        public Criteria andBirthProvinceNotIn(List<String> values) {
            addCriterion("birth_province not in", values, "birthProvince");
            return (Criteria) this;
        }

        public Criteria andBirthProvinceBetween(String value1, String value2) {
            addCriterion("birth_province between", value1, value2, "birthProvince");
            return (Criteria) this;
        }

        public Criteria andBirthProvinceNotBetween(String value1, String value2) {
            addCriterion("birth_province not between", value1, value2, "birthProvince");
            return (Criteria) this;
        }

        public Criteria andBirthCityIsNull() {
            addCriterion("birth_city is null");
            return (Criteria) this;
        }

        public Criteria andBirthCityIsNotNull() {
            addCriterion("birth_city is not null");
            return (Criteria) this;
        }

        public Criteria andBirthCityEqualTo(String value) {
            addCriterion("birth_city =", value, "birthCity");
            return (Criteria) this;
        }

        public Criteria andBirthCityNotEqualTo(String value) {
            addCriterion("birth_city <>", value, "birthCity");
            return (Criteria) this;
        }

        public Criteria andBirthCityGreaterThan(String value) {
            addCriterion("birth_city >", value, "birthCity");
            return (Criteria) this;
        }

        public Criteria andBirthCityGreaterThanOrEqualTo(String value) {
            addCriterion("birth_city >=", value, "birthCity");
            return (Criteria) this;
        }

        public Criteria andBirthCityLessThan(String value) {
            addCriterion("birth_city <", value, "birthCity");
            return (Criteria) this;
        }

        public Criteria andBirthCityLessThanOrEqualTo(String value) {
            addCriterion("birth_city <=", value, "birthCity");
            return (Criteria) this;
        }

        public Criteria andBirthCityLike(String value) {
            addCriterion("birth_city like", value, "birthCity");
            return (Criteria) this;
        }

        public Criteria andBirthCityNotLike(String value) {
            addCriterion("birth_city not like", value, "birthCity");
            return (Criteria) this;
        }

        public Criteria andBirthCityIn(List<String> values) {
            addCriterion("birth_city in", values, "birthCity");
            return (Criteria) this;
        }

        public Criteria andBirthCityNotIn(List<String> values) {
            addCriterion("birth_city not in", values, "birthCity");
            return (Criteria) this;
        }

        public Criteria andBirthCityBetween(String value1, String value2) {
            addCriterion("birth_city between", value1, value2, "birthCity");
            return (Criteria) this;
        }

        public Criteria andBirthCityNotBetween(String value1, String value2) {
            addCriterion("birth_city not between", value1, value2, "birthCity");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCountryIsNull() {
            addCriterion("registered_residence_country is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCountryIsNotNull() {
            addCriterion("registered_residence_country is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCountryEqualTo(String value) {
            addCriterion("registered_residence_country =", value, "registeredResidenceCountry");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCountryNotEqualTo(String value) {
            addCriterion("registered_residence_country <>", value, "registeredResidenceCountry");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCountryGreaterThan(String value) {
            addCriterion("registered_residence_country >", value, "registeredResidenceCountry");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCountryGreaterThanOrEqualTo(String value) {
            addCriterion("registered_residence_country >=", value, "registeredResidenceCountry");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCountryLessThan(String value) {
            addCriterion("registered_residence_country <", value, "registeredResidenceCountry");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCountryLessThanOrEqualTo(String value) {
            addCriterion("registered_residence_country <=", value, "registeredResidenceCountry");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCountryLike(String value) {
            addCriterion("registered_residence_country like", value, "registeredResidenceCountry");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCountryNotLike(String value) {
            addCriterion("registered_residence_country not like", value, "registeredResidenceCountry");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCountryIn(List<String> values) {
            addCriterion("registered_residence_country in", values, "registeredResidenceCountry");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCountryNotIn(List<String> values) {
            addCriterion("registered_residence_country not in", values, "registeredResidenceCountry");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCountryBetween(String value1, String value2) {
            addCriterion("registered_residence_country between", value1, value2, "registeredResidenceCountry");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCountryNotBetween(String value1, String value2) {
            addCriterion("registered_residence_country not between", value1, value2, "registeredResidenceCountry");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceProvinceIsNull() {
            addCriterion("registered_residence_province is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceProvinceIsNotNull() {
            addCriterion("registered_residence_province is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceProvinceEqualTo(String value) {
            addCriterion("registered_residence_province =", value, "registeredResidenceProvince");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceProvinceNotEqualTo(String value) {
            addCriterion("registered_residence_province <>", value, "registeredResidenceProvince");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceProvinceGreaterThan(String value) {
            addCriterion("registered_residence_province >", value, "registeredResidenceProvince");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("registered_residence_province >=", value, "registeredResidenceProvince");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceProvinceLessThan(String value) {
            addCriterion("registered_residence_province <", value, "registeredResidenceProvince");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceProvinceLessThanOrEqualTo(String value) {
            addCriterion("registered_residence_province <=", value, "registeredResidenceProvince");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceProvinceLike(String value) {
            addCriterion("registered_residence_province like", value, "registeredResidenceProvince");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceProvinceNotLike(String value) {
            addCriterion("registered_residence_province not like", value, "registeredResidenceProvince");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceProvinceIn(List<String> values) {
            addCriterion("registered_residence_province in", values, "registeredResidenceProvince");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceProvinceNotIn(List<String> values) {
            addCriterion("registered_residence_province not in", values, "registeredResidenceProvince");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceProvinceBetween(String value1, String value2) {
            addCriterion("registered_residence_province between", value1, value2, "registeredResidenceProvince");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceProvinceNotBetween(String value1, String value2) {
            addCriterion("registered_residence_province not between", value1, value2, "registeredResidenceProvince");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCityIsNull() {
            addCriterion("registered_residence_city is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCityIsNotNull() {
            addCriterion("registered_residence_city is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCityEqualTo(String value) {
            addCriterion("registered_residence_city =", value, "registeredResidenceCity");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCityNotEqualTo(String value) {
            addCriterion("registered_residence_city <>", value, "registeredResidenceCity");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCityGreaterThan(String value) {
            addCriterion("registered_residence_city >", value, "registeredResidenceCity");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCityGreaterThanOrEqualTo(String value) {
            addCriterion("registered_residence_city >=", value, "registeredResidenceCity");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCityLessThan(String value) {
            addCriterion("registered_residence_city <", value, "registeredResidenceCity");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCityLessThanOrEqualTo(String value) {
            addCriterion("registered_residence_city <=", value, "registeredResidenceCity");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCityLike(String value) {
            addCriterion("registered_residence_city like", value, "registeredResidenceCity");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCityNotLike(String value) {
            addCriterion("registered_residence_city not like", value, "registeredResidenceCity");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCityIn(List<String> values) {
            addCriterion("registered_residence_city in", values, "registeredResidenceCity");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCityNotIn(List<String> values) {
            addCriterion("registered_residence_city not in", values, "registeredResidenceCity");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCityBetween(String value1, String value2) {
            addCriterion("registered_residence_city between", value1, value2, "registeredResidenceCity");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCityNotBetween(String value1, String value2) {
            addCriterion("registered_residence_city not between", value1, value2, "registeredResidenceCity");
            return (Criteria) this;
        }

        public Criteria andResidenceCountryIsNull() {
            addCriterion("residence_country is null");
            return (Criteria) this;
        }

        public Criteria andResidenceCountryIsNotNull() {
            addCriterion("residence_country is not null");
            return (Criteria) this;
        }

        public Criteria andResidenceCountryEqualTo(String value) {
            addCriterion("residence_country =", value, "residenceCountry");
            return (Criteria) this;
        }

        public Criteria andResidenceCountryNotEqualTo(String value) {
            addCriterion("residence_country <>", value, "residenceCountry");
            return (Criteria) this;
        }

        public Criteria andResidenceCountryGreaterThan(String value) {
            addCriterion("residence_country >", value, "residenceCountry");
            return (Criteria) this;
        }

        public Criteria andResidenceCountryGreaterThanOrEqualTo(String value) {
            addCriterion("residence_country >=", value, "residenceCountry");
            return (Criteria) this;
        }

        public Criteria andResidenceCountryLessThan(String value) {
            addCriterion("residence_country <", value, "residenceCountry");
            return (Criteria) this;
        }

        public Criteria andResidenceCountryLessThanOrEqualTo(String value) {
            addCriterion("residence_country <=", value, "residenceCountry");
            return (Criteria) this;
        }

        public Criteria andResidenceCountryLike(String value) {
            addCriterion("residence_country like", value, "residenceCountry");
            return (Criteria) this;
        }

        public Criteria andResidenceCountryNotLike(String value) {
            addCriterion("residence_country not like", value, "residenceCountry");
            return (Criteria) this;
        }

        public Criteria andResidenceCountryIn(List<String> values) {
            addCriterion("residence_country in", values, "residenceCountry");
            return (Criteria) this;
        }

        public Criteria andResidenceCountryNotIn(List<String> values) {
            addCriterion("residence_country not in", values, "residenceCountry");
            return (Criteria) this;
        }

        public Criteria andResidenceCountryBetween(String value1, String value2) {
            addCriterion("residence_country between", value1, value2, "residenceCountry");
            return (Criteria) this;
        }

        public Criteria andResidenceCountryNotBetween(String value1, String value2) {
            addCriterion("residence_country not between", value1, value2, "residenceCountry");
            return (Criteria) this;
        }

        public Criteria andResidenceProvinceIsNull() {
            addCriterion("residence_province is null");
            return (Criteria) this;
        }

        public Criteria andResidenceProvinceIsNotNull() {
            addCriterion("residence_province is not null");
            return (Criteria) this;
        }

        public Criteria andResidenceProvinceEqualTo(String value) {
            addCriterion("residence_province =", value, "residenceProvince");
            return (Criteria) this;
        }

        public Criteria andResidenceProvinceNotEqualTo(String value) {
            addCriterion("residence_province <>", value, "residenceProvince");
            return (Criteria) this;
        }

        public Criteria andResidenceProvinceGreaterThan(String value) {
            addCriterion("residence_province >", value, "residenceProvince");
            return (Criteria) this;
        }

        public Criteria andResidenceProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("residence_province >=", value, "residenceProvince");
            return (Criteria) this;
        }

        public Criteria andResidenceProvinceLessThan(String value) {
            addCriterion("residence_province <", value, "residenceProvince");
            return (Criteria) this;
        }

        public Criteria andResidenceProvinceLessThanOrEqualTo(String value) {
            addCriterion("residence_province <=", value, "residenceProvince");
            return (Criteria) this;
        }

        public Criteria andResidenceProvinceLike(String value) {
            addCriterion("residence_province like", value, "residenceProvince");
            return (Criteria) this;
        }

        public Criteria andResidenceProvinceNotLike(String value) {
            addCriterion("residence_province not like", value, "residenceProvince");
            return (Criteria) this;
        }

        public Criteria andResidenceProvinceIn(List<String> values) {
            addCriterion("residence_province in", values, "residenceProvince");
            return (Criteria) this;
        }

        public Criteria andResidenceProvinceNotIn(List<String> values) {
            addCriterion("residence_province not in", values, "residenceProvince");
            return (Criteria) this;
        }

        public Criteria andResidenceProvinceBetween(String value1, String value2) {
            addCriterion("residence_province between", value1, value2, "residenceProvince");
            return (Criteria) this;
        }

        public Criteria andResidenceProvinceNotBetween(String value1, String value2) {
            addCriterion("residence_province not between", value1, value2, "residenceProvince");
            return (Criteria) this;
        }

        public Criteria andResidenceCityIsNull() {
            addCriterion("residence_city is null");
            return (Criteria) this;
        }

        public Criteria andResidenceCityIsNotNull() {
            addCriterion("residence_city is not null");
            return (Criteria) this;
        }

        public Criteria andResidenceCityEqualTo(String value) {
            addCriterion("residence_city =", value, "residenceCity");
            return (Criteria) this;
        }

        public Criteria andResidenceCityNotEqualTo(String value) {
            addCriterion("residence_city <>", value, "residenceCity");
            return (Criteria) this;
        }

        public Criteria andResidenceCityGreaterThan(String value) {
            addCriterion("residence_city >", value, "residenceCity");
            return (Criteria) this;
        }

        public Criteria andResidenceCityGreaterThanOrEqualTo(String value) {
            addCriterion("residence_city >=", value, "residenceCity");
            return (Criteria) this;
        }

        public Criteria andResidenceCityLessThan(String value) {
            addCriterion("residence_city <", value, "residenceCity");
            return (Criteria) this;
        }

        public Criteria andResidenceCityLessThanOrEqualTo(String value) {
            addCriterion("residence_city <=", value, "residenceCity");
            return (Criteria) this;
        }

        public Criteria andResidenceCityLike(String value) {
            addCriterion("residence_city like", value, "residenceCity");
            return (Criteria) this;
        }

        public Criteria andResidenceCityNotLike(String value) {
            addCriterion("residence_city not like", value, "residenceCity");
            return (Criteria) this;
        }

        public Criteria andResidenceCityIn(List<String> values) {
            addCriterion("residence_city in", values, "residenceCity");
            return (Criteria) this;
        }

        public Criteria andResidenceCityNotIn(List<String> values) {
            addCriterion("residence_city not in", values, "residenceCity");
            return (Criteria) this;
        }

        public Criteria andResidenceCityBetween(String value1, String value2) {
            addCriterion("residence_city between", value1, value2, "residenceCity");
            return (Criteria) this;
        }

        public Criteria andResidenceCityNotBetween(String value1, String value2) {
            addCriterion("residence_city not between", value1, value2, "residenceCity");
            return (Criteria) this;
        }

        public Criteria andZodiacIsNull() {
            addCriterion("zodiac is null");
            return (Criteria) this;
        }

        public Criteria andZodiacIsNotNull() {
            addCriterion("zodiac is not null");
            return (Criteria) this;
        }

        public Criteria andZodiacEqualTo(String value) {
            addCriterion("zodiac =", value, "zodiac");
            return (Criteria) this;
        }

        public Criteria andZodiacNotEqualTo(String value) {
            addCriterion("zodiac <>", value, "zodiac");
            return (Criteria) this;
        }

        public Criteria andZodiacGreaterThan(String value) {
            addCriterion("zodiac >", value, "zodiac");
            return (Criteria) this;
        }

        public Criteria andZodiacGreaterThanOrEqualTo(String value) {
            addCriterion("zodiac >=", value, "zodiac");
            return (Criteria) this;
        }

        public Criteria andZodiacLessThan(String value) {
            addCriterion("zodiac <", value, "zodiac");
            return (Criteria) this;
        }

        public Criteria andZodiacLessThanOrEqualTo(String value) {
            addCriterion("zodiac <=", value, "zodiac");
            return (Criteria) this;
        }

        public Criteria andZodiacLike(String value) {
            addCriterion("zodiac like", value, "zodiac");
            return (Criteria) this;
        }

        public Criteria andZodiacNotLike(String value) {
            addCriterion("zodiac not like", value, "zodiac");
            return (Criteria) this;
        }

        public Criteria andZodiacIn(List<String> values) {
            addCriterion("zodiac in", values, "zodiac");
            return (Criteria) this;
        }

        public Criteria andZodiacNotIn(List<String> values) {
            addCriterion("zodiac not in", values, "zodiac");
            return (Criteria) this;
        }

        public Criteria andZodiacBetween(String value1, String value2) {
            addCriterion("zodiac between", value1, value2, "zodiac");
            return (Criteria) this;
        }

        public Criteria andZodiacNotBetween(String value1, String value2) {
            addCriterion("zodiac not between", value1, value2, "zodiac");
            return (Criteria) this;
        }

        public Criteria andConstellationIsNull() {
            addCriterion("constellation is null");
            return (Criteria) this;
        }

        public Criteria andConstellationIsNotNull() {
            addCriterion("constellation is not null");
            return (Criteria) this;
        }

        public Criteria andConstellationEqualTo(String value) {
            addCriterion("constellation =", value, "constellation");
            return (Criteria) this;
        }

        public Criteria andConstellationNotEqualTo(String value) {
            addCriterion("constellation <>", value, "constellation");
            return (Criteria) this;
        }

        public Criteria andConstellationGreaterThan(String value) {
            addCriterion("constellation >", value, "constellation");
            return (Criteria) this;
        }

        public Criteria andConstellationGreaterThanOrEqualTo(String value) {
            addCriterion("constellation >=", value, "constellation");
            return (Criteria) this;
        }

        public Criteria andConstellationLessThan(String value) {
            addCriterion("constellation <", value, "constellation");
            return (Criteria) this;
        }

        public Criteria andConstellationLessThanOrEqualTo(String value) {
            addCriterion("constellation <=", value, "constellation");
            return (Criteria) this;
        }

        public Criteria andConstellationLike(String value) {
            addCriterion("constellation like", value, "constellation");
            return (Criteria) this;
        }

        public Criteria andConstellationNotLike(String value) {
            addCriterion("constellation not like", value, "constellation");
            return (Criteria) this;
        }

        public Criteria andConstellationIn(List<String> values) {
            addCriterion("constellation in", values, "constellation");
            return (Criteria) this;
        }

        public Criteria andConstellationNotIn(List<String> values) {
            addCriterion("constellation not in", values, "constellation");
            return (Criteria) this;
        }

        public Criteria andConstellationBetween(String value1, String value2) {
            addCriterion("constellation between", value1, value2, "constellation");
            return (Criteria) this;
        }

        public Criteria andConstellationNotBetween(String value1, String value2) {
            addCriterion("constellation not between", value1, value2, "constellation");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(Integer value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(Integer value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(Integer value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(Integer value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(Integer value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<Integer> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<Integer> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(Integer value1, Integer value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Integer value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Integer value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Integer value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Integer value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Integer value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Integer> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Integer> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Integer value1, Integer value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andBmiIsNull() {
            addCriterion("bmi is null");
            return (Criteria) this;
        }

        public Criteria andBmiIsNotNull() {
            addCriterion("bmi is not null");
            return (Criteria) this;
        }

        public Criteria andBmiEqualTo(Integer value) {
            addCriterion("bmi =", value, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiNotEqualTo(Integer value) {
            addCriterion("bmi <>", value, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiGreaterThan(Integer value) {
            addCriterion("bmi >", value, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiGreaterThanOrEqualTo(Integer value) {
            addCriterion("bmi >=", value, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiLessThan(Integer value) {
            addCriterion("bmi <", value, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiLessThanOrEqualTo(Integer value) {
            addCriterion("bmi <=", value, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiIn(List<Integer> values) {
            addCriterion("bmi in", values, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiNotIn(List<Integer> values) {
            addCriterion("bmi not in", values, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiBetween(Integer value1, Integer value2) {
            addCriterion("bmi between", value1, value2, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiNotBetween(Integer value1, Integer value2) {
            addCriterion("bmi not between", value1, value2, "bmi");
            return (Criteria) this;
        }

        public Criteria andFacialAttractivenessIsNull() {
            addCriterion("facial_attractiveness is null");
            return (Criteria) this;
        }

        public Criteria andFacialAttractivenessIsNotNull() {
            addCriterion("facial_attractiveness is not null");
            return (Criteria) this;
        }

        public Criteria andFacialAttractivenessEqualTo(Integer value) {
            addCriterion("facial_attractiveness =", value, "facialAttractiveness");
            return (Criteria) this;
        }

        public Criteria andFacialAttractivenessNotEqualTo(Integer value) {
            addCriterion("facial_attractiveness <>", value, "facialAttractiveness");
            return (Criteria) this;
        }

        public Criteria andFacialAttractivenessGreaterThan(Integer value) {
            addCriterion("facial_attractiveness >", value, "facialAttractiveness");
            return (Criteria) this;
        }

        public Criteria andFacialAttractivenessGreaterThanOrEqualTo(Integer value) {
            addCriterion("facial_attractiveness >=", value, "facialAttractiveness");
            return (Criteria) this;
        }

        public Criteria andFacialAttractivenessLessThan(Integer value) {
            addCriterion("facial_attractiveness <", value, "facialAttractiveness");
            return (Criteria) this;
        }

        public Criteria andFacialAttractivenessLessThanOrEqualTo(Integer value) {
            addCriterion("facial_attractiveness <=", value, "facialAttractiveness");
            return (Criteria) this;
        }

        public Criteria andFacialAttractivenessIn(List<Integer> values) {
            addCriterion("facial_attractiveness in", values, "facialAttractiveness");
            return (Criteria) this;
        }

        public Criteria andFacialAttractivenessNotIn(List<Integer> values) {
            addCriterion("facial_attractiveness not in", values, "facialAttractiveness");
            return (Criteria) this;
        }

        public Criteria andFacialAttractivenessBetween(Integer value1, Integer value2) {
            addCriterion("facial_attractiveness between", value1, value2, "facialAttractiveness");
            return (Criteria) this;
        }

        public Criteria andFacialAttractivenessNotBetween(Integer value1, Integer value2) {
            addCriterion("facial_attractiveness not between", value1, value2, "facialAttractiveness");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNull() {
            addCriterion("industry is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNotNull() {
            addCriterion("industry is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryEqualTo(String value) {
            addCriterion("industry =", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotEqualTo(String value) {
            addCriterion("industry <>", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThan(String value) {
            addCriterion("industry >", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("industry >=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThan(String value) {
            addCriterion("industry <", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThanOrEqualTo(String value) {
            addCriterion("industry <=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLike(String value) {
            addCriterion("industry like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotLike(String value) {
            addCriterion("industry not like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryIn(List<String> values) {
            addCriterion("industry in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotIn(List<String> values) {
            addCriterion("industry not in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryBetween(String value1, String value2) {
            addCriterion("industry between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotBetween(String value1, String value2) {
            addCriterion("industry not between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andJobTypeIsNull() {
            addCriterion("job_type is null");
            return (Criteria) this;
        }

        public Criteria andJobTypeIsNotNull() {
            addCriterion("job_type is not null");
            return (Criteria) this;
        }

        public Criteria andJobTypeEqualTo(String value) {
            addCriterion("job_type =", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeNotEqualTo(String value) {
            addCriterion("job_type <>", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeGreaterThan(String value) {
            addCriterion("job_type >", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeGreaterThanOrEqualTo(String value) {
            addCriterion("job_type >=", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeLessThan(String value) {
            addCriterion("job_type <", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeLessThanOrEqualTo(String value) {
            addCriterion("job_type <=", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeLike(String value) {
            addCriterion("job_type like", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeNotLike(String value) {
            addCriterion("job_type not like", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeIn(List<String> values) {
            addCriterion("job_type in", values, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeNotIn(List<String> values) {
            addCriterion("job_type not in", values, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeBetween(String value1, String value2) {
            addCriterion("job_type between", value1, value2, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeNotBetween(String value1, String value2) {
            addCriterion("job_type not between", value1, value2, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobProofIsNull() {
            addCriterion("job_proof is null");
            return (Criteria) this;
        }

        public Criteria andJobProofIsNotNull() {
            addCriterion("job_proof is not null");
            return (Criteria) this;
        }

        public Criteria andJobProofEqualTo(String value) {
            addCriterion("job_proof =", value, "jobProof");
            return (Criteria) this;
        }

        public Criteria andJobProofNotEqualTo(String value) {
            addCriterion("job_proof <>", value, "jobProof");
            return (Criteria) this;
        }

        public Criteria andJobProofGreaterThan(String value) {
            addCriterion("job_proof >", value, "jobProof");
            return (Criteria) this;
        }

        public Criteria andJobProofGreaterThanOrEqualTo(String value) {
            addCriterion("job_proof >=", value, "jobProof");
            return (Criteria) this;
        }

        public Criteria andJobProofLessThan(String value) {
            addCriterion("job_proof <", value, "jobProof");
            return (Criteria) this;
        }

        public Criteria andJobProofLessThanOrEqualTo(String value) {
            addCriterion("job_proof <=", value, "jobProof");
            return (Criteria) this;
        }

        public Criteria andJobProofLike(String value) {
            addCriterion("job_proof like", value, "jobProof");
            return (Criteria) this;
        }

        public Criteria andJobProofNotLike(String value) {
            addCriterion("job_proof not like", value, "jobProof");
            return (Criteria) this;
        }

        public Criteria andJobProofIn(List<String> values) {
            addCriterion("job_proof in", values, "jobProof");
            return (Criteria) this;
        }

        public Criteria andJobProofNotIn(List<String> values) {
            addCriterion("job_proof not in", values, "jobProof");
            return (Criteria) this;
        }

        public Criteria andJobProofBetween(String value1, String value2) {
            addCriterion("job_proof between", value1, value2, "jobProof");
            return (Criteria) this;
        }

        public Criteria andJobProofNotBetween(String value1, String value2) {
            addCriterion("job_proof not between", value1, value2, "jobProof");
            return (Criteria) this;
        }

        public Criteria andJobQuestionIsNull() {
            addCriterion("job_question is null");
            return (Criteria) this;
        }

        public Criteria andJobQuestionIsNotNull() {
            addCriterion("job_question is not null");
            return (Criteria) this;
        }

        public Criteria andJobQuestionEqualTo(String value) {
            addCriterion("job_question =", value, "jobQuestion");
            return (Criteria) this;
        }

        public Criteria andJobQuestionNotEqualTo(String value) {
            addCriterion("job_question <>", value, "jobQuestion");
            return (Criteria) this;
        }

        public Criteria andJobQuestionGreaterThan(String value) {
            addCriterion("job_question >", value, "jobQuestion");
            return (Criteria) this;
        }

        public Criteria andJobQuestionGreaterThanOrEqualTo(String value) {
            addCriterion("job_question >=", value, "jobQuestion");
            return (Criteria) this;
        }

        public Criteria andJobQuestionLessThan(String value) {
            addCriterion("job_question <", value, "jobQuestion");
            return (Criteria) this;
        }

        public Criteria andJobQuestionLessThanOrEqualTo(String value) {
            addCriterion("job_question <=", value, "jobQuestion");
            return (Criteria) this;
        }

        public Criteria andJobQuestionLike(String value) {
            addCriterion("job_question like", value, "jobQuestion");
            return (Criteria) this;
        }

        public Criteria andJobQuestionNotLike(String value) {
            addCriterion("job_question not like", value, "jobQuestion");
            return (Criteria) this;
        }

        public Criteria andJobQuestionIn(List<String> values) {
            addCriterion("job_question in", values, "jobQuestion");
            return (Criteria) this;
        }

        public Criteria andJobQuestionNotIn(List<String> values) {
            addCriterion("job_question not in", values, "jobQuestion");
            return (Criteria) this;
        }

        public Criteria andJobQuestionBetween(String value1, String value2) {
            addCriterion("job_question between", value1, value2, "jobQuestion");
            return (Criteria) this;
        }

        public Criteria andJobQuestionNotBetween(String value1, String value2) {
            addCriterion("job_question not between", value1, value2, "jobQuestion");
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