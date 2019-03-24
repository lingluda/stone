package cn.interheart.stone.service.cp;

import cn.interheart.stone.dao.entity.*;
import cn.interheart.stone.dao.entity.extmapper.cp.CpProductExtMapper;
import cn.interheart.stone.dao.entity.mapper.DicBaseMapper;
import cn.interheart.stone.dao.entity.mapper.ProductMapper;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Map;

@Service
public class CpProductService {

    @Resource
    ProductMapper productMapper;

    @Resource
    DicBaseMapper dicBaseMapper;

    @Resource
    CpProductExtMapper cpProductExtMapper;

    /**
     * insert
     * @return AjaxModel
     */
    public ResultDto insert(Product product){
        ResultDto resultDto = new ResultDto();
        product.setGmtCreate(new Date());
        int res = productMapper.insertSelective(product);
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

        int res =  productMapper.deleteByPrimaryKey(id);
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
    public ResultDto update(Product product){
        ResultDto resultDto = new ResultDto();
        if(product.getId() == null){
            resultDto.setCode("1");
            resultDto.setMsg("参数Id 不能为空!");
            return resultDto;
        }

        int res =  productMapper.updateByPrimaryKeySelective(product);
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
        Product product = productMapper.selectByPrimaryKey(id);
        resultDto.setData(product);
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

        PageList page = new PageList(cpProductExtMapper.extList(data));
        resultDto.setData(page);
        return resultDto;
    }

    /**
     * 基础数据列表
     * @return
     */
    public ResultDto dicBaseList(Map<String,String> data){
        ResultDto resultDto = new ResultDto();

        int code = NumberUtils.toInt(data.get("code"), -1);

        DicBaseExample dicBaseExample = new DicBaseExample();
        //查询条件
        DicBaseExample.Criteria criteria = dicBaseExample.createCriteria();
        criteria.andCodeEqualTo((byte)code);
        PageList page = new PageList(dicBaseMapper.selectByExample(dicBaseExample));
        //返回结果
        resultDto.setData(page);
        return resultDto;
    }
}