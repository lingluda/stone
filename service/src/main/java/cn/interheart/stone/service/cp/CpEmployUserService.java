package cn.interheart.stone.service.cp;

import cn.interheart.stone.common.utils.Md5Helper;
import cn.interheart.stone.dao.entity.*;
import cn.interheart.stone.dao.entity.extmapper.cp.CpEmployUserExtMapper;
import cn.interheart.stone.dao.entity.mapper.EmployUserMapper;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class CpEmployUserService {

    @Resource
    EmployUserMapper employUserMapper;

    @Resource
    CpEmployUserExtMapper cpEmployUserExtMapper;

    /**
     * insert
     * @return AjaxModel
     */
    public ResultDto insert(EmployUser employUser){
        ResultDto resultDto = new ResultDto();
        employUser.setGmtCreate(new Date());
        employUser.setPassword(Md5Helper.MD5(employUser.getPassword()));
        EmployUserExample employUserExample = new EmployUserExample();
        EmployUserExample.Criteria criteria = employUserExample.createCriteria();
        criteria.andAccountEqualTo(employUser.getAccount());
        List<EmployUser> employUserList = employUserMapper.selectByExample(employUserExample);
        if(employUserList.isEmpty()){
            employUserMapper.insertSelective(employUser);
        }else{
            resultDto.setCode("1");
            resultDto.setMsg("用户名不适用(重复)");
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

        int res =  employUserMapper.deleteByPrimaryKey(id);
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
    public ResultDto update(EmployUser employUser){
        ResultDto resultDto = new ResultDto();
        if(employUser.getId() == null){
            resultDto.setCode("1");
            resultDto.setMsg("参数Id 不能为空!");
            return resultDto;
        }

        if (StringUtils.isNotBlank(employUser.getPassword())){
            employUser.setPassword(Md5Helper.MD5(employUser.getPassword()));
        }
        int res =  employUserMapper.updateByPrimaryKeySelective(employUser);
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
        EmployUser employUser = employUserMapper.selectByPrimaryKey(id);
        resultDto.setData(employUser);
        return  resultDto;
    }

    /**
     * extInfo
     * @param id
     * @return
     */
    public ResultDto extInfo(Integer id){
        ResultDto resultDto = new ResultDto();
        if(id == null){
            resultDto.setCode("1");
            resultDto.setMsg("参数Id 不能为空!");
            return resultDto;
        }
        Map<String,String> employUser = cpEmployUserExtMapper.extInfo(id);
        resultDto.setData(employUser);
        return  resultDto;
    }
    /**
     * list
     * @return
     */
    public ResultDto list(Map<String,String> data) {
        ResultDto resultDto = new ResultDto();

        //查询条件
        EmployUserExample employUserExample = new EmployUserExample();
        EmployUserExample.Criteria criteria = employUserExample.createCriteria();

        //返回结果
        int pageIndex = NumberUtils.toInt(data.get("pageIndex"), 1);
        int pageSize = NumberUtils.toInt(data.get("pageSize"), 10);
        PageHelper.startPage(pageIndex,pageSize, true);
        PageList page = new PageList(employUserMapper.selectByExample(employUserExample));


        resultDto.setData(page);
        return resultDto;
    }

    /**
     * extList --公司后台--APP账号管理
     * @return
     */
    public ResultDto extList(Map<String,String> data) {
        ResultDto resultDto = new ResultDto();

        if(data.get("companyId") == null ){
            resultDto.setCode("1");
            resultDto.setMsg("companyId-不能为空!");
            return resultDto;
        }

        //返回结果
        int pageIndex = NumberUtils.toInt(data.get("pageIndex"), 1);
        int pageSize = NumberUtils.toInt(data.get("pageSize"), 10);
        PageHelper.startPage(pageIndex,pageSize, true);
        PageList page = new PageList(cpEmployUserExtMapper.extList(data));
        resultDto.setData(page);
        return resultDto;
    }

}