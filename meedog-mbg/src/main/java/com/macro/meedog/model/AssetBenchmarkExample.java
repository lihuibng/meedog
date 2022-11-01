package com.macro.meedog.model;

import com.macro.meedog.common.geo.GeoPoint;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AssetBenchmarkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssetBenchmarkExample() {
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

        public Criteria andProvinceIdIsNull() {
            addCriterion("province_id is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNotNull() {
            addCriterion("province_id is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdEqualTo(Long value) {
            addCriterion("province_id =", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotEqualTo(Long value) {
            addCriterion("province_id <>", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThan(Long value) {
            addCriterion("province_id >", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("province_id >=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThan(Long value) {
            addCriterion("province_id <", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThanOrEqualTo(Long value) {
            addCriterion("province_id <=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIn(List<Long> values) {
            addCriterion("province_id in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotIn(List<Long> values) {
            addCriterion("province_id not in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdBetween(Long value1, Long value2) {
            addCriterion("province_id between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotBetween(Long value1, Long value2) {
            addCriterion("province_id not between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
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

        public Criteria andCityLevelIsNull() {
            addCriterion("city_level is null");
            return (Criteria) this;
        }

        public Criteria andCityLevelIsNotNull() {
            addCriterion("city_level is not null");
            return (Criteria) this;
        }

        public Criteria andCityLevelEqualTo(Integer value) {
            addCriterion("city_level =", value, "cityLevel");
            return (Criteria) this;
        }

        public Criteria andCityLevelNotEqualTo(Integer value) {
            addCriterion("city_level <>", value, "cityLevel");
            return (Criteria) this;
        }

        public Criteria andCityLevelGreaterThan(Integer value) {
            addCriterion("city_level >", value, "cityLevel");
            return (Criteria) this;
        }

        public Criteria andCityLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("city_level >=", value, "cityLevel");
            return (Criteria) this;
        }

        public Criteria andCityLevelLessThan(Integer value) {
            addCriterion("city_level <", value, "cityLevel");
            return (Criteria) this;
        }

        public Criteria andCityLevelLessThanOrEqualTo(Integer value) {
            addCriterion("city_level <=", value, "cityLevel");
            return (Criteria) this;
        }

        public Criteria andCityLevelIn(List<Integer> values) {
            addCriterion("city_level in", values, "cityLevel");
            return (Criteria) this;
        }

        public Criteria andCityLevelNotIn(List<Integer> values) {
            addCriterion("city_level not in", values, "cityLevel");
            return (Criteria) this;
        }

        public Criteria andCityLevelBetween(Integer value1, Integer value2) {
            addCriterion("city_level between", value1, value2, "cityLevel");
            return (Criteria) this;
        }

        public Criteria andCityLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("city_level not between", value1, value2, "cityLevel");
            return (Criteria) this;
        }

        public Criteria andDistrictIdIsNull() {
            addCriterion("district_id is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIdIsNotNull() {
            addCriterion("district_id is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictIdEqualTo(Integer value) {
            addCriterion("district_id =", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdNotEqualTo(Integer value) {
            addCriterion("district_id <>", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdGreaterThan(Integer value) {
            addCriterion("district_id >", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("district_id >=", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdLessThan(Integer value) {
            addCriterion("district_id <", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdLessThanOrEqualTo(Integer value) {
            addCriterion("district_id <=", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdIn(List<Integer> values) {
            addCriterion("district_id in", values, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdNotIn(List<Integer> values) {
            addCriterion("district_id not in", values, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdBetween(Integer value1, Integer value2) {
            addCriterion("district_id between", value1, value2, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdNotBetween(Integer value1, Integer value2) {
            addCriterion("district_id not between", value1, value2, "districtId");
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

        public Criteria andStreetIsNull() {
            addCriterion("street is null");
            return (Criteria) this;
        }

        public Criteria andStreetIsNotNull() {
            addCriterion("street is not null");
            return (Criteria) this;
        }

        public Criteria andStreetEqualTo(String value) {
            addCriterion("street =", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotEqualTo(String value) {
            addCriterion("street <>", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThan(String value) {
            addCriterion("street >", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThanOrEqualTo(String value) {
            addCriterion("street >=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThan(String value) {
            addCriterion("street <", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThanOrEqualTo(String value) {
            addCriterion("street <=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLike(String value) {
            addCriterion("street like", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotLike(String value) {
            addCriterion("street not like", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetIn(List<String> values) {
            addCriterion("street in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotIn(List<String> values) {
            addCriterion("street not in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetBetween(String value1, String value2) {
            addCriterion("street between", value1, value2, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotBetween(String value1, String value2) {
            addCriterion("street not between", value1, value2, "street");
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

        public Criteria andTagIsNull() {
            addCriterion("tag is null");
            return (Criteria) this;
        }

        public Criteria andTagIsNotNull() {
            addCriterion("tag is not null");
            return (Criteria) this;
        }

        public Criteria andTagEqualTo(Byte value) {
            addCriterion("tag =", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotEqualTo(Byte value) {
            addCriterion("tag <>", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThan(Byte value) {
            addCriterion("tag >", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThanOrEqualTo(Byte value) {
            addCriterion("tag >=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThan(Byte value) {
            addCriterion("tag <", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThanOrEqualTo(Byte value) {
            addCriterion("tag <=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagIn(List<Byte> values) {
            addCriterion("tag in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotIn(List<Byte> values) {
            addCriterion("tag not in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagBetween(Byte value1, Byte value2) {
            addCriterion("tag between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotBetween(Byte value1, Byte value2) {
            addCriterion("tag not between", value1, value2, "tag");
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

        public Criteria andCityHouseBenchmarkIsNull() {
            addCriterion("city_house_benchmark is null");
            return (Criteria) this;
        }

        public Criteria andCityHouseBenchmarkIsNotNull() {
            addCriterion("city_house_benchmark is not null");
            return (Criteria) this;
        }

        public Criteria andCityHouseBenchmarkEqualTo(Integer value) {
            addCriterion("city_house_benchmark =", value, "cityHouseBenchmark");
            return (Criteria) this;
        }

        public Criteria andCityHouseBenchmarkNotEqualTo(Integer value) {
            addCriterion("city_house_benchmark <>", value, "cityHouseBenchmark");
            return (Criteria) this;
        }

        public Criteria andCityHouseBenchmarkGreaterThan(Integer value) {
            addCriterion("city_house_benchmark >", value, "cityHouseBenchmark");
            return (Criteria) this;
        }

        public Criteria andCityHouseBenchmarkGreaterThanOrEqualTo(Integer value) {
            addCriterion("city_house_benchmark >=", value, "cityHouseBenchmark");
            return (Criteria) this;
        }

        public Criteria andCityHouseBenchmarkLessThan(Integer value) {
            addCriterion("city_house_benchmark <", value, "cityHouseBenchmark");
            return (Criteria) this;
        }

        public Criteria andCityHouseBenchmarkLessThanOrEqualTo(Integer value) {
            addCriterion("city_house_benchmark <=", value, "cityHouseBenchmark");
            return (Criteria) this;
        }

        public Criteria andCityHouseBenchmarkIn(List<Integer> values) {
            addCriterion("city_house_benchmark in", values, "cityHouseBenchmark");
            return (Criteria) this;
        }

        public Criteria andCityHouseBenchmarkNotIn(List<Integer> values) {
            addCriterion("city_house_benchmark not in", values, "cityHouseBenchmark");
            return (Criteria) this;
        }

        public Criteria andCityHouseBenchmarkBetween(Integer value1, Integer value2) {
            addCriterion("city_house_benchmark between", value1, value2, "cityHouseBenchmark");
            return (Criteria) this;
        }

        public Criteria andCityHouseBenchmarkNotBetween(Integer value1, Integer value2) {
            addCriterion("city_house_benchmark not between", value1, value2, "cityHouseBenchmark");
            return (Criteria) this;
        }

        public Criteria andAreaHouseBenchmarkIsNull() {
            addCriterion("area_house_benchmark is null");
            return (Criteria) this;
        }

        public Criteria andAreaHouseBenchmarkIsNotNull() {
            addCriterion("area_house_benchmark is not null");
            return (Criteria) this;
        }

        public Criteria andAreaHouseBenchmarkEqualTo(Integer value) {
            addCriterion("area_house_benchmark =", value, "areaHouseBenchmark");
            return (Criteria) this;
        }

        public Criteria andAreaHouseBenchmarkNotEqualTo(Integer value) {
            addCriterion("area_house_benchmark <>", value, "areaHouseBenchmark");
            return (Criteria) this;
        }

        public Criteria andAreaHouseBenchmarkGreaterThan(Integer value) {
            addCriterion("area_house_benchmark >", value, "areaHouseBenchmark");
            return (Criteria) this;
        }

        public Criteria andAreaHouseBenchmarkGreaterThanOrEqualTo(Integer value) {
            addCriterion("area_house_benchmark >=", value, "areaHouseBenchmark");
            return (Criteria) this;
        }

        public Criteria andAreaHouseBenchmarkLessThan(Integer value) {
            addCriterion("area_house_benchmark <", value, "areaHouseBenchmark");
            return (Criteria) this;
        }

        public Criteria andAreaHouseBenchmarkLessThanOrEqualTo(Integer value) {
            addCriterion("area_house_benchmark <=", value, "areaHouseBenchmark");
            return (Criteria) this;
        }

        public Criteria andAreaHouseBenchmarkIn(List<Integer> values) {
            addCriterion("area_house_benchmark in", values, "areaHouseBenchmark");
            return (Criteria) this;
        }

        public Criteria andAreaHouseBenchmarkNotIn(List<Integer> values) {
            addCriterion("area_house_benchmark not in", values, "areaHouseBenchmark");
            return (Criteria) this;
        }

        public Criteria andAreaHouseBenchmarkBetween(Integer value1, Integer value2) {
            addCriterion("area_house_benchmark between", value1, value2, "areaHouseBenchmark");
            return (Criteria) this;
        }

        public Criteria andAreaHouseBenchmarkNotBetween(Integer value1, Integer value2) {
            addCriterion("area_house_benchmark not between", value1, value2, "areaHouseBenchmark");
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