package cn.interheart.stone.service.app;

import cn.interheart.stone.common.enums.StoneEnums;
import cn.interheart.stone.dao.entity.*;
import cn.interheart.stone.dao.entity.mapper.CompanyMapper;
import cn.interheart.stone.dao.entity.mapper.PictureAttchmentMapper;
import cn.interheart.stone.service.app.vo.AppCompanyVo;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class AppCompanyService {

    @Resource
    CompanyMapper companyMapper;

    @Resource
    PictureAttchmentMapper pictureAttchmentMapper;
    /**
     * list
     * @return
     */
    public ResultDto list(Map<String,String> data) {
        ResultDto resultDto = new ResultDto();
        //分页下标和偏移
        CompanyExample companyExample = new CompanyExample();
        //查询条件
        CompanyExample.Criteria criteria = companyExample.createCriteria();

        if (data.get("status") != null) {

            criteria.andStatusEqualTo(Byte.valueOf(data.get("status")));
        }

        criteria.andEmployUserIdEqualTo(NumberUtils.toInt(data.get("userId"), -1));
        companyExample.setOrderByClause("gmt_modified desc");

        //返回结果
        int pageIndex = NumberUtils.toInt(data.get("pageIndex"), 1);
        int pageSize = NumberUtils.toInt(data.get("pageSize"), 10);
        PageHelper.startPage(pageIndex,pageSize, true);
        PageList page = new PageList(companyMapper.selectByExample(companyExample));
        List<Company> rescompanylist = page.getRows();
        List<AppCompanyVo> resCompanyVoList = new ArrayList<AppCompanyVo>();
        for (Company company : rescompanylist) {
            AppCompanyVo appCompanyVo = new AppCompanyVo();
            BeanUtils.copyProperties(company, appCompanyVo);
            resCompanyVoList.add(appCompanyVo);
        }
        page.setRows(resCompanyVoList);
        resultDto.setData(page);
        return resultDto;
    }
    /**
     * 保存草稿
     * @return ResultDto
     */
    public ResultDto saveDraft(Company company, JSONArray picArray){
        ResultDto resultDto = new ResultDto();
        company.setGmtCreate(new Date());
        company.setGmtModified(new Date());
        company.setStatus(StoneEnums.CompanyOrStoreStatusEnum.DRAFT.getValue().byteValue());
        companyMapper.insertSelective(company);

        saveImage(company.getId(), picArray);
        return  resultDto;
    }

    /**
     * 修改草稿
     * @return ResultDto
     */
    public ResultDto editDraft(Company company, JSONArray picArray){
        ResultDto resultDto = new ResultDto();
        if(company.getId() == null){
            resultDto.setCode("1");
            resultDto.setMsg("id不能为空!");
            return resultDto;
        }

        if(company.getStatus() != StoneEnums.CompanyOrStoreStatusEnum.DRAFT.getValue().byteValue()){
            resultDto.setCode("1");
            resultDto.setMsg("已提交的无法修改!");
            return  resultDto;
        }
        company.setGmtModified(new Date());
        companyMapper.updateByPrimaryKeySelective(company);
        saveImage(company.getId(), picArray);
        return  resultDto;
    }
    /**
     * 提交审核
     * @return AjaxModel
     */
    public ResultDto sendAudit(Company company, JSONArray picArray){
        ResultDto resultDto = new ResultDto();
        company.setGmtCreate(new Date());
        company.setGmtModified(new Date());
        company.setStatus(StoneEnums.CompanyOrStoreStatusEnum.UNAUDITED.getValue().byteValue());
        companyMapper.insertSelective(company);
        saveImage(company.getId(), picArray);
        return  resultDto;
    }

    /**
     * 更新审核
     * @return AjaxModel
     */
    public ResultDto editAudit(Company company, JSONArray picArray){
        ResultDto resultDto = new ResultDto();

        if(company.getId() == null){
            resultDto.setCode("1");
            resultDto.setMsg("id不能为空!");
            return resultDto;
        }

        if(company.getStatus() == StoneEnums.CompanyOrStoreStatusEnum.NOT_PASS.getValue().byteValue()
                || company.getStatus() ==  StoneEnums.CompanyOrStoreStatusEnum.DRAFT.getValue().byteValue()){
            company.setGmtModified(new Date());
            company.setStatus(StoneEnums.CompanyOrStoreStatusEnum.UNAUDITED.getValue().byteValue());
            companyMapper.updateByPrimaryKeySelective(company);

        }else{
            resultDto.setCode("1");
            resultDto.setMsg("当前状态不允许提交审核!");
        }
        saveImage(company.getId(), picArray);
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
        Company company = companyMapper.selectByPrimaryKey(id);

        //公司图片
        PictureAttchmentExample example1 = new PictureAttchmentExample();
        PictureAttchmentExample.Criteria criteria1 = example1.createCriteria();
        criteria1.andParentIdEqualTo(company.getId());
        criteria1.andTypeEqualTo(StoneEnums.PictureEnum.COMPANY_IMAGE.getValue().byteValue());
        List<PictureAttchment> companyimageList = pictureAttchmentMapper.selectByExample(example1);

        //公司资料
        PictureAttchmentExample example2 = new PictureAttchmentExample();
        PictureAttchmentExample.Criteria criteria2 = example2.createCriteria();
        criteria2.andParentIdEqualTo(company.getId());
        criteria2.andTypeEqualTo(StoneEnums.PictureEnum.COMPANY_DATA.getValue().byteValue());
        List<PictureAttchment> companydataList = pictureAttchmentMapper.selectByExample(example2);


        //合作合同
        PictureAttchmentExample example3 = new PictureAttchmentExample();
        PictureAttchmentExample.Criteria criteria3 = example3.createCriteria();
        criteria3.andParentIdEqualTo(company.getId());
        criteria3.andTypeEqualTo(StoneEnums.PictureEnum.COMPANY_CONTRACT.getValue().byteValue());
        List<PictureAttchment> contractList = pictureAttchmentMapper.selectByExample(example3);

        JSONObject jsonObject = (JSONObject) JSONObject.toJSON(company);
        jsonObject.put("companyimageList", companyimageList);
        jsonObject.put("companydataList", companydataList);
        jsonObject.put("contractList", contractList);

        resultDto.setData(jsonObject);
        return  resultDto;
    }

    /**
     * 保存公司图片
     */
    public void saveImage(Integer companyId, JSONArray picArray) {
        if (picArray != null && !picArray.isEmpty()  ) {
            picArray.stream().forEach(o -> {
                JSONObject img = (JSONObject) o;
                PictureAttchment pictureAttchment = new PictureAttchment();
                pictureAttchment.setType(Byte.valueOf(img.get("type").toString()));

                JSONArray imagesId = img.getJSONArray("id");
                imagesId.stream().forEach(id -> {
                    pictureAttchment.setId((int) id);
                    pictureAttchment.setParentId(companyId);
                    pictureAttchmentMapper.updateByPrimaryKeySelective(pictureAttchment);
                });
            });
     }
    }
}