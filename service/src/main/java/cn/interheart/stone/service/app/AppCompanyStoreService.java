package cn.interheart.stone.service.app;

import cn.interheart.stone.common.enums.StoneEnums;
import cn.interheart.stone.dao.entity.*;
import cn.interheart.stone.dao.entity.mapper.CompanyStoreMapper;
import cn.interheart.stone.dao.entity.mapper.PictureAttchmentMapper;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class AppCompanyStoreService {
    @Resource
    CompanyStoreMapper mapper;
    @Resource
    PictureAttchmentMapper pictureAttchmentMapper;
    /**
     * 保存门店草稿
     * @param companyStore
     * @return
     */
    public ResultDto saveDraft(CompanyStore companyStore,JSONArray picArray) {
        ResultDto resultDto = new ResultDto();
        companyStore.setGmtCreate(new Date());
        companyStore.setStatus(StoneEnums.CompanyOrStoreStatusEnum.DRAFT.getValue().byteValue());
        mapper.insertSelective(companyStore);
        saveImage(companyStore.getId(),picArray);
        return resultDto;
    }
    /**
     * 更新门店草稿
     * @param companyStore
     * @return
     */
    public ResultDto editDraft(CompanyStore companyStore,JSONArray picArray) {
        ResultDto resultDto = new ResultDto();
        companyStore.setGmtCreate(new Date());
        companyStore.setStatus(StoneEnums.CompanyOrStoreStatusEnum.DRAFT.getValue().byteValue());
        if (companyStore.getId() != null) {
            mapper.updateByPrimaryKeySelective(companyStore);
        }else {
            resultDto.setCode("1");
        resultDto.setMsg("保存失败!");
        }
        saveImage(companyStore.getId(),picArray);
        return resultDto;
    }
    /**
     * 提交门店审核
     * @param companyStore
     * @return
     */
    public ResultDto saveCheck(CompanyStore companyStore,JSONArray picArray) {
        ResultDto resultDto = new ResultDto();
        companyStore.setGmtCreate(new Date());
        companyStore.setStatus(StoneEnums.CompanyOrStoreStatusEnum.UNAUDITED.getValue().byteValue());
        if (companyStore.getId()==null) {
            mapper.insertSelective(companyStore);
        }else {
            mapper.updateByPrimaryKeySelective(companyStore);
        }
        saveImage(companyStore.getId(),picArray);
        return resultDto;
    }

    /**
     * 更新门店审核
     * @param companyStore
     * @return
     */
    public ResultDto editCheck(CompanyStore companyStore,JSONArray picArray) {
        ResultDto resultDto = new ResultDto();
        companyStore.setGmtCreate(new Date());
        companyStore.setStatus(StoneEnums.CompanyOrStoreStatusEnum.UNAUDITED.getValue().byteValue());
        if (companyStore.getId() ==null) {
            mapper.insertSelective(companyStore);
        }else {
            mapper.updateByPrimaryKeySelective(companyStore);
        }
        saveImage(companyStore.getId(),picArray);
        return resultDto;
    }
    /**
     * 删除门店
     * @param id
     * @return
     */
    public ResultDto del(Integer id) {
        ResultDto resultDto = new ResultDto();
        if (id == null) {
            resultDto.setCode("1");
            resultDto.setMsg("Id不能为空！");
            return resultDto;
        }
        int res = mapper.deleteByPrimaryKey(id);
        if (res <= 0) {
            resultDto.setCode("1");
            resultDto.setMsg("更新失败！");
        }
        return resultDto;
    }

    /**
     * 更新门店
     * @param companyStore
     * @return
     */
    public ResultDto edit(CompanyStore companyStore) {
        ResultDto resultDto = new ResultDto();
        if (companyStore.getId() == null) {
            resultDto.setCode("1");
            resultDto.setMsg("Id不能为空！");
            return resultDto;
        }
        int res = mapper.updateByPrimaryKeySelective(companyStore);
        if (res <= 0) {
            resultDto.setCode("1");
            resultDto.setMsg("更新失败！");
        }
        return resultDto;
    }

    /**
     * 门店列表
     * @param data
     * @return
     */
    public ResultDto list(Map<String, String> data) {
        ResultDto resultDto = new ResultDto();
        CompanyStoreExample companyStoreExample = new CompanyStoreExample();
        CompanyStoreExample.Criteria criteria = companyStoreExample.createCriteria();
        criteria.andStatusEqualTo(NumberUtils.toByte(data.get("status"), (byte)-1));
        criteria.andCompanyIdEqualTo(NumberUtils.toInt(data.get("companyId"), -1));
        companyStoreExample.setOrderByClause("gmt_modified desc");

        int PageIndex = NumberUtils.toInt(data.get("pageIndex"), 1);
        int PageSize = NumberUtils.toInt(data.get("pageSize"), 10);
        PageHelper.startPage(PageIndex, PageSize, true);
        PageList page = new PageList(mapper.selectByExample(companyStoreExample));
        resultDto.setData(page);
        return resultDto;
    }

    /**
     * 门店详情
     * @param id
     * @return
     */
    public ResultDto info(Integer id) {
        ResultDto resultDto = new ResultDto();
        if (id == null) {
            resultDto.setCode("1");
            resultDto.setMsg("参数Id 不能为空!");
            return resultDto;
        }
        CompanyStore companyStore = mapper.selectByPrimaryKey(id);
        //门店图片
        PictureAttchmentExample example1 = new PictureAttchmentExample();
        PictureAttchmentExample.Criteria criteria1 = example1.createCriteria();
        criteria1.andParentIdEqualTo(companyStore.getId());
        criteria1.andTypeEqualTo(StoneEnums.PictureEnum.COMPANY_STORE_IMAGE.getValue().byteValue());
        List<PictureAttchment> companyimageList = pictureAttchmentMapper.selectByExample(example1);
        //企业资料
        PictureAttchmentExample example2 = new PictureAttchmentExample();
        PictureAttchmentExample.Criteria criteria2 = example2.createCriteria();
        criteria2.andParentIdEqualTo(companyStore.getId());
        criteria2.andTypeEqualTo(StoneEnums.PictureEnum.COMPANY_STORE_DATA.getValue().byteValue());
        List<PictureAttchment> companydataList = pictureAttchmentMapper.selectByExample(example2);
        //合作合同
        PictureAttchmentExample example3 = new PictureAttchmentExample();
        PictureAttchmentExample.Criteria criteria3 = example3.createCriteria();
        criteria3.andParentIdEqualTo(companyStore.getId());
        criteria3.andTypeEqualTo(StoneEnums.PictureEnum.COMPANY_STORE_CONTRACT.getValue().byteValue());
        List<PictureAttchment> contractList = pictureAttchmentMapper.selectByExample(example3);
        //集合
        JSONObject jsonObject = (JSONObject) JSONObject.toJSON(companyStore);
        jsonObject.put("companyimageList",companyimageList);
        jsonObject.put("companydataList",companydataList);
        jsonObject.put("contractList",contractList);
        resultDto.setData(jsonObject);
        return resultDto;
    }

    public void saveImage(Integer companyId, JSONArray picArray){

        picArray.stream().forEach(o -> {
            JSONObject img = (JSONObject)o;

            PictureAttchment pictureAttchment = new PictureAttchment();
            pictureAttchment.setType(Byte.valueOf(img.get("type").toString()));

            JSONArray imagesId = img.getJSONArray("id");
            imagesId.stream().forEach(id ->{
                pictureAttchment.setId((int)id);
                pictureAttchment.setParentId(companyId);
                pictureAttchmentMapper.updateByPrimaryKeySelective(pictureAttchment);
            });
        });
    }
}
