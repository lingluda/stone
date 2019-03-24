package cn.interheart.stone.dao.entity.mapper;

import cn.interheart.stone.dao.entity.ProjectVisit;
import cn.interheart.stone.dao.entity.ProjectVisitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectVisitMapper {
    long countByExample(ProjectVisitExample example);

    int deleteByExample(ProjectVisitExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProjectVisit record);

    int insertSelective(ProjectVisit record);

    List<ProjectVisit> selectByExample(ProjectVisitExample example);

    ProjectVisit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProjectVisit record, @Param("example") ProjectVisitExample example);

    int updateByExample(@Param("record") ProjectVisit record, @Param("example") ProjectVisitExample example);

    int updateByPrimaryKeySelective(ProjectVisit record);

    int updateByPrimaryKey(ProjectVisit record);
}