package cn.interheart.stone.dao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class MeasurePlate implements Serializable {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 项目ID
     */
    private Integer projectId;

    /**
     * 关联量尺主键ID
     */
    private Integer parentId;

    /**
     * 量尺类型 :
("门槛石", 0),
("门套", 1),
("窗台", 2),
("窗套", 3),
("地台", 4),
("地脚", 5),
("踏步", 6),
("拼花", 7),
("灶台", 8),
("波导线", 9),
("罗马柱", 10);
     */
    private Byte type;

    /**
     * 区域
     */
    private String area;

    /**
     * 材料名称
     */
    private String productName;

    /**
     * 材料类型
     */
    private String productType;

    /**
     * 长度
     */
    private String length;

    /**
     * 宽度
     */
    private String windth;

    /**
     * 高度(厚度)
     */
    private String height;

    /**
     * 数量
     */
    private String number;

    /**
     * 加工方式
     */
    private String processMode;

    /**
     * 加工说明
     */
    private String processInstruction;

    /**
     * 备注
     */
    private String remarks;

    private Date gmtCreate;

    private Date gmtModified;

    /**
     * 图片ID 1,2,3,4 逗号分隔
     */
    private String imageId;

    /**
     * 材料费
     */
    private BigDecimal materialCost;

    /**
     * 加工费
     */
    private BigDecimal processCost;

    /**
     * 安装费
     */
    private BigDecimal installationCost;

    /**
     * 辅料费
     */
    private BigDecimal excipientCost;

    /**
     * 护理费
     */
    private BigDecimal nursingCost;

    /**
     * 总费用
     */
    private BigDecimal sumCost;

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

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getWindth() {
        return windth;
    }

    public void setWindth(String windth) {
        this.windth = windth;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getProcessMode() {
        return processMode;
    }

    public void setProcessMode(String processMode) {
        this.processMode = processMode;
    }

    public String getProcessInstruction() {
        return processInstruction;
    }

    public void setProcessInstruction(String processInstruction) {
        this.processInstruction = processInstruction;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public BigDecimal getMaterialCost() {
        return materialCost;
    }

    public void setMaterialCost(BigDecimal materialCost) {
        this.materialCost = materialCost;
    }

    public BigDecimal getProcessCost() {
        return processCost;
    }

    public void setProcessCost(BigDecimal processCost) {
        this.processCost = processCost;
    }

    public BigDecimal getInstallationCost() {
        return installationCost;
    }

    public void setInstallationCost(BigDecimal installationCost) {
        this.installationCost = installationCost;
    }

    public BigDecimal getExcipientCost() {
        return excipientCost;
    }

    public void setExcipientCost(BigDecimal excipientCost) {
        this.excipientCost = excipientCost;
    }

    public BigDecimal getNursingCost() {
        return nursingCost;
    }

    public void setNursingCost(BigDecimal nursingCost) {
        this.nursingCost = nursingCost;
    }

    public BigDecimal getSumCost() {
        return sumCost;
    }

    public void setSumCost(BigDecimal sumCost) {
        this.sumCost = sumCost;
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
        MeasurePlate other = (MeasurePlate) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProjectId() == null ? other.getProjectId() == null : this.getProjectId().equals(other.getProjectId()))
            && (this.getParentId() == null ? other.getParentId() == null : this.getParentId().equals(other.getParentId()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getProductName() == null ? other.getProductName() == null : this.getProductName().equals(other.getProductName()))
            && (this.getProductType() == null ? other.getProductType() == null : this.getProductType().equals(other.getProductType()))
            && (this.getLength() == null ? other.getLength() == null : this.getLength().equals(other.getLength()))
            && (this.getWindth() == null ? other.getWindth() == null : this.getWindth().equals(other.getWindth()))
            && (this.getHeight() == null ? other.getHeight() == null : this.getHeight().equals(other.getHeight()))
            && (this.getNumber() == null ? other.getNumber() == null : this.getNumber().equals(other.getNumber()))
            && (this.getProcessMode() == null ? other.getProcessMode() == null : this.getProcessMode().equals(other.getProcessMode()))
            && (this.getProcessInstruction() == null ? other.getProcessInstruction() == null : this.getProcessInstruction().equals(other.getProcessInstruction()))
            && (this.getRemarks() == null ? other.getRemarks() == null : this.getRemarks().equals(other.getRemarks()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()))
            && (this.getImageId() == null ? other.getImageId() == null : this.getImageId().equals(other.getImageId()))
            && (this.getMaterialCost() == null ? other.getMaterialCost() == null : this.getMaterialCost().equals(other.getMaterialCost()))
            && (this.getProcessCost() == null ? other.getProcessCost() == null : this.getProcessCost().equals(other.getProcessCost()))
            && (this.getInstallationCost() == null ? other.getInstallationCost() == null : this.getInstallationCost().equals(other.getInstallationCost()))
            && (this.getExcipientCost() == null ? other.getExcipientCost() == null : this.getExcipientCost().equals(other.getExcipientCost()))
            && (this.getNursingCost() == null ? other.getNursingCost() == null : this.getNursingCost().equals(other.getNursingCost()))
            && (this.getSumCost() == null ? other.getSumCost() == null : this.getSumCost().equals(other.getSumCost()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getProductName() == null) ? 0 : getProductName().hashCode());
        result = prime * result + ((getProductType() == null) ? 0 : getProductType().hashCode());
        result = prime * result + ((getLength() == null) ? 0 : getLength().hashCode());
        result = prime * result + ((getWindth() == null) ? 0 : getWindth().hashCode());
        result = prime * result + ((getHeight() == null) ? 0 : getHeight().hashCode());
        result = prime * result + ((getNumber() == null) ? 0 : getNumber().hashCode());
        result = prime * result + ((getProcessMode() == null) ? 0 : getProcessMode().hashCode());
        result = prime * result + ((getProcessInstruction() == null) ? 0 : getProcessInstruction().hashCode());
        result = prime * result + ((getRemarks() == null) ? 0 : getRemarks().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModified() == null) ? 0 : getGmtModified().hashCode());
        result = prime * result + ((getImageId() == null) ? 0 : getImageId().hashCode());
        result = prime * result + ((getMaterialCost() == null) ? 0 : getMaterialCost().hashCode());
        result = prime * result + ((getProcessCost() == null) ? 0 : getProcessCost().hashCode());
        result = prime * result + ((getInstallationCost() == null) ? 0 : getInstallationCost().hashCode());
        result = prime * result + ((getExcipientCost() == null) ? 0 : getExcipientCost().hashCode());
        result = prime * result + ((getNursingCost() == null) ? 0 : getNursingCost().hashCode());
        result = prime * result + ((getSumCost() == null) ? 0 : getSumCost().hashCode());
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
        sb.append(", parentId=").append(parentId);
        sb.append(", type=").append(type);
        sb.append(", area=").append(area);
        sb.append(", productName=").append(productName);
        sb.append(", productType=").append(productType);
        sb.append(", length=").append(length);
        sb.append(", windth=").append(windth);
        sb.append(", height=").append(height);
        sb.append(", number=").append(number);
        sb.append(", processMode=").append(processMode);
        sb.append(", processInstruction=").append(processInstruction);
        sb.append(", remarks=").append(remarks);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", imageId=").append(imageId);
        sb.append(", materialCost=").append(materialCost);
        sb.append(", processCost=").append(processCost);
        sb.append(", installationCost=").append(installationCost);
        sb.append(", excipientCost=").append(excipientCost);
        sb.append(", nursingCost=").append(nursingCost);
        sb.append(", sumCost=").append(sumCost);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}