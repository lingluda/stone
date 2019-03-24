package cn.interheart.stone.dao.entity.mapper;

import cn.interheart.stone.dao.entity.EmployDepart;
import cn.interheart.stone.dao.entity.EmployDepartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployDepartMapper {
    long countByExample(EmployDepartExample example);

    int deleteByExample(EmployDepartExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EmployDepart record);

    int insertSelective(EmployDepart record);

    List<EmployDepart> selectByExample(EmployDepartExample example);

    EmployDepart selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EmployDepart record, @Param("example") EmployDepartExample example);

    int updateByExample(@Param("record") EmployDepart record, @Param("example") EmployDepartExample example);

    int updateByPrimaryKeySelective(EmployDepart record);

    int updateByPrimaryKey(EmployDepart record);
}