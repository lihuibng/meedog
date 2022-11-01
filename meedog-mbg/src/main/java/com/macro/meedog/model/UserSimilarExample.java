package com.macro.meedog.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserSimilarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserSimilarExample() {
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

        public Criteria andSimIdIsNull() {
            addCriterion("sim_id is null");
            return (Criteria) this;
        }

        public Criteria andSimIdIsNotNull() {
            addCriterion("sim_id is not null");
            return (Criteria) this;
        }

        public Criteria andSimIdEqualTo(Long value) {
            addCriterion("sim_id =", value, "simId");
            return (Criteria) this;
        }

        public Criteria andSimIdNotEqualTo(Long value) {
            addCriterion("sim_id <>", value, "simId");
            return (Criteria) this;
        }

        public Criteria andSimIdGreaterThan(Long value) {
            addCriterion("sim_id >", value, "simId");
            return (Criteria) this;
        }

        public Criteria andSimIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sim_id >=", value, "simId");
            return (Criteria) this;
        }

        public Criteria andSimIdLessThan(Long value) {
            addCriterion("sim_id <", value, "simId");
            return (Criteria) this;
        }

        public Criteria andSimIdLessThanOrEqualTo(Long value) {
            addCriterion("sim_id <=", value, "simId");
            return (Criteria) this;
        }

        public Criteria andSimIdIn(List<Long> values) {
            addCriterion("sim_id in", values, "simId");
            return (Criteria) this;
        }

        public Criteria andSimIdNotIn(List<Long> values) {
            addCriterion("sim_id not in", values, "simId");
            return (Criteria) this;
        }

        public Criteria andSimIdBetween(Long value1, Long value2) {
            addCriterion("sim_id between", value1, value2, "simId");
            return (Criteria) this;
        }

        public Criteria andSimIdNotBetween(Long value1, Long value2) {
            addCriterion("sim_id not between", value1, value2, "simId");
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

        public Criteria andBasicScoreIsNull() {
            addCriterion("basic_score is null");
            return (Criteria) this;
        }

        public Criteria andBasicScoreIsNotNull() {
            addCriterion("basic_score is not null");
            return (Criteria) this;
        }

        public Criteria andBasicScoreEqualTo(Integer value) {
            addCriterion("basic_score =", value, "basicScore");
            return (Criteria) this;
        }

        public Criteria andBasicScoreNotEqualTo(Integer value) {
            addCriterion("basic_score <>", value, "basicScore");
            return (Criteria) this;
        }

        public Criteria andBasicScoreGreaterThan(Integer value) {
            addCriterion("basic_score >", value, "basicScore");
            return (Criteria) this;
        }

        public Criteria andBasicScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("basic_score >=", value, "basicScore");
            return (Criteria) this;
        }

        public Criteria andBasicScoreLessThan(Integer value) {
            addCriterion("basic_score <", value, "basicScore");
            return (Criteria) this;
        }

        public Criteria andBasicScoreLessThanOrEqualTo(Integer value) {
            addCriterion("basic_score <=", value, "basicScore");
            return (Criteria) this;
        }

        public Criteria andBasicScoreIn(List<Integer> values) {
            addCriterion("basic_score in", values, "basicScore");
            return (Criteria) this;
        }

        public Criteria andBasicScoreNotIn(List<Integer> values) {
            addCriterion("basic_score not in", values, "basicScore");
            return (Criteria) this;
        }

        public Criteria andBasicScoreBetween(Integer value1, Integer value2) {
            addCriterion("basic_score between", value1, value2, "basicScore");
            return (Criteria) this;
        }

        public Criteria andBasicScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("basic_score not between", value1, value2, "basicScore");
            return (Criteria) this;
        }

        public Criteria andEducationScoreIsNull() {
            addCriterion("education_score is null");
            return (Criteria) this;
        }

        public Criteria andEducationScoreIsNotNull() {
            addCriterion("education_score is not null");
            return (Criteria) this;
        }

        public Criteria andEducationScoreEqualTo(Integer value) {
            addCriterion("education_score =", value, "educationScore");
            return (Criteria) this;
        }

        public Criteria andEducationScoreNotEqualTo(Integer value) {
            addCriterion("education_score <>", value, "educationScore");
            return (Criteria) this;
        }

        public Criteria andEducationScoreGreaterThan(Integer value) {
            addCriterion("education_score >", value, "educationScore");
            return (Criteria) this;
        }

        public Criteria andEducationScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("education_score >=", value, "educationScore");
            return (Criteria) this;
        }

        public Criteria andEducationScoreLessThan(Integer value) {
            addCriterion("education_score <", value, "educationScore");
            return (Criteria) this;
        }

        public Criteria andEducationScoreLessThanOrEqualTo(Integer value) {
            addCriterion("education_score <=", value, "educationScore");
            return (Criteria) this;
        }

        public Criteria andEducationScoreIn(List<Integer> values) {
            addCriterion("education_score in", values, "educationScore");
            return (Criteria) this;
        }

        public Criteria andEducationScoreNotIn(List<Integer> values) {
            addCriterion("education_score not in", values, "educationScore");
            return (Criteria) this;
        }

        public Criteria andEducationScoreBetween(Integer value1, Integer value2) {
            addCriterion("education_score between", value1, value2, "educationScore");
            return (Criteria) this;
        }

        public Criteria andEducationScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("education_score not between", value1, value2, "educationScore");
            return (Criteria) this;
        }

        public Criteria andWealthScoreIsNull() {
            addCriterion("wealth_score is null");
            return (Criteria) this;
        }

        public Criteria andWealthScoreIsNotNull() {
            addCriterion("wealth_score is not null");
            return (Criteria) this;
        }

        public Criteria andWealthScoreEqualTo(Integer value) {
            addCriterion("wealth_score =", value, "wealthScore");
            return (Criteria) this;
        }

        public Criteria andWealthScoreNotEqualTo(Integer value) {
            addCriterion("wealth_score <>", value, "wealthScore");
            return (Criteria) this;
        }

        public Criteria andWealthScoreGreaterThan(Integer value) {
            addCriterion("wealth_score >", value, "wealthScore");
            return (Criteria) this;
        }

        public Criteria andWealthScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("wealth_score >=", value, "wealthScore");
            return (Criteria) this;
        }

        public Criteria andWealthScoreLessThan(Integer value) {
            addCriterion("wealth_score <", value, "wealthScore");
            return (Criteria) this;
        }

        public Criteria andWealthScoreLessThanOrEqualTo(Integer value) {
            addCriterion("wealth_score <=", value, "wealthScore");
            return (Criteria) this;
        }

        public Criteria andWealthScoreIn(List<Integer> values) {
            addCriterion("wealth_score in", values, "wealthScore");
            return (Criteria) this;
        }

        public Criteria andWealthScoreNotIn(List<Integer> values) {
            addCriterion("wealth_score not in", values, "wealthScore");
            return (Criteria) this;
        }

        public Criteria andWealthScoreBetween(Integer value1, Integer value2) {
            addCriterion("wealth_score between", value1, value2, "wealthScore");
            return (Criteria) this;
        }

        public Criteria andWealthScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("wealth_score not between", value1, value2, "wealthScore");
            return (Criteria) this;
        }

        public Criteria andTagsIsNull() {
            addCriterion("tags is null");
            return (Criteria) this;
        }

        public Criteria andTagsIsNotNull() {
            addCriterion("tags is not null");
            return (Criteria) this;
        }

        public Criteria andTagsEqualTo(String value) {
            addCriterion("tags =", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotEqualTo(String value) {
            addCriterion("tags <>", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThan(String value) {
            addCriterion("tags >", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThanOrEqualTo(String value) {
            addCriterion("tags >=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThan(String value) {
            addCriterion("tags <", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThanOrEqualTo(String value) {
            addCriterion("tags <=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLike(String value) {
            addCriterion("tags like", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotLike(String value) {
            addCriterion("tags not like", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsIn(List<String> values) {
            addCriterion("tags in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotIn(List<String> values) {
            addCriterion("tags not in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsBetween(String value1, String value2) {
            addCriterion("tags between", value1, value2, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotBetween(String value1, String value2) {
            addCriterion("tags not between", value1, value2, "tags");
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