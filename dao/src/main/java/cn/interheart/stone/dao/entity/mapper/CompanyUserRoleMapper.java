package cn.interheart.stone.dao.entity.mapper;

import cn.interheart.stone.dao.entity.CompanyUserRole;
import cn.interheart.stone.dao.entity.CompanyUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyUserRoleMapper {
    long countByExample(CompanyUserRoleExample example);

    int deleteByExample(CompanyUserRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CompanyUserRole record);

    int insertSelective(CompanyUserRole record);

    List<CompanyUserRole> selectByExample(CompanyUserRoleExample example);

    CompanyUserRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CompanyUserRole record, @Param("example") CompanyUserRoleExample example);

    int updateByExample(@Param("record") CompanyUserRole record, @Param("example") CompanyUserRoleExample example);

    int updateByPrimaryKeySelective(CompanyUserRole record);

    int updateByPrimaryKey(CompanyUserRole record);
}