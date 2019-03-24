package cn.interheart.stone.service.cp;

import cn.interheart.stone.dao.entity.*;
import cn.interheart.stone.dao.entity.mapper.ProjectFreightMapper;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang.math.NumberUtils;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.Date;
import java.util.Map;

@Service
public class CpProjectFreightService {

    @Resource
    ProjectFreightMapper projectFreightMapper;

    /**
     * insert
     * @return AjaxModel
     */
    public ResultDto insert(ProjectFreight projectFreight){
        ResultDto resultDto = new ResultDto();
        projectFreight.setGmtCreate(new Date());
        projectFreightMapper.insertSelective(projectFreight);
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

        projectFreightMapper.deleteByPrimaryKey(id);
        return resultDto;
    }

    /**
     * update
     * @return
     */
    public ResultDto update(ProjectFreight projectFreight){
        ResultDto resultDto = new ResultDto();
        if(projectFreight.getId() == null){
            resultDto.setCode("1");
            resultDto.setMsg("参数Id 不能为空!");
            return resultDto;
        }

        projectFreightMapper.updateByPrimaryKeySelective(projectFreight);
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
        ProjectFreight projectFreight = projectFreightMapper.selectByPrimaryKey(id);

        resultDto.setData(projectFreight);
        return  resultDto;
    }
    /**
     * list
     * @return
     */
    public ResultDto list(Map<String,String> data) {
        ResultDto resultDto = new ResultDto();
        //分页下标和偏移
        ProjectFreightExample projectFreightExample = new ProjectFreightExample();
        //查询条件
        ProjectFreightExample.Criteria criteria = projectFreightExample.createCriteria();

        int pageIndex = NumberUtils.toInt(data.get("pageIndex"), 1);
        int pageSize = NumberUtils.toInt(data.get("pageSize"), 10);
        PageHelper.startPage(pageIndex,pageSize, true);
        PageList page = new PageList(projectFreightMapper.selectByExample(projectFreightExample));
        resultDto.setData(page);
        return resultDto;
    }


}