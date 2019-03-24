package cn.interheart.stone.dao.entity.mapper;

import cn.interheart.stone.dao.entity.CompanyRole;
import cn.interheart.stone.dao.entity.CompanyRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyRoleMapper {
    long countByExample(CompanyRoleExample example);

    int deleteByExample(CompanyRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CompanyRole record);

    int insertSelective(CompanyRole record);

    List<CompanyRole> selectByExample(CompanyRoleExample example);

    CompanyRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CompanyRole record, @Param("example") CompanyRoleExample example);

    int updateByExample(@Param("record") CompanyRole record, @Param("example") CompanyRoleExample example);

    int updateByPrimaryKeySelective(CompanyRole record);

    int updateByPrimaryKey(CompanyRole record);
}