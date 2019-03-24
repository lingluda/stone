package cn.interheart.stone.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectVisitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ProjectVisitExample() {
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

        public Criteria andContactTimeIsNull() {
            addCriterion("contact_time is null");
            return (Criteria) this;
        }

        public Criteria andContactTimeIsNotNull() {
            addCriterion("contact_time is not null");
            return (Criteria) this;
        }

        public Criteria andContactTimeEqualTo(Date value) {
            addCriterion("contact_time =", value, "contactTime");
            return (Criteria) this;
        }

        public Criteria andContactTimeNotEqualTo(Date value) {
            addCriterion("contact_time <>", value, "contactTime");
            return (Criteria) this;
        }

        public Criteria andContactTimeGreaterThan(Date value) {
            addCriterion("contact_time >", value, "contactTime");
            return (Criteria) this;
        }

        public Criteria andContactTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("contact_time >=", value, "contactTime");
            return (Criteria) this;
        }

        public Criteria andContactTimeLessThan(Date value) {
            addCriterion("contact_time <", value, "contactTime");
            return (Criteria) this;
        }

        public Criteria andContactTimeLessThanOrEqualTo(Date value) {
            addCriterion("contact_time <=", value, "contactTime");
            return (Criteria) this;
        }

        public Criteria andContactTimeIn(List<Date> values) {
            addCriterion("contact_time in", values, "contactTime");
            return (Criteria) this;
        }

        public Criteria andContactTimeNotIn(List<Date> values) {
            addCriterion("contact_time not in", values, "contactTime");
            return (Criteria) this;
        }

        public Criteria andContactTimeBetween(Date value1, Date value2) {
            addCriterion("contact_time between", value1, value2, "contactTime");
            return (Criteria) this;
        }

        public Criteria andContactTimeNotBetween(Date value1, Date value2) {
            addCriterion("contact_time not between", value1, value2, "contactTime");
            return (Criteria) this;
        }

        public Criteria andContactTypeIsNull() {
            addCriterion("contact_type is null");
            return (Criteria) this;
        }

        public Criteria andContactTypeIsNotNull() {
            addCriterion("contact_type is not null");
            return (Criteria) this;
        }

        public Criteria andContactTypeEqualTo(Byte value) {
            addCriterion("contact_type =", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeNotEqualTo(Byte value) {
            addCriterion("contact_type <>", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeGreaterThan(Byte value) {
            addCriterion("contact_type >", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("contact_type >=", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeLessThan(Byte value) {
            addCriterion("contact_type <", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeLessThanOrEqualTo(Byte value) {
            addCriterion("contact_type <=", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeIn(List<Byte> values) {
            addCriterion("contact_type in", values, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeNotIn(List<Byte> values) {
            addCriterion("contact_type not in", values, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeBetween(Byte value1, Byte value2) {
            addCriterion("contact_type between", value1, value2, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("contact_type not between", value1, value2, "contactType");
            return (Criteria) this;
        }

        public Criteria andFollowUpDescriptionIsNull() {
            addCriterion("follow_up_description is null");
            return (Criteria) this;
        }

        public Criteria andFollowUpDescriptionIsNotNull() {
            addCriterion("follow_up_description is not null");
            return (Criteria) this;
        }

        public Criteria andFollowUpDescriptionEqualTo(String value) {
            addCriterion("follow_up_description =", value, "followUpDescription");
            return (Criteria) this;
        }

        public Criteria andFollowUpDescriptionNotEqualTo(String value) {
            addCriterion("follow_up_description <>", value, "followUpDescription");
            return (Criteria) this;
        }

        public Criteria andFollowUpDescriptionGreaterThan(String value) {
            addCriterion("follow_up_description >", value, "followUpDescription");
            return (Criteria) this;
        }

        public Criteria andFollowUpDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("follow_up_description >=", value, "followUpDescription");
            return (Criteria) this;
        }

        public Criteria andFollowUpDescriptionLessThan(String value) {
            addCriterion("follow_up_description <", value, "followUpDescription");
            return (Criteria) this;
        }

        public Criteria andFollowUpDescriptionLessThanOrEqualTo(String value) {
            addCriterion("follow_up_description <=", value, "followUpDescription");
            return (Criteria) this;
        }

        public Criteria andFollowUpDescriptionLike(String value) {
            addCriterion("follow_up_description like", value, "followUpDescription");
            return (Criteria) this;
        }

        public Criteria andFollowUpDescriptionNotLike(String value) {
            addCriterion("follow_up_description not like", value, "followUpDescription");
            return (Criteria) this;
        }

        public Criteria andFollowUpDescriptionIn(List<String> values) {
            addCriterion("follow_up_description in", values, "followUpDescription");
            return (Criteria) this;
        }

        public Criteria andFollowUpDescriptionNotIn(List<String> values) {
            addCriterion("follow_up_description not in", values, "followUpDescription");
            return (Criteria) this;
        }

        public Criteria andFollowUpDescriptionBetween(String value1, String value2) {
            addCriterion("follow_up_description between", value1, value2, "followUpDescription");
            return (Criteria) this;
        }

        public Criteria andFollowUpDescriptionNotBetween(String value1, String value2) {
            addCriterion("follow_up_description not between", value1, value2, "followUpDescription");
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

        public Criteria andNextContextIsNull() {
            addCriterion("next_context is null");
            return (Criteria) this;
        }

        public Criteria andNextContextIsNotNull() {
            addCriterion("next_context is not null");
            return (Criteria) this;
        }

        public Criteria andNextContextEqualTo(String value) {
            addCriterion("next_context =", value, "nextContext");
            return (Criteria) this;
        }

        public Criteria andNextContextNotEqualTo(String value) {
            addCriterion("next_context <>", value, "nextContext");
            return (Criteria) this;
        }

        public Criteria andNextContextGreaterThan(String value) {
            addCriterion("next_context >", value, "nextContext");
            return (Criteria) this;
        }

        public Criteria andNextContextGreaterThanOrEqualTo(String value) {
            addCriterion("next_context >=", value, "nextContext");
            return (Criteria) this;
        }

        public Criteria andNextContextLessThan(String value) {
            addCriterion("next_context <", value, "nextContext");
            return (Criteria) this;
        }

        public Criteria andNextContextLessThanOrEqualTo(String value) {
            addCriterion("next_context <=", value, "nextContext");
            return (Criteria) this;
        }

        public Criteria andNextContextLike(String value) {
            addCriterion("next_context like", value, "nextContext");
            return (Criteria) this;
        }

        public Criteria andNextContextNotLike(String value) {
            addCriterion("next_context not like", value, "nextContext");
            return (Criteria) this;
        }

        public Criteria andNextContextIn(List<String> values) {
            addCriterion("next_context in", values, "nextContext");
            return (Criteria) this;
        }

        public Criteria andNextContextNotIn(List<String> values) {
            addCriterion("next_context not in", values, "nextContext");
            return (Criteria) this;
        }

        public Criteria andNextContextBetween(String value1, String value2) {
            addCriterion("next_context between", value1, value2, "nextContext");
            return (Criteria) this;
        }

        public Criteria andNextContextNotBetween(String value1, String value2) {
            addCriterion("next_context not between", value1, value2, "nextContext");
            return (Criteria) this;
        }

        public Criteria andEstimatedTimeIsNull() {
            addCriterion("estimated_time is null");
            return (Criteria) this;
        }

        public Criteria andEstimatedTimeIsNotNull() {
            addCriterion("estimated_time is not null");
            return (Criteria) this;
        }

        public Criteria andEstimatedTimeEqualTo(Date value) {
            addCriterion("estimated_time =", value, "estimatedTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedTimeNotEqualTo(Date value) {
            addCriterion("estimated_time <>", value, "estimatedTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedTimeGreaterThan(Date value) {
            addCriterion("estimated_time >", value, "estimatedTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("estimated_time >=", value, "estimatedTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedTimeLessThan(Date value) {
            addCriterion("estimated_time <", value, "estimatedTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("estimated_time <=", value, "estimatedTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedTimeIn(List<Date> values) {
            addCriterion("estimated_time in", values, "estimatedTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedTimeNotIn(List<Date> values) {
            addCriterion("estimated_time not in", values, "estimatedTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedTimeBetween(Date value1, Date value2) {
            addCriterion("estimated_time between", value1, value2, "estimatedTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("estimated_time not between", value1, value2, "estimatedTime");
            return (Criteria) this;
        }

        public Criteria andEarnestMoneyIsNull() {
            addCriterion("earnest_money is null");
            return (Criteria) this;
        }

        public Criteria andEarnestMoneyIsNotNull() {
            addCriterion("earnest_money is not null");
            return (Criteria) this;
        }

        public Criteria andEarnestMoneyEqualTo(Long value) {
            addCriterion("earnest_money =", value, "earnestMoney");
            return (Criteria) this;
        }

        public Criteria andEarnestMoneyNotEqualTo(Long value) {
            addCriterion("earnest_money <>", value, "earnestMoney");
            return (Criteria) this;
        }

        public Criteria andEarnestMoneyGreaterThan(Long value) {
            addCriterion("earnest_money >", value, "earnestMoney");
            return (Criteria) this;
        }

        public Criteria andEarnestMoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("earnest_money >=", value, "earnestMoney");
            return (Criteria) this;
        }

        public Criteria andEarnestMoneyLessThan(Long value) {
            addCriterion("earnest_money <", value, "earnestMoney");
            return (Criteria) this;
        }

        public Criteria andEarnestMoneyLessThanOrEqualTo(Long value) {
            addCriterion("earnest_money <=", value, "earnestMoney");
            return (Criteria) this;
        }

        public Criteria andEarnestMoneyIn(List<Long> values) {
            addCriterion("earnest_money in", values, "earnestMoney");
            return (Criteria) this;
        }

        public Criteria andEarnestMoneyNotIn(List<Long> values) {
            addCriterion("earnest_money not in", values, "earnestMoney");
            return (Criteria) this;
        }

        public Criteria andEarnestMoneyBetween(Long value1, Long value2) {
            addCriterion("earnest_money between", value1, value2, "earnestMoney");
            return (Criteria) this;
        }

        public Criteria andEarnestMoneyNotBetween(Long value1, Long value2) {
            addCriterion("earnest_money not between", value1, value2, "earnestMoney");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("pay_type is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(String value) {
            addCriterion("pay_type =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(String value) {
            addCriterion("pay_type <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(String value) {
            addCriterion("pay_type >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pay_type >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(String value) {
            addCriterion("pay_type <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(String value) {
            addCriterion("pay_type <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLike(String value) {
            addCriterion("pay_type like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotLike(String value) {
            addCriterion("pay_type not like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<String> values) {
            addCriterion("pay_type in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<String> values) {
            addCriterion("pay_type not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(String value1, String value2) {
            addCriterion("pay_type between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(String value1, String value2) {
            addCriterion("pay_type not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayAccountIsNull() {
            addCriterion("pay_account is null");
            return (Criteria) this;
        }

        public Criteria andPayAccountIsNotNull() {
            addCriterion("pay_account is not null");
            return (Criteria) this;
        }

        public Criteria andPayAccountEqualTo(String value) {
            addCriterion("pay_account =", value, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountNotEqualTo(String value) {
            addCriterion("pay_account <>", value, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountGreaterThan(String value) {
            addCriterion("pay_account >", value, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountGreaterThanOrEqualTo(String value) {
            addCriterion("pay_account >=", value, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountLessThan(String value) {
            addCriterion("pay_account <", value, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountLessThanOrEqualTo(String value) {
            addCriterion("pay_account <=", value, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountLike(String value) {
            addCriterion("pay_account like", value, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountNotLike(String value) {
            addCriterion("pay_account not like", value, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountIn(List<String> values) {
            addCriterion("pay_account in", values, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountNotIn(List<String> values) {
            addCriterion("pay_account not in", values, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountBetween(String value1, String value2) {
            addCriterion("pay_account between", value1, value2, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountNotBetween(String value1, String value2) {
            addCriterion("pay_account not between", value1, value2, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayDateIsNull() {
            addCriterion("pay_date is null");
            return (Criteria) this;
        }

        public Criteria andPayDateIsNotNull() {
            addCriterion("pay_date is not null");
            return (Criteria) this;
        }

        public Criteria andPayDateEqualTo(Date value) {
            addCriterion("pay_date =", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotEqualTo(Date value) {
            addCriterion("pay_date <>", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateGreaterThan(Date value) {
            addCriterion("pay_date >", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_date >=", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateLessThan(Date value) {
            addCriterion("pay_date <", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateLessThanOrEqualTo(Date value) {
            addCriterion("pay_date <=", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateIn(List<Date> values) {
            addCriterion("pay_date in", values, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotIn(List<Date> values) {
            addCriterion("pay_date not in", values, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateBetween(Date value1, Date value2) {
            addCriterion("pay_date between", value1, value2, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotBetween(Date value1, Date value2) {
            addCriterion("pay_date not between", value1, value2, "payDate");
            return (Criteria) this;
        }

        public Criteria andExecDateIsNull() {
            addCriterion("exec_date is null");
            return (Criteria) this;
        }

        public Criteria andExecDateIsNotNull() {
            addCriterion("exec_date is not null");
            return (Criteria) this;
        }

        public Criteria andExecDateEqualTo(Date value) {
            addCriterion("exec_date =", value, "execDate");
            return (Criteria) this;
        }

        public Criteria andExecDateNotEqualTo(Date value) {
            addCriterion("exec_date <>", value, "execDate");
            return (Criteria) this;
        }

        public Criteria andExecDateGreaterThan(Date value) {
            addCriterion("exec_date >", value, "execDate");
            return (Criteria) this;
        }

        public Criteria andExecDateGreaterThanOrEqualTo(Date value) {
            addCriterion("exec_date >=", value, "execDate");
            return (Criteria) this;
        }

        public Criteria andExecDateLessThan(Date value) {
            addCriterion("exec_date <", value, "execDate");
            return (Criteria) this;
        }

        public Criteria andExecDateLessThanOrEqualTo(Date value) {
            addCriterion("exec_date <=", value, "execDate");
            return (Criteria) this;
        }

        public Criteria andExecDateIn(List<Date> values) {
            addCriterion("exec_date in", values, "execDate");
            return (Criteria) this;
        }

        public Criteria andExecDateNotIn(List<Date> values) {
            addCriterion("exec_date not in", values, "execDate");
            return (Criteria) this;
        }

        public Criteria andExecDateBetween(Date value1, Date value2) {
            addCriterion("exec_date between", value1, value2, "execDate");
            return (Criteria) this;
        }

        public Criteria andExecDateNotBetween(Date value1, Date value2) {
            addCriterion("exec_date not between", value1, value2, "execDate");
            return (Criteria) this;
        }

        public Criteria andCauseOfLossIsNull() {
            addCriterion("cause_of_loss is null");
            return (Criteria) this;
        }

        public Criteria andCauseOfLossIsNotNull() {
            addCriterion("cause_of_loss is not null");
            return (Criteria) this;
        }

        public Criteria andCauseOfLossEqualTo(String value) {
            addCriterion("cause_of_loss =", value, "causeOfLoss");
            return (Criteria) this;
        }

        public Criteria andCauseOfLossNotEqualTo(String value) {
            addCriterion("cause_of_loss <>", value, "causeOfLoss");
            return (Criteria) this;
        }

        public Criteria andCauseOfLossGreaterThan(String value) {
            addCriterion("cause_of_loss >", value, "causeOfLoss");
            return (Criteria) this;
        }

        public Criteria andCauseOfLossGreaterThanOrEqualTo(String value) {
            addCriterion("cause_of_loss >=", value, "causeOfLoss");
            return (Criteria) this;
        }

        public Criteria andCauseOfLossLessThan(String value) {
            addCriterion("cause_of_loss <", value, "causeOfLoss");
            return (Criteria) this;
        }

        public Criteria andCauseOfLossLessThanOrEqualTo(String value) {
            addCriterion("cause_of_loss <=", value, "causeOfLoss");
            return (Criteria) this;
        }

        public Criteria andCauseOfLossLike(String value) {
            addCriterion("cause_of_loss like", value, "causeOfLoss");
            return (Criteria) this;
        }

        public Criteria andCauseOfLossNotLike(String value) {
            addCriterion("cause_of_loss not like", value, "causeOfLoss");
            return (Criteria) this;
        }

        public Criteria andCauseOfLossIn(List<String> values) {
            addCriterion("cause_of_loss in", values, "causeOfLoss");
            return (Criteria) this;
        }

        public Criteria andCauseOfLossNotIn(List<String> values) {
            addCriterion("cause_of_loss not in", values, "causeOfLoss");
            return (Criteria) this;
        }

        public Criteria andCauseOfLossBetween(String value1, String value2) {
            addCriterion("cause_of_loss between", value1, value2, "causeOfLoss");
            return (Criteria) this;
        }

        public Criteria andCauseOfLossNotBetween(String value1, String value2) {
            addCriterion("cause_of_loss not between", value1, value2, "causeOfLoss");
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