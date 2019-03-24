package cn.interheart.stone.dao.entity.mapper;

import cn.interheart.stone.dao.entity.DicProcessMode;
import cn.interheart.stone.dao.entity.DicProcessModeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DicProcessModeMapper {
    long countByExample(DicProcessModeExample example);

    int deleteByExample(DicProcessModeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DicProcessMode record);

    int insertSelective(DicProcessMode record);

    List<DicProcessMode> selectByExample(DicProcessModeExample example);

    DicProcessMode selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DicProcessMode record, @Param("example") DicProcessModeExample example);

    int updateByExample(@Param("record") DicProcessMode record, @Param("example") DicProcessModeExample example);

    int updateByPrimaryKeySelective(DicProcessMode record);

    int updateByPrimaryKey(DicProcessMode record);
}