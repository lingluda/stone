package cn.interheart.stone.dao.entity.mapper;

import cn.interheart.stone.dao.entity.DicBase;
import cn.interheart.stone.dao.entity.DicBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DicBaseMapper {
    long countByExample(DicBaseExample example);

    int deleteByExample(DicBaseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DicBase record);

    int insertSelective(DicBase record);

    List<DicBase> selectByExample(DicBaseExample example);

    DicBase selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DicBase record, @Param("example") DicBaseExample example);

    int updateByExample(@Param("record") DicBase record, @Param("example") DicBaseExample example);

    int updateByPrimaryKeySelective(DicBase record);

    int updateByPrimaryKey(DicBase record);
}