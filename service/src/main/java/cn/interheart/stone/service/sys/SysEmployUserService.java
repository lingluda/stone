package cn.interheart.stone.service.sys;

import cn.interheart.stone.common.enums.StoneEnums;
import cn.interheart.stone.common.utils.Md5Helper;
import cn.interheart.stone.common.utils.StrUtil;
import cn.interheart.stone.dao.entity.EmployUser;
import cn.interheart.stone.dao.entity.EmployUserExample;
import cn.interheart.stone.dao.entity.PageList;
import cn.interheart.stone.dao.entity.ResultDto;
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
public class SysEmployUserService {
    @Resource
    EmployUserMapper employUserMapper;

    /**
     * 推广人员账号列表
     * @param data
     * @return
     */
    public ResultDto spreadList(Map<String,String> data) {
        ResultDto resultDto = new ResultDto();
        EmployUserExample employUserExample = new EmployUserExample();
        EmployUserExample.Criteria criteria = employUserExample.createCriteria();
        criteria.andUserTypeEqualTo(StoneEnums.AppUserTypeEnum.SPREAD.getValue().byteValue());
        int pageIndex = NumberUtils.toInt(data.get("pageIndex"), 1);
        int pageSize = NumberUtils.toInt(data.get("pageSize"), 10);
        PageHelper.startPage(pageIndex,pageSize, true);
        PageList page = new PageList(employUserMapper.selectByExample(employUserExample));
        resultDto.setData(page);
        return resultDto;
    }

    /**
     * 插入推广人员账号
     * @param employUser
     * @return
     */
    public ResultDto insertSpread(EmployUser employUser){
        ResultDto resultDto = new ResultDto();

        EmployUserExample employUserExample = new EmployUserExample();
        employUserExample.createCriteria().andAccountEqualTo(employUser.getAccount());
        List<EmployUser> employUserList = employUserMapper.selectByExample(employUserExample);

        if (employUserList.isEmpty()) {
            employUser.setGmtCreate(new Date());
            employUser.setUserType(StoneEnums.AppUserTypeEnum.SPREAD.getValue().byteValue());
            employUser.setPassword(Md5Helper.MD5(employUser.getPassword()));
            employUserMapper.insertSelective(employUser);
        }else{
            resultDto.setCode("1");
            resultDto.setMsg("账号重复");
        }
        return  resultDto;
    }
    /**
     * 更新推广人员账号
     * @param employUser
     * @return
     */

    public ResultDto updateSpread(EmployUser employUser) {
        ResultDto resultDto = new ResultDto();
        employUser.setGmtModified(new Date());
        employUser.setUserType(StoneEnums.AppUserTypeEnum.SPREAD.getValue().byteValue());
        //如果修改新密码不为空则重新加密新密码
        if(StringUtils.isNotBlank(employUser.getPassword())){
            employUser.setPassword(Md5Helper.MD5(employUser.getPassword()));
        }
        employUserMapper.updateByPrimaryKeySelective(employUser);
        return  resultDto;
    }

    /**
     * 删除推广人员
     * @param id
     * @return
     */
    public ResultDto delSpread(Integer id){
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
        return  resultDto;
    }

    /**
     * 根据companyId 和 userType查询人员列表
     * @param data
     * @return
     */
    public ResultDto getLcUserList(Map<String,String> data){
        ResultDto resultDto = new ResultDto();
        if (StrUtil.notNullOrEmpty(data.get("companyId"))){
            List<Map> list = employUserMapper.getLcUserList(data);
            resultDto.setData(list);
        }else{
            resultDto.setCode(StoneEnums.AjaxBackStatus.AJAX_FAIL.getValue());
            resultDto.setMsg("companyId不能为空");
        }
        return resultDto;
    }
}
