package cn.interheart.stone.service.cp;

import cn.interheart.stone.dao.entity.*;
import cn.interheart.stone.dao.entity.mapper.CompanyUserRoleMapper;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang.math.NumberUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class CpCompanyUserRoleService {

    @Resource
    CompanyUserRoleMapper companyUserRoleMapper;


    /**
     * insert
     *
     * @return AjaxModel
     */
    public ResultDto insert(CompanyUserRole companyUserRole) {
        ResultDto resultDto = new ResultDto();
        CompanyUserRoleExample companyUserRoleExample = new CompanyUserRoleExample();
        CompanyUserRoleExample.Criteria criteria = companyUserRoleExample.createCriteria();
        criteria.andCompanyUserIdEqualTo(companyUserRole.getCompanyUserId());
        companyUserRoleMapper.updateByExampleSelective(companyUserRole,companyUserRoleExample);
        return resultDto;
    }

    /**
     * del
     *
     * @return
     */
    public ResultDto del(Integer id) {
        ResultDto resultDto = new ResultDto();
        if (id == null) {
            resultDto.setCode("1");
            resultDto.setMsg("参数Id 不能为空!");
            return resultDto;
        }

        companyUserRoleMapper.deleteByPrimaryKey(id);
        return resultDto;
    }

    /**
     * update
     *
     * @return
     */
    public ResultDto update(CompanyUserRole companyUserRole) {
        ResultDto resultDto = new ResultDto();
        if (companyUserRole.getId() == null) {
            resultDto.setCode("1");
            resultDto.setMsg("参数Id 不能为空!");
            return resultDto;
        }

        companyUserRoleMapper.updateByPrimaryKeySelective(companyUserRole);
        return resultDto;
    }

    /**
     * info
     *
     * @param id
     * @return
     */
    public ResultDto info(Integer id) {
        ResultDto resultDto = new ResultDto();
        if (id == null) {
            resultDto.setCode("1");
            resultDto.setMsg("参数Id 不能为空!");
            return resultDto;
        }
        CompanyUserRole companyUserRole = companyUserRoleMapper.selectByPrimaryKey(id);
        resultDto.setData(companyUserRole);
        return resultDto;
    }

    /**
     * list
     *
     * @return
     */
    public ResultDto list(Map<String, String> data) {
        ResultDto resultDto = new ResultDto();

        CompanyUserRoleExample companyUserRoleExample = new CompanyUserRoleExample();
        CompanyUserRoleExample.Criteria criteria = companyUserRoleExample.createCriteria();

        //返回结果
        int pageIndex = NumberUtils.toInt(data.get("pageIndex"), 1);
        int pageSize = NumberUtils.toInt(data.get("pageSize"), 10);
        PageHelper.startPage(pageIndex, pageSize, true);
        PageList page = new PageList(companyUserRoleMapper.selectByExample(companyUserRoleExample));
        resultDto.setData(page);


        return resultDto;
    }


}