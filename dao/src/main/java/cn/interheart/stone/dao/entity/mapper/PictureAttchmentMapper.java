package cn.interheart.stone.dao.entity.mapper;

import cn.interheart.stone.dao.entity.PictureAttchment;
import cn.interheart.stone.dao.entity.PictureAttchmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PictureAttchmentMapper {
    long countByExample(PictureAttchmentExample example);

    int deleteByExample(PictureAttchmentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PictureAttchment record);

    int insertSelective(PictureAttchment record);

    List<PictureAttchment> selectByExample(PictureAttchmentExample example);

    PictureAttchment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PictureAttchment record, @Param("example") PictureAttchmentExample example);

    int updateByExample(@Param("record") PictureAttchment record, @Param("example") PictureAttchmentExample example);

    int updateByPrimaryKeySelective(PictureAttchment record);

    int updateByPrimaryKey(PictureAttchment record);
}