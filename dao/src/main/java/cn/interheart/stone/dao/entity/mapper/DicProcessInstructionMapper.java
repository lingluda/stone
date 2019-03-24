package cn.interheart.stone.dao.entity.mapper;

import cn.interheart.stone.dao.entity.DicProcessInstruction;
import cn.interheart.stone.dao.entity.DicProcessInstructionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DicProcessInstructionMapper {
    long countByExample(DicProcessInstructionExample example);

    int deleteByExample(DicProcessInstructionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DicProcessInstruction record);

    int insertSelective(DicProcessInstruction record);

    List<DicProcessInstruction> selectByExample(DicProcessInstructionExample example);

    DicProcessInstruction selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DicProcessInstruction record, @Param("example") DicProcessInstructionExample example);

    int updateByExample(@Param("record") DicProcessInstruction record, @Param("example") DicProcessInstructionExample example);

    int updateByPrimaryKeySelective(DicProcessInstruction record);

    int updateByPrimaryKey(DicProcessInstruction record);
}