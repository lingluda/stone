package cn.interheart.stone.dao.entity.extmapper.app.dto;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.util.StringUtils;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ProjectVisitDto implements Serializable {
    private Integer id;
    private Integer projectId;
    @JSONField(format = "yyyy-MM-dd HH:mm")
    private Date contactTime; //回访时间
    private Byte contactType; //联系方式，0上门回访，1电话回访，2邮件回访
    private String followUpDescription;//跟进描述
    private Byte customerIntention;//客户意向,0成交客户，1意向客户，2潜在客户，3流失客户
    private String nextContext;//潜在和意向客户下次待办内容
    @JSONField(format = "yyyy-MM-dd HH:mm")
    private Date estimatedTime;//潜在和意向客户预计执行时间

    @NumberFormat(style = NumberFormat.Style.CURRENCY)
    private BigDecimal earnestMoney;//成交客户诚意金
    private String payType;//成交客户支付方式
    private String payAccount;//成交客户支付账号
    @JSONField(format = "yyyy-MM-dd HH:mm")
    private Date payDate;//成交客户支付时间
    @JSONField(format = "yyyy-MM-dd HH:mm")
    private Date execDate;//成交客户执行时间
    private String causeOfLoss;//流失客户流失原因
    @JSONField(format = "yyyy-MM-dd HH:mm")
    private Date gmtCreate;

    private Integer lcUserId; //量尺人员ID
    private String lcName;//量尺人员名称
    private String lcPhone;//量尺人员电话

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

    public Integer getLcUserId() {
        return lcUserId;
    }

    public void setLcUserId(Integer lcUserId) {
        this.lcUserId = lcUserId;
    }

    public String getLcName() {
        return StringUtils.isEmpty(lcName) ? "" : lcName;
    }

    public void setLcName(String lcName) {
        this.lcName = lcName;
    }

    public String getLcPhone() {
        return StringUtils.isEmpty(lcPhone) ? "" : lcPhone;
    }

    public void setLcPhone(String lcPhone) {
        this.lcPhone = lcPhone;
    }
}
