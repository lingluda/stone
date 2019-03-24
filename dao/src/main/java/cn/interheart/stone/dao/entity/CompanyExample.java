package cn.interheart.stone.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public CompanyExample() {
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

        public Criteria andRegistrationNumberIsNull() {
            addCriterion("registration_number is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationNumberIsNotNull() {
            addCriterion("registration_number is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationNumberEqualTo(String value) {
            addCriterion("registration_number =", value, "registrationNumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationNumberNotEqualTo(String value) {
            addCriterion("registration_number <>", value, "registrationNumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationNumberGreaterThan(String value) {
            addCriterion("registration_number >", value, "registrationNumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationNumberGreaterThanOrEqualTo(String value) {
            addCriterion("registration_number >=", value, "registrationNumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationNumberLessThan(String value) {
            addCriterion("registration_number <", value, "registrationNumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationNumberLessThanOrEqualTo(String value) {
            addCriterion("registration_number <=", value, "registrationNumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationNumberLike(String value) {
            addCriterion("registration_number like", value, "registrationNumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationNumberNotLike(String value) {
            addCriterion("registration_number not like", value, "registrationNumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationNumberIn(List<String> values) {
            addCriterion("registration_number in", values, "registrationNumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationNumberNotIn(List<String> values) {
            addCriterion("registration_number not in", values, "registrationNumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationNumberBetween(String value1, String value2) {
            addCriterion("registration_number between", value1, value2, "registrationNumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationNumberNotBetween(String value1, String value2) {
            addCriterion("registration_number not between", value1, value2, "registrationNumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationDepartmentIsNull() {
            addCriterion("registration_department is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationDepartmentIsNotNull() {
            addCriterion("registration_department is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationDepartmentEqualTo(String value) {
            addCriterion("registration_department =", value, "registrationDepartment");
            return (Criteria) this;
        }

        public Criteria andRegistrationDepartmentNotEqualTo(String value) {
            addCriterion("registration_department <>", value, "registrationDepartment");
            return (Criteria) this;
        }

        public Criteria andRegistrationDepartmentGreaterThan(String value) {
            addCriterion("registration_department >", value, "registrationDepartment");
            return (Criteria) this;
        }

        public Criteria andRegistrationDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("registration_department >=", value, "registrationDepartment");
            return (Criteria) this;
        }

        public Criteria andRegistrationDepartmentLessThan(String value) {
            addCriterion("registration_department <", value, "registrationDepartment");
            return (Criteria) this;
        }

        public Criteria andRegistrationDepartmentLessThanOrEqualTo(String value) {
            addCriterion("registration_department <=", value, "registrationDepartment");
            return (Criteria) this;
        }

        public Criteria andRegistrationDepartmentLike(String value) {
            addCriterion("registration_department like", value, "registrationDepartment");
            return (Criteria) this;
        }

        public Criteria andRegistrationDepartmentNotLike(String value) {
            addCriterion("registration_department not like", value, "registrationDepartment");
            return (Criteria) this;
        }

        public Criteria andRegistrationDepartmentIn(List<String> values) {
            addCriterion("registration_department in", values, "registrationDepartment");
            return (Criteria) this;
        }

        public Criteria andRegistrationDepartmentNotIn(List<String> values) {
            addCriterion("registration_department not in", values, "registrationDepartment");
            return (Criteria) this;
        }

        public Criteria andRegistrationDepartmentBetween(String value1, String value2) {
            addCriterion("registration_department between", value1, value2, "registrationDepartment");
            return (Criteria) this;
        }

        public Criteria andRegistrationDepartmentNotBetween(String value1, String value2) {
            addCriterion("registration_department not between", value1, value2, "registrationDepartment");
            return (Criteria) this;
        }

        public Criteria andSetupDateIsNull() {
            addCriterion("setup_date is null");
            return (Criteria) this;
        }

        public Criteria andSetupDateIsNotNull() {
            addCriterion("setup_date is not null");
            return (Criteria) this;
        }

        public Criteria andSetupDateEqualTo(Date value) {
            addCriterion("setup_date =", value, "setupDate");
            return (Criteria) this;
        }

        public Criteria andSetupDateNotEqualTo(Date value) {
            addCriterion("setup_date <>", value, "setupDate");
            return (Criteria) this;
        }

        public Criteria andSetupDateGreaterThan(Date value) {
            addCriterion("setup_date >", value, "setupDate");
            return (Criteria) this;
        }

        public Criteria andSetupDateGreaterThanOrEqualTo(Date value) {
            addCriterion("setup_date >=", value, "setupDate");
            return (Criteria) this;
        }

        public Criteria andSetupDateLessThan(Date value) {
            addCriterion("setup_date <", value, "setupDate");
            return (Criteria) this;
        }

        public Criteria andSetupDateLessThanOrEqualTo(Date value) {
            addCriterion("setup_date <=", value, "setupDate");
            return (Criteria) this;
        }

        public Criteria andSetupDateIn(List<Date> values) {
            addCriterion("setup_date in", values, "setupDate");
            return (Criteria) this;
        }

        public Criteria andSetupDateNotIn(List<Date> values) {
            addCriterion("setup_date not in", values, "setupDate");
            return (Criteria) this;
        }

        public Criteria andSetupDateBetween(Date value1, Date value2) {
            addCriterion("setup_date between", value1, value2, "setupDate");
            return (Criteria) this;
        }

        public Criteria andSetupDateNotBetween(Date value1, Date value2) {
            addCriterion("setup_date not between", value1, value2, "setupDate");
            return (Criteria) this;
        }

        public Criteria andTermDateIsNull() {
            addCriterion("term_date is null");
            return (Criteria) this;
        }

        public Criteria andTermDateIsNotNull() {
            addCriterion("term_date is not null");
            return (Criteria) this;
        }

        public Criteria andTermDateEqualTo(Date value) {
            addCriterion("term_date =", value, "termDate");
            return (Criteria) this;
        }

        public Criteria andTermDateNotEqualTo(Date value) {
            addCriterion("term_date <>", value, "termDate");
            return (Criteria) this;
        }

        public Criteria andTermDateGreaterThan(Date value) {
            addCriterion("term_date >", value, "termDate");
            return (Criteria) this;
        }

        public Criteria andTermDateGreaterThanOrEqualTo(Date value) {
            addCriterion("term_date >=", value, "termDate");
            return (Criteria) this;
        }

        public Criteria andTermDateLessThan(Date value) {
            addCriterion("term_date <", value, "termDate");
            return (Criteria) this;
        }

        public Criteria andTermDateLessThanOrEqualTo(Date value) {
            addCriterion("term_date <=", value, "termDate");
            return (Criteria) this;
        }

        public Criteria andTermDateIn(List<Date> values) {
            addCriterion("term_date in", values, "termDate");
            return (Criteria) this;
        }

        public Criteria andTermDateNotIn(List<Date> values) {
            addCriterion("term_date not in", values, "termDate");
            return (Criteria) this;
        }

        public Criteria andTermDateBetween(Date value1, Date value2) {
            addCriterion("term_date between", value1, value2, "termDate");
            return (Criteria) this;
        }

        public Criteria andTermDateNotBetween(Date value1, Date value2) {
            addCriterion("term_date not between", value1, value2, "termDate");
            return (Criteria) this;
        }

        public Criteria andScopeIsNull() {
            addCriterion("scope is null");
            return (Criteria) this;
        }

        public Criteria andScopeIsNotNull() {
            addCriterion("scope is not null");
            return (Criteria) this;
        }

        public Criteria andScopeEqualTo(String value) {
            addCriterion("scope =", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotEqualTo(String value) {
            addCriterion("scope <>", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeGreaterThan(String value) {
            addCriterion("scope >", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeGreaterThanOrEqualTo(String value) {
            addCriterion("scope >=", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeLessThan(String value) {
            addCriterion("scope <", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeLessThanOrEqualTo(String value) {
            addCriterion("scope <=", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeLike(String value) {
            addCriterion("scope like", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotLike(String value) {
            addCriterion("scope not like", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeIn(List<String> values) {
            addCriterion("scope in", values, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotIn(List<String> values) {
            addCriterion("scope not in", values, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeBetween(String value1, String value2) {
            addCriterion("scope between", value1, value2, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotBetween(String value1, String value2) {
            addCriterion("scope not between", value1, value2, "scope");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionIsNull() {
            addCriterion("audit_opinion is null");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionIsNotNull() {
            addCriterion("audit_opinion is not null");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionEqualTo(String value) {
            addCriterion("audit_opinion =", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotEqualTo(String value) {
            addCriterion("audit_opinion <>", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionGreaterThan(String value) {
            addCriterion("audit_opinion >", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("audit_opinion >=", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionLessThan(String value) {
            addCriterion("audit_opinion <", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionLessThanOrEqualTo(String value) {
            addCriterion("audit_opinion <=", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionLike(String value) {
            addCriterion("audit_opinion like", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotLike(String value) {
            addCriterion("audit_opinion not like", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionIn(List<String> values) {
            addCriterion("audit_opinion in", values, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotIn(List<String> values) {
            addCriterion("audit_opinion not in", values, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionBetween(String value1, String value2) {
            addCriterion("audit_opinion between", value1, value2, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotBetween(String value1, String value2) {
            addCriterion("audit_opinion not between", value1, value2, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andReceivablesTypeIsNull() {
            addCriterion("receivables_type is null");
            return (Criteria) this;
        }

        public Criteria andReceivablesTypeIsNotNull() {
            addCriterion("receivables_type is not null");
            return (Criteria) this;
        }

        public Criteria andReceivablesTypeEqualTo(Byte value) {
            addCriterion("receivables_type =", value, "receivablesType");
            return (Criteria) this;
        }

        public Criteria andReceivablesTypeNotEqualTo(Byte value) {
            addCriterion("receivables_type <>", value, "receivablesType");
            return (Criteria) this;
        }

        public Criteria andReceivablesTypeGreaterThan(Byte value) {
            addCriterion("receivables_type >", value, "receivablesType");
            return (Criteria) this;
        }

        public Criteria andReceivablesTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("receivables_type >=", value, "receivablesType");
            return (Criteria) this;
        }

        public Criteria andReceivablesTypeLessThan(Byte value) {
            addCriterion("receivables_type <", value, "receivablesType");
            return (Criteria) this;
        }

        public Criteria andReceivablesTypeLessThanOrEqualTo(Byte value) {
            addCriterion("receivables_type <=", value, "receivablesType");
            return (Criteria) this;
        }

        public Criteria andReceivablesTypeIn(List<Byte> values) {
            addCriterion("receivables_type in", values, "receivablesType");
            return (Criteria) this;
        }

        public Criteria andReceivablesTypeNotIn(List<Byte> values) {
            addCriterion("receivables_type not in", values, "receivablesType");
            return (Criteria) this;
        }

        public Criteria andReceivablesTypeBetween(Byte value1, Byte value2) {
            addCriterion("receivables_type between", value1, value2, "receivablesType");
            return (Criteria) this;
        }

        public Criteria andReceivablesTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("receivables_type not between", value1, value2, "receivablesType");
            return (Criteria) this;
        }

        public Criteria andReceivablesNameIsNull() {
            addCriterion("receivables_name is null");
            return (Criteria) this;
        }

        public Criteria andReceivablesNameIsNotNull() {
            addCriterion("receivables_name is not null");
            return (Criteria) this;
        }

        public Criteria andReceivablesNameEqualTo(String value) {
            addCriterion("receivables_name =", value, "receivablesName");
            return (Criteria) this;
        }

        public Criteria andReceivablesNameNotEqualTo(String value) {
            addCriterion("receivables_name <>", value, "receivablesName");
            return (Criteria) this;
        }

        public Criteria andReceivablesNameGreaterThan(String value) {
            addCriterion("receivables_name >", value, "receivablesName");
            return (Criteria) this;
        }

        public Criteria andReceivablesNameGreaterThanOrEqualTo(String value) {
            addCriterion("receivables_name >=", value, "receivablesName");
            return (Criteria) this;
        }

        public Criteria andReceivablesNameLessThan(String value) {
            addCriterion("receivables_name <", value, "receivablesName");
            return (Criteria) this;
        }

        public Criteria andReceivablesNameLessThanOrEqualTo(String value) {
            addCriterion("receivables_name <=", value, "receivablesName");
            return (Criteria) this;
        }

        public Criteria andReceivablesNameLike(String value) {
            addCriterion("receivables_name like", value, "receivablesName");
            return (Criteria) this;
        }

        public Criteria andReceivablesNameNotLike(String value) {
            addCriterion("receivables_name not like", value, "receivablesName");
            return (Criteria) this;
        }

        public Criteria andReceivablesNameIn(List<String> values) {
            addCriterion("receivables_name in", values, "receivablesName");
            return (Criteria) this;
        }

        public Criteria andReceivablesNameNotIn(List<String> values) {
            addCriterion("receivables_name not in", values, "receivablesName");
            return (Criteria) this;
        }

        public Criteria andReceivablesNameBetween(String value1, String value2) {
            addCriterion("receivables_name between", value1, value2, "receivablesName");
            return (Criteria) this;
        }

        public Criteria andReceivablesNameNotBetween(String value1, String value2) {
            addCriterion("receivables_name not between", value1, value2, "receivablesName");
            return (Criteria) this;
        }

        public Criteria andReceivablesAccountIsNull() {
            addCriterion("receivables_account is null");
            return (Criteria) this;
        }

        public Criteria andReceivablesAccountIsNotNull() {
            addCriterion("receivables_account is not null");
            return (Criteria) this;
        }

        public Criteria andReceivablesAccountEqualTo(String value) {
            addCriterion("receivables_account =", value, "receivablesAccount");
            return (Criteria) this;
        }

        public Criteria andReceivablesAccountNotEqualTo(String value) {
            addCriterion("receivables_account <>", value, "receivablesAccount");
            return (Criteria) this;
        }

        public Criteria andReceivablesAccountGreaterThan(String value) {
            addCriterion("receivables_account >", value, "receivablesAccount");
            return (Criteria) this;
        }

        public Criteria andReceivablesAccountGreaterThanOrEqualTo(String value) {
            addCriterion("receivables_account >=", value, "receivablesAccount");
            return (Criteria) this;
        }

        public Criteria andReceivablesAccountLessThan(String value) {
            addCriterion("receivables_account <", value, "receivablesAccount");
            return (Criteria) this;
        }

        public Criteria andReceivablesAccountLessThanOrEqualTo(String value) {
            addCriterion("receivables_account <=", value, "receivablesAccount");
            return (Criteria) this;
        }

        public Criteria andReceivablesAccountLike(String value) {
            addCriterion("receivables_account like", value, "receivablesAccount");
            return (Criteria) this;
        }

        public Criteria andReceivablesAccountNotLike(String value) {
            addCriterion("receivables_account not like", value, "receivablesAccount");
            return (Criteria) this;
        }

        public Criteria andReceivablesAccountIn(List<String> values) {
            addCriterion("receivables_account in", values, "receivablesAccount");
            return (Criteria) this;
        }

        public Criteria andReceivablesAccountNotIn(List<String> values) {
            addCriterion("receivables_account not in", values, "receivablesAccount");
            return (Criteria) this;
        }

        public Criteria andReceivablesAccountBetween(String value1, String value2) {
            addCriterion("receivables_account between", value1, value2, "receivablesAccount");
            return (Criteria) this;
        }

        public Criteria andReceivablesAccountNotBetween(String value1, String value2) {
            addCriterion("receivables_account not between", value1, value2, "receivablesAccount");
            return (Criteria) this;
        }

        public Criteria andReceivablesBankIsNull() {
            addCriterion("receivables_bank is null");
            return (Criteria) this;
        }

        public Criteria andReceivablesBankIsNotNull() {
            addCriterion("receivables_bank is not null");
            return (Criteria) this;
        }

        public Criteria andReceivablesBankEqualTo(String value) {
            addCriterion("receivables_bank =", value, "receivablesBank");
            return (Criteria) this;
        }

        public Criteria andReceivablesBankNotEqualTo(String value) {
            addCriterion("receivables_bank <>", value, "receivablesBank");
            return (Criteria) this;
        }

        public Criteria andReceivablesBankGreaterThan(String value) {
            addCriterion("receivables_bank >", value, "receivablesBank");
            return (Criteria) this;
        }

        public Criteria andReceivablesBankGreaterThanOrEqualTo(String value) {
            addCriterion("receivables_bank >=", value, "receivablesBank");
            return (Criteria) this;
        }

        public Criteria andReceivablesBankLessThan(String value) {
            addCriterion("receivables_bank <", value, "receivablesBank");
            return (Criteria) this;
        }

        public Criteria andReceivablesBankLessThanOrEqualTo(String value) {
            addCriterion("receivables_bank <=", value, "receivablesBank");
            return (Criteria) this;
        }

        public Criteria andReceivablesBankLike(String value) {
            addCriterion("receivables_bank like", value, "receivablesBank");
            return (Criteria) this;
        }

        public Criteria andReceivablesBankNotLike(String value) {
            addCriterion("receivables_bank not like", value, "receivablesBank");
            return (Criteria) this;
        }

        public Criteria andReceivablesBankIn(List<String> values) {
            addCriterion("receivables_bank in", values, "receivablesBank");
            return (Criteria) this;
        }

        public Criteria andReceivablesBankNotIn(List<String> values) {
            addCriterion("receivables_bank not in", values, "receivablesBank");
            return (Criteria) this;
        }

        public Criteria andReceivablesBankBetween(String value1, String value2) {
            addCriterion("receivables_bank between", value1, value2, "receivablesBank");
            return (Criteria) this;
        }

        public Criteria andReceivablesBankNotBetween(String value1, String value2) {
            addCriterion("receivables_bank not between", value1, value2, "receivablesBank");
            return (Criteria) this;
        }

        public Criteria andReceivablesBankAddressIsNull() {
            addCriterion("receivables_bank_address is null");
            return (Criteria) this;
        }

        public Criteria andReceivablesBankAddressIsNotNull() {
            addCriterion("receivables_bank_address is not null");
            return (Criteria) this;
        }

        public Criteria andReceivablesBankAddressEqualTo(String value) {
            addCriterion("receivables_bank_address =", value, "receivablesBankAddress");
            return (Criteria) this;
        }

        public Criteria andReceivablesBankAddressNotEqualTo(String value) {
            addCriterion("receivables_bank_address <>", value, "receivablesBankAddress");
            return (Criteria) this;
        }

        public Criteria andReceivablesBankAddressGreaterThan(String value) {
            addCriterion("receivables_bank_address >", value, "receivablesBankAddress");
            return (Criteria) this;
        }

        public Criteria andReceivablesBankAddressGreaterThanOrEqualTo(String value) {
            addCriterion("receivables_bank_address >=", value, "receivablesBankAddress");
            return (Criteria) this;
        }

        public Criteria andReceivablesBankAddressLessThan(String value) {
            addCriterion("receivables_bank_address <", value, "receivablesBankAddress");
            return (Criteria) this;
        }

        public Criteria andReceivablesBankAddressLessThanOrEqualTo(String value) {
            addCriterion("receivables_bank_address <=", value, "receivablesBankAddress");
            return (Criteria) this;
        }

        public Criteria andReceivablesBankAddressLike(String value) {
            addCriterion("receivables_bank_address like", value, "receivablesBankAddress");
            return (Criteria) this;
        }

        public Criteria andReceivablesBankAddressNotLike(String value) {
            addCriterion("receivables_bank_address not like", value, "receivablesBankAddress");
            return (Criteria) this;
        }

        public Criteria andReceivablesBankAddressIn(List<String> values) {
            addCriterion("receivables_bank_address in", values, "receivablesBankAddress");
            return (Criteria) this;
        }

        public Criteria andReceivablesBankAddressNotIn(List<String> values) {
            addCriterion("receivables_bank_address not in", values, "receivablesBankAddress");
            return (Criteria) this;
        }

        public Criteria andReceivablesBankAddressBetween(String value1, String value2) {
            addCriterion("receivables_bank_address between", value1, value2, "receivablesBankAddress");
            return (Criteria) this;
        }

        public Criteria andReceivablesBankAddressNotBetween(String value1, String value2) {
            addCriterion("receivables_bank_address not between", value1, value2, "receivablesBankAddress");
            return (Criteria) this;
        }

        public Criteria andLevelIdIsNull() {
            addCriterion("level_id is null");
            return (Criteria) this;
        }

        public Criteria andLevelIdIsNotNull() {
            addCriterion("level_id is not null");
            return (Criteria) this;
        }

        public Criteria andLevelIdEqualTo(Integer value) {
            addCriterion("level_id =", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdNotEqualTo(Integer value) {
            addCriterion("level_id <>", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdGreaterThan(Integer value) {
            addCriterion("level_id >", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("level_id >=", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdLessThan(Integer value) {
            addCriterion("level_id <", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdLessThanOrEqualTo(Integer value) {
            addCriterion("level_id <=", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdIn(List<Integer> values) {
            addCriterion("level_id in", values, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdNotIn(List<Integer> values) {
            addCriterion("level_id not in", values, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdBetween(Integer value1, Integer value2) {
            addCriterion("level_id between", value1, value2, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("level_id not between", value1, value2, "levelId");
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

        public Criteria andLegalPersonIsNull() {
            addCriterion("legal_person is null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIsNotNull() {
            addCriterion("legal_person is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonEqualTo(String value) {
            addCriterion("legal_person =", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotEqualTo(String value) {
            addCriterion("legal_person <>", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonGreaterThan(String value) {
            addCriterion("legal_person >", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonGreaterThanOrEqualTo(String value) {
            addCriterion("legal_person >=", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLessThan(String value) {
            addCriterion("legal_person <", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLessThanOrEqualTo(String value) {
            addCriterion("legal_person <=", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLike(String value) {
            addCriterion("legal_person like", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotLike(String value) {
            addCriterion("legal_person not like", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIn(List<String> values) {
            addCriterion("legal_person in", values, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotIn(List<String> values) {
            addCriterion("legal_person not in", values, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonBetween(String value1, String value2) {
            addCriterion("legal_person between", value1, value2, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotBetween(String value1, String value2) {
            addCriterion("legal_person not between", value1, value2, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andEmployUserIdIsNull() {
            addCriterion("employ_user_id is null");
            return (Criteria) this;
        }

        public Criteria andEmployUserIdIsNotNull() {
            addCriterion("employ_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmployUserIdEqualTo(Integer value) {
            addCriterion("employ_user_id =", value, "employUserId");
            return (Criteria) this;
        }

        public Criteria andEmployUserIdNotEqualTo(Integer value) {
            addCriterion("employ_user_id <>", value, "employUserId");
            return (Criteria) this;
        }

        public Criteria andEmployUserIdGreaterThan(Integer value) {
            addCriterion("employ_user_id >", value, "employUserId");
            return (Criteria) this;
        }

        public Criteria andEmployUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("employ_user_id >=", value, "employUserId");
            return (Criteria) this;
        }

        public Criteria andEmployUserIdLessThan(Integer value) {
            addCriterion("employ_user_id <", value, "employUserId");
            return (Criteria) this;
        }

        public Criteria andEmployUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("employ_user_id <=", value, "employUserId");
            return (Criteria) this;
        }

        public Criteria andEmployUserIdIn(List<Integer> values) {
            addCriterion("employ_user_id in", values, "employUserId");
            return (Criteria) this;
        }

        public Criteria andEmployUserIdNotIn(List<Integer> values) {
            addCriterion("employ_user_id not in", values, "employUserId");
            return (Criteria) this;
        }

        public Criteria andEmployUserIdBetween(Integer value1, Integer value2) {
            addCriterion("employ_user_id between", value1, value2, "employUserId");
            return (Criteria) this;
        }

        public Criteria andEmployUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("employ_user_id not between", value1, value2, "employUserId");
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