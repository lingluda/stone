package cn.interheart.stone.dao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class Project implements Serializable {
    private Integer id;

    /**
     * 单号
     */
    private String oddNumbers;

    /**
     * 公司ID
     */
    private Integer companyId;

    /**
     * 项目名称
     */
    private String projectName;

    /**
     * 客户名称
     */
    private String customerName;

    /**
     * 地址
     */
    private String address;

    /**
     * 电话
     */
    private String phone;

    /**
     * qq
     */
    private String qq;

    /**
     * 微信
     */
    private String wx;

    /**
     * 字典表户型ID
     */
    private Integer dicHouseTypeCode;

    /**
     * 字典表户型值
     */
    private String dicHouseTypeContent;

    /**
     * 面积
     */
    private BigDecimal acreage;

    /**
     * 装饰风格
     */
    private String decorativeStyle;

    /**
     * 预计开工时间
     */
    private Date openDate;

    /**
     * 是否有装修设计公司0否，1是
     */
    private Byte isDesignCompany;

    /**
     * 是否有设计方案，0否，1是
     */
    private Byte isDesignScheme;

    /**
     * 是否有电梯0否，1是
     */
    private Byte isElevator;

    /**
     * 材料意向金额
     */
    private BigDecimal materialIntentMoney;

    /**
     * 预算金额
     */
    private BigDecimal budgetMoney;

    /**
     * 使用部位
     */
    private String usePart;

    private Date gmtCreate;

    private Date gmtModified;

    /**
     * 状态, 0 流失,1拜访,2量尺,3报价,4合同,5生产&发货,6安装&验收,7收款申请,
     */
    private Byte status;

    /**
     * 客户意向,0成交客户，1意向客户，2潜在客户，3流失客户
     */
    private Byte customerIntention;

    /**
     * APP销售人员 ID
     */
    private Integer xsUserId;

    /**
     * 量尺人员 ID
     */
    private Integer lcUserId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOddNumbers() {
        return oddNumbers;
    }

    public void setOddNumbers(String oddNumbers) {
        this.oddNumbers = oddNumbers;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
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

    public Integer getDicHouseTypeCode() {
        return dicHouseTypeCode;
    }

    public void setDicHouseTypeCode(Integer dicHouseTypeCode) {
        this.dicHouseTypeCode = dicHouseTypeCode;
    }

    public String getDicHouseTypeContent() {
        return dicHouseTypeContent;
    }

    public void setDicHouseTypeContent(String dicHouseTypeContent) {
        this.dicHouseTypeContent = dicHouseTypeContent;
    }

    public BigDecimal getAcreage() {
        return acreage;
    }

    public void setAcreage(BigDecimal acreage) {
        this.acreage = acreage;
    }

    public String getDecorativeStyle() {
        return decorativeStyle;
    }

    public void setDecorativeStyle(String decorativeStyle) {
        this.decorativeStyle = decorativeStyle;
    }

    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    public Byte getIsDesignCompany() {
        return isDesignCompany;
    }

    public void setIsDesignCompany(Byte isDesignCompany) {
        this.isDesignCompany = isDesignCompany;
    }

    public Byte getIsDesignScheme() {
        return isDesignScheme;
    }

    public void setIsDesignScheme(Byte isDesignScheme) {
        this.isDesignScheme = isDesignScheme;
    }

    public Byte getIsElevator() {
        return isElevator;
    }

    public void setIsElevator(Byte isElevator) {
        this.isElevator = isElevator;
    }

    public BigDecimal getMaterialIntentMoney() {
        return materialIntentMoney;
    }

    public void setMaterialIntentMoney(BigDecimal materialIntentMoney) {
        this.materialIntentMoney = materialIntentMoney;
    }

    public BigDecimal getBudgetMoney() {
        return budgetMoney;
    }

    public void setBudgetMoney(BigDecimal budgetMoney) {
        this.budgetMoney = budgetMoney;
    }

    public String getUsePart() {
        return usePart;
    }

    public void setUsePart(String usePart) {
        this.usePart = usePart;
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

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getCustomerIntention() {
        return customerIntention;
    }

    public void setCustomerIntention(Byte customerIntention) {
        this.customerIntention = customerIntention;
    }

    public Integer getXsUserId() {
        return xsUserId;
    }

    public void setXsUserId(Integer xsUserId) {
        this.xsUserId = xsUserId;
    }

    public Integer getLcUserId() {
        return lcUserId;
    }

    public void setLcUserId(Integer lcUserId) {
        this.lcUserId = lcUserId;
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
        Project other = (Project) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOddNumbers() == null ? other.getOddNumbers() == null : this.getOddNumbers().equals(other.getOddNumbers()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getProjectName() == null ? other.getProjectName() == null : this.getProjectName().equals(other.getProjectName()))
            && (this.getCustomerName() == null ? other.getCustomerName() == null : this.getCustomerName().equals(other.getCustomerName()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getQq() == null ? other.getQq() == null : this.getQq().equals(other.getQq()))
            && (this.getWx() == null ? other.getWx() == null : this.getWx().equals(other.getWx()))
            && (this.getDicHouseTypeCode() == null ? other.getDicHouseTypeCode() == null : this.getDicHouseTypeCode().equals(other.getDicHouseTypeCode()))
            && (this.getDicHouseTypeContent() == null ? other.getDicHouseTypeContent() == null : this.getDicHouseTypeContent().equals(other.getDicHouseTypeContent()))
            && (this.getAcreage() == null ? other.getAcreage() == null : this.getAcreage().equals(other.getAcreage()))
            && (this.getDecorativeStyle() == null ? other.getDecorativeStyle() == null : this.getDecorativeStyle().equals(other.getDecorativeStyle()))
            && (this.getOpenDate() == null ? other.getOpenDate() == null : this.getOpenDate().equals(other.getOpenDate()))
            && (this.getIsDesignCompany() == null ? other.getIsDesignCompany() == null : this.getIsDesignCompany().equals(other.getIsDesignCompany()))
            && (this.getIsDesignScheme() == null ? other.getIsDesignScheme() == null : this.getIsDesignScheme().equals(other.getIsDesignScheme()))
            && (this.getIsElevator() == null ? other.getIsElevator() == null : this.getIsElevator().equals(other.getIsElevator()))
            && (this.getMaterialIntentMoney() == null ? other.getMaterialIntentMoney() == null : this.getMaterialIntentMoney().equals(other.getMaterialIntentMoney()))
            && (this.getBudgetMoney() == null ? other.getBudgetMoney() == null : this.getBudgetMoney().equals(other.getBudgetMoney()))
            && (this.getUsePart() == null ? other.getUsePart() == null : this.getUsePart().equals(other.getUsePart()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCustomerIntention() == null ? other.getCustomerIntention() == null : this.getCustomerIntention().equals(other.getCustomerIntention()))
            && (this.getXsUserId() == null ? other.getXsUserId() == null : this.getXsUserId().equals(other.getXsUserId()))
            && (this.getLcUserId() == null ? other.getLcUserId() == null : this.getLcUserId().equals(other.getLcUserId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOddNumbers() == null) ? 0 : getOddNumbers().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        result = prime * result + ((getCustomerName() == null) ? 0 : getCustomerName().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getQq() == null) ? 0 : getQq().hashCode());
        result = prime * result + ((getWx() == null) ? 0 : getWx().hashCode());
        result = prime * result + ((getDicHouseTypeCode() == null) ? 0 : getDicHouseTypeCode().hashCode());
        result = prime * result + ((getDicHouseTypeContent() == null) ? 0 : getDicHouseTypeContent().hashCode());
        result = prime * result + ((getAcreage() == null) ? 0 : getAcreage().hashCode());
        result = prime * result + ((getDecorativeStyle() == null) ? 0 : getDecorativeStyle().hashCode());
        result = prime * result + ((getOpenDate() == null) ? 0 : getOpenDate().hashCode());
        result = prime * result + ((getIsDesignCompany() == null) ? 0 : getIsDesignCompany().hashCode());
        result = prime * result + ((getIsDesignScheme() == null) ? 0 : getIsDesignScheme().hashCode());
        result = prime * result + ((getIsElevator() == null) ? 0 : getIsElevator().hashCode());
        result = prime * result + ((getMaterialIntentMoney() == null) ? 0 : getMaterialIntentMoney().hashCode());
        result = prime * result + ((getBudgetMoney() == null) ? 0 : getBudgetMoney().hashCode());
        result = prime * result + ((getUsePart() == null) ? 0 : getUsePart().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModified() == null) ? 0 : getGmtModified().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCustomerIntention() == null) ? 0 : getCustomerIntention().hashCode());
        result = prime * result + ((getXsUserId() == null) ? 0 : getXsUserId().hashCode());
        result = prime * result + ((getLcUserId() == null) ? 0 : getLcUserId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", oddNumbers=").append(oddNumbers);
        sb.append(", companyId=").append(companyId);
        sb.append(", projectName=").append(projectName);
        sb.append(", customerName=").append(customerName);
        sb.append(", address=").append(address);
        sb.append(", phone=").append(phone);
        sb.append(", qq=").append(qq);
        sb.append(", wx=").append(wx);
        sb.append(", dicHouseTypeCode=").append(dicHouseTypeCode);
        sb.append(", dicHouseTypeContent=").append(dicHouseTypeContent);
        sb.append(", acreage=").append(acreage);
        sb.append(", decorativeStyle=").append(decorativeStyle);
        sb.append(", openDate=").append(openDate);
        sb.append(", isDesignCompany=").append(isDesignCompany);
        sb.append(", isDesignScheme=").append(isDesignScheme);
        sb.append(", isElevator=").append(isElevator);
        sb.append(", materialIntentMoney=").append(materialIntentMoney);
        sb.append(", budgetMoney=").append(budgetMoney);
        sb.append(", usePart=").append(usePart);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", status=").append(status);
        sb.append(", customerIntention=").append(customerIntention);
        sb.append(", xsUserId=").append(xsUserId);
        sb.append(", lcUserId=").append(lcUserId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}