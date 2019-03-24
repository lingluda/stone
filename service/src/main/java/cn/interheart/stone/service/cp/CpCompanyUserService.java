package cn.interheart.stone.service.cp;

import cn.interheart.stone.common.enums.StoneEnums;
import cn.interheart.stone.common.utils.Md5Helper;
import cn.interheart.stone.dao.entity.*;
import cn.interheart.stone.dao.entity.extmapper.cp.CpCompanyUserExtMapper;
import cn.interheart.stone.dao.entity.mapper.CompanyMapper;
import cn.interheart.stone.dao.entity.mapper.CompanyUserMapper;
import cn.interheart.stone.dao.entity.mapper.EmployInfoMapper;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CpCompanyUserService {

    @Resource
    CompanyUserMapper companyUserMapper;

    @Resource
    CpCompanyUserExtMapper cpCompanyUserExtMapper;

    @Resource
    CompanyMapper companyMapper;

    @Resource
    EmployInfoMapper employInfoMapper;

    /**
     * insert
     * @return AjaxModel
     */
    public ResultDto insert(CompanyUser companyUser){
        ResultDto resultDto = new ResultDto();
        companyUser.setGmtCreate(new Date());
        companyUser.setPassword(Md5Helper.MD5(companyUser.getPassword()));
        companyUser.setType(StoneEnums.CompanyUserTypeEnum.ORDINARY.getValue().byteValue());
        int res = companyUserMapper.insertSelective(companyUser);
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

        int res =  companyUserMapper.deleteByPrimaryKey(id);
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
    public ResultDto update(CompanyUser companyUser){
        ResultDto resultDto = new ResultDto();
        if(companyUser.getId() == null){
            resultDto.setCode("1");
            resultDto.setMsg("参数Id 不能为空!");
            return resultDto;
        }

        int res =  companyUserMapper.updateByPrimaryKeySelective(companyUser);
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
        CompanyUser companyUser = companyUserMapper.selectByPrimaryKey(id);
        resultDto.setData(companyUser);
        return  resultDto;
    }


    /**
     * extList后台账号管理
     * @return
     */
    public ResultDto extList(Map<String,String> data) {
        ResultDto resultDto = new ResultDto();

        if(data.get("companyId") == null ){
            resultDto.setCode("1");
            resultDto.setMsg("companyId-不能为空!");
            return resultDto;
        }

        int pageIndex = NumberUtils.toInt(data.get("pageIndex"), 1);
        int pageSize = NumberUtils.toInt(data.get("pageSize"), 10);
        PageHelper.startPage(pageIndex,pageSize, true);
        PageList page = new PageList(cpCompanyUserExtMapper.extList(data));

        resultDto.setData(page);
        return resultDto;
    }


    /**
     * 公司后台登录
     * @param
     * @return
     */
    public ResultDto login(Map<String, String> data) {
        ResultDto resultDto  = new ResultDto();

        String account  = data.get("account");
        String password  = data.get("password");

        CompanyUserExample companyUserExample = new CompanyUserExample();
        CompanyUserExample.Criteria criteria = companyUserExample.createCriteria();
        criteria.andAccountEqualTo(account);
        criteria.andPasswordEqualTo(Md5Helper.MD5(password));
        List<CompanyUser> companyUserList = companyUserMapper.selectByExample(companyUserExample);
        if(companyUserList.isEmpty()){
            resultDto.setCode("1");
            resultDto.setMsg("账号或密码错误!");
            return resultDto;
        }

        CompanyUser companyUser = companyUserList.get(0);
        if(companyUser.getStatus() == StoneEnums.EnableEnum.DISABLE.getValue().byteValue()){
            resultDto.setCode("1");
            resultDto.setMsg("账号已经禁用!");
            return resultDto;
        }
        Company company = companyMapper.selectByPrimaryKey(companyUser.getCompanyId());

        EmployInfo employInfo = employInfoMapper.selectByPrimaryKey(companyUser.getEmployInfoId());

        Map resMap = new HashMap();
        resMap.put("companyUser", companyUser);
        resMap.put("company", company);
        if (employInfo != null) {
            resMap.put("companyUserName", employInfo.getName());
        }

        resultDto.setData(resMap);
        return resultDto;
    }

    /**
     * 获取保存登录用户cookie
     * @param
     */
    public String  getUserToken(){
        String userToken = RandomStringUtils.randomAlphanumeric(32);
        return userToken;
    }
    /**
     * 修改密码
     * @param data
     * @return
     */
    public ResultDto editPassword(Map<String, String> data) {
        ResultDto resultDto  = new ResultDto();

        int id = NumberUtils.toInt(data.get("id"));
        String password = data.get("password");
        String oldPassword = data.get("oldPassword");
        CompanyUser companyUser = this.companyUserMapper.selectByPrimaryKey(id);
        if(companyUser != null){

            if(StringUtils.equals(companyUser.getPassword(),Md5Helper.MD5(oldPassword))){
                companyUser.setPassword(Md5Helper.MD5(password));
                this.companyUserMapper.updateByPrimaryKeySelective(companyUser);
            }else{
                resultDto.setCode("1");
                resultDto.setMsg("原密码不正确!");
            }
        }else{
            resultDto.setCode("1");
            resultDto.setMsg("修改失败!");
        }

        return resultDto;
    }
}