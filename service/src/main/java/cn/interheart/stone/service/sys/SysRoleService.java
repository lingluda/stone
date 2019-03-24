package cn.interheart.stone.service.sys;

import cn.interheart.stone.dao.entity.PageList;
import cn.interheart.stone.dao.entity.ResultDto;
import cn.interheart.stone.dao.entity.SysRole;
import cn.interheart.stone.dao.entity.SysRoleExample;
import cn.interheart.stone.dao.entity.mapper.SysRoleMapper;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang.math.NumberUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Map;

@Service
public class SysRoleService {

    @Resource
    SysRoleMapper sysRoleMapper;



    /**
     * insert
     * @return AjaxModel
     */
    public ResultDto insert(SysRole sysRole){
        ResultDto resultDto = new ResultDto();
        sysRole.setGmtCreate(new Date());
        int res = sysRoleMapper.insertSelective(sysRole);
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

        int res =  sysRoleMapper.deleteByPrimaryKey(id);
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
    public ResultDto update(SysRole sysRole){
        ResultDto resultDto = new ResultDto();
        if(sysRole.getId() == null){
            resultDto.setCode("1");
            resultDto.setMsg("参数Id 不能为空!");
            return resultDto;
        }

        int res =  sysRoleMapper.updateByPrimaryKeySelective(sysRole);
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
        SysRole sysRole = sysRoleMapper.selectByPrimaryKey(id);
        resultDto.setData(sysRole);
        return  resultDto;
    }
    /**
     * list
     * @return
     */
    public ResultDto list(Map<String,String> data) {
        ResultDto resultDto = new ResultDto();



        //分页下标和偏移
        SysRoleExample sysRoleExample = new SysRoleExample();
        //查询条件
        SysRoleExample.Criteria criteria = sysRoleExample.createCriteria();

        //返回结果
        int pageIndex = NumberUtils.toInt(data.get("pageIndex"), 1);
        int pageSize = NumberUtils.toInt(data.get("pageSize"), 10);
        PageHelper.startPage(pageIndex,pageSize, true);
        PageList page = new PageList(sysRoleMapper.selectByExample(sysRoleExample));
        resultDto.setData(page);
        return resultDto;
    }


}