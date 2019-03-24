package cn.interheart.stone.service.sys;

import cn.interheart.stone.common.enums.StoneEnums;
import cn.interheart.stone.dao.entity.*;
import cn.interheart.stone.dao.entity.extmapper.sys.SysCompanyExtMapper;
import cn.interheart.stone.dao.entity.extmapper.sys.SysCompanyStoreExtMapper;
import cn.interheart.stone.dao.entity.mapper.CompanyMapper;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service
public class SysCompanyService {

    @Resource
    CompanyMapper companyMapper;

    @Resource
    SysCompanyExtMapper sysCompanyExtMapper;

    @Resource
    SysCompanyStoreExtMapper sysCompanyStoreExtMapper;



    /**
     * list
     * @return
     */
    public ResultDto list(Map<String,String> data) {
        ResultDto resultDto = new ResultDto();
        String name = data.get("name");
        //分页下标和偏移
        CompanyExample companyExample = new CompanyExample();
        //查询条件
        CompanyExample.Criteria criteria = companyExample.createCriteria();

        if(StringUtils.isNotBlank(name)){
            criteria.andNameLike("%" + name + "%");
        }

        String status = data.get("status");
        if(StringUtils.isNotBlank(status)){
            criteria.andStatusEqualTo(Byte.valueOf(data.get("status")));

            if(status.equals(StoneEnums.CompanyOrStoreStatusEnum.NOT_PASS.getValue().toString())){
                companyExample.setOrderByClause("gmt_modified desc");
            }

            if(status.equals(StoneEnums.CompanyOrStoreStatusEnum.PASS.getValue().toString())){
                companyExample.setOrderByClause("gmt_modified desc");
            }
        }



        //返回结果
        int pageIndex = NumberUtils.toInt(data.get("pageIndex"), 1);
        int pageSize = NumberUtils.toInt(data.get("pageSize"), 10);
        PageHelper.startPage(pageIndex,pageSize, true);
        PageList page = new PageList(companyMapper.selectByExample(companyExample));
        resultDto.setData(page);
        return resultDto;
    }


    /**
     * 统计公司门店数
     * @return
     */
    public ResultDto countCompanyStore(Map<String,String> data){
        ResultDto resultDto = new ResultDto();

        int pageIndex = NumberUtils.toInt(data.get("pageIndex"), 1);
        int pageSize = NumberUtils.toInt(data.get("pageSize"), 10);
        PageHelper.startPage(pageIndex,pageSize, true);
        PageList page = new PageList(sysCompanyExtMapper.countCompanyStroe(data));

        resultDto.setData(page);
        return resultDto;
    }

    /**
     * 公司门店列表
     * @return
     */
    public ResultDto companyStorelist(Map<String,String> data) {
        ResultDto resultDto = new ResultDto();

        int pageIndex = NumberUtils.toInt(data.get("pageIndex"), 1);
        int pageSize = NumberUtils.toInt(data.get("pageSize"), 10);
        PageHelper.startPage(pageIndex,pageSize, true);
        PageList page = new PageList(sysCompanyStoreExtMapper.companyStorelist(data));

        resultDto.setData(page);
        return resultDto;
    }


    /**
     * 公司审核
     * @return
     */
    public ResultDto companyAudit(Company company){
        ResultDto resultDto = new ResultDto();
        int res = companyMapper.updateByPrimaryKeySelective(company);
        if (res<=0){
            resultDto.setCode("1");
            resultDto.setMsg("审核失败!");
        }
        return resultDto;
    }

    /**
     * 公司禁用
     * @param company
     * @return
     */
    public ResultDto companyDisable(Company company){
        ResultDto resultDto = new ResultDto();
        int res = companyMapper.updateByPrimaryKeySelective(company);
        if (res<=0){
            resultDto.setCode("1");
            resultDto.setMsg("修改失败!");
        }
        return resultDto;
    }
}