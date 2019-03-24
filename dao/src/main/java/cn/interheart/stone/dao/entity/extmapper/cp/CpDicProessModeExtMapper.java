package cn.interheart.stone.dao.entity.extmapper.cp;


import java.util.List;
import java.util.Map;

public interface CpDicProessModeExtMapper {
    /**
     * 查询加工方式列表
     * @param data
     * @return
     */
    List<Map<String,String>> extList(Map data);

}