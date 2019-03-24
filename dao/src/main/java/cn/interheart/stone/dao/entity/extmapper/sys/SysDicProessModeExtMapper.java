package cn.interheart.stone.dao.entity.extmapper.sys;


import java.util.List;
import java.util.Map;

public interface SysDicProessModeExtMapper {
    /**
     * 查询加工方式列表都是
     * @param data
     * @return
     */
    List<Map<String,String>> extList(Map data);

}