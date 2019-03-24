package cn.interheart.stone.dao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class MeasureDoorsill implements Serializable {
    /**
     * 主键ID
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
     * 是否大小头, 0否,1是
     */
    private Byte isBigSmallHead;

    /**
     * 长度
     */
    private BigDecimal length;

    /**
     * 左宽
     */
    private BigDecimal leftWidth;

    /**
     * 右宽
     */
    private BigDecimal rightWidth;

    /**
     * 是否吊边 0不吊不磨, 1磨一长边, 2磨二长边, 3吊一, 4吊一磨一, 5吊二
     */
    private Byte hangWearSide;

    /**
     * 吊边宽度
     */
    private BigDecimal hangSideWidth;

    /**
     * 吊边数量
     */
    private Integer hangSideNumber;

    /**
     * 门槛石数量
     */
    private Integer doorsillNumber;

    /**
     * 品名ID
     */
    private Integer productId;

    /**
     * 备注
     */
    private String remarks;

    private Date gmtCreate;

    private Date gmtModified  = new Date();

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

    public Byte getIsBigSmallHead() {
        return isBigSmallHead;
    }

    public void setIsBigSmallHead(Byte isBigSmallHead) {
        this.isBigSmallHead = isBigSmallHead;
    }

    public BigDecimal getLength() {
        return length;
    }

    public void setLength(BigDecimal length) {
        this.length = length;
    }

    public BigDecimal getLeftWidth() {
        return leftWidth;
    }

    public void setLeftWidth(BigDecimal leftWidth) {
        this.leftWidth = leftWidth;
    }

    public BigDecimal getRightWidth() {
        return rightWidth;
    }

    public void setRightWidth(BigDecimal rightWidth) {
        this.rightWidth = rightWidth;
    }

    public Byte getHangWearSide() {
        return hangWearSide;
    }

    public void setHangWearSide(Byte hangWearSide) {
        this.hangWearSide = hangWearSide;
    }

    public BigDecimal getHangSideWidth() {
        return hangSideWidth;
    }

    public void setHangSideWidth(BigDecimal hangSideWidth) {
        this.hangSideWidth = hangSideWidth;
    }

    public Integer getHangSideNumber() {
        return hangSideNumber;
    }

    public void setHangSideNumber(Integer hangSideNumber) {
        this.hangSideNumber = hangSideNumber;
    }

    public Integer getDoorsillNumber() {
        return doorsillNumber;
    }

    public void setDoorsillNumber(Integer doorsillNumber) {
        this.doorsillNumber = doorsillNumber;
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
        MeasureDoorsill other = (MeasureDoorsill) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProjectId() == null ? other.getProjectId() == null : this.getProjectId().equals(other.getProjectId()))
            && (this.getDicBaseAreaId() == null ? other.getDicBaseAreaId() == null : this.getDicBaseAreaId().equals(other.getDicBaseAreaId()))
            && (this.getDicBaseAreaContent() == null ? other.getDicBaseAreaContent() == null : this.getDicBaseAreaContent().equals(other.getDicBaseAreaContent()))
            && (this.getIsBigSmallHead() == null ? other.getIsBigSmallHead() == null : this.getIsBigSmallHead().equals(other.getIsBigSmallHead()))
            && (this.getLength() == null ? other.getLength() == null : this.getLength().equals(other.getLength()))
            && (this.getLeftWidth() == null ? other.getLeftWidth() == null : this.getLeftWidth().equals(other.getLeftWidth()))
            && (this.getRightWidth() == null ? other.getRightWidth() == null : this.getRightWidth().equals(other.getRightWidth()))
            && (this.getHangWearSide() == null ? other.getHangWearSide() == null : this.getHangWearSide().equals(other.getHangWearSide()))
            && (this.getHangSideWidth() == null ? other.getHangSideWidth() == null : this.getHangSideWidth().equals(other.getHangSideWidth()))
            && (this.getHangSideNumber() == null ? other.getHangSideNumber() == null : this.getHangSideNumber().equals(other.getHangSideNumber()))
            && (this.getDoorsillNumber() == null ? other.getDoorsillNumber() == null : this.getDoorsillNumber().equals(other.getDoorsillNumber()))
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
        result = prime * result + ((getIsBigSmallHead() == null) ? 0 : getIsBigSmallHead().hashCode());
        result = prime * result + ((getLength() == null) ? 0 : getLength().hashCode());
        result = prime * result + ((getLeftWidth() == null) ? 0 : getLeftWidth().hashCode());
        result = prime * result + ((getRightWidth() == null) ? 0 : getRightWidth().hashCode());
        result = prime * result + ((getHangWearSide() == null) ? 0 : getHangWearSide().hashCode());
        result = prime * result + ((getHangSideWidth() == null) ? 0 : getHangSideWidth().hashCode());
        result = prime * result + ((getHangSideNumber() == null) ? 0 : getHangSideNumber().hashCode());
        result = prime * result + ((getDoorsillNumber() == null) ? 0 : getDoorsillNumber().hashCode());
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
        sb.append(", isBigSmallHead=").append(isBigSmallHead);
        sb.append(", length=").append(length);
        sb.append(", leftWidth=").append(leftWidth);
        sb.append(", rightWidth=").append(rightWidth);
        sb.append(", hangWearSide=").append(hangWearSide);
        sb.append(", hangSideWidth=").append(hangSideWidth);
        sb.append(", hangSideNumber=").append(hangSideNumber);
        sb.append(", doorsillNumber=").append(doorsillNumber);
        sb.append(", productId=").append(productId);
        sb.append(", remarks=").append(remarks);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}