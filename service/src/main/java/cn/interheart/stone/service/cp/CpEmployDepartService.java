package cn.interheart.stone.service.cp;

import cn.interheart.stone.dao.entity.*;
import cn.interheart.stone.dao.entity.mapper.EmployDepartMapper;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang.math.NumberUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Map;

@Service
public class CpEmployDepartService {

    @Resource
    EmployDepartMapper employDepartMapper;



    /**
     * insert
     * @return AjaxModel
     */
    public ResultDto insert(EmployDepart employDepart){
        ResultDto resultDto = new ResultDto();
        employDepart.setGmtCreate(new Date());
        int res = employDepartMapper.insertSelective(employDepart);
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

        int res =  employDepartMapper.deleteByPrimaryKey(id);
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
    public ResultDto update(EmployDepart employDepart){
        ResultDto resultDto = new ResultDto();
        if(employDepart.getId() == null){
            resultDto.setCode("1");
            resultDto.setMsg("参数Id 不能为空!");
            return resultDto;
        }

        int res =  employDepartMapper.updateByPrimaryKeySelective(employDepart);
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
        EmployDepart employDepart = employDepartMapper.selectByPrimaryKey(id);
        resultDto.setData(employDepart);
        return  resultDto;
    }
    /**
     * list
     * @return
     */
    public ResultDto list(Map<String,String> data) {
        ResultDto resultDto = new ResultDto();

        //分页下标和偏移
        EmployDepartExample employDepartExample = new EmployDepartExample();
        //查询条件AND
        EmployDepartExample.Criteria criteria = employDepartExample.createCriteria();
        //查询条件OR
        EmployDepartExample.Criteria orCriteria = employDepartExample.or();
        criteria.andCompanyIdEqualTo((byte) 0);
        orCriteria.andCompanyIdEqualTo(Byte.valueOf(data.get("companyId")));

        //返回结果
        int pageIndex = NumberUtils.toInt(data.get("pageIndex"), 1);
        int pageSize = NumberUtils.toInt(data.get("pageSize"), 10);
        PageHelper.startPage(pageIndex,pageSize, true);
        PageList page = new PageList(employDepartMapper.selectByExample(employDepartExample));
        resultDto.setData(page);

        return resultDto;
    }


}