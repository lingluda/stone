package cn.interheart.stone.service.sys.interfaces;

import cn.interheart.stone.dao.entity.CompanyUser;
import cn.interheart.stone.dao.entity.ResultDto;

import java.util.Map;

public interface SysCompanyUserInter {
    //插入公司管理账号
    ResultDto add(CompanyUser companyUser);
    ResultDto update(CompanyUser companyUser);
    ResultDto del(Integer id);
    ResultDto find(Map<String,String> data);
}
