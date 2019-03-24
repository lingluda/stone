package cn.interheart.stone.dao.entity.extmapper.cp;

import java.util.List;
import java.util.Map;

public interface CpProductExtMapper {
    /**
     * 查询品名列表
     * @param data
     * @return
     */
    List<Map<String,String>> extList(Map data);
}