package cn.interheart.stone.dao.entity.extmapper.cp;


import java.util.List;
import java.util.Map;

public interface CpCompanyUserExtMapper {
    /**
     * 连表查询公司用户
     * @param data
     * @return
     */
    List<Map<String,String>> extList(Map data);
}