package cn.interheart.stone.service.sys;

import cn.interheart.stone.dao.entity.DicBase;
import cn.interheart.stone.dao.entity.DicBaseExample;
import cn.interheart.stone.dao.entity.PageList;
import cn.interheart.stone.dao.entity.ResultDto;
import cn.interheart.stone.dao.entity.mapper.DicBaseMapper;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang.math.NumberUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Map;

@Service
public class SysDicBaseService {

    @Resource
    DicBaseMapper dicBaseMapper;



    /**
     * insert
     * @return AjaxModel
     */
    public ResultDto insert(DicBase dicBase){
        ResultDto resultDto = new ResultDto();
        dicBase.setGmtCreate(new Date());
        int res = dicBaseMapper.insertSelective(dicBase);
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

        int res =  dicBaseMapper.deleteByPrimaryKey(id);
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
    public ResultDto update(DicBase dicBase){
        ResultDto resultDto = new ResultDto();
        if(dicBase.getId() == null){
            resultDto.setCode("1");
            resultDto.setMsg("参数Id 不能为空!");
            return resultDto;
        }

        int res =  dicBaseMapper.updateByPrimaryKeySelective(dicBase);
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
        DicBase dicBase = dicBaseMapper.selectByPrimaryKey(id);
        resultDto.setData(dicBase);
        return  resultDto;
    }
    /**
     * list
     * @return
     */
    public ResultDto list(Map<String, String> data) {
        ResultDto resultDto = new ResultDto();

        int code = NumberUtils.toInt(data.get("code"), -1);

        DicBaseExample dicBaseExample = new DicBaseExample();
        //查询条件
        DicBaseExample.Criteria criteria = dicBaseExample.createCriteria();
        criteria.andCodeEqualTo((byte)code);

        //返回结果
        int pageIndex = NumberUtils.toInt(data.get("pageIndex"), 1);
        int pageSize = NumberUtils.toInt(data.get("pageSize"), 10);
        PageHelper.startPage(pageIndex,pageSize, true);
        PageList page = new PageList(dicBaseMapper.selectByExample(dicBaseExample));
        resultDto.setData(page);
        return resultDto;
    }


}