package cn.interheart.stone.dao.entity.extmapper.cp;

import java.util.List;
import java.util.Map;

public interface CpProjectExtMapper {
    /**
     * 销售列表
     * @param data
     * @return
     */
    List<Map<String,String>> extList(Map data);
}