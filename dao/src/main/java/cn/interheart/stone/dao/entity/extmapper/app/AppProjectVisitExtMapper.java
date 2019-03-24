package cn.interheart.stone.dao.entity.extmapper.app;

import cn.interheart.stone.dao.entity.ProjectVisit;
import cn.interheart.stone.dao.entity.ProjectVisitExample;

import java.util.List;
import java.util.Map;

/**
 * 客户回拜访
 */
public interface AppProjectVisitExtMapper {
    List<ProjectVisit> getCustomerVisitList(Map<String,String> formMap);
    List<ProjectVisit> getProjectVisitList(Map<String,String> formMap);
}
