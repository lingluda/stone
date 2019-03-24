package cn.interheart.stone.dao.entity.extmapper.cp;

import cn.interheart.stone.dao.entity.ProjectVisit;
import cn.interheart.stone.dao.entity.extmapper.cp.dto.MeasurePlateDto;

import java.util.List;
import java.util.Map;

/**
 * 量尺列表
 */
public interface CpMeasurePlateExtMapper {
    /**
     * 根据projectId获取量尺列表
     * @param fromMap
     * @return
     */
    public List<MeasurePlateDto> getMeasureList(Map fromMap);


    /**
     * 根据projectId获取量尺 报价列表
     * @param fromMap
     * @return
     */
    public List<MeasurePlateDto> getMeasureOfferList(Map fromMap);



}
