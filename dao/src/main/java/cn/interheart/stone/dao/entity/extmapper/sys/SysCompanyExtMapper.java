package cn.interheart.stone.dao.entity.extmapper.sys;


import java.util.List;
import java.util.Map;

public interface SysCompanyExtMapper {
    /**
     * 统计公司门店数量
     * @param data
     * @return
     */
    List<Map<String,String>> countCompanyStroe(Map data);
}