package cn.interheart.stone.dao.entity.extmapper.common;

import java.util.List;
import java.util.Map;

public interface CoProductExtMapper {

    /**
     * 石材列表
     * @param companyId 公司ID
     * @return
     */
    List<Map<String,String>> productList(Integer companyId);
}