package cn.interheart.stone.dao.entity.mapper;

import cn.interheart.stone.dao.entity.MeasureProgramme;
import cn.interheart.stone.dao.entity.MeasureProgrammeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeasureProgrammeMapper {
    long countByExample(MeasureProgrammeExample example);

    int deleteByExample(MeasureProgrammeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MeasureProgramme record);

    int insertSelective(MeasureProgramme record);

    List<MeasureProgramme> selectByExample(MeasureProgrammeExample example);

    MeasureProgramme selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MeasureProgramme record, @Param("example") MeasureProgrammeExample example);

    int updateByExample(@Param("record") MeasureProgramme record, @Param("example") MeasureProgrammeExample example);

    int updateByPrimaryKeySelective(MeasureProgramme record);

    int updateByPrimaryKey(MeasureProgramme record);
}