package cn.interheart.stone.dao.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class CompanyUserRole implements Serializable {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 用户ID
     */
    private Integer companyUserId;

    /**
     * 角色ID
     */
    private Integer companyRoleId;

    private Date gmtCreate;

    private Date gmtModified = new Date();

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCompanyUserId() {
        return companyUserId;
    }

    public void setCompanyUserId(Integer companyUserId) {
        this.companyUserId = companyUserId;
    }

    public Integer getCompanyRoleId() {
        return companyRoleId;
    }

    public void setCompanyRoleId(Integer companyRoleId) {
        this.companyRoleId = companyRoleId;
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
        CompanyUserRole other = (CompanyUserRole) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCompanyUserId() == null ? other.getCompanyUserId() == null : this.getCompanyUserId().equals(other.getCompanyUserId()))
            && (this.getCompanyRoleId() == null ? other.getCompanyRoleId() == null : this.getCompanyRoleId().equals(other.getCompanyRoleId()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCompanyUserId() == null) ? 0 : getCompanyUserId().hashCode());
        result = prime * result + ((getCompanyRoleId() == null) ? 0 : getCompanyRoleId().hashCode());
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
        sb.append(", companyUserId=").append(companyUserId);
        sb.append(", companyRoleId=").append(companyRoleId);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}