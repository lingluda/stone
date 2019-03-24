package cn.interheart.stone.service.cp;

import cn.interheart.stone.common.enums.StoneEnums;
import cn.interheart.stone.dao.entity.CompanyStore;
import cn.interheart.stone.dao.entity.CompanyStoreExample;
import cn.interheart.stone.dao.entity.PageList;
import cn.interheart.stone.dao.entity.ResultDto;
import cn.interheart.stone.dao.entity.mapper.CompanyStoreMapper;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Map;

@Service
public class CpCompanyStoreService {

    @Resource
    CompanyStoreMapper companyStoreMapper;


    /**
     * insert
     * @return AjaxModel
     */
    public ResultDto insert(CompanyStore companyStore){
        ResultDto resultDto = new ResultDto();
        companyStore.setGmtCreate(new Date());
        int res = companyStoreMapper.insertSelective(companyStore);
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

        int res =  companyStoreMapper.deleteByPrimaryKey(id);
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
    public ResultDto update(CompanyStore companyStore){
        ResultDto resultDto = new ResultDto();
        if(companyStore.getId() == null){
            resultDto.setCode("1");
            resultDto.setMsg("参数Id 不能为空!");
            return resultDto;
        }

        int res =  companyStoreMapper.updateByPrimaryKeySelective(companyStore);
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
        CompanyStore companyStore = companyStoreMapper.selectByPrimaryKey(id);
        resultDto.setData(companyStore);
        return  resultDto;
    }
    /**
     * list
     * @return
     */
    public ResultDto list(Map<String,String> data) {
        ResultDto resultDto = new ResultDto();

        //分页下标和偏移
        CompanyStoreExample companyStoreExample = new CompanyStoreExample();
        //查询条件
        CompanyStoreExample.Criteria criteria = companyStoreExample.createCriteria();
        criteria.andCompanyIdEqualTo(NumberUtils.toInt(data.get("companyId"), -1));

        String status = data.get("status");
        String name = data.get("name");
        if(StringUtils.isNotBlank(status)){
            criteria.andStatusEqualTo(Byte.valueOf(status));
            if(status.equals(StoneEnums.CompanyOrStoreStatusEnum.NOT_PASS.getValue().toString())){
                companyStoreExample.setOrderByClause("gmt_modified desc");
            }

            if(status.equals(StoneEnums.CompanyOrStoreStatusEnum.PASS.getValue().toString())){
                companyStoreExample.setOrderByClause("gmt_modified desc");
            }
        }

        if(StringUtils.isNotBlank(name)){
            criteria.andNameLike("%" + name + "%");
        }
        //返回结果
        int pageIndex = NumberUtils.toInt(data.get("pageIndex"), 1);
        int pageSize = NumberUtils.toInt(data.get("pageSize"), 10);
        PageHelper.startPage(pageIndex,pageSize, true);
        PageList page = new PageList(companyStoreMapper.selectByExample(companyStoreExample));

        resultDto.setData(page);
        return resultDto;
    }

    /**
     * 公司门店审核
     * @param companyStore
     * @return
     */
    public ResultDto companyStoreAudit(CompanyStore companyStore) {
        ResultDto resultDto = new ResultDto();
        companyStoreMapper.updateByPrimaryKeySelective(companyStore);
        return resultDto;
    }
}