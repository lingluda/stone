package cn.interheart.stone.dao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class MeasureDoorset implements Serializable {
    /**
     * 数据ID
     */
    private Integer id;

    /**
     * 项目ID
     */
    private Integer projectId;

    /**
     * 字典表区域ID
     */
    private Integer dicBaseAreaId;

    /**
     * 字典表区域值
     */
    private String dicBaseAreaContent;

    /**
     * 类型 0单面套, 1双面套
     */
    private Byte type;

    /**
     * 侧板的上下宽 0 一致, 1不一致
     */
    private Byte sideTdWidthSpecifications;

    /**
     * 侧板左上的宽度
     */
    private BigDecimal sideLeftTopWidth;

    /**
     * 侧板左下的宽度
     */
    private BigDecimal sideLeftDownWidth;

    /**
     * 侧板右上的宽度
     */
    private BigDecimal sideRightTopWidth;

    /**
     * 侧板右下的宽度
     */
    private BigDecimal sideRightDownWidth;

    /**
     * 侧板的高度
     */
    private BigDecimal sideHeight;

    /**
     * 侧板的数量
     */
    private Integer sideNumber;

    /**
     * 顶板长度
     */
    private BigDecimal roofLong;

    /**
     * 顶板数量
     */
    private Integer roofNumber;

    /**
     * 左耳
     */
    private BigDecimal leftEar;

    /**
     * 右耳
     */
    private BigDecimal rightEar;

    /**
     * 样式 0线条, 1平板
     */
    private Byte style;

    /**
     * 面板的上下宽 0 一致, 1不一致
     */
    private Byte panelTdWidthSpecifications;

    /**
     * 面板左上宽度
     */
    private BigDecimal panelLeftTopWidth;

    /**
     * 面板左下宽度
     */
    private BigDecimal panelLeftDownWidth;

    /**
     * 面板右上宽度
     */
    private BigDecimal panelRightTopWidth;

    /**
     * 面板右下宽度
     */
    private BigDecimal panelRightDownWidth;

    /**
     * 面板高度
     */
    private BigDecimal panelHeight;

    /**
     * 面板数量
     */
    private Integer panelNumber;

    /**
     * 面顶板的左右宽 0 一致, 1不一致
     */
    private Byte panelRoofWidthSpecifications;

    /**
     * 面顶板左宽
     */
    private BigDecimal panelRoofLeftWidth;

    /**
     * 面顶板右宽
     */
    private BigDecimal panelRoofRightWidth;

    /**
     * 面顶板数量
     */
    private Integer panelRoofNumber;

    /**
     * 门套数量
     */
    private Integer doorsetNumber;

    /**
     * 品名ID
     */
    private Integer productId;

    /**
     * 备注
     */
    private String remarks;

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

    public Integer getDicBaseAreaId() {
        return dicBaseAreaId;
    }

    public void setDicBaseAreaId(Integer dicBaseAreaId) {
        this.dicBaseAreaId = dicBaseAreaId;
    }

    public String getDicBaseAreaContent() {
        return dicBaseAreaContent;
    }

    public void setDicBaseAreaContent(String dicBaseAreaContent) {
        this.dicBaseAreaContent = dicBaseAreaContent;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Byte getSideTdWidthSpecifications() {
        return sideTdWidthSpecifications;
    }

    public void setSideTdWidthSpecifications(Byte sideTdWidthSpecifications) {
        this.sideTdWidthSpecifications = sideTdWidthSpecifications;
    }

    public BigDecimal getSideLeftTopWidth() {
        return sideLeftTopWidth;
    }

    public void setSideLeftTopWidth(BigDecimal sideLeftTopWidth) {
        this.sideLeftTopWidth = sideLeftTopWidth;
    }

    public BigDecimal getSideLeftDownWidth() {
        return sideLeftDownWidth;
    }

    public void setSideLeftDownWidth(BigDecimal sideLeftDownWidth) {
        this.sideLeftDownWidth = sideLeftDownWidth;
    }

    public BigDecimal getSideRightTopWidth() {
        return sideRightTopWidth;
    }

    public void setSideRightTopWidth(BigDecimal sideRightTopWidth) {
        this.sideRightTopWidth = sideRightTopWidth;
    }

    public BigDecimal getSideRightDownWidth() {
        return sideRightDownWidth;
    }

    public void setSideRightDownWidth(BigDecimal sideRightDownWidth) {
        this.sideRightDownWidth = sideRightDownWidth;
    }

    public BigDecimal getSideHeight() {
        return sideHeight;
    }

    public void setSideHeight(BigDecimal sideHeight) {
        this.sideHeight = sideHeight;
    }

    public Integer getSideNumber() {
        return sideNumber;
    }

    public void setSideNumber(Integer sideNumber) {
        this.sideNumber = sideNumber;
    }

    public BigDecimal getRoofLong() {
        return roofLong;
    }

    public void setRoofLong(BigDecimal roofLong) {
        this.roofLong = roofLong;
    }

    public Integer getRoofNumber() {
        return roofNumber;
    }

    public void setRoofNumber(Integer roofNumber) {
        this.roofNumber = roofNumber;
    }

    public BigDecimal getLeftEar() {
        return leftEar;
    }

    public void setLeftEar(BigDecimal leftEar) {
        this.leftEar = leftEar;
    }

    public BigDecimal getRightEar() {
        return rightEar;
    }

    public void setRightEar(BigDecimal rightEar) {
        this.rightEar = rightEar;
    }

    public Byte getStyle() {
        return style;
    }

    public void setStyle(Byte style) {
        this.style = style;
    }

    public Byte getPanelTdWidthSpecifications() {
        return panelTdWidthSpecifications;
    }

    public void setPanelTdWidthSpecifications(Byte panelTdWidthSpecifications) {
        this.panelTdWidthSpecifications = panelTdWidthSpecifications;
    }

    public BigDecimal getPanelLeftTopWidth() {
        return panelLeftTopWidth;
    }

    public void setPanelLeftTopWidth(BigDecimal panelLeftTopWidth) {
        this.panelLeftTopWidth = panelLeftTopWidth;
    }

    public BigDecimal getPanelLeftDownWidth() {
        return panelLeftDownWidth;
    }

    public void setPanelLeftDownWidth(BigDecimal panelLeftDownWidth) {
        this.panelLeftDownWidth = panelLeftDownWidth;
    }

    public BigDecimal getPanelRightTopWidth() {
        return panelRightTopWidth;
    }

    public void setPanelRightTopWidth(BigDecimal panelRightTopWidth) {
        this.panelRightTopWidth = panelRightTopWidth;
    }

    public BigDecimal getPanelRightDownWidth() {
        return panelRightDownWidth;
    }

    public void setPanelRightDownWidth(BigDecimal panelRightDownWidth) {
        this.panelRightDownWidth = panelRightDownWidth;
    }

    public BigDecimal getPanelHeight() {
        return panelHeight;
    }

    public void setPanelHeight(BigDecimal panelHeight) {
        this.panelHeight = panelHeight;
    }

    public Integer getPanelNumber() {
        return panelNumber;
    }

    public void setPanelNumber(Integer panelNumber) {
        this.panelNumber = panelNumber;
    }

    public Byte getPanelRoofWidthSpecifications() {
        return panelRoofWidthSpecifications;
    }

    public void setPanelRoofWidthSpecifications(Byte panelRoofWidthSpecifications) {
        this.panelRoofWidthSpecifications = panelRoofWidthSpecifications;
    }

    public BigDecimal getPanelRoofLeftWidth() {
        return panelRoofLeftWidth;
    }

    public void setPanelRoofLeftWidth(BigDecimal panelRoofLeftWidth) {
        this.panelRoofLeftWidth = panelRoofLeftWidth;
    }

    public BigDecimal getPanelRoofRightWidth() {
        return panelRoofRightWidth;
    }

    public void setPanelRoofRightWidth(BigDecimal panelRoofRightWidth) {
        this.panelRoofRightWidth = panelRoofRightWidth;
    }

    public Integer getPanelRoofNumber() {
        return panelRoofNumber;
    }

    public void setPanelRoofNumber(Integer panelRoofNumber) {
        this.panelRoofNumber = panelRoofNumber;
    }

    public Integer getDoorsetNumber() {
        return doorsetNumber;
    }

    public void setDoorsetNumber(Integer doorsetNumber) {
        this.doorsetNumber = doorsetNumber;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
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
        MeasureDoorset other = (MeasureDoorset) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProjectId() == null ? other.getProjectId() == null : this.getProjectId().equals(other.getProjectId()))
            && (this.getDicBaseAreaId() == null ? other.getDicBaseAreaId() == null : this.getDicBaseAreaId().equals(other.getDicBaseAreaId()))
            && (this.getDicBaseAreaContent() == null ? other.getDicBaseAreaContent() == null : this.getDicBaseAreaContent().equals(other.getDicBaseAreaContent()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getSideTdWidthSpecifications() == null ? other.getSideTdWidthSpecifications() == null : this.getSideTdWidthSpecifications().equals(other.getSideTdWidthSpecifications()))
            && (this.getSideLeftTopWidth() == null ? other.getSideLeftTopWidth() == null : this.getSideLeftTopWidth().equals(other.getSideLeftTopWidth()))
            && (this.getSideLeftDownWidth() == null ? other.getSideLeftDownWidth() == null : this.getSideLeftDownWidth().equals(other.getSideLeftDownWidth()))
            && (this.getSideRightTopWidth() == null ? other.getSideRightTopWidth() == null : this.getSideRightTopWidth().equals(other.getSideRightTopWidth()))
            && (this.getSideRightDownWidth() == null ? other.getSideRightDownWidth() == null : this.getSideRightDownWidth().equals(other.getSideRightDownWidth()))
            && (this.getSideHeight() == null ? other.getSideHeight() == null : this.getSideHeight().equals(other.getSideHeight()))
            && (this.getSideNumber() == null ? other.getSideNumber() == null : this.getSideNumber().equals(other.getSideNumber()))
            && (this.getRoofLong() == null ? other.getRoofLong() == null : this.getRoofLong().equals(other.getRoofLong()))
            && (this.getRoofNumber() == null ? other.getRoofNumber() == null : this.getRoofNumber().equals(other.getRoofNumber()))
            && (this.getLeftEar() == null ? other.getLeftEar() == null : this.getLeftEar().equals(other.getLeftEar()))
            && (this.getRightEar() == null ? other.getRightEar() == null : this.getRightEar().equals(other.getRightEar()))
            && (this.getStyle() == null ? other.getStyle() == null : this.getStyle().equals(other.getStyle()))
            && (this.getPanelTdWidthSpecifications() == null ? other.getPanelTdWidthSpecifications() == null : this.getPanelTdWidthSpecifications().equals(other.getPanelTdWidthSpecifications()))
            && (this.getPanelLeftTopWidth() == null ? other.getPanelLeftTopWidth() == null : this.getPanelLeftTopWidth().equals(other.getPanelLeftTopWidth()))
            && (this.getPanelLeftDownWidth() == null ? other.getPanelLeftDownWidth() == null : this.getPanelLeftDownWidth().equals(other.getPanelLeftDownWidth()))
            && (this.getPanelRightTopWidth() == null ? other.getPanelRightTopWidth() == null : this.getPanelRightTopWidth().equals(other.getPanelRightTopWidth()))
            && (this.getPanelRightDownWidth() == null ? other.getPanelRightDownWidth() == null : this.getPanelRightDownWidth().equals(other.getPanelRightDownWidth()))
            && (this.getPanelHeight() == null ? other.getPanelHeight() == null : this.getPanelHeight().equals(other.getPanelHeight()))
            && (this.getPanelNumber() == null ? other.getPanelNumber() == null : this.getPanelNumber().equals(other.getPanelNumber()))
            && (this.getPanelRoofWidthSpecifications() == null ? other.getPanelRoofWidthSpecifications() == null : this.getPanelRoofWidthSpecifications().equals(other.getPanelRoofWidthSpecifications()))
            && (this.getPanelRoofLeftWidth() == null ? other.getPanelRoofLeftWidth() == null : this.getPanelRoofLeftWidth().equals(other.getPanelRoofLeftWidth()))
            && (this.getPanelRoofRightWidth() == null ? other.getPanelRoofRightWidth() == null : this.getPanelRoofRightWidth().equals(other.getPanelRoofRightWidth()))
            && (this.getPanelRoofNumber() == null ? other.getPanelRoofNumber() == null : this.getPanelRoofNumber().equals(other.getPanelRoofNumber()))
            && (this.getDoorsetNumber() == null ? other.getDoorsetNumber() == null : this.getDoorsetNumber().equals(other.getDoorsetNumber()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getRemarks() == null ? other.getRemarks() == null : this.getRemarks().equals(other.getRemarks()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        result = prime * result + ((getDicBaseAreaId() == null) ? 0 : getDicBaseAreaId().hashCode());
        result = prime * result + ((getDicBaseAreaContent() == null) ? 0 : getDicBaseAreaContent().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getSideTdWidthSpecifications() == null) ? 0 : getSideTdWidthSpecifications().hashCode());
        result = prime * result + ((getSideLeftTopWidth() == null) ? 0 : getSideLeftTopWidth().hashCode());
        result = prime * result + ((getSideLeftDownWidth() == null) ? 0 : getSideLeftDownWidth().hashCode());
        result = prime * result + ((getSideRightTopWidth() == null) ? 0 : getSideRightTopWidth().hashCode());
        result = prime * result + ((getSideRightDownWidth() == null) ? 0 : getSideRightDownWidth().hashCode());
        result = prime * result + ((getSideHeight() == null) ? 0 : getSideHeight().hashCode());
        result = prime * result + ((getSideNumber() == null) ? 0 : getSideNumber().hashCode());
        result = prime * result + ((getRoofLong() == null) ? 0 : getRoofLong().hashCode());
        result = prime * result + ((getRoofNumber() == null) ? 0 : getRoofNumber().hashCode());
        result = prime * result + ((getLeftEar() == null) ? 0 : getLeftEar().hashCode());
        result = prime * result + ((getRightEar() == null) ? 0 : getRightEar().hashCode());
        result = prime * result + ((getStyle() == null) ? 0 : getStyle().hashCode());
        result = prime * result + ((getPanelTdWidthSpecifications() == null) ? 0 : getPanelTdWidthSpecifications().hashCode());
        result = prime * result + ((getPanelLeftTopWidth() == null) ? 0 : getPanelLeftTopWidth().hashCode());
        result = prime * result + ((getPanelLeftDownWidth() == null) ? 0 : getPanelLeftDownWidth().hashCode());
        result = prime * result + ((getPanelRightTopWidth() == null) ? 0 : getPanelRightTopWidth().hashCode());
        result = prime * result + ((getPanelRightDownWidth() == null) ? 0 : getPanelRightDownWidth().hashCode());
        result = prime * result + ((getPanelHeight() == null) ? 0 : getPanelHeight().hashCode());
        result = prime * result + ((getPanelNumber() == null) ? 0 : getPanelNumber().hashCode());
        result = prime * result + ((getPanelRoofWidthSpecifications() == null) ? 0 : getPanelRoofWidthSpecifications().hashCode());
        result = prime * result + ((getPanelRoofLeftWidth() == null) ? 0 : getPanelRoofLeftWidth().hashCode());
        result = prime * result + ((getPanelRoofRightWidth() == null) ? 0 : getPanelRoofRightWidth().hashCode());
        result = prime * result + ((getPanelRoofNumber() == null) ? 0 : getPanelRoofNumber().hashCode());
        result = prime * result + ((getDoorsetNumber() == null) ? 0 : getDoorsetNumber().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getRemarks() == null) ? 0 : getRemarks().hashCode());
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
        sb.append(", dicBaseAreaId=").append(dicBaseAreaId);
        sb.append(", dicBaseAreaContent=").append(dicBaseAreaContent);
        sb.append(", type=").append(type);
        sb.append(", sideTdWidthSpecifications=").append(sideTdWidthSpecifications);
        sb.append(", sideLeftTopWidth=").append(sideLeftTopWidth);
        sb.append(", sideLeftDownWidth=").append(sideLeftDownWidth);
        sb.append(", sideRightTopWidth=").append(sideRightTopWidth);
        sb.append(", sideRightDownWidth=").append(sideRightDownWidth);
        sb.append(", sideHeight=").append(sideHeight);
        sb.append(", sideNumber=").append(sideNumber);
        sb.append(", roofLong=").append(roofLong);
        sb.append(", roofNumber=").append(roofNumber);
        sb.append(", leftEar=").append(leftEar);
        sb.append(", rightEar=").append(rightEar);
        sb.append(", style=").append(style);
        sb.append(", panelTdWidthSpecifications=").append(panelTdWidthSpecifications);
        sb.append(", panelLeftTopWidth=").append(panelLeftTopWidth);
        sb.append(", panelLeftDownWidth=").append(panelLeftDownWidth);
        sb.append(", panelRightTopWidth=").append(panelRightTopWidth);
        sb.append(", panelRightDownWidth=").append(panelRightDownWidth);
        sb.append(", panelHeight=").append(panelHeight);
        sb.append(", panelNumber=").append(panelNumber);
        sb.append(", panelRoofWidthSpecifications=").append(panelRoofWidthSpecifications);
        sb.append(", panelRoofLeftWidth=").append(panelRoofLeftWidth);
        sb.append(", panelRoofRightWidth=").append(panelRoofRightWidth);
        sb.append(", panelRoofNumber=").append(panelRoofNumber);
        sb.append(", doorsetNumber=").append(doorsetNumber);
        sb.append(", productId=").append(productId);
        sb.append(", remarks=").append(remarks);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}