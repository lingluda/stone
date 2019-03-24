package cn.interheart.stone.dao.entity.mapper;

import cn.interheart.stone.dao.entity.EmployInfo;
import cn.interheart.stone.dao.entity.EmployInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployInfoMapper {
    long countByExample(EmployInfoExample example);

    int deleteByExample(EmployInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EmployInfo record);

    int insertSelective(EmployInfo record);

    List<EmployInfo> selectByExample(EmployInfoExample example);

    EmployInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EmployInfo record, @Param("example") EmployInfoExample example);

    int updateByExample(@Param("record") EmployInfo record, @Param("example") EmployInfoExample example);

    int updateByPrimaryKeySelective(EmployInfo record);

    int updateByPrimaryKey(EmployInfo record);
}