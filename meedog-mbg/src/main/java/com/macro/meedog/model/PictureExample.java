package com.macro.meedog.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PictureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PictureExample() {
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

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(Integer value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(Integer value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(Integer value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(Integer value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(Integer value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<Integer> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<Integer> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(Integer value1, Integer value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andWidthIsNull() {
            addCriterion("width is null");
            return (Criteria) this;
        }

        public Criteria andWidthIsNotNull() {
            addCriterion("width is not null");
            return (Criteria) this;
        }

        public Criteria andWidthEqualTo(Integer value) {
            addCriterion("width =", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotEqualTo(Integer value) {
            addCriterion("width <>", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThan(Integer value) {
            addCriterion("width >", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThanOrEqualTo(Integer value) {
            addCriterion("width >=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThan(Integer value) {
            addCriterion("width <", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThanOrEqualTo(Integer value) {
            addCriterion("width <=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthIn(List<Integer> values) {
            addCriterion("width in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotIn(List<Integer> values) {
            addCriterion("width not in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthBetween(Integer value1, Integer value2) {
            addCriterion("width between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotBetween(Integer value1, Integer value2) {
            addCriterion("width not between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull() {
            addCriterion("size is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("size is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(Integer value) {
            addCriterion("size =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(Integer value) {
            addCriterion("size <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(Integer value) {
            addCriterion("size >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("size >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(Integer value) {
            addCriterion("size <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(Integer value) {
            addCriterion("size <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<Integer> values) {
            addCriterion("size in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<Integer> values) {
            addCriterion("size not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(Integer value1, Integer value2) {
            addCriterion("size between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("size not between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andFileTypeIsNull() {
            addCriterion("file_type is null");
            return (Criteria) this;
        }

        public Criteria andFileTypeIsNotNull() {
            addCriterion("file_type is not null");
            return (Criteria) this;
        }

        public Criteria andFileTypeEqualTo(Integer value) {
            addCriterion("file_type =", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotEqualTo(Integer value) {
            addCriterion("file_type <>", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeGreaterThan(Integer value) {
            addCriterion("file_type >", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("file_type >=", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLessThan(Integer value) {
            addCriterion("file_type <", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLessThanOrEqualTo(Integer value) {
            addCriterion("file_type <=", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeIn(List<Integer> values) {
            addCriterion("file_type in", values, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotIn(List<Integer> values) {
            addCriterion("file_type not in", values, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeBetween(Integer value1, Integer value2) {
            addCriterion("file_type between", value1, value2, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("file_type not between", value1, value2, "fileType");
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

        public Criteria andPicDescIsNull() {
            addCriterion("pic_desc is null");
            return (Criteria) this;
        }

        public Criteria andPicDescIsNotNull() {
            addCriterion("pic_desc is not null");
            return (Criteria) this;
        }

        public Criteria andPicDescEqualTo(String value) {
            addCriterion("pic_desc =", value, "picDesc");
            return (Criteria) this;
        }

        public Criteria andPicDescNotEqualTo(String value) {
            addCriterion("pic_desc <>", value, "picDesc");
            return (Criteria) this;
        }

        public Criteria andPicDescGreaterThan(String value) {
            addCriterion("pic_desc >", value, "picDesc");
            return (Criteria) this;
        }

        public Criteria andPicDescGreaterThanOrEqualTo(String value) {
            addCriterion("pic_desc >=", value, "picDesc");
            return (Criteria) this;
        }

        public Criteria andPicDescLessThan(String value) {
            addCriterion("pic_desc <", value, "picDesc");
            return (Criteria) this;
        }

        public Criteria andPicDescLessThanOrEqualTo(String value) {
            addCriterion("pic_desc <=", value, "picDesc");
            return (Criteria) this;
        }

        public Criteria andPicDescLike(String value) {
            addCriterion("pic_desc like", value, "picDesc");
            return (Criteria) this;
        }

        public Criteria andPicDescNotLike(String value) {
            addCriterion("pic_desc not like", value, "picDesc");
            return (Criteria) this;
        }

        public Criteria andPicDescIn(List<String> values) {
            addCriterion("pic_desc in", values, "picDesc");
            return (Criteria) this;
        }

        public Criteria andPicDescNotIn(List<String> values) {
            addCriterion("pic_desc not in", values, "picDesc");
            return (Criteria) this;
        }

        public Criteria andPicDescBetween(String value1, String value2) {
            addCriterion("pic_desc between", value1, value2, "picDesc");
            return (Criteria) this;
        }

        public Criteria andPicDescNotBetween(String value1, String value2) {
            addCriterion("pic_desc not between", value1, value2, "picDesc");
            return (Criteria) this;
        }

        public Criteria andPicTagsIsNull() {
            addCriterion("pic_tags is null");
            return (Criteria) this;
        }

        public Criteria andPicTagsIsNotNull() {
            addCriterion("pic_tags is not null");
            return (Criteria) this;
        }

        public Criteria andPicTagsEqualTo(String value) {
            addCriterion("pic_tags =", value, "picTags");
            return (Criteria) this;
        }

        public Criteria andPicTagsNotEqualTo(String value) {
            addCriterion("pic_tags <>", value, "picTags");
            return (Criteria) this;
        }

        public Criteria andPicTagsGreaterThan(String value) {
            addCriterion("pic_tags >", value, "picTags");
            return (Criteria) this;
        }

        public Criteria andPicTagsGreaterThanOrEqualTo(String value) {
            addCriterion("pic_tags >=", value, "picTags");
            return (Criteria) this;
        }

        public Criteria andPicTagsLessThan(String value) {
            addCriterion("pic_tags <", value, "picTags");
            return (Criteria) this;
        }

        public Criteria andPicTagsLessThanOrEqualTo(String value) {
            addCriterion("pic_tags <=", value, "picTags");
            return (Criteria) this;
        }

        public Criteria andPicTagsLike(String value) {
            addCriterion("pic_tags like", value, "picTags");
            return (Criteria) this;
        }

        public Criteria andPicTagsNotLike(String value) {
            addCriterion("pic_tags not like", value, "picTags");
            return (Criteria) this;
        }

        public Criteria andPicTagsIn(List<String> values) {
            addCriterion("pic_tags in", values, "picTags");
            return (Criteria) this;
        }

        public Criteria andPicTagsNotIn(List<String> values) {
            addCriterion("pic_tags not in", values, "picTags");
            return (Criteria) this;
        }

        public Criteria andPicTagsBetween(String value1, String value2) {
            addCriterion("pic_tags between", value1, value2, "picTags");
            return (Criteria) this;
        }

        public Criteria andPicTagsNotBetween(String value1, String value2) {
            addCriterion("pic_tags not between", value1, value2, "picTags");
            return (Criteria) this;
        }

        public Criteria andPicMd5IsNull() {
            addCriterion("pic_md5 is null");
            return (Criteria) this;
        }

        public Criteria andPicMd5IsNotNull() {
            addCriterion("pic_md5 is not null");
            return (Criteria) this;
        }

        public Criteria andPicMd5EqualTo(String value) {
            addCriterion("pic_md5 =", value, "picMd5");
            return (Criteria) this;
        }

        public Criteria andPicMd5NotEqualTo(String value) {
            addCriterion("pic_md5 <>", value, "picMd5");
            return (Criteria) this;
        }

        public Criteria andPicMd5GreaterThan(String value) {
            addCriterion("pic_md5 >", value, "picMd5");
            return (Criteria) this;
        }

        public Criteria andPicMd5GreaterThanOrEqualTo(String value) {
            addCriterion("pic_md5 >=", value, "picMd5");
            return (Criteria) this;
        }

        public Criteria andPicMd5LessThan(String value) {
            addCriterion("pic_md5 <", value, "picMd5");
            return (Criteria) this;
        }

        public Criteria andPicMd5LessThanOrEqualTo(String value) {
            addCriterion("pic_md5 <=", value, "picMd5");
            return (Criteria) this;
        }

        public Criteria andPicMd5Like(String value) {
            addCriterion("pic_md5 like", value, "picMd5");
            return (Criteria) this;
        }

        public Criteria andPicMd5NotLike(String value) {
            addCriterion("pic_md5 not like", value, "picMd5");
            return (Criteria) this;
        }

        public Criteria andPicMd5In(List<String> values) {
            addCriterion("pic_md5 in", values, "picMd5");
            return (Criteria) this;
        }

        public Criteria andPicMd5NotIn(List<String> values) {
            addCriterion("pic_md5 not in", values, "picMd5");
            return (Criteria) this;
        }

        public Criteria andPicMd5Between(String value1, String value2) {
            addCriterion("pic_md5 between", value1, value2, "picMd5");
            return (Criteria) this;
        }

        public Criteria andPicMd5NotBetween(String value1, String value2) {
            addCriterion("pic_md5 not between", value1, value2, "picMd5");
            return (Criteria) this;
        }

        public Criteria andPicLshIdIsNull() {
            addCriterion("pic_lsh_id is null");
            return (Criteria) this;
        }

        public Criteria andPicLshIdIsNotNull() {
            addCriterion("pic_lsh_id is not null");
            return (Criteria) this;
        }

        public Criteria andPicLshIdEqualTo(String value) {
            addCriterion("pic_lsh_id =", value, "picLshId");
            return (Criteria) this;
        }

        public Criteria andPicLshIdNotEqualTo(String value) {
            addCriterion("pic_lsh_id <>", value, "picLshId");
            return (Criteria) this;
        }

        public Criteria andPicLshIdGreaterThan(String value) {
            addCriterion("pic_lsh_id >", value, "picLshId");
            return (Criteria) this;
        }

        public Criteria andPicLshIdGreaterThanOrEqualTo(String value) {
            addCriterion("pic_lsh_id >=", value, "picLshId");
            return (Criteria) this;
        }

        public Criteria andPicLshIdLessThan(String value) {
            addCriterion("pic_lsh_id <", value, "picLshId");
            return (Criteria) this;
        }

        public Criteria andPicLshIdLessThanOrEqualTo(String value) {
            addCriterion("pic_lsh_id <=", value, "picLshId");
            return (Criteria) this;
        }

        public Criteria andPicLshIdLike(String value) {
            addCriterion("pic_lsh_id like", value, "picLshId");
            return (Criteria) this;
        }

        public Criteria andPicLshIdNotLike(String value) {
            addCriterion("pic_lsh_id not like", value, "picLshId");
            return (Criteria) this;
        }

        public Criteria andPicLshIdIn(List<String> values) {
            addCriterion("pic_lsh_id in", values, "picLshId");
            return (Criteria) this;
        }

        public Criteria andPicLshIdNotIn(List<String> values) {
            addCriterion("pic_lsh_id not in", values, "picLshId");
            return (Criteria) this;
        }

        public Criteria andPicLshIdBetween(String value1, String value2) {
            addCriterion("pic_lsh_id between", value1, value2, "picLshId");
            return (Criteria) this;
        }

        public Criteria andPicLshIdNotBetween(String value1, String value2) {
            addCriterion("pic_lsh_id not between", value1, value2, "picLshId");
            return (Criteria) this;
        }

        public Criteria andThumbPicIsNull() {
            addCriterion("thumb_pic is null");
            return (Criteria) this;
        }

        public Criteria andThumbPicIsNotNull() {
            addCriterion("thumb_pic is not null");
            return (Criteria) this;
        }

        public Criteria andThumbPicEqualTo(String value) {
            addCriterion("thumb_pic =", value, "thumbPic");
            return (Criteria) this;
        }

        public Criteria andThumbPicNotEqualTo(String value) {
            addCriterion("thumb_pic <>", value, "thumbPic");
            return (Criteria) this;
        }

        public Criteria andThumbPicGreaterThan(String value) {
            addCriterion("thumb_pic >", value, "thumbPic");
            return (Criteria) this;
        }

        public Criteria andThumbPicGreaterThanOrEqualTo(String value) {
            addCriterion("thumb_pic >=", value, "thumbPic");
            return (Criteria) this;
        }

        public Criteria andThumbPicLessThan(String value) {
            addCriterion("thumb_pic <", value, "thumbPic");
            return (Criteria) this;
        }

        public Criteria andThumbPicLessThanOrEqualTo(String value) {
            addCriterion("thumb_pic <=", value, "thumbPic");
            return (Criteria) this;
        }

        public Criteria andThumbPicLike(String value) {
            addCriterion("thumb_pic like", value, "thumbPic");
            return (Criteria) this;
        }

        public Criteria andThumbPicNotLike(String value) {
            addCriterion("thumb_pic not like", value, "thumbPic");
            return (Criteria) this;
        }

        public Criteria andThumbPicIn(List<String> values) {
            addCriterion("thumb_pic in", values, "thumbPic");
            return (Criteria) this;
        }

        public Criteria andThumbPicNotIn(List<String> values) {
            addCriterion("thumb_pic not in", values, "thumbPic");
            return (Criteria) this;
        }

        public Criteria andThumbPicBetween(String value1, String value2) {
            addCriterion("thumb_pic between", value1, value2, "thumbPic");
            return (Criteria) this;
        }

        public Criteria andThumbPicNotBetween(String value1, String value2) {
            addCriterion("thumb_pic not between", value1, value2, "thumbPic");
            return (Criteria) this;
        }

        public Criteria andOrigPicIsNull() {
            addCriterion("orig_pic is null");
            return (Criteria) this;
        }

        public Criteria andOrigPicIsNotNull() {
            addCriterion("orig_pic is not null");
            return (Criteria) this;
        }

        public Criteria andOrigPicEqualTo(String value) {
            addCriterion("orig_pic =", value, "origPic");
            return (Criteria) this;
        }

        public Criteria andOrigPicNotEqualTo(String value) {
            addCriterion("orig_pic <>", value, "origPic");
            return (Criteria) this;
        }

        public Criteria andOrigPicGreaterThan(String value) {
            addCriterion("orig_pic >", value, "origPic");
            return (Criteria) this;
        }

        public Criteria andOrigPicGreaterThanOrEqualTo(String value) {
            addCriterion("orig_pic >=", value, "origPic");
            return (Criteria) this;
        }

        public Criteria andOrigPicLessThan(String value) {
            addCriterion("orig_pic <", value, "origPic");
            return (Criteria) this;
        }

        public Criteria andOrigPicLessThanOrEqualTo(String value) {
            addCriterion("orig_pic <=", value, "origPic");
            return (Criteria) this;
        }

        public Criteria andOrigPicLike(String value) {
            addCriterion("orig_pic like", value, "origPic");
            return (Criteria) this;
        }

        public Criteria andOrigPicNotLike(String value) {
            addCriterion("orig_pic not like", value, "origPic");
            return (Criteria) this;
        }

        public Criteria andOrigPicIn(List<String> values) {
            addCriterion("orig_pic in", values, "origPic");
            return (Criteria) this;
        }

        public Criteria andOrigPicNotIn(List<String> values) {
            addCriterion("orig_pic not in", values, "origPic");
            return (Criteria) this;
        }

        public Criteria andOrigPicBetween(String value1, String value2) {
            addCriterion("orig_pic between", value1, value2, "origPic");
            return (Criteria) this;
        }

        public Criteria andOrigPicNotBetween(String value1, String value2) {
            addCriterion("orig_pic not between", value1, value2, "origPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicIsNull() {
            addCriterion("small_pic is null");
            return (Criteria) this;
        }

        public Criteria andSmallPicIsNotNull() {
            addCriterion("small_pic is not null");
            return (Criteria) this;
        }

        public Criteria andSmallPicEqualTo(String value) {
            addCriterion("small_pic =", value, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicNotEqualTo(String value) {
            addCriterion("small_pic <>", value, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicGreaterThan(String value) {
            addCriterion("small_pic >", value, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicGreaterThanOrEqualTo(String value) {
            addCriterion("small_pic >=", value, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicLessThan(String value) {
            addCriterion("small_pic <", value, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicLessThanOrEqualTo(String value) {
            addCriterion("small_pic <=", value, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicLike(String value) {
            addCriterion("small_pic like", value, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicNotLike(String value) {
            addCriterion("small_pic not like", value, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicIn(List<String> values) {
            addCriterion("small_pic in", values, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicNotIn(List<String> values) {
            addCriterion("small_pic not in", values, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicBetween(String value1, String value2) {
            addCriterion("small_pic between", value1, value2, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicNotBetween(String value1, String value2) {
            addCriterion("small_pic not between", value1, value2, "smallPic");
            return (Criteria) this;
        }

        public Criteria andLargePicIsNull() {
            addCriterion("large_pic is null");
            return (Criteria) this;
        }

        public Criteria andLargePicIsNotNull() {
            addCriterion("large_pic is not null");
            return (Criteria) this;
        }

        public Criteria andLargePicEqualTo(String value) {
            addCriterion("large_pic =", value, "largePic");
            return (Criteria) this;
        }

        public Criteria andLargePicNotEqualTo(String value) {
            addCriterion("large_pic <>", value, "largePic");
            return (Criteria) this;
        }

        public Criteria andLargePicGreaterThan(String value) {
            addCriterion("large_pic >", value, "largePic");
            return (Criteria) this;
        }

        public Criteria andLargePicGreaterThanOrEqualTo(String value) {
            addCriterion("large_pic >=", value, "largePic");
            return (Criteria) this;
        }

        public Criteria andLargePicLessThan(String value) {
            addCriterion("large_pic <", value, "largePic");
            return (Criteria) this;
        }

        public Criteria andLargePicLessThanOrEqualTo(String value) {
            addCriterion("large_pic <=", value, "largePic");
            return (Criteria) this;
        }

        public Criteria andLargePicLike(String value) {
            addCriterion("large_pic like", value, "largePic");
            return (Criteria) this;
        }

        public Criteria andLargePicNotLike(String value) {
            addCriterion("large_pic not like", value, "largePic");
            return (Criteria) this;
        }

        public Criteria andLargePicIn(List<String> values) {
            addCriterion("large_pic in", values, "largePic");
            return (Criteria) this;
        }

        public Criteria andLargePicNotIn(List<String> values) {
            addCriterion("large_pic not in", values, "largePic");
            return (Criteria) this;
        }

        public Criteria andLargePicBetween(String value1, String value2) {
            addCriterion("large_pic between", value1, value2, "largePic");
            return (Criteria) this;
        }

        public Criteria andLargePicNotBetween(String value1, String value2) {
            addCriterion("large_pic not between", value1, value2, "largePic");
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