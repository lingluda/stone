package cn.interheart.stone.dao.entity.mapper;

import cn.interheart.stone.dao.entity.ProjectFreight;
import cn.interheart.stone.dao.entity.ProjectFreightExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectFreightMapper {
    long countByExample(ProjectFreightExample example);

    int deleteByExample(ProjectFreightExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProjectFreight record);

    int insertSelective(ProjectFreight record);

    List<ProjectFreight> selectByExample(ProjectFreightExample example);

    ProjectFreight selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProjectFreight record, @Param("example") ProjectFreightExample example);

    int updateByExample(@Param("record") ProjectFreight record, @Param("example") ProjectFreightExample example);

    int updateByPrimaryKeySelective(ProjectFreight record);

    int updateByPrimaryKey(ProjectFreight record);
}