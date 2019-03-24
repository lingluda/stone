package cn.interheart.stone.service.cp;

import cn.interheart.stone.dao.entity.DicProcessInstruction;
import cn.interheart.stone.dao.entity.DicProcessInstructionExample;
import cn.interheart.stone.dao.entity.PageList;
import cn.interheart.stone.dao.entity.ResultDto;
import cn.interheart.stone.dao.entity.mapper.DicProcessInstructionMapper;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Map;

@Service
public class CpDicProcessInstructionService {

    @Resource
    DicProcessInstructionMapper dicProcessInstructionMapper;


    /**
     * insert
     * @return AjaxModel
     */
    public ResultDto insert(DicProcessInstruction dicProcessInstruction){
        ResultDto resultDto = new ResultDto();
        dicProcessInstruction.setGmtCreate(new Date());
        int res = dicProcessInstructionMapper.insertSelective(dicProcessInstruction);
        if(res <= 0){
            resultDto.setCode("1");
            resultDto.setMsg("保存失败!");
        }
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

        int res =  dicProcessInstructionMapper.deleteByPrimaryKey(id);
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
    public ResultDto update(DicProcessInstruction dicProcessInstruction){
        ResultDto resultDto = new ResultDto();
        if(dicProcessInstruction.getId() == null){
            resultDto.setCode("1");
            resultDto.setMsg("参数Id 不能为空!");
            return resultDto;
        }

        int res =  dicProcessInstructionMapper.updateByPrimaryKeySelective(dicProcessInstruction);
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
        DicProcessInstruction dicProcessInstruction = dicProcessInstructionMapper.selectByPrimaryKey(id);
        resultDto.setData(dicProcessInstruction);
        return  resultDto;
    }
    /**
     * list
     * @return
     */
    public ResultDto list(Map<String,String> data) {
        ResultDto resultDto = new ResultDto();

        int companyId = Integer.valueOf(data.get("companyId"));
        String name = data.get("name");

        DicProcessInstructionExample dicProcessInstructionExample = new DicProcessInstructionExample();
        //查询条件AND
        DicProcessInstructionExample.Criteria criteria = dicProcessInstructionExample.createCriteria();
        //查询条件OR
        DicProcessInstructionExample.Criteria orCriteria = dicProcessInstructionExample.or();

        if(companyId > 0 ){
            criteria.andCompanyIdEqualTo(0);
            orCriteria.andCompanyIdEqualTo(companyId);
        }

        if(StringUtils.isNotBlank(name)){
            criteria.andNameLike("%" + name + "%");
            orCriteria.andNameLike("%" + name + "%");
        }

        //返回结果
        int pageIndex = NumberUtils.toInt(data.get("pageIndex"), 1);
        int pageSize = NumberUtils.toInt(data.get("pageSize"), 10);
        PageHelper.startPage(pageIndex,pageSize, true);
        PageList page = new PageList(dicProcessInstructionMapper.selectByExample(dicProcessInstructionExample));

        resultDto.setData(page);
        return resultDto;
    }


}