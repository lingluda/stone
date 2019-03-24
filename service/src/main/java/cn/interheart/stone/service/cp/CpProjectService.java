package cn.interheart.stone.service.cp;

import cn.interheart.stone.dao.entity.*;
import cn.interheart.stone.dao.entity.extmapper.cp.CpProjectExtMapper;
import cn.interheart.stone.dao.entity.extmapper.cp.CpProjectProductExtMapper;
import cn.interheart.stone.dao.entity.mapper.ProjectMapper;
import cn.interheart.stone.dao.entity.mapper.ProjectProductMapper;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang.math.NumberUtils;
import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

@Service
public class CpProjectService {

    @Resource
    ProjectMapper projectMapper;

    @Resource
    CpProjectExtMapper cpProjectExtMapper;

    @Resource
    CpProjectProductExtMapper cpProjectProductExtMapper;

    @Resource
    ProjectProductMapper projectProductMapper;
    /**
     * insert
     * @return AjaxModel
     */
    public ResultDto insert(Project project){
        ResultDto resultDto = new ResultDto();
        project.setGmtCreate(new Date());
        int res = projectMapper.insertSelective(project);
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

        int res =  projectMapper.deleteByPrimaryKey(id);
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
    public ResultDto update(Project project, List<Integer> projectProductList){
        ResultDto resultDto = new ResultDto();
        if(project.getId() == null){
            resultDto.setCode("1");
            resultDto.setMsg("参数Id 不能为空!");
            return resultDto;
        }

        int res =  projectMapper.updateByPrimaryKeySelective(project);
        projectMapper.updateByPrimaryKeySelective(project);

        ProjectProductExample projectProductExample = new ProjectProductExample();
        projectProductExample.createCriteria().andProjectIdEqualTo(project.getId());
        projectProductMapper.deleteByExample(projectProductExample);
        for (Integer id : projectProductList) {
            ProjectProduct projectProduct = new ProjectProduct();
            projectProduct.setProjectId(project.getId());
            projectProduct.setProductId(id);
            projectProduct.setGmtCreate(new Date());
            projectProductMapper.insert(projectProduct);
        }
        return  resultDto;
    }
    /**
     * info
     * @param id
     * @return
     */
    public ResultDto customerInfo(Integer id){
        ResultDto resultDto = new ResultDto();
        if(id == null){
            resultDto.setCode("1");
            resultDto.setMsg("参数Id 不能为空!");
            return resultDto;
        }

        Project project = projectMapper.selectByPrimaryKey(id);
        List<Map<String, String>> projectProductList = cpProjectProductExtMapper.findProjectProduct(project.getId());

        Map res = new HashMap();
        res.put("project", project);

        if(projectProductList.isEmpty()){
            res.put("projectProductList", new ArrayList<>());
        }else{
            res.put("projectProductList", projectProductList);
        }
        resultDto.setData(res);
        return  resultDto;
    }
    /**
     * list
     * @return
     */
    public ResultDto list(Map<String,String> data) {
        ResultDto resultDto = new ResultDto();


        //返回结果
        int pageIndex = NumberUtils.toInt(data.get("pageIndex"), 1);
        int pageSize = NumberUtils.toInt(data.get("pageSize"), 10);
        PageHelper.startPage(pageIndex,pageSize, true);
        PageList page = new PageList(cpProjectExtMapper.extList(data));
        resultDto.setData(page);
        return resultDto;
    }


}