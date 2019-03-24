package cn.interheart.stone.service.cp;

import cn.interheart.stone.common.enums.StoneEnums;
import cn.interheart.stone.dao.entity.*;
import cn.interheart.stone.dao.entity.extmapper.cp.CpEmployInfoExtMapper;
import cn.interheart.stone.dao.entity.mapper.EmployInfoMapper;
import cn.interheart.stone.dao.entity.mapper.PictureAttchmentMapper;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang.math.NumberUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class CpEmployInfoService {

    @Resource
    EmployInfoMapper employInfoMapper;

    @Resource
    CpEmployInfoExtMapper cpEmployInfoExtMapper;

    @Resource
    PictureAttchmentMapper pictureAttchmentMapper;

    /**
     * insert
     * @return AjaxModel
     */
    public ResultDto insert(EmployInfo employInfo, List<PictureAttchment> pictureAttchmentList){
        ResultDto resultDto = new ResultDto();

        employInfo.setGmtCreate(new Date());
        employInfoMapper.insertSelective(employInfo);

        pictureAttchmentList.stream().forEach(pictureAttchment -> {
            pictureAttchment.setParentId(employInfo.getId());
            pictureAttchmentMapper.updateByPrimaryKeySelective(pictureAttchment);
        });

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

        employInfoMapper.deleteByPrimaryKey(id);

        PictureAttchmentExample pictureAttchmentExample = new PictureAttchmentExample();
        PictureAttchmentExample.Criteria criteria = pictureAttchmentExample.createCriteria();
        PictureAttchmentExample.Criteria orCriteria = pictureAttchmentExample.or();
        //拼接WHERE
        criteria.andParentIdEqualTo(id);
        criteria.andTypeEqualTo(StoneEnums.PictureEnum.STAFF_PHOTO.getValue().byteValue());
        criteria.andTypeEqualTo(StoneEnums.PictureEnum.IDCARD_PHOTO.getValue().byteValue());
        //拼接OR
        orCriteria.andParentIdEqualTo(id);
        orCriteria.andTypeEqualTo(StoneEnums.PictureEnum.STAFF_PHOTO.getValue().byteValue());
        orCriteria.andTypeEqualTo(StoneEnums.PictureEnum.IDCARD_PHOTO.getValue().byteValue());

        pictureAttchmentMapper.deleteByExample(pictureAttchmentExample);

        return resultDto;
    }

    /**
     * update
     * @return
     */
    public ResultDto update(EmployInfo employInfo){
        ResultDto resultDto = new ResultDto();
        if(employInfo.getId() == null){
            resultDto.setCode("1");
            resultDto.setMsg("参数Id 不能为空!");
            return resultDto;
        }

        int res =  employInfoMapper.updateByPrimaryKeySelective(employInfo);
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
        EmployInfo employInfo = employInfoMapper.selectByPrimaryKey(id);

        //员工照片
        PictureAttchmentExample staffPhotoExample = new PictureAttchmentExample();
        PictureAttchmentExample.Criteria staffPhotoCriteria = staffPhotoExample.createCriteria();
        staffPhotoCriteria.andParentIdEqualTo(employInfo.getId());
        staffPhotoCriteria.andTypeEqualTo(StoneEnums.PictureEnum.STAFF_PHOTO.getValue().byteValue());
        List<PictureAttchment> staffPhototList = pictureAttchmentMapper.selectByExample(staffPhotoExample);

        //员工身份证照片
        PictureAttchmentExample idcardPhotoExample = new PictureAttchmentExample();
        PictureAttchmentExample.Criteria idcardPhotoCriteria = idcardPhotoExample.createCriteria();
        idcardPhotoCriteria.andParentIdEqualTo(employInfo.getId());
        idcardPhotoCriteria.andTypeEqualTo(StoneEnums.PictureEnum.IDCARD_PHOTO.getValue().byteValue());
        List<PictureAttchment> idcardPhotoList = pictureAttchmentMapper.selectByExample(idcardPhotoExample);

        JSONObject jsonObject = (JSONObject) JSONObject.toJSON(employInfo);
        jsonObject.put("staffPhoto", staffPhototList);
        jsonObject.put("idcardPhoto", idcardPhotoList);

        resultDto.setData(jsonObject);
        return  resultDto;
    }

    /**
     *  员工列表
     * @return
     */
    public ResultDto list(Map<String,String> data){
        ResultDto resultDto = new ResultDto();
        //返回结果
        int pageIndex = NumberUtils.toInt(data.get("pageIndex"), 1);
        int pageSize = NumberUtils.toInt(data.get("pageSize"), 10);
        PageHelper.startPage(pageIndex,pageSize, true);
        PageList page = new PageList(cpEmployInfoExtMapper.selectEmployeeInformation(data));
        resultDto.setData(page);
        return resultDto;
    }

    /**
     * 员工离职
     * @param employInfo
     * @return
     */
    public ResultDto quit(EmployInfo employInfo){
        ResultDto resultDto = new ResultDto();
        employInfoMapper.updateByPrimaryKeySelective(employInfo);
        return resultDto;
    }
}