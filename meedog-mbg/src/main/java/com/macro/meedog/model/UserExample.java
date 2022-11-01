package com.macro.meedog.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUserLevelIdIsNull() {
            addCriterion("user_level_id is null");
            return (Criteria) this;
        }

        public Criteria andUserLevelIdIsNotNull() {
            addCriterion("user_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserLevelIdEqualTo(Long value) {
            addCriterion("user_level_id =", value, "userLevelId");
            return (Criteria) this;
        }

        public Criteria andUserLevelIdNotEqualTo(Long value) {
            addCriterion("user_level_id <>", value, "userLevelId");
            return (Criteria) this;
        }

        public Criteria andUserLevelIdGreaterThan(Long value) {
            addCriterion("user_level_id >", value, "userLevelId");
            return (Criteria) this;
        }

        public Criteria andUserLevelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_level_id >=", value, "userLevelId");
            return (Criteria) this;
        }

        public Criteria andUserLevelIdLessThan(Long value) {
            addCriterion("user_level_id <", value, "userLevelId");
            return (Criteria) this;
        }

        public Criteria andUserLevelIdLessThanOrEqualTo(Long value) {
            addCriterion("user_level_id <=", value, "userLevelId");
            return (Criteria) this;
        }

        public Criteria andUserLevelIdIn(List<Long> values) {
            addCriterion("user_level_id in", values, "userLevelId");
            return (Criteria) this;
        }

        public Criteria andUserLevelIdNotIn(List<Long> values) {
            addCriterion("user_level_id not in", values, "userLevelId");
            return (Criteria) this;
        }

        public Criteria andUserLevelIdBetween(Long value1, Long value2) {
            addCriterion("user_level_id between", value1, value2, "userLevelId");
            return (Criteria) this;
        }

        public Criteria andUserLevelIdNotBetween(Long value1, Long value2) {
            addCriterion("user_level_id not between", value1, value2, "userLevelId");
            return (Criteria) this;
        }

        public Criteria andUserBasicInfoIdIsNull() {
            addCriterion("user_basic_info_id is null");
            return (Criteria) this;
        }

        public Criteria andUserBasicInfoIdIsNotNull() {
            addCriterion("user_basic_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserBasicInfoIdEqualTo(Long value) {
            addCriterion("user_basic_info_id =", value, "userBasicInfoId");
            return (Criteria) this;
        }

        public Criteria andUserBasicInfoIdNotEqualTo(Long value) {
            addCriterion("user_basic_info_id <>", value, "userBasicInfoId");
            return (Criteria) this;
        }

        public Criteria andUserBasicInfoIdGreaterThan(Long value) {
            addCriterion("user_basic_info_id >", value, "userBasicInfoId");
            return (Criteria) this;
        }

        public Criteria andUserBasicInfoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_basic_info_id >=", value, "userBasicInfoId");
            return (Criteria) this;
        }

        public Criteria andUserBasicInfoIdLessThan(Long value) {
            addCriterion("user_basic_info_id <", value, "userBasicInfoId");
            return (Criteria) this;
        }

        public Criteria andUserBasicInfoIdLessThanOrEqualTo(Long value) {
            addCriterion("user_basic_info_id <=", value, "userBasicInfoId");
            return (Criteria) this;
        }

        public Criteria andUserBasicInfoIdIn(List<Long> values) {
            addCriterion("user_basic_info_id in", values, "userBasicInfoId");
            return (Criteria) this;
        }

        public Criteria andUserBasicInfoIdNotIn(List<Long> values) {
            addCriterion("user_basic_info_id not in", values, "userBasicInfoId");
            return (Criteria) this;
        }

        public Criteria andUserBasicInfoIdBetween(Long value1, Long value2) {
            addCriterion("user_basic_info_id between", value1, value2, "userBasicInfoId");
            return (Criteria) this;
        }

        public Criteria andUserBasicInfoIdNotBetween(Long value1, Long value2) {
            addCriterion("user_basic_info_id not between", value1, value2, "userBasicInfoId");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andWechatIsNull() {
            addCriterion("wechat is null");
            return (Criteria) this;
        }

        public Criteria andWechatIsNotNull() {
            addCriterion("wechat is not null");
            return (Criteria) this;
        }

        public Criteria andWechatEqualTo(String value) {
            addCriterion("wechat =", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotEqualTo(String value) {
            addCriterion("wechat <>", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThan(String value) {
            addCriterion("wechat >", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThanOrEqualTo(String value) {
            addCriterion("wechat >=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThan(String value) {
            addCriterion("wechat <", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThanOrEqualTo(String value) {
            addCriterion("wechat <=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLike(String value) {
            addCriterion("wechat like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotLike(String value) {
            addCriterion("wechat not like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatIn(List<String> values) {
            addCriterion("wechat in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotIn(List<String> values) {
            addCriterion("wechat not in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatBetween(String value1, String value2) {
            addCriterion("wechat between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotBetween(String value1, String value2) {
            addCriterion("wechat not between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNull() {
            addCriterion("openid is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("openid is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("openid =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("openid <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("openid >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("openid >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("openid <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("openid <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("openid like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("openid not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("openid in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("openid not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("openid between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("openid not between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andSessionKeyIsNull() {
            addCriterion("session_key is null");
            return (Criteria) this;
        }

        public Criteria andSessionKeyIsNotNull() {
            addCriterion("session_key is not null");
            return (Criteria) this;
        }

        public Criteria andSessionKeyEqualTo(String value) {
            addCriterion("session_key =", value, "sessionKey");
            return (Criteria) this;
        }

        public Criteria andSessionKeyNotEqualTo(String value) {
            addCriterion("session_key <>", value, "sessionKey");
            return (Criteria) this;
        }

        public Criteria andSessionKeyGreaterThan(String value) {
            addCriterion("session_key >", value, "sessionKey");
            return (Criteria) this;
        }

        public Criteria andSessionKeyGreaterThanOrEqualTo(String value) {
            addCriterion("session_key >=", value, "sessionKey");
            return (Criteria) this;
        }

        public Criteria andSessionKeyLessThan(String value) {
            addCriterion("session_key <", value, "sessionKey");
            return (Criteria) this;
        }

        public Criteria andSessionKeyLessThanOrEqualTo(String value) {
            addCriterion("session_key <=", value, "sessionKey");
            return (Criteria) this;
        }

        public Criteria andSessionKeyLike(String value) {
            addCriterion("session_key like", value, "sessionKey");
            return (Criteria) this;
        }

        public Criteria andSessionKeyNotLike(String value) {
            addCriterion("session_key not like", value, "sessionKey");
            return (Criteria) this;
        }

        public Criteria andSessionKeyIn(List<String> values) {
            addCriterion("session_key in", values, "sessionKey");
            return (Criteria) this;
        }

        public Criteria andSessionKeyNotIn(List<String> values) {
            addCriterion("session_key not in", values, "sessionKey");
            return (Criteria) this;
        }

        public Criteria andSessionKeyBetween(String value1, String value2) {
            addCriterion("session_key between", value1, value2, "sessionKey");
            return (Criteria) this;
        }

        public Criteria andSessionKeyNotBetween(String value1, String value2) {
            addCriterion("session_key not between", value1, value2, "sessionKey");
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

        public Criteria andWechatNicknameIsNull() {
            addCriterion("wechat_nickname is null");
            return (Criteria) this;
        }

        public Criteria andWechatNicknameIsNotNull() {
            addCriterion("wechat_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andWechatNicknameEqualTo(String value) {
            addCriterion("wechat_nickname =", value, "wechatNickname");
            return (Criteria) this;
        }

        public Criteria andWechatNicknameNotEqualTo(String value) {
            addCriterion("wechat_nickname <>", value, "wechatNickname");
            return (Criteria) this;
        }

        public Criteria andWechatNicknameGreaterThan(String value) {
            addCriterion("wechat_nickname >", value, "wechatNickname");
            return (Criteria) this;
        }

        public Criteria andWechatNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_nickname >=", value, "wechatNickname");
            return (Criteria) this;
        }

        public Criteria andWechatNicknameLessThan(String value) {
            addCriterion("wechat_nickname <", value, "wechatNickname");
            return (Criteria) this;
        }

        public Criteria andWechatNicknameLessThanOrEqualTo(String value) {
            addCriterion("wechat_nickname <=", value, "wechatNickname");
            return (Criteria) this;
        }

        public Criteria andWechatNicknameLike(String value) {
            addCriterion("wechat_nickname like", value, "wechatNickname");
            return (Criteria) this;
        }

        public Criteria andWechatNicknameNotLike(String value) {
            addCriterion("wechat_nickname not like", value, "wechatNickname");
            return (Criteria) this;
        }

        public Criteria andWechatNicknameIn(List<String> values) {
            addCriterion("wechat_nickname in", values, "wechatNickname");
            return (Criteria) this;
        }

        public Criteria andWechatNicknameNotIn(List<String> values) {
            addCriterion("wechat_nickname not in", values, "wechatNickname");
            return (Criteria) this;
        }

        public Criteria andWechatNicknameBetween(String value1, String value2) {
            addCriterion("wechat_nickname between", value1, value2, "wechatNickname");
            return (Criteria) this;
        }

        public Criteria andWechatNicknameNotBetween(String value1, String value2) {
            addCriterion("wechat_nickname not between", value1, value2, "wechatNickname");
            return (Criteria) this;
        }

        public Criteria andWechatGenderIsNull() {
            addCriterion("wechat_gender is null");
            return (Criteria) this;
        }

        public Criteria andWechatGenderIsNotNull() {
            addCriterion("wechat_gender is not null");
            return (Criteria) this;
        }

        public Criteria andWechatGenderEqualTo(Integer value) {
            addCriterion("wechat_gender =", value, "wechatGender");
            return (Criteria) this;
        }

        public Criteria andWechatGenderNotEqualTo(Integer value) {
            addCriterion("wechat_gender <>", value, "wechatGender");
            return (Criteria) this;
        }

        public Criteria andWechatGenderGreaterThan(Integer value) {
            addCriterion("wechat_gender >", value, "wechatGender");
            return (Criteria) this;
        }

        public Criteria andWechatGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("wechat_gender >=", value, "wechatGender");
            return (Criteria) this;
        }

        public Criteria andWechatGenderLessThan(Integer value) {
            addCriterion("wechat_gender <", value, "wechatGender");
            return (Criteria) this;
        }

        public Criteria andWechatGenderLessThanOrEqualTo(Integer value) {
            addCriterion("wechat_gender <=", value, "wechatGender");
            return (Criteria) this;
        }

        public Criteria andWechatGenderIn(List<Integer> values) {
            addCriterion("wechat_gender in", values, "wechatGender");
            return (Criteria) this;
        }

        public Criteria andWechatGenderNotIn(List<Integer> values) {
            addCriterion("wechat_gender not in", values, "wechatGender");
            return (Criteria) this;
        }

        public Criteria andWechatGenderBetween(Integer value1, Integer value2) {
            addCriterion("wechat_gender between", value1, value2, "wechatGender");
            return (Criteria) this;
        }

        public Criteria andWechatGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("wechat_gender not between", value1, value2, "wechatGender");
            return (Criteria) this;
        }

        public Criteria andWechatLanguageIsNull() {
            addCriterion("wechat_language is null");
            return (Criteria) this;
        }

        public Criteria andWechatLanguageIsNotNull() {
            addCriterion("wechat_language is not null");
            return (Criteria) this;
        }

        public Criteria andWechatLanguageEqualTo(String value) {
            addCriterion("wechat_language =", value, "wechatLanguage");
            return (Criteria) this;
        }

        public Criteria andWechatLanguageNotEqualTo(String value) {
            addCriterion("wechat_language <>", value, "wechatLanguage");
            return (Criteria) this;
        }

        public Criteria andWechatLanguageGreaterThan(String value) {
            addCriterion("wechat_language >", value, "wechatLanguage");
            return (Criteria) this;
        }

        public Criteria andWechatLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_language >=", value, "wechatLanguage");
            return (Criteria) this;
        }

        public Criteria andWechatLanguageLessThan(String value) {
            addCriterion("wechat_language <", value, "wechatLanguage");
            return (Criteria) this;
        }

        public Criteria andWechatLanguageLessThanOrEqualTo(String value) {
            addCriterion("wechat_language <=", value, "wechatLanguage");
            return (Criteria) this;
        }

        public Criteria andWechatLanguageLike(String value) {
            addCriterion("wechat_language like", value, "wechatLanguage");
            return (Criteria) this;
        }

        public Criteria andWechatLanguageNotLike(String value) {
            addCriterion("wechat_language not like", value, "wechatLanguage");
            return (Criteria) this;
        }

        public Criteria andWechatLanguageIn(List<String> values) {
            addCriterion("wechat_language in", values, "wechatLanguage");
            return (Criteria) this;
        }

        public Criteria andWechatLanguageNotIn(List<String> values) {
            addCriterion("wechat_language not in", values, "wechatLanguage");
            return (Criteria) this;
        }

        public Criteria andWechatLanguageBetween(String value1, String value2) {
            addCriterion("wechat_language between", value1, value2, "wechatLanguage");
            return (Criteria) this;
        }

        public Criteria andWechatLanguageNotBetween(String value1, String value2) {
            addCriterion("wechat_language not between", value1, value2, "wechatLanguage");
            return (Criteria) this;
        }

        public Criteria andWechatCityIsNull() {
            addCriterion("wechat_city is null");
            return (Criteria) this;
        }

        public Criteria andWechatCityIsNotNull() {
            addCriterion("wechat_city is not null");
            return (Criteria) this;
        }

        public Criteria andWechatCityEqualTo(String value) {
            addCriterion("wechat_city =", value, "wechatCity");
            return (Criteria) this;
        }

        public Criteria andWechatCityNotEqualTo(String value) {
            addCriterion("wechat_city <>", value, "wechatCity");
            return (Criteria) this;
        }

        public Criteria andWechatCityGreaterThan(String value) {
            addCriterion("wechat_city >", value, "wechatCity");
            return (Criteria) this;
        }

        public Criteria andWechatCityGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_city >=", value, "wechatCity");
            return (Criteria) this;
        }

        public Criteria andWechatCityLessThan(String value) {
            addCriterion("wechat_city <", value, "wechatCity");
            return (Criteria) this;
        }

        public Criteria andWechatCityLessThanOrEqualTo(String value) {
            addCriterion("wechat_city <=", value, "wechatCity");
            return (Criteria) this;
        }

        public Criteria andWechatCityLike(String value) {
            addCriterion("wechat_city like", value, "wechatCity");
            return (Criteria) this;
        }

        public Criteria andWechatCityNotLike(String value) {
            addCriterion("wechat_city not like", value, "wechatCity");
            return (Criteria) this;
        }

        public Criteria andWechatCityIn(List<String> values) {
            addCriterion("wechat_city in", values, "wechatCity");
            return (Criteria) this;
        }

        public Criteria andWechatCityNotIn(List<String> values) {
            addCriterion("wechat_city not in", values, "wechatCity");
            return (Criteria) this;
        }

        public Criteria andWechatCityBetween(String value1, String value2) {
            addCriterion("wechat_city between", value1, value2, "wechatCity");
            return (Criteria) this;
        }

        public Criteria andWechatCityNotBetween(String value1, String value2) {
            addCriterion("wechat_city not between", value1, value2, "wechatCity");
            return (Criteria) this;
        }

        public Criteria andWechatProvinceIsNull() {
            addCriterion("wechat_province is null");
            return (Criteria) this;
        }

        public Criteria andWechatProvinceIsNotNull() {
            addCriterion("wechat_province is not null");
            return (Criteria) this;
        }

        public Criteria andWechatProvinceEqualTo(String value) {
            addCriterion("wechat_province =", value, "wechatProvince");
            return (Criteria) this;
        }

        public Criteria andWechatProvinceNotEqualTo(String value) {
            addCriterion("wechat_province <>", value, "wechatProvince");
            return (Criteria) this;
        }

        public Criteria andWechatProvinceGreaterThan(String value) {
            addCriterion("wechat_province >", value, "wechatProvince");
            return (Criteria) this;
        }

        public Criteria andWechatProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_province >=", value, "wechatProvince");
            return (Criteria) this;
        }

        public Criteria andWechatProvinceLessThan(String value) {
            addCriterion("wechat_province <", value, "wechatProvince");
            return (Criteria) this;
        }

        public Criteria andWechatProvinceLessThanOrEqualTo(String value) {
            addCriterion("wechat_province <=", value, "wechatProvince");
            return (Criteria) this;
        }

        public Criteria andWechatProvinceLike(String value) {
            addCriterion("wechat_province like", value, "wechatProvince");
            return (Criteria) this;
        }

        public Criteria andWechatProvinceNotLike(String value) {
            addCriterion("wechat_province not like", value, "wechatProvince");
            return (Criteria) this;
        }

        public Criteria andWechatProvinceIn(List<String> values) {
            addCriterion("wechat_province in", values, "wechatProvince");
            return (Criteria) this;
        }

        public Criteria andWechatProvinceNotIn(List<String> values) {
            addCriterion("wechat_province not in", values, "wechatProvince");
            return (Criteria) this;
        }

        public Criteria andWechatProvinceBetween(String value1, String value2) {
            addCriterion("wechat_province between", value1, value2, "wechatProvince");
            return (Criteria) this;
        }

        public Criteria andWechatProvinceNotBetween(String value1, String value2) {
            addCriterion("wechat_province not between", value1, value2, "wechatProvince");
            return (Criteria) this;
        }

        public Criteria andWechatCountryIsNull() {
            addCriterion("wechat_country is null");
            return (Criteria) this;
        }

        public Criteria andWechatCountryIsNotNull() {
            addCriterion("wechat_country is not null");
            return (Criteria) this;
        }

        public Criteria andWechatCountryEqualTo(String value) {
            addCriterion("wechat_country =", value, "wechatCountry");
            return (Criteria) this;
        }

        public Criteria andWechatCountryNotEqualTo(String value) {
            addCriterion("wechat_country <>", value, "wechatCountry");
            return (Criteria) this;
        }

        public Criteria andWechatCountryGreaterThan(String value) {
            addCriterion("wechat_country >", value, "wechatCountry");
            return (Criteria) this;
        }

        public Criteria andWechatCountryGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_country >=", value, "wechatCountry");
            return (Criteria) this;
        }

        public Criteria andWechatCountryLessThan(String value) {
            addCriterion("wechat_country <", value, "wechatCountry");
            return (Criteria) this;
        }

        public Criteria andWechatCountryLessThanOrEqualTo(String value) {
            addCriterion("wechat_country <=", value, "wechatCountry");
            return (Criteria) this;
        }

        public Criteria andWechatCountryLike(String value) {
            addCriterion("wechat_country like", value, "wechatCountry");
            return (Criteria) this;
        }

        public Criteria andWechatCountryNotLike(String value) {
            addCriterion("wechat_country not like", value, "wechatCountry");
            return (Criteria) this;
        }

        public Criteria andWechatCountryIn(List<String> values) {
            addCriterion("wechat_country in", values, "wechatCountry");
            return (Criteria) this;
        }

        public Criteria andWechatCountryNotIn(List<String> values) {
            addCriterion("wechat_country not in", values, "wechatCountry");
            return (Criteria) this;
        }

        public Criteria andWechatCountryBetween(String value1, String value2) {
            addCriterion("wechat_country between", value1, value2, "wechatCountry");
            return (Criteria) this;
        }

        public Criteria andWechatCountryNotBetween(String value1, String value2) {
            addCriterion("wechat_country not between", value1, value2, "wechatCountry");
            return (Criteria) this;
        }

        public Criteria andWechatAvatarUrlIsNull() {
            addCriterion("wechat_avatar_url is null");
            return (Criteria) this;
        }

        public Criteria andWechatAvatarUrlIsNotNull() {
            addCriterion("wechat_avatar_url is not null");
            return (Criteria) this;
        }

        public Criteria andWechatAvatarUrlEqualTo(String value) {
            addCriterion("wechat_avatar_url =", value, "wechatAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andWechatAvatarUrlNotEqualTo(String value) {
            addCriterion("wechat_avatar_url <>", value, "wechatAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andWechatAvatarUrlGreaterThan(String value) {
            addCriterion("wechat_avatar_url >", value, "wechatAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andWechatAvatarUrlGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_avatar_url >=", value, "wechatAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andWechatAvatarUrlLessThan(String value) {
            addCriterion("wechat_avatar_url <", value, "wechatAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andWechatAvatarUrlLessThanOrEqualTo(String value) {
            addCriterion("wechat_avatar_url <=", value, "wechatAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andWechatAvatarUrlLike(String value) {
            addCriterion("wechat_avatar_url like", value, "wechatAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andWechatAvatarUrlNotLike(String value) {
            addCriterion("wechat_avatar_url not like", value, "wechatAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andWechatAvatarUrlIn(List<String> values) {
            addCriterion("wechat_avatar_url in", values, "wechatAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andWechatAvatarUrlNotIn(List<String> values) {
            addCriterion("wechat_avatar_url not in", values, "wechatAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andWechatAvatarUrlBetween(String value1, String value2) {
            addCriterion("wechat_avatar_url between", value1, value2, "wechatAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andWechatAvatarUrlNotBetween(String value1, String value2) {
            addCriterion("wechat_avatar_url not between", value1, value2, "wechatAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andWechatSignatureIsNull() {
            addCriterion("wechat_signature is null");
            return (Criteria) this;
        }

        public Criteria andWechatSignatureIsNotNull() {
            addCriterion("wechat_signature is not null");
            return (Criteria) this;
        }

        public Criteria andWechatSignatureEqualTo(String value) {
            addCriterion("wechat_signature =", value, "wechatSignature");
            return (Criteria) this;
        }

        public Criteria andWechatSignatureNotEqualTo(String value) {
            addCriterion("wechat_signature <>", value, "wechatSignature");
            return (Criteria) this;
        }

        public Criteria andWechatSignatureGreaterThan(String value) {
            addCriterion("wechat_signature >", value, "wechatSignature");
            return (Criteria) this;
        }

        public Criteria andWechatSignatureGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_signature >=", value, "wechatSignature");
            return (Criteria) this;
        }

        public Criteria andWechatSignatureLessThan(String value) {
            addCriterion("wechat_signature <", value, "wechatSignature");
            return (Criteria) this;
        }

        public Criteria andWechatSignatureLessThanOrEqualTo(String value) {
            addCriterion("wechat_signature <=", value, "wechatSignature");
            return (Criteria) this;
        }

        public Criteria andWechatSignatureLike(String value) {
            addCriterion("wechat_signature like", value, "wechatSignature");
            return (Criteria) this;
        }

        public Criteria andWechatSignatureNotLike(String value) {
            addCriterion("wechat_signature not like", value, "wechatSignature");
            return (Criteria) this;
        }

        public Criteria andWechatSignatureIn(List<String> values) {
            addCriterion("wechat_signature in", values, "wechatSignature");
            return (Criteria) this;
        }

        public Criteria andWechatSignatureNotIn(List<String> values) {
            addCriterion("wechat_signature not in", values, "wechatSignature");
            return (Criteria) this;
        }

        public Criteria andWechatSignatureBetween(String value1, String value2) {
            addCriterion("wechat_signature between", value1, value2, "wechatSignature");
            return (Criteria) this;
        }

        public Criteria andWechatSignatureNotBetween(String value1, String value2) {
            addCriterion("wechat_signature not between", value1, value2, "wechatSignature");
            return (Criteria) this;
        }

        public Criteria andWechatEncryptedDataIsNull() {
            addCriterion("wechat_encrypted_data is null");
            return (Criteria) this;
        }

        public Criteria andWechatEncryptedDataIsNotNull() {
            addCriterion("wechat_encrypted_data is not null");
            return (Criteria) this;
        }

        public Criteria andWechatEncryptedDataEqualTo(String value) {
            addCriterion("wechat_encrypted_data =", value, "wechatEncryptedData");
            return (Criteria) this;
        }

        public Criteria andWechatEncryptedDataNotEqualTo(String value) {
            addCriterion("wechat_encrypted_data <>", value, "wechatEncryptedData");
            return (Criteria) this;
        }

        public Criteria andWechatEncryptedDataGreaterThan(String value) {
            addCriterion("wechat_encrypted_data >", value, "wechatEncryptedData");
            return (Criteria) this;
        }

        public Criteria andWechatEncryptedDataGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_encrypted_data >=", value, "wechatEncryptedData");
            return (Criteria) this;
        }

        public Criteria andWechatEncryptedDataLessThan(String value) {
            addCriterion("wechat_encrypted_data <", value, "wechatEncryptedData");
            return (Criteria) this;
        }

        public Criteria andWechatEncryptedDataLessThanOrEqualTo(String value) {
            addCriterion("wechat_encrypted_data <=", value, "wechatEncryptedData");
            return (Criteria) this;
        }

        public Criteria andWechatEncryptedDataLike(String value) {
            addCriterion("wechat_encrypted_data like", value, "wechatEncryptedData");
            return (Criteria) this;
        }

        public Criteria andWechatEncryptedDataNotLike(String value) {
            addCriterion("wechat_encrypted_data not like", value, "wechatEncryptedData");
            return (Criteria) this;
        }

        public Criteria andWechatEncryptedDataIn(List<String> values) {
            addCriterion("wechat_encrypted_data in", values, "wechatEncryptedData");
            return (Criteria) this;
        }

        public Criteria andWechatEncryptedDataNotIn(List<String> values) {
            addCriterion("wechat_encrypted_data not in", values, "wechatEncryptedData");
            return (Criteria) this;
        }

        public Criteria andWechatEncryptedDataBetween(String value1, String value2) {
            addCriterion("wechat_encrypted_data between", value1, value2, "wechatEncryptedData");
            return (Criteria) this;
        }

        public Criteria andWechatEncryptedDataNotBetween(String value1, String value2) {
            addCriterion("wechat_encrypted_data not between", value1, value2, "wechatEncryptedData");
            return (Criteria) this;
        }

        public Criteria andWechatIvIsNull() {
            addCriterion("wechat_iv is null");
            return (Criteria) this;
        }

        public Criteria andWechatIvIsNotNull() {
            addCriterion("wechat_iv is not null");
            return (Criteria) this;
        }

        public Criteria andWechatIvEqualTo(String value) {
            addCriterion("wechat_iv =", value, "wechatIv");
            return (Criteria) this;
        }

        public Criteria andWechatIvNotEqualTo(String value) {
            addCriterion("wechat_iv <>", value, "wechatIv");
            return (Criteria) this;
        }

        public Criteria andWechatIvGreaterThan(String value) {
            addCriterion("wechat_iv >", value, "wechatIv");
            return (Criteria) this;
        }

        public Criteria andWechatIvGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_iv >=", value, "wechatIv");
            return (Criteria) this;
        }

        public Criteria andWechatIvLessThan(String value) {
            addCriterion("wechat_iv <", value, "wechatIv");
            return (Criteria) this;
        }

        public Criteria andWechatIvLessThanOrEqualTo(String value) {
            addCriterion("wechat_iv <=", value, "wechatIv");
            return (Criteria) this;
        }

        public Criteria andWechatIvLike(String value) {
            addCriterion("wechat_iv like", value, "wechatIv");
            return (Criteria) this;
        }

        public Criteria andWechatIvNotLike(String value) {
            addCriterion("wechat_iv not like", value, "wechatIv");
            return (Criteria) this;
        }

        public Criteria andWechatIvIn(List<String> values) {
            addCriterion("wechat_iv in", values, "wechatIv");
            return (Criteria) this;
        }

        public Criteria andWechatIvNotIn(List<String> values) {
            addCriterion("wechat_iv not in", values, "wechatIv");
            return (Criteria) this;
        }

        public Criteria andWechatIvBetween(String value1, String value2) {
            addCriterion("wechat_iv between", value1, value2, "wechatIv");
            return (Criteria) this;
        }

        public Criteria andWechatIvNotBetween(String value1, String value2) {
            addCriterion("wechat_iv not between", value1, value2, "wechatIv");
            return (Criteria) this;
        }

        public Criteria andWechatCloudidIsNull() {
            addCriterion("wechat_cloudid is null");
            return (Criteria) this;
        }

        public Criteria andWechatCloudidIsNotNull() {
            addCriterion("wechat_cloudid is not null");
            return (Criteria) this;
        }

        public Criteria andWechatCloudidEqualTo(String value) {
            addCriterion("wechat_cloudid =", value, "wechatCloudid");
            return (Criteria) this;
        }

        public Criteria andWechatCloudidNotEqualTo(String value) {
            addCriterion("wechat_cloudid <>", value, "wechatCloudid");
            return (Criteria) this;
        }

        public Criteria andWechatCloudidGreaterThan(String value) {
            addCriterion("wechat_cloudid >", value, "wechatCloudid");
            return (Criteria) this;
        }

        public Criteria andWechatCloudidGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_cloudid >=", value, "wechatCloudid");
            return (Criteria) this;
        }

        public Criteria andWechatCloudidLessThan(String value) {
            addCriterion("wechat_cloudid <", value, "wechatCloudid");
            return (Criteria) this;
        }

        public Criteria andWechatCloudidLessThanOrEqualTo(String value) {
            addCriterion("wechat_cloudid <=", value, "wechatCloudid");
            return (Criteria) this;
        }

        public Criteria andWechatCloudidLike(String value) {
            addCriterion("wechat_cloudid like", value, "wechatCloudid");
            return (Criteria) this;
        }

        public Criteria andWechatCloudidNotLike(String value) {
            addCriterion("wechat_cloudid not like", value, "wechatCloudid");
            return (Criteria) this;
        }

        public Criteria andWechatCloudidIn(List<String> values) {
            addCriterion("wechat_cloudid in", values, "wechatCloudid");
            return (Criteria) this;
        }

        public Criteria andWechatCloudidNotIn(List<String> values) {
            addCriterion("wechat_cloudid not in", values, "wechatCloudid");
            return (Criteria) this;
        }

        public Criteria andWechatCloudidBetween(String value1, String value2) {
            addCriterion("wechat_cloudid between", value1, value2, "wechatCloudid");
            return (Criteria) this;
        }

        public Criteria andWechatCloudidNotBetween(String value1, String value2) {
            addCriterion("wechat_cloudid not between", value1, value2, "wechatCloudid");
            return (Criteria) this;
        }

        public Criteria andWechatRawDataIsNull() {
            addCriterion("wechat_raw_data is null");
            return (Criteria) this;
        }

        public Criteria andWechatRawDataIsNotNull() {
            addCriterion("wechat_raw_data is not null");
            return (Criteria) this;
        }

        public Criteria andWechatRawDataEqualTo(String value) {
            addCriterion("wechat_raw_data =", value, "wechatRawData");
            return (Criteria) this;
        }

        public Criteria andWechatRawDataNotEqualTo(String value) {
            addCriterion("wechat_raw_data <>", value, "wechatRawData");
            return (Criteria) this;
        }

        public Criteria andWechatRawDataGreaterThan(String value) {
            addCriterion("wechat_raw_data >", value, "wechatRawData");
            return (Criteria) this;
        }

        public Criteria andWechatRawDataGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_raw_data >=", value, "wechatRawData");
            return (Criteria) this;
        }

        public Criteria andWechatRawDataLessThan(String value) {
            addCriterion("wechat_raw_data <", value, "wechatRawData");
            return (Criteria) this;
        }

        public Criteria andWechatRawDataLessThanOrEqualTo(String value) {
            addCriterion("wechat_raw_data <=", value, "wechatRawData");
            return (Criteria) this;
        }

        public Criteria andWechatRawDataLike(String value) {
            addCriterion("wechat_raw_data like", value, "wechatRawData");
            return (Criteria) this;
        }

        public Criteria andWechatRawDataNotLike(String value) {
            addCriterion("wechat_raw_data not like", value, "wechatRawData");
            return (Criteria) this;
        }

        public Criteria andWechatRawDataIn(List<String> values) {
            addCriterion("wechat_raw_data in", values, "wechatRawData");
            return (Criteria) this;
        }

        public Criteria andWechatRawDataNotIn(List<String> values) {
            addCriterion("wechat_raw_data not in", values, "wechatRawData");
            return (Criteria) this;
        }

        public Criteria andWechatRawDataBetween(String value1, String value2) {
            addCriterion("wechat_raw_data between", value1, value2, "wechatRawData");
            return (Criteria) this;
        }

        public Criteria andWechatRawDataNotBetween(String value1, String value2) {
            addCriterion("wechat_raw_data not between", value1, value2, "wechatRawData");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("icon is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("icon is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("icon =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("icon <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("icon >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("icon >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("icon <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("icon <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("icon like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("icon not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("icon in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("icon not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("icon between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("icon not between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIsNull() {
            addCriterion("source_type is null");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIsNotNull() {
            addCriterion("source_type is not null");
            return (Criteria) this;
        }

        public Criteria andSourceTypeEqualTo(Integer value) {
            addCriterion("source_type =", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotEqualTo(Integer value) {
            addCriterion("source_type <>", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeGreaterThan(Integer value) {
            addCriterion("source_type >", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("source_type >=", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLessThan(Integer value) {
            addCriterion("source_type <", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLessThanOrEqualTo(Integer value) {
            addCriterion("source_type <=", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIn(List<Integer> values) {
            addCriterion("source_type in", values, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotIn(List<Integer> values) {
            addCriterion("source_type not in", values, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeBetween(Integer value1, Integer value2) {
            addCriterion("source_type between", value1, value2, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("source_type not between", value1, value2, "sourceType");
            return (Criteria) this;
        }

        public Criteria andIntegrationIsNull() {
            addCriterion("integration is null");
            return (Criteria) this;
        }

        public Criteria andIntegrationIsNotNull() {
            addCriterion("integration is not null");
            return (Criteria) this;
        }

        public Criteria andIntegrationEqualTo(Integer value) {
            addCriterion("integration =", value, "integration");
            return (Criteria) this;
        }

        public Criteria andIntegrationNotEqualTo(Integer value) {
            addCriterion("integration <>", value, "integration");
            return (Criteria) this;
        }

        public Criteria andIntegrationGreaterThan(Integer value) {
            addCriterion("integration >", value, "integration");
            return (Criteria) this;
        }

        public Criteria andIntegrationGreaterThanOrEqualTo(Integer value) {
            addCriterion("integration >=", value, "integration");
            return (Criteria) this;
        }

        public Criteria andIntegrationLessThan(Integer value) {
            addCriterion("integration <", value, "integration");
            return (Criteria) this;
        }

        public Criteria andIntegrationLessThanOrEqualTo(Integer value) {
            addCriterion("integration <=", value, "integration");
            return (Criteria) this;
        }

        public Criteria andIntegrationIn(List<Integer> values) {
            addCriterion("integration in", values, "integration");
            return (Criteria) this;
        }

        public Criteria andIntegrationNotIn(List<Integer> values) {
            addCriterion("integration not in", values, "integration");
            return (Criteria) this;
        }

        public Criteria andIntegrationBetween(Integer value1, Integer value2) {
            addCriterion("integration between", value1, value2, "integration");
            return (Criteria) this;
        }

        public Criteria andIntegrationNotBetween(Integer value1, Integer value2) {
            addCriterion("integration not between", value1, value2, "integration");
            return (Criteria) this;
        }

        public Criteria andGrowthIsNull() {
            addCriterion("growth is null");
            return (Criteria) this;
        }

        public Criteria andGrowthIsNotNull() {
            addCriterion("growth is not null");
            return (Criteria) this;
        }

        public Criteria andGrowthEqualTo(Integer value) {
            addCriterion("growth =", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthNotEqualTo(Integer value) {
            addCriterion("growth <>", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthGreaterThan(Integer value) {
            addCriterion("growth >", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthGreaterThanOrEqualTo(Integer value) {
            addCriterion("growth >=", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthLessThan(Integer value) {
            addCriterion("growth <", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthLessThanOrEqualTo(Integer value) {
            addCriterion("growth <=", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthIn(List<Integer> values) {
            addCriterion("growth in", values, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthNotIn(List<Integer> values) {
            addCriterion("growth not in", values, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthBetween(Integer value1, Integer value2) {
            addCriterion("growth between", value1, value2, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthNotBetween(Integer value1, Integer value2) {
            addCriterion("growth not between", value1, value2, "growth");
            return (Criteria) this;
        }

        public Criteria andLuckyCountIsNull() {
            addCriterion("lucky_count is null");
            return (Criteria) this;
        }

        public Criteria andLuckyCountIsNotNull() {
            addCriterion("lucky_count is not null");
            return (Criteria) this;
        }

        public Criteria andLuckyCountEqualTo(Integer value) {
            addCriterion("lucky_count =", value, "luckyCount");
            return (Criteria) this;
        }

        public Criteria andLuckyCountNotEqualTo(Integer value) {
            addCriterion("lucky_count <>", value, "luckyCount");
            return (Criteria) this;
        }

        public Criteria andLuckyCountGreaterThan(Integer value) {
            addCriterion("lucky_count >", value, "luckyCount");
            return (Criteria) this;
        }

        public Criteria andLuckyCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("lucky_count >=", value, "luckyCount");
            return (Criteria) this;
        }

        public Criteria andLuckyCountLessThan(Integer value) {
            addCriterion("lucky_count <", value, "luckyCount");
            return (Criteria) this;
        }

        public Criteria andLuckyCountLessThanOrEqualTo(Integer value) {
            addCriterion("lucky_count <=", value, "luckyCount");
            return (Criteria) this;
        }

        public Criteria andLuckyCountIn(List<Integer> values) {
            addCriterion("lucky_count in", values, "luckyCount");
            return (Criteria) this;
        }

        public Criteria andLuckyCountNotIn(List<Integer> values) {
            addCriterion("lucky_count not in", values, "luckyCount");
            return (Criteria) this;
        }

        public Criteria andLuckyCountBetween(Integer value1, Integer value2) {
            addCriterion("lucky_count between", value1, value2, "luckyCount");
            return (Criteria) this;
        }

        public Criteria andLuckyCountNotBetween(Integer value1, Integer value2) {
            addCriterion("lucky_count not between", value1, value2, "luckyCount");
            return (Criteria) this;
        }

        public Criteria andHistoryIntegrationIsNull() {
            addCriterion("history_integration is null");
            return (Criteria) this;
        }

        public Criteria andHistoryIntegrationIsNotNull() {
            addCriterion("history_integration is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryIntegrationEqualTo(Integer value) {
            addCriterion("history_integration =", value, "historyIntegration");
            return (Criteria) this;
        }

        public Criteria andHistoryIntegrationNotEqualTo(Integer value) {
            addCriterion("history_integration <>", value, "historyIntegration");
            return (Criteria) this;
        }

        public Criteria andHistoryIntegrationGreaterThan(Integer value) {
            addCriterion("history_integration >", value, "historyIntegration");
            return (Criteria) this;
        }

        public Criteria andHistoryIntegrationGreaterThanOrEqualTo(Integer value) {
            addCriterion("history_integration >=", value, "historyIntegration");
            return (Criteria) this;
        }

        public Criteria andHistoryIntegrationLessThan(Integer value) {
            addCriterion("history_integration <", value, "historyIntegration");
            return (Criteria) this;
        }

        public Criteria andHistoryIntegrationLessThanOrEqualTo(Integer value) {
            addCriterion("history_integration <=", value, "historyIntegration");
            return (Criteria) this;
        }

        public Criteria andHistoryIntegrationIn(List<Integer> values) {
            addCriterion("history_integration in", values, "historyIntegration");
            return (Criteria) this;
        }

        public Criteria andHistoryIntegrationNotIn(List<Integer> values) {
            addCriterion("history_integration not in", values, "historyIntegration");
            return (Criteria) this;
        }

        public Criteria andHistoryIntegrationBetween(Integer value1, Integer value2) {
            addCriterion("history_integration between", value1, value2, "historyIntegration");
            return (Criteria) this;
        }

        public Criteria andHistoryIntegrationNotBetween(Integer value1, Integer value2) {
            addCriterion("history_integration not between", value1, value2, "historyIntegration");
            return (Criteria) this;
        }

        public Criteria andPersonalizedSignatureIsNull() {
            addCriterion("personalized_signature is null");
            return (Criteria) this;
        }

        public Criteria andPersonalizedSignatureIsNotNull() {
            addCriterion("personalized_signature is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalizedSignatureEqualTo(String value) {
            addCriterion("personalized_signature =", value, "personalizedSignature");
            return (Criteria) this;
        }

        public Criteria andPersonalizedSignatureNotEqualTo(String value) {
            addCriterion("personalized_signature <>", value, "personalizedSignature");
            return (Criteria) this;
        }

        public Criteria andPersonalizedSignatureGreaterThan(String value) {
            addCriterion("personalized_signature >", value, "personalizedSignature");
            return (Criteria) this;
        }

        public Criteria andPersonalizedSignatureGreaterThanOrEqualTo(String value) {
            addCriterion("personalized_signature >=", value, "personalizedSignature");
            return (Criteria) this;
        }

        public Criteria andPersonalizedSignatureLessThan(String value) {
            addCriterion("personalized_signature <", value, "personalizedSignature");
            return (Criteria) this;
        }

        public Criteria andPersonalizedSignatureLessThanOrEqualTo(String value) {
            addCriterion("personalized_signature <=", value, "personalizedSignature");
            return (Criteria) this;
        }

        public Criteria andPersonalizedSignatureLike(String value) {
            addCriterion("personalized_signature like", value, "personalizedSignature");
            return (Criteria) this;
        }

        public Criteria andPersonalizedSignatureNotLike(String value) {
            addCriterion("personalized_signature not like", value, "personalizedSignature");
            return (Criteria) this;
        }

        public Criteria andPersonalizedSignatureIn(List<String> values) {
            addCriterion("personalized_signature in", values, "personalizedSignature");
            return (Criteria) this;
        }

        public Criteria andPersonalizedSignatureNotIn(List<String> values) {
            addCriterion("personalized_signature not in", values, "personalizedSignature");
            return (Criteria) this;
        }

        public Criteria andPersonalizedSignatureBetween(String value1, String value2) {
            addCriterion("personalized_signature between", value1, value2, "personalizedSignature");
            return (Criteria) this;
        }

        public Criteria andPersonalizedSignatureNotBetween(String value1, String value2) {
            addCriterion("personalized_signature not between", value1, value2, "personalizedSignature");
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