package com.macro.meedog.model;

import com.macro.meedog.common.geo.GeoPoint;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserEduExperienceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserEduExperienceExample() {
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

        public Criteria andAbroadIsNull() {
            addCriterion("abroad is null");
            return (Criteria) this;
        }

        public Criteria andAbroadIsNotNull() {
            addCriterion("abroad is not null");
            return (Criteria) this;
        }

        public Criteria andAbroadEqualTo(Integer value) {
            addCriterion("abroad =", value, "abroad");
            return (Criteria) this;
        }

        public Criteria andAbroadNotEqualTo(Integer value) {
            addCriterion("abroad <>", value, "abroad");
            return (Criteria) this;
        }

        public Criteria andAbroadGreaterThan(Integer value) {
            addCriterion("abroad >", value, "abroad");
            return (Criteria) this;
        }

        public Criteria andAbroadGreaterThanOrEqualTo(Integer value) {
            addCriterion("abroad >=", value, "abroad");
            return (Criteria) this;
        }

        public Criteria andAbroadLessThan(Integer value) {
            addCriterion("abroad <", value, "abroad");
            return (Criteria) this;
        }

        public Criteria andAbroadLessThanOrEqualTo(Integer value) {
            addCriterion("abroad <=", value, "abroad");
            return (Criteria) this;
        }

        public Criteria andAbroadIn(List<Integer> values) {
            addCriterion("abroad in", values, "abroad");
            return (Criteria) this;
        }

        public Criteria andAbroadNotIn(List<Integer> values) {
            addCriterion("abroad not in", values, "abroad");
            return (Criteria) this;
        }

        public Criteria andAbroadBetween(Integer value1, Integer value2) {
            addCriterion("abroad between", value1, value2, "abroad");
            return (Criteria) this;
        }

        public Criteria andAbroadNotBetween(Integer value1, Integer value2) {
            addCriterion("abroad not between", value1, value2, "abroad");
            return (Criteria) this;
        }

        public Criteria andStartIsNull() {
            addCriterion("start is null");
            return (Criteria) this;
        }

        public Criteria andStartIsNotNull() {
            addCriterion("start is not null");
            return (Criteria) this;
        }

        public Criteria andStartEqualTo(Date value) {
            addCriterionForJDBCDate("start =", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotEqualTo(Date value) {
            addCriterionForJDBCDate("start <>", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartGreaterThan(Date value) {
            addCriterionForJDBCDate("start >", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start >=", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartLessThan(Date value) {
            addCriterionForJDBCDate("start <", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start <=", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartIn(List<Date> values) {
            addCriterionForJDBCDate("start in", values, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotIn(List<Date> values) {
            addCriterionForJDBCDate("start not in", values, "start");
            return (Criteria) this;
        }

        public Criteria andStartBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start between", value1, value2, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start not between", value1, value2, "start");
            return (Criteria) this;
        }

        public Criteria andEndIsNull() {
            addCriterion("end is null");
            return (Criteria) this;
        }

        public Criteria andEndIsNotNull() {
            addCriterion("end is not null");
            return (Criteria) this;
        }

        public Criteria andEndEqualTo(Date value) {
            addCriterionForJDBCDate("end =", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndNotEqualTo(Date value) {
            addCriterionForJDBCDate("end <>", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndGreaterThan(Date value) {
            addCriterionForJDBCDate("end >", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end >=", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndLessThan(Date value) {
            addCriterionForJDBCDate("end <", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end <=", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndIn(List<Date> values) {
            addCriterionForJDBCDate("end in", values, "end");
            return (Criteria) this;
        }

        public Criteria andEndNotIn(List<Date> values) {
            addCriterionForJDBCDate("end not in", values, "end");
            return (Criteria) this;
        }

        public Criteria andEndBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end between", value1, value2, "end");
            return (Criteria) this;
        }

        public Criteria andEndNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end not between", value1, value2, "end");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNull() {
            addCriterion("school is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNotNull() {
            addCriterion("school is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolEqualTo(String value) {
            addCriterion("school =", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotEqualTo(String value) {
            addCriterion("school <>", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThan(String value) {
            addCriterion("school >", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("school >=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThan(String value) {
            addCriterion("school <", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThanOrEqualTo(String value) {
            addCriterion("school <=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLike(String value) {
            addCriterion("school like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotLike(String value) {
            addCriterion("school not like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolIn(List<String> values) {
            addCriterion("school in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotIn(List<String> values) {
            addCriterion("school not in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolBetween(String value1, String value2) {
            addCriterion("school between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotBetween(String value1, String value2) {
            addCriterion("school not between", value1, value2, "school");
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

        public Criteria andIsGraduatedIsNull() {
            addCriterion("is_graduated is null");
            return (Criteria) this;
        }

        public Criteria andIsGraduatedIsNotNull() {
            addCriterion("is_graduated is not null");
            return (Criteria) this;
        }

        public Criteria andIsGraduatedEqualTo(Integer value) {
            addCriterion("is_graduated =", value, "isGraduated");
            return (Criteria) this;
        }

        public Criteria andIsGraduatedNotEqualTo(Integer value) {
            addCriterion("is_graduated <>", value, "isGraduated");
            return (Criteria) this;
        }

        public Criteria andIsGraduatedGreaterThan(Integer value) {
            addCriterion("is_graduated >", value, "isGraduated");
            return (Criteria) this;
        }

        public Criteria andIsGraduatedGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_graduated >=", value, "isGraduated");
            return (Criteria) this;
        }

        public Criteria andIsGraduatedLessThan(Integer value) {
            addCriterion("is_graduated <", value, "isGraduated");
            return (Criteria) this;
        }

        public Criteria andIsGraduatedLessThanOrEqualTo(Integer value) {
            addCriterion("is_graduated <=", value, "isGraduated");
            return (Criteria) this;
        }

        public Criteria andIsGraduatedIn(List<Integer> values) {
            addCriterion("is_graduated in", values, "isGraduated");
            return (Criteria) this;
        }

        public Criteria andIsGraduatedNotIn(List<Integer> values) {
            addCriterion("is_graduated not in", values, "isGraduated");
            return (Criteria) this;
        }

        public Criteria andIsGraduatedBetween(Integer value1, Integer value2) {
            addCriterion("is_graduated between", value1, value2, "isGraduated");
            return (Criteria) this;
        }

        public Criteria andIsGraduatedNotBetween(Integer value1, Integer value2) {
            addCriterion("is_graduated not between", value1, value2, "isGraduated");
            return (Criteria) this;
        }

        public Criteria andIsDegreeGrantedIsNull() {
            addCriterion("is_degree_granted is null");
            return (Criteria) this;
        }

        public Criteria andIsDegreeGrantedIsNotNull() {
            addCriterion("is_degree_granted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDegreeGrantedEqualTo(Integer value) {
            addCriterion("is_degree_granted =", value, "isDegreeGranted");
            return (Criteria) this;
        }

        public Criteria andIsDegreeGrantedNotEqualTo(Integer value) {
            addCriterion("is_degree_granted <>", value, "isDegreeGranted");
            return (Criteria) this;
        }

        public Criteria andIsDegreeGrantedGreaterThan(Integer value) {
            addCriterion("is_degree_granted >", value, "isDegreeGranted");
            return (Criteria) this;
        }

        public Criteria andIsDegreeGrantedGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_degree_granted >=", value, "isDegreeGranted");
            return (Criteria) this;
        }

        public Criteria andIsDegreeGrantedLessThan(Integer value) {
            addCriterion("is_degree_granted <", value, "isDegreeGranted");
            return (Criteria) this;
        }

        public Criteria andIsDegreeGrantedLessThanOrEqualTo(Integer value) {
            addCriterion("is_degree_granted <=", value, "isDegreeGranted");
            return (Criteria) this;
        }

        public Criteria andIsDegreeGrantedIn(List<Integer> values) {
            addCriterion("is_degree_granted in", values, "isDegreeGranted");
            return (Criteria) this;
        }

        public Criteria andIsDegreeGrantedNotIn(List<Integer> values) {
            addCriterion("is_degree_granted not in", values, "isDegreeGranted");
            return (Criteria) this;
        }

        public Criteria andIsDegreeGrantedBetween(Integer value1, Integer value2) {
            addCriterion("is_degree_granted between", value1, value2, "isDegreeGranted");
            return (Criteria) this;
        }

        public Criteria andIsDegreeGrantedNotBetween(Integer value1, Integer value2) {
            addCriterion("is_degree_granted not between", value1, value2, "isDegreeGranted");
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

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("country not between", value1, value2, "country");
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

        public Criteria andLanguageIsNull() {
            addCriterion("language is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("language is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(String value) {
            addCriterion("language =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(String value) {
            addCriterion("language <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(String value) {
            addCriterion("language >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("language >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(String value) {
            addCriterion("language <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(String value) {
            addCriterion("language <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLike(String value) {
            addCriterion("language like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotLike(String value) {
            addCriterion("language not like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<String> values) {
            addCriterion("language in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<String> values) {
            addCriterion("language not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(String value1, String value2) {
            addCriterion("language between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(String value1, String value2) {
            addCriterion("language not between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andCanteenIsNull() {
            addCriterion("canteen is null");
            return (Criteria) this;
        }

        public Criteria andCanteenIsNotNull() {
            addCriterion("canteen is not null");
            return (Criteria) this;
        }

        public Criteria andCanteenEqualTo(String value) {
            addCriterion("canteen =", value, "canteen");
            return (Criteria) this;
        }

        public Criteria andCanteenNotEqualTo(String value) {
            addCriterion("canteen <>", value, "canteen");
            return (Criteria) this;
        }

        public Criteria andCanteenGreaterThan(String value) {
            addCriterion("canteen >", value, "canteen");
            return (Criteria) this;
        }

        public Criteria andCanteenGreaterThanOrEqualTo(String value) {
            addCriterion("canteen >=", value, "canteen");
            return (Criteria) this;
        }

        public Criteria andCanteenLessThan(String value) {
            addCriterion("canteen <", value, "canteen");
            return (Criteria) this;
        }

        public Criteria andCanteenLessThanOrEqualTo(String value) {
            addCriterion("canteen <=", value, "canteen");
            return (Criteria) this;
        }

        public Criteria andCanteenLike(String value) {
            addCriterion("canteen like", value, "canteen");
            return (Criteria) this;
        }

        public Criteria andCanteenNotLike(String value) {
            addCriterion("canteen not like", value, "canteen");
            return (Criteria) this;
        }

        public Criteria andCanteenIn(List<String> values) {
            addCriterion("canteen in", values, "canteen");
            return (Criteria) this;
        }

        public Criteria andCanteenNotIn(List<String> values) {
            addCriterion("canteen not in", values, "canteen");
            return (Criteria) this;
        }

        public Criteria andCanteenBetween(String value1, String value2) {
            addCriterion("canteen between", value1, value2, "canteen");
            return (Criteria) this;
        }

        public Criteria andCanteenNotBetween(String value1, String value2) {
            addCriterion("canteen not between", value1, value2, "canteen");
            return (Criteria) this;
        }

        public Criteria andDormitoryIsNull() {
            addCriterion("dormitory is null");
            return (Criteria) this;
        }

        public Criteria andDormitoryIsNotNull() {
            addCriterion("dormitory is not null");
            return (Criteria) this;
        }

        public Criteria andDormitoryEqualTo(String value) {
            addCriterion("dormitory =", value, "dormitory");
            return (Criteria) this;
        }

        public Criteria andDormitoryNotEqualTo(String value) {
            addCriterion("dormitory <>", value, "dormitory");
            return (Criteria) this;
        }

        public Criteria andDormitoryGreaterThan(String value) {
            addCriterion("dormitory >", value, "dormitory");
            return (Criteria) this;
        }

        public Criteria andDormitoryGreaterThanOrEqualTo(String value) {
            addCriterion("dormitory >=", value, "dormitory");
            return (Criteria) this;
        }

        public Criteria andDormitoryLessThan(String value) {
            addCriterion("dormitory <", value, "dormitory");
            return (Criteria) this;
        }

        public Criteria andDormitoryLessThanOrEqualTo(String value) {
            addCriterion("dormitory <=", value, "dormitory");
            return (Criteria) this;
        }

        public Criteria andDormitoryLike(String value) {
            addCriterion("dormitory like", value, "dormitory");
            return (Criteria) this;
        }

        public Criteria andDormitoryNotLike(String value) {
            addCriterion("dormitory not like", value, "dormitory");
            return (Criteria) this;
        }

        public Criteria andDormitoryIn(List<String> values) {
            addCriterion("dormitory in", values, "dormitory");
            return (Criteria) this;
        }

        public Criteria andDormitoryNotIn(List<String> values) {
            addCriterion("dormitory not in", values, "dormitory");
            return (Criteria) this;
        }

        public Criteria andDormitoryBetween(String value1, String value2) {
            addCriterion("dormitory between", value1, value2, "dormitory");
            return (Criteria) this;
        }

        public Criteria andDormitoryNotBetween(String value1, String value2) {
            addCriterion("dormitory not between", value1, value2, "dormitory");
            return (Criteria) this;
        }

        public Criteria andAcademicBuildingIsNull() {
            addCriterion("academic_building is null");
            return (Criteria) this;
        }

        public Criteria andAcademicBuildingIsNotNull() {
            addCriterion("academic_building is not null");
            return (Criteria) this;
        }

        public Criteria andAcademicBuildingEqualTo(String value) {
            addCriterion("academic_building =", value, "academicBuilding");
            return (Criteria) this;
        }

        public Criteria andAcademicBuildingNotEqualTo(String value) {
            addCriterion("academic_building <>", value, "academicBuilding");
            return (Criteria) this;
        }

        public Criteria andAcademicBuildingGreaterThan(String value) {
            addCriterion("academic_building >", value, "academicBuilding");
            return (Criteria) this;
        }

        public Criteria andAcademicBuildingGreaterThanOrEqualTo(String value) {
            addCriterion("academic_building >=", value, "academicBuilding");
            return (Criteria) this;
        }

        public Criteria andAcademicBuildingLessThan(String value) {
            addCriterion("academic_building <", value, "academicBuilding");
            return (Criteria) this;
        }

        public Criteria andAcademicBuildingLessThanOrEqualTo(String value) {
            addCriterion("academic_building <=", value, "academicBuilding");
            return (Criteria) this;
        }

        public Criteria andAcademicBuildingLike(String value) {
            addCriterion("academic_building like", value, "academicBuilding");
            return (Criteria) this;
        }

        public Criteria andAcademicBuildingNotLike(String value) {
            addCriterion("academic_building not like", value, "academicBuilding");
            return (Criteria) this;
        }

        public Criteria andAcademicBuildingIn(List<String> values) {
            addCriterion("academic_building in", values, "academicBuilding");
            return (Criteria) this;
        }

        public Criteria andAcademicBuildingNotIn(List<String> values) {
            addCriterion("academic_building not in", values, "academicBuilding");
            return (Criteria) this;
        }

        public Criteria andAcademicBuildingBetween(String value1, String value2) {
            addCriterion("academic_building between", value1, value2, "academicBuilding");
            return (Criteria) this;
        }

        public Criteria andAcademicBuildingNotBetween(String value1, String value2) {
            addCriterion("academic_building not between", value1, value2, "academicBuilding");
            return (Criteria) this;
        }

        public Criteria andTeacherIsNull() {
            addCriterion("teacher is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIsNotNull() {
            addCriterion("teacher is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherEqualTo(String value) {
            addCriterion("teacher =", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotEqualTo(String value) {
            addCriterion("teacher <>", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherGreaterThan(String value) {
            addCriterion("teacher >", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherGreaterThanOrEqualTo(String value) {
            addCriterion("teacher >=", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherLessThan(String value) {
            addCriterion("teacher <", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherLessThanOrEqualTo(String value) {
            addCriterion("teacher <=", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherLike(String value) {
            addCriterion("teacher like", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotLike(String value) {
            addCriterion("teacher not like", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherIn(List<String> values) {
            addCriterion("teacher in", values, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotIn(List<String> values) {
            addCriterion("teacher not in", values, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherBetween(String value1, String value2) {
            addCriterion("teacher between", value1, value2, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotBetween(String value1, String value2) {
            addCriterion("teacher not between", value1, value2, "teacher");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("major is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("major is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("major =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("major <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("major >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("major >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("major <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("major <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("major like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("major not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("major in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("major not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("major between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("major not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andLivingFeelingIsNull() {
            addCriterion("living_feeling is null");
            return (Criteria) this;
        }

        public Criteria andLivingFeelingIsNotNull() {
            addCriterion("living_feeling is not null");
            return (Criteria) this;
        }

        public Criteria andLivingFeelingEqualTo(String value) {
            addCriterion("living_feeling =", value, "livingFeeling");
            return (Criteria) this;
        }

        public Criteria andLivingFeelingNotEqualTo(String value) {
            addCriterion("living_feeling <>", value, "livingFeeling");
            return (Criteria) this;
        }

        public Criteria andLivingFeelingGreaterThan(String value) {
            addCriterion("living_feeling >", value, "livingFeeling");
            return (Criteria) this;
        }

        public Criteria andLivingFeelingGreaterThanOrEqualTo(String value) {
            addCriterion("living_feeling >=", value, "livingFeeling");
            return (Criteria) this;
        }

        public Criteria andLivingFeelingLessThan(String value) {
            addCriterion("living_feeling <", value, "livingFeeling");
            return (Criteria) this;
        }

        public Criteria andLivingFeelingLessThanOrEqualTo(String value) {
            addCriterion("living_feeling <=", value, "livingFeeling");
            return (Criteria) this;
        }

        public Criteria andLivingFeelingLike(String value) {
            addCriterion("living_feeling like", value, "livingFeeling");
            return (Criteria) this;
        }

        public Criteria andLivingFeelingNotLike(String value) {
            addCriterion("living_feeling not like", value, "livingFeeling");
            return (Criteria) this;
        }

        public Criteria andLivingFeelingIn(List<String> values) {
            addCriterion("living_feeling in", values, "livingFeeling");
            return (Criteria) this;
        }

        public Criteria andLivingFeelingNotIn(List<String> values) {
            addCriterion("living_feeling not in", values, "livingFeeling");
            return (Criteria) this;
        }

        public Criteria andLivingFeelingBetween(String value1, String value2) {
            addCriterion("living_feeling between", value1, value2, "livingFeeling");
            return (Criteria) this;
        }

        public Criteria andLivingFeelingNotBetween(String value1, String value2) {
            addCriterion("living_feeling not between", value1, value2, "livingFeeling");
            return (Criteria) this;
        }

        public Criteria andAchievementIsNull() {
            addCriterion("achievement is null");
            return (Criteria) this;
        }

        public Criteria andAchievementIsNotNull() {
            addCriterion("achievement is not null");
            return (Criteria) this;
        }

        public Criteria andAchievementEqualTo(String value) {
            addCriterion("achievement =", value, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementNotEqualTo(String value) {
            addCriterion("achievement <>", value, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementGreaterThan(String value) {
            addCriterion("achievement >", value, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementGreaterThanOrEqualTo(String value) {
            addCriterion("achievement >=", value, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementLessThan(String value) {
            addCriterion("achievement <", value, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementLessThanOrEqualTo(String value) {
            addCriterion("achievement <=", value, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementLike(String value) {
            addCriterion("achievement like", value, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementNotLike(String value) {
            addCriterion("achievement not like", value, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementIn(List<String> values) {
            addCriterion("achievement in", values, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementNotIn(List<String> values) {
            addCriterion("achievement not in", values, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementBetween(String value1, String value2) {
            addCriterion("achievement between", value1, value2, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementNotBetween(String value1, String value2) {
            addCriterion("achievement not between", value1, value2, "achievement");
            return (Criteria) this;
        }

        public Criteria andLoveExperienceIsNull() {
            addCriterion("love_experience is null");
            return (Criteria) this;
        }

        public Criteria andLoveExperienceIsNotNull() {
            addCriterion("love_experience is not null");
            return (Criteria) this;
        }

        public Criteria andLoveExperienceEqualTo(String value) {
            addCriterion("love_experience =", value, "loveExperience");
            return (Criteria) this;
        }

        public Criteria andLoveExperienceNotEqualTo(String value) {
            addCriterion("love_experience <>", value, "loveExperience");
            return (Criteria) this;
        }

        public Criteria andLoveExperienceGreaterThan(String value) {
            addCriterion("love_experience >", value, "loveExperience");
            return (Criteria) this;
        }

        public Criteria andLoveExperienceGreaterThanOrEqualTo(String value) {
            addCriterion("love_experience >=", value, "loveExperience");
            return (Criteria) this;
        }

        public Criteria andLoveExperienceLessThan(String value) {
            addCriterion("love_experience <", value, "loveExperience");
            return (Criteria) this;
        }

        public Criteria andLoveExperienceLessThanOrEqualTo(String value) {
            addCriterion("love_experience <=", value, "loveExperience");
            return (Criteria) this;
        }

        public Criteria andLoveExperienceLike(String value) {
            addCriterion("love_experience like", value, "loveExperience");
            return (Criteria) this;
        }

        public Criteria andLoveExperienceNotLike(String value) {
            addCriterion("love_experience not like", value, "loveExperience");
            return (Criteria) this;
        }

        public Criteria andLoveExperienceIn(List<String> values) {
            addCriterion("love_experience in", values, "loveExperience");
            return (Criteria) this;
        }

        public Criteria andLoveExperienceNotIn(List<String> values) {
            addCriterion("love_experience not in", values, "loveExperience");
            return (Criteria) this;
        }

        public Criteria andLoveExperienceBetween(String value1, String value2) {
            addCriterion("love_experience between", value1, value2, "loveExperience");
            return (Criteria) this;
        }

        public Criteria andLoveExperienceNotBetween(String value1, String value2) {
            addCriterion("love_experience not between", value1, value2, "loveExperience");
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