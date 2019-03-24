package cn.interheart.stone.service.cp;

import cn.interheart.stone.common.enums.StoneEnums;
import cn.interheart.stone.dao.entity.*;
import cn.interheart.stone.dao.entity.extmapper.cp.CpDicProessModeExtMapper;
import cn.interheart.stone.dao.entity.mapper.DicProcessModeMapper;
import cn.interheart.stone.dao.entity.mapper.PictureAttchmentMapper;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang.math.NumberUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class CpDicProcessModeService {

    @Resource
    DicProcessModeMapper dicProcessModeMapper;

    @Resource
    CpDicProessModeExtMapper cpDicProessModeExtMapper;

    @Resource
    PictureAttchmentMapper pictureAttchmentMapper;

    /**
     * insert
     * @return AjaxModel
     */
    public ResultDto insert(DicProcessMode dicProcessMode, Integer imageId){
        ResultDto resultDto = new ResultDto();
        dicProcessMode.setGmtCreate(new Date());
        dicProcessModeMapper.insertSelective(dicProcessMode);

        PictureAttchment pictureAttchment = new PictureAttchment();
        pictureAttchment.setId(imageId);
        pictureAttchment.setParentId(dicProcessMode.getId());
        pictureAttchmentMapper.updateByPrimaryKeySelective(pictureAttchment);

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

        dicProcessModeMapper.deleteByPrimaryKey(id);

        PictureAttchmentExample pictureAttchmentExample = new PictureAttchmentExample();
        PictureAttchmentExample.Criteria criteria = pictureAttchmentExample.createCriteria();
        criteria.andParentIdEqualTo(id);
        criteria.andTypeEqualTo(StoneEnums.PictureEnum.PROCESS_MODE.getValue().byteValue());
        pictureAttchmentMapper.deleteByExample(pictureAttchmentExample);

        return resultDto;
    }

    /**
     * update
     * @return
     */
    public ResultDto update(DicProcessMode dicProcessMode){
        ResultDto resultDto = new ResultDto();
        if(dicProcessMode.getId() == null){
            resultDto.setCode("1");
            resultDto.setMsg("参数Id 不能为空!");
            return resultDto;
        }

        dicProcessModeMapper.updateByPrimaryKeySelective(dicProcessMode);


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

        DicProcessMode dicProcessMode = dicProcessModeMapper.selectByPrimaryKey(id);

        PictureAttchmentExample pictureAttchmentExample = new PictureAttchmentExample();
        PictureAttchmentExample.Criteria criteria = pictureAttchmentExample.createCriteria();
        criteria.andParentIdEqualTo(dicProcessMode.getId());
        criteria.andTypeEqualTo(StoneEnums.PictureEnum.PROCESS_MODE.getValue().byteValue());

        List<PictureAttchment> pictureAttchmentList = pictureAttchmentMapper.selectByExample(pictureAttchmentExample);

        JSONObject jsonObject = (JSONObject) JSONObject.toJSON(dicProcessMode);
        jsonObject.put("images", pictureAttchmentList);
        resultDto.setData(jsonObject);
        return  resultDto;
    }

    /**
     * list
     * @return
     */
    public ResultDto list(Map<String,String> data) {
        ResultDto resultDto = new ResultDto();
        data.put("type", StoneEnums.PictureEnum.PROCESS_MODE.getValue().toString());
        //返回结果
        int pageIndex = NumberUtils.toInt(data.get("pageIndex"), 1);
        int pageSize = NumberUtils.toInt(data.get("pageSize"), 10);
        PageHelper.startPage(pageIndex,pageSize, true);
        PageList page = new PageList(cpDicProessModeExtMapper.extList(data));

        resultDto.setData(page);
        return resultDto;
    }


}