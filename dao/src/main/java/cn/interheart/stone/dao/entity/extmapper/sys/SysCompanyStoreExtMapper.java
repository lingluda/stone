package cn.interheart.stone.dao.entity.extmapper.sys;


import java.util.List;
import java.util.Map;

public interface SysCompanyStoreExtMapper {

    List<Map<String,String>> companyStorelist(Map data);
}