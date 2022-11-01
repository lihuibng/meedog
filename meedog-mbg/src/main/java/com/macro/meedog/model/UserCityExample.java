package com.macro.meedog.model;

import com.macro.meedog.common.geo.GeoPoint;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserCityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserCityExample() {
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

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Long value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Long value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Long value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Long value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Long value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Long value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Long> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Long> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Long value1, Long value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Long value1, Long value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andPcidIsNull() {
            addCriterion("pcid is null");
            return (Criteria) this;
        }

        public Criteria andPcidIsNotNull() {
            addCriterion("pcid is not null");
            return (Criteria) this;
        }

        public Criteria andPcidEqualTo(Long value) {
            addCriterion("pcid =", value, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidNotEqualTo(Long value) {
            addCriterion("pcid <>", value, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidGreaterThan(Long value) {
            addCriterion("pcid >", value, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidGreaterThanOrEqualTo(Long value) {
            addCriterion("pcid >=", value, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidLessThan(Long value) {
            addCriterion("pcid <", value, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidLessThanOrEqualTo(Long value) {
            addCriterion("pcid <=", value, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidIn(List<Long> values) {
            addCriterion("pcid in", values, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidNotIn(List<Long> values) {
            addCriterion("pcid not in", values, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidBetween(Long value1, Long value2) {
            addCriterion("pcid between", value1, value2, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidNotBetween(Long value1, Long value2) {
            addCriterion("pcid not between", value1, value2, "pcid");
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

        public Criteria andPopulationIsNull() {
            addCriterion("population is null");
            return (Criteria) this;
        }

        public Criteria andPopulationIsNotNull() {
            addCriterion("population is not null");
            return (Criteria) this;
        }

        public Criteria andPopulationEqualTo(Integer value) {
            addCriterion("population =", value, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationNotEqualTo(Integer value) {
            addCriterion("population <>", value, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationGreaterThan(Integer value) {
            addCriterion("population >", value, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationGreaterThanOrEqualTo(Integer value) {
            addCriterion("population >=", value, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationLessThan(Integer value) {
            addCriterion("population <", value, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationLessThanOrEqualTo(Integer value) {
            addCriterion("population <=", value, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationIn(List<Integer> values) {
            addCriterion("population in", values, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationNotIn(List<Integer> values) {
            addCriterion("population not in", values, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationBetween(Integer value1, Integer value2) {
            addCriterion("population between", value1, value2, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationNotBetween(Integer value1, Integer value2) {
            addCriterion("population not between", value1, value2, "population");
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

        public Criteria andGdpEqualTo(Integer value) {
            addCriterion("gdp =", value, "gdp");
            return (Criteria) this;
        }

        public Criteria andGdpNotEqualTo(Integer value) {
            addCriterion("gdp <>", value, "gdp");
            return (Criteria) this;
        }

        public Criteria andGdpGreaterThan(Integer value) {
            addCriterion("gdp >", value, "gdp");
            return (Criteria) this;
        }

        public Criteria andGdpGreaterThanOrEqualTo(Integer value) {
            addCriterion("gdp >=", value, "gdp");
            return (Criteria) this;
        }

        public Criteria andGdpLessThan(Integer value) {
            addCriterion("gdp <", value, "gdp");
            return (Criteria) this;
        }

        public Criteria andGdpLessThanOrEqualTo(Integer value) {
            addCriterion("gdp <=", value, "gdp");
            return (Criteria) this;
        }

        public Criteria andGdpIn(List<Integer> values) {
            addCriterion("gdp in", values, "gdp");
            return (Criteria) this;
        }

        public Criteria andGdpNotIn(List<Integer> values) {
            addCriterion("gdp not in", values, "gdp");
            return (Criteria) this;
        }

        public Criteria andGdpBetween(Integer value1, Integer value2) {
            addCriterion("gdp between", value1, value2, "gdp");
            return (Criteria) this;
        }

        public Criteria andGdpNotBetween(Integer value1, Integer value2) {
            addCriterion("gdp not between", value1, value2, "gdp");
            return (Criteria) this;
        }

        public Criteria andAvgGdpIsNull() {
            addCriterion("avg_gdp is null");
            return (Criteria) this;
        }

        public Criteria andAvgGdpIsNotNull() {
            addCriterion("avg_gdp is not null");
            return (Criteria) this;
        }

        public Criteria andAvgGdpEqualTo(Integer value) {
            addCriterion("avg_gdp =", value, "avgGdp");
            return (Criteria) this;
        }

        public Criteria andAvgGdpNotEqualTo(Integer value) {
            addCriterion("avg_gdp <>", value, "avgGdp");
            return (Criteria) this;
        }

        public Criteria andAvgGdpGreaterThan(Integer value) {
            addCriterion("avg_gdp >", value, "avgGdp");
            return (Criteria) this;
        }

        public Criteria andAvgGdpGreaterThanOrEqualTo(Integer value) {
            addCriterion("avg_gdp >=", value, "avgGdp");
            return (Criteria) this;
        }

        public Criteria andAvgGdpLessThan(Integer value) {
            addCriterion("avg_gdp <", value, "avgGdp");
            return (Criteria) this;
        }

        public Criteria andAvgGdpLessThanOrEqualTo(Integer value) {
            addCriterion("avg_gdp <=", value, "avgGdp");
            return (Criteria) this;
        }

        public Criteria andAvgGdpIn(List<Integer> values) {
            addCriterion("avg_gdp in", values, "avgGdp");
            return (Criteria) this;
        }

        public Criteria andAvgGdpNotIn(List<Integer> values) {
            addCriterion("avg_gdp not in", values, "avgGdp");
            return (Criteria) this;
        }

        public Criteria andAvgGdpBetween(Integer value1, Integer value2) {
            addCriterion("avg_gdp between", value1, value2, "avgGdp");
            return (Criteria) this;
        }

        public Criteria andAvgGdpNotBetween(Integer value1, Integer value2) {
            addCriterion("avg_gdp not between", value1, value2, "avgGdp");
            return (Criteria) this;
        }

        public Criteria andSingleMaleNumIsNull() {
            addCriterion("single_male_num is null");
            return (Criteria) this;
        }

        public Criteria andSingleMaleNumIsNotNull() {
            addCriterion("single_male_num is not null");
            return (Criteria) this;
        }

        public Criteria andSingleMaleNumEqualTo(Integer value) {
            addCriterion("single_male_num =", value, "singleMaleNum");
            return (Criteria) this;
        }

        public Criteria andSingleMaleNumNotEqualTo(Integer value) {
            addCriterion("single_male_num <>", value, "singleMaleNum");
            return (Criteria) this;
        }

        public Criteria andSingleMaleNumGreaterThan(Integer value) {
            addCriterion("single_male_num >", value, "singleMaleNum");
            return (Criteria) this;
        }

        public Criteria andSingleMaleNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("single_male_num >=", value, "singleMaleNum");
            return (Criteria) this;
        }

        public Criteria andSingleMaleNumLessThan(Integer value) {
            addCriterion("single_male_num <", value, "singleMaleNum");
            return (Criteria) this;
        }

        public Criteria andSingleMaleNumLessThanOrEqualTo(Integer value) {
            addCriterion("single_male_num <=", value, "singleMaleNum");
            return (Criteria) this;
        }

        public Criteria andSingleMaleNumIn(List<Integer> values) {
            addCriterion("single_male_num in", values, "singleMaleNum");
            return (Criteria) this;
        }

        public Criteria andSingleMaleNumNotIn(List<Integer> values) {
            addCriterion("single_male_num not in", values, "singleMaleNum");
            return (Criteria) this;
        }

        public Criteria andSingleMaleNumBetween(Integer value1, Integer value2) {
            addCriterion("single_male_num between", value1, value2, "singleMaleNum");
            return (Criteria) this;
        }

        public Criteria andSingleMaleNumNotBetween(Integer value1, Integer value2) {
            addCriterion("single_male_num not between", value1, value2, "singleMaleNum");
            return (Criteria) this;
        }

        public Criteria andSingleFemaleNumIsNull() {
            addCriterion("single_female_num is null");
            return (Criteria) this;
        }

        public Criteria andSingleFemaleNumIsNotNull() {
            addCriterion("single_female_num is not null");
            return (Criteria) this;
        }

        public Criteria andSingleFemaleNumEqualTo(Integer value) {
            addCriterion("single_female_num =", value, "singleFemaleNum");
            return (Criteria) this;
        }

        public Criteria andSingleFemaleNumNotEqualTo(Integer value) {
            addCriterion("single_female_num <>", value, "singleFemaleNum");
            return (Criteria) this;
        }

        public Criteria andSingleFemaleNumGreaterThan(Integer value) {
            addCriterion("single_female_num >", value, "singleFemaleNum");
            return (Criteria) this;
        }

        public Criteria andSingleFemaleNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("single_female_num >=", value, "singleFemaleNum");
            return (Criteria) this;
        }

        public Criteria andSingleFemaleNumLessThan(Integer value) {
            addCriterion("single_female_num <", value, "singleFemaleNum");
            return (Criteria) this;
        }

        public Criteria andSingleFemaleNumLessThanOrEqualTo(Integer value) {
            addCriterion("single_female_num <=", value, "singleFemaleNum");
            return (Criteria) this;
        }

        public Criteria andSingleFemaleNumIn(List<Integer> values) {
            addCriterion("single_female_num in", values, "singleFemaleNum");
            return (Criteria) this;
        }

        public Criteria andSingleFemaleNumNotIn(List<Integer> values) {
            addCriterion("single_female_num not in", values, "singleFemaleNum");
            return (Criteria) this;
        }

        public Criteria andSingleFemaleNumBetween(Integer value1, Integer value2) {
            addCriterion("single_female_num between", value1, value2, "singleFemaleNum");
            return (Criteria) this;
        }

        public Criteria andSingleFemaleNumNotBetween(Integer value1, Integer value2) {
            addCriterion("single_female_num not between", value1, value2, "singleFemaleNum");
            return (Criteria) this;
        }

        public Criteria andAvgIncomeIsNull() {
            addCriterion("avg_income is null");
            return (Criteria) this;
        }

        public Criteria andAvgIncomeIsNotNull() {
            addCriterion("avg_income is not null");
            return (Criteria) this;
        }

        public Criteria andAvgIncomeEqualTo(Integer value) {
            addCriterion("avg_income =", value, "avgIncome");
            return (Criteria) this;
        }

        public Criteria andAvgIncomeNotEqualTo(Integer value) {
            addCriterion("avg_income <>", value, "avgIncome");
            return (Criteria) this;
        }

        public Criteria andAvgIncomeGreaterThan(Integer value) {
            addCriterion("avg_income >", value, "avgIncome");
            return (Criteria) this;
        }

        public Criteria andAvgIncomeGreaterThanOrEqualTo(Integer value) {
            addCriterion("avg_income >=", value, "avgIncome");
            return (Criteria) this;
        }

        public Criteria andAvgIncomeLessThan(Integer value) {
            addCriterion("avg_income <", value, "avgIncome");
            return (Criteria) this;
        }

        public Criteria andAvgIncomeLessThanOrEqualTo(Integer value) {
            addCriterion("avg_income <=", value, "avgIncome");
            return (Criteria) this;
        }

        public Criteria andAvgIncomeIn(List<Integer> values) {
            addCriterion("avg_income in", values, "avgIncome");
            return (Criteria) this;
        }

        public Criteria andAvgIncomeNotIn(List<Integer> values) {
            addCriterion("avg_income not in", values, "avgIncome");
            return (Criteria) this;
        }

        public Criteria andAvgIncomeBetween(Integer value1, Integer value2) {
            addCriterion("avg_income between", value1, value2, "avgIncome");
            return (Criteria) this;
        }

        public Criteria andAvgIncomeNotBetween(Integer value1, Integer value2) {
            addCriterion("avg_income not between", value1, value2, "avgIncome");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("level not between", value1, value2, "level");
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

        public Criteria andCityScoreIsNull() {
            addCriterion("city_score is null");
            return (Criteria) this;
        }

        public Criteria andCityScoreIsNotNull() {
            addCriterion("city_score is not null");
            return (Criteria) this;
        }

        public Criteria andCityScoreEqualTo(Integer value) {
            addCriterion("city_score =", value, "cityScore");
            return (Criteria) this;
        }

        public Criteria andCityScoreNotEqualTo(Integer value) {
            addCriterion("city_score <>", value, "cityScore");
            return (Criteria) this;
        }

        public Criteria andCityScoreGreaterThan(Integer value) {
            addCriterion("city_score >", value, "cityScore");
            return (Criteria) this;
        }

        public Criteria andCityScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("city_score >=", value, "cityScore");
            return (Criteria) this;
        }

        public Criteria andCityScoreLessThan(Integer value) {
            addCriterion("city_score <", value, "cityScore");
            return (Criteria) this;
        }

        public Criteria andCityScoreLessThanOrEqualTo(Integer value) {
            addCriterion("city_score <=", value, "cityScore");
            return (Criteria) this;
        }

        public Criteria andCityScoreIn(List<Integer> values) {
            addCriterion("city_score in", values, "cityScore");
            return (Criteria) this;
        }

        public Criteria andCityScoreNotIn(List<Integer> values) {
            addCriterion("city_score not in", values, "cityScore");
            return (Criteria) this;
        }

        public Criteria andCityScoreBetween(Integer value1, Integer value2) {
            addCriterion("city_score between", value1, value2, "cityScore");
            return (Criteria) this;
        }

        public Criteria andCityScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("city_score not between", value1, value2, "cityScore");
            return (Criteria) this;
        }

        public Criteria andCityRankIsNull() {
            addCriterion("city_rank is null");
            return (Criteria) this;
        }

        public Criteria andCityRankIsNotNull() {
            addCriterion("city_rank is not null");
            return (Criteria) this;
        }

        public Criteria andCityRankEqualTo(Integer value) {
            addCriterion("city_rank =", value, "cityRank");
            return (Criteria) this;
        }

        public Criteria andCityRankNotEqualTo(Integer value) {
            addCriterion("city_rank <>", value, "cityRank");
            return (Criteria) this;
        }

        public Criteria andCityRankGreaterThan(Integer value) {
            addCriterion("city_rank >", value, "cityRank");
            return (Criteria) this;
        }

        public Criteria andCityRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("city_rank >=", value, "cityRank");
            return (Criteria) this;
        }

        public Criteria andCityRankLessThan(Integer value) {
            addCriterion("city_rank <", value, "cityRank");
            return (Criteria) this;
        }

        public Criteria andCityRankLessThanOrEqualTo(Integer value) {
            addCriterion("city_rank <=", value, "cityRank");
            return (Criteria) this;
        }

        public Criteria andCityRankIn(List<Integer> values) {
            addCriterion("city_rank in", values, "cityRank");
            return (Criteria) this;
        }

        public Criteria andCityRankNotIn(List<Integer> values) {
            addCriterion("city_rank not in", values, "cityRank");
            return (Criteria) this;
        }

        public Criteria andCityRankBetween(Integer value1, Integer value2) {
            addCriterion("city_rank between", value1, value2, "cityRank");
            return (Criteria) this;
        }

        public Criteria andCityRankNotBetween(Integer value1, Integer value2) {
            addCriterion("city_rank not between", value1, value2, "cityRank");
            return (Criteria) this;
        }

        public Criteria andHousePriceIsNull() {
            addCriterion("house_price is null");
            return (Criteria) this;
        }

        public Criteria andHousePriceIsNotNull() {
            addCriterion("house_price is not null");
            return (Criteria) this;
        }

        public Criteria andHousePriceEqualTo(Integer value) {
            addCriterion("house_price =", value, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceNotEqualTo(Integer value) {
            addCriterion("house_price <>", value, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceGreaterThan(Integer value) {
            addCriterion("house_price >", value, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("house_price >=", value, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceLessThan(Integer value) {
            addCriterion("house_price <", value, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceLessThanOrEqualTo(Integer value) {
            addCriterion("house_price <=", value, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceIn(List<Integer> values) {
            addCriterion("house_price in", values, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceNotIn(List<Integer> values) {
            addCriterion("house_price not in", values, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceBetween(Integer value1, Integer value2) {
            addCriterion("house_price between", value1, value2, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceNotBetween(Integer value1, Integer value2) {
            addCriterion("house_price not between", value1, value2, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHouseBenchmarkIsNull() {
            addCriterion("house_benchmark is null");
            return (Criteria) this;
        }

        public Criteria andHouseBenchmarkIsNotNull() {
            addCriterion("house_benchmark is not null");
            return (Criteria) this;
        }

        public Criteria andHouseBenchmarkEqualTo(Integer value) {
            addCriterion("house_benchmark =", value, "houseBenchmark");
            return (Criteria) this;
        }

        public Criteria andHouseBenchmarkNotEqualTo(Integer value) {
            addCriterion("house_benchmark <>", value, "houseBenchmark");
            return (Criteria) this;
        }

        public Criteria andHouseBenchmarkGreaterThan(Integer value) {
            addCriterion("house_benchmark >", value, "houseBenchmark");
            return (Criteria) this;
        }

        public Criteria andHouseBenchmarkGreaterThanOrEqualTo(Integer value) {
            addCriterion("house_benchmark >=", value, "houseBenchmark");
            return (Criteria) this;
        }

        public Criteria andHouseBenchmarkLessThan(Integer value) {
            addCriterion("house_benchmark <", value, "houseBenchmark");
            return (Criteria) this;
        }

        public Criteria andHouseBenchmarkLessThanOrEqualTo(Integer value) {
            addCriterion("house_benchmark <=", value, "houseBenchmark");
            return (Criteria) this;
        }

        public Criteria andHouseBenchmarkIn(List<Integer> values) {
            addCriterion("house_benchmark in", values, "houseBenchmark");
            return (Criteria) this;
        }

        public Criteria andHouseBenchmarkNotIn(List<Integer> values) {
            addCriterion("house_benchmark not in", values, "houseBenchmark");
            return (Criteria) this;
        }

        public Criteria andHouseBenchmarkBetween(Integer value1, Integer value2) {
            addCriterion("house_benchmark between", value1, value2, "houseBenchmark");
            return (Criteria) this;
        }

        public Criteria andHouseBenchmarkNotBetween(Integer value1, Integer value2) {
            addCriterion("house_benchmark not between", value1, value2, "houseBenchmark");
            return (Criteria) this;
        }

        public Criteria andSalaryBenchmarkIsNull() {
            addCriterion("salary_benchmark is null");
            return (Criteria) this;
        }

        public Criteria andSalaryBenchmarkIsNotNull() {
            addCriterion("salary_benchmark is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryBenchmarkEqualTo(Integer value) {
            addCriterion("salary_benchmark =", value, "salaryBenchmark");
            return (Criteria) this;
        }

        public Criteria andSalaryBenchmarkNotEqualTo(Integer value) {
            addCriterion("salary_benchmark <>", value, "salaryBenchmark");
            return (Criteria) this;
        }

        public Criteria andSalaryBenchmarkGreaterThan(Integer value) {
            addCriterion("salary_benchmark >", value, "salaryBenchmark");
            return (Criteria) this;
        }

        public Criteria andSalaryBenchmarkGreaterThanOrEqualTo(Integer value) {
            addCriterion("salary_benchmark >=", value, "salaryBenchmark");
            return (Criteria) this;
        }

        public Criteria andSalaryBenchmarkLessThan(Integer value) {
            addCriterion("salary_benchmark <", value, "salaryBenchmark");
            return (Criteria) this;
        }

        public Criteria andSalaryBenchmarkLessThanOrEqualTo(Integer value) {
            addCriterion("salary_benchmark <=", value, "salaryBenchmark");
            return (Criteria) this;
        }

        public Criteria andSalaryBenchmarkIn(List<Integer> values) {
            addCriterion("salary_benchmark in", values, "salaryBenchmark");
            return (Criteria) this;
        }

        public Criteria andSalaryBenchmarkNotIn(List<Integer> values) {
            addCriterion("salary_benchmark not in", values, "salaryBenchmark");
            return (Criteria) this;
        }

        public Criteria andSalaryBenchmarkBetween(Integer value1, Integer value2) {
            addCriterion("salary_benchmark between", value1, value2, "salaryBenchmark");
            return (Criteria) this;
        }

        public Criteria andSalaryBenchmarkNotBetween(Integer value1, Integer value2) {
            addCriterion("salary_benchmark not between", value1, value2, "salaryBenchmark");
            return (Criteria) this;
        }

        public Criteria andDepositBenchmarkIsNull() {
            addCriterion("deposit_benchmark is null");
            return (Criteria) this;
        }

        public Criteria andDepositBenchmarkIsNotNull() {
            addCriterion("deposit_benchmark is not null");
            return (Criteria) this;
        }

        public Criteria andDepositBenchmarkEqualTo(Integer value) {
            addCriterion("deposit_benchmark =", value, "depositBenchmark");
            return (Criteria) this;
        }

        public Criteria andDepositBenchmarkNotEqualTo(Integer value) {
            addCriterion("deposit_benchmark <>", value, "depositBenchmark");
            return (Criteria) this;
        }

        public Criteria andDepositBenchmarkGreaterThan(Integer value) {
            addCriterion("deposit_benchmark >", value, "depositBenchmark");
            return (Criteria) this;
        }

        public Criteria andDepositBenchmarkGreaterThanOrEqualTo(Integer value) {
            addCriterion("deposit_benchmark >=", value, "depositBenchmark");
            return (Criteria) this;
        }

        public Criteria andDepositBenchmarkLessThan(Integer value) {
            addCriterion("deposit_benchmark <", value, "depositBenchmark");
            return (Criteria) this;
        }

        public Criteria andDepositBenchmarkLessThanOrEqualTo(Integer value) {
            addCriterion("deposit_benchmark <=", value, "depositBenchmark");
            return (Criteria) this;
        }

        public Criteria andDepositBenchmarkIn(List<Integer> values) {
            addCriterion("deposit_benchmark in", values, "depositBenchmark");
            return (Criteria) this;
        }

        public Criteria andDepositBenchmarkNotIn(List<Integer> values) {
            addCriterion("deposit_benchmark not in", values, "depositBenchmark");
            return (Criteria) this;
        }

        public Criteria andDepositBenchmarkBetween(Integer value1, Integer value2) {
            addCriterion("deposit_benchmark between", value1, value2, "depositBenchmark");
            return (Criteria) this;
        }

        public Criteria andDepositBenchmarkNotBetween(Integer value1, Integer value2) {
            addCriterion("deposit_benchmark not between", value1, value2, "depositBenchmark");
            return (Criteria) this;
        }

        public Criteria andOtherAssetBenchmarkIsNull() {
            addCriterion("other_asset_benchmark is null");
            return (Criteria) this;
        }

        public Criteria andOtherAssetBenchmarkIsNotNull() {
            addCriterion("other_asset_benchmark is not null");
            return (Criteria) this;
        }

        public Criteria andOtherAssetBenchmarkEqualTo(Integer value) {
            addCriterion("other_asset_benchmark =", value, "otherAssetBenchmark");
            return (Criteria) this;
        }

        public Criteria andOtherAssetBenchmarkNotEqualTo(Integer value) {
            addCriterion("other_asset_benchmark <>", value, "otherAssetBenchmark");
            return (Criteria) this;
        }

        public Criteria andOtherAssetBenchmarkGreaterThan(Integer value) {
            addCriterion("other_asset_benchmark >", value, "otherAssetBenchmark");
            return (Criteria) this;
        }

        public Criteria andOtherAssetBenchmarkGreaterThanOrEqualTo(Integer value) {
            addCriterion("other_asset_benchmark >=", value, "otherAssetBenchmark");
            return (Criteria) this;
        }

        public Criteria andOtherAssetBenchmarkLessThan(Integer value) {
            addCriterion("other_asset_benchmark <", value, "otherAssetBenchmark");
            return (Criteria) this;
        }

        public Criteria andOtherAssetBenchmarkLessThanOrEqualTo(Integer value) {
            addCriterion("other_asset_benchmark <=", value, "otherAssetBenchmark");
            return (Criteria) this;
        }

        public Criteria andOtherAssetBenchmarkIn(List<Integer> values) {
            addCriterion("other_asset_benchmark in", values, "otherAssetBenchmark");
            return (Criteria) this;
        }

        public Criteria andOtherAssetBenchmarkNotIn(List<Integer> values) {
            addCriterion("other_asset_benchmark not in", values, "otherAssetBenchmark");
            return (Criteria) this;
        }

        public Criteria andOtherAssetBenchmarkBetween(Integer value1, Integer value2) {
            addCriterion("other_asset_benchmark between", value1, value2, "otherAssetBenchmark");
            return (Criteria) this;
        }

        public Criteria andOtherAssetBenchmarkNotBetween(Integer value1, Integer value2) {
            addCriterion("other_asset_benchmark not between", value1, value2, "otherAssetBenchmark");
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