package cn.interheart.stone.dao.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ProjectExample() {
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

        public Criteria andOddNumbersIsNull() {
            addCriterion("odd_numbers is null");
            return (Criteria) this;
        }

        public Criteria andOddNumbersIsNotNull() {
            addCriterion("odd_numbers is not null");
            return (Criteria) this;
        }

        public Criteria andOddNumbersEqualTo(String value) {
            addCriterion("odd_numbers =", value, "oddNumbers");
            return (Criteria) this;
        }

        public Criteria andOddNumbersNotEqualTo(String value) {
            addCriterion("odd_numbers <>", value, "oddNumbers");
            return (Criteria) this;
        }

        public Criteria andOddNumbersGreaterThan(String value) {
            addCriterion("odd_numbers >", value, "oddNumbers");
            return (Criteria) this;
        }

        public Criteria andOddNumbersGreaterThanOrEqualTo(String value) {
            addCriterion("odd_numbers >=", value, "oddNumbers");
            return (Criteria) this;
        }

        public Criteria andOddNumbersLessThan(String value) {
            addCriterion("odd_numbers <", value, "oddNumbers");
            return (Criteria) this;
        }

        public Criteria andOddNumbersLessThanOrEqualTo(String value) {
            addCriterion("odd_numbers <=", value, "oddNumbers");
            return (Criteria) this;
        }

        public Criteria andOddNumbersLike(String value) {
            addCriterion("odd_numbers like", value, "oddNumbers");
            return (Criteria) this;
        }

        public Criteria andOddNumbersNotLike(String value) {
            addCriterion("odd_numbers not like", value, "oddNumbers");
            return (Criteria) this;
        }

        public Criteria andOddNumbersIn(List<String> values) {
            addCriterion("odd_numbers in", values, "oddNumbers");
            return (Criteria) this;
        }

        public Criteria andOddNumbersNotIn(List<String> values) {
            addCriterion("odd_numbers not in", values, "oddNumbers");
            return (Criteria) this;
        }

        public Criteria andOddNumbersBetween(String value1, String value2) {
            addCriterion("odd_numbers between", value1, value2, "oddNumbers");
            return (Criteria) this;
        }

        public Criteria andOddNumbersNotBetween(String value1, String value2) {
            addCriterion("odd_numbers not between", value1, value2, "oddNumbers");
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

        public Criteria andProjectNameIsNull() {
            addCriterion("project_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("project_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("project_name =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("project_name like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("project_name not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("project_name in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("project_name not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("project_name between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("project_name not between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("customer_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("customer_name =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("customer_name <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("customer_name >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_name >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("customer_name <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("customer_name <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("customer_name like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("customer_name not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("customer_name in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("customer_name not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("customer_name between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("customer_name not between", value1, value2, "customerName");
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

        public Criteria andQqIsNull() {
            addCriterion("qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andWxIsNull() {
            addCriterion("wx is null");
            return (Criteria) this;
        }

        public Criteria andWxIsNotNull() {
            addCriterion("wx is not null");
            return (Criteria) this;
        }

        public Criteria andWxEqualTo(String value) {
            addCriterion("wx =", value, "wx");
            return (Criteria) this;
        }

        public Criteria andWxNotEqualTo(String value) {
            addCriterion("wx <>", value, "wx");
            return (Criteria) this;
        }

        public Criteria andWxGreaterThan(String value) {
            addCriterion("wx >", value, "wx");
            return (Criteria) this;
        }

        public Criteria andWxGreaterThanOrEqualTo(String value) {
            addCriterion("wx >=", value, "wx");
            return (Criteria) this;
        }

        public Criteria andWxLessThan(String value) {
            addCriterion("wx <", value, "wx");
            return (Criteria) this;
        }

        public Criteria andWxLessThanOrEqualTo(String value) {
            addCriterion("wx <=", value, "wx");
            return (Criteria) this;
        }

        public Criteria andWxLike(String value) {
            addCriterion("wx like", value, "wx");
            return (Criteria) this;
        }

        public Criteria andWxNotLike(String value) {
            addCriterion("wx not like", value, "wx");
            return (Criteria) this;
        }

        public Criteria andWxIn(List<String> values) {
            addCriterion("wx in", values, "wx");
            return (Criteria) this;
        }

        public Criteria andWxNotIn(List<String> values) {
            addCriterion("wx not in", values, "wx");
            return (Criteria) this;
        }

        public Criteria andWxBetween(String value1, String value2) {
            addCriterion("wx between", value1, value2, "wx");
            return (Criteria) this;
        }

        public Criteria andWxNotBetween(String value1, String value2) {
            addCriterion("wx not between", value1, value2, "wx");
            return (Criteria) this;
        }

        public Criteria andDicHouseTypeCodeIsNull() {
            addCriterion("dic_house_type_code is null");
            return (Criteria) this;
        }

        public Criteria andDicHouseTypeCodeIsNotNull() {
            addCriterion("dic_house_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andDicHouseTypeCodeEqualTo(Integer value) {
            addCriterion("dic_house_type_code =", value, "dicHouseTypeCode");
            return (Criteria) this;
        }

        public Criteria andDicHouseTypeCodeNotEqualTo(Integer value) {
            addCriterion("dic_house_type_code <>", value, "dicHouseTypeCode");
            return (Criteria) this;
        }

        public Criteria andDicHouseTypeCodeGreaterThan(Integer value) {
            addCriterion("dic_house_type_code >", value, "dicHouseTypeCode");
            return (Criteria) this;
        }

        public Criteria andDicHouseTypeCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("dic_house_type_code >=", value, "dicHouseTypeCode");
            return (Criteria) this;
        }

        public Criteria andDicHouseTypeCodeLessThan(Integer value) {
            addCriterion("dic_house_type_code <", value, "dicHouseTypeCode");
            return (Criteria) this;
        }

        public Criteria andDicHouseTypeCodeLessThanOrEqualTo(Integer value) {
            addCriterion("dic_house_type_code <=", value, "dicHouseTypeCode");
            return (Criteria) this;
        }

        public Criteria andDicHouseTypeCodeIn(List<Integer> values) {
            addCriterion("dic_house_type_code in", values, "dicHouseTypeCode");
            return (Criteria) this;
        }

        public Criteria andDicHouseTypeCodeNotIn(List<Integer> values) {
            addCriterion("dic_house_type_code not in", values, "dicHouseTypeCode");
            return (Criteria) this;
        }

        public Criteria andDicHouseTypeCodeBetween(Integer value1, Integer value2) {
            addCriterion("dic_house_type_code between", value1, value2, "dicHouseTypeCode");
            return (Criteria) this;
        }

        public Criteria andDicHouseTypeCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("dic_house_type_code not between", value1, value2, "dicHouseTypeCode");
            return (Criteria) this;
        }

        public Criteria andDicHouseTypeContentIsNull() {
            addCriterion("dic_house_type_content is null");
            return (Criteria) this;
        }

        public Criteria andDicHouseTypeContentIsNotNull() {
            addCriterion("dic_house_type_content is not null");
            return (Criteria) this;
        }

        public Criteria andDicHouseTypeContentEqualTo(String value) {
            addCriterion("dic_house_type_content =", value, "dicHouseTypeContent");
            return (Criteria) this;
        }

        public Criteria andDicHouseTypeContentNotEqualTo(String value) {
            addCriterion("dic_house_type_content <>", value, "dicHouseTypeContent");
            return (Criteria) this;
        }

        public Criteria andDicHouseTypeContentGreaterThan(String value) {
            addCriterion("dic_house_type_content >", value, "dicHouseTypeContent");
            return (Criteria) this;
        }

        public Criteria andDicHouseTypeContentGreaterThanOrEqualTo(String value) {
            addCriterion("dic_house_type_content >=", value, "dicHouseTypeContent");
            return (Criteria) this;
        }

        public Criteria andDicHouseTypeContentLessThan(String value) {
            addCriterion("dic_house_type_content <", value, "dicHouseTypeContent");
            return (Criteria) this;
        }

        public Criteria andDicHouseTypeContentLessThanOrEqualTo(String value) {
            addCriterion("dic_house_type_content <=", value, "dicHouseTypeContent");
            return (Criteria) this;
        }

        public Criteria andDicHouseTypeContentLike(String value) {
            addCriterion("dic_house_type_content like", value, "dicHouseTypeContent");
            return (Criteria) this;
        }

        public Criteria andDicHouseTypeContentNotLike(String value) {
            addCriterion("dic_house_type_content not like", value, "dicHouseTypeContent");
            return (Criteria) this;
        }

        public Criteria andDicHouseTypeContentIn(List<String> values) {
            addCriterion("dic_house_type_content in", values, "dicHouseTypeContent");
            return (Criteria) this;
        }

        public Criteria andDicHouseTypeContentNotIn(List<String> values) {
            addCriterion("dic_house_type_content not in", values, "dicHouseTypeContent");
            return (Criteria) this;
        }

        public Criteria andDicHouseTypeContentBetween(String value1, String value2) {
            addCriterion("dic_house_type_content between", value1, value2, "dicHouseTypeContent");
            return (Criteria) this;
        }

        public Criteria andDicHouseTypeContentNotBetween(String value1, String value2) {
            addCriterion("dic_house_type_content not between", value1, value2, "dicHouseTypeContent");
            return (Criteria) this;
        }

        public Criteria andAcreageIsNull() {
            addCriterion("acreage is null");
            return (Criteria) this;
        }

        public Criteria andAcreageIsNotNull() {
            addCriterion("acreage is not null");
            return (Criteria) this;
        }

        public Criteria andAcreageEqualTo(BigDecimal value) {
            addCriterion("acreage =", value, "acreage");
            return (Criteria) this;
        }

        public Criteria andAcreageNotEqualTo(BigDecimal value) {
            addCriterion("acreage <>", value, "acreage");
            return (Criteria) this;
        }

        public Criteria andAcreageGreaterThan(BigDecimal value) {
            addCriterion("acreage >", value, "acreage");
            return (Criteria) this;
        }

        public Criteria andAcreageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("acreage >=", value, "acreage");
            return (Criteria) this;
        }

        public Criteria andAcreageLessThan(BigDecimal value) {
            addCriterion("acreage <", value, "acreage");
            return (Criteria) this;
        }

        public Criteria andAcreageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("acreage <=", value, "acreage");
            return (Criteria) this;
        }

        public Criteria andAcreageIn(List<BigDecimal> values) {
            addCriterion("acreage in", values, "acreage");
            return (Criteria) this;
        }

        public Criteria andAcreageNotIn(List<BigDecimal> values) {
            addCriterion("acreage not in", values, "acreage");
            return (Criteria) this;
        }

        public Criteria andAcreageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("acreage between", value1, value2, "acreage");
            return (Criteria) this;
        }

        public Criteria andAcreageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("acreage not between", value1, value2, "acreage");
            return (Criteria) this;
        }

        public Criteria andDecorativeStyleIsNull() {
            addCriterion("decorative_style is null");
            return (Criteria) this;
        }

        public Criteria andDecorativeStyleIsNotNull() {
            addCriterion("decorative_style is not null");
            return (Criteria) this;
        }

        public Criteria andDecorativeStyleEqualTo(String value) {
            addCriterion("decorative_style =", value, "decorativeStyle");
            return (Criteria) this;
        }

        public Criteria andDecorativeStyleNotEqualTo(String value) {
            addCriterion("decorative_style <>", value, "decorativeStyle");
            return (Criteria) this;
        }

        public Criteria andDecorativeStyleGreaterThan(String value) {
            addCriterion("decorative_style >", value, "decorativeStyle");
            return (Criteria) this;
        }

        public Criteria andDecorativeStyleGreaterThanOrEqualTo(String value) {
            addCriterion("decorative_style >=", value, "decorativeStyle");
            return (Criteria) this;
        }

        public Criteria andDecorativeStyleLessThan(String value) {
            addCriterion("decorative_style <", value, "decorativeStyle");
            return (Criteria) this;
        }

        public Criteria andDecorativeStyleLessThanOrEqualTo(String value) {
            addCriterion("decorative_style <=", value, "decorativeStyle");
            return (Criteria) this;
        }

        public Criteria andDecorativeStyleLike(String value) {
            addCriterion("decorative_style like", value, "decorativeStyle");
            return (Criteria) this;
        }

        public Criteria andDecorativeStyleNotLike(String value) {
            addCriterion("decorative_style not like", value, "decorativeStyle");
            return (Criteria) this;
        }

        public Criteria andDecorativeStyleIn(List<String> values) {
            addCriterion("decorative_style in", values, "decorativeStyle");
            return (Criteria) this;
        }

        public Criteria andDecorativeStyleNotIn(List<String> values) {
            addCriterion("decorative_style not in", values, "decorativeStyle");
            return (Criteria) this;
        }

        public Criteria andDecorativeStyleBetween(String value1, String value2) {
            addCriterion("decorative_style between", value1, value2, "decorativeStyle");
            return (Criteria) this;
        }

        public Criteria andDecorativeStyleNotBetween(String value1, String value2) {
            addCriterion("decorative_style not between", value1, value2, "decorativeStyle");
            return (Criteria) this;
        }

        public Criteria andOpenDateIsNull() {
            addCriterion("open_date is null");
            return (Criteria) this;
        }

        public Criteria andOpenDateIsNotNull() {
            addCriterion("open_date is not null");
            return (Criteria) this;
        }

        public Criteria andOpenDateEqualTo(Date value) {
            addCriterion("open_date =", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateNotEqualTo(Date value) {
            addCriterion("open_date <>", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateGreaterThan(Date value) {
            addCriterion("open_date >", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateGreaterThanOrEqualTo(Date value) {
            addCriterion("open_date >=", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateLessThan(Date value) {
            addCriterion("open_date <", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateLessThanOrEqualTo(Date value) {
            addCriterion("open_date <=", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateIn(List<Date> values) {
            addCriterion("open_date in", values, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateNotIn(List<Date> values) {
            addCriterion("open_date not in", values, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateBetween(Date value1, Date value2) {
            addCriterion("open_date between", value1, value2, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateNotBetween(Date value1, Date value2) {
            addCriterion("open_date not between", value1, value2, "openDate");
            return (Criteria) this;
        }

        public Criteria andIsDesignCompanyIsNull() {
            addCriterion("is_design_company is null");
            return (Criteria) this;
        }

        public Criteria andIsDesignCompanyIsNotNull() {
            addCriterion("is_design_company is not null");
            return (Criteria) this;
        }

        public Criteria andIsDesignCompanyEqualTo(Byte value) {
            addCriterion("is_design_company =", value, "isDesignCompany");
            return (Criteria) this;
        }

        public Criteria andIsDesignCompanyNotEqualTo(Byte value) {
            addCriterion("is_design_company <>", value, "isDesignCompany");
            return (Criteria) this;
        }

        public Criteria andIsDesignCompanyGreaterThan(Byte value) {
            addCriterion("is_design_company >", value, "isDesignCompany");
            return (Criteria) this;
        }

        public Criteria andIsDesignCompanyGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_design_company >=", value, "isDesignCompany");
            return (Criteria) this;
        }

        public Criteria andIsDesignCompanyLessThan(Byte value) {
            addCriterion("is_design_company <", value, "isDesignCompany");
            return (Criteria) this;
        }

        public Criteria andIsDesignCompanyLessThanOrEqualTo(Byte value) {
            addCriterion("is_design_company <=", value, "isDesignCompany");
            return (Criteria) this;
        }

        public Criteria andIsDesignCompanyIn(List<Byte> values) {
            addCriterion("is_design_company in", values, "isDesignCompany");
            return (Criteria) this;
        }

        public Criteria andIsDesignCompanyNotIn(List<Byte> values) {
            addCriterion("is_design_company not in", values, "isDesignCompany");
            return (Criteria) this;
        }

        public Criteria andIsDesignCompanyBetween(Byte value1, Byte value2) {
            addCriterion("is_design_company between", value1, value2, "isDesignCompany");
            return (Criteria) this;
        }

        public Criteria andIsDesignCompanyNotBetween(Byte value1, Byte value2) {
            addCriterion("is_design_company not between", value1, value2, "isDesignCompany");
            return (Criteria) this;
        }

        public Criteria andIsDesignSchemeIsNull() {
            addCriterion("is_design_scheme is null");
            return (Criteria) this;
        }

        public Criteria andIsDesignSchemeIsNotNull() {
            addCriterion("is_design_scheme is not null");
            return (Criteria) this;
        }

        public Criteria andIsDesignSchemeEqualTo(Byte value) {
            addCriterion("is_design_scheme =", value, "isDesignScheme");
            return (Criteria) this;
        }

        public Criteria andIsDesignSchemeNotEqualTo(Byte value) {
            addCriterion("is_design_scheme <>", value, "isDesignScheme");
            return (Criteria) this;
        }

        public Criteria andIsDesignSchemeGreaterThan(Byte value) {
            addCriterion("is_design_scheme >", value, "isDesignScheme");
            return (Criteria) this;
        }

        public Criteria andIsDesignSchemeGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_design_scheme >=", value, "isDesignScheme");
            return (Criteria) this;
        }

        public Criteria andIsDesignSchemeLessThan(Byte value) {
            addCriterion("is_design_scheme <", value, "isDesignScheme");
            return (Criteria) this;
        }

        public Criteria andIsDesignSchemeLessThanOrEqualTo(Byte value) {
            addCriterion("is_design_scheme <=", value, "isDesignScheme");
            return (Criteria) this;
        }

        public Criteria andIsDesignSchemeIn(List<Byte> values) {
            addCriterion("is_design_scheme in", values, "isDesignScheme");
            return (Criteria) this;
        }

        public Criteria andIsDesignSchemeNotIn(List<Byte> values) {
            addCriterion("is_design_scheme not in", values, "isDesignScheme");
            return (Criteria) this;
        }

        public Criteria andIsDesignSchemeBetween(Byte value1, Byte value2) {
            addCriterion("is_design_scheme between", value1, value2, "isDesignScheme");
            return (Criteria) this;
        }

        public Criteria andIsDesignSchemeNotBetween(Byte value1, Byte value2) {
            addCriterion("is_design_scheme not between", value1, value2, "isDesignScheme");
            return (Criteria) this;
        }

        public Criteria andIsElevatorIsNull() {
            addCriterion("is_elevator is null");
            return (Criteria) this;
        }

        public Criteria andIsElevatorIsNotNull() {
            addCriterion("is_elevator is not null");
            return (Criteria) this;
        }

        public Criteria andIsElevatorEqualTo(Byte value) {
            addCriterion("is_elevator =", value, "isElevator");
            return (Criteria) this;
        }

        public Criteria andIsElevatorNotEqualTo(Byte value) {
            addCriterion("is_elevator <>", value, "isElevator");
            return (Criteria) this;
        }

        public Criteria andIsElevatorGreaterThan(Byte value) {
            addCriterion("is_elevator >", value, "isElevator");
            return (Criteria) this;
        }

        public Criteria andIsElevatorGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_elevator >=", value, "isElevator");
            return (Criteria) this;
        }

        public Criteria andIsElevatorLessThan(Byte value) {
            addCriterion("is_elevator <", value, "isElevator");
            return (Criteria) this;
        }

        public Criteria andIsElevatorLessThanOrEqualTo(Byte value) {
            addCriterion("is_elevator <=", value, "isElevator");
            return (Criteria) this;
        }

        public Criteria andIsElevatorIn(List<Byte> values) {
            addCriterion("is_elevator in", values, "isElevator");
            return (Criteria) this;
        }

        public Criteria andIsElevatorNotIn(List<Byte> values) {
            addCriterion("is_elevator not in", values, "isElevator");
            return (Criteria) this;
        }

        public Criteria andIsElevatorBetween(Byte value1, Byte value2) {
            addCriterion("is_elevator between", value1, value2, "isElevator");
            return (Criteria) this;
        }

        public Criteria andIsElevatorNotBetween(Byte value1, Byte value2) {
            addCriterion("is_elevator not between", value1, value2, "isElevator");
            return (Criteria) this;
        }

        public Criteria andMaterialIntentMoneyIsNull() {
            addCriterion("material_intent_money is null");
            return (Criteria) this;
        }

        public Criteria andMaterialIntentMoneyIsNotNull() {
            addCriterion("material_intent_money is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialIntentMoneyEqualTo(BigDecimal value) {
            addCriterion("material_intent_money =", value, "materialIntentMoney");
            return (Criteria) this;
        }

        public Criteria andMaterialIntentMoneyNotEqualTo(BigDecimal value) {
            addCriterion("material_intent_money <>", value, "materialIntentMoney");
            return (Criteria) this;
        }

        public Criteria andMaterialIntentMoneyGreaterThan(BigDecimal value) {
            addCriterion("material_intent_money >", value, "materialIntentMoney");
            return (Criteria) this;
        }

        public Criteria andMaterialIntentMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("material_intent_money >=", value, "materialIntentMoney");
            return (Criteria) this;
        }

        public Criteria andMaterialIntentMoneyLessThan(BigDecimal value) {
            addCriterion("material_intent_money <", value, "materialIntentMoney");
            return (Criteria) this;
        }

        public Criteria andMaterialIntentMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("material_intent_money <=", value, "materialIntentMoney");
            return (Criteria) this;
        }

        public Criteria andMaterialIntentMoneyIn(List<BigDecimal> values) {
            addCriterion("material_intent_money in", values, "materialIntentMoney");
            return (Criteria) this;
        }

        public Criteria andMaterialIntentMoneyNotIn(List<BigDecimal> values) {
            addCriterion("material_intent_money not in", values, "materialIntentMoney");
            return (Criteria) this;
        }

        public Criteria andMaterialIntentMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("material_intent_money between", value1, value2, "materialIntentMoney");
            return (Criteria) this;
        }

        public Criteria andMaterialIntentMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("material_intent_money not between", value1, value2, "materialIntentMoney");
            return (Criteria) this;
        }

        public Criteria andBudgetMoneyIsNull() {
            addCriterion("budget_money is null");
            return (Criteria) this;
        }

        public Criteria andBudgetMoneyIsNotNull() {
            addCriterion("budget_money is not null");
            return (Criteria) this;
        }

        public Criteria andBudgetMoneyEqualTo(BigDecimal value) {
            addCriterion("budget_money =", value, "budgetMoney");
            return (Criteria) this;
        }

        public Criteria andBudgetMoneyNotEqualTo(BigDecimal value) {
            addCriterion("budget_money <>", value, "budgetMoney");
            return (Criteria) this;
        }

        public Criteria andBudgetMoneyGreaterThan(BigDecimal value) {
            addCriterion("budget_money >", value, "budgetMoney");
            return (Criteria) this;
        }

        public Criteria andBudgetMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("budget_money >=", value, "budgetMoney");
            return (Criteria) this;
        }

        public Criteria andBudgetMoneyLessThan(BigDecimal value) {
            addCriterion("budget_money <", value, "budgetMoney");
            return (Criteria) this;
        }

        public Criteria andBudgetMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("budget_money <=", value, "budgetMoney");
            return (Criteria) this;
        }

        public Criteria andBudgetMoneyIn(List<BigDecimal> values) {
            addCriterion("budget_money in", values, "budgetMoney");
            return (Criteria) this;
        }

        public Criteria andBudgetMoneyNotIn(List<BigDecimal> values) {
            addCriterion("budget_money not in", values, "budgetMoney");
            return (Criteria) this;
        }

        public Criteria andBudgetMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("budget_money between", value1, value2, "budgetMoney");
            return (Criteria) this;
        }

        public Criteria andBudgetMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("budget_money not between", value1, value2, "budgetMoney");
            return (Criteria) this;
        }

        public Criteria andUsePartIsNull() {
            addCriterion("use_part is null");
            return (Criteria) this;
        }

        public Criteria andUsePartIsNotNull() {
            addCriterion("use_part is not null");
            return (Criteria) this;
        }

        public Criteria andUsePartEqualTo(String value) {
            addCriterion("use_part =", value, "usePart");
            return (Criteria) this;
        }

        public Criteria andUsePartNotEqualTo(String value) {
            addCriterion("use_part <>", value, "usePart");
            return (Criteria) this;
        }

        public Criteria andUsePartGreaterThan(String value) {
            addCriterion("use_part >", value, "usePart");
            return (Criteria) this;
        }

        public Criteria andUsePartGreaterThanOrEqualTo(String value) {
            addCriterion("use_part >=", value, "usePart");
            return (Criteria) this;
        }

        public Criteria andUsePartLessThan(String value) {
            addCriterion("use_part <", value, "usePart");
            return (Criteria) this;
        }

        public Criteria andUsePartLessThanOrEqualTo(String value) {
            addCriterion("use_part <=", value, "usePart");
            return (Criteria) this;
        }

        public Criteria andUsePartLike(String value) {
            addCriterion("use_part like", value, "usePart");
            return (Criteria) this;
        }

        public Criteria andUsePartNotLike(String value) {
            addCriterion("use_part not like", value, "usePart");
            return (Criteria) this;
        }

        public Criteria andUsePartIn(List<String> values) {
            addCriterion("use_part in", values, "usePart");
            return (Criteria) this;
        }

        public Criteria andUsePartNotIn(List<String> values) {
            addCriterion("use_part not in", values, "usePart");
            return (Criteria) this;
        }

        public Criteria andUsePartBetween(String value1, String value2) {
            addCriterion("use_part between", value1, value2, "usePart");
            return (Criteria) this;
        }

        public Criteria andUsePartNotBetween(String value1, String value2) {
            addCriterion("use_part not between", value1, value2, "usePart");
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCustomerIntentionIsNull() {
            addCriterion("customer_intention is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIntentionIsNotNull() {
            addCriterion("customer_intention is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIntentionEqualTo(Byte value) {
            addCriterion("customer_intention =", value, "customerIntention");
            return (Criteria) this;
        }

        public Criteria andCustomerIntentionNotEqualTo(Byte value) {
            addCriterion("customer_intention <>", value, "customerIntention");
            return (Criteria) this;
        }

        public Criteria andCustomerIntentionGreaterThan(Byte value) {
            addCriterion("customer_intention >", value, "customerIntention");
            return (Criteria) this;
        }

        public Criteria andCustomerIntentionGreaterThanOrEqualTo(Byte value) {
            addCriterion("customer_intention >=", value, "customerIntention");
            return (Criteria) this;
        }

        public Criteria andCustomerIntentionLessThan(Byte value) {
            addCriterion("customer_intention <", value, "customerIntention");
            return (Criteria) this;
        }

        public Criteria andCustomerIntentionLessThanOrEqualTo(Byte value) {
            addCriterion("customer_intention <=", value, "customerIntention");
            return (Criteria) this;
        }

        public Criteria andCustomerIntentionIn(List<Byte> values) {
            addCriterion("customer_intention in", values, "customerIntention");
            return (Criteria) this;
        }

        public Criteria andCustomerIntentionNotIn(List<Byte> values) {
            addCriterion("customer_intention not in", values, "customerIntention");
            return (Criteria) this;
        }

        public Criteria andCustomerIntentionBetween(Byte value1, Byte value2) {
            addCriterion("customer_intention between", value1, value2, "customerIntention");
            return (Criteria) this;
        }

        public Criteria andCustomerIntentionNotBetween(Byte value1, Byte value2) {
            addCriterion("customer_intention not between", value1, value2, "customerIntention");
            return (Criteria) this;
        }

        public Criteria andXsUserIdIsNull() {
            addCriterion("xs_user_id is null");
            return (Criteria) this;
        }

        public Criteria andXsUserIdIsNotNull() {
            addCriterion("xs_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andXsUserIdEqualTo(Integer value) {
            addCriterion("xs_user_id =", value, "xsUserId");
            return (Criteria) this;
        }

        public Criteria andXsUserIdNotEqualTo(Integer value) {
            addCriterion("xs_user_id <>", value, "xsUserId");
            return (Criteria) this;
        }

        public Criteria andXsUserIdGreaterThan(Integer value) {
            addCriterion("xs_user_id >", value, "xsUserId");
            return (Criteria) this;
        }

        public Criteria andXsUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("xs_user_id >=", value, "xsUserId");
            return (Criteria) this;
        }

        public Criteria andXsUserIdLessThan(Integer value) {
            addCriterion("xs_user_id <", value, "xsUserId");
            return (Criteria) this;
        }

        public Criteria andXsUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("xs_user_id <=", value, "xsUserId");
            return (Criteria) this;
        }

        public Criteria andXsUserIdIn(List<Integer> values) {
            addCriterion("xs_user_id in", values, "xsUserId");
            return (Criteria) this;
        }

        public Criteria andXsUserIdNotIn(List<Integer> values) {
            addCriterion("xs_user_id not in", values, "xsUserId");
            return (Criteria) this;
        }

        public Criteria andXsUserIdBetween(Integer value1, Integer value2) {
            addCriterion("xs_user_id between", value1, value2, "xsUserId");
            return (Criteria) this;
        }

        public Criteria andXsUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("xs_user_id not between", value1, value2, "xsUserId");
            return (Criteria) this;
        }

        public Criteria andLcUserIdIsNull() {
            addCriterion("lc_user_id is null");
            return (Criteria) this;
        }

        public Criteria andLcUserIdIsNotNull() {
            addCriterion("lc_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andLcUserIdEqualTo(Integer value) {
            addCriterion("lc_user_id =", value, "lcUserId");
            return (Criteria) this;
        }

        public Criteria andLcUserIdNotEqualTo(Integer value) {
            addCriterion("lc_user_id <>", value, "lcUserId");
            return (Criteria) this;
        }

        public Criteria andLcUserIdGreaterThan(Integer value) {
            addCriterion("lc_user_id >", value, "lcUserId");
            return (Criteria) this;
        }

        public Criteria andLcUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("lc_user_id >=", value, "lcUserId");
            return (Criteria) this;
        }

        public Criteria andLcUserIdLessThan(Integer value) {
            addCriterion("lc_user_id <", value, "lcUserId");
            return (Criteria) this;
        }

        public Criteria andLcUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("lc_user_id <=", value, "lcUserId");
            return (Criteria) this;
        }

        public Criteria andLcUserIdIn(List<Integer> values) {
            addCriterion("lc_user_id in", values, "lcUserId");
            return (Criteria) this;
        }

        public Criteria andLcUserIdNotIn(List<Integer> values) {
            addCriterion("lc_user_id not in", values, "lcUserId");
            return (Criteria) this;
        }

        public Criteria andLcUserIdBetween(Integer value1, Integer value2) {
            addCriterion("lc_user_id between", value1, value2, "lcUserId");
            return (Criteria) this;
        }

        public Criteria andLcUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("lc_user_id not between", value1, value2, "lcUserId");
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