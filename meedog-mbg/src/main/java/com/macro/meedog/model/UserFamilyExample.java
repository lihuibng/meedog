package com.macro.meedog.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserFamilyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserFamilyExample() {
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

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andIsFatherIsNull() {
            addCriterion("is_father is null");
            return (Criteria) this;
        }

        public Criteria andIsFatherIsNotNull() {
            addCriterion("is_father is not null");
            return (Criteria) this;
        }

        public Criteria andIsFatherEqualTo(Integer value) {
            addCriterion("is_father =", value, "isFather");
            return (Criteria) this;
        }

        public Criteria andIsFatherNotEqualTo(Integer value) {
            addCriterion("is_father <>", value, "isFather");
            return (Criteria) this;
        }

        public Criteria andIsFatherGreaterThan(Integer value) {
            addCriterion("is_father >", value, "isFather");
            return (Criteria) this;
        }

        public Criteria andIsFatherGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_father >=", value, "isFather");
            return (Criteria) this;
        }

        public Criteria andIsFatherLessThan(Integer value) {
            addCriterion("is_father <", value, "isFather");
            return (Criteria) this;
        }

        public Criteria andIsFatherLessThanOrEqualTo(Integer value) {
            addCriterion("is_father <=", value, "isFather");
            return (Criteria) this;
        }

        public Criteria andIsFatherIn(List<Integer> values) {
            addCriterion("is_father in", values, "isFather");
            return (Criteria) this;
        }

        public Criteria andIsFatherNotIn(List<Integer> values) {
            addCriterion("is_father not in", values, "isFather");
            return (Criteria) this;
        }

        public Criteria andIsFatherBetween(Integer value1, Integer value2) {
            addCriterion("is_father between", value1, value2, "isFather");
            return (Criteria) this;
        }

        public Criteria andIsFatherNotBetween(Integer value1, Integer value2) {
            addCriterion("is_father not between", value1, value2, "isFather");
            return (Criteria) this;
        }

        public Criteria andIsMotherIsNull() {
            addCriterion("is_mother is null");
            return (Criteria) this;
        }

        public Criteria andIsMotherIsNotNull() {
            addCriterion("is_mother is not null");
            return (Criteria) this;
        }

        public Criteria andIsMotherEqualTo(Integer value) {
            addCriterion("is_mother =", value, "isMother");
            return (Criteria) this;
        }

        public Criteria andIsMotherNotEqualTo(Integer value) {
            addCriterion("is_mother <>", value, "isMother");
            return (Criteria) this;
        }

        public Criteria andIsMotherGreaterThan(Integer value) {
            addCriterion("is_mother >", value, "isMother");
            return (Criteria) this;
        }

        public Criteria andIsMotherGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_mother >=", value, "isMother");
            return (Criteria) this;
        }

        public Criteria andIsMotherLessThan(Integer value) {
            addCriterion("is_mother <", value, "isMother");
            return (Criteria) this;
        }

        public Criteria andIsMotherLessThanOrEqualTo(Integer value) {
            addCriterion("is_mother <=", value, "isMother");
            return (Criteria) this;
        }

        public Criteria andIsMotherIn(List<Integer> values) {
            addCriterion("is_mother in", values, "isMother");
            return (Criteria) this;
        }

        public Criteria andIsMotherNotIn(List<Integer> values) {
            addCriterion("is_mother not in", values, "isMother");
            return (Criteria) this;
        }

        public Criteria andIsMotherBetween(Integer value1, Integer value2) {
            addCriterion("is_mother between", value1, value2, "isMother");
            return (Criteria) this;
        }

        public Criteria andIsMotherNotBetween(Integer value1, Integer value2) {
            addCriterion("is_mother not between", value1, value2, "isMother");
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

        public Criteria andDistrictIsNull() {
            addCriterion("district is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNotNull() {
            addCriterion("district is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictEqualTo(String value) {
            addCriterion("district =", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotEqualTo(String value) {
            addCriterion("district <>", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThan(String value) {
            addCriterion("district >", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("district >=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThan(String value) {
            addCriterion("district <", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThanOrEqualTo(String value) {
            addCriterion("district <=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLike(String value) {
            addCriterion("district like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotLike(String value) {
            addCriterion("district not like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictIn(List<String> values) {
            addCriterion("district in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotIn(List<String> values) {
            addCriterion("district not in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictBetween(String value1, String value2) {
            addCriterion("district between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotBetween(String value1, String value2) {
            addCriterion("district not between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andTownIsNull() {
            addCriterion("town is null");
            return (Criteria) this;
        }

        public Criteria andTownIsNotNull() {
            addCriterion("town is not null");
            return (Criteria) this;
        }

        public Criteria andTownEqualTo(String value) {
            addCriterion("town =", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownNotEqualTo(String value) {
            addCriterion("town <>", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownGreaterThan(String value) {
            addCriterion("town >", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownGreaterThanOrEqualTo(String value) {
            addCriterion("town >=", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownLessThan(String value) {
            addCriterion("town <", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownLessThanOrEqualTo(String value) {
            addCriterion("town <=", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownLike(String value) {
            addCriterion("town like", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownNotLike(String value) {
            addCriterion("town not like", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownIn(List<String> values) {
            addCriterion("town in", values, "town");
            return (Criteria) this;
        }

        public Criteria andTownNotIn(List<String> values) {
            addCriterion("town not in", values, "town");
            return (Criteria) this;
        }

        public Criteria andTownBetween(String value1, String value2) {
            addCriterion("town between", value1, value2, "town");
            return (Criteria) this;
        }

        public Criteria andTownNotBetween(String value1, String value2) {
            addCriterion("town not between", value1, value2, "town");
            return (Criteria) this;
        }

        public Criteria andMetroStationIsNull() {
            addCriterion("metro_station is null");
            return (Criteria) this;
        }

        public Criteria andMetroStationIsNotNull() {
            addCriterion("metro_station is not null");
            return (Criteria) this;
        }

        public Criteria andMetroStationEqualTo(String value) {
            addCriterion("metro_station =", value, "metroStation");
            return (Criteria) this;
        }

        public Criteria andMetroStationNotEqualTo(String value) {
            addCriterion("metro_station <>", value, "metroStation");
            return (Criteria) this;
        }

        public Criteria andMetroStationGreaterThan(String value) {
            addCriterion("metro_station >", value, "metroStation");
            return (Criteria) this;
        }

        public Criteria andMetroStationGreaterThanOrEqualTo(String value) {
            addCriterion("metro_station >=", value, "metroStation");
            return (Criteria) this;
        }

        public Criteria andMetroStationLessThan(String value) {
            addCriterion("metro_station <", value, "metroStation");
            return (Criteria) this;
        }

        public Criteria andMetroStationLessThanOrEqualTo(String value) {
            addCriterion("metro_station <=", value, "metroStation");
            return (Criteria) this;
        }

        public Criteria andMetroStationLike(String value) {
            addCriterion("metro_station like", value, "metroStation");
            return (Criteria) this;
        }

        public Criteria andMetroStationNotLike(String value) {
            addCriterion("metro_station not like", value, "metroStation");
            return (Criteria) this;
        }

        public Criteria andMetroStationIn(List<String> values) {
            addCriterion("metro_station in", values, "metroStation");
            return (Criteria) this;
        }

        public Criteria andMetroStationNotIn(List<String> values) {
            addCriterion("metro_station not in", values, "metroStation");
            return (Criteria) this;
        }

        public Criteria andMetroStationBetween(String value1, String value2) {
            addCriterion("metro_station between", value1, value2, "metroStation");
            return (Criteria) this;
        }

        public Criteria andMetroStationNotBetween(String value1, String value2) {
            addCriterion("metro_station not between", value1, value2, "metroStation");
            return (Criteria) this;
        }

        public Criteria andWellKnowAddressIsNull() {
            addCriterion("well_know_address is null");
            return (Criteria) this;
        }

        public Criteria andWellKnowAddressIsNotNull() {
            addCriterion("well_know_address is not null");
            return (Criteria) this;
        }

        public Criteria andWellKnowAddressEqualTo(String value) {
            addCriterion("well_know_address =", value, "wellKnowAddress");
            return (Criteria) this;
        }

        public Criteria andWellKnowAddressNotEqualTo(String value) {
            addCriterion("well_know_address <>", value, "wellKnowAddress");
            return (Criteria) this;
        }

        public Criteria andWellKnowAddressGreaterThan(String value) {
            addCriterion("well_know_address >", value, "wellKnowAddress");
            return (Criteria) this;
        }

        public Criteria andWellKnowAddressGreaterThanOrEqualTo(String value) {
            addCriterion("well_know_address >=", value, "wellKnowAddress");
            return (Criteria) this;
        }

        public Criteria andWellKnowAddressLessThan(String value) {
            addCriterion("well_know_address <", value, "wellKnowAddress");
            return (Criteria) this;
        }

        public Criteria andWellKnowAddressLessThanOrEqualTo(String value) {
            addCriterion("well_know_address <=", value, "wellKnowAddress");
            return (Criteria) this;
        }

        public Criteria andWellKnowAddressLike(String value) {
            addCriterion("well_know_address like", value, "wellKnowAddress");
            return (Criteria) this;
        }

        public Criteria andWellKnowAddressNotLike(String value) {
            addCriterion("well_know_address not like", value, "wellKnowAddress");
            return (Criteria) this;
        }

        public Criteria andWellKnowAddressIn(List<String> values) {
            addCriterion("well_know_address in", values, "wellKnowAddress");
            return (Criteria) this;
        }

        public Criteria andWellKnowAddressNotIn(List<String> values) {
            addCriterion("well_know_address not in", values, "wellKnowAddress");
            return (Criteria) this;
        }

        public Criteria andWellKnowAddressBetween(String value1, String value2) {
            addCriterion("well_know_address between", value1, value2, "wellKnowAddress");
            return (Criteria) this;
        }

        public Criteria andWellKnowAddressNotBetween(String value1, String value2) {
            addCriterion("well_know_address not between", value1, value2, "wellKnowAddress");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNull() {
            addCriterion("income is null");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNotNull() {
            addCriterion("income is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeEqualTo(Integer value) {
            addCriterion("income =", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotEqualTo(Integer value) {
            addCriterion("income <>", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThan(Integer value) {
            addCriterion("income >", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThanOrEqualTo(Integer value) {
            addCriterion("income >=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThan(Integer value) {
            addCriterion("income <", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThanOrEqualTo(Integer value) {
            addCriterion("income <=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeIn(List<Integer> values) {
            addCriterion("income in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotIn(List<Integer> values) {
            addCriterion("income not in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeBetween(Integer value1, Integer value2) {
            addCriterion("income between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotBetween(Integer value1, Integer value2) {
            addCriterion("income not between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andMedicalInsuranceIsNull() {
            addCriterion("medical_insurance is null");
            return (Criteria) this;
        }

        public Criteria andMedicalInsuranceIsNotNull() {
            addCriterion("medical_insurance is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalInsuranceEqualTo(Integer value) {
            addCriterion("medical_insurance =", value, "medicalInsurance");
            return (Criteria) this;
        }

        public Criteria andMedicalInsuranceNotEqualTo(Integer value) {
            addCriterion("medical_insurance <>", value, "medicalInsurance");
            return (Criteria) this;
        }

        public Criteria andMedicalInsuranceGreaterThan(Integer value) {
            addCriterion("medical_insurance >", value, "medicalInsurance");
            return (Criteria) this;
        }

        public Criteria andMedicalInsuranceGreaterThanOrEqualTo(Integer value) {
            addCriterion("medical_insurance >=", value, "medicalInsurance");
            return (Criteria) this;
        }

        public Criteria andMedicalInsuranceLessThan(Integer value) {
            addCriterion("medical_insurance <", value, "medicalInsurance");
            return (Criteria) this;
        }

        public Criteria andMedicalInsuranceLessThanOrEqualTo(Integer value) {
            addCriterion("medical_insurance <=", value, "medicalInsurance");
            return (Criteria) this;
        }

        public Criteria andMedicalInsuranceIn(List<Integer> values) {
            addCriterion("medical_insurance in", values, "medicalInsurance");
            return (Criteria) this;
        }

        public Criteria andMedicalInsuranceNotIn(List<Integer> values) {
            addCriterion("medical_insurance not in", values, "medicalInsurance");
            return (Criteria) this;
        }

        public Criteria andMedicalInsuranceBetween(Integer value1, Integer value2) {
            addCriterion("medical_insurance between", value1, value2, "medicalInsurance");
            return (Criteria) this;
        }

        public Criteria andMedicalInsuranceNotBetween(Integer value1, Integer value2) {
            addCriterion("medical_insurance not between", value1, value2, "medicalInsurance");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceIsNull() {
            addCriterion("social_insurance is null");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceIsNotNull() {
            addCriterion("social_insurance is not null");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceEqualTo(Integer value) {
            addCriterion("social_insurance =", value, "socialInsurance");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceNotEqualTo(Integer value) {
            addCriterion("social_insurance <>", value, "socialInsurance");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceGreaterThan(Integer value) {
            addCriterion("social_insurance >", value, "socialInsurance");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceGreaterThanOrEqualTo(Integer value) {
            addCriterion("social_insurance >=", value, "socialInsurance");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceLessThan(Integer value) {
            addCriterion("social_insurance <", value, "socialInsurance");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceLessThanOrEqualTo(Integer value) {
            addCriterion("social_insurance <=", value, "socialInsurance");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceIn(List<Integer> values) {
            addCriterion("social_insurance in", values, "socialInsurance");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceNotIn(List<Integer> values) {
            addCriterion("social_insurance not in", values, "socialInsurance");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceBetween(Integer value1, Integer value2) {
            addCriterion("social_insurance between", value1, value2, "socialInsurance");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceNotBetween(Integer value1, Integer value2) {
            addCriterion("social_insurance not between", value1, value2, "socialInsurance");
            return (Criteria) this;
        }

        public Criteria andTotalPeopleIsNull() {
            addCriterion("total_people is null");
            return (Criteria) this;
        }

        public Criteria andTotalPeopleIsNotNull() {
            addCriterion("total_people is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPeopleEqualTo(Integer value) {
            addCriterion("total_people =", value, "totalPeople");
            return (Criteria) this;
        }

        public Criteria andTotalPeopleNotEqualTo(Integer value) {
            addCriterion("total_people <>", value, "totalPeople");
            return (Criteria) this;
        }

        public Criteria andTotalPeopleGreaterThan(Integer value) {
            addCriterion("total_people >", value, "totalPeople");
            return (Criteria) this;
        }

        public Criteria andTotalPeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_people >=", value, "totalPeople");
            return (Criteria) this;
        }

        public Criteria andTotalPeopleLessThan(Integer value) {
            addCriterion("total_people <", value, "totalPeople");
            return (Criteria) this;
        }

        public Criteria andTotalPeopleLessThanOrEqualTo(Integer value) {
            addCriterion("total_people <=", value, "totalPeople");
            return (Criteria) this;
        }

        public Criteria andTotalPeopleIn(List<Integer> values) {
            addCriterion("total_people in", values, "totalPeople");
            return (Criteria) this;
        }

        public Criteria andTotalPeopleNotIn(List<Integer> values) {
            addCriterion("total_people not in", values, "totalPeople");
            return (Criteria) this;
        }

        public Criteria andTotalPeopleBetween(Integer value1, Integer value2) {
            addCriterion("total_people between", value1, value2, "totalPeople");
            return (Criteria) this;
        }

        public Criteria andTotalPeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("total_people not between", value1, value2, "totalPeople");
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