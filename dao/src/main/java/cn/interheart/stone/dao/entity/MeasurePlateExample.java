package cn.interheart.stone.dao.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MeasurePlateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public MeasurePlateExample() {
        oredCriteria = new ArrayList<Criteria>();
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(Integer value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(Integer value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(Integer value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(Integer value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<Integer> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<Integer> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(Integer value1, Integer value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNull() {
            addCriterion("product_type is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNotNull() {
            addCriterion("product_type is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeEqualTo(String value) {
            addCriterion("product_type =", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotEqualTo(String value) {
            addCriterion("product_type <>", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThan(String value) {
            addCriterion("product_type >", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThanOrEqualTo(String value) {
            addCriterion("product_type >=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThan(String value) {
            addCriterion("product_type <", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThanOrEqualTo(String value) {
            addCriterion("product_type <=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLike(String value) {
            addCriterion("product_type like", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotLike(String value) {
            addCriterion("product_type not like", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeIn(List<String> values) {
            addCriterion("product_type in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotIn(List<String> values) {
            addCriterion("product_type not in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeBetween(String value1, String value2) {
            addCriterion("product_type between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotBetween(String value1, String value2) {
            addCriterion("product_type not between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andLengthIsNull() {
            addCriterion("length is null");
            return (Criteria) this;
        }

        public Criteria andLengthIsNotNull() {
            addCriterion("length is not null");
            return (Criteria) this;
        }

        public Criteria andLengthEqualTo(String value) {
            addCriterion("length =", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotEqualTo(String value) {
            addCriterion("length <>", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThan(String value) {
            addCriterion("length >", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThanOrEqualTo(String value) {
            addCriterion("length >=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThan(String value) {
            addCriterion("length <", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThanOrEqualTo(String value) {
            addCriterion("length <=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLike(String value) {
            addCriterion("length like", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotLike(String value) {
            addCriterion("length not like", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthIn(List<String> values) {
            addCriterion("length in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotIn(List<String> values) {
            addCriterion("length not in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthBetween(String value1, String value2) {
            addCriterion("length between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotBetween(String value1, String value2) {
            addCriterion("length not between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andWindthIsNull() {
            addCriterion("windth is null");
            return (Criteria) this;
        }

        public Criteria andWindthIsNotNull() {
            addCriterion("windth is not null");
            return (Criteria) this;
        }

        public Criteria andWindthEqualTo(String value) {
            addCriterion("windth =", value, "windth");
            return (Criteria) this;
        }

        public Criteria andWindthNotEqualTo(String value) {
            addCriterion("windth <>", value, "windth");
            return (Criteria) this;
        }

        public Criteria andWindthGreaterThan(String value) {
            addCriterion("windth >", value, "windth");
            return (Criteria) this;
        }

        public Criteria andWindthGreaterThanOrEqualTo(String value) {
            addCriterion("windth >=", value, "windth");
            return (Criteria) this;
        }

        public Criteria andWindthLessThan(String value) {
            addCriterion("windth <", value, "windth");
            return (Criteria) this;
        }

        public Criteria andWindthLessThanOrEqualTo(String value) {
            addCriterion("windth <=", value, "windth");
            return (Criteria) this;
        }

        public Criteria andWindthLike(String value) {
            addCriterion("windth like", value, "windth");
            return (Criteria) this;
        }

        public Criteria andWindthNotLike(String value) {
            addCriterion("windth not like", value, "windth");
            return (Criteria) this;
        }

        public Criteria andWindthIn(List<String> values) {
            addCriterion("windth in", values, "windth");
            return (Criteria) this;
        }

        public Criteria andWindthNotIn(List<String> values) {
            addCriterion("windth not in", values, "windth");
            return (Criteria) this;
        }

        public Criteria andWindthBetween(String value1, String value2) {
            addCriterion("windth between", value1, value2, "windth");
            return (Criteria) this;
        }

        public Criteria andWindthNotBetween(String value1, String value2) {
            addCriterion("windth not between", value1, value2, "windth");
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

        public Criteria andHeightEqualTo(String value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(String value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(String value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(String value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(String value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(String value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLike(String value) {
            addCriterion("height like", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotLike(String value) {
            addCriterion("height not like", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<String> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<String> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(String value1, String value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(String value1, String value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(String value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(String value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(String value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(String value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(String value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(String value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLike(String value) {
            addCriterion("number like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotLike(String value) {
            addCriterion("number not like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<String> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<String> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(String value1, String value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(String value1, String value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andProcessModeIsNull() {
            addCriterion("process_mode is null");
            return (Criteria) this;
        }

        public Criteria andProcessModeIsNotNull() {
            addCriterion("process_mode is not null");
            return (Criteria) this;
        }

        public Criteria andProcessModeEqualTo(String value) {
            addCriterion("process_mode =", value, "processMode");
            return (Criteria) this;
        }

        public Criteria andProcessModeNotEqualTo(String value) {
            addCriterion("process_mode <>", value, "processMode");
            return (Criteria) this;
        }

        public Criteria andProcessModeGreaterThan(String value) {
            addCriterion("process_mode >", value, "processMode");
            return (Criteria) this;
        }

        public Criteria andProcessModeGreaterThanOrEqualTo(String value) {
            addCriterion("process_mode >=", value, "processMode");
            return (Criteria) this;
        }

        public Criteria andProcessModeLessThan(String value) {
            addCriterion("process_mode <", value, "processMode");
            return (Criteria) this;
        }

        public Criteria andProcessModeLessThanOrEqualTo(String value) {
            addCriterion("process_mode <=", value, "processMode");
            return (Criteria) this;
        }

        public Criteria andProcessModeLike(String value) {
            addCriterion("process_mode like", value, "processMode");
            return (Criteria) this;
        }

        public Criteria andProcessModeNotLike(String value) {
            addCriterion("process_mode not like", value, "processMode");
            return (Criteria) this;
        }

        public Criteria andProcessModeIn(List<String> values) {
            addCriterion("process_mode in", values, "processMode");
            return (Criteria) this;
        }

        public Criteria andProcessModeNotIn(List<String> values) {
            addCriterion("process_mode not in", values, "processMode");
            return (Criteria) this;
        }

        public Criteria andProcessModeBetween(String value1, String value2) {
            addCriterion("process_mode between", value1, value2, "processMode");
            return (Criteria) this;
        }

        public Criteria andProcessModeNotBetween(String value1, String value2) {
            addCriterion("process_mode not between", value1, value2, "processMode");
            return (Criteria) this;
        }

        public Criteria andProcessInstructionIsNull() {
            addCriterion("process_instruction is null");
            return (Criteria) this;
        }

        public Criteria andProcessInstructionIsNotNull() {
            addCriterion("process_instruction is not null");
            return (Criteria) this;
        }

        public Criteria andProcessInstructionEqualTo(String value) {
            addCriterion("process_instruction =", value, "processInstruction");
            return (Criteria) this;
        }

        public Criteria andProcessInstructionNotEqualTo(String value) {
            addCriterion("process_instruction <>", value, "processInstruction");
            return (Criteria) this;
        }

        public Criteria andProcessInstructionGreaterThan(String value) {
            addCriterion("process_instruction >", value, "processInstruction");
            return (Criteria) this;
        }

        public Criteria andProcessInstructionGreaterThanOrEqualTo(String value) {
            addCriterion("process_instruction >=", value, "processInstruction");
            return (Criteria) this;
        }

        public Criteria andProcessInstructionLessThan(String value) {
            addCriterion("process_instruction <", value, "processInstruction");
            return (Criteria) this;
        }

        public Criteria andProcessInstructionLessThanOrEqualTo(String value) {
            addCriterion("process_instruction <=", value, "processInstruction");
            return (Criteria) this;
        }

        public Criteria andProcessInstructionLike(String value) {
            addCriterion("process_instruction like", value, "processInstruction");
            return (Criteria) this;
        }

        public Criteria andProcessInstructionNotLike(String value) {
            addCriterion("process_instruction not like", value, "processInstruction");
            return (Criteria) this;
        }

        public Criteria andProcessInstructionIn(List<String> values) {
            addCriterion("process_instruction in", values, "processInstruction");
            return (Criteria) this;
        }

        public Criteria andProcessInstructionNotIn(List<String> values) {
            addCriterion("process_instruction not in", values, "processInstruction");
            return (Criteria) this;
        }

        public Criteria andProcessInstructionBetween(String value1, String value2) {
            addCriterion("process_instruction between", value1, value2, "processInstruction");
            return (Criteria) this;
        }

        public Criteria andProcessInstructionNotBetween(String value1, String value2) {
            addCriterion("process_instruction not between", value1, value2, "processInstruction");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andImageIdIsNull() {
            addCriterion("image_id is null");
            return (Criteria) this;
        }

        public Criteria andImageIdIsNotNull() {
            addCriterion("image_id is not null");
            return (Criteria) this;
        }

        public Criteria andImageIdEqualTo(String value) {
            addCriterion("image_id =", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdNotEqualTo(String value) {
            addCriterion("image_id <>", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdGreaterThan(String value) {
            addCriterion("image_id >", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdGreaterThanOrEqualTo(String value) {
            addCriterion("image_id >=", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdLessThan(String value) {
            addCriterion("image_id <", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdLessThanOrEqualTo(String value) {
            addCriterion("image_id <=", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdLike(String value) {
            addCriterion("image_id like", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdNotLike(String value) {
            addCriterion("image_id not like", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdIn(List<String> values) {
            addCriterion("image_id in", values, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdNotIn(List<String> values) {
            addCriterion("image_id not in", values, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdBetween(String value1, String value2) {
            addCriterion("image_id between", value1, value2, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdNotBetween(String value1, String value2) {
            addCriterion("image_id not between", value1, value2, "imageId");
            return (Criteria) this;
        }

        public Criteria andMaterialCostIsNull() {
            addCriterion("material_cost is null");
            return (Criteria) this;
        }

        public Criteria andMaterialCostIsNotNull() {
            addCriterion("material_cost is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialCostEqualTo(BigDecimal value) {
            addCriterion("material_cost =", value, "materialCost");
            return (Criteria) this;
        }

        public Criteria andMaterialCostNotEqualTo(BigDecimal value) {
            addCriterion("material_cost <>", value, "materialCost");
            return (Criteria) this;
        }

        public Criteria andMaterialCostGreaterThan(BigDecimal value) {
            addCriterion("material_cost >", value, "materialCost");
            return (Criteria) this;
        }

        public Criteria andMaterialCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("material_cost >=", value, "materialCost");
            return (Criteria) this;
        }

        public Criteria andMaterialCostLessThan(BigDecimal value) {
            addCriterion("material_cost <", value, "materialCost");
            return (Criteria) this;
        }

        public Criteria andMaterialCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("material_cost <=", value, "materialCost");
            return (Criteria) this;
        }

        public Criteria andMaterialCostIn(List<BigDecimal> values) {
            addCriterion("material_cost in", values, "materialCost");
            return (Criteria) this;
        }

        public Criteria andMaterialCostNotIn(List<BigDecimal> values) {
            addCriterion("material_cost not in", values, "materialCost");
            return (Criteria) this;
        }

        public Criteria andMaterialCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("material_cost between", value1, value2, "materialCost");
            return (Criteria) this;
        }

        public Criteria andMaterialCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("material_cost not between", value1, value2, "materialCost");
            return (Criteria) this;
        }

        public Criteria andProcessCostIsNull() {
            addCriterion("process_cost is null");
            return (Criteria) this;
        }

        public Criteria andProcessCostIsNotNull() {
            addCriterion("process_cost is not null");
            return (Criteria) this;
        }

        public Criteria andProcessCostEqualTo(BigDecimal value) {
            addCriterion("process_cost =", value, "processCost");
            return (Criteria) this;
        }

        public Criteria andProcessCostNotEqualTo(BigDecimal value) {
            addCriterion("process_cost <>", value, "processCost");
            return (Criteria) this;
        }

        public Criteria andProcessCostGreaterThan(BigDecimal value) {
            addCriterion("process_cost >", value, "processCost");
            return (Criteria) this;
        }

        public Criteria andProcessCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("process_cost >=", value, "processCost");
            return (Criteria) this;
        }

        public Criteria andProcessCostLessThan(BigDecimal value) {
            addCriterion("process_cost <", value, "processCost");
            return (Criteria) this;
        }

        public Criteria andProcessCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("process_cost <=", value, "processCost");
            return (Criteria) this;
        }

        public Criteria andProcessCostIn(List<BigDecimal> values) {
            addCriterion("process_cost in", values, "processCost");
            return (Criteria) this;
        }

        public Criteria andProcessCostNotIn(List<BigDecimal> values) {
            addCriterion("process_cost not in", values, "processCost");
            return (Criteria) this;
        }

        public Criteria andProcessCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("process_cost between", value1, value2, "processCost");
            return (Criteria) this;
        }

        public Criteria andProcessCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("process_cost not between", value1, value2, "processCost");
            return (Criteria) this;
        }

        public Criteria andInstallationCostIsNull() {
            addCriterion("installation_cost is null");
            return (Criteria) this;
        }

        public Criteria andInstallationCostIsNotNull() {
            addCriterion("installation_cost is not null");
            return (Criteria) this;
        }

        public Criteria andInstallationCostEqualTo(BigDecimal value) {
            addCriterion("installation_cost =", value, "installationCost");
            return (Criteria) this;
        }

        public Criteria andInstallationCostNotEqualTo(BigDecimal value) {
            addCriterion("installation_cost <>", value, "installationCost");
            return (Criteria) this;
        }

        public Criteria andInstallationCostGreaterThan(BigDecimal value) {
            addCriterion("installation_cost >", value, "installationCost");
            return (Criteria) this;
        }

        public Criteria andInstallationCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("installation_cost >=", value, "installationCost");
            return (Criteria) this;
        }

        public Criteria andInstallationCostLessThan(BigDecimal value) {
            addCriterion("installation_cost <", value, "installationCost");
            return (Criteria) this;
        }

        public Criteria andInstallationCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("installation_cost <=", value, "installationCost");
            return (Criteria) this;
        }

        public Criteria andInstallationCostIn(List<BigDecimal> values) {
            addCriterion("installation_cost in", values, "installationCost");
            return (Criteria) this;
        }

        public Criteria andInstallationCostNotIn(List<BigDecimal> values) {
            addCriterion("installation_cost not in", values, "installationCost");
            return (Criteria) this;
        }

        public Criteria andInstallationCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("installation_cost between", value1, value2, "installationCost");
            return (Criteria) this;
        }

        public Criteria andInstallationCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("installation_cost not between", value1, value2, "installationCost");
            return (Criteria) this;
        }

        public Criteria andExcipientCostIsNull() {
            addCriterion("excipient_cost is null");
            return (Criteria) this;
        }

        public Criteria andExcipientCostIsNotNull() {
            addCriterion("excipient_cost is not null");
            return (Criteria) this;
        }

        public Criteria andExcipientCostEqualTo(BigDecimal value) {
            addCriterion("excipient_cost =", value, "excipientCost");
            return (Criteria) this;
        }

        public Criteria andExcipientCostNotEqualTo(BigDecimal value) {
            addCriterion("excipient_cost <>", value, "excipientCost");
            return (Criteria) this;
        }

        public Criteria andExcipientCostGreaterThan(BigDecimal value) {
            addCriterion("excipient_cost >", value, "excipientCost");
            return (Criteria) this;
        }

        public Criteria andExcipientCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("excipient_cost >=", value, "excipientCost");
            return (Criteria) this;
        }

        public Criteria andExcipientCostLessThan(BigDecimal value) {
            addCriterion("excipient_cost <", value, "excipientCost");
            return (Criteria) this;
        }

        public Criteria andExcipientCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("excipient_cost <=", value, "excipientCost");
            return (Criteria) this;
        }

        public Criteria andExcipientCostIn(List<BigDecimal> values) {
            addCriterion("excipient_cost in", values, "excipientCost");
            return (Criteria) this;
        }

        public Criteria andExcipientCostNotIn(List<BigDecimal> values) {
            addCriterion("excipient_cost not in", values, "excipientCost");
            return (Criteria) this;
        }

        public Criteria andExcipientCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("excipient_cost between", value1, value2, "excipientCost");
            return (Criteria) this;
        }

        public Criteria andExcipientCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("excipient_cost not between", value1, value2, "excipientCost");
            return (Criteria) this;
        }

        public Criteria andNursingCostIsNull() {
            addCriterion("nursing_cost is null");
            return (Criteria) this;
        }

        public Criteria andNursingCostIsNotNull() {
            addCriterion("nursing_cost is not null");
            return (Criteria) this;
        }

        public Criteria andNursingCostEqualTo(BigDecimal value) {
            addCriterion("nursing_cost =", value, "nursingCost");
            return (Criteria) this;
        }

        public Criteria andNursingCostNotEqualTo(BigDecimal value) {
            addCriterion("nursing_cost <>", value, "nursingCost");
            return (Criteria) this;
        }

        public Criteria andNursingCostGreaterThan(BigDecimal value) {
            addCriterion("nursing_cost >", value, "nursingCost");
            return (Criteria) this;
        }

        public Criteria andNursingCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nursing_cost >=", value, "nursingCost");
            return (Criteria) this;
        }

        public Criteria andNursingCostLessThan(BigDecimal value) {
            addCriterion("nursing_cost <", value, "nursingCost");
            return (Criteria) this;
        }

        public Criteria andNursingCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nursing_cost <=", value, "nursingCost");
            return (Criteria) this;
        }

        public Criteria andNursingCostIn(List<BigDecimal> values) {
            addCriterion("nursing_cost in", values, "nursingCost");
            return (Criteria) this;
        }

        public Criteria andNursingCostNotIn(List<BigDecimal> values) {
            addCriterion("nursing_cost not in", values, "nursingCost");
            return (Criteria) this;
        }

        public Criteria andNursingCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nursing_cost between", value1, value2, "nursingCost");
            return (Criteria) this;
        }

        public Criteria andNursingCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nursing_cost not between", value1, value2, "nursingCost");
            return (Criteria) this;
        }

        public Criteria andSumCostIsNull() {
            addCriterion("sum_cost is null");
            return (Criteria) this;
        }

        public Criteria andSumCostIsNotNull() {
            addCriterion("sum_cost is not null");
            return (Criteria) this;
        }

        public Criteria andSumCostEqualTo(BigDecimal value) {
            addCriterion("sum_cost =", value, "sumCost");
            return (Criteria) this;
        }

        public Criteria andSumCostNotEqualTo(BigDecimal value) {
            addCriterion("sum_cost <>", value, "sumCost");
            return (Criteria) this;
        }

        public Criteria andSumCostGreaterThan(BigDecimal value) {
            addCriterion("sum_cost >", value, "sumCost");
            return (Criteria) this;
        }

        public Criteria andSumCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_cost >=", value, "sumCost");
            return (Criteria) this;
        }

        public Criteria andSumCostLessThan(BigDecimal value) {
            addCriterion("sum_cost <", value, "sumCost");
            return (Criteria) this;
        }

        public Criteria andSumCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_cost <=", value, "sumCost");
            return (Criteria) this;
        }

        public Criteria andSumCostIn(List<BigDecimal> values) {
            addCriterion("sum_cost in", values, "sumCost");
            return (Criteria) this;
        }

        public Criteria andSumCostNotIn(List<BigDecimal> values) {
            addCriterion("sum_cost not in", values, "sumCost");
            return (Criteria) this;
        }

        public Criteria andSumCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_cost between", value1, value2, "sumCost");
            return (Criteria) this;
        }

        public Criteria andSumCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_cost not between", value1, value2, "sumCost");
            return (Criteria) this;
        }
    }

    /**
     */
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