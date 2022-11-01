package com.macro.meedog.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserLoverHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserLoverHistoryExample() {
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

        public Criteria andLoverGenderIsNull() {
            addCriterion("lover_gender is null");
            return (Criteria) this;
        }

        public Criteria andLoverGenderIsNotNull() {
            addCriterion("lover_gender is not null");
            return (Criteria) this;
        }

        public Criteria andLoverGenderEqualTo(String value) {
            addCriterion("lover_gender =", value, "loverGender");
            return (Criteria) this;
        }

        public Criteria andLoverGenderNotEqualTo(String value) {
            addCriterion("lover_gender <>", value, "loverGender");
            return (Criteria) this;
        }

        public Criteria andLoverGenderGreaterThan(String value) {
            addCriterion("lover_gender >", value, "loverGender");
            return (Criteria) this;
        }

        public Criteria andLoverGenderGreaterThanOrEqualTo(String value) {
            addCriterion("lover_gender >=", value, "loverGender");
            return (Criteria) this;
        }

        public Criteria andLoverGenderLessThan(String value) {
            addCriterion("lover_gender <", value, "loverGender");
            return (Criteria) this;
        }

        public Criteria andLoverGenderLessThanOrEqualTo(String value) {
            addCriterion("lover_gender <=", value, "loverGender");
            return (Criteria) this;
        }

        public Criteria andLoverGenderLike(String value) {
            addCriterion("lover_gender like", value, "loverGender");
            return (Criteria) this;
        }

        public Criteria andLoverGenderNotLike(String value) {
            addCriterion("lover_gender not like", value, "loverGender");
            return (Criteria) this;
        }

        public Criteria andLoverGenderIn(List<String> values) {
            addCriterion("lover_gender in", values, "loverGender");
            return (Criteria) this;
        }

        public Criteria andLoverGenderNotIn(List<String> values) {
            addCriterion("lover_gender not in", values, "loverGender");
            return (Criteria) this;
        }

        public Criteria andLoverGenderBetween(String value1, String value2) {
            addCriterion("lover_gender between", value1, value2, "loverGender");
            return (Criteria) this;
        }

        public Criteria andLoverGenderNotBetween(String value1, String value2) {
            addCriterion("lover_gender not between", value1, value2, "loverGender");
            return (Criteria) this;
        }

        public Criteria andLoveRelationStartIsNull() {
            addCriterion("love_relation_start is null");
            return (Criteria) this;
        }

        public Criteria andLoveRelationStartIsNotNull() {
            addCriterion("love_relation_start is not null");
            return (Criteria) this;
        }

        public Criteria andLoveRelationStartEqualTo(Date value) {
            addCriterionForJDBCDate("love_relation_start =", value, "loveRelationStart");
            return (Criteria) this;
        }

        public Criteria andLoveRelationStartNotEqualTo(Date value) {
            addCriterionForJDBCDate("love_relation_start <>", value, "loveRelationStart");
            return (Criteria) this;
        }

        public Criteria andLoveRelationStartGreaterThan(Date value) {
            addCriterionForJDBCDate("love_relation_start >", value, "loveRelationStart");
            return (Criteria) this;
        }

        public Criteria andLoveRelationStartGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("love_relation_start >=", value, "loveRelationStart");
            return (Criteria) this;
        }

        public Criteria andLoveRelationStartLessThan(Date value) {
            addCriterionForJDBCDate("love_relation_start <", value, "loveRelationStart");
            return (Criteria) this;
        }

        public Criteria andLoveRelationStartLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("love_relation_start <=", value, "loveRelationStart");
            return (Criteria) this;
        }

        public Criteria andLoveRelationStartIn(List<Date> values) {
            addCriterionForJDBCDate("love_relation_start in", values, "loveRelationStart");
            return (Criteria) this;
        }

        public Criteria andLoveRelationStartNotIn(List<Date> values) {
            addCriterionForJDBCDate("love_relation_start not in", values, "loveRelationStart");
            return (Criteria) this;
        }

        public Criteria andLoveRelationStartBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("love_relation_start between", value1, value2, "loveRelationStart");
            return (Criteria) this;
        }

        public Criteria andLoveRelationStartNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("love_relation_start not between", value1, value2, "loveRelationStart");
            return (Criteria) this;
        }

        public Criteria andLoveRelationEndIsNull() {
            addCriterion("love_relation_end is null");
            return (Criteria) this;
        }

        public Criteria andLoveRelationEndIsNotNull() {
            addCriterion("love_relation_end is not null");
            return (Criteria) this;
        }

        public Criteria andLoveRelationEndEqualTo(Date value) {
            addCriterionForJDBCDate("love_relation_end =", value, "loveRelationEnd");
            return (Criteria) this;
        }

        public Criteria andLoveRelationEndNotEqualTo(Date value) {
            addCriterionForJDBCDate("love_relation_end <>", value, "loveRelationEnd");
            return (Criteria) this;
        }

        public Criteria andLoveRelationEndGreaterThan(Date value) {
            addCriterionForJDBCDate("love_relation_end >", value, "loveRelationEnd");
            return (Criteria) this;
        }

        public Criteria andLoveRelationEndGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("love_relation_end >=", value, "loveRelationEnd");
            return (Criteria) this;
        }

        public Criteria andLoveRelationEndLessThan(Date value) {
            addCriterionForJDBCDate("love_relation_end <", value, "loveRelationEnd");
            return (Criteria) this;
        }

        public Criteria andLoveRelationEndLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("love_relation_end <=", value, "loveRelationEnd");
            return (Criteria) this;
        }

        public Criteria andLoveRelationEndIn(List<Date> values) {
            addCriterionForJDBCDate("love_relation_end in", values, "loveRelationEnd");
            return (Criteria) this;
        }

        public Criteria andLoveRelationEndNotIn(List<Date> values) {
            addCriterionForJDBCDate("love_relation_end not in", values, "loveRelationEnd");
            return (Criteria) this;
        }

        public Criteria andLoveRelationEndBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("love_relation_end between", value1, value2, "loveRelationEnd");
            return (Criteria) this;
        }

        public Criteria andLoveRelationEndNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("love_relation_end not between", value1, value2, "loveRelationEnd");
            return (Criteria) this;
        }

        public Criteria andLivingTogetherIsNull() {
            addCriterion("living_together is null");
            return (Criteria) this;
        }

        public Criteria andLivingTogetherIsNotNull() {
            addCriterion("living_together is not null");
            return (Criteria) this;
        }

        public Criteria andLivingTogetherEqualTo(Integer value) {
            addCriterion("living_together =", value, "livingTogether");
            return (Criteria) this;
        }

        public Criteria andLivingTogetherNotEqualTo(Integer value) {
            addCriterion("living_together <>", value, "livingTogether");
            return (Criteria) this;
        }

        public Criteria andLivingTogetherGreaterThan(Integer value) {
            addCriterion("living_together >", value, "livingTogether");
            return (Criteria) this;
        }

        public Criteria andLivingTogetherGreaterThanOrEqualTo(Integer value) {
            addCriterion("living_together >=", value, "livingTogether");
            return (Criteria) this;
        }

        public Criteria andLivingTogetherLessThan(Integer value) {
            addCriterion("living_together <", value, "livingTogether");
            return (Criteria) this;
        }

        public Criteria andLivingTogetherLessThanOrEqualTo(Integer value) {
            addCriterion("living_together <=", value, "livingTogether");
            return (Criteria) this;
        }

        public Criteria andLivingTogetherIn(List<Integer> values) {
            addCriterion("living_together in", values, "livingTogether");
            return (Criteria) this;
        }

        public Criteria andLivingTogetherNotIn(List<Integer> values) {
            addCriterion("living_together not in", values, "livingTogether");
            return (Criteria) this;
        }

        public Criteria andLivingTogetherBetween(Integer value1, Integer value2) {
            addCriterion("living_together between", value1, value2, "livingTogether");
            return (Criteria) this;
        }

        public Criteria andLivingTogetherNotBetween(Integer value1, Integer value2) {
            addCriterion("living_together not between", value1, value2, "livingTogether");
            return (Criteria) this;
        }

        public Criteria andBreakUpReasonIsNull() {
            addCriterion("break_up_reason is null");
            return (Criteria) this;
        }

        public Criteria andBreakUpReasonIsNotNull() {
            addCriterion("break_up_reason is not null");
            return (Criteria) this;
        }

        public Criteria andBreakUpReasonEqualTo(String value) {
            addCriterion("break_up_reason =", value, "breakUpReason");
            return (Criteria) this;
        }

        public Criteria andBreakUpReasonNotEqualTo(String value) {
            addCriterion("break_up_reason <>", value, "breakUpReason");
            return (Criteria) this;
        }

        public Criteria andBreakUpReasonGreaterThan(String value) {
            addCriterion("break_up_reason >", value, "breakUpReason");
            return (Criteria) this;
        }

        public Criteria andBreakUpReasonGreaterThanOrEqualTo(String value) {
            addCriterion("break_up_reason >=", value, "breakUpReason");
            return (Criteria) this;
        }

        public Criteria andBreakUpReasonLessThan(String value) {
            addCriterion("break_up_reason <", value, "breakUpReason");
            return (Criteria) this;
        }

        public Criteria andBreakUpReasonLessThanOrEqualTo(String value) {
            addCriterion("break_up_reason <=", value, "breakUpReason");
            return (Criteria) this;
        }

        public Criteria andBreakUpReasonLike(String value) {
            addCriterion("break_up_reason like", value, "breakUpReason");
            return (Criteria) this;
        }

        public Criteria andBreakUpReasonNotLike(String value) {
            addCriterion("break_up_reason not like", value, "breakUpReason");
            return (Criteria) this;
        }

        public Criteria andBreakUpReasonIn(List<String> values) {
            addCriterion("break_up_reason in", values, "breakUpReason");
            return (Criteria) this;
        }

        public Criteria andBreakUpReasonNotIn(List<String> values) {
            addCriterion("break_up_reason not in", values, "breakUpReason");
            return (Criteria) this;
        }

        public Criteria andBreakUpReasonBetween(String value1, String value2) {
            addCriterion("break_up_reason between", value1, value2, "breakUpReason");
            return (Criteria) this;
        }

        public Criteria andBreakUpReasonNotBetween(String value1, String value2) {
            addCriterion("break_up_reason not between", value1, value2, "breakUpReason");
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