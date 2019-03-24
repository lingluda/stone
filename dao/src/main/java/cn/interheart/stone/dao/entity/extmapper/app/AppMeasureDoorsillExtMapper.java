package cn.interheart.stone.dao.entity.extmapper.app;


import cn.interheart.stone.dao.entity.MeasureDoorsill;

import java.util.List;
import java.util.Map;

public interface AppMeasureDoorsillExtMapper {
    /**
     * 门槛石查询info
     * @param id
     * @return
     */
    Map<String,String> extInfo(Integer id);

    Map<String,String> extProgrammeInfo(Integer id);

}