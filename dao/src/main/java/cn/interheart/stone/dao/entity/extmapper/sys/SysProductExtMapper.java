package cn.interheart.stone.dao.entity.extmapper.sys;

import cn.interheart.stone.dao.entity.Product;
import cn.interheart.stone.dao.entity.ProductExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SysProductExtMapper {
    /**
     * 查询品名列表
     * @param data
     * @return
     */
    List<Map<String,String>> extList(Map data);
}