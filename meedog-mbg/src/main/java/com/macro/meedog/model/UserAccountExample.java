package com.macro.meedog.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserAccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserAccountExample() {
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

        public Criteria andWechatMajorIsNull() {
            addCriterion("wechat_major is null");
            return (Criteria) this;
        }

        public Criteria andWechatMajorIsNotNull() {
            addCriterion("wechat_major is not null");
            return (Criteria) this;
        }

        public Criteria andWechatMajorEqualTo(String value) {
            addCriterion("wechat_major =", value, "wechatMajor");
            return (Criteria) this;
        }

        public Criteria andWechatMajorNotEqualTo(String value) {
            addCriterion("wechat_major <>", value, "wechatMajor");
            return (Criteria) this;
        }

        public Criteria andWechatMajorGreaterThan(String value) {
            addCriterion("wechat_major >", value, "wechatMajor");
            return (Criteria) this;
        }

        public Criteria andWechatMajorGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_major >=", value, "wechatMajor");
            return (Criteria) this;
        }

        public Criteria andWechatMajorLessThan(String value) {
            addCriterion("wechat_major <", value, "wechatMajor");
            return (Criteria) this;
        }

        public Criteria andWechatMajorLessThanOrEqualTo(String value) {
            addCriterion("wechat_major <=", value, "wechatMajor");
            return (Criteria) this;
        }

        public Criteria andWechatMajorLike(String value) {
            addCriterion("wechat_major like", value, "wechatMajor");
            return (Criteria) this;
        }

        public Criteria andWechatMajorNotLike(String value) {
            addCriterion("wechat_major not like", value, "wechatMajor");
            return (Criteria) this;
        }

        public Criteria andWechatMajorIn(List<String> values) {
            addCriterion("wechat_major in", values, "wechatMajor");
            return (Criteria) this;
        }

        public Criteria andWechatMajorNotIn(List<String> values) {
            addCriterion("wechat_major not in", values, "wechatMajor");
            return (Criteria) this;
        }

        public Criteria andWechatMajorBetween(String value1, String value2) {
            addCriterion("wechat_major between", value1, value2, "wechatMajor");
            return (Criteria) this;
        }

        public Criteria andWechatMajorNotBetween(String value1, String value2) {
            addCriterion("wechat_major not between", value1, value2, "wechatMajor");
            return (Criteria) this;
        }

        public Criteria andWechatMinorIsNull() {
            addCriterion("wechat_minor is null");
            return (Criteria) this;
        }

        public Criteria andWechatMinorIsNotNull() {
            addCriterion("wechat_minor is not null");
            return (Criteria) this;
        }

        public Criteria andWechatMinorEqualTo(String value) {
            addCriterion("wechat_minor =", value, "wechatMinor");
            return (Criteria) this;
        }

        public Criteria andWechatMinorNotEqualTo(String value) {
            addCriterion("wechat_minor <>", value, "wechatMinor");
            return (Criteria) this;
        }

        public Criteria andWechatMinorGreaterThan(String value) {
            addCriterion("wechat_minor >", value, "wechatMinor");
            return (Criteria) this;
        }

        public Criteria andWechatMinorGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_minor >=", value, "wechatMinor");
            return (Criteria) this;
        }

        public Criteria andWechatMinorLessThan(String value) {
            addCriterion("wechat_minor <", value, "wechatMinor");
            return (Criteria) this;
        }

        public Criteria andWechatMinorLessThanOrEqualTo(String value) {
            addCriterion("wechat_minor <=", value, "wechatMinor");
            return (Criteria) this;
        }

        public Criteria andWechatMinorLike(String value) {
            addCriterion("wechat_minor like", value, "wechatMinor");
            return (Criteria) this;
        }

        public Criteria andWechatMinorNotLike(String value) {
            addCriterion("wechat_minor not like", value, "wechatMinor");
            return (Criteria) this;
        }

        public Criteria andWechatMinorIn(List<String> values) {
            addCriterion("wechat_minor in", values, "wechatMinor");
            return (Criteria) this;
        }

        public Criteria andWechatMinorNotIn(List<String> values) {
            addCriterion("wechat_minor not in", values, "wechatMinor");
            return (Criteria) this;
        }

        public Criteria andWechatMinorBetween(String value1, String value2) {
            addCriterion("wechat_minor between", value1, value2, "wechatMinor");
            return (Criteria) this;
        }

        public Criteria andWechatMinorNotBetween(String value1, String value2) {
            addCriterion("wechat_minor not between", value1, value2, "wechatMinor");
            return (Criteria) this;
        }

        public Criteria andWechatMiniIsNull() {
            addCriterion("wechat_mini is null");
            return (Criteria) this;
        }

        public Criteria andWechatMiniIsNotNull() {
            addCriterion("wechat_mini is not null");
            return (Criteria) this;
        }

        public Criteria andWechatMiniEqualTo(String value) {
            addCriterion("wechat_mini =", value, "wechatMini");
            return (Criteria) this;
        }

        public Criteria andWechatMiniNotEqualTo(String value) {
            addCriterion("wechat_mini <>", value, "wechatMini");
            return (Criteria) this;
        }

        public Criteria andWechatMiniGreaterThan(String value) {
            addCriterion("wechat_mini >", value, "wechatMini");
            return (Criteria) this;
        }

        public Criteria andWechatMiniGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_mini >=", value, "wechatMini");
            return (Criteria) this;
        }

        public Criteria andWechatMiniLessThan(String value) {
            addCriterion("wechat_mini <", value, "wechatMini");
            return (Criteria) this;
        }

        public Criteria andWechatMiniLessThanOrEqualTo(String value) {
            addCriterion("wechat_mini <=", value, "wechatMini");
            return (Criteria) this;
        }

        public Criteria andWechatMiniLike(String value) {
            addCriterion("wechat_mini like", value, "wechatMini");
            return (Criteria) this;
        }

        public Criteria andWechatMiniNotLike(String value) {
            addCriterion("wechat_mini not like", value, "wechatMini");
            return (Criteria) this;
        }

        public Criteria andWechatMiniIn(List<String> values) {
            addCriterion("wechat_mini in", values, "wechatMini");
            return (Criteria) this;
        }

        public Criteria andWechatMiniNotIn(List<String> values) {
            addCriterion("wechat_mini not in", values, "wechatMini");
            return (Criteria) this;
        }

        public Criteria andWechatMiniBetween(String value1, String value2) {
            addCriterion("wechat_mini between", value1, value2, "wechatMini");
            return (Criteria) this;
        }

        public Criteria andWechatMiniNotBetween(String value1, String value2) {
            addCriterion("wechat_mini not between", value1, value2, "wechatMini");
            return (Criteria) this;
        }

        public Criteria andQqIdIsNull() {
            addCriterion("qq_id is null");
            return (Criteria) this;
        }

        public Criteria andQqIdIsNotNull() {
            addCriterion("qq_id is not null");
            return (Criteria) this;
        }

        public Criteria andQqIdEqualTo(String value) {
            addCriterion("qq_id =", value, "qqId");
            return (Criteria) this;
        }

        public Criteria andQqIdNotEqualTo(String value) {
            addCriterion("qq_id <>", value, "qqId");
            return (Criteria) this;
        }

        public Criteria andQqIdGreaterThan(String value) {
            addCriterion("qq_id >", value, "qqId");
            return (Criteria) this;
        }

        public Criteria andQqIdGreaterThanOrEqualTo(String value) {
            addCriterion("qq_id >=", value, "qqId");
            return (Criteria) this;
        }

        public Criteria andQqIdLessThan(String value) {
            addCriterion("qq_id <", value, "qqId");
            return (Criteria) this;
        }

        public Criteria andQqIdLessThanOrEqualTo(String value) {
            addCriterion("qq_id <=", value, "qqId");
            return (Criteria) this;
        }

        public Criteria andQqIdLike(String value) {
            addCriterion("qq_id like", value, "qqId");
            return (Criteria) this;
        }

        public Criteria andQqIdNotLike(String value) {
            addCriterion("qq_id not like", value, "qqId");
            return (Criteria) this;
        }

        public Criteria andQqIdIn(List<String> values) {
            addCriterion("qq_id in", values, "qqId");
            return (Criteria) this;
        }

        public Criteria andQqIdNotIn(List<String> values) {
            addCriterion("qq_id not in", values, "qqId");
            return (Criteria) this;
        }

        public Criteria andQqIdBetween(String value1, String value2) {
            addCriterion("qq_id between", value1, value2, "qqId");
            return (Criteria) this;
        }

        public Criteria andQqIdNotBetween(String value1, String value2) {
            addCriterion("qq_id not between", value1, value2, "qqId");
            return (Criteria) this;
        }

        public Criteria andDoubanIdIsNull() {
            addCriterion("douban_id is null");
            return (Criteria) this;
        }

        public Criteria andDoubanIdIsNotNull() {
            addCriterion("douban_id is not null");
            return (Criteria) this;
        }

        public Criteria andDoubanIdEqualTo(String value) {
            addCriterion("douban_id =", value, "doubanId");
            return (Criteria) this;
        }

        public Criteria andDoubanIdNotEqualTo(String value) {
            addCriterion("douban_id <>", value, "doubanId");
            return (Criteria) this;
        }

        public Criteria andDoubanIdGreaterThan(String value) {
            addCriterion("douban_id >", value, "doubanId");
            return (Criteria) this;
        }

        public Criteria andDoubanIdGreaterThanOrEqualTo(String value) {
            addCriterion("douban_id >=", value, "doubanId");
            return (Criteria) this;
        }

        public Criteria andDoubanIdLessThan(String value) {
            addCriterion("douban_id <", value, "doubanId");
            return (Criteria) this;
        }

        public Criteria andDoubanIdLessThanOrEqualTo(String value) {
            addCriterion("douban_id <=", value, "doubanId");
            return (Criteria) this;
        }

        public Criteria andDoubanIdLike(String value) {
            addCriterion("douban_id like", value, "doubanId");
            return (Criteria) this;
        }

        public Criteria andDoubanIdNotLike(String value) {
            addCriterion("douban_id not like", value, "doubanId");
            return (Criteria) this;
        }

        public Criteria andDoubanIdIn(List<String> values) {
            addCriterion("douban_id in", values, "doubanId");
            return (Criteria) this;
        }

        public Criteria andDoubanIdNotIn(List<String> values) {
            addCriterion("douban_id not in", values, "doubanId");
            return (Criteria) this;
        }

        public Criteria andDoubanIdBetween(String value1, String value2) {
            addCriterion("douban_id between", value1, value2, "doubanId");
            return (Criteria) this;
        }

        public Criteria andDoubanIdNotBetween(String value1, String value2) {
            addCriterion("douban_id not between", value1, value2, "doubanId");
            return (Criteria) this;
        }

        public Criteria andZhihuIdIsNull() {
            addCriterion("zhihu_id is null");
            return (Criteria) this;
        }

        public Criteria andZhihuIdIsNotNull() {
            addCriterion("zhihu_id is not null");
            return (Criteria) this;
        }

        public Criteria andZhihuIdEqualTo(String value) {
            addCriterion("zhihu_id =", value, "zhihuId");
            return (Criteria) this;
        }

        public Criteria andZhihuIdNotEqualTo(String value) {
            addCriterion("zhihu_id <>", value, "zhihuId");
            return (Criteria) this;
        }

        public Criteria andZhihuIdGreaterThan(String value) {
            addCriterion("zhihu_id >", value, "zhihuId");
            return (Criteria) this;
        }

        public Criteria andZhihuIdGreaterThanOrEqualTo(String value) {
            addCriterion("zhihu_id >=", value, "zhihuId");
            return (Criteria) this;
        }

        public Criteria andZhihuIdLessThan(String value) {
            addCriterion("zhihu_id <", value, "zhihuId");
            return (Criteria) this;
        }

        public Criteria andZhihuIdLessThanOrEqualTo(String value) {
            addCriterion("zhihu_id <=", value, "zhihuId");
            return (Criteria) this;
        }

        public Criteria andZhihuIdLike(String value) {
            addCriterion("zhihu_id like", value, "zhihuId");
            return (Criteria) this;
        }

        public Criteria andZhihuIdNotLike(String value) {
            addCriterion("zhihu_id not like", value, "zhihuId");
            return (Criteria) this;
        }

        public Criteria andZhihuIdIn(List<String> values) {
            addCriterion("zhihu_id in", values, "zhihuId");
            return (Criteria) this;
        }

        public Criteria andZhihuIdNotIn(List<String> values) {
            addCriterion("zhihu_id not in", values, "zhihuId");
            return (Criteria) this;
        }

        public Criteria andZhihuIdBetween(String value1, String value2) {
            addCriterion("zhihu_id between", value1, value2, "zhihuId");
            return (Criteria) this;
        }

        public Criteria andZhihuIdNotBetween(String value1, String value2) {
            addCriterion("zhihu_id not between", value1, value2, "zhihuId");
            return (Criteria) this;
        }

        public Criteria andWeiboIdIsNull() {
            addCriterion("weibo_id is null");
            return (Criteria) this;
        }

        public Criteria andWeiboIdIsNotNull() {
            addCriterion("weibo_id is not null");
            return (Criteria) this;
        }

        public Criteria andWeiboIdEqualTo(String value) {
            addCriterion("weibo_id =", value, "weiboId");
            return (Criteria) this;
        }

        public Criteria andWeiboIdNotEqualTo(String value) {
            addCriterion("weibo_id <>", value, "weiboId");
            return (Criteria) this;
        }

        public Criteria andWeiboIdGreaterThan(String value) {
            addCriterion("weibo_id >", value, "weiboId");
            return (Criteria) this;
        }

        public Criteria andWeiboIdGreaterThanOrEqualTo(String value) {
            addCriterion("weibo_id >=", value, "weiboId");
            return (Criteria) this;
        }

        public Criteria andWeiboIdLessThan(String value) {
            addCriterion("weibo_id <", value, "weiboId");
            return (Criteria) this;
        }

        public Criteria andWeiboIdLessThanOrEqualTo(String value) {
            addCriterion("weibo_id <=", value, "weiboId");
            return (Criteria) this;
        }

        public Criteria andWeiboIdLike(String value) {
            addCriterion("weibo_id like", value, "weiboId");
            return (Criteria) this;
        }

        public Criteria andWeiboIdNotLike(String value) {
            addCriterion("weibo_id not like", value, "weiboId");
            return (Criteria) this;
        }

        public Criteria andWeiboIdIn(List<String> values) {
            addCriterion("weibo_id in", values, "weiboId");
            return (Criteria) this;
        }

        public Criteria andWeiboIdNotIn(List<String> values) {
            addCriterion("weibo_id not in", values, "weiboId");
            return (Criteria) this;
        }

        public Criteria andWeiboIdBetween(String value1, String value2) {
            addCriterion("weibo_id between", value1, value2, "weiboId");
            return (Criteria) this;
        }

        public Criteria andWeiboIdNotBetween(String value1, String value2) {
            addCriterion("weibo_id not between", value1, value2, "weiboId");
            return (Criteria) this;
        }

        public Criteria andDouyinIdIsNull() {
            addCriterion("douyin_id is null");
            return (Criteria) this;
        }

        public Criteria andDouyinIdIsNotNull() {
            addCriterion("douyin_id is not null");
            return (Criteria) this;
        }

        public Criteria andDouyinIdEqualTo(String value) {
            addCriterion("douyin_id =", value, "douyinId");
            return (Criteria) this;
        }

        public Criteria andDouyinIdNotEqualTo(String value) {
            addCriterion("douyin_id <>", value, "douyinId");
            return (Criteria) this;
        }

        public Criteria andDouyinIdGreaterThan(String value) {
            addCriterion("douyin_id >", value, "douyinId");
            return (Criteria) this;
        }

        public Criteria andDouyinIdGreaterThanOrEqualTo(String value) {
            addCriterion("douyin_id >=", value, "douyinId");
            return (Criteria) this;
        }

        public Criteria andDouyinIdLessThan(String value) {
            addCriterion("douyin_id <", value, "douyinId");
            return (Criteria) this;
        }

        public Criteria andDouyinIdLessThanOrEqualTo(String value) {
            addCriterion("douyin_id <=", value, "douyinId");
            return (Criteria) this;
        }

        public Criteria andDouyinIdLike(String value) {
            addCriterion("douyin_id like", value, "douyinId");
            return (Criteria) this;
        }

        public Criteria andDouyinIdNotLike(String value) {
            addCriterion("douyin_id not like", value, "douyinId");
            return (Criteria) this;
        }

        public Criteria andDouyinIdIn(List<String> values) {
            addCriterion("douyin_id in", values, "douyinId");
            return (Criteria) this;
        }

        public Criteria andDouyinIdNotIn(List<String> values) {
            addCriterion("douyin_id not in", values, "douyinId");
            return (Criteria) this;
        }

        public Criteria andDouyinIdBetween(String value1, String value2) {
            addCriterion("douyin_id between", value1, value2, "douyinId");
            return (Criteria) this;
        }

        public Criteria andDouyinIdNotBetween(String value1, String value2) {
            addCriterion("douyin_id not between", value1, value2, "douyinId");
            return (Criteria) this;
        }

        public Criteria andKuaishouIdIsNull() {
            addCriterion("kuaishou_id is null");
            return (Criteria) this;
        }

        public Criteria andKuaishouIdIsNotNull() {
            addCriterion("kuaishou_id is not null");
            return (Criteria) this;
        }

        public Criteria andKuaishouIdEqualTo(String value) {
            addCriterion("kuaishou_id =", value, "kuaishouId");
            return (Criteria) this;
        }

        public Criteria andKuaishouIdNotEqualTo(String value) {
            addCriterion("kuaishou_id <>", value, "kuaishouId");
            return (Criteria) this;
        }

        public Criteria andKuaishouIdGreaterThan(String value) {
            addCriterion("kuaishou_id >", value, "kuaishouId");
            return (Criteria) this;
        }

        public Criteria andKuaishouIdGreaterThanOrEqualTo(String value) {
            addCriterion("kuaishou_id >=", value, "kuaishouId");
            return (Criteria) this;
        }

        public Criteria andKuaishouIdLessThan(String value) {
            addCriterion("kuaishou_id <", value, "kuaishouId");
            return (Criteria) this;
        }

        public Criteria andKuaishouIdLessThanOrEqualTo(String value) {
            addCriterion("kuaishou_id <=", value, "kuaishouId");
            return (Criteria) this;
        }

        public Criteria andKuaishouIdLike(String value) {
            addCriterion("kuaishou_id like", value, "kuaishouId");
            return (Criteria) this;
        }

        public Criteria andKuaishouIdNotLike(String value) {
            addCriterion("kuaishou_id not like", value, "kuaishouId");
            return (Criteria) this;
        }

        public Criteria andKuaishouIdIn(List<String> values) {
            addCriterion("kuaishou_id in", values, "kuaishouId");
            return (Criteria) this;
        }

        public Criteria andKuaishouIdNotIn(List<String> values) {
            addCriterion("kuaishou_id not in", values, "kuaishouId");
            return (Criteria) this;
        }

        public Criteria andKuaishouIdBetween(String value1, String value2) {
            addCriterion("kuaishou_id between", value1, value2, "kuaishouId");
            return (Criteria) this;
        }

        public Criteria andKuaishouIdNotBetween(String value1, String value2) {
            addCriterion("kuaishou_id not between", value1, value2, "kuaishouId");
            return (Criteria) this;
        }

        public Criteria andBilibiliIdIsNull() {
            addCriterion("bilibili_id is null");
            return (Criteria) this;
        }

        public Criteria andBilibiliIdIsNotNull() {
            addCriterion("bilibili_id is not null");
            return (Criteria) this;
        }

        public Criteria andBilibiliIdEqualTo(String value) {
            addCriterion("bilibili_id =", value, "bilibiliId");
            return (Criteria) this;
        }

        public Criteria andBilibiliIdNotEqualTo(String value) {
            addCriterion("bilibili_id <>", value, "bilibiliId");
            return (Criteria) this;
        }

        public Criteria andBilibiliIdGreaterThan(String value) {
            addCriterion("bilibili_id >", value, "bilibiliId");
            return (Criteria) this;
        }

        public Criteria andBilibiliIdGreaterThanOrEqualTo(String value) {
            addCriterion("bilibili_id >=", value, "bilibiliId");
            return (Criteria) this;
        }

        public Criteria andBilibiliIdLessThan(String value) {
            addCriterion("bilibili_id <", value, "bilibiliId");
            return (Criteria) this;
        }

        public Criteria andBilibiliIdLessThanOrEqualTo(String value) {
            addCriterion("bilibili_id <=", value, "bilibiliId");
            return (Criteria) this;
        }

        public Criteria andBilibiliIdLike(String value) {
            addCriterion("bilibili_id like", value, "bilibiliId");
            return (Criteria) this;
        }

        public Criteria andBilibiliIdNotLike(String value) {
            addCriterion("bilibili_id not like", value, "bilibiliId");
            return (Criteria) this;
        }

        public Criteria andBilibiliIdIn(List<String> values) {
            addCriterion("bilibili_id in", values, "bilibiliId");
            return (Criteria) this;
        }

        public Criteria andBilibiliIdNotIn(List<String> values) {
            addCriterion("bilibili_id not in", values, "bilibiliId");
            return (Criteria) this;
        }

        public Criteria andBilibiliIdBetween(String value1, String value2) {
            addCriterion("bilibili_id between", value1, value2, "bilibiliId");
            return (Criteria) this;
        }

        public Criteria andBilibiliIdNotBetween(String value1, String value2) {
            addCriterion("bilibili_id not between", value1, value2, "bilibiliId");
            return (Criteria) this;
        }

        public Criteria andTiktokIdIsNull() {
            addCriterion("tiktok_id is null");
            return (Criteria) this;
        }

        public Criteria andTiktokIdIsNotNull() {
            addCriterion("tiktok_id is not null");
            return (Criteria) this;
        }

        public Criteria andTiktokIdEqualTo(String value) {
            addCriterion("tiktok_id =", value, "tiktokId");
            return (Criteria) this;
        }

        public Criteria andTiktokIdNotEqualTo(String value) {
            addCriterion("tiktok_id <>", value, "tiktokId");
            return (Criteria) this;
        }

        public Criteria andTiktokIdGreaterThan(String value) {
            addCriterion("tiktok_id >", value, "tiktokId");
            return (Criteria) this;
        }

        public Criteria andTiktokIdGreaterThanOrEqualTo(String value) {
            addCriterion("tiktok_id >=", value, "tiktokId");
            return (Criteria) this;
        }

        public Criteria andTiktokIdLessThan(String value) {
            addCriterion("tiktok_id <", value, "tiktokId");
            return (Criteria) this;
        }

        public Criteria andTiktokIdLessThanOrEqualTo(String value) {
            addCriterion("tiktok_id <=", value, "tiktokId");
            return (Criteria) this;
        }

        public Criteria andTiktokIdLike(String value) {
            addCriterion("tiktok_id like", value, "tiktokId");
            return (Criteria) this;
        }

        public Criteria andTiktokIdNotLike(String value) {
            addCriterion("tiktok_id not like", value, "tiktokId");
            return (Criteria) this;
        }

        public Criteria andTiktokIdIn(List<String> values) {
            addCriterion("tiktok_id in", values, "tiktokId");
            return (Criteria) this;
        }

        public Criteria andTiktokIdNotIn(List<String> values) {
            addCriterion("tiktok_id not in", values, "tiktokId");
            return (Criteria) this;
        }

        public Criteria andTiktokIdBetween(String value1, String value2) {
            addCriterion("tiktok_id between", value1, value2, "tiktokId");
            return (Criteria) this;
        }

        public Criteria andTiktokIdNotBetween(String value1, String value2) {
            addCriterion("tiktok_id not between", value1, value2, "tiktokId");
            return (Criteria) this;
        }

        public Criteria andYoutubeIdIsNull() {
            addCriterion("youtube_id is null");
            return (Criteria) this;
        }

        public Criteria andYoutubeIdIsNotNull() {
            addCriterion("youtube_id is not null");
            return (Criteria) this;
        }

        public Criteria andYoutubeIdEqualTo(String value) {
            addCriterion("youtube_id =", value, "youtubeId");
            return (Criteria) this;
        }

        public Criteria andYoutubeIdNotEqualTo(String value) {
            addCriterion("youtube_id <>", value, "youtubeId");
            return (Criteria) this;
        }

        public Criteria andYoutubeIdGreaterThan(String value) {
            addCriterion("youtube_id >", value, "youtubeId");
            return (Criteria) this;
        }

        public Criteria andYoutubeIdGreaterThanOrEqualTo(String value) {
            addCriterion("youtube_id >=", value, "youtubeId");
            return (Criteria) this;
        }

        public Criteria andYoutubeIdLessThan(String value) {
            addCriterion("youtube_id <", value, "youtubeId");
            return (Criteria) this;
        }

        public Criteria andYoutubeIdLessThanOrEqualTo(String value) {
            addCriterion("youtube_id <=", value, "youtubeId");
            return (Criteria) this;
        }

        public Criteria andYoutubeIdLike(String value) {
            addCriterion("youtube_id like", value, "youtubeId");
            return (Criteria) this;
        }

        public Criteria andYoutubeIdNotLike(String value) {
            addCriterion("youtube_id not like", value, "youtubeId");
            return (Criteria) this;
        }

        public Criteria andYoutubeIdIn(List<String> values) {
            addCriterion("youtube_id in", values, "youtubeId");
            return (Criteria) this;
        }

        public Criteria andYoutubeIdNotIn(List<String> values) {
            addCriterion("youtube_id not in", values, "youtubeId");
            return (Criteria) this;
        }

        public Criteria andYoutubeIdBetween(String value1, String value2) {
            addCriterion("youtube_id between", value1, value2, "youtubeId");
            return (Criteria) this;
        }

        public Criteria andYoutubeIdNotBetween(String value1, String value2) {
            addCriterion("youtube_id not between", value1, value2, "youtubeId");
            return (Criteria) this;
        }

        public Criteria andFacebookIdIsNull() {
            addCriterion("facebook_id is null");
            return (Criteria) this;
        }

        public Criteria andFacebookIdIsNotNull() {
            addCriterion("facebook_id is not null");
            return (Criteria) this;
        }

        public Criteria andFacebookIdEqualTo(String value) {
            addCriterion("facebook_id =", value, "facebookId");
            return (Criteria) this;
        }

        public Criteria andFacebookIdNotEqualTo(String value) {
            addCriterion("facebook_id <>", value, "facebookId");
            return (Criteria) this;
        }

        public Criteria andFacebookIdGreaterThan(String value) {
            addCriterion("facebook_id >", value, "facebookId");
            return (Criteria) this;
        }

        public Criteria andFacebookIdGreaterThanOrEqualTo(String value) {
            addCriterion("facebook_id >=", value, "facebookId");
            return (Criteria) this;
        }

        public Criteria andFacebookIdLessThan(String value) {
            addCriterion("facebook_id <", value, "facebookId");
            return (Criteria) this;
        }

        public Criteria andFacebookIdLessThanOrEqualTo(String value) {
            addCriterion("facebook_id <=", value, "facebookId");
            return (Criteria) this;
        }

        public Criteria andFacebookIdLike(String value) {
            addCriterion("facebook_id like", value, "facebookId");
            return (Criteria) this;
        }

        public Criteria andFacebookIdNotLike(String value) {
            addCriterion("facebook_id not like", value, "facebookId");
            return (Criteria) this;
        }

        public Criteria andFacebookIdIn(List<String> values) {
            addCriterion("facebook_id in", values, "facebookId");
            return (Criteria) this;
        }

        public Criteria andFacebookIdNotIn(List<String> values) {
            addCriterion("facebook_id not in", values, "facebookId");
            return (Criteria) this;
        }

        public Criteria andFacebookIdBetween(String value1, String value2) {
            addCriterion("facebook_id between", value1, value2, "facebookId");
            return (Criteria) this;
        }

        public Criteria andFacebookIdNotBetween(String value1, String value2) {
            addCriterion("facebook_id not between", value1, value2, "facebookId");
            return (Criteria) this;
        }

        public Criteria andInstgramIdIsNull() {
            addCriterion("instgram_id is null");
            return (Criteria) this;
        }

        public Criteria andInstgramIdIsNotNull() {
            addCriterion("instgram_id is not null");
            return (Criteria) this;
        }

        public Criteria andInstgramIdEqualTo(String value) {
            addCriterion("instgram_id =", value, "instgramId");
            return (Criteria) this;
        }

        public Criteria andInstgramIdNotEqualTo(String value) {
            addCriterion("instgram_id <>", value, "instgramId");
            return (Criteria) this;
        }

        public Criteria andInstgramIdGreaterThan(String value) {
            addCriterion("instgram_id >", value, "instgramId");
            return (Criteria) this;
        }

        public Criteria andInstgramIdGreaterThanOrEqualTo(String value) {
            addCriterion("instgram_id >=", value, "instgramId");
            return (Criteria) this;
        }

        public Criteria andInstgramIdLessThan(String value) {
            addCriterion("instgram_id <", value, "instgramId");
            return (Criteria) this;
        }

        public Criteria andInstgramIdLessThanOrEqualTo(String value) {
            addCriterion("instgram_id <=", value, "instgramId");
            return (Criteria) this;
        }

        public Criteria andInstgramIdLike(String value) {
            addCriterion("instgram_id like", value, "instgramId");
            return (Criteria) this;
        }

        public Criteria andInstgramIdNotLike(String value) {
            addCriterion("instgram_id not like", value, "instgramId");
            return (Criteria) this;
        }

        public Criteria andInstgramIdIn(List<String> values) {
            addCriterion("instgram_id in", values, "instgramId");
            return (Criteria) this;
        }

        public Criteria andInstgramIdNotIn(List<String> values) {
            addCriterion("instgram_id not in", values, "instgramId");
            return (Criteria) this;
        }

        public Criteria andInstgramIdBetween(String value1, String value2) {
            addCriterion("instgram_id between", value1, value2, "instgramId");
            return (Criteria) this;
        }

        public Criteria andInstgramIdNotBetween(String value1, String value2) {
            addCriterion("instgram_id not between", value1, value2, "instgramId");
            return (Criteria) this;
        }

        public Criteria andTwitterIdIsNull() {
            addCriterion("twitter_id is null");
            return (Criteria) this;
        }

        public Criteria andTwitterIdIsNotNull() {
            addCriterion("twitter_id is not null");
            return (Criteria) this;
        }

        public Criteria andTwitterIdEqualTo(String value) {
            addCriterion("twitter_id =", value, "twitterId");
            return (Criteria) this;
        }

        public Criteria andTwitterIdNotEqualTo(String value) {
            addCriterion("twitter_id <>", value, "twitterId");
            return (Criteria) this;
        }

        public Criteria andTwitterIdGreaterThan(String value) {
            addCriterion("twitter_id >", value, "twitterId");
            return (Criteria) this;
        }

        public Criteria andTwitterIdGreaterThanOrEqualTo(String value) {
            addCriterion("twitter_id >=", value, "twitterId");
            return (Criteria) this;
        }

        public Criteria andTwitterIdLessThan(String value) {
            addCriterion("twitter_id <", value, "twitterId");
            return (Criteria) this;
        }

        public Criteria andTwitterIdLessThanOrEqualTo(String value) {
            addCriterion("twitter_id <=", value, "twitterId");
            return (Criteria) this;
        }

        public Criteria andTwitterIdLike(String value) {
            addCriterion("twitter_id like", value, "twitterId");
            return (Criteria) this;
        }

        public Criteria andTwitterIdNotLike(String value) {
            addCriterion("twitter_id not like", value, "twitterId");
            return (Criteria) this;
        }

        public Criteria andTwitterIdIn(List<String> values) {
            addCriterion("twitter_id in", values, "twitterId");
            return (Criteria) this;
        }

        public Criteria andTwitterIdNotIn(List<String> values) {
            addCriterion("twitter_id not in", values, "twitterId");
            return (Criteria) this;
        }

        public Criteria andTwitterIdBetween(String value1, String value2) {
            addCriterion("twitter_id between", value1, value2, "twitterId");
            return (Criteria) this;
        }

        public Criteria andTwitterIdNotBetween(String value1, String value2) {
            addCriterion("twitter_id not between", value1, value2, "twitterId");
            return (Criteria) this;
        }

        public Criteria andMaimaiIdIsNull() {
            addCriterion("maimai_id is null");
            return (Criteria) this;
        }

        public Criteria andMaimaiIdIsNotNull() {
            addCriterion("maimai_id is not null");
            return (Criteria) this;
        }

        public Criteria andMaimaiIdEqualTo(String value) {
            addCriterion("maimai_id =", value, "maimaiId");
            return (Criteria) this;
        }

        public Criteria andMaimaiIdNotEqualTo(String value) {
            addCriterion("maimai_id <>", value, "maimaiId");
            return (Criteria) this;
        }

        public Criteria andMaimaiIdGreaterThan(String value) {
            addCriterion("maimai_id >", value, "maimaiId");
            return (Criteria) this;
        }

        public Criteria andMaimaiIdGreaterThanOrEqualTo(String value) {
            addCriterion("maimai_id >=", value, "maimaiId");
            return (Criteria) this;
        }

        public Criteria andMaimaiIdLessThan(String value) {
            addCriterion("maimai_id <", value, "maimaiId");
            return (Criteria) this;
        }

        public Criteria andMaimaiIdLessThanOrEqualTo(String value) {
            addCriterion("maimai_id <=", value, "maimaiId");
            return (Criteria) this;
        }

        public Criteria andMaimaiIdLike(String value) {
            addCriterion("maimai_id like", value, "maimaiId");
            return (Criteria) this;
        }

        public Criteria andMaimaiIdNotLike(String value) {
            addCriterion("maimai_id not like", value, "maimaiId");
            return (Criteria) this;
        }

        public Criteria andMaimaiIdIn(List<String> values) {
            addCriterion("maimai_id in", values, "maimaiId");
            return (Criteria) this;
        }

        public Criteria andMaimaiIdNotIn(List<String> values) {
            addCriterion("maimai_id not in", values, "maimaiId");
            return (Criteria) this;
        }

        public Criteria andMaimaiIdBetween(String value1, String value2) {
            addCriterion("maimai_id between", value1, value2, "maimaiId");
            return (Criteria) this;
        }

        public Criteria andMaimaiIdNotBetween(String value1, String value2) {
            addCriterion("maimai_id not between", value1, value2, "maimaiId");
            return (Criteria) this;
        }

        public Criteria andLinkedinIdIsNull() {
            addCriterion("linkedin_id is null");
            return (Criteria) this;
        }

        public Criteria andLinkedinIdIsNotNull() {
            addCriterion("linkedin_id is not null");
            return (Criteria) this;
        }

        public Criteria andLinkedinIdEqualTo(String value) {
            addCriterion("linkedin_id =", value, "linkedinId");
            return (Criteria) this;
        }

        public Criteria andLinkedinIdNotEqualTo(String value) {
            addCriterion("linkedin_id <>", value, "linkedinId");
            return (Criteria) this;
        }

        public Criteria andLinkedinIdGreaterThan(String value) {
            addCriterion("linkedin_id >", value, "linkedinId");
            return (Criteria) this;
        }

        public Criteria andLinkedinIdGreaterThanOrEqualTo(String value) {
            addCriterion("linkedin_id >=", value, "linkedinId");
            return (Criteria) this;
        }

        public Criteria andLinkedinIdLessThan(String value) {
            addCriterion("linkedin_id <", value, "linkedinId");
            return (Criteria) this;
        }

        public Criteria andLinkedinIdLessThanOrEqualTo(String value) {
            addCriterion("linkedin_id <=", value, "linkedinId");
            return (Criteria) this;
        }

        public Criteria andLinkedinIdLike(String value) {
            addCriterion("linkedin_id like", value, "linkedinId");
            return (Criteria) this;
        }

        public Criteria andLinkedinIdNotLike(String value) {
            addCriterion("linkedin_id not like", value, "linkedinId");
            return (Criteria) this;
        }

        public Criteria andLinkedinIdIn(List<String> values) {
            addCriterion("linkedin_id in", values, "linkedinId");
            return (Criteria) this;
        }

        public Criteria andLinkedinIdNotIn(List<String> values) {
            addCriterion("linkedin_id not in", values, "linkedinId");
            return (Criteria) this;
        }

        public Criteria andLinkedinIdBetween(String value1, String value2) {
            addCriterion("linkedin_id between", value1, value2, "linkedinId");
            return (Criteria) this;
        }

        public Criteria andLinkedinIdNotBetween(String value1, String value2) {
            addCriterion("linkedin_id not between", value1, value2, "linkedinId");
            return (Criteria) this;
        }

        public Criteria andPhoneMajorIsNull() {
            addCriterion("phone_major is null");
            return (Criteria) this;
        }

        public Criteria andPhoneMajorIsNotNull() {
            addCriterion("phone_major is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneMajorEqualTo(String value) {
            addCriterion("phone_major =", value, "phoneMajor");
            return (Criteria) this;
        }

        public Criteria andPhoneMajorNotEqualTo(String value) {
            addCriterion("phone_major <>", value, "phoneMajor");
            return (Criteria) this;
        }

        public Criteria andPhoneMajorGreaterThan(String value) {
            addCriterion("phone_major >", value, "phoneMajor");
            return (Criteria) this;
        }

        public Criteria andPhoneMajorGreaterThanOrEqualTo(String value) {
            addCriterion("phone_major >=", value, "phoneMajor");
            return (Criteria) this;
        }

        public Criteria andPhoneMajorLessThan(String value) {
            addCriterion("phone_major <", value, "phoneMajor");
            return (Criteria) this;
        }

        public Criteria andPhoneMajorLessThanOrEqualTo(String value) {
            addCriterion("phone_major <=", value, "phoneMajor");
            return (Criteria) this;
        }

        public Criteria andPhoneMajorLike(String value) {
            addCriterion("phone_major like", value, "phoneMajor");
            return (Criteria) this;
        }

        public Criteria andPhoneMajorNotLike(String value) {
            addCriterion("phone_major not like", value, "phoneMajor");
            return (Criteria) this;
        }

        public Criteria andPhoneMajorIn(List<String> values) {
            addCriterion("phone_major in", values, "phoneMajor");
            return (Criteria) this;
        }

        public Criteria andPhoneMajorNotIn(List<String> values) {
            addCriterion("phone_major not in", values, "phoneMajor");
            return (Criteria) this;
        }

        public Criteria andPhoneMajorBetween(String value1, String value2) {
            addCriterion("phone_major between", value1, value2, "phoneMajor");
            return (Criteria) this;
        }

        public Criteria andPhoneMajorNotBetween(String value1, String value2) {
            addCriterion("phone_major not between", value1, value2, "phoneMajor");
            return (Criteria) this;
        }

        public Criteria andPhoneMinorIsNull() {
            addCriterion("phone_minor is null");
            return (Criteria) this;
        }

        public Criteria andPhoneMinorIsNotNull() {
            addCriterion("phone_minor is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneMinorEqualTo(String value) {
            addCriterion("phone_minor =", value, "phoneMinor");
            return (Criteria) this;
        }

        public Criteria andPhoneMinorNotEqualTo(String value) {
            addCriterion("phone_minor <>", value, "phoneMinor");
            return (Criteria) this;
        }

        public Criteria andPhoneMinorGreaterThan(String value) {
            addCriterion("phone_minor >", value, "phoneMinor");
            return (Criteria) this;
        }

        public Criteria andPhoneMinorGreaterThanOrEqualTo(String value) {
            addCriterion("phone_minor >=", value, "phoneMinor");
            return (Criteria) this;
        }

        public Criteria andPhoneMinorLessThan(String value) {
            addCriterion("phone_minor <", value, "phoneMinor");
            return (Criteria) this;
        }

        public Criteria andPhoneMinorLessThanOrEqualTo(String value) {
            addCriterion("phone_minor <=", value, "phoneMinor");
            return (Criteria) this;
        }

        public Criteria andPhoneMinorLike(String value) {
            addCriterion("phone_minor like", value, "phoneMinor");
            return (Criteria) this;
        }

        public Criteria andPhoneMinorNotLike(String value) {
            addCriterion("phone_minor not like", value, "phoneMinor");
            return (Criteria) this;
        }

        public Criteria andPhoneMinorIn(List<String> values) {
            addCriterion("phone_minor in", values, "phoneMinor");
            return (Criteria) this;
        }

        public Criteria andPhoneMinorNotIn(List<String> values) {
            addCriterion("phone_minor not in", values, "phoneMinor");
            return (Criteria) this;
        }

        public Criteria andPhoneMinorBetween(String value1, String value2) {
            addCriterion("phone_minor between", value1, value2, "phoneMinor");
            return (Criteria) this;
        }

        public Criteria andPhoneMinorNotBetween(String value1, String value2) {
            addCriterion("phone_minor not between", value1, value2, "phoneMinor");
            return (Criteria) this;
        }

        public Criteria andPhoneMiniIsNull() {
            addCriterion("phone_mini is null");
            return (Criteria) this;
        }

        public Criteria andPhoneMiniIsNotNull() {
            addCriterion("phone_mini is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneMiniEqualTo(String value) {
            addCriterion("phone_mini =", value, "phoneMini");
            return (Criteria) this;
        }

        public Criteria andPhoneMiniNotEqualTo(String value) {
            addCriterion("phone_mini <>", value, "phoneMini");
            return (Criteria) this;
        }

        public Criteria andPhoneMiniGreaterThan(String value) {
            addCriterion("phone_mini >", value, "phoneMini");
            return (Criteria) this;
        }

        public Criteria andPhoneMiniGreaterThanOrEqualTo(String value) {
            addCriterion("phone_mini >=", value, "phoneMini");
            return (Criteria) this;
        }

        public Criteria andPhoneMiniLessThan(String value) {
            addCriterion("phone_mini <", value, "phoneMini");
            return (Criteria) this;
        }

        public Criteria andPhoneMiniLessThanOrEqualTo(String value) {
            addCriterion("phone_mini <=", value, "phoneMini");
            return (Criteria) this;
        }

        public Criteria andPhoneMiniLike(String value) {
            addCriterion("phone_mini like", value, "phoneMini");
            return (Criteria) this;
        }

        public Criteria andPhoneMiniNotLike(String value) {
            addCriterion("phone_mini not like", value, "phoneMini");
            return (Criteria) this;
        }

        public Criteria andPhoneMiniIn(List<String> values) {
            addCriterion("phone_mini in", values, "phoneMini");
            return (Criteria) this;
        }

        public Criteria andPhoneMiniNotIn(List<String> values) {
            addCriterion("phone_mini not in", values, "phoneMini");
            return (Criteria) this;
        }

        public Criteria andPhoneMiniBetween(String value1, String value2) {
            addCriterion("phone_mini between", value1, value2, "phoneMini");
            return (Criteria) this;
        }

        public Criteria andPhoneMiniNotBetween(String value1, String value2) {
            addCriterion("phone_mini not between", value1, value2, "phoneMini");
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