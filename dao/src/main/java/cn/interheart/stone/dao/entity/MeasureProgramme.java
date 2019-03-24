package cn.interheart.stone.dao.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class MeasureProgramme implements Serializable {
    private Integer id;

    /**
     * 关联数据ID
     */
    private Integer parentId;

    /**
     * 加工说明ID
     */
    private Integer dicProcessInstructionId;

    /**
     * 加工方式ID
     */
    private Integer dicProcessModelId;

    /**
     * 量尺类型 0 门槛石,1门套
     */
    private Byte type;

    private Date gmtCreate ;

    private Date gmtModified = new Date();

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getDicProcessInstructionId() {
        return dicProcessInstructionId;
    }

    public void setDicProcessInstructionId(Integer dicProcessInstructionId) {
        this.dicProcessInstructionId = dicProcessInstructionId;
    }

    public Integer getDicProcessModelId() {
        return dicProcessModelId;
    }

    public void setDicProcessModelId(Integer dicProcessModelId) {
        this.dicProcessModelId = dicProcessModelId;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
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
        MeasureProgramme other = (MeasureProgramme) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getParentId() == null ? other.getParentId() == null : this.getParentId().equals(other.getParentId()))
            && (this.getDicProcessInstructionId() == null ? other.getDicProcessInstructionId() == null : this.getDicProcessInstructionId().equals(other.getDicProcessInstructionId()))
            && (this.getDicProcessModelId() == null ? other.getDicProcessModelId() == null : this.getDicProcessModelId().equals(other.getDicProcessModelId()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        result = prime * result + ((getDicProcessInstructionId() == null) ? 0 : getDicProcessInstructionId().hashCode());
        result = prime * result + ((getDicProcessModelId() == null) ? 0 : getDicProcessModelId().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
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
        sb.append(", parentId=").append(parentId);
        sb.append(", dicProcessInstructionId=").append(dicProcessInstructionId);
        sb.append(", dicProcessModelId=").append(dicProcessModelId);
        sb.append(", type=").append(type);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}