package cn.interheart.stone.dao.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Company implements Serializable {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 公司名称
     */
    private String name;

    /**
     * 公司地址
     */
    private String address;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 联系QQ
     */
    private String qq;

    /**
     * 联系微信
     */
    private String wx;

    /**
     * 注册号
     */
    private String registrationNumber;

    /**
     * 登记机关
     */
    private String registrationDepartment;

    /**
     * 成立日期
     */
    private Date setupDate;

    /**
     * 营业期限
     */
    private Date termDate;

    /**
     * 经营范围
     */
    private String scope;

    /**
     * 审核意见
     */
    private String auditOpinion;

    /**
     * 收款类型0公司，1私人
     */
    private Byte receivablesType;

    /**
     * 收款姓名
     */
    private String receivablesName;

    /**
     * 收款账号
     */
    private String receivablesAccount;

    /**
     * 收款银行
     */
    private String receivablesBank;

    /**
     * 收款银行地址
     */
    private String receivablesBankAddress;

    /**
     * 等级ID
     */
    private Integer levelId;

    /**
     * 状态；0草稿，1未审核，2已通过，3未通过
     */
    private Byte status;

    /**
     * 是否禁用，0未禁用，1已禁用
     */
    private Byte isDisable;

    private Date gmtCreate;

    private Date gmtModified;

    /**
     * 法人
     */
    private String legalPerson;

    /**
     * 推广人员ID
     */
    private Integer employUserId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWx() {
        return wx;
    }

    public void setWx(String wx) {
        this.wx = wx;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getRegistrationDepartment() {
        return registrationDepartment;
    }

    public void setRegistrationDepartment(String registrationDepartment) {
        this.registrationDepartment = registrationDepartment;
    }

    public Date getSetupDate() {
        return setupDate;
    }

    public void setSetupDate(Date setupDate) {
        this.setupDate = setupDate;
    }

    public Date getTermDate() {
        return termDate;
    }

    public void setTermDate(Date termDate) {
        this.termDate = termDate;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getAuditOpinion() {
        return auditOpinion;
    }

    public void setAuditOpinion(String auditOpinion) {
        this.auditOpinion = auditOpinion;
    }

    public Byte getReceivablesType() {
        return receivablesType;
    }

    public void setReceivablesType(Byte receivablesType) {
        this.receivablesType = receivablesType;
    }

    public String getReceivablesName() {
        return receivablesName;
    }

    public void setReceivablesName(String receivablesName) {
        this.receivablesName = receivablesName;
    }

    public String getReceivablesAccount() {
        return receivablesAccount;
    }

    public void setReceivablesAccount(String receivablesAccount) {
        this.receivablesAccount = receivablesAccount;
    }

    public String getReceivablesBank() {
        return receivablesBank;
    }

    public void setReceivablesBank(String receivablesBank) {
        this.receivablesBank = receivablesBank;
    }

    public String getReceivablesBankAddress() {
        return receivablesBankAddress;
    }

    public void setReceivablesBankAddress(String receivablesBankAddress) {
        this.receivablesBankAddress = receivablesBankAddress;
    }

    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getIsDisable() {
        return isDisable;
    }

    public void setIsDisable(Byte isDisable) {
        this.isDisable = isDisable;
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

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
    }

    public Integer getEmployUserId() {
        return employUserId;
    }

    public void setEmployUserId(Integer employUserId) {
        this.employUserId = employUserId;
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
        Company other = (Company) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getQq() == null ? other.getQq() == null : this.getQq().equals(other.getQq()))
            && (this.getWx() == null ? other.getWx() == null : this.getWx().equals(other.getWx()))
            && (this.getRegistrationNumber() == null ? other.getRegistrationNumber() == null : this.getRegistrationNumber().equals(other.getRegistrationNumber()))
            && (this.getRegistrationDepartment() == null ? other.getRegistrationDepartment() == null : this.getRegistrationDepartment().equals(other.getRegistrationDepartment()))
            && (this.getSetupDate() == null ? other.getSetupDate() == null : this.getSetupDate().equals(other.getSetupDate()))
            && (this.getTermDate() == null ? other.getTermDate() == null : this.getTermDate().equals(other.getTermDate()))
            && (this.getScope() == null ? other.getScope() == null : this.getScope().equals(other.getScope()))
            && (this.getAuditOpinion() == null ? other.getAuditOpinion() == null : this.getAuditOpinion().equals(other.getAuditOpinion()))
            && (this.getReceivablesType() == null ? other.getReceivablesType() == null : this.getReceivablesType().equals(other.getReceivablesType()))
            && (this.getReceivablesName() == null ? other.getReceivablesName() == null : this.getReceivablesName().equals(other.getReceivablesName()))
            && (this.getReceivablesAccount() == null ? other.getReceivablesAccount() == null : this.getReceivablesAccount().equals(other.getReceivablesAccount()))
            && (this.getReceivablesBank() == null ? other.getReceivablesBank() == null : this.getReceivablesBank().equals(other.getReceivablesBank()))
            && (this.getReceivablesBankAddress() == null ? other.getReceivablesBankAddress() == null : this.getReceivablesBankAddress().equals(other.getReceivablesBankAddress()))
            && (this.getLevelId() == null ? other.getLevelId() == null : this.getLevelId().equals(other.getLevelId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getIsDisable() == null ? other.getIsDisable() == null : this.getIsDisable().equals(other.getIsDisable()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()))
            && (this.getLegalPerson() == null ? other.getLegalPerson() == null : this.getLegalPerson().equals(other.getLegalPerson()))
            && (this.getEmployUserId() == null ? other.getEmployUserId() == null : this.getEmployUserId().equals(other.getEmployUserId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getQq() == null) ? 0 : getQq().hashCode());
        result = prime * result + ((getWx() == null) ? 0 : getWx().hashCode());
        result = prime * result + ((getRegistrationNumber() == null) ? 0 : getRegistrationNumber().hashCode());
        result = prime * result + ((getRegistrationDepartment() == null) ? 0 : getRegistrationDepartment().hashCode());
        result = prime * result + ((getSetupDate() == null) ? 0 : getSetupDate().hashCode());
        result = prime * result + ((getTermDate() == null) ? 0 : getTermDate().hashCode());
        result = prime * result + ((getScope() == null) ? 0 : getScope().hashCode());
        result = prime * result + ((getAuditOpinion() == null) ? 0 : getAuditOpinion().hashCode());
        result = prime * result + ((getReceivablesType() == null) ? 0 : getReceivablesType().hashCode());
        result = prime * result + ((getReceivablesName() == null) ? 0 : getReceivablesName().hashCode());
        result = prime * result + ((getReceivablesAccount() == null) ? 0 : getReceivablesAccount().hashCode());
        result = prime * result + ((getReceivablesBank() == null) ? 0 : getReceivablesBank().hashCode());
        result = prime * result + ((getReceivablesBankAddress() == null) ? 0 : getReceivablesBankAddress().hashCode());
        result = prime * result + ((getLevelId() == null) ? 0 : getLevelId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getIsDisable() == null) ? 0 : getIsDisable().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModified() == null) ? 0 : getGmtModified().hashCode());
        result = prime * result + ((getLegalPerson() == null) ? 0 : getLegalPerson().hashCode());
        result = prime * result + ((getEmployUserId() == null) ? 0 : getEmployUserId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", address=").append(address);
        sb.append(", phone=").append(phone);
        sb.append(", qq=").append(qq);
        sb.append(", wx=").append(wx);
        sb.append(", registrationNumber=").append(registrationNumber);
        sb.append(", registrationDepartment=").append(registrationDepartment);
        sb.append(", setupDate=").append(setupDate);
        sb.append(", termDate=").append(termDate);
        sb.append(", scope=").append(scope);
        sb.append(", auditOpinion=").append(auditOpinion);
        sb.append(", receivablesType=").append(receivablesType);
        sb.append(", receivablesName=").append(receivablesName);
        sb.append(", receivablesAccount=").append(receivablesAccount);
        sb.append(", receivablesBank=").append(receivablesBank);
        sb.append(", receivablesBankAddress=").append(receivablesBankAddress);
        sb.append(", levelId=").append(levelId);
        sb.append(", status=").append(status);
        sb.append(", isDisable=").append(isDisable);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", legalPerson=").append(legalPerson);
        sb.append(", employUserId=").append(employUserId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}