package cn.interheart.stone.service.sys;

import cn.interheart.stone.common.utils.Md5Helper;
import cn.interheart.stone.dao.entity.CompanyUser;
import cn.interheart.stone.dao.entity.CompanyUserExample;
import cn.interheart.stone.dao.entity.DicBaseExample;
import cn.interheart.stone.dao.entity.ResultDto;
import cn.interheart.stone.dao.entity.mapper.CompanyUserMapper;
import cn.interheart.stone.service.sys.interfaces.SysCompanyUserInter;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Map;
@Service
public class SysCompanyUserService implements SysCompanyUserInter{
    @Resource
    CompanyUserMapper companyUserMapper;

    /**
     * 插入公司管理账号
     * @param companyUser
     * @return
     */
    @Override
    public ResultDto add(CompanyUser companyUser) {
        ResultDto resultDto = new ResultDto();
        companyUser.setGmtCreate(new Date());

        companyUser.setType((byte)0);
        companyUser.setPassword(Md5Helper.MD5(companyUser.getPassword()));
        if (companyUser.getCompanyId() ==null){
            resultDto.setCode("1");
            resultDto.setMsg("传入的公司ID不能为空！");
            return resultDto;
        }

        CompanyUserExample companyUserExample = new CompanyUserExample();
        CompanyUserExample.Criteria criteria = companyUserExample.createCriteria();
        CompanyUserExample.Criteria or = companyUserExample.or();
        criteria.andCompanyIdEqualTo(companyUser.getCompanyId());
        or.andAccountEqualTo(companyUser.getAccount());

        if(companyUserMapper.selectByExample(companyUserExample).size()!=0){
            resultDto.setCode("1");
            resultDto.setMsg("账号重复");
        }else {
            companyUserMapper.insertSelective(companyUser);
        }
        return resultDto;
    }

    @Override
    public ResultDto update(CompanyUser companyUser) {
        ResultDto resultDto = new ResultDto();
        companyUser.setGmtModified(new Date());
        companyUser.setType((byte)1);
        companyUserMapper.updateByPrimaryKeySelective(companyUser);
        return resultDto;
    }

    @Override
    public ResultDto del(Integer id) {
        ResultDto resultDto = new ResultDto();
        if (id == null){
            resultDto.setCode("1");
            resultDto.setMsg("传入的id不能为空！");
        }
        companyUserMapper.deleteByPrimaryKey(id);
        return resultDto;
    }

    @Override
    public ResultDto find(Map<String, String> data) {
        ResultDto resultDto = new ResultDto();

        return null;
    }
}
