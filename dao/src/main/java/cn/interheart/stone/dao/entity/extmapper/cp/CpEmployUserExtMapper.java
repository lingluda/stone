package cn.interheart.stone.dao.entity.extmapper.cp;


import java.util.List;
import java.util.Map;

public interface CpEmployUserExtMapper {

    List<Map<String,String>> extList(Map<String, String> data);

    Map<String,String> extInfo(Integer id);

}