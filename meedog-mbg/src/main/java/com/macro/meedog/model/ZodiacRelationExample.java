package com.macro.meedog.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZodiacRelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZodiacRelationExample() {
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

        public Criteria andZodiacIdIsNull() {
            addCriterion("zodiac_id is null");
            return (Criteria) this;
        }

        public Criteria andZodiacIdIsNotNull() {
            addCriterion("zodiac_id is not null");
            return (Criteria) this;
        }

        public Criteria andZodiacIdEqualTo(Long value) {
            addCriterion("zodiac_id =", value, "zodiacId");
            return (Criteria) this;
        }

        public Criteria andZodiacIdNotEqualTo(Long value) {
            addCriterion("zodiac_id <>", value, "zodiacId");
            return (Criteria) this;
        }

        public Criteria andZodiacIdGreaterThan(Long value) {
            addCriterion("zodiac_id >", value, "zodiacId");
            return (Criteria) this;
        }

        public Criteria andZodiacIdGreaterThanOrEqualTo(Long value) {
            addCriterion("zodiac_id >=", value, "zodiacId");
            return (Criteria) this;
        }

        public Criteria andZodiacIdLessThan(Long value) {
            addCriterion("zodiac_id <", value, "zodiacId");
            return (Criteria) this;
        }

        public Criteria andZodiacIdLessThanOrEqualTo(Long value) {
            addCriterion("zodiac_id <=", value, "zodiacId");
            return (Criteria) this;
        }

        public Criteria andZodiacIdIn(List<Long> values) {
            addCriterion("zodiac_id in", values, "zodiacId");
            return (Criteria) this;
        }

        public Criteria andZodiacIdNotIn(List<Long> values) {
            addCriterion("zodiac_id not in", values, "zodiacId");
            return (Criteria) this;
        }

        public Criteria andZodiacIdBetween(Long value1, Long value2) {
            addCriterion("zodiac_id between", value1, value2, "zodiacId");
            return (Criteria) this;
        }

        public Criteria andZodiacIdNotBetween(Long value1, Long value2) {
            addCriterion("zodiac_id not between", value1, value2, "zodiacId");
            return (Criteria) this;
        }

        public Criteria andZodiacId2IsNull() {
            addCriterion("zodiac_id2 is null");
            return (Criteria) this;
        }

        public Criteria andZodiacId2IsNotNull() {
            addCriterion("zodiac_id2 is not null");
            return (Criteria) this;
        }

        public Criteria andZodiacId2EqualTo(Long value) {
            addCriterion("zodiac_id2 =", value, "zodiacId2");
            return (Criteria) this;
        }

        public Criteria andZodiacId2NotEqualTo(Long value) {
            addCriterion("zodiac_id2 <>", value, "zodiacId2");
            return (Criteria) this;
        }

        public Criteria andZodiacId2GreaterThan(Long value) {
            addCriterion("zodiac_id2 >", value, "zodiacId2");
            return (Criteria) this;
        }

        public Criteria andZodiacId2GreaterThanOrEqualTo(Long value) {
            addCriterion("zodiac_id2 >=", value, "zodiacId2");
            return (Criteria) this;
        }

        public Criteria andZodiacId2LessThan(Long value) {
            addCriterion("zodiac_id2 <", value, "zodiacId2");
            return (Criteria) this;
        }

        public Criteria andZodiacId2LessThanOrEqualTo(Long value) {
            addCriterion("zodiac_id2 <=", value, "zodiacId2");
            return (Criteria) this;
        }

        public Criteria andZodiacId2In(List<Long> values) {
            addCriterion("zodiac_id2 in", values, "zodiacId2");
            return (Criteria) this;
        }

        public Criteria andZodiacId2NotIn(List<Long> values) {
            addCriterion("zodiac_id2 not in", values, "zodiacId2");
            return (Criteria) this;
        }

        public Criteria andZodiacId2Between(Long value1, Long value2) {
            addCriterion("zodiac_id2 between", value1, value2, "zodiacId2");
            return (Criteria) this;
        }

        public Criteria andZodiacId2NotBetween(Long value1, Long value2) {
            addCriterion("zodiac_id2 not between", value1, value2, "zodiacId2");
            return (Criteria) this;
        }

        public Criteria andGoodIsNull() {
            addCriterion("good is null");
            return (Criteria) this;
        }

        public Criteria andGoodIsNotNull() {
            addCriterion("good is not null");
            return (Criteria) this;
        }

        public Criteria andGoodEqualTo(String value) {
            addCriterion("good =", value, "good");
            return (Criteria) this;
        }

        public Criteria andGoodNotEqualTo(String value) {
            addCriterion("good <>", value, "good");
            return (Criteria) this;
        }

        public Criteria andGoodGreaterThan(String value) {
            addCriterion("good >", value, "good");
            return (Criteria) this;
        }

        public Criteria andGoodGreaterThanOrEqualTo(String value) {
            addCriterion("good >=", value, "good");
            return (Criteria) this;
        }

        public Criteria andGoodLessThan(String value) {
            addCriterion("good <", value, "good");
            return (Criteria) this;
        }

        public Criteria andGoodLessThanOrEqualTo(String value) {
            addCriterion("good <=", value, "good");
            return (Criteria) this;
        }

        public Criteria andGoodLike(String value) {
            addCriterion("good like", value, "good");
            return (Criteria) this;
        }

        public Criteria andGoodNotLike(String value) {
            addCriterion("good not like", value, "good");
            return (Criteria) this;
        }

        public Criteria andGoodIn(List<String> values) {
            addCriterion("good in", values, "good");
            return (Criteria) this;
        }

        public Criteria andGoodNotIn(List<String> values) {
            addCriterion("good not in", values, "good");
            return (Criteria) this;
        }

        public Criteria andGoodBetween(String value1, String value2) {
            addCriterion("good between", value1, value2, "good");
            return (Criteria) this;
        }

        public Criteria andGoodNotBetween(String value1, String value2) {
            addCriterion("good not between", value1, value2, "good");
            return (Criteria) this;
        }

        public Criteria andBadIsNull() {
            addCriterion("bad is null");
            return (Criteria) this;
        }

        public Criteria andBadIsNotNull() {
            addCriterion("bad is not null");
            return (Criteria) this;
        }

        public Criteria andBadEqualTo(String value) {
            addCriterion("bad =", value, "bad");
            return (Criteria) this;
        }

        public Criteria andBadNotEqualTo(String value) {
            addCriterion("bad <>", value, "bad");
            return (Criteria) this;
        }

        public Criteria andBadGreaterThan(String value) {
            addCriterion("bad >", value, "bad");
            return (Criteria) this;
        }

        public Criteria andBadGreaterThanOrEqualTo(String value) {
            addCriterion("bad >=", value, "bad");
            return (Criteria) this;
        }

        public Criteria andBadLessThan(String value) {
            addCriterion("bad <", value, "bad");
            return (Criteria) this;
        }

        public Criteria andBadLessThanOrEqualTo(String value) {
            addCriterion("bad <=", value, "bad");
            return (Criteria) this;
        }

        public Criteria andBadLike(String value) {
            addCriterion("bad like", value, "bad");
            return (Criteria) this;
        }

        public Criteria andBadNotLike(String value) {
            addCriterion("bad not like", value, "bad");
            return (Criteria) this;
        }

        public Criteria andBadIn(List<String> values) {
            addCriterion("bad in", values, "bad");
            return (Criteria) this;
        }

        public Criteria andBadNotIn(List<String> values) {
            addCriterion("bad not in", values, "bad");
            return (Criteria) this;
        }

        public Criteria andBadBetween(String value1, String value2) {
            addCriterion("bad between", value1, value2, "bad");
            return (Criteria) this;
        }

        public Criteria andBadNotBetween(String value1, String value2) {
            addCriterion("bad not between", value1, value2, "bad");
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