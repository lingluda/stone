package cn.interheart.stone.dao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class ProjectVisit implements Serializable {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 销售项目id
     */
    private Integer projectId;

    /**
     * 联系时间
     */
    private Date contactTime;

    /**
     * 联系方式，0上门回访，1电话回访，2邮件回访
     */
    private Byte contactType;

    /**
     * 跟进描述
     */
    private String followUpDescription;

    /**
     * 客户意向,0成交客户，1意向客户，2潜在客户，3流失客户
     */
    private Byte customerIntention;

    /**
     * 潜在和意向客户下次待办内容
     */
    private String nextContext;

    /**
     * 潜在和意向客户预计执行时间
     */
    private Date estimatedTime;

    /**
     * 成交客户诚意金
     */
    private BigDecimal earnestMoney;

    /**
     * 成交客户支付方式
     */
    private String payType;

    /**
     * 成交客户支付账号
     */
    private String payAccount;

    /**
     * 成交客户支付时间
     */
    private Date payDate;

    /**
     * 成交客户执行时间
     */
    private Date execDate;

    /**
     * 流失客户流失原因
     */
    private String causeOfLoss;

    private Date gmtCreate;

    private Date gmtModified;

    private static final long serialVersionUID = 1L;




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Date getContactTime() {
        return contactTime;
    }

    public void setContactTime(Date contactTime) {
        this.contactTime = contactTime;
    }

    public Byte getContactType() {
        return contactType;
    }

    public void setContactType(Byte contactType) {
        this.contactType = contactType;
    }

    public String getFollowUpDescription() {
        return followUpDescription;
    }

    public void setFollowUpDescription(String followUpDescription) {
        this.followUpDescription = followUpDescription;
    }

    public Byte getCustomerIntention() {
        return customerIntention;
    }

    public void setCustomerIntention(Byte customerIntention) {
        this.customerIntention = customerIntention;
    }

    public String getNextContext() {
        return nextContext;
    }

    public void setNextContext(String nextContext) {
        this.nextContext = nextContext;
    }

    public Date getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(Date estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public BigDecimal getEarnestMoney() {
        return earnestMoney;
    }

    public void setEarnestMoney(BigDecimal earnestMoney) {
        this.earnestMoney = earnestMoney;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getPayAccount() {
        return payAccount;
    }

    public void setPayAccount(String payAccount) {
        this.payAccount = payAccount;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public Date getExecDate() {
        return execDate;
    }

    public void setExecDate(Date execDate) {
        this.execDate = execDate;
    }

    public String getCauseOfLoss() {
        return causeOfLoss;
    }

    public void setCauseOfLoss(String causeOfLoss) {
        this.causeOfLoss = causeOfLoss;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ProjectVisit other = (ProjectVisit) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProjectId() == null ? other.getProjectId() == null : this.getProjectId().equals(other.getProjectId()))
            && (this.getContactTime() == null ? other.getContactTime() == null : this.getContactTime().equals(other.getContactTime()))
            && (this.getContactType() == null ? other.getContactType() == null : this.getContactType().equals(other.getContactType()))
            && (this.getFollowUpDescription() == null ? other.getFollowUpDescription() == null : this.getFollowUpDescription().equals(other.getFollowUpDescription()))
            && (this.getCustomerIntention() == null ? other.getCustomerIntention() == null : this.getCustomerIntention().equals(other.getCustomerIntention()))
            && (this.getNextContext() == null ? other.getNextContext() == null : this.getNextContext().equals(other.getNextContext()))
            && (this.getEstimatedTime() == null ? other.getEstimatedTime() == null : this.getEstimatedTime().equals(other.getEstimatedTime()))
            && (this.getEarnestMoney() == null ? other.getEarnestMoney() == null : this.getEarnestMoney().equals(other.getEarnestMoney()))
            && (this.getPayType() == null ? other.getPayType() == null : this.getPayType().equals(other.getPayType()))
            && (this.getPayAccount() == null ? other.getPayAccount() == null : this.getPayAccount().equals(other.getPayAccount()))
            && (this.getPayDate() == null ? other.getPayDate() == null : this.getPayDate().equals(other.getPayDate()))
            && (this.getExecDate() == null ? other.getExecDate() == null : this.getExecDate().equals(other.getExecDate()))
            && (this.getCauseOfLoss() == null ? other.getCauseOfLoss() == null : this.getCauseOfLoss().equals(other.getCauseOfLoss()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        result = prime * result + ((getContactTime() == null) ? 0 : getContactTime().hashCode());
        result = prime * result + ((getContactType() == null) ? 0 : getContactType().hashCode());
        result = prime * result + ((getFollowUpDescription() == null) ? 0 : getFollowUpDescription().hashCode());
        result = prime * result + ((getCustomerIntention() == null) ? 0 : getCustomerIntention().hashCode());
        result = prime * result + ((getNextContext() == null) ? 0 : getNextContext().hashCode());
        result = prime * result + ((getEstimatedTime() == null) ? 0 : getEstimatedTime().hashCode());
        result = prime * result + ((getEarnestMoney() == null) ? 0 : getEarnestMoney().hashCode());
        result = prime * result + ((getPayType() == null) ? 0 : getPayType().hashCode());
        result = prime * result + ((getPayAccount() == null) ? 0 : getPayAccount().hashCode());
        result = prime * result + ((getPayDate() == null) ? 0 : getPayDate().hashCode());
        result = prime * result + ((getExecDate() == null) ? 0 : getExecDate().hashCode());
        result = prime * result + ((getCauseOfLoss() == null) ? 0 : getCauseOfLoss().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModified() == null) ? 0 : getGmtModified().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", projectId=").append(projectId);
        sb.append(", contactTime=").append(contactTime);
        sb.append(", contactType=").append(contactType);
        sb.append(", followUpDescription=").append(followUpDescription);
        sb.append(", customerIntention=").append(customerIntention);
        sb.append(", nextContext=").append(nextContext);
        sb.append(", estimatedTime=").append(estimatedTime);
        sb.append(", earnestMoney=").append(earnestMoney);
        sb.append(", payType=").append(payType);
        sb.append(", payAccount=").append(payAccount);
        sb.append(", payDate=").append(payDate);
        sb.append(", execDate=").append(execDate);
        sb.append(", causeOfLoss=").append(causeOfLoss);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

}