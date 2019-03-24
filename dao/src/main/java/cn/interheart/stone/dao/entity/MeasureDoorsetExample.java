package cn.interheart.stone.dao.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MeasureDoorsetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public MeasureDoorsetExample() {
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

        public Criteria andSideTdWidthSpecificationsIsNull() {
            addCriterion("side_td_width_specifications is null");
            return (Criteria) this;
        }

        public Criteria andSideTdWidthSpecificationsIsNotNull() {
            addCriterion("side_td_width_specifications is not null");
            return (Criteria) this;
        }

        public Criteria andSideTdWidthSpecificationsEqualTo(Byte value) {
            addCriterion("side_td_width_specifications =", value, "sideTdWidthSpecifications");
            return (Criteria) this;
        }

        public Criteria andSideTdWidthSpecificationsNotEqualTo(Byte value) {
            addCriterion("side_td_width_specifications <>", value, "sideTdWidthSpecifications");
            return (Criteria) this;
        }

        public Criteria andSideTdWidthSpecificationsGreaterThan(Byte value) {
            addCriterion("side_td_width_specifications >", value, "sideTdWidthSpecifications");
            return (Criteria) this;
        }

        public Criteria andSideTdWidthSpecificationsGreaterThanOrEqualTo(Byte value) {
            addCriterion("side_td_width_specifications >=", value, "sideTdWidthSpecifications");
            return (Criteria) this;
        }

        public Criteria andSideTdWidthSpecificationsLessThan(Byte value) {
            addCriterion("side_td_width_specifications <", value, "sideTdWidthSpecifications");
            return (Criteria) this;
        }

        public Criteria andSideTdWidthSpecificationsLessThanOrEqualTo(Byte value) {
            addCriterion("side_td_width_specifications <=", value, "sideTdWidthSpecifications");
            return (Criteria) this;
        }

        public Criteria andSideTdWidthSpecificationsIn(List<Byte> values) {
            addCriterion("side_td_width_specifications in", values, "sideTdWidthSpecifications");
            return (Criteria) this;
        }

        public Criteria andSideTdWidthSpecificationsNotIn(List<Byte> values) {
            addCriterion("side_td_width_specifications not in", values, "sideTdWidthSpecifications");
            return (Criteria) this;
        }

        public Criteria andSideTdWidthSpecificationsBetween(Byte value1, Byte value2) {
            addCriterion("side_td_width_specifications between", value1, value2, "sideTdWidthSpecifications");
            return (Criteria) this;
        }

        public Criteria andSideTdWidthSpecificationsNotBetween(Byte value1, Byte value2) {
            addCriterion("side_td_width_specifications not between", value1, value2, "sideTdWidthSpecifications");
            return (Criteria) this;
        }

        public Criteria andSideLeftTopWidthIsNull() {
            addCriterion("side_left_top_width is null");
            return (Criteria) this;
        }

        public Criteria andSideLeftTopWidthIsNotNull() {
            addCriterion("side_left_top_width is not null");
            return (Criteria) this;
        }

        public Criteria andSideLeftTopWidthEqualTo(BigDecimal value) {
            addCriterion("side_left_top_width =", value, "sideLeftTopWidth");
            return (Criteria) this;
        }

        public Criteria andSideLeftTopWidthNotEqualTo(BigDecimal value) {
            addCriterion("side_left_top_width <>", value, "sideLeftTopWidth");
            return (Criteria) this;
        }

        public Criteria andSideLeftTopWidthGreaterThan(BigDecimal value) {
            addCriterion("side_left_top_width >", value, "sideLeftTopWidth");
            return (Criteria) this;
        }

        public Criteria andSideLeftTopWidthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("side_left_top_width >=", value, "sideLeftTopWidth");
            return (Criteria) this;
        }

        public Criteria andSideLeftTopWidthLessThan(BigDecimal value) {
            addCriterion("side_left_top_width <", value, "sideLeftTopWidth");
            return (Criteria) this;
        }

        public Criteria andSideLeftTopWidthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("side_left_top_width <=", value, "sideLeftTopWidth");
            return (Criteria) this;
        }

        public Criteria andSideLeftTopWidthIn(List<BigDecimal> values) {
            addCriterion("side_left_top_width in", values, "sideLeftTopWidth");
            return (Criteria) this;
        }

        public Criteria andSideLeftTopWidthNotIn(List<BigDecimal> values) {
            addCriterion("side_left_top_width not in", values, "sideLeftTopWidth");
            return (Criteria) this;
        }

        public Criteria andSideLeftTopWidthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("side_left_top_width between", value1, value2, "sideLeftTopWidth");
            return (Criteria) this;
        }

        public Criteria andSideLeftTopWidthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("side_left_top_width not between", value1, value2, "sideLeftTopWidth");
            return (Criteria) this;
        }

        public Criteria andSideLeftDownWidthIsNull() {
            addCriterion("side_left_down_width is null");
            return (Criteria) this;
        }

        public Criteria andSideLeftDownWidthIsNotNull() {
            addCriterion("side_left_down_width is not null");
            return (Criteria) this;
        }

        public Criteria andSideLeftDownWidthEqualTo(BigDecimal value) {
            addCriterion("side_left_down_width =", value, "sideLeftDownWidth");
            return (Criteria) this;
        }

        public Criteria andSideLeftDownWidthNotEqualTo(BigDecimal value) {
            addCriterion("side_left_down_width <>", value, "sideLeftDownWidth");
            return (Criteria) this;
        }

        public Criteria andSideLeftDownWidthGreaterThan(BigDecimal value) {
            addCriterion("side_left_down_width >", value, "sideLeftDownWidth");
            return (Criteria) this;
        }

        public Criteria andSideLeftDownWidthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("side_left_down_width >=", value, "sideLeftDownWidth");
            return (Criteria) this;
        }

        public Criteria andSideLeftDownWidthLessThan(BigDecimal value) {
            addCriterion("side_left_down_width <", value, "sideLeftDownWidth");
            return (Criteria) this;
        }

        public Criteria andSideLeftDownWidthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("side_left_down_width <=", value, "sideLeftDownWidth");
            return (Criteria) this;
        }

        public Criteria andSideLeftDownWidthIn(List<BigDecimal> values) {
            addCriterion("side_left_down_width in", values, "sideLeftDownWidth");
            return (Criteria) this;
        }

        public Criteria andSideLeftDownWidthNotIn(List<BigDecimal> values) {
            addCriterion("side_left_down_width not in", values, "sideLeftDownWidth");
            return (Criteria) this;
        }

        public Criteria andSideLeftDownWidthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("side_left_down_width between", value1, value2, "sideLeftDownWidth");
            return (Criteria) this;
        }

        public Criteria andSideLeftDownWidthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("side_left_down_width not between", value1, value2, "sideLeftDownWidth");
            return (Criteria) this;
        }

        public Criteria andSideRightTopWidthIsNull() {
            addCriterion("side_right_top_width is null");
            return (Criteria) this;
        }

        public Criteria andSideRightTopWidthIsNotNull() {
            addCriterion("side_right_top_width is not null");
            return (Criteria) this;
        }

        public Criteria andSideRightTopWidthEqualTo(BigDecimal value) {
            addCriterion("side_right_top_width =", value, "sideRightTopWidth");
            return (Criteria) this;
        }

        public Criteria andSideRightTopWidthNotEqualTo(BigDecimal value) {
            addCriterion("side_right_top_width <>", value, "sideRightTopWidth");
            return (Criteria) this;
        }

        public Criteria andSideRightTopWidthGreaterThan(BigDecimal value) {
            addCriterion("side_right_top_width >", value, "sideRightTopWidth");
            return (Criteria) this;
        }

        public Criteria andSideRightTopWidthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("side_right_top_width >=", value, "sideRightTopWidth");
            return (Criteria) this;
        }

        public Criteria andSideRightTopWidthLessThan(BigDecimal value) {
            addCriterion("side_right_top_width <", value, "sideRightTopWidth");
            return (Criteria) this;
        }

        public Criteria andSideRightTopWidthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("side_right_top_width <=", value, "sideRightTopWidth");
            return (Criteria) this;
        }

        public Criteria andSideRightTopWidthIn(List<BigDecimal> values) {
            addCriterion("side_right_top_width in", values, "sideRightTopWidth");
            return (Criteria) this;
        }

        public Criteria andSideRightTopWidthNotIn(List<BigDecimal> values) {
            addCriterion("side_right_top_width not in", values, "sideRightTopWidth");
            return (Criteria) this;
        }

        public Criteria andSideRightTopWidthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("side_right_top_width between", value1, value2, "sideRightTopWidth");
            return (Criteria) this;
        }

        public Criteria andSideRightTopWidthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("side_right_top_width not between", value1, value2, "sideRightTopWidth");
            return (Criteria) this;
        }

        public Criteria andSideRightDownWidthIsNull() {
            addCriterion("side_right_down_width is null");
            return (Criteria) this;
        }

        public Criteria andSideRightDownWidthIsNotNull() {
            addCriterion("side_right_down_width is not null");
            return (Criteria) this;
        }

        public Criteria andSideRightDownWidthEqualTo(BigDecimal value) {
            addCriterion("side_right_down_width =", value, "sideRightDownWidth");
            return (Criteria) this;
        }

        public Criteria andSideRightDownWidthNotEqualTo(BigDecimal value) {
            addCriterion("side_right_down_width <>", value, "sideRightDownWidth");
            return (Criteria) this;
        }

        public Criteria andSideRightDownWidthGreaterThan(BigDecimal value) {
            addCriterion("side_right_down_width >", value, "sideRightDownWidth");
            return (Criteria) this;
        }

        public Criteria andSideRightDownWidthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("side_right_down_width >=", value, "sideRightDownWidth");
            return (Criteria) this;
        }

        public Criteria andSideRightDownWidthLessThan(BigDecimal value) {
            addCriterion("side_right_down_width <", value, "sideRightDownWidth");
            return (Criteria) this;
        }

        public Criteria andSideRightDownWidthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("side_right_down_width <=", value, "sideRightDownWidth");
            return (Criteria) this;
        }

        public Criteria andSideRightDownWidthIn(List<BigDecimal> values) {
            addCriterion("side_right_down_width in", values, "sideRightDownWidth");
            return (Criteria) this;
        }

        public Criteria andSideRightDownWidthNotIn(List<BigDecimal> values) {
            addCriterion("side_right_down_width not in", values, "sideRightDownWidth");
            return (Criteria) this;
        }

        public Criteria andSideRightDownWidthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("side_right_down_width between", value1, value2, "sideRightDownWidth");
            return (Criteria) this;
        }

        public Criteria andSideRightDownWidthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("side_right_down_width not between", value1, value2, "sideRightDownWidth");
            return (Criteria) this;
        }

        public Criteria andSideHeightIsNull() {
            addCriterion("side_height is null");
            return (Criteria) this;
        }

        public Criteria andSideHeightIsNotNull() {
            addCriterion("side_height is not null");
            return (Criteria) this;
        }

        public Criteria andSideHeightEqualTo(BigDecimal value) {
            addCriterion("side_height =", value, "sideHeight");
            return (Criteria) this;
        }

        public Criteria andSideHeightNotEqualTo(BigDecimal value) {
            addCriterion("side_height <>", value, "sideHeight");
            return (Criteria) this;
        }

        public Criteria andSideHeightGreaterThan(BigDecimal value) {
            addCriterion("side_height >", value, "sideHeight");
            return (Criteria) this;
        }

        public Criteria andSideHeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("side_height >=", value, "sideHeight");
            return (Criteria) this;
        }

        public Criteria andSideHeightLessThan(BigDecimal value) {
            addCriterion("side_height <", value, "sideHeight");
            return (Criteria) this;
        }

        public Criteria andSideHeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("side_height <=", value, "sideHeight");
            return (Criteria) this;
        }

        public Criteria andSideHeightIn(List<BigDecimal> values) {
            addCriterion("side_height in", values, "sideHeight");
            return (Criteria) this;
        }

        public Criteria andSideHeightNotIn(List<BigDecimal> values) {
            addCriterion("side_height not in", values, "sideHeight");
            return (Criteria) this;
        }

        public Criteria andSideHeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("side_height between", value1, value2, "sideHeight");
            return (Criteria) this;
        }

        public Criteria andSideHeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("side_height not between", value1, value2, "sideHeight");
            return (Criteria) this;
        }

        public Criteria andSideNumberIsNull() {
            addCriterion("side_number is null");
            return (Criteria) this;
        }

        public Criteria andSideNumberIsNotNull() {
            addCriterion("side_number is not null");
            return (Criteria) this;
        }

        public Criteria andSideNumberEqualTo(Integer value) {
            addCriterion("side_number =", value, "sideNumber");
            return (Criteria) this;
        }

        public Criteria andSideNumberNotEqualTo(Integer value) {
            addCriterion("side_number <>", value, "sideNumber");
            return (Criteria) this;
        }

        public Criteria andSideNumberGreaterThan(Integer value) {
            addCriterion("side_number >", value, "sideNumber");
            return (Criteria) this;
        }

        public Criteria andSideNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("side_number >=", value, "sideNumber");
            return (Criteria) this;
        }

        public Criteria andSideNumberLessThan(Integer value) {
            addCriterion("side_number <", value, "sideNumber");
            return (Criteria) this;
        }

        public Criteria andSideNumberLessThanOrEqualTo(Integer value) {
            addCriterion("side_number <=", value, "sideNumber");
            return (Criteria) this;
        }

        public Criteria andSideNumberIn(List<Integer> values) {
            addCriterion("side_number in", values, "sideNumber");
            return (Criteria) this;
        }

        public Criteria andSideNumberNotIn(List<Integer> values) {
            addCriterion("side_number not in", values, "sideNumber");
            return (Criteria) this;
        }

        public Criteria andSideNumberBetween(Integer value1, Integer value2) {
            addCriterion("side_number between", value1, value2, "sideNumber");
            return (Criteria) this;
        }

        public Criteria andSideNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("side_number not between", value1, value2, "sideNumber");
            return (Criteria) this;
        }

        public Criteria andRoofLongIsNull() {
            addCriterion("roof_long is null");
            return (Criteria) this;
        }

        public Criteria andRoofLongIsNotNull() {
            addCriterion("roof_long is not null");
            return (Criteria) this;
        }

        public Criteria andRoofLongEqualTo(BigDecimal value) {
            addCriterion("roof_long =", value, "roofLong");
            return (Criteria) this;
        }

        public Criteria andRoofLongNotEqualTo(BigDecimal value) {
            addCriterion("roof_long <>", value, "roofLong");
            return (Criteria) this;
        }

        public Criteria andRoofLongGreaterThan(BigDecimal value) {
            addCriterion("roof_long >", value, "roofLong");
            return (Criteria) this;
        }

        public Criteria andRoofLongGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("roof_long >=", value, "roofLong");
            return (Criteria) this;
        }

        public Criteria andRoofLongLessThan(BigDecimal value) {
            addCriterion("roof_long <", value, "roofLong");
            return (Criteria) this;
        }

        public Criteria andRoofLongLessThanOrEqualTo(BigDecimal value) {
            addCriterion("roof_long <=", value, "roofLong");
            return (Criteria) this;
        }

        public Criteria andRoofLongIn(List<BigDecimal> values) {
            addCriterion("roof_long in", values, "roofLong");
            return (Criteria) this;
        }

        public Criteria andRoofLongNotIn(List<BigDecimal> values) {
            addCriterion("roof_long not in", values, "roofLong");
            return (Criteria) this;
        }

        public Criteria andRoofLongBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("roof_long between", value1, value2, "roofLong");
            return (Criteria) this;
        }

        public Criteria andRoofLongNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("roof_long not between", value1, value2, "roofLong");
            return (Criteria) this;
        }

        public Criteria andRoofNumberIsNull() {
            addCriterion("roof_number is null");
            return (Criteria) this;
        }

        public Criteria andRoofNumberIsNotNull() {
            addCriterion("roof_number is not null");
            return (Criteria) this;
        }

        public Criteria andRoofNumberEqualTo(Integer value) {
            addCriterion("roof_number =", value, "roofNumber");
            return (Criteria) this;
        }

        public Criteria andRoofNumberNotEqualTo(Integer value) {
            addCriterion("roof_number <>", value, "roofNumber");
            return (Criteria) this;
        }

        public Criteria andRoofNumberGreaterThan(Integer value) {
            addCriterion("roof_number >", value, "roofNumber");
            return (Criteria) this;
        }

        public Criteria andRoofNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("roof_number >=", value, "roofNumber");
            return (Criteria) this;
        }

        public Criteria andRoofNumberLessThan(Integer value) {
            addCriterion("roof_number <", value, "roofNumber");
            return (Criteria) this;
        }

        public Criteria andRoofNumberLessThanOrEqualTo(Integer value) {
            addCriterion("roof_number <=", value, "roofNumber");
            return (Criteria) this;
        }

        public Criteria andRoofNumberIn(List<Integer> values) {
            addCriterion("roof_number in", values, "roofNumber");
            return (Criteria) this;
        }

        public Criteria andRoofNumberNotIn(List<Integer> values) {
            addCriterion("roof_number not in", values, "roofNumber");
            return (Criteria) this;
        }

        public Criteria andRoofNumberBetween(Integer value1, Integer value2) {
            addCriterion("roof_number between", value1, value2, "roofNumber");
            return (Criteria) this;
        }

        public Criteria andRoofNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("roof_number not between", value1, value2, "roofNumber");
            return (Criteria) this;
        }

        public Criteria andLeftEarIsNull() {
            addCriterion("left_ear is null");
            return (Criteria) this;
        }

        public Criteria andLeftEarIsNotNull() {
            addCriterion("left_ear is not null");
            return (Criteria) this;
        }

        public Criteria andLeftEarEqualTo(BigDecimal value) {
            addCriterion("left_ear =", value, "leftEar");
            return (Criteria) this;
        }

        public Criteria andLeftEarNotEqualTo(BigDecimal value) {
            addCriterion("left_ear <>", value, "leftEar");
            return (Criteria) this;
        }

        public Criteria andLeftEarGreaterThan(BigDecimal value) {
            addCriterion("left_ear >", value, "leftEar");
            return (Criteria) this;
        }

        public Criteria andLeftEarGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("left_ear >=", value, "leftEar");
            return (Criteria) this;
        }

        public Criteria andLeftEarLessThan(BigDecimal value) {
            addCriterion("left_ear <", value, "leftEar");
            return (Criteria) this;
        }

        public Criteria andLeftEarLessThanOrEqualTo(BigDecimal value) {
            addCriterion("left_ear <=", value, "leftEar");
            return (Criteria) this;
        }

        public Criteria andLeftEarIn(List<BigDecimal> values) {
            addCriterion("left_ear in", values, "leftEar");
            return (Criteria) this;
        }

        public Criteria andLeftEarNotIn(List<BigDecimal> values) {
            addCriterion("left_ear not in", values, "leftEar");
            return (Criteria) this;
        }

        public Criteria andLeftEarBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("left_ear between", value1, value2, "leftEar");
            return (Criteria) this;
        }

        public Criteria andLeftEarNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("left_ear not between", value1, value2, "leftEar");
            return (Criteria) this;
        }

        public Criteria andRightEarIsNull() {
            addCriterion("right_ear is null");
            return (Criteria) this;
        }

        public Criteria andRightEarIsNotNull() {
            addCriterion("right_ear is not null");
            return (Criteria) this;
        }

        public Criteria andRightEarEqualTo(BigDecimal value) {
            addCriterion("right_ear =", value, "rightEar");
            return (Criteria) this;
        }

        public Criteria andRightEarNotEqualTo(BigDecimal value) {
            addCriterion("right_ear <>", value, "rightEar");
            return (Criteria) this;
        }

        public Criteria andRightEarGreaterThan(BigDecimal value) {
            addCriterion("right_ear >", value, "rightEar");
            return (Criteria) this;
        }

        public Criteria andRightEarGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("right_ear >=", value, "rightEar");
            return (Criteria) this;
        }

        public Criteria andRightEarLessThan(BigDecimal value) {
            addCriterion("right_ear <", value, "rightEar");
            return (Criteria) this;
        }

        public Criteria andRightEarLessThanOrEqualTo(BigDecimal value) {
            addCriterion("right_ear <=", value, "rightEar");
            return (Criteria) this;
        }

        public Criteria andRightEarIn(List<BigDecimal> values) {
            addCriterion("right_ear in", values, "rightEar");
            return (Criteria) this;
        }

        public Criteria andRightEarNotIn(List<BigDecimal> values) {
            addCriterion("right_ear not in", values, "rightEar");
            return (Criteria) this;
        }

        public Criteria andRightEarBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("right_ear between", value1, value2, "rightEar");
            return (Criteria) this;
        }

        public Criteria andRightEarNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("right_ear not between", value1, value2, "rightEar");
            return (Criteria) this;
        }

        public Criteria andStyleIsNull() {
            addCriterion("style is null");
            return (Criteria) this;
        }

        public Criteria andStyleIsNotNull() {
            addCriterion("style is not null");
            return (Criteria) this;
        }

        public Criteria andStyleEqualTo(Byte value) {
            addCriterion("style =", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotEqualTo(Byte value) {
            addCriterion("style <>", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleGreaterThan(Byte value) {
            addCriterion("style >", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleGreaterThanOrEqualTo(Byte value) {
            addCriterion("style >=", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLessThan(Byte value) {
            addCriterion("style <", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLessThanOrEqualTo(Byte value) {
            addCriterion("style <=", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleIn(List<Byte> values) {
            addCriterion("style in", values, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotIn(List<Byte> values) {
            addCriterion("style not in", values, "style");
            return (Criteria) this;
        }

        public Criteria andStyleBetween(Byte value1, Byte value2) {
            addCriterion("style between", value1, value2, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotBetween(Byte value1, Byte value2) {
            addCriterion("style not between", value1, value2, "style");
            return (Criteria) this;
        }

        public Criteria andPanelTdWidthSpecificationsIsNull() {
            addCriterion("panel_td_width_specifications is null");
            return (Criteria) this;
        }

        public Criteria andPanelTdWidthSpecificationsIsNotNull() {
            addCriterion("panel_td_width_specifications is not null");
            return (Criteria) this;
        }

        public Criteria andPanelTdWidthSpecificationsEqualTo(Byte value) {
            addCriterion("panel_td_width_specifications =", value, "panelTdWidthSpecifications");
            return (Criteria) this;
        }

        public Criteria andPanelTdWidthSpecificationsNotEqualTo(Byte value) {
            addCriterion("panel_td_width_specifications <>", value, "panelTdWidthSpecifications");
            return (Criteria) this;
        }

        public Criteria andPanelTdWidthSpecificationsGreaterThan(Byte value) {
            addCriterion("panel_td_width_specifications >", value, "panelTdWidthSpecifications");
            return (Criteria) this;
        }

        public Criteria andPanelTdWidthSpecificationsGreaterThanOrEqualTo(Byte value) {
            addCriterion("panel_td_width_specifications >=", value, "panelTdWidthSpecifications");
            return (Criteria) this;
        }

        public Criteria andPanelTdWidthSpecificationsLessThan(Byte value) {
            addCriterion("panel_td_width_specifications <", value, "panelTdWidthSpecifications");
            return (Criteria) this;
        }

        public Criteria andPanelTdWidthSpecificationsLessThanOrEqualTo(Byte value) {
            addCriterion("panel_td_width_specifications <=", value, "panelTdWidthSpecifications");
            return (Criteria) this;
        }

        public Criteria andPanelTdWidthSpecificationsIn(List<Byte> values) {
            addCriterion("panel_td_width_specifications in", values, "panelTdWidthSpecifications");
            return (Criteria) this;
        }

        public Criteria andPanelTdWidthSpecificationsNotIn(List<Byte> values) {
            addCriterion("panel_td_width_specifications not in", values, "panelTdWidthSpecifications");
            return (Criteria) this;
        }

        public Criteria andPanelTdWidthSpecificationsBetween(Byte value1, Byte value2) {
            addCriterion("panel_td_width_specifications between", value1, value2, "panelTdWidthSpecifications");
            return (Criteria) this;
        }

        public Criteria andPanelTdWidthSpecificationsNotBetween(Byte value1, Byte value2) {
            addCriterion("panel_td_width_specifications not between", value1, value2, "panelTdWidthSpecifications");
            return (Criteria) this;
        }

        public Criteria andPanelLeftTopWidthIsNull() {
            addCriterion("panel_left_top_width is null");
            return (Criteria) this;
        }

        public Criteria andPanelLeftTopWidthIsNotNull() {
            addCriterion("panel_left_top_width is not null");
            return (Criteria) this;
        }

        public Criteria andPanelLeftTopWidthEqualTo(BigDecimal value) {
            addCriterion("panel_left_top_width =", value, "panelLeftTopWidth");
            return (Criteria) this;
        }

        public Criteria andPanelLeftTopWidthNotEqualTo(BigDecimal value) {
            addCriterion("panel_left_top_width <>", value, "panelLeftTopWidth");
            return (Criteria) this;
        }

        public Criteria andPanelLeftTopWidthGreaterThan(BigDecimal value) {
            addCriterion("panel_left_top_width >", value, "panelLeftTopWidth");
            return (Criteria) this;
        }

        public Criteria andPanelLeftTopWidthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("panel_left_top_width >=", value, "panelLeftTopWidth");
            return (Criteria) this;
        }

        public Criteria andPanelLeftTopWidthLessThan(BigDecimal value) {
            addCriterion("panel_left_top_width <", value, "panelLeftTopWidth");
            return (Criteria) this;
        }

        public Criteria andPanelLeftTopWidthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("panel_left_top_width <=", value, "panelLeftTopWidth");
            return (Criteria) this;
        }

        public Criteria andPanelLeftTopWidthIn(List<BigDecimal> values) {
            addCriterion("panel_left_top_width in", values, "panelLeftTopWidth");
            return (Criteria) this;
        }

        public Criteria andPanelLeftTopWidthNotIn(List<BigDecimal> values) {
            addCriterion("panel_left_top_width not in", values, "panelLeftTopWidth");
            return (Criteria) this;
        }

        public Criteria andPanelLeftTopWidthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("panel_left_top_width between", value1, value2, "panelLeftTopWidth");
            return (Criteria) this;
        }

        public Criteria andPanelLeftTopWidthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("panel_left_top_width not between", value1, value2, "panelLeftTopWidth");
            return (Criteria) this;
        }

        public Criteria andPanelLeftDownWidthIsNull() {
            addCriterion("panel_left_down_width is null");
            return (Criteria) this;
        }

        public Criteria andPanelLeftDownWidthIsNotNull() {
            addCriterion("panel_left_down_width is not null");
            return (Criteria) this;
        }

        public Criteria andPanelLeftDownWidthEqualTo(BigDecimal value) {
            addCriterion("panel_left_down_width =", value, "panelLeftDownWidth");
            return (Criteria) this;
        }

        public Criteria andPanelLeftDownWidthNotEqualTo(BigDecimal value) {
            addCriterion("panel_left_down_width <>", value, "panelLeftDownWidth");
            return (Criteria) this;
        }

        public Criteria andPanelLeftDownWidthGreaterThan(BigDecimal value) {
            addCriterion("panel_left_down_width >", value, "panelLeftDownWidth");
            return (Criteria) this;
        }

        public Criteria andPanelLeftDownWidthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("panel_left_down_width >=", value, "panelLeftDownWidth");
            return (Criteria) this;
        }

        public Criteria andPanelLeftDownWidthLessThan(BigDecimal value) {
            addCriterion("panel_left_down_width <", value, "panelLeftDownWidth");
            return (Criteria) this;
        }

        public Criteria andPanelLeftDownWidthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("panel_left_down_width <=", value, "panelLeftDownWidth");
            return (Criteria) this;
        }

        public Criteria andPanelLeftDownWidthIn(List<BigDecimal> values) {
            addCriterion("panel_left_down_width in", values, "panelLeftDownWidth");
            return (Criteria) this;
        }

        public Criteria andPanelLeftDownWidthNotIn(List<BigDecimal> values) {
            addCriterion("panel_left_down_width not in", values, "panelLeftDownWidth");
            return (Criteria) this;
        }

        public Criteria andPanelLeftDownWidthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("panel_left_down_width between", value1, value2, "panelLeftDownWidth");
            return (Criteria) this;
        }

        public Criteria andPanelLeftDownWidthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("panel_left_down_width not between", value1, value2, "panelLeftDownWidth");
            return (Criteria) this;
        }

        public Criteria andPanelRightTopWidthIsNull() {
            addCriterion("panel_right_top_width is null");
            return (Criteria) this;
        }

        public Criteria andPanelRightTopWidthIsNotNull() {
            addCriterion("panel_right_top_width is not null");
            return (Criteria) this;
        }

        public Criteria andPanelRightTopWidthEqualTo(BigDecimal value) {
            addCriterion("panel_right_top_width =", value, "panelRightTopWidth");
            return (Criteria) this;
        }

        public Criteria andPanelRightTopWidthNotEqualTo(BigDecimal value) {
            addCriterion("panel_right_top_width <>", value, "panelRightTopWidth");
            return (Criteria) this;
        }

        public Criteria andPanelRightTopWidthGreaterThan(BigDecimal value) {
            addCriterion("panel_right_top_width >", value, "panelRightTopWidth");
            return (Criteria) this;
        }

        public Criteria andPanelRightTopWidthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("panel_right_top_width >=", value, "panelRightTopWidth");
            return (Criteria) this;
        }

        public Criteria andPanelRightTopWidthLessThan(BigDecimal value) {
            addCriterion("panel_right_top_width <", value, "panelRightTopWidth");
            return (Criteria) this;
        }

        public Criteria andPanelRightTopWidthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("panel_right_top_width <=", value, "panelRightTopWidth");
            return (Criteria) this;
        }

        public Criteria andPanelRightTopWidthIn(List<BigDecimal> values) {
            addCriterion("panel_right_top_width in", values, "panelRightTopWidth");
            return (Criteria) this;
        }

        public Criteria andPanelRightTopWidthNotIn(List<BigDecimal> values) {
            addCriterion("panel_right_top_width not in", values, "panelRightTopWidth");
            return (Criteria) this;
        }

        public Criteria andPanelRightTopWidthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("panel_right_top_width between", value1, value2, "panelRightTopWidth");
            return (Criteria) this;
        }

        public Criteria andPanelRightTopWidthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("panel_right_top_width not between", value1, value2, "panelRightTopWidth");
            return (Criteria) this;
        }

        public Criteria andPanelRightDownWidthIsNull() {
            addCriterion("panel_right_down_width is null");
            return (Criteria) this;
        }

        public Criteria andPanelRightDownWidthIsNotNull() {
            addCriterion("panel_right_down_width is not null");
            return (Criteria) this;
        }

        public Criteria andPanelRightDownWidthEqualTo(BigDecimal value) {
            addCriterion("panel_right_down_width =", value, "panelRightDownWidth");
            return (Criteria) this;
        }

        public Criteria andPanelRightDownWidthNotEqualTo(BigDecimal value) {
            addCriterion("panel_right_down_width <>", value, "panelRightDownWidth");
            return (Criteria) this;
        }

        public Criteria andPanelRightDownWidthGreaterThan(BigDecimal value) {
            addCriterion("panel_right_down_width >", value, "panelRightDownWidth");
            return (Criteria) this;
        }

        public Criteria andPanelRightDownWidthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("panel_right_down_width >=", value, "panelRightDownWidth");
            return (Criteria) this;
        }

        public Criteria andPanelRightDownWidthLessThan(BigDecimal value) {
            addCriterion("panel_right_down_width <", value, "panelRightDownWidth");
            return (Criteria) this;
        }

        public Criteria andPanelRightDownWidthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("panel_right_down_width <=", value, "panelRightDownWidth");
            return (Criteria) this;
        }

        public Criteria andPanelRightDownWidthIn(List<BigDecimal> values) {
            addCriterion("panel_right_down_width in", values, "panelRightDownWidth");
            return (Criteria) this;
        }

        public Criteria andPanelRightDownWidthNotIn(List<BigDecimal> values) {
            addCriterion("panel_right_down_width not in", values, "panelRightDownWidth");
            return (Criteria) this;
        }

        public Criteria andPanelRightDownWidthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("panel_right_down_width between", value1, value2, "panelRightDownWidth");
            return (Criteria) this;
        }

        public Criteria andPanelRightDownWidthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("panel_right_down_width not between", value1, value2, "panelRightDownWidth");
            return (Criteria) this;
        }

        public Criteria andPanelHeightIsNull() {
            addCriterion("panel_height is null");
            return (Criteria) this;
        }

        public Criteria andPanelHeightIsNotNull() {
            addCriterion("panel_height is not null");
            return (Criteria) this;
        }

        public Criteria andPanelHeightEqualTo(BigDecimal value) {
            addCriterion("panel_height =", value, "panelHeight");
            return (Criteria) this;
        }

        public Criteria andPanelHeightNotEqualTo(BigDecimal value) {
            addCriterion("panel_height <>", value, "panelHeight");
            return (Criteria) this;
        }

        public Criteria andPanelHeightGreaterThan(BigDecimal value) {
            addCriterion("panel_height >", value, "panelHeight");
            return (Criteria) this;
        }

        public Criteria andPanelHeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("panel_height >=", value, "panelHeight");
            return (Criteria) this;
        }

        public Criteria andPanelHeightLessThan(BigDecimal value) {
            addCriterion("panel_height <", value, "panelHeight");
            return (Criteria) this;
        }

        public Criteria andPanelHeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("panel_height <=", value, "panelHeight");
            return (Criteria) this;
        }

        public Criteria andPanelHeightIn(List<BigDecimal> values) {
            addCriterion("panel_height in", values, "panelHeight");
            return (Criteria) this;
        }

        public Criteria andPanelHeightNotIn(List<BigDecimal> values) {
            addCriterion("panel_height not in", values, "panelHeight");
            return (Criteria) this;
        }

        public Criteria andPanelHeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("panel_height between", value1, value2, "panelHeight");
            return (Criteria) this;
        }

        public Criteria andPanelHeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("panel_height not between", value1, value2, "panelHeight");
            return (Criteria) this;
        }

        public Criteria andPanelNumberIsNull() {
            addCriterion("panel_number is null");
            return (Criteria) this;
        }

        public Criteria andPanelNumberIsNotNull() {
            addCriterion("panel_number is not null");
            return (Criteria) this;
        }

        public Criteria andPanelNumberEqualTo(Integer value) {
            addCriterion("panel_number =", value, "panelNumber");
            return (Criteria) this;
        }

        public Criteria andPanelNumberNotEqualTo(Integer value) {
            addCriterion("panel_number <>", value, "panelNumber");
            return (Criteria) this;
        }

        public Criteria andPanelNumberGreaterThan(Integer value) {
            addCriterion("panel_number >", value, "panelNumber");
            return (Criteria) this;
        }

        public Criteria andPanelNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("panel_number >=", value, "panelNumber");
            return (Criteria) this;
        }

        public Criteria andPanelNumberLessThan(Integer value) {
            addCriterion("panel_number <", value, "panelNumber");
            return (Criteria) this;
        }

        public Criteria andPanelNumberLessThanOrEqualTo(Integer value) {
            addCriterion("panel_number <=", value, "panelNumber");
            return (Criteria) this;
        }

        public Criteria andPanelNumberIn(List<Integer> values) {
            addCriterion("panel_number in", values, "panelNumber");
            return (Criteria) this;
        }

        public Criteria andPanelNumberNotIn(List<Integer> values) {
            addCriterion("panel_number not in", values, "panelNumber");
            return (Criteria) this;
        }

        public Criteria andPanelNumberBetween(Integer value1, Integer value2) {
            addCriterion("panel_number between", value1, value2, "panelNumber");
            return (Criteria) this;
        }

        public Criteria andPanelNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("panel_number not between", value1, value2, "panelNumber");
            return (Criteria) this;
        }

        public Criteria andPanelRoofWidthSpecificationsIsNull() {
            addCriterion("panel_roof_width_specifications is null");
            return (Criteria) this;
        }

        public Criteria andPanelRoofWidthSpecificationsIsNotNull() {
            addCriterion("panel_roof_width_specifications is not null");
            return (Criteria) this;
        }

        public Criteria andPanelRoofWidthSpecificationsEqualTo(Byte value) {
            addCriterion("panel_roof_width_specifications =", value, "panelRoofWidthSpecifications");
            return (Criteria) this;
        }

        public Criteria andPanelRoofWidthSpecificationsNotEqualTo(Byte value) {
            addCriterion("panel_roof_width_specifications <>", value, "panelRoofWidthSpecifications");
            return (Criteria) this;
        }

        public Criteria andPanelRoofWidthSpecificationsGreaterThan(Byte value) {
            addCriterion("panel_roof_width_specifications >", value, "panelRoofWidthSpecifications");
            return (Criteria) this;
        }

        public Criteria andPanelRoofWidthSpecificationsGreaterThanOrEqualTo(Byte value) {
            addCriterion("panel_roof_width_specifications >=", value, "panelRoofWidthSpecifications");
            return (Criteria) this;
        }

        public Criteria andPanelRoofWidthSpecificationsLessThan(Byte value) {
            addCriterion("panel_roof_width_specifications <", value, "panelRoofWidthSpecifications");
            return (Criteria) this;
        }

        public Criteria andPanelRoofWidthSpecificationsLessThanOrEqualTo(Byte value) {
            addCriterion("panel_roof_width_specifications <=", value, "panelRoofWidthSpecifications");
            return (Criteria) this;
        }

        public Criteria andPanelRoofWidthSpecificationsIn(List<Byte> values) {
            addCriterion("panel_roof_width_specifications in", values, "panelRoofWidthSpecifications");
            return (Criteria) this;
        }

        public Criteria andPanelRoofWidthSpecificationsNotIn(List<Byte> values) {
            addCriterion("panel_roof_width_specifications not in", values, "panelRoofWidthSpecifications");
            return (Criteria) this;
        }

        public Criteria andPanelRoofWidthSpecificationsBetween(Byte value1, Byte value2) {
            addCriterion("panel_roof_width_specifications between", value1, value2, "panelRoofWidthSpecifications");
            return (Criteria) this;
        }

        public Criteria andPanelRoofWidthSpecificationsNotBetween(Byte value1, Byte value2) {
            addCriterion("panel_roof_width_specifications not between", value1, value2, "panelRoofWidthSpecifications");
            return (Criteria) this;
        }

        public Criteria andPanelRoofLeftWidthIsNull() {
            addCriterion("panel_roof_left_width is null");
            return (Criteria) this;
        }

        public Criteria andPanelRoofLeftWidthIsNotNull() {
            addCriterion("panel_roof_left_width is not null");
            return (Criteria) this;
        }

        public Criteria andPanelRoofLeftWidthEqualTo(BigDecimal value) {
            addCriterion("panel_roof_left_width =", value, "panelRoofLeftWidth");
            return (Criteria) this;
        }

        public Criteria andPanelRoofLeftWidthNotEqualTo(BigDecimal value) {
            addCriterion("panel_roof_left_width <>", value, "panelRoofLeftWidth");
            return (Criteria) this;
        }

        public Criteria andPanelRoofLeftWidthGreaterThan(BigDecimal value) {
            addCriterion("panel_roof_left_width >", value, "panelRoofLeftWidth");
            return (Criteria) this;
        }

        public Criteria andPanelRoofLeftWidthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("panel_roof_left_width >=", value, "panelRoofLeftWidth");
            return (Criteria) this;
        }

        public Criteria andPanelRoofLeftWidthLessThan(BigDecimal value) {
            addCriterion("panel_roof_left_width <", value, "panelRoofLeftWidth");
            return (Criteria) this;
        }

        public Criteria andPanelRoofLeftWidthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("panel_roof_left_width <=", value, "panelRoofLeftWidth");
            return (Criteria) this;
        }

        public Criteria andPanelRoofLeftWidthIn(List<BigDecimal> values) {
            addCriterion("panel_roof_left_width in", values, "panelRoofLeftWidth");
            return (Criteria) this;
        }

        public Criteria andPanelRoofLeftWidthNotIn(List<BigDecimal> values) {
            addCriterion("panel_roof_left_width not in", values, "panelRoofLeftWidth");
            return (Criteria) this;
        }

        public Criteria andPanelRoofLeftWidthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("panel_roof_left_width between", value1, value2, "panelRoofLeftWidth");
            return (Criteria) this;
        }

        public Criteria andPanelRoofLeftWidthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("panel_roof_left_width not between", value1, value2, "panelRoofLeftWidth");
            return (Criteria) this;
        }

        public Criteria andPanelRoofRightWidthIsNull() {
            addCriterion("panel_roof_right_width is null");
            return (Criteria) this;
        }

        public Criteria andPanelRoofRightWidthIsNotNull() {
            addCriterion("panel_roof_right_width is not null");
            return (Criteria) this;
        }

        public Criteria andPanelRoofRightWidthEqualTo(BigDecimal value) {
            addCriterion("panel_roof_right_width =", value, "panelRoofRightWidth");
            return (Criteria) this;
        }

        public Criteria andPanelRoofRightWidthNotEqualTo(BigDecimal value) {
            addCriterion("panel_roof_right_width <>", value, "panelRoofRightWidth");
            return (Criteria) this;
        }

        public Criteria andPanelRoofRightWidthGreaterThan(BigDecimal value) {
            addCriterion("panel_roof_right_width >", value, "panelRoofRightWidth");
            return (Criteria) this;
        }

        public Criteria andPanelRoofRightWidthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("panel_roof_right_width >=", value, "panelRoofRightWidth");
            return (Criteria) this;
        }

        public Criteria andPanelRoofRightWidthLessThan(BigDecimal value) {
            addCriterion("panel_roof_right_width <", value, "panelRoofRightWidth");
            return (Criteria) this;
        }

        public Criteria andPanelRoofRightWidthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("panel_roof_right_width <=", value, "panelRoofRightWidth");
            return (Criteria) this;
        }

        public Criteria andPanelRoofRightWidthIn(List<BigDecimal> values) {
            addCriterion("panel_roof_right_width in", values, "panelRoofRightWidth");
            return (Criteria) this;
        }

        public Criteria andPanelRoofRightWidthNotIn(List<BigDecimal> values) {
            addCriterion("panel_roof_right_width not in", values, "panelRoofRightWidth");
            return (Criteria) this;
        }

        public Criteria andPanelRoofRightWidthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("panel_roof_right_width between", value1, value2, "panelRoofRightWidth");
            return (Criteria) this;
        }

        public Criteria andPanelRoofRightWidthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("panel_roof_right_width not between", value1, value2, "panelRoofRightWidth");
            return (Criteria) this;
        }

        public Criteria andPanelRoofNumberIsNull() {
            addCriterion("panel_roof_number is null");
            return (Criteria) this;
        }

        public Criteria andPanelRoofNumberIsNotNull() {
            addCriterion("panel_roof_number is not null");
            return (Criteria) this;
        }

        public Criteria andPanelRoofNumberEqualTo(Integer value) {
            addCriterion("panel_roof_number =", value, "panelRoofNumber");
            return (Criteria) this;
        }

        public Criteria andPanelRoofNumberNotEqualTo(Integer value) {
            addCriterion("panel_roof_number <>", value, "panelRoofNumber");
            return (Criteria) this;
        }

        public Criteria andPanelRoofNumberGreaterThan(Integer value) {
            addCriterion("panel_roof_number >", value, "panelRoofNumber");
            return (Criteria) this;
        }

        public Criteria andPanelRoofNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("panel_roof_number >=", value, "panelRoofNumber");
            return (Criteria) this;
        }

        public Criteria andPanelRoofNumberLessThan(Integer value) {
            addCriterion("panel_roof_number <", value, "panelRoofNumber");
            return (Criteria) this;
        }

        public Criteria andPanelRoofNumberLessThanOrEqualTo(Integer value) {
            addCriterion("panel_roof_number <=", value, "panelRoofNumber");
            return (Criteria) this;
        }

        public Criteria andPanelRoofNumberIn(List<Integer> values) {
            addCriterion("panel_roof_number in", values, "panelRoofNumber");
            return (Criteria) this;
        }

        public Criteria andPanelRoofNumberNotIn(List<Integer> values) {
            addCriterion("panel_roof_number not in", values, "panelRoofNumber");
            return (Criteria) this;
        }

        public Criteria andPanelRoofNumberBetween(Integer value1, Integer value2) {
            addCriterion("panel_roof_number between", value1, value2, "panelRoofNumber");
            return (Criteria) this;
        }

        public Criteria andPanelRoofNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("panel_roof_number not between", value1, value2, "panelRoofNumber");
            return (Criteria) this;
        }

        public Criteria andDoorsetNumberIsNull() {
            addCriterion("doorset_number is null");
            return (Criteria) this;
        }

        public Criteria andDoorsetNumberIsNotNull() {
            addCriterion("doorset_number is not null");
            return (Criteria) this;
        }

        public Criteria andDoorsetNumberEqualTo(Integer value) {
            addCriterion("doorset_number =", value, "doorsetNumber");
            return (Criteria) this;
        }

        public Criteria andDoorsetNumberNotEqualTo(Integer value) {
            addCriterion("doorset_number <>", value, "doorsetNumber");
            return (Criteria) this;
        }

        public Criteria andDoorsetNumberGreaterThan(Integer value) {
            addCriterion("doorset_number >", value, "doorsetNumber");
            return (Criteria) this;
        }

        public Criteria andDoorsetNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("doorset_number >=", value, "doorsetNumber");
            return (Criteria) this;
        }

        public Criteria andDoorsetNumberLessThan(Integer value) {
            addCriterion("doorset_number <", value, "doorsetNumber");
            return (Criteria) this;
        }

        public Criteria andDoorsetNumberLessThanOrEqualTo(Integer value) {
            addCriterion("doorset_number <=", value, "doorsetNumber");
            return (Criteria) this;
        }

        public Criteria andDoorsetNumberIn(List<Integer> values) {
            addCriterion("doorset_number in", values, "doorsetNumber");
            return (Criteria) this;
        }

        public Criteria andDoorsetNumberNotIn(List<Integer> values) {
            addCriterion("doorset_number not in", values, "doorsetNumber");
            return (Criteria) this;
        }

        public Criteria andDoorsetNumberBetween(Integer value1, Integer value2) {
            addCriterion("doorset_number between", value1, value2, "doorsetNumber");
            return (Criteria) this;
        }

        public Criteria andDoorsetNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("doorset_number not between", value1, value2, "doorsetNumber");
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