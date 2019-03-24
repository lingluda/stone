package cn.interheart.stone.dao.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class CompanyStore implements Serializable {
    private Integer id;

    /**
     * 公司ID
     */
    private Integer companyId;

    /**
     * 门店类型：0合作店，1加盟店，2管理店，3直营店
     */
    private Byte type;

    /**
     * 门店名称
     */
    private String name;

    /**
     * 门店地址
     */
    private String address;

    /**
     * 联系人
     */
    private String contactsName;

    /**
     * 联系电话
     */
    private String contactsPhone;

    /**
     * 成立日期
     */
    private Date establishDate;

    /**
     * 营业期限
     */
    private Date businessDate;

    /**
     * 登记机关
     */
    private String registrationAuthority;

    /**
     * 注册号
     */
    private String registrationNumber;

    /**
     * 经营范围
     */
    private String scopeOperation;

    /**
     * 状态；0草稿，1未审核，2已通过，3未通过
     */
    private Byte status;

    /**
     * 是否禁用，0为禁用，1已禁用
     */
    private Byte isDisable;

    /**
     * 审核意见
     */
    private String auditOpinion;

    private Date gmtCreate;

    private Date gmtModified = new Date();

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

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
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

    public String getContactsName() {
        return contactsName;
    }

    public void setContactsName(String contactsName) {
        this.contactsName = contactsName;
    }

    public String getContactsPhone() {
        return contactsPhone;
    }

    public void setContactsPhone(String contactsPhone) {
        this.contactsPhone = contactsPhone;
    }

    public Date getEstablishDate() {
        return establishDate;
    }

    public void setEstablishDate(Date establishDate) {
        this.establishDate = establishDate;
    }

    public Date getBusinessDate() {
        return businessDate;
    }

    public void setBusinessDate(Date businessDate) {
        this.businessDate = businessDate;
    }

    public String getRegistrationAuthority() {
        return registrationAuthority;
    }

    public void setRegistrationAuthority(String registrationAuthority) {
        this.registrationAuthority = registrationAuthority;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getScopeOperation() {
        return scopeOperation;
    }

    public void setScopeOperation(String scopeOperation) {
        this.scopeOperation = scopeOperation;
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

    public String getAuditOpinion() {
        return auditOpinion;
    }

    public void setAuditOpinion(String auditOpinion) {
        this.auditOpinion = auditOpinion;
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
        CompanyStore other = (CompanyStore) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getContactsName() == null ? other.getContactsName() == null : this.getContactsName().equals(other.getContactsName()))
            && (this.getContactsPhone() == null ? other.getContactsPhone() == null : this.getContactsPhone().equals(other.getContactsPhone()))
            && (this.getEstablishDate() == null ? other.getEstablishDate() == null : this.getEstablishDate().equals(other.getEstablishDate()))
            && (this.getBusinessDate() == null ? other.getBusinessDate() == null : this.getBusinessDate().equals(other.getBusinessDate()))
            && (this.getRegistrationAuthority() == null ? other.getRegistrationAuthority() == null : this.getRegistrationAuthority().equals(other.getRegistrationAuthority()))
            && (this.getRegistrationNumber() == null ? other.getRegistrationNumber() == null : this.getRegistrationNumber().equals(other.getRegistrationNumber()))
            && (this.getScopeOperation() == null ? other.getScopeOperation() == null : this.getScopeOperation().equals(other.getScopeOperation()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getIsDisable() == null ? other.getIsDisable() == null : this.getIsDisable().equals(other.getIsDisable()))
            && (this.getAuditOpinion() == null ? other.getAuditOpinion() == null : this.getAuditOpinion().equals(other.getAuditOpinion()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()))
            && (this.getReceivablesType() == null ? other.getReceivablesType() == null : this.getReceivablesType().equals(other.getReceivablesType()))
            && (this.getReceivablesName() == null ? other.getReceivablesName() == null : this.getReceivablesName().equals(other.getReceivablesName()))
            && (this.getReceivablesAccount() == null ? other.getReceivablesAccount() == null : this.getReceivablesAccount().equals(other.getReceivablesAccount()))
            && (this.getReceivablesBank() == null ? other.getReceivablesBank() == null : this.getReceivablesBank().equals(other.getReceivablesBank()))
            && (this.getReceivablesBankAddress() == null ? other.getReceivablesBankAddress() == null : this.getReceivablesBankAddress().equals(other.getReceivablesBankAddress()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getContactsName() == null) ? 0 : getContactsName().hashCode());
        result = prime * result + ((getContactsPhone() == null) ? 0 : getContactsPhone().hashCode());
        result = prime * result + ((getEstablishDate() == null) ? 0 : getEstablishDate().hashCode());
        result = prime * result + ((getBusinessDate() == null) ? 0 : getBusinessDate().hashCode());
        result = prime * result + ((getRegistrationAuthority() == null) ? 0 : getRegistrationAuthority().hashCode());
        result = prime * result + ((getRegistrationNumber() == null) ? 0 : getRegistrationNumber().hashCode());
        result = prime * result + ((getScopeOperation() == null) ? 0 : getScopeOperation().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getIsDisable() == null) ? 0 : getIsDisable().hashCode());
        result = prime * result + ((getAuditOpinion() == null) ? 0 : getAuditOpinion().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModified() == null) ? 0 : getGmtModified().hashCode());
        result = prime * result + ((getReceivablesType() == null) ? 0 : getReceivablesType().hashCode());
        result = prime * result + ((getReceivablesName() == null) ? 0 : getReceivablesName().hashCode());
        result = prime * result + ((getReceivablesAccount() == null) ? 0 : getReceivablesAccount().hashCode());
        result = prime * result + ((getReceivablesBank() == null) ? 0 : getReceivablesBank().hashCode());
        result = prime * result + ((getReceivablesBankAddress() == null) ? 0 : getReceivablesBankAddress().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", companyId=").append(companyId);
        sb.append(", type=").append(type);
        sb.append(", name=").append(name);
        sb.append(", address=").append(address);
        sb.append(", contactsName=").append(contactsName);
        sb.append(", contactsPhone=").append(contactsPhone);
        sb.append(", establishDate=").append(establishDate);
        sb.append(", businessDate=").append(businessDate);
        sb.append(", registrationAuthority=").append(registrationAuthority);
        sb.append(", registrationNumber=").append(registrationNumber);
        sb.append(", scopeOperation=").append(scopeOperation);
        sb.append(", status=").append(status);
        sb.append(", isDisable=").append(isDisable);
        sb.append(", auditOpinion=").append(auditOpinion);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", receivablesType=").append(receivablesType);
        sb.append(", receivablesName=").append(receivablesName);
        sb.append(", receivablesAccount=").append(receivablesAccount);
        sb.append(", receivablesBank=").append(receivablesBank);
        sb.append(", receivablesBankAddress=").append(receivablesBankAddress);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}