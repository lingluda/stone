package cn.interheart.stone.service.app;

import cn.interheart.stone.common.enums.StoneEnums;
import cn.interheart.stone.common.utils.Md5Helper;
import cn.interheart.stone.dao.entity.*;
import cn.interheart.stone.dao.entity.mapper.CompanyMapper;
import cn.interheart.stone.dao.entity.mapper.EmployInfoMapper;
import cn.interheart.stone.dao.entity.mapper.EmployUserMapper;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AppEmployUserService {

    @Resource
    EmployUserMapper employUserMapper;

    @Resource
    CompanyMapper companyMapper;

    @Resource
    EmployInfoMapper employInfoMapper;

    /**
     * 公司后台登录
     * @param
     * @return
     */
    public ResultDto login(Map<String, String> data) {
        ResultDto resultDto  = new ResultDto();

        String account  = data.get("account");
        String password  = data.get("password");
        if(StringUtils.isBlank(account) || StringUtils.isBlank(password)){
            resultDto.setCode("1");
            resultDto.setMsg("账号密码不能为空!");
            return resultDto;
        }

        EmployUserExample employUserExample = new EmployUserExample();
        EmployUserExample.Criteria criteria = employUserExample.createCriteria();
        criteria.andAccountEqualTo(account);
        criteria.andPasswordEqualTo(Md5Helper.MD5(password));
        List<EmployUser> employUserList = employUserMapper.selectByExample(employUserExample);
        if(employUserList.isEmpty()){
            resultDto.setCode("1");
            resultDto.setMsg("账号或密码错误!");
            return resultDto;
        }

        EmployUser employUser = employUserList.get(0);
        if(employUser.getStatus() == StoneEnums.EnableEnum.DISABLE.getValue().byteValue()){
            resultDto.setCode("1");
            resultDto.setMsg("账号已经禁用!");
            return resultDto;
        }

        JSONObject resObject = new JSONObject();
        if(employUser.getUserType() != StoneEnums.AppUserTypeEnum.SPREAD.getValue().byteValue()){
            Company company = companyMapper.selectByPrimaryKey(employUser.getCompanyId());
            EmployInfo employInfo = employInfoMapper.selectByPrimaryKey(employUser.getEmployInfoId());
            resObject.put("companyId", company.getId());
            resObject.put("employUserName", employInfo.getName());
        }

        resObject.put("employUser", employUser);
        resObject.put("userType", employUser.getUserType());
        resultDto.setData(resObject);
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
        EmployUser employUser = this.employUserMapper.selectByPrimaryKey(id);
        if(employUser != null){

            if(StringUtils.equals(employUser.getPassword(), Md5Helper.MD5(oldPassword))){
                employUser.setPassword(Md5Helper.MD5(password));
                this.employUserMapper.updateByPrimaryKeySelective(employUser);
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

    /**
     * @author SHI_KAI
     * @date 2018/4/23 17:27
     * @description APP用户详情
     * @param
     * @return 
     */
    public ResultDto info(Integer id){
        ResultDto resultDto  = new ResultDto();
        if(id == null){
            resultDto.setCode("1");
            resultDto.setMsg("参数错误!");
            return resultDto;
        }
        EmployUser employUser = employUserMapper.selectByPrimaryKey(id);

        if(employUser == null){
            resultDto.setCode("1");
            resultDto.setMsg("参数错误!");
            return resultDto;
        }

        EmployInfo employInfo = employInfoMapper.selectByPrimaryKey(employUser.getEmployInfoId());

        if(employInfo == null){
            String resJsonStr = JSON.toJSONString(employUser, SerializerFeature.WriteDateUseDateFormat);
            JSONObject resObject = JSONObject.parseObject(resJsonStr);
            resultDto.setData(resObject);
            return resultDto;
        }
        String resJsonStr = JSON.toJSONString(employInfo, SerializerFeature.WriteDateUseDateFormat);
        JSONObject resObject = JSONObject.parseObject(resJsonStr);
        resObject.put("userType", employUser.getUserType());
        resultDto.setData(resObject);
        return resultDto;
    }

}