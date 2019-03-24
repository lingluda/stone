package cn.interheart.stone.service.sys;

import cn.interheart.stone.common.enums.StoneEnums;
import cn.interheart.stone.common.utils.Md5Helper;
import cn.interheart.stone.dao.entity.*;

import cn.interheart.stone.dao.entity.extmapper.sys.SysUserExtMapper;
import cn.interheart.stone.dao.entity.mapper.SysUserMapper;
import cn.interheart.stone.dao.entity.mapper.SysUserRoleMapper;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class SysUserService {

    @Resource
    SysUserMapper sysUserMapper;
    @Resource
    SysUserExtMapper sysUserExtMapper;
    @Resource
    SysUserRoleMapper sysUserRoleMapper;

    /**
     * insert
     * @return AjaxModel
     */
    public ResultDto insert(SysUser sysUser, Integer roleId){
        ResultDto resultDto = new ResultDto();

        SysUserExample example = new SysUserExample();
        example.createCriteria().andAccountEqualTo(sysUser.getAccount());

        if(!this.sysUserMapper.selectByExample(example).isEmpty()){
            resultDto.setCode("1");
            resultDto.setMsg("账号不能重复!");
            return resultDto;
        }
        sysUser.setGmtCreate(new Date());
        sysUser.setPassword(Md5Helper.MD5(sysUser.getPassword()));
        sysUserMapper.insertSelective(sysUser);

        SysUserRole sysUserRole = new SysUserRole();
        sysUserRole.setSysUserId(sysUser.getId());
        sysUserRole.setSysRoleId(roleId);
        sysUserRole.setGmtCreate(new Date());
        sysUserRole.setGmtModified(new Date());
        sysUserRoleMapper.insert(sysUserRole);

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

        int res =  sysUserMapper.deleteByPrimaryKey(id);
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
    public ResultDto update(SysUser sysUser, Integer roleId){
        ResultDto resultDto = new ResultDto();
        if(sysUser.getId() == null){
            resultDto.setCode("1");
            resultDto.setMsg("参数Id 不能为空!");
            return resultDto;
        }
        //如果修改新密码不为空则重新加密新密码
        if(StringUtils.isNotBlank(sysUser.getPassword())){
            sysUser.setPassword(Md5Helper.MD5(sysUser.getPassword()));
        }

        sysUserMapper.updateByPrimaryKeySelective(sysUser);

        SysUserRoleExample sysUserRoleExample = new SysUserRoleExample();
        SysUserRoleExample.Criteria criteria = sysUserRoleExample.createCriteria();
        criteria.andSysUserIdEqualTo(sysUser.getId());
        List<SysUserRole> sysUserRoleList = sysUserRoleMapper.selectByExample(sysUserRoleExample);
        SysUserRole sysUserRole = new SysUserRole();
        if(sysUserRoleList.isEmpty()){
            sysUserRole.setSysRoleId(roleId);
            sysUserRole.setSysUserId(sysUser.getId());
            sysUserRole.setGmtCreate(new Date());
            sysUserRoleMapper.insert(sysUserRole);
        }else{
            sysUserRole = sysUserRoleList.get(0);
            sysUserRole.setSysRoleId(roleId);
            sysUserRole.setSysUserId(sysUser.getId());
            sysUserRole.setGmtModified(new Date());
            sysUserRoleMapper.updateByPrimaryKeySelective(sysUserRole);
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
        SysUser sysUser = sysUserMapper.selectByPrimaryKey(id);
        sysUser.setPassword("");

        SysUserRoleExample sysUserRoleExample = new SysUserRoleExample();
        SysUserRoleExample.Criteria criteria = sysUserRoleExample.createCriteria();
        criteria.andSysUserIdEqualTo(sysUser.getId());
        List<SysUserRole> sysUserRoleList = sysUserRoleMapper.selectByExample(sysUserRoleExample);
        SysUserRole sysUserRole = sysUserRoleList.get(0);

        JSONObject resObject = JSONObject.parseObject(JSONObject.toJSONString(sysUserRole));
        resObject.put("roleId", sysUserRole.getSysRoleId().intValue());
        resultDto.setData(resObject);
        return  resultDto;
    }


    /**
     * list
     * @return
     */
    public ResultDto extlist(Map<String,String> data) {
        ResultDto resultDto = new ResultDto();

        int pageIndex = NumberUtils.toInt(data.get("pageIndex"), 1);
        int pageSize = NumberUtils.toInt(data.get("pageSize"), 10);
        PageHelper.startPage(pageIndex,pageSize, true);
        PageList page = new PageList(sysUserExtMapper.extList(data));
        resultDto.setData(page);
       return resultDto;
    }

    /**
     * 禁用或启用账号
     * @param sysUser
     * @return
     */
    public ResultDto sysUserStatus(SysUser sysUser){
        ResultDto resultDto = new ResultDto();
        if(sysUser.getId() == null){
            resultDto.setCode("1");
            resultDto.setMsg("参数Id 不能为空!");
            return resultDto;
        }

        if(sysUser.getStatus() == null){
            resultDto.setCode("1");
            resultDto.setMsg("参数status 不能为空!");
            return resultDto;
        }

        int res =  sysUserMapper.updateByPrimaryKeySelective(sysUser);
        if(res <= 0){
            resultDto.setCode("1");
            resultDto.setMsg("更新失败!");
        }
        return resultDto;
    }

    /**
     * 登陆
     * @return
     */
    public ResultDto login(Map<String,String> data){
        ResultDto resultDto = new ResultDto();

        String account  = data.get("account");
        String password  = data.get("password");
        SysUserExample sysUserExample = new SysUserExample();
        SysUserExample.Criteria criteria =  sysUserExample.createCriteria();
        criteria.andAccountEqualTo(account);
        criteria.andPasswordEqualTo(Md5Helper.MD5(password));
        List<SysUser> sysUserList = sysUserMapper.selectByExample(sysUserExample);
        if(sysUserList.isEmpty()){
            resultDto.setCode("1");
            resultDto.setMsg("账号或密码错误!");
            return resultDto;
        }

        SysUser sysUser = sysUserList.get(0);

        if(sysUser.getStatus() == StoneEnums.EnableEnum.DISABLE.getValue().byteValue()){
            resultDto.setCode("1");
            resultDto.setMsg("账号已经禁用!");
            return resultDto;
        }
        sysUser.setPassword(null);
        resultDto.setData(sysUser);
        return resultDto;
    }
    /**
     * 获取保存登录用户cookie
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
        SysUser sysUser = this.sysUserMapper.selectByPrimaryKey(id);

        if(sysUser != null){

            if(StringUtils.equals(sysUser.getPassword(),Md5Helper.MD5(oldPassword))){
                sysUser.setPassword(Md5Helper.MD5(password));
                this.sysUserMapper.updateByPrimaryKeySelective(sysUser);
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