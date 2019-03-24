package cn.interheart.stone.dao.entity.mapper;

import cn.interheart.stone.dao.entity.MeasurePlate;
import cn.interheart.stone.dao.entity.MeasurePlateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeasurePlateMapper {
    long countByExample(MeasurePlateExample example);

    int deleteByExample(MeasurePlateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MeasurePlate record);

    int insertSelective(MeasurePlate record);

    List<MeasurePlate> selectByExample(MeasurePlateExample example);

    MeasurePlate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MeasurePlate record, @Param("example") MeasurePlateExample example);

    int updateByExample(@Param("record") MeasurePlate record, @Param("example") MeasurePlateExample example);

    int updateByPrimaryKeySelective(MeasurePlate record);

    int updateByPrimaryKey(MeasurePlate record);
}