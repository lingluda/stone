package cn.interheart.stone.dao.entity.extmapper.cp;

import cn.interheart.stone.dao.entity.extmapper.app.dto.ProjectVisitDto;

import java.util.List;
import java.util.Map;

/**
 * 客户回拜访
 */
public interface CpProjectVisitExtMapper {
    List<ProjectVisitDto> getProjectVisitList(Map<String, String> formMap);
}
