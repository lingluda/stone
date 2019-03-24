package cn.interheart.stone.dao.entity.mapper;

import cn.interheart.stone.dao.entity.MeasureDoorsill;
import cn.interheart.stone.dao.entity.MeasureDoorsillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeasureDoorsillMapper {
    long countByExample(MeasureDoorsillExample example);

    int deleteByExample(MeasureDoorsillExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MeasureDoorsill record);

    int insertSelective(MeasureDoorsill record);

    List<MeasureDoorsill> selectByExample(MeasureDoorsillExample example);

    MeasureDoorsill selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MeasureDoorsill record, @Param("example") MeasureDoorsillExample example);

    int updateByExample(@Param("record") MeasureDoorsill record, @Param("example") MeasureDoorsillExample example);

    int updateByPrimaryKeySelective(MeasureDoorsill record);

    int updateByPrimaryKey(MeasureDoorsill record);
}