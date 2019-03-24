package cn.interheart.stone.dao.entity.mapper;

import cn.interheart.stone.dao.entity.MeasureDoorset;
import cn.interheart.stone.dao.entity.MeasureDoorsetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeasureDoorsetMapper {
    long countByExample(MeasureDoorsetExample example);

    int deleteByExample(MeasureDoorsetExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MeasureDoorset record);

    int insertSelective(MeasureDoorset record);

    List<MeasureDoorset> selectByExample(MeasureDoorsetExample example);

    MeasureDoorset selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MeasureDoorset record, @Param("example") MeasureDoorsetExample example);

    int updateByExample(@Param("record") MeasureDoorset record, @Param("example") MeasureDoorsetExample example);

    int updateByPrimaryKeySelective(MeasureDoorset record);

    int updateByPrimaryKey(MeasureDoorset record);
}