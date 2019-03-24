package cn.interheart.stone.dao.entity.mapper;

import cn.interheart.stone.dao.entity.ProjectProduct;
import cn.interheart.stone.dao.entity.ProjectProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectProductMapper {
    long countByExample(ProjectProductExample example);

    int deleteByExample(ProjectProductExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProjectProduct record);

    int insertSelective(ProjectProduct record);

    List<ProjectProduct> selectByExample(ProjectProductExample example);

    ProjectProduct selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProjectProduct record, @Param("example") ProjectProductExample example);

    int updateByExample(@Param("record") ProjectProduct record, @Param("example") ProjectProductExample example);

    int updateByPrimaryKeySelective(ProjectProduct record);

    int updateByPrimaryKey(ProjectProduct record);
}