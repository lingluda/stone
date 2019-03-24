package cn.interheart.stone.service.sys;

import cn.interheart.stone.dao.entity.*;
import cn.interheart.stone.dao.entity.mapper.SysUserRoleMapper;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class SysUserRoleService {

    @Resource
    SysUserRoleMapper sysUserRoleMapper;



    /**
     * insert
     * @return AjaxModel
     */
    public ResultDto  insert(SysUserRole sysUserRole){


        ResultDto resultDto = new ResultDto();
        SysUserRoleExample sysUserRoleExample = new SysUserRoleExample();
        SysUserRoleExample.Criteria criteria = sysUserRoleExample.createCriteria();
        criteria.andSysUserIdEqualTo(sysUserRole.getSysUserId());
        List<SysUserRole> sysUserRoleList = sysUserRoleMapper.selectByExample(sysUserRoleExample);

        if (sysUserRoleList.isEmpty()){
            sysUserRoleMapper.insertSelective(sysUserRole);
        }else {
            SysUserRole userRole = sysUserRoleList.get(0);
            userRole.setSysRoleId(sysUserRole.getSysRoleId());
            sysUserRoleMapper.updateByPrimaryKeySelective(userRole);
        }

        return resultDto;
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

        sysUserRoleMapper.deleteByPrimaryKey(id);
        return resultDto;
    }

    /**
     * update
     * @return
     */
    public ResultDto update(SysUserRole sysUserRole){
        ResultDto resultDto = new ResultDto();
        if(sysUserRole.getId() == null){
            resultDto.setCode("1");
            resultDto.setMsg("参数Id 不能为空!");
            return resultDto;
        }

        sysUserRoleMapper.updateByPrimaryKeySelective(sysUserRole);
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
        SysUserRole sysUserRole = sysUserRoleMapper.selectByPrimaryKey(id);
        resultDto.setData(sysUserRole);
        return  resultDto;
    }
    /**
     * list
     * @return
     */
    public ResultDto list(Map<String,String> data) {
        ResultDto resultDto = new ResultDto();

        //分页下标和偏移
        SysUserRoleExample sysUserRoleExample = new SysUserRoleExample();

        //查询条件
        SysUserRoleExample.Criteria criteria = sysUserRoleExample.createCriteria();

        //返回结果
        int pageIndex = NumberUtils.toInt(data.get("pageIndex"), 1);
        int pageSize = NumberUtils.toInt(data.get("pageSize"), 10);
        PageHelper.startPage(pageIndex,pageSize, true);
        PageList page = new PageList(sysUserRoleMapper.selectByExample(sysUserRoleExample));

        resultDto.setData(page);
        return resultDto;
    }

    /**
     * 平台系统- 用户角色
     * @return
     */
    public ResultDto userRoleList(SysUserRole sysUserRole){
        ResultDto resultDto = new ResultDto();
        SysUserRoleExample sysUserRoleExample = new SysUserRoleExample();
        sysUserRoleExample.createCriteria().andSysUserIdEqualTo(sysUserRole.getSysUserId());
        resultDto.setData(sysUserRoleMapper.selectByExample(sysUserRoleExample));
        return resultDto;
    }
}