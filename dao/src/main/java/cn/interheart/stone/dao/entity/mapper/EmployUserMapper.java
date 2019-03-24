package cn.interheart.stone.dao.entity.mapper;

import cn.interheart.stone.dao.entity.EmployUser;
import cn.interheart.stone.dao.entity.EmployUserExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Param;

public interface EmployUserMapper {
    long countByExample(EmployUserExample example);

    int deleteByExample(EmployUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EmployUser record);

    int insertSelective(EmployUser record);

    List<EmployUser> selectByExample(EmployUserExample example);

    EmployUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EmployUser record, @Param("example") EmployUserExample example);

    int updateByExample(@Param("record") EmployUser record, @Param("example") EmployUserExample example);

    int updateByPrimaryKeySelective(EmployUser record);

    int updateByPrimaryKey(EmployUser record);

    /**
     * 查询人员列表
     * @param fromMap
     * @return
     */
    List<Map> getLcUserList(Map fromMap);
}