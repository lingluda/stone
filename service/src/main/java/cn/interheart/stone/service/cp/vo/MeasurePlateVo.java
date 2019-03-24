package cn.interheart.stone.service.cp.vo;

import cn.interheart.stone.common.enums.StoneEnums;
import org.springframework.util.StringUtils;

import java.io.Serializable;

/**
 * @author
 */
public class MeasurePlateVo implements Serializable {    /**
 * 主键ID
 */
private Integer id;



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
    private String typeCNName;

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



    /**
     * 图片ID 1,2,3,4 逗号分隔
     */
    private String imageId;

    private static final long serialVersionUID = 1L;


    private String filename; //图片名
    private String path;//图片路径

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


    public void setType(Byte type) {
        this.type = type;
    }

    public String getTypeCNName(){
        int type = Integer.parseInt(this.type.toString());
        if (StoneEnums.MeasureTypeEnum.DOOR_SILL.getValue() == type){
            return StoneEnums.MeasureTypeEnum.DOOR_SILL.getName();
        }else if(StoneEnums.MeasureTypeEnum.DOOR_SET.getValue() == type){
            return StoneEnums.MeasureTypeEnum.DOOR_SET.getName();
        }else if(StoneEnums.MeasureTypeEnum.WINDOW_SILL.getValue() == type){
            return StoneEnums.MeasureTypeEnum.WINDOW_SILL.getName();
        }else if(StoneEnums.MeasureTypeEnum.WINDOW_LEEVE.getValue() == type){
            return StoneEnums.MeasureTypeEnum.WINDOW_LEEVE.getName();
        }else if(StoneEnums.MeasureTypeEnum.PLATFORM.getValue() == type){
            return StoneEnums.MeasureTypeEnum.PLATFORM.getName();
        }else if(StoneEnums.MeasureTypeEnum.FOOTING.getValue() == type){
            return StoneEnums.MeasureTypeEnum.FOOTING.getName();
        }else if(StoneEnums.MeasureTypeEnum.STEP.getValue() == type){
            return StoneEnums.MeasureTypeEnum.STEP.getName();
        }else if (StoneEnums.MeasureTypeEnum.SPELLING_FLOWER.getValue() == type) {
            return StoneEnums.MeasureTypeEnum.SPELLING_FLOWER.getName();
        }else if (StoneEnums.MeasureTypeEnum.COOKING_BENCH.getValue() == type) {
            return StoneEnums.MeasureTypeEnum.COOKING_BENCH.getName();
        }else if (StoneEnums.MeasureTypeEnum.WAVEGUIDE_LINE.getValue() == type) {
            return StoneEnums.MeasureTypeEnum.WAVEGUIDE_LINE.getName();
        }else if (StoneEnums.MeasureTypeEnum.ROME_COLUMN.getValue() == type) {
            return StoneEnums.MeasureTypeEnum.ROME_COLUMN.getName();
        }
        return "";
    }

    public void setTypeCNName(String typeCNName) {
        this.typeCNName = typeCNName;
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

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getFilename() {
        return StringUtils.isEmpty(filename)?"":filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getPath() {
        return StringUtils.isEmpty(path)?"":path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}