package cn.interheart.stone.service.sys;

import cn.interheart.stone.common.enums.StoneEnums;
import cn.interheart.stone.dao.entity.*;
import cn.interheart.stone.dao.entity.extmapper.sys.SysDicProessModeExtMapper;
import cn.interheart.stone.dao.entity.mapper.DicProcessModeMapper;
import cn.interheart.stone.dao.entity.mapper.PictureAttchmentMapper;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang.math.NumberUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Map;

@Service
public class SysDicProcessModeService {

    @Resource
    DicProcessModeMapper dicProcessModeMapper;

    @Resource
    PictureAttchmentMapper pictureAttchmentMapper;

    @Resource
    SysDicProessModeExtMapper sysDicProessModeExtMapper;

    /**
     * insert
     * @return AjaxModel
     */
    public ResultDto insert(DicProcessMode dicProcessMode, Integer imageId){
        ResultDto resultDto = new ResultDto();
        dicProcessMode.setGmtCreate(new Date());
        dicProcessModeMapper.insertSelective(dicProcessMode);
        PictureAttchment pictureAttchment = pictureAttchmentMapper.selectByPrimaryKey(imageId);
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

        int res =  dicProcessModeMapper.deleteByPrimaryKey(id);
        if(res <= 0){
            resultDto.setCode("1");
            resultDto.setMsg("删除失败!");
        }
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

        int res =  dicProcessModeMapper.updateByPrimaryKeySelective(dicProcessMode);
        if(res <= 0){
            resultDto.setCode("1");
            resultDto.setMsg("更新失败!");
        }
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
        resultDto.setData(dicProcessMode);
        return  resultDto;
    }
    /**
     * list
     * @return
     */
    public ResultDto list(Map<String, String> data) {
        ResultDto resultDto = new ResultDto();

        data.put("type", StoneEnums.PictureEnum.PROCESS_MODE.getValue().toString());
        //返回结果
        int pageIndex = NumberUtils.toInt(data.get("pageIndex"), 1);
        int pageSize = NumberUtils.toInt(data.get("pageSize"), 10);
        PageHelper.startPage(pageIndex,pageSize, true);
        PageList page = new PageList(sysDicProessModeExtMapper.extList(data));

        resultDto.setData(page);
        return resultDto;
    }


}