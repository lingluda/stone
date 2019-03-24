package cn.interheart.stone.dao.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class EmployInfo implements Serializable {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 公司ID
     */
    private Byte companyId;

    /**
     * 姓名
     */
    private String name;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 身份证
     */
    private String idCard;

    /**
     * 员工部门id
     */
    private Integer employDepartId;

    /**
     * 职务
     */
    private String position;

    /**
     * 职称
     */
    private String level;

    /**
     * 性别，0男，1女
     */
    private Byte sex;

    /**
     * 名族
     */
    private String familyName;

    /**
     * 是否结婚，0未结婚，1已结婚
     */
    private Byte isMarry;

    /**
     * 学历
     */
    private String education;

    /**
     * 学校
     */
    private String school;

    /**
     * 毕业时间
     */
    private Date graduationDate;

    /**
     * 籍贯
     */
    private String origin;

    /**
     * 现住址
     */
    private String presentAddress;

    /**
     * 户口所在地
     */
    private String registeredResidence;

    /**
     * 入职时间
     */
    private Date hiredateDate;

    /**
     * 参加工作时间
     */
    private Date startWorkDate;

    /**
     * 合同号码
     */
    private String contractNumber;

    /**
     * 合同类型
     */
    private String contractType;

    /**
     * 合同开始时间
     */
    private Date contractStartDate;

    /**
     * 合同结算时间
     */
    private Date contractStopDate;

    private Date gmtCreate;

    private Date gmtModified = new Date();

    /**
     * 状态，0在职，1离职
     */
    private Byte status;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Byte companyId) {
        this.companyId = companyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Integer getEmployDepartId() {
        return employDepartId;
    }

    public void setEmployDepartId(Integer employDepartId) {
        this.employDepartId = employDepartId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public Byte getIsMarry() {
        return isMarry;
    }

    public void setIsMarry(Byte isMarry) {
        this.isMarry = isMarry;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Date getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(Date graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getPresentAddress() {
        return presentAddress;
    }

    public void setPresentAddress(String presentAddress) {
        this.presentAddress = presentAddress;
    }

    public String getRegisteredResidence() {
        return registeredResidence;
    }

    public void setRegisteredResidence(String registeredResidence) {
        this.registeredResidence = registeredResidence;
    }

    public Date getHiredateDate() {
        return hiredateDate;
    }

    public void setHiredateDate(Date hiredateDate) {
        this.hiredateDate = hiredateDate;
    }

    public Date getStartWorkDate() {
        return startWorkDate;
    }

    public void setStartWorkDate(Date startWorkDate) {
        this.startWorkDate = startWorkDate;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public Date getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(Date contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public Date getContractStopDate() {
        return contractStopDate;
    }

    public void setContractStopDate(Date contractStopDate) {
        this.contractStopDate = contractStopDate;
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
        EmployInfo other = (EmployInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getIdCard() == null ? other.getIdCard() == null : this.getIdCard().equals(other.getIdCard()))
            && (this.getEmployDepartId() == null ? other.getEmployDepartId() == null : this.getEmployDepartId().equals(other.getEmployDepartId()))
            && (this.getPosition() == null ? other.getPosition() == null : this.getPosition().equals(other.getPosition()))
            && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getFamilyName() == null ? other.getFamilyName() == null : this.getFamilyName().equals(other.getFamilyName()))
            && (this.getIsMarry() == null ? other.getIsMarry() == null : this.getIsMarry().equals(other.getIsMarry()))
            && (this.getEducation() == null ? other.getEducation() == null : this.getEducation().equals(other.getEducation()))
            && (this.getSchool() == null ? other.getSchool() == null : this.getSchool().equals(other.getSchool()))
            && (this.getGraduationDate() == null ? other.getGraduationDate() == null : this.getGraduationDate().equals(other.getGraduationDate()))
            && (this.getOrigin() == null ? other.getOrigin() == null : this.getOrigin().equals(other.getOrigin()))
            && (this.getPresentAddress() == null ? other.getPresentAddress() == null : this.getPresentAddress().equals(other.getPresentAddress()))
            && (this.getRegisteredResidence() == null ? other.getRegisteredResidence() == null : this.getRegisteredResidence().equals(other.getRegisteredResidence()))
            && (this.getHiredateDate() == null ? other.getHiredateDate() == null : this.getHiredateDate().equals(other.getHiredateDate()))
            && (this.getStartWorkDate() == null ? other.getStartWorkDate() == null : this.getStartWorkDate().equals(other.getStartWorkDate()))
            && (this.getContractNumber() == null ? other.getContractNumber() == null : this.getContractNumber().equals(other.getContractNumber()))
            && (this.getContractType() == null ? other.getContractType() == null : this.getContractType().equals(other.getContractType()))
            && (this.getContractStartDate() == null ? other.getContractStartDate() == null : this.getContractStartDate().equals(other.getContractStartDate()))
            && (this.getContractStopDate() == null ? other.getContractStopDate() == null : this.getContractStopDate().equals(other.getContractStopDate()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getIdCard() == null) ? 0 : getIdCard().hashCode());
        result = prime * result + ((getEmployDepartId() == null) ? 0 : getEmployDepartId().hashCode());
        result = prime * result + ((getPosition() == null) ? 0 : getPosition().hashCode());
        result = prime * result + ((getLevel() == null) ? 0 : getLevel().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getFamilyName() == null) ? 0 : getFamilyName().hashCode());
        result = prime * result + ((getIsMarry() == null) ? 0 : getIsMarry().hashCode());
        result = prime * result + ((getEducation() == null) ? 0 : getEducation().hashCode());
        result = prime * result + ((getSchool() == null) ? 0 : getSchool().hashCode());
        result = prime * result + ((getGraduationDate() == null) ? 0 : getGraduationDate().hashCode());
        result = prime * result + ((getOrigin() == null) ? 0 : getOrigin().hashCode());
        result = prime * result + ((getPresentAddress() == null) ? 0 : getPresentAddress().hashCode());
        result = prime * result + ((getRegisteredResidence() == null) ? 0 : getRegisteredResidence().hashCode());
        result = prime * result + ((getHiredateDate() == null) ? 0 : getHiredateDate().hashCode());
        result = prime * result + ((getStartWorkDate() == null) ? 0 : getStartWorkDate().hashCode());
        result = prime * result + ((getContractNumber() == null) ? 0 : getContractNumber().hashCode());
        result = prime * result + ((getContractType() == null) ? 0 : getContractType().hashCode());
        result = prime * result + ((getContractStartDate() == null) ? 0 : getContractStartDate().hashCode());
        result = prime * result + ((getContractStopDate() == null) ? 0 : getContractStopDate().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModified() == null) ? 0 : getGmtModified().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
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
        sb.append(", name=").append(name);
        sb.append(", phone=").append(phone);
        sb.append(", idCard=").append(idCard);
        sb.append(", employDepartId=").append(employDepartId);
        sb.append(", position=").append(position);
        sb.append(", level=").append(level);
        sb.append(", sex=").append(sex);
        sb.append(", familyName=").append(familyName);
        sb.append(", isMarry=").append(isMarry);
        sb.append(", education=").append(education);
        sb.append(", school=").append(school);
        sb.append(", graduationDate=").append(graduationDate);
        sb.append(", origin=").append(origin);
        sb.append(", presentAddress=").append(presentAddress);
        sb.append(", registeredResidence=").append(registeredResidence);
        sb.append(", hiredateDate=").append(hiredateDate);
        sb.append(", startWorkDate=").append(startWorkDate);
        sb.append(", contractNumber=").append(contractNumber);
        sb.append(", contractType=").append(contractType);
        sb.append(", contractStartDate=").append(contractStartDate);
        sb.append(", contractStopDate=").append(contractStopDate);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}