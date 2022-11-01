package com.macro.meedog.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityExample() {
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

        public Criteria andPlaceIdIsNull() {
            addCriterion("place_id is null");
            return (Criteria) this;
        }

        public Criteria andPlaceIdIsNotNull() {
            addCriterion("place_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceIdEqualTo(Long value) {
            addCriterion("place_id =", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdNotEqualTo(Long value) {
            addCriterion("place_id <>", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdGreaterThan(Long value) {
            addCriterion("place_id >", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("place_id >=", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdLessThan(Long value) {
            addCriterion("place_id <", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdLessThanOrEqualTo(Long value) {
            addCriterion("place_id <=", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdIn(List<Long> values) {
            addCriterion("place_id in", values, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdNotIn(List<Long> values) {
            addCriterion("place_id not in", values, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdBetween(Long value1, Long value2) {
            addCriterion("place_id between", value1, value2, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdNotBetween(Long value1, Long value2) {
            addCriterion("place_id not between", value1, value2, "placeId");
            return (Criteria) this;
        }

        public Criteria andUsidIsNull() {
            addCriterion("usid is null");
            return (Criteria) this;
        }

        public Criteria andUsidIsNotNull() {
            addCriterion("usid is not null");
            return (Criteria) this;
        }

        public Criteria andUsidEqualTo(Long value) {
            addCriterion("usid =", value, "usid");
            return (Criteria) this;
        }

        public Criteria andUsidNotEqualTo(Long value) {
            addCriterion("usid <>", value, "usid");
            return (Criteria) this;
        }

        public Criteria andUsidGreaterThan(Long value) {
            addCriterion("usid >", value, "usid");
            return (Criteria) this;
        }

        public Criteria andUsidGreaterThanOrEqualTo(Long value) {
            addCriterion("usid >=", value, "usid");
            return (Criteria) this;
        }

        public Criteria andUsidLessThan(Long value) {
            addCriterion("usid <", value, "usid");
            return (Criteria) this;
        }

        public Criteria andUsidLessThanOrEqualTo(Long value) {
            addCriterion("usid <=", value, "usid");
            return (Criteria) this;
        }

        public Criteria andUsidIn(List<Long> values) {
            addCriterion("usid in", values, "usid");
            return (Criteria) this;
        }

        public Criteria andUsidNotIn(List<Long> values) {
            addCriterion("usid not in", values, "usid");
            return (Criteria) this;
        }

        public Criteria andUsidBetween(Long value1, Long value2) {
            addCriterion("usid between", value1, value2, "usid");
            return (Criteria) this;
        }

        public Criteria andUsidNotBetween(Long value1, Long value2) {
            addCriterion("usid not between", value1, value2, "usid");
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

        public Criteria andUserNickNameIsNull() {
            addCriterion("user_nick_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNickNameIsNotNull() {
            addCriterion("user_nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNickNameEqualTo(String value) {
            addCriterion("user_nick_name =", value, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameNotEqualTo(String value) {
            addCriterion("user_nick_name <>", value, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameGreaterThan(String value) {
            addCriterion("user_nick_name >", value, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_nick_name >=", value, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameLessThan(String value) {
            addCriterion("user_nick_name <", value, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameLessThanOrEqualTo(String value) {
            addCriterion("user_nick_name <=", value, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameLike(String value) {
            addCriterion("user_nick_name like", value, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameNotLike(String value) {
            addCriterion("user_nick_name not like", value, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameIn(List<String> values) {
            addCriterion("user_nick_name in", values, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameNotIn(List<String> values) {
            addCriterion("user_nick_name not in", values, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameBetween(String value1, String value2) {
            addCriterion("user_nick_name between", value1, value2, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameNotBetween(String value1, String value2) {
            addCriterion("user_nick_name not between", value1, value2, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserIconIsNull() {
            addCriterion("user_icon is null");
            return (Criteria) this;
        }

        public Criteria andUserIconIsNotNull() {
            addCriterion("user_icon is not null");
            return (Criteria) this;
        }

        public Criteria andUserIconEqualTo(String value) {
            addCriterion("user_icon =", value, "userIcon");
            return (Criteria) this;
        }

        public Criteria andUserIconNotEqualTo(String value) {
            addCriterion("user_icon <>", value, "userIcon");
            return (Criteria) this;
        }

        public Criteria andUserIconGreaterThan(String value) {
            addCriterion("user_icon >", value, "userIcon");
            return (Criteria) this;
        }

        public Criteria andUserIconGreaterThanOrEqualTo(String value) {
            addCriterion("user_icon >=", value, "userIcon");
            return (Criteria) this;
        }

        public Criteria andUserIconLessThan(String value) {
            addCriterion("user_icon <", value, "userIcon");
            return (Criteria) this;
        }

        public Criteria andUserIconLessThanOrEqualTo(String value) {
            addCriterion("user_icon <=", value, "userIcon");
            return (Criteria) this;
        }

        public Criteria andUserIconLike(String value) {
            addCriterion("user_icon like", value, "userIcon");
            return (Criteria) this;
        }

        public Criteria andUserIconNotLike(String value) {
            addCriterion("user_icon not like", value, "userIcon");
            return (Criteria) this;
        }

        public Criteria andUserIconIn(List<String> values) {
            addCriterion("user_icon in", values, "userIcon");
            return (Criteria) this;
        }

        public Criteria andUserIconNotIn(List<String> values) {
            addCriterion("user_icon not in", values, "userIcon");
            return (Criteria) this;
        }

        public Criteria andUserIconBetween(String value1, String value2) {
            addCriterion("user_icon between", value1, value2, "userIcon");
            return (Criteria) this;
        }

        public Criteria andUserIconNotBetween(String value1, String value2) {
            addCriterion("user_icon not between", value1, value2, "userIcon");
            return (Criteria) this;
        }

        public Criteria andAlipayQrIsNull() {
            addCriterion("alipay_QR is null");
            return (Criteria) this;
        }

        public Criteria andAlipayQrIsNotNull() {
            addCriterion("alipay_QR is not null");
            return (Criteria) this;
        }

        public Criteria andAlipayQrEqualTo(String value) {
            addCriterion("alipay_QR =", value, "alipayQr");
            return (Criteria) this;
        }

        public Criteria andAlipayQrNotEqualTo(String value) {
            addCriterion("alipay_QR <>", value, "alipayQr");
            return (Criteria) this;
        }

        public Criteria andAlipayQrGreaterThan(String value) {
            addCriterion("alipay_QR >", value, "alipayQr");
            return (Criteria) this;
        }

        public Criteria andAlipayQrGreaterThanOrEqualTo(String value) {
            addCriterion("alipay_QR >=", value, "alipayQr");
            return (Criteria) this;
        }

        public Criteria andAlipayQrLessThan(String value) {
            addCriterion("alipay_QR <", value, "alipayQr");
            return (Criteria) this;
        }

        public Criteria andAlipayQrLessThanOrEqualTo(String value) {
            addCriterion("alipay_QR <=", value, "alipayQr");
            return (Criteria) this;
        }

        public Criteria andAlipayQrLike(String value) {
            addCriterion("alipay_QR like", value, "alipayQr");
            return (Criteria) this;
        }

        public Criteria andAlipayQrNotLike(String value) {
            addCriterion("alipay_QR not like", value, "alipayQr");
            return (Criteria) this;
        }

        public Criteria andAlipayQrIn(List<String> values) {
            addCriterion("alipay_QR in", values, "alipayQr");
            return (Criteria) this;
        }

        public Criteria andAlipayQrNotIn(List<String> values) {
            addCriterion("alipay_QR not in", values, "alipayQr");
            return (Criteria) this;
        }

        public Criteria andAlipayQrBetween(String value1, String value2) {
            addCriterion("alipay_QR between", value1, value2, "alipayQr");
            return (Criteria) this;
        }

        public Criteria andAlipayQrNotBetween(String value1, String value2) {
            addCriterion("alipay_QR not between", value1, value2, "alipayQr");
            return (Criteria) this;
        }

        public Criteria andWepayQrIsNull() {
            addCriterion("wepay_QR is null");
            return (Criteria) this;
        }

        public Criteria andWepayQrIsNotNull() {
            addCriterion("wepay_QR is not null");
            return (Criteria) this;
        }

        public Criteria andWepayQrEqualTo(String value) {
            addCriterion("wepay_QR =", value, "wepayQr");
            return (Criteria) this;
        }

        public Criteria andWepayQrNotEqualTo(String value) {
            addCriterion("wepay_QR <>", value, "wepayQr");
            return (Criteria) this;
        }

        public Criteria andWepayQrGreaterThan(String value) {
            addCriterion("wepay_QR >", value, "wepayQr");
            return (Criteria) this;
        }

        public Criteria andWepayQrGreaterThanOrEqualTo(String value) {
            addCriterion("wepay_QR >=", value, "wepayQr");
            return (Criteria) this;
        }

        public Criteria andWepayQrLessThan(String value) {
            addCriterion("wepay_QR <", value, "wepayQr");
            return (Criteria) this;
        }

        public Criteria andWepayQrLessThanOrEqualTo(String value) {
            addCriterion("wepay_QR <=", value, "wepayQr");
            return (Criteria) this;
        }

        public Criteria andWepayQrLike(String value) {
            addCriterion("wepay_QR like", value, "wepayQr");
            return (Criteria) this;
        }

        public Criteria andWepayQrNotLike(String value) {
            addCriterion("wepay_QR not like", value, "wepayQr");
            return (Criteria) this;
        }

        public Criteria andWepayQrIn(List<String> values) {
            addCriterion("wepay_QR in", values, "wepayQr");
            return (Criteria) this;
        }

        public Criteria andWepayQrNotIn(List<String> values) {
            addCriterion("wepay_QR not in", values, "wepayQr");
            return (Criteria) this;
        }

        public Criteria andWepayQrBetween(String value1, String value2) {
            addCriterion("wepay_QR between", value1, value2, "wepayQr");
            return (Criteria) this;
        }

        public Criteria andWepayQrNotBetween(String value1, String value2) {
            addCriterion("wepay_QR not between", value1, value2, "wepayQr");
            return (Criteria) this;
        }

        public Criteria andWechatOfficalLinkIsNull() {
            addCriterion("wechat_offical_link is null");
            return (Criteria) this;
        }

        public Criteria andWechatOfficalLinkIsNotNull() {
            addCriterion("wechat_offical_link is not null");
            return (Criteria) this;
        }

        public Criteria andWechatOfficalLinkEqualTo(String value) {
            addCriterion("wechat_offical_link =", value, "wechatOfficalLink");
            return (Criteria) this;
        }

        public Criteria andWechatOfficalLinkNotEqualTo(String value) {
            addCriterion("wechat_offical_link <>", value, "wechatOfficalLink");
            return (Criteria) this;
        }

        public Criteria andWechatOfficalLinkGreaterThan(String value) {
            addCriterion("wechat_offical_link >", value, "wechatOfficalLink");
            return (Criteria) this;
        }

        public Criteria andWechatOfficalLinkGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_offical_link >=", value, "wechatOfficalLink");
            return (Criteria) this;
        }

        public Criteria andWechatOfficalLinkLessThan(String value) {
            addCriterion("wechat_offical_link <", value, "wechatOfficalLink");
            return (Criteria) this;
        }

        public Criteria andWechatOfficalLinkLessThanOrEqualTo(String value) {
            addCriterion("wechat_offical_link <=", value, "wechatOfficalLink");
            return (Criteria) this;
        }

        public Criteria andWechatOfficalLinkLike(String value) {
            addCriterion("wechat_offical_link like", value, "wechatOfficalLink");
            return (Criteria) this;
        }

        public Criteria andWechatOfficalLinkNotLike(String value) {
            addCriterion("wechat_offical_link not like", value, "wechatOfficalLink");
            return (Criteria) this;
        }

        public Criteria andWechatOfficalLinkIn(List<String> values) {
            addCriterion("wechat_offical_link in", values, "wechatOfficalLink");
            return (Criteria) this;
        }

        public Criteria andWechatOfficalLinkNotIn(List<String> values) {
            addCriterion("wechat_offical_link not in", values, "wechatOfficalLink");
            return (Criteria) this;
        }

        public Criteria andWechatOfficalLinkBetween(String value1, String value2) {
            addCriterion("wechat_offical_link between", value1, value2, "wechatOfficalLink");
            return (Criteria) this;
        }

        public Criteria andWechatOfficalLinkNotBetween(String value1, String value2) {
            addCriterion("wechat_offical_link not between", value1, value2, "wechatOfficalLink");
            return (Criteria) this;
        }

        public Criteria andWechatGroupQrIsNull() {
            addCriterion("wechat_group_QR is null");
            return (Criteria) this;
        }

        public Criteria andWechatGroupQrIsNotNull() {
            addCriterion("wechat_group_QR is not null");
            return (Criteria) this;
        }

        public Criteria andWechatGroupQrEqualTo(String value) {
            addCriterion("wechat_group_QR =", value, "wechatGroupQr");
            return (Criteria) this;
        }

        public Criteria andWechatGroupQrNotEqualTo(String value) {
            addCriterion("wechat_group_QR <>", value, "wechatGroupQr");
            return (Criteria) this;
        }

        public Criteria andWechatGroupQrGreaterThan(String value) {
            addCriterion("wechat_group_QR >", value, "wechatGroupQr");
            return (Criteria) this;
        }

        public Criteria andWechatGroupQrGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_group_QR >=", value, "wechatGroupQr");
            return (Criteria) this;
        }

        public Criteria andWechatGroupQrLessThan(String value) {
            addCriterion("wechat_group_QR <", value, "wechatGroupQr");
            return (Criteria) this;
        }

        public Criteria andWechatGroupQrLessThanOrEqualTo(String value) {
            addCriterion("wechat_group_QR <=", value, "wechatGroupQr");
            return (Criteria) this;
        }

        public Criteria andWechatGroupQrLike(String value) {
            addCriterion("wechat_group_QR like", value, "wechatGroupQr");
            return (Criteria) this;
        }

        public Criteria andWechatGroupQrNotLike(String value) {
            addCriterion("wechat_group_QR not like", value, "wechatGroupQr");
            return (Criteria) this;
        }

        public Criteria andWechatGroupQrIn(List<String> values) {
            addCriterion("wechat_group_QR in", values, "wechatGroupQr");
            return (Criteria) this;
        }

        public Criteria andWechatGroupQrNotIn(List<String> values) {
            addCriterion("wechat_group_QR not in", values, "wechatGroupQr");
            return (Criteria) this;
        }

        public Criteria andWechatGroupQrBetween(String value1, String value2) {
            addCriterion("wechat_group_QR between", value1, value2, "wechatGroupQr");
            return (Criteria) this;
        }

        public Criteria andWechatGroupQrNotBetween(String value1, String value2) {
            addCriterion("wechat_group_QR not between", value1, value2, "wechatGroupQr");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
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

        public Criteria andOrganizerNameIsNull() {
            addCriterion("organizer_name is null");
            return (Criteria) this;
        }

        public Criteria andOrganizerNameIsNotNull() {
            addCriterion("organizer_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizerNameEqualTo(String value) {
            addCriterion("organizer_name =", value, "organizerName");
            return (Criteria) this;
        }

        public Criteria andOrganizerNameNotEqualTo(String value) {
            addCriterion("organizer_name <>", value, "organizerName");
            return (Criteria) this;
        }

        public Criteria andOrganizerNameGreaterThan(String value) {
            addCriterion("organizer_name >", value, "organizerName");
            return (Criteria) this;
        }

        public Criteria andOrganizerNameGreaterThanOrEqualTo(String value) {
            addCriterion("organizer_name >=", value, "organizerName");
            return (Criteria) this;
        }

        public Criteria andOrganizerNameLessThan(String value) {
            addCriterion("organizer_name <", value, "organizerName");
            return (Criteria) this;
        }

        public Criteria andOrganizerNameLessThanOrEqualTo(String value) {
            addCriterion("organizer_name <=", value, "organizerName");
            return (Criteria) this;
        }

        public Criteria andOrganizerNameLike(String value) {
            addCriterion("organizer_name like", value, "organizerName");
            return (Criteria) this;
        }

        public Criteria andOrganizerNameNotLike(String value) {
            addCriterion("organizer_name not like", value, "organizerName");
            return (Criteria) this;
        }

        public Criteria andOrganizerNameIn(List<String> values) {
            addCriterion("organizer_name in", values, "organizerName");
            return (Criteria) this;
        }

        public Criteria andOrganizerNameNotIn(List<String> values) {
            addCriterion("organizer_name not in", values, "organizerName");
            return (Criteria) this;
        }

        public Criteria andOrganizerNameBetween(String value1, String value2) {
            addCriterion("organizer_name between", value1, value2, "organizerName");
            return (Criteria) this;
        }

        public Criteria andOrganizerNameNotBetween(String value1, String value2) {
            addCriterion("organizer_name not between", value1, value2, "organizerName");
            return (Criteria) this;
        }

        public Criteria andOrganizerWechatIsNull() {
            addCriterion("organizer_wechat is null");
            return (Criteria) this;
        }

        public Criteria andOrganizerWechatIsNotNull() {
            addCriterion("organizer_wechat is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizerWechatEqualTo(String value) {
            addCriterion("organizer_wechat =", value, "organizerWechat");
            return (Criteria) this;
        }

        public Criteria andOrganizerWechatNotEqualTo(String value) {
            addCriterion("organizer_wechat <>", value, "organizerWechat");
            return (Criteria) this;
        }

        public Criteria andOrganizerWechatGreaterThan(String value) {
            addCriterion("organizer_wechat >", value, "organizerWechat");
            return (Criteria) this;
        }

        public Criteria andOrganizerWechatGreaterThanOrEqualTo(String value) {
            addCriterion("organizer_wechat >=", value, "organizerWechat");
            return (Criteria) this;
        }

        public Criteria andOrganizerWechatLessThan(String value) {
            addCriterion("organizer_wechat <", value, "organizerWechat");
            return (Criteria) this;
        }

        public Criteria andOrganizerWechatLessThanOrEqualTo(String value) {
            addCriterion("organizer_wechat <=", value, "organizerWechat");
            return (Criteria) this;
        }

        public Criteria andOrganizerWechatLike(String value) {
            addCriterion("organizer_wechat like", value, "organizerWechat");
            return (Criteria) this;
        }

        public Criteria andOrganizerWechatNotLike(String value) {
            addCriterion("organizer_wechat not like", value, "organizerWechat");
            return (Criteria) this;
        }

        public Criteria andOrganizerWechatIn(List<String> values) {
            addCriterion("organizer_wechat in", values, "organizerWechat");
            return (Criteria) this;
        }

        public Criteria andOrganizerWechatNotIn(List<String> values) {
            addCriterion("organizer_wechat not in", values, "organizerWechat");
            return (Criteria) this;
        }

        public Criteria andOrganizerWechatBetween(String value1, String value2) {
            addCriterion("organizer_wechat between", value1, value2, "organizerWechat");
            return (Criteria) this;
        }

        public Criteria andOrganizerWechatNotBetween(String value1, String value2) {
            addCriterion("organizer_wechat not between", value1, value2, "organizerWechat");
            return (Criteria) this;
        }

        public Criteria andOrganizerPhoneIsNull() {
            addCriterion("organizer_phone is null");
            return (Criteria) this;
        }

        public Criteria andOrganizerPhoneIsNotNull() {
            addCriterion("organizer_phone is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizerPhoneEqualTo(String value) {
            addCriterion("organizer_phone =", value, "organizerPhone");
            return (Criteria) this;
        }

        public Criteria andOrganizerPhoneNotEqualTo(String value) {
            addCriterion("organizer_phone <>", value, "organizerPhone");
            return (Criteria) this;
        }

        public Criteria andOrganizerPhoneGreaterThan(String value) {
            addCriterion("organizer_phone >", value, "organizerPhone");
            return (Criteria) this;
        }

        public Criteria andOrganizerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("organizer_phone >=", value, "organizerPhone");
            return (Criteria) this;
        }

        public Criteria andOrganizerPhoneLessThan(String value) {
            addCriterion("organizer_phone <", value, "organizerPhone");
            return (Criteria) this;
        }

        public Criteria andOrganizerPhoneLessThanOrEqualTo(String value) {
            addCriterion("organizer_phone <=", value, "organizerPhone");
            return (Criteria) this;
        }

        public Criteria andOrganizerPhoneLike(String value) {
            addCriterion("organizer_phone like", value, "organizerPhone");
            return (Criteria) this;
        }

        public Criteria andOrganizerPhoneNotLike(String value) {
            addCriterion("organizer_phone not like", value, "organizerPhone");
            return (Criteria) this;
        }

        public Criteria andOrganizerPhoneIn(List<String> values) {
            addCriterion("organizer_phone in", values, "organizerPhone");
            return (Criteria) this;
        }

        public Criteria andOrganizerPhoneNotIn(List<String> values) {
            addCriterion("organizer_phone not in", values, "organizerPhone");
            return (Criteria) this;
        }

        public Criteria andOrganizerPhoneBetween(String value1, String value2) {
            addCriterion("organizer_phone between", value1, value2, "organizerPhone");
            return (Criteria) this;
        }

        public Criteria andOrganizerPhoneNotBetween(String value1, String value2) {
            addCriterion("organizer_phone not between", value1, value2, "organizerPhone");
            return (Criteria) this;
        }

        public Criteria andFactoryStatusIsNull() {
            addCriterion("factory_status is null");
            return (Criteria) this;
        }

        public Criteria andFactoryStatusIsNotNull() {
            addCriterion("factory_status is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryStatusEqualTo(Integer value) {
            addCriterion("factory_status =", value, "factoryStatus");
            return (Criteria) this;
        }

        public Criteria andFactoryStatusNotEqualTo(Integer value) {
            addCriterion("factory_status <>", value, "factoryStatus");
            return (Criteria) this;
        }

        public Criteria andFactoryStatusGreaterThan(Integer value) {
            addCriterion("factory_status >", value, "factoryStatus");
            return (Criteria) this;
        }

        public Criteria andFactoryStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("factory_status >=", value, "factoryStatus");
            return (Criteria) this;
        }

        public Criteria andFactoryStatusLessThan(Integer value) {
            addCriterion("factory_status <", value, "factoryStatus");
            return (Criteria) this;
        }

        public Criteria andFactoryStatusLessThanOrEqualTo(Integer value) {
            addCriterion("factory_status <=", value, "factoryStatus");
            return (Criteria) this;
        }

        public Criteria andFactoryStatusIn(List<Integer> values) {
            addCriterion("factory_status in", values, "factoryStatus");
            return (Criteria) this;
        }

        public Criteria andFactoryStatusNotIn(List<Integer> values) {
            addCriterion("factory_status not in", values, "factoryStatus");
            return (Criteria) this;
        }

        public Criteria andFactoryStatusBetween(Integer value1, Integer value2) {
            addCriterion("factory_status between", value1, value2, "factoryStatus");
            return (Criteria) this;
        }

        public Criteria andFactoryStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("factory_status not between", value1, value2, "factoryStatus");
            return (Criteria) this;
        }

        public Criteria andActivityDescIsNull() {
            addCriterion("activity_desc is null");
            return (Criteria) this;
        }

        public Criteria andActivityDescIsNotNull() {
            addCriterion("activity_desc is not null");
            return (Criteria) this;
        }

        public Criteria andActivityDescEqualTo(String value) {
            addCriterion("activity_desc =", value, "activityDesc");
            return (Criteria) this;
        }

        public Criteria andActivityDescNotEqualTo(String value) {
            addCriterion("activity_desc <>", value, "activityDesc");
            return (Criteria) this;
        }

        public Criteria andActivityDescGreaterThan(String value) {
            addCriterion("activity_desc >", value, "activityDesc");
            return (Criteria) this;
        }

        public Criteria andActivityDescGreaterThanOrEqualTo(String value) {
            addCriterion("activity_desc >=", value, "activityDesc");
            return (Criteria) this;
        }

        public Criteria andActivityDescLessThan(String value) {
            addCriterion("activity_desc <", value, "activityDesc");
            return (Criteria) this;
        }

        public Criteria andActivityDescLessThanOrEqualTo(String value) {
            addCriterion("activity_desc <=", value, "activityDesc");
            return (Criteria) this;
        }

        public Criteria andActivityDescLike(String value) {
            addCriterion("activity_desc like", value, "activityDesc");
            return (Criteria) this;
        }

        public Criteria andActivityDescNotLike(String value) {
            addCriterion("activity_desc not like", value, "activityDesc");
            return (Criteria) this;
        }

        public Criteria andActivityDescIn(List<String> values) {
            addCriterion("activity_desc in", values, "activityDesc");
            return (Criteria) this;
        }

        public Criteria andActivityDescNotIn(List<String> values) {
            addCriterion("activity_desc not in", values, "activityDesc");
            return (Criteria) this;
        }

        public Criteria andActivityDescBetween(String value1, String value2) {
            addCriterion("activity_desc between", value1, value2, "activityDesc");
            return (Criteria) this;
        }

        public Criteria andActivityDescNotBetween(String value1, String value2) {
            addCriterion("activity_desc not between", value1, value2, "activityDesc");
            return (Criteria) this;
        }

        public Criteria andParticipantLimitIsNull() {
            addCriterion("participant_limit is null");
            return (Criteria) this;
        }

        public Criteria andParticipantLimitIsNotNull() {
            addCriterion("participant_limit is not null");
            return (Criteria) this;
        }

        public Criteria andParticipantLimitEqualTo(Integer value) {
            addCriterion("participant_limit =", value, "participantLimit");
            return (Criteria) this;
        }

        public Criteria andParticipantLimitNotEqualTo(Integer value) {
            addCriterion("participant_limit <>", value, "participantLimit");
            return (Criteria) this;
        }

        public Criteria andParticipantLimitGreaterThan(Integer value) {
            addCriterion("participant_limit >", value, "participantLimit");
            return (Criteria) this;
        }

        public Criteria andParticipantLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("participant_limit >=", value, "participantLimit");
            return (Criteria) this;
        }

        public Criteria andParticipantLimitLessThan(Integer value) {
            addCriterion("participant_limit <", value, "participantLimit");
            return (Criteria) this;
        }

        public Criteria andParticipantLimitLessThanOrEqualTo(Integer value) {
            addCriterion("participant_limit <=", value, "participantLimit");
            return (Criteria) this;
        }

        public Criteria andParticipantLimitIn(List<Integer> values) {
            addCriterion("participant_limit in", values, "participantLimit");
            return (Criteria) this;
        }

        public Criteria andParticipantLimitNotIn(List<Integer> values) {
            addCriterion("participant_limit not in", values, "participantLimit");
            return (Criteria) this;
        }

        public Criteria andParticipantLimitBetween(Integer value1, Integer value2) {
            addCriterion("participant_limit between", value1, value2, "participantLimit");
            return (Criteria) this;
        }

        public Criteria andParticipantLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("participant_limit not between", value1, value2, "participantLimit");
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
            addCriterion("start =", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotEqualTo(Date value) {
            addCriterion("start <>", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartGreaterThan(Date value) {
            addCriterion("start >", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartGreaterThanOrEqualTo(Date value) {
            addCriterion("start >=", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartLessThan(Date value) {
            addCriterion("start <", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartLessThanOrEqualTo(Date value) {
            addCriterion("start <=", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartIn(List<Date> values) {
            addCriterion("start in", values, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotIn(List<Date> values) {
            addCriterion("start not in", values, "start");
            return (Criteria) this;
        }

        public Criteria andStartBetween(Date value1, Date value2) {
            addCriterion("start between", value1, value2, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotBetween(Date value1, Date value2) {
            addCriterion("start not between", value1, value2, "start");
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
            addCriterion("end =", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndNotEqualTo(Date value) {
            addCriterion("end <>", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndGreaterThan(Date value) {
            addCriterion("end >", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndGreaterThanOrEqualTo(Date value) {
            addCriterion("end >=", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndLessThan(Date value) {
            addCriterion("end <", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndLessThanOrEqualTo(Date value) {
            addCriterion("end <=", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndIn(List<Date> values) {
            addCriterion("end in", values, "end");
            return (Criteria) this;
        }

        public Criteria andEndNotIn(List<Date> values) {
            addCriterion("end not in", values, "end");
            return (Criteria) this;
        }

        public Criteria andEndBetween(Date value1, Date value2) {
            addCriterion("end between", value1, value2, "end");
            return (Criteria) this;
        }

        public Criteria andEndNotBetween(Date value1, Date value2) {
            addCriterion("end not between", value1, value2, "end");
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