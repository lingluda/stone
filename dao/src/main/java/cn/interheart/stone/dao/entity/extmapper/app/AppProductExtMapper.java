package cn.interheart.stone.dao.entity.extmapper.app;

import java.util.List;
import java.util.Map;

public interface AppProductExtMapper {
    /**
     * 添加项目时的品名下拉列表
     * @param companyId 公司ID
     * @return
     */
    List<Map<String,String>> productList(Integer companyId);
}