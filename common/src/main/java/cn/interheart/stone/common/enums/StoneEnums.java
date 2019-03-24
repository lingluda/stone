package cn.interheart.stone.common.enums;


public class StoneEnums {

    /**
     * 基础数据字典
     */
    public enum DicBaseEnum{

        SCALE_AREA("量尺区域", 0),
        APARTMENTA_LYOUT("户型类型", 1),
        QUANTITY_UNIT("数量单位", 2),
        LINES_COLOR("纹理颜色", 3),
        LINES("物料恩利", 4),
        BACKGROUNDCODE("底色", 5),
        MATERIALTYPE("物料类型", 6);


        private String name;
        private Integer value;

        DicBaseEnum(String name, Integer value) {
            this.name = name;
            this.value = value;
        }

        public String getName() {

            return name;
        }

        public Integer getValue() {
            return value;
        }


    }


    /**
     * 状态（0启用，1禁用）
     */
    public enum EnableEnum {

        ENABLE("启用", 0),
        DISABLE("禁用", 1);

        private String name;
        private Integer value;

        EnableEnum(String name, Integer value) {
            this.name = name;
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public Integer getValue() {
            return value;
        }
    }

    /**
     * 公司AND门店,审核状态
     */
    public enum CompanyOrStoreStatusEnum{
        DRAFT("草稿", 0),
        UNAUDITED("未审核", 1),
        PASS("已通过", 2),
        NOT_PASS("未通过", 3);

        private String name;
        private Integer value;

        CompanyOrStoreStatusEnum(String name, Integer value) {
            this.name = name;
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public Integer getValue() {
            return value;
        }
    }

    /**
     * 公司门店
     */
    public enum CompanyStore {
        COOPERATION("合作门店", 0),
        JOIN("加盟门店", 1),
        MANAGE("合作门店", 2),
        STRAIGHT ("直营门店", 3);

        private String name;
        private Integer value;

        CompanyStore(String name, Integer value) {
            this.name = name;
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public Integer getValue() {
            return value;
        }
    }

    /**
     * 图片附件
     */
    public enum  PictureEnum{
        PROCESS_MODE("加工方式", 0),
        COMPANY_IMAGE("公司图片", 1),
        COMPANY_DATA("公司资料", 2),
        COMPANY_CONTRACT("公司合作合同", 3),
        STAFF_PHOTO("员工资料照片", 4),
        IDCARD_PHOTO("员工身份证照片", 5),
        COMPANY_STORE_IMAGE("公司门店图片", 6),
        COMPANY_STORE_DATA("公司门店资料", 7),
        COMPANY_STORE_CONTRACT("公司门店合作合同", 8),
        MEASURE_DOORSILL_PROGRAMME("量尺门槛石方案图片", 9);

        private String name;
        private Integer value;

        PictureEnum(String name, Integer value) {
            this.name = name;
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public Integer getValue() {
            return value;
        }
    }

    /**
     * 项目客户成交状态
     */
    public enum ProjectDealStatusEnum{
        TRANSACTION("成交客户", Byte.valueOf("0")),
        INTENTIONAL("意向客户", Byte.valueOf("1")),
        POTENTIAL("潜在客户", Byte.valueOf("2")),
        LOSS("流失客户", Byte.valueOf("3"));

        private String name;
        private Byte value;

        ProjectDealStatusEnum(String name, Byte value) {
            this.name = name;
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public Byte getValue() {
            return value;
        }
    }


    /**
     * 项目状态
     */
    public enum ProjectStatusEnum{
        LOSS("流失",Byte.valueOf("-1")),
        UNVISIT("待拜访", Byte.valueOf("0")),
        VISIT("回访", Byte.valueOf("1")),
        SCALE("量尺", Byte.valueOf("2")),
        OFFER("报价", Byte.valueOf("3")),
        CONTRACT("合同", Byte.valueOf("4")),
        PRODUCTION("生产", Byte.valueOf("5")),
        INSTALL("安装", Byte.valueOf("6")),
        RECEIVABLES("收款", Byte.valueOf("7"));

        private String name;
        private Byte value;

        ProjectStatusEnum(String name, Byte value) {
            this.name = name;
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public Byte getValue() {
            return value;
        }
    }

    /**
     * APP用户类型
     */
    public enum AppUserTypeEnum{
        JOIN("加盟业务员", 0),
        SALE("终端销售业务员", 1),
        MEASURE("量尺人员", 2),
        PRODUCTION("生产环节人员", 3),
        SPREAD("平台推广业务员", 4);

        private String name;
        private Integer value;

        AppUserTypeEnum(String name, Integer value) {
            this.name = name;
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public Integer getValue() {
            return value;
        }
    }

    /**
     * 公司账号类型
     */
    public enum CompanyUserTypeEnum{
        ADMIN("管理员", 0),
        ORDINARY("普通账号", 1);

        private String name;
        private Integer value;

        CompanyUserTypeEnum(String name, Integer value) {
            this.name = name;
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public Integer getValue() {
            return value;
        }
    }

    public enum AjaxBackStatus {
        AJAX_SUCCESS("成功","0"),
        AJAX_FAIL("失败","1");

        private String name;
        private String value;

        AjaxBackStatus(String name, String value) {
            this.name = name;
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public String getValue() {
            return value;
        }
    }



    /**
     * 量尺门 槛石是否大小头
     */
    public enum DoorsillBigSmallHeadEnum{
        YES("是", 0),
        NO("否", 1);

        private String name;
        private Integer value;

        DoorsillBigSmallHeadEnum(String name, Integer value) {
            this.name = name;
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public Integer getValue() {
            return value;
        }
    }

    /**
     * 量尺门槛石 磨边吊边
     */
    public enum DoorsillHangWearSideEnum{
        NOHANG_NOWEAR("不吊不磨", 0),
        WEAR_ONE("磨一长边", 1),
        WEAR_TWO("磨二长边", 2),
        HANG_ONE("吊一", 3),
        HANG_ONE_WEAR_ONE("吊一磨一", 4),
        HANG_TWO("吊二", 5);

        private String name;
        private Integer value;

        DoorsillHangWearSideEnum(String name, Integer value) {
            this.name = name;
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public Integer getValue() {
            return value;
        }
    }


    /**
     * 量尺门套 类型
     */
    public enum DoorsetTypeEnum{
        SINGLE("单面套", 0),
        DOUBLE("双面套", 1);


        private String name;
        private Integer value;

        DoorsetTypeEnum(String name, Integer value) {
            this.name = name;
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public Integer getValue() {
            return value;
        }
    }

    /**
     * 量尺门套 侧板上下宽规格
     */
   public enum  DoorsetSideTdWidthSpecificationsEnum{
        AGREEMENT("一致", 0),
        ATYPISM("不一致", 1);

        private String name;
        private Integer value;

        DoorsetSideTdWidthSpecificationsEnum(String name, Integer value) {
            this.name = name;
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public Integer getValue() {
            return value;
        }
   }


    /**
     * 量尺门套 侧板规格
     */
    public enum  DoorsetSideStyleEnum{
        LINE("线条", 0),
        PANEL("面板", 1);

        private String name;
        private Integer value;

        DoorsetSideStyleEnum(String name, Integer value) {
            this.name = name;
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public Integer getValue() {
            return value;
        }
    }


    /**
     * 量尺门套 面顶板左右宽规格
     */

    public enum  PanelRoofWidthSpecificationsEnum{
        AGREEMENT("一致", 0),
        ATYPISM("不一致", 1);

        private String name;
        private Integer value;

        PanelRoofWidthSpecificationsEnum(String name, Integer value) {
            this.name = name;
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public Integer getValue() {
            return value;
        }
    }



    /**
     * 量尺类型
     */
    public enum  MeasureTypeEnum{
        DOOR_SILL("门槛石", 0),
        DOOR_SET("门套", 1),
        WINDOW_SILL("窗台", 2),
        WINDOW_LEEVE("窗套", 3),
        PLATFORM("地台", 4),
        FOOTING("地脚", 5),
        STEP("踏步", 6),
        SPELLING_FLOWER("拼花", 7),
        COOKING_BENCH("灶台", 8),
        WAVEGUIDE_LINE("波导线", 9),
        ROME_COLUMN("罗马柱", 10);

        private String name;
        private Integer value;

        MeasureTypeEnum(String name, Integer value) {
            this.name = name;
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public Integer getValue() {
            return value;
        }
    }

}
