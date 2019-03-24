package cn.interheart.stone.service.common;

import cn.interheart.stone.common.enums.StoneEnums;
import cn.interheart.stone.dao.entity.DicBase;
import cn.interheart.stone.dao.entity.DicBaseExample;
import cn.interheart.stone.dao.entity.ResultDto;
import cn.interheart.stone.dao.entity.extmapper.common.CoDicProcessInstructionExtMapper;
import cn.interheart.stone.dao.entity.extmapper.common.CoDicProessModeExtMapper;
import cn.interheart.stone.dao.entity.extmapper.common.CoProductExtMapper;
import cn.interheart.stone.dao.entity.mapper.DicBaseMapper;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 *公共基础数据
 */
@Service
public class CoDicBaseService {
    @Resource
    DicBaseMapper dicBaseMapper;

    @Resource
    CoProductExtMapper coProductExtMapper;

    @Resource
    CoDicProessModeExtMapper coDicProessModeExtMapper;

    @Resource
    CoDicProcessInstructionExtMapper coDicProcessInstructionExtMapper;
    /**
     * 石材列表
     * @return
     */
    public ResultDto productList(Integer companyId) {
        ResultDto resultDto = new ResultDto();
        resultDto.setData(coProductExtMapper.productList(companyId));
        return resultDto;
    }

    /**
     * 户型列表
     * @return
     */
    public ResultDto houseTypeList() {
        ResultDto resultDto = new ResultDto();
        DicBaseExample dicBaseExample = new DicBaseExample();
        //查询条件
        DicBaseExample.Criteria criteria = dicBaseExample.createCriteria();
        criteria.andCodeEqualTo(StoneEnums.DicBaseEnum.APARTMENTA_LYOUT.getValue().byteValue());

        List<DicBase> houseTypeList = dicBaseMapper.selectByExample(dicBaseExample);
        resultDto.setData(houseTypeList);
        return resultDto;
    }

    /**
     *  加工方式列表
     * @return
     */
    public ResultDto processModeList(Map<String, String> data) {
        ResultDto resultDto = new ResultDto();
        List<Map<String,String>> processModeList = coDicProessModeExtMapper.extList(data);
        resultDto.setData(processModeList);
        return resultDto;
    }

    /**
     * 加工说明列表
     * @return
     */
    public ResultDto processInstructionList(Map<String, String> data) {
        ResultDto resultDto = new ResultDto();
        List<Map<String,String>> processInstructionList = coDicProcessInstructionExtMapper.extList(data);
        resultDto.setData(processInstructionList);
        return resultDto;
    }
    /**
     * 量尺区域列表
     * @return
     */
    public ResultDto measureAreaList() {
        ResultDto resultDto = new ResultDto();
        DicBaseExample dicBaseExample = new DicBaseExample();
        //查询条件
        DicBaseExample.Criteria criteria = dicBaseExample.createCriteria();
        criteria.andCodeEqualTo(StoneEnums.DicBaseEnum.SCALE_AREA.getValue().byteValue());

        List<DicBase> measureAreaList = dicBaseMapper.selectByExample(dicBaseExample);
        resultDto.setData(measureAreaList);
        return resultDto;
    }
}
