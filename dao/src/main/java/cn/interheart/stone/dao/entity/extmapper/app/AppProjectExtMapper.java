package cn.interheart.stone.dao.entity.extmapper.app;

import cn.interheart.stone.dao.entity.extmapper.app.dto.ProjectBaseDto;
import java.util.List;
import java.util.Map;
/**
 * @author SHI_KAI
 * @date 2018/4/24 15:25
 * @description APP项目接口
 */
public interface AppProjectExtMapper {
    /***
    * @description 量尺人员的项目列表
    * @author SHI_KAI
    * @date 2018/4/24 15:24
    * @param data
    * @return java.util.List<java.util.Map<java.lang.String,java.lang.String>>
    */
  List<Map<String, String>> measureProjectList(Map data);

  /**
  * @description项目的基本信息
  * @author SHI_KAI
  * @date 2018/4/24 15:00
  * @param projectId
  * @return java.util.List<cn.interheart.stone.dao.entity.extmapper.app.dto.ProjectBaseDto>
  */
  List<ProjectBaseDto> projectBaseInfo(Integer projectId);

  /**
  * @description 统计量材料尺数量
  * @author SHI_KAI
  * @date 2018/4/24 15:19
  * @param
  * @return java.util.List<java.util.Map<java.lang.String,java.lang.Integer>>
  */
  List<Map<String, Integer>> countMeasureNumber(Integer projectId);
}
