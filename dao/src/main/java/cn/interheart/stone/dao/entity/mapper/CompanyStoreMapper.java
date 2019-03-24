package cn.interheart.stone.dao.entity.mapper;

import cn.interheart.stone.dao.entity.CompanyStore;
import cn.interheart.stone.dao.entity.CompanyStoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyStoreMapper {
    long countByExample(CompanyStoreExample example);

    int deleteByExample(CompanyStoreExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CompanyStore record);

    int insertSelective(CompanyStore record);

    List<CompanyStore> selectByExample(CompanyStoreExample example);

    CompanyStore selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CompanyStore record, @Param("example") CompanyStoreExample example);

    int updateByExample(@Param("record") CompanyStore record, @Param("example") CompanyStoreExample example);

    int updateByPrimaryKeySelective(CompanyStore record);

    int updateByPrimaryKey(CompanyStore record);
}