package cn.interheart.stone.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ProductExample() {
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

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
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

        public Criteria andPlaceOfOriginIsNull() {
            addCriterion("place_of_origin is null");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginIsNotNull() {
            addCriterion("place_of_origin is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginEqualTo(String value) {
            addCriterion("place_of_origin =", value, "placeOfOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginNotEqualTo(String value) {
            addCriterion("place_of_origin <>", value, "placeOfOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginGreaterThan(String value) {
            addCriterion("place_of_origin >", value, "placeOfOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginGreaterThanOrEqualTo(String value) {
            addCriterion("place_of_origin >=", value, "placeOfOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginLessThan(String value) {
            addCriterion("place_of_origin <", value, "placeOfOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginLessThanOrEqualTo(String value) {
            addCriterion("place_of_origin <=", value, "placeOfOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginLike(String value) {
            addCriterion("place_of_origin like", value, "placeOfOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginNotLike(String value) {
            addCriterion("place_of_origin not like", value, "placeOfOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginIn(List<String> values) {
            addCriterion("place_of_origin in", values, "placeOfOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginNotIn(List<String> values) {
            addCriterion("place_of_origin not in", values, "placeOfOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginBetween(String value1, String value2) {
            addCriterion("place_of_origin between", value1, value2, "placeOfOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginNotBetween(String value1, String value2) {
            addCriterion("place_of_origin not between", value1, value2, "placeOfOrigin");
            return (Criteria) this;
        }

        public Criteria andDicTypeCodeIsNull() {
            addCriterion("dic_type_code is null");
            return (Criteria) this;
        }

        public Criteria andDicTypeCodeIsNotNull() {
            addCriterion("dic_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andDicTypeCodeEqualTo(Integer value) {
            addCriterion("dic_type_code =", value, "dicTypeCode");
            return (Criteria) this;
        }

        public Criteria andDicTypeCodeNotEqualTo(Integer value) {
            addCriterion("dic_type_code <>", value, "dicTypeCode");
            return (Criteria) this;
        }

        public Criteria andDicTypeCodeGreaterThan(Integer value) {
            addCriterion("dic_type_code >", value, "dicTypeCode");
            return (Criteria) this;
        }

        public Criteria andDicTypeCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("dic_type_code >=", value, "dicTypeCode");
            return (Criteria) this;
        }

        public Criteria andDicTypeCodeLessThan(Integer value) {
            addCriterion("dic_type_code <", value, "dicTypeCode");
            return (Criteria) this;
        }

        public Criteria andDicTypeCodeLessThanOrEqualTo(Integer value) {
            addCriterion("dic_type_code <=", value, "dicTypeCode");
            return (Criteria) this;
        }

        public Criteria andDicTypeCodeIn(List<Integer> values) {
            addCriterion("dic_type_code in", values, "dicTypeCode");
            return (Criteria) this;
        }

        public Criteria andDicTypeCodeNotIn(List<Integer> values) {
            addCriterion("dic_type_code not in", values, "dicTypeCode");
            return (Criteria) this;
        }

        public Criteria andDicTypeCodeBetween(Integer value1, Integer value2) {
            addCriterion("dic_type_code between", value1, value2, "dicTypeCode");
            return (Criteria) this;
        }

        public Criteria andDicTypeCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("dic_type_code not between", value1, value2, "dicTypeCode");
            return (Criteria) this;
        }

        public Criteria andDicBackgroundCodeIsNull() {
            addCriterion("dic_background_code is null");
            return (Criteria) this;
        }

        public Criteria andDicBackgroundCodeIsNotNull() {
            addCriterion("dic_background_code is not null");
            return (Criteria) this;
        }

        public Criteria andDicBackgroundCodeEqualTo(Integer value) {
            addCriterion("dic_background_code =", value, "dicBackgroundCode");
            return (Criteria) this;
        }

        public Criteria andDicBackgroundCodeNotEqualTo(Integer value) {
            addCriterion("dic_background_code <>", value, "dicBackgroundCode");
            return (Criteria) this;
        }

        public Criteria andDicBackgroundCodeGreaterThan(Integer value) {
            addCriterion("dic_background_code >", value, "dicBackgroundCode");
            return (Criteria) this;
        }

        public Criteria andDicBackgroundCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("dic_background_code >=", value, "dicBackgroundCode");
            return (Criteria) this;
        }

        public Criteria andDicBackgroundCodeLessThan(Integer value) {
            addCriterion("dic_background_code <", value, "dicBackgroundCode");
            return (Criteria) this;
        }

        public Criteria andDicBackgroundCodeLessThanOrEqualTo(Integer value) {
            addCriterion("dic_background_code <=", value, "dicBackgroundCode");
            return (Criteria) this;
        }

        public Criteria andDicBackgroundCodeIn(List<Integer> values) {
            addCriterion("dic_background_code in", values, "dicBackgroundCode");
            return (Criteria) this;
        }

        public Criteria andDicBackgroundCodeNotIn(List<Integer> values) {
            addCriterion("dic_background_code not in", values, "dicBackgroundCode");
            return (Criteria) this;
        }

        public Criteria andDicBackgroundCodeBetween(Integer value1, Integer value2) {
            addCriterion("dic_background_code between", value1, value2, "dicBackgroundCode");
            return (Criteria) this;
        }

        public Criteria andDicBackgroundCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("dic_background_code not between", value1, value2, "dicBackgroundCode");
            return (Criteria) this;
        }

        public Criteria andDicLinesCodeIsNull() {
            addCriterion("dic_lines_code is null");
            return (Criteria) this;
        }

        public Criteria andDicLinesCodeIsNotNull() {
            addCriterion("dic_lines_code is not null");
            return (Criteria) this;
        }

        public Criteria andDicLinesCodeEqualTo(Integer value) {
            addCriterion("dic_lines_code =", value, "dicLinesCode");
            return (Criteria) this;
        }

        public Criteria andDicLinesCodeNotEqualTo(Integer value) {
            addCriterion("dic_lines_code <>", value, "dicLinesCode");
            return (Criteria) this;
        }

        public Criteria andDicLinesCodeGreaterThan(Integer value) {
            addCriterion("dic_lines_code >", value, "dicLinesCode");
            return (Criteria) this;
        }

        public Criteria andDicLinesCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("dic_lines_code >=", value, "dicLinesCode");
            return (Criteria) this;
        }

        public Criteria andDicLinesCodeLessThan(Integer value) {
            addCriterion("dic_lines_code <", value, "dicLinesCode");
            return (Criteria) this;
        }

        public Criteria andDicLinesCodeLessThanOrEqualTo(Integer value) {
            addCriterion("dic_lines_code <=", value, "dicLinesCode");
            return (Criteria) this;
        }

        public Criteria andDicLinesCodeIn(List<Integer> values) {
            addCriterion("dic_lines_code in", values, "dicLinesCode");
            return (Criteria) this;
        }

        public Criteria andDicLinesCodeNotIn(List<Integer> values) {
            addCriterion("dic_lines_code not in", values, "dicLinesCode");
            return (Criteria) this;
        }

        public Criteria andDicLinesCodeBetween(Integer value1, Integer value2) {
            addCriterion("dic_lines_code between", value1, value2, "dicLinesCode");
            return (Criteria) this;
        }

        public Criteria andDicLinesCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("dic_lines_code not between", value1, value2, "dicLinesCode");
            return (Criteria) this;
        }

        public Criteria andDicLinesColorCodeIsNull() {
            addCriterion("dic_lines_color_code is null");
            return (Criteria) this;
        }

        public Criteria andDicLinesColorCodeIsNotNull() {
            addCriterion("dic_lines_color_code is not null");
            return (Criteria) this;
        }

        public Criteria andDicLinesColorCodeEqualTo(Integer value) {
            addCriterion("dic_lines_color_code =", value, "dicLinesColorCode");
            return (Criteria) this;
        }

        public Criteria andDicLinesColorCodeNotEqualTo(Integer value) {
            addCriterion("dic_lines_color_code <>", value, "dicLinesColorCode");
            return (Criteria) this;
        }

        public Criteria andDicLinesColorCodeGreaterThan(Integer value) {
            addCriterion("dic_lines_color_code >", value, "dicLinesColorCode");
            return (Criteria) this;
        }

        public Criteria andDicLinesColorCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("dic_lines_color_code >=", value, "dicLinesColorCode");
            return (Criteria) this;
        }

        public Criteria andDicLinesColorCodeLessThan(Integer value) {
            addCriterion("dic_lines_color_code <", value, "dicLinesColorCode");
            return (Criteria) this;
        }

        public Criteria andDicLinesColorCodeLessThanOrEqualTo(Integer value) {
            addCriterion("dic_lines_color_code <=", value, "dicLinesColorCode");
            return (Criteria) this;
        }

        public Criteria andDicLinesColorCodeIn(List<Integer> values) {
            addCriterion("dic_lines_color_code in", values, "dicLinesColorCode");
            return (Criteria) this;
        }

        public Criteria andDicLinesColorCodeNotIn(List<Integer> values) {
            addCriterion("dic_lines_color_code not in", values, "dicLinesColorCode");
            return (Criteria) this;
        }

        public Criteria andDicLinesColorCodeBetween(Integer value1, Integer value2) {
            addCriterion("dic_lines_color_code between", value1, value2, "dicLinesColorCode");
            return (Criteria) this;
        }

        public Criteria andDicLinesColorCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("dic_lines_color_code not between", value1, value2, "dicLinesColorCode");
            return (Criteria) this;
        }

        public Criteria andFunctionIsNull() {
            addCriterion("function is null");
            return (Criteria) this;
        }

        public Criteria andFunctionIsNotNull() {
            addCriterion("function is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionEqualTo(String value) {
            addCriterion("function =", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionNotEqualTo(String value) {
            addCriterion("function <>", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionGreaterThan(String value) {
            addCriterion("function >", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionGreaterThanOrEqualTo(String value) {
            addCriterion("function >=", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionLessThan(String value) {
            addCriterion("function <", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionLessThanOrEqualTo(String value) {
            addCriterion("function <=", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionLike(String value) {
            addCriterion("function like", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionNotLike(String value) {
            addCriterion("function not like", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionIn(List<String> values) {
            addCriterion("function in", values, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionNotIn(List<String> values) {
            addCriterion("function not in", values, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionBetween(String value1, String value2) {
            addCriterion("function between", value1, value2, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionNotBetween(String value1, String value2) {
            addCriterion("function not between", value1, value2, "function");
            return (Criteria) this;
        }

        public Criteria andApplicationIsNull() {
            addCriterion("application is null");
            return (Criteria) this;
        }

        public Criteria andApplicationIsNotNull() {
            addCriterion("application is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationEqualTo(String value) {
            addCriterion("application =", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationNotEqualTo(String value) {
            addCriterion("application <>", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationGreaterThan(String value) {
            addCriterion("application >", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationGreaterThanOrEqualTo(String value) {
            addCriterion("application >=", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationLessThan(String value) {
            addCriterion("application <", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationLessThanOrEqualTo(String value) {
            addCriterion("application <=", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationLike(String value) {
            addCriterion("application like", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationNotLike(String value) {
            addCriterion("application not like", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationIn(List<String> values) {
            addCriterion("application in", values, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationNotIn(List<String> values) {
            addCriterion("application not in", values, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationBetween(String value1, String value2) {
            addCriterion("application between", value1, value2, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationNotBetween(String value1, String value2) {
            addCriterion("application not between", value1, value2, "application");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIsNull() {
            addCriterion("announcement is null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIsNotNull() {
            addCriterion("announcement is not null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementEqualTo(String value) {
            addCriterion("announcement =", value, "announcement");
            return (Criteria) this;
        }

        public Criteria andAnnouncementNotEqualTo(String value) {
            addCriterion("announcement <>", value, "announcement");
            return (Criteria) this;
        }

        public Criteria andAnnouncementGreaterThan(String value) {
            addCriterion("announcement >", value, "announcement");
            return (Criteria) this;
        }

        public Criteria andAnnouncementGreaterThanOrEqualTo(String value) {
            addCriterion("announcement >=", value, "announcement");
            return (Criteria) this;
        }

        public Criteria andAnnouncementLessThan(String value) {
            addCriterion("announcement <", value, "announcement");
            return (Criteria) this;
        }

        public Criteria andAnnouncementLessThanOrEqualTo(String value) {
            addCriterion("announcement <=", value, "announcement");
            return (Criteria) this;
        }

        public Criteria andAnnouncementLike(String value) {
            addCriterion("announcement like", value, "announcement");
            return (Criteria) this;
        }

        public Criteria andAnnouncementNotLike(String value) {
            addCriterion("announcement not like", value, "announcement");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIn(List<String> values) {
            addCriterion("announcement in", values, "announcement");
            return (Criteria) this;
        }

        public Criteria andAnnouncementNotIn(List<String> values) {
            addCriterion("announcement not in", values, "announcement");
            return (Criteria) this;
        }

        public Criteria andAnnouncementBetween(String value1, String value2) {
            addCriterion("announcement between", value1, value2, "announcement");
            return (Criteria) this;
        }

        public Criteria andAnnouncementNotBetween(String value1, String value2) {
            addCriterion("announcement not between", value1, value2, "announcement");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
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

        public Criteria andIsDisableIsNull() {
            addCriterion("is_disable is null");
            return (Criteria) this;
        }

        public Criteria andIsDisableIsNotNull() {
            addCriterion("is_disable is not null");
            return (Criteria) this;
        }

        public Criteria andIsDisableEqualTo(Byte value) {
            addCriterion("is_disable =", value, "isDisable");
            return (Criteria) this;
        }

        public Criteria andIsDisableNotEqualTo(Byte value) {
            addCriterion("is_disable <>", value, "isDisable");
            return (Criteria) this;
        }

        public Criteria andIsDisableGreaterThan(Byte value) {
            addCriterion("is_disable >", value, "isDisable");
            return (Criteria) this;
        }

        public Criteria andIsDisableGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_disable >=", value, "isDisable");
            return (Criteria) this;
        }

        public Criteria andIsDisableLessThan(Byte value) {
            addCriterion("is_disable <", value, "isDisable");
            return (Criteria) this;
        }

        public Criteria andIsDisableLessThanOrEqualTo(Byte value) {
            addCriterion("is_disable <=", value, "isDisable");
            return (Criteria) this;
        }

        public Criteria andIsDisableIn(List<Byte> values) {
            addCriterion("is_disable in", values, "isDisable");
            return (Criteria) this;
        }

        public Criteria andIsDisableNotIn(List<Byte> values) {
            addCriterion("is_disable not in", values, "isDisable");
            return (Criteria) this;
        }

        public Criteria andIsDisableBetween(Byte value1, Byte value2) {
            addCriterion("is_disable between", value1, value2, "isDisable");
            return (Criteria) this;
        }

        public Criteria andIsDisableNotBetween(Byte value1, Byte value2) {
            addCriterion("is_disable not between", value1, value2, "isDisable");
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