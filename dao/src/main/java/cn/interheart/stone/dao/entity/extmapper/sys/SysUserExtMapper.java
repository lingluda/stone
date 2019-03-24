package cn.interheart.stone.dao.entity.extmapper.sys;


import java.util.List;
import java.util.Map;

public interface SysUserExtMapper {
    /**
     * 查询平台用户列表
     * @param data
     * @return
     */
    List<Map<String,String>> extList(Map data);
}