package cn.interheart.stone.service.cp;

import cn.interheart.stone.dao.entity.CompanyRole;
import cn.interheart.stone.dao.entity.CompanyRoleExample;
import cn.interheart.stone.dao.entity.PageList;
import cn.interheart.stone.dao.entity.ResultDto;
import cn.interheart.stone.dao.entity.mapper.CompanyRoleMapper;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang.math.NumberUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Map;

@Service
public class CpCompanyRoleService {

    @Resource
    CompanyRoleMapper companyRoleMapper;


    /**
     * insert
     * @return AjaxModel
     */
    public ResultDto insert(CompanyRole companyRole){
        ResultDto resultDto = new ResultDto();
        companyRole.setGmtCreate(new Date());
        int res = companyRoleMapper.insertSelective(companyRole);
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

        int res =  companyRoleMapper.deleteByPrimaryKey(id);
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
    public ResultDto update(CompanyRole companyRole){
        ResultDto resultDto = new ResultDto();
        if(companyRole.getId() == null){
            resultDto.setCode("1");
            resultDto.setMsg("参数Id 不能为空!");
            return resultDto;
        }

        int res =  companyRoleMapper.updateByPrimaryKeySelective(companyRole);
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
        CompanyRole companyRole = companyRoleMapper.selectByPrimaryKey(id);
        resultDto.setData(companyRole);
        return  resultDto;
    }
    /**
     * list
     * @return
     */
    public ResultDto list(Map<String,String> data) {
        ResultDto resultDto = new ResultDto();

        //分页下标和偏移
        CompanyRoleExample companyRoleExample = new CompanyRoleExample();
        CompanyRoleExample.Criteria criteria = companyRoleExample.createCriteria();
        criteria.andCompanyIdEqualTo(Integer.valueOf(data.get("companyId")));

        //返回结果
        int pageIndex = NumberUtils.toInt(data.get("pageIndex"), 1);
        int pageSize = NumberUtils.toInt(data.get("pageSize"), 10);
        PageHelper.startPage(pageIndex,pageSize, true);
        PageList page = new PageList(companyRoleMapper.selectByExample(companyRoleExample));

        resultDto.setData(page);
        return resultDto;
    }


}