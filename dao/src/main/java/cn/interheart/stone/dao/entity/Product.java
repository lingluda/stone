package cn.interheart.stone.dao.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Product implements Serializable {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 关联公司ID，平台添加为0,
     */
    private Integer companyId;

    /**
     * 品名
     */
    private String name;

    /**
     * 产地
     */
    private String placeOfOrigin;

    /**
     * 物料类型字典ID
     */
    private Integer dicTypeCode;

    /**
     * 物料底色字典ID
     */
    private Integer dicBackgroundCode;

    /**
     * 物料纹路字典ID
     */
    private Integer dicLinesCode;

    /**
     * 物料纹路颜色字典ID
     */
    private Integer dicLinesColorCode;

    /**
     * 功能
     */
    private String function;

    /**
     * 应用场景
     */
    private String application;

    /**
     * 注意事项
     */
    private String announcement;

    /**
     * 来源，平台添加为平台，公司添加为公司名称
     */
    private String source;

    private Date gmtCreate;
    private Date gmtModified = new Date();

    /**
     * 是否禁用，0未禁用，1已禁用
     */
    private Byte isDisable;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlaceOfOrigin() {
        return placeOfOrigin;
    }

    public void setPlaceOfOrigin(String placeOfOrigin) {
        this.placeOfOrigin = placeOfOrigin;
    }

    public Integer getDicTypeCode() {
        return dicTypeCode;
    }

    public void setDicTypeCode(Integer dicTypeCode) {
        this.dicTypeCode = dicTypeCode;
    }

    public Integer getDicBackgroundCode() {
        return dicBackgroundCode;
    }

    public void setDicBackgroundCode(Integer dicBackgroundCode) {
        this.dicBackgroundCode = dicBackgroundCode;
    }

    public Integer getDicLinesCode() {
        return dicLinesCode;
    }

    public void setDicLinesCode(Integer dicLinesCode) {
        this.dicLinesCode = dicLinesCode;
    }

    public Integer getDicLinesColorCode() {
        return dicLinesColorCode;
    }

    public void setDicLinesColorCode(Integer dicLinesColorCode) {
        this.dicLinesColorCode = dicLinesColorCode;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(String announcement) {
        this.announcement = announcement;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
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

    public Byte getIsDisable() {
        return isDisable;
    }

    public void setIsDisable(Byte isDisable) {
        this.isDisable = isDisable;
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
        Product other = (Product) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPlaceOfOrigin() == null ? other.getPlaceOfOrigin() == null : this.getPlaceOfOrigin().equals(other.getPlaceOfOrigin()))
            && (this.getDicTypeCode() == null ? other.getDicTypeCode() == null : this.getDicTypeCode().equals(other.getDicTypeCode()))
            && (this.getDicBackgroundCode() == null ? other.getDicBackgroundCode() == null : this.getDicBackgroundCode().equals(other.getDicBackgroundCode()))
            && (this.getDicLinesCode() == null ? other.getDicLinesCode() == null : this.getDicLinesCode().equals(other.getDicLinesCode()))
            && (this.getDicLinesColorCode() == null ? other.getDicLinesColorCode() == null : this.getDicLinesColorCode().equals(other.getDicLinesColorCode()))
            && (this.getFunction() == null ? other.getFunction() == null : this.getFunction().equals(other.getFunction()))
            && (this.getApplication() == null ? other.getApplication() == null : this.getApplication().equals(other.getApplication()))
            && (this.getAnnouncement() == null ? other.getAnnouncement() == null : this.getAnnouncement().equals(other.getAnnouncement()))
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()))
            && (this.getIsDisable() == null ? other.getIsDisable() == null : this.getIsDisable().equals(other.getIsDisable()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPlaceOfOrigin() == null) ? 0 : getPlaceOfOrigin().hashCode());
        result = prime * result + ((getDicTypeCode() == null) ? 0 : getDicTypeCode().hashCode());
        result = prime * result + ((getDicBackgroundCode() == null) ? 0 : getDicBackgroundCode().hashCode());
        result = prime * result + ((getDicLinesCode() == null) ? 0 : getDicLinesCode().hashCode());
        result = prime * result + ((getDicLinesColorCode() == null) ? 0 : getDicLinesColorCode().hashCode());
        result = prime * result + ((getFunction() == null) ? 0 : getFunction().hashCode());
        result = prime * result + ((getApplication() == null) ? 0 : getApplication().hashCode());
        result = prime * result + ((getAnnouncement() == null) ? 0 : getAnnouncement().hashCode());
        result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModified() == null) ? 0 : getGmtModified().hashCode());
        result = prime * result + ((getIsDisable() == null) ? 0 : getIsDisable().hashCode());
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
        sb.append(", placeOfOrigin=").append(placeOfOrigin);
        sb.append(", dicTypeCode=").append(dicTypeCode);
        sb.append(", dicBackgroundCode=").append(dicBackgroundCode);
        sb.append(", dicLinesCode=").append(dicLinesCode);
        sb.append(", dicLinesColorCode=").append(dicLinesColorCode);
        sb.append(", function=").append(function);
        sb.append(", application=").append(application);
        sb.append(", announcement=").append(announcement);
        sb.append(", source=").append(source);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", isDisable=").append(isDisable);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}