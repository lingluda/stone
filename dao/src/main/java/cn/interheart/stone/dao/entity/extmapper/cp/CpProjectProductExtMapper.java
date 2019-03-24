package cn.interheart.stone.dao.entity.extmapper.cp;

import org.omg.CORBA.INTERNAL;

import java.util.List;
import java.util.Map;

public interface CpProjectProductExtMapper {
    /**
     * 项目意向石材
     * @param projectId 项目id
     * @return
     */
    List<Map<String,String>> findProjectProduct(Integer projectId);
}