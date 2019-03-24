package cn.interheart.stone.service.cp;

import cn.interheart.stone.dao.entity.PageList;
import cn.interheart.stone.dao.entity.ProjectProduct;
import cn.interheart.stone.dao.entity.ProjectProductExample;
import cn.interheart.stone.dao.entity.ResultDto;
import cn.interheart.stone.dao.entity.mapper.ProjectProductMapper;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang.math.NumberUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Map;

@Service
public class CpProjectProductService {

    @Resource
    ProjectProductMapper projectProductMapper;



    /**
     * insert
     * @return AjaxModel
     */
    public ResultDto insert(ProjectProduct projectProduct){
        ResultDto resultDto = new ResultDto();
        projectProduct.setGmtCreate(new Date());
        int res = projectProductMapper.insertSelective(projectProduct);
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

        int res =  projectProductMapper.deleteByPrimaryKey(id);
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
    public ResultDto update(ProjectProduct projectProduct){
        ResultDto resultDto = new ResultDto();
        if(projectProduct.getId() == null){
            resultDto.setCode("1");
            resultDto.setMsg("参数Id 不能为空!");
            return resultDto;
        }

        int res =  projectProductMapper.updateByPrimaryKeySelective(projectProduct);
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
        ProjectProduct projectProduct = projectProductMapper.selectByPrimaryKey(id);
        resultDto.setData(projectProduct);
        return  resultDto;
    }
    /**
     * list
     * @return
     */
    public ResultDto list(Map<String,String> data) {
        ResultDto resultDto = new ResultDto();


        //分页下标和偏移
        ProjectProductExample projectProductExample = new ProjectProductExample();
        //查询条件
        ProjectProductExample.Criteria criteria = projectProductExample.createCriteria();

        //返回结果
        int pageIndex = NumberUtils.toInt(data.get("pageIndex"), 1);
        int pageSize = NumberUtils.toInt(data.get("pageSize"), 10);
        PageHelper.startPage(pageIndex,pageSize, true);
        PageList page = new PageList(projectProductMapper.selectByExample(projectProductExample));
        resultDto.setData(page);
        return resultDto;
    }


}