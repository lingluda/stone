package cn.interheart.stone.dao.entity.extmapper.common;


import java.util.List;
import java.util.Map;

public interface CoDicProessModeExtMapper {
    /**
     * 查询加工方式列表
     * @param data
     * @return
     */
    List<Map<String,String>> extList(Map data);

}