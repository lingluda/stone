package cn.interheart.stone.dao.entity.extmapper.cp;


import java.util.List;
import java.util.Map;

public interface CpEmployInfoExtMapper {

    List<Map<String,String>> selectEmployeeInformation(Map data);
}