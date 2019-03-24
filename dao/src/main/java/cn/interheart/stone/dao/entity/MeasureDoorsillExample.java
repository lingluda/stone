package cn.interheart.stone.dao.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MeasureDoorsillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public MeasureDoorsillExample() {
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

        public Criteria andDicBaseAreaIdIsNull() {
            addCriterion("dic_base_area_id is null");
            return (Criteria) this;
        }

        public Criteria andDicBaseAreaIdIsNotNull() {
            addCriterion("dic_base_area_id is not null");
            return (Criteria) this;
        }

        public Criteria andDicBaseAreaIdEqualTo(Integer value) {
            addCriterion("dic_base_area_id =", value, "dicBaseAreaId");
            return (Criteria) this;
        }

        public Criteria andDicBaseAreaIdNotEqualTo(Integer value) {
            addCriterion("dic_base_area_id <>", value, "dicBaseAreaId");
            return (Criteria) this;
        }

        public Criteria andDicBaseAreaIdGreaterThan(Integer value) {
            addCriterion("dic_base_area_id >", value, "dicBaseAreaId");
            return (Criteria) this;
        }

        public Criteria andDicBaseAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dic_base_area_id >=", value, "dicBaseAreaId");
            return (Criteria) this;
        }

        public Criteria andDicBaseAreaIdLessThan(Integer value) {
            addCriterion("dic_base_area_id <", value, "dicBaseAreaId");
            return (Criteria) this;
        }

        public Criteria andDicBaseAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("dic_base_area_id <=", value, "dicBaseAreaId");
            return (Criteria) this;
        }

        public Criteria andDicBaseAreaIdIn(List<Integer> values) {
            addCriterion("dic_base_area_id in", values, "dicBaseAreaId");
            return (Criteria) this;
        }

        public Criteria andDicBaseAreaIdNotIn(List<Integer> values) {
            addCriterion("dic_base_area_id not in", values, "dicBaseAreaId");
            return (Criteria) this;
        }

        public Criteria andDicBaseAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("dic_base_area_id between", value1, value2, "dicBaseAreaId");
            return (Criteria) this;
        }

        public Criteria andDicBaseAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dic_base_area_id not between", value1, value2, "dicBaseAreaId");
            return (Criteria) this;
        }

        public Criteria andDicBaseAreaContentIsNull() {
            addCriterion("dic_base_area_content is null");
            return (Criteria) this;
        }

        public Criteria andDicBaseAreaContentIsNotNull() {
            addCriterion("dic_base_area_content is not null");
            return (Criteria) this;
        }

        public Criteria andDicBaseAreaContentEqualTo(String value) {
            addCriterion("dic_base_area_content =", value, "dicBaseAreaContent");
            return (Criteria) this;
        }

        public Criteria andDicBaseAreaContentNotEqualTo(String value) {
            addCriterion("dic_base_area_content <>", value, "dicBaseAreaContent");
            return (Criteria) this;
        }

        public Criteria andDicBaseAreaContentGreaterThan(String value) {
            addCriterion("dic_base_area_content >", value, "dicBaseAreaContent");
            return (Criteria) this;
        }

        public Criteria andDicBaseAreaContentGreaterThanOrEqualTo(String value) {
            addCriterion("dic_base_area_content >=", value, "dicBaseAreaContent");
            return (Criteria) this;
        }

        public Criteria andDicBaseAreaContentLessThan(String value) {
            addCriterion("dic_base_area_content <", value, "dicBaseAreaContent");
            return (Criteria) this;
        }

        public Criteria andDicBaseAreaContentLessThanOrEqualTo(String value) {
            addCriterion("dic_base_area_content <=", value, "dicBaseAreaContent");
            return (Criteria) this;
        }

        public Criteria andDicBaseAreaContentLike(String value) {
            addCriterion("dic_base_area_content like", value, "dicBaseAreaContent");
            return (Criteria) this;
        }

        public Criteria andDicBaseAreaContentNotLike(String value) {
            addCriterion("dic_base_area_content not like", value, "dicBaseAreaContent");
            return (Criteria) this;
        }

        public Criteria andDicBaseAreaContentIn(List<String> values) {
            addCriterion("dic_base_area_content in", values, "dicBaseAreaContent");
            return (Criteria) this;
        }

        public Criteria andDicBaseAreaContentNotIn(List<String> values) {
            addCriterion("dic_base_area_content not in", values, "dicBaseAreaContent");
            return (Criteria) this;
        }

        public Criteria andDicBaseAreaContentBetween(String value1, String value2) {
            addCriterion("dic_base_area_content between", value1, value2, "dicBaseAreaContent");
            return (Criteria) this;
        }

        public Criteria andDicBaseAreaContentNotBetween(String value1, String value2) {
            addCriterion("dic_base_area_content not between", value1, value2, "dicBaseAreaContent");
            return (Criteria) this;
        }

        public Criteria andIsBigSmallHeadIsNull() {
            addCriterion("is_big_small_head is null");
            return (Criteria) this;
        }

        public Criteria andIsBigSmallHeadIsNotNull() {
            addCriterion("is_big_small_head is not null");
            return (Criteria) this;
        }

        public Criteria andIsBigSmallHeadEqualTo(Byte value) {
            addCriterion("is_big_small_head =", value, "isBigSmallHead");
            return (Criteria) this;
        }

        public Criteria andIsBigSmallHeadNotEqualTo(Byte value) {
            addCriterion("is_big_small_head <>", value, "isBigSmallHead");
            return (Criteria) this;
        }

        public Criteria andIsBigSmallHeadGreaterThan(Byte value) {
            addCriterion("is_big_small_head >", value, "isBigSmallHead");
            return (Criteria) this;
        }

        public Criteria andIsBigSmallHeadGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_big_small_head >=", value, "isBigSmallHead");
            return (Criteria) this;
        }

        public Criteria andIsBigSmallHeadLessThan(Byte value) {
            addCriterion("is_big_small_head <", value, "isBigSmallHead");
            return (Criteria) this;
        }

        public Criteria andIsBigSmallHeadLessThanOrEqualTo(Byte value) {
            addCriterion("is_big_small_head <=", value, "isBigSmallHead");
            return (Criteria) this;
        }

        public Criteria andIsBigSmallHeadIn(List<Byte> values) {
            addCriterion("is_big_small_head in", values, "isBigSmallHead");
            return (Criteria) this;
        }

        public Criteria andIsBigSmallHeadNotIn(List<Byte> values) {
            addCriterion("is_big_small_head not in", values, "isBigSmallHead");
            return (Criteria) this;
        }

        public Criteria andIsBigSmallHeadBetween(Byte value1, Byte value2) {
            addCriterion("is_big_small_head between", value1, value2, "isBigSmallHead");
            return (Criteria) this;
        }

        public Criteria andIsBigSmallHeadNotBetween(Byte value1, Byte value2) {
            addCriterion("is_big_small_head not between", value1, value2, "isBigSmallHead");
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

        public Criteria andLengthEqualTo(BigDecimal value) {
            addCriterion("length =", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotEqualTo(BigDecimal value) {
            addCriterion("length <>", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThan(BigDecimal value) {
            addCriterion("length >", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("length >=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThan(BigDecimal value) {
            addCriterion("length <", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("length <=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthIn(List<BigDecimal> values) {
            addCriterion("length in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotIn(List<BigDecimal> values) {
            addCriterion("length not in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("length between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("length not between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andLeftWidthIsNull() {
            addCriterion("left_width is null");
            return (Criteria) this;
        }

        public Criteria andLeftWidthIsNotNull() {
            addCriterion("left_width is not null");
            return (Criteria) this;
        }

        public Criteria andLeftWidthEqualTo(BigDecimal value) {
            addCriterion("left_width =", value, "leftWidth");
            return (Criteria) this;
        }

        public Criteria andLeftWidthNotEqualTo(BigDecimal value) {
            addCriterion("left_width <>", value, "leftWidth");
            return (Criteria) this;
        }

        public Criteria andLeftWidthGreaterThan(BigDecimal value) {
            addCriterion("left_width >", value, "leftWidth");
            return (Criteria) this;
        }

        public Criteria andLeftWidthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("left_width >=", value, "leftWidth");
            return (Criteria) this;
        }

        public Criteria andLeftWidthLessThan(BigDecimal value) {
            addCriterion("left_width <", value, "leftWidth");
            return (Criteria) this;
        }

        public Criteria andLeftWidthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("left_width <=", value, "leftWidth");
            return (Criteria) this;
        }

        public Criteria andLeftWidthIn(List<BigDecimal> values) {
            addCriterion("left_width in", values, "leftWidth");
            return (Criteria) this;
        }

        public Criteria andLeftWidthNotIn(List<BigDecimal> values) {
            addCriterion("left_width not in", values, "leftWidth");
            return (Criteria) this;
        }

        public Criteria andLeftWidthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("left_width between", value1, value2, "leftWidth");
            return (Criteria) this;
        }

        public Criteria andLeftWidthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("left_width not between", value1, value2, "leftWidth");
            return (Criteria) this;
        }

        public Criteria andRightWidthIsNull() {
            addCriterion("right_width is null");
            return (Criteria) this;
        }

        public Criteria andRightWidthIsNotNull() {
            addCriterion("right_width is not null");
            return (Criteria) this;
        }

        public Criteria andRightWidthEqualTo(BigDecimal value) {
            addCriterion("right_width =", value, "rightWidth");
            return (Criteria) this;
        }

        public Criteria andRightWidthNotEqualTo(BigDecimal value) {
            addCriterion("right_width <>", value, "rightWidth");
            return (Criteria) this;
        }

        public Criteria andRightWidthGreaterThan(BigDecimal value) {
            addCriterion("right_width >", value, "rightWidth");
            return (Criteria) this;
        }

        public Criteria andRightWidthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("right_width >=", value, "rightWidth");
            return (Criteria) this;
        }

        public Criteria andRightWidthLessThan(BigDecimal value) {
            addCriterion("right_width <", value, "rightWidth");
            return (Criteria) this;
        }

        public Criteria andRightWidthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("right_width <=", value, "rightWidth");
            return (Criteria) this;
        }

        public Criteria andRightWidthIn(List<BigDecimal> values) {
            addCriterion("right_width in", values, "rightWidth");
            return (Criteria) this;
        }

        public Criteria andRightWidthNotIn(List<BigDecimal> values) {
            addCriterion("right_width not in", values, "rightWidth");
            return (Criteria) this;
        }

        public Criteria andRightWidthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("right_width between", value1, value2, "rightWidth");
            return (Criteria) this;
        }

        public Criteria andRightWidthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("right_width not between", value1, value2, "rightWidth");
            return (Criteria) this;
        }

        public Criteria andHangWearSideIsNull() {
            addCriterion("hang_wear_side is null");
            return (Criteria) this;
        }

        public Criteria andHangWearSideIsNotNull() {
            addCriterion("hang_wear_side is not null");
            return (Criteria) this;
        }

        public Criteria andHangWearSideEqualTo(Byte value) {
            addCriterion("hang_wear_side =", value, "hangWearSide");
            return (Criteria) this;
        }

        public Criteria andHangWearSideNotEqualTo(Byte value) {
            addCriterion("hang_wear_side <>", value, "hangWearSide");
            return (Criteria) this;
        }

        public Criteria andHangWearSideGreaterThan(Byte value) {
            addCriterion("hang_wear_side >", value, "hangWearSide");
            return (Criteria) this;
        }

        public Criteria andHangWearSideGreaterThanOrEqualTo(Byte value) {
            addCriterion("hang_wear_side >=", value, "hangWearSide");
            return (Criteria) this;
        }

        public Criteria andHangWearSideLessThan(Byte value) {
            addCriterion("hang_wear_side <", value, "hangWearSide");
            return (Criteria) this;
        }

        public Criteria andHangWearSideLessThanOrEqualTo(Byte value) {
            addCriterion("hang_wear_side <=", value, "hangWearSide");
            return (Criteria) this;
        }

        public Criteria andHangWearSideIn(List<Byte> values) {
            addCriterion("hang_wear_side in", values, "hangWearSide");
            return (Criteria) this;
        }

        public Criteria andHangWearSideNotIn(List<Byte> values) {
            addCriterion("hang_wear_side not in", values, "hangWearSide");
            return (Criteria) this;
        }

        public Criteria andHangWearSideBetween(Byte value1, Byte value2) {
            addCriterion("hang_wear_side between", value1, value2, "hangWearSide");
            return (Criteria) this;
        }

        public Criteria andHangWearSideNotBetween(Byte value1, Byte value2) {
            addCriterion("hang_wear_side not between", value1, value2, "hangWearSide");
            return (Criteria) this;
        }

        public Criteria andHangSideWidthIsNull() {
            addCriterion("hang_side_width is null");
            return (Criteria) this;
        }

        public Criteria andHangSideWidthIsNotNull() {
            addCriterion("hang_side_width is not null");
            return (Criteria) this;
        }

        public Criteria andHangSideWidthEqualTo(BigDecimal value) {
            addCriterion("hang_side_width =", value, "hangSideWidth");
            return (Criteria) this;
        }

        public Criteria andHangSideWidthNotEqualTo(BigDecimal value) {
            addCriterion("hang_side_width <>", value, "hangSideWidth");
            return (Criteria) this;
        }

        public Criteria andHangSideWidthGreaterThan(BigDecimal value) {
            addCriterion("hang_side_width >", value, "hangSideWidth");
            return (Criteria) this;
        }

        public Criteria andHangSideWidthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("hang_side_width >=", value, "hangSideWidth");
            return (Criteria) this;
        }

        public Criteria andHangSideWidthLessThan(BigDecimal value) {
            addCriterion("hang_side_width <", value, "hangSideWidth");
            return (Criteria) this;
        }

        public Criteria andHangSideWidthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("hang_side_width <=", value, "hangSideWidth");
            return (Criteria) this;
        }

        public Criteria andHangSideWidthIn(List<BigDecimal> values) {
            addCriterion("hang_side_width in", values, "hangSideWidth");
            return (Criteria) this;
        }

        public Criteria andHangSideWidthNotIn(List<BigDecimal> values) {
            addCriterion("hang_side_width not in", values, "hangSideWidth");
            return (Criteria) this;
        }

        public Criteria andHangSideWidthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hang_side_width between", value1, value2, "hangSideWidth");
            return (Criteria) this;
        }

        public Criteria andHangSideWidthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hang_side_width not between", value1, value2, "hangSideWidth");
            return (Criteria) this;
        }

        public Criteria andHangSideNumberIsNull() {
            addCriterion("hang_side_number is null");
            return (Criteria) this;
        }

        public Criteria andHangSideNumberIsNotNull() {
            addCriterion("hang_side_number is not null");
            return (Criteria) this;
        }

        public Criteria andHangSideNumberEqualTo(Integer value) {
            addCriterion("hang_side_number =", value, "hangSideNumber");
            return (Criteria) this;
        }

        public Criteria andHangSideNumberNotEqualTo(Integer value) {
            addCriterion("hang_side_number <>", value, "hangSideNumber");
            return (Criteria) this;
        }

        public Criteria andHangSideNumberGreaterThan(Integer value) {
            addCriterion("hang_side_number >", value, "hangSideNumber");
            return (Criteria) this;
        }

        public Criteria andHangSideNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("hang_side_number >=", value, "hangSideNumber");
            return (Criteria) this;
        }

        public Criteria andHangSideNumberLessThan(Integer value) {
            addCriterion("hang_side_number <", value, "hangSideNumber");
            return (Criteria) this;
        }

        public Criteria andHangSideNumberLessThanOrEqualTo(Integer value) {
            addCriterion("hang_side_number <=", value, "hangSideNumber");
            return (Criteria) this;
        }

        public Criteria andHangSideNumberIn(List<Integer> values) {
            addCriterion("hang_side_number in", values, "hangSideNumber");
            return (Criteria) this;
        }

        public Criteria andHangSideNumberNotIn(List<Integer> values) {
            addCriterion("hang_side_number not in", values, "hangSideNumber");
            return (Criteria) this;
        }

        public Criteria andHangSideNumberBetween(Integer value1, Integer value2) {
            addCriterion("hang_side_number between", value1, value2, "hangSideNumber");
            return (Criteria) this;
        }

        public Criteria andHangSideNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("hang_side_number not between", value1, value2, "hangSideNumber");
            return (Criteria) this;
        }

        public Criteria andDoorsillNumberIsNull() {
            addCriterion("doorsill_number is null");
            return (Criteria) this;
        }

        public Criteria andDoorsillNumberIsNotNull() {
            addCriterion("doorsill_number is not null");
            return (Criteria) this;
        }

        public Criteria andDoorsillNumberEqualTo(Integer value) {
            addCriterion("doorsill_number =", value, "doorsillNumber");
            return (Criteria) this;
        }

        public Criteria andDoorsillNumberNotEqualTo(Integer value) {
            addCriterion("doorsill_number <>", value, "doorsillNumber");
            return (Criteria) this;
        }

        public Criteria andDoorsillNumberGreaterThan(Integer value) {
            addCriterion("doorsill_number >", value, "doorsillNumber");
            return (Criteria) this;
        }

        public Criteria andDoorsillNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("doorsill_number >=", value, "doorsillNumber");
            return (Criteria) this;
        }

        public Criteria andDoorsillNumberLessThan(Integer value) {
            addCriterion("doorsill_number <", value, "doorsillNumber");
            return (Criteria) this;
        }

        public Criteria andDoorsillNumberLessThanOrEqualTo(Integer value) {
            addCriterion("doorsill_number <=", value, "doorsillNumber");
            return (Criteria) this;
        }

        public Criteria andDoorsillNumberIn(List<Integer> values) {
            addCriterion("doorsill_number in", values, "doorsillNumber");
            return (Criteria) this;
        }

        public Criteria andDoorsillNumberNotIn(List<Integer> values) {
            addCriterion("doorsill_number not in", values, "doorsillNumber");
            return (Criteria) this;
        }

        public Criteria andDoorsillNumberBetween(Integer value1, Integer value2) {
            addCriterion("doorsill_number between", value1, value2, "doorsillNumber");
            return (Criteria) this;
        }

        public Criteria andDoorsillNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("doorsill_number not between", value1, value2, "doorsillNumber");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_id not between", value1, value2, "productId");
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