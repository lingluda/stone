package cn.interheart.stone.service.cp;

import cn.interheart.stone.common.enums.StoneEnums;
import cn.interheart.stone.dao.entity.*;
import cn.interheart.stone.dao.entity.extmapper.cp.CpMeasurePlateExtMapper;
import cn.interheart.stone.dao.entity.extmapper.cp.dto.MeasurePlateDto;
import cn.interheart.stone.dao.entity.mapper.MeasurePlateMapper;
import cn.interheart.stone.service.cp.vo.MeasureOfferVo;
import cn.interheart.stone.service.cp.vo.MeasurePlateVo;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang.math.NumberUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.*;

@Service
public class CpMeasurePlateService {

    @Resource
    MeasurePlateMapper measurePlateMapper;
    @Resource
    CpMeasurePlateExtMapper cpMeasurePlateExtMapper;

    /**
     * insert
     * @return AjaxModel
     */
    public ResultDto insert(MeasurePlate measurePlate){
        ResultDto resultDto = new ResultDto();
        measurePlate.setGmtCreate(new Date());
        measurePlateMapper.insertSelective(measurePlate);
        return  resultDto;
    }

    /**
     * del
     * @return
     */
    public ResultDto del(Integer id){
        ResultDto resultDto = new ResultDto();
        if(id == null){
            resultDto.setCode("1");
            resultDto.setMsg("参数Id 不能为空!");
            return resultDto;
        }

        measurePlateMapper.deleteByPrimaryKey(id);
        return resultDto;
    }

    /**
     * update
     * @return
     */
    public ResultDto update(MeasurePlate measurePlate){
        ResultDto resultDto = new ResultDto();
        if(measurePlate.getId() == null){
            resultDto.setCode("1");
            resultDto.setMsg("参数Id 不能为空!");
            return resultDto;
        }
        BigDecimal sumCost = new BigDecimal("0");



        measurePlateMapper.updateByPrimaryKeySelective(measurePlate);
        measurePlate = measurePlateMapper.selectByPrimaryKey(measurePlate.getId());
        sumCost =  measurePlate.getMaterialCost()
                    .add(measurePlate.getProcessCost())
                    .add(measurePlate.getInstallationCost())
                    .add(measurePlate.getExcipientCost())
                    .add(measurePlate.getNursingCost());
        measurePlate.setSumCost(sumCost.setScale(2, BigDecimal.ROUND_HALF_UP));
        measurePlateMapper.updateByPrimaryKeySelective(measurePlate);
        return  resultDto;
    }
    /**
     * info
     * @param id
     * @return
     */
    public ResultDto info(Integer id){
        ResultDto resultDto = new ResultDto();
        if(id == null){
            resultDto.setCode("1");
            resultDto.setMsg("参数Id 不能为空!");
            return resultDto;
        }
        MeasurePlate measurePlate = measurePlateMapper.selectByPrimaryKey(id);
        resultDto.setData(measurePlate);
        return  resultDto;
    }
    /**
     * list
     * @return
     */
    public ResultDto list(Map<String,String> data) {
        ResultDto resultDto = new ResultDto();
        MeasurePlateExample measurePlateExample = new MeasurePlateExample();
        int pageIndex = NumberUtils.toInt(data.get("pageIndex"), 1);
        int pageSize = NumberUtils.toInt(data.get("pageSize"), 10);
        PageHelper.startPage(pageIndex,pageSize, true);
        PageList page = new PageList(measurePlateMapper.selectByExample(measurePlateExample));
        resultDto.setData(page);
        return resultDto;
    }

    /**
     * 获取量尺列表
     * @param data
     * @return
     */
    public ResultDto getMeasureList(Map<String,String> data){
        ResultDto resultDto = new ResultDto();
        if (!ObjectUtils.isEmpty(data)){
            if (!StringUtils.isEmpty(data.get("projectId"))){
                int pageIndex = NumberUtils.toInt(data.get("pageIndex"), 1);
                int pageSize = NumberUtils.toInt(data.get("pageSize"), 10);
                PageHelper.startPage(pageIndex,pageSize, true);
                PageList page = new PageList(cpMeasurePlateExtMapper.getMeasureList(data));

                List<MeasurePlateVo> measurePlateVoList = new ArrayList<MeasurePlateVo>();
                List<MeasurePlateDto> rows = page.getRows();
                for (MeasurePlateDto mpDto : rows) {
                    MeasurePlateVo mpVo = new MeasurePlateVo();
                    BeanUtils.copyProperties(mpDto,mpVo);
                    measurePlateVoList.add(mpVo);
                }
                page.setRows(measurePlateVoList);
                resultDto.setData(page);
            }else{
                resultDto.setMsg("projectId不能为空");
                resultDto.setCode(StoneEnums.AjaxBackStatus.AJAX_FAIL.getValue());
            }
        }else{
            resultDto.setMsg("无效的参数");
            resultDto.setCode(StoneEnums.AjaxBackStatus.AJAX_FAIL.getValue());
        }

        return  resultDto;
    }


    /**
     * 获取报价量尺列表
     * @param data
     * @return
     */
    public ResultDto getMeasureOfferList(Map<String,String> data){
        ResultDto resultDto = new ResultDto();
        if (!ObjectUtils.isEmpty(data)){
            if (!StringUtils.isEmpty(data.get("projectId"))){
                data.put("status", StoneEnums.ProjectStatusEnum.OFFER.getValue().toString());
                int pageIndex = NumberUtils.toInt(data.get("pageIndex"), 1);
                int pageSize = NumberUtils.toInt(data.get("pageSize"), 10);
                PageHelper.startPage(pageIndex,pageSize, true);
                PageList page = new PageList(cpMeasurePlateExtMapper.getMeasureOfferList(data));
                resultDto.setData(page);
            }else{
                resultDto.setMsg("projectId不能为空");
                resultDto.setCode(StoneEnums.AjaxBackStatus.AJAX_FAIL.getValue());
            }
        }else{
            resultDto.setMsg("无效的参数");
            resultDto.setCode(StoneEnums.AjaxBackStatus.AJAX_FAIL.getValue());
        }

        return  resultDto;
    }

}