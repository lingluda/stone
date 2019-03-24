package cn.interheart.stone.dao.entity.extmapper.common;


import java.util.List;
import java.util.Map;

public interface CoDicProcessInstructionExtMapper {
    /**
     * 查询加工说明列表
     * @param data
     * @return
     */
    List<Map<String,String>> extList(Map data);

}