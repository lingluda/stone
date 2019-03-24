package cn.interheart.stone.service.app;

import cn.interheart.stone.common.enums.StoneEnums;
import cn.interheart.stone.dao.entity.*;
import cn.interheart.stone.dao.entity.extmapper.app.AppMeasureDoorsillExtMapper;
import cn.interheart.stone.dao.entity.mapper.*;
import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang.math.NumberUtils;
import org.ehcache.core.spi.service.ServiceFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.SimpleFormatter;

/**
 * 量尺-门槛石
 */
@Service
public class AppMeasureDoorsillService {

    @Resource
    MeasureDoorsillMapper measureDoorsillMapper;
    @Resource
    PictureAttchmentMapper pictureAttchmentMapper;
    @Resource
    AppMeasureDoorsillExtMapper appMeasureDoorsillExtMapper;
    @Resource
    MeasureProgrammeMapper measureProgrammeMapper;
    @Resource
    MeasurePlateMapper measurePlateMapper;
    //数据字典
    @Resource
    DicBaseMapper dicBaseMapper;
    //品名
    @Resource
    ProductMapper productMapper;
    //加工说明
    @Resource
    DicProcessInstructionMapper dicProcessInstructionMapper;
    //加工方式
    @Resource
    DicProcessModeMapper dicProcessModeMapper;


    /**
     * 新增量尺-门槛石
     * @param measureDoorsill
     */
    public ResultDto insert(MeasureDoorsill measureDoorsill){

        ResultDto resultDto = new ResultDto();
        measureDoorsill.setGmtCreate(new Date());
        Product product = productMapper.selectByPrimaryKey(measureDoorsill.getProductId());
        DicBase dicBase = dicBaseMapper.selectByPrimaryKey(product.getDicTypeCode());

        //设置吊边数量
        if (measureDoorsill.getHangWearSide()==StoneEnums.DoorsillHangWearSideEnum.HANG_ONE.getValue().byteValue()||
                measureDoorsill.getHangWearSide()==StoneEnums.DoorsillHangWearSideEnum.HANG_ONE_WEAR_ONE.getValue().byteValue()
                ){
            measureDoorsill.setHangSideNumber(1);
            measureDoorsillMapper.insertSelective(measureDoorsill);
            //插入量尺板拆分数据
            MeasurePlate measurePlate = new MeasurePlate();
            measurePlate.setProjectId(measureDoorsill.getProjectId());
            measurePlate.setParentId(measureDoorsill.getId());
            measurePlate.setType(StoneEnums.MeasureTypeEnum.DOOR_SILL.getValue().byteValue());
            measurePlate.setArea(measureDoorsill.getDicBaseAreaContent());
            measurePlate.setProductName(product.getName());
            measurePlate.setProductType(dicBase.getContent());
            measurePlate.setLength(measureDoorsill.getLength().toString());
            measurePlate.setWindth(measureDoorsill.getHangSideWidth().toString());
            measurePlate.setHeight(measureDoorsill.getLeftWidth().toString());
            measurePlate.setNumber("1");
            measurePlate.setRemarks(measureDoorsill.getRemarks());
            measurePlateMapper.insertSelective(measurePlate);
            measurePlate.setWindth(measureDoorsill.getLeftWidth().toString());
            measurePlateMapper.insertSelective(measurePlate);
        }else if (measureDoorsill.getHangWearSide()==StoneEnums.DoorsillHangWearSideEnum.HANG_TWO.getValue().byteValue()
                ){
            measureDoorsill.setHangSideNumber(2);
            measureDoorsillMapper.insertSelective(measureDoorsill);
            //插入量尺板拆分数据
            MeasurePlate measurePlate = new MeasurePlate();
            measurePlate.setProjectId(measureDoorsill.getProjectId());
            measurePlate.setParentId(measureDoorsill.getId());
            measurePlate.setType(StoneEnums.MeasureTypeEnum.DOOR_SILL.getValue().byteValue());
            measurePlate.setArea(measureDoorsill.getDicBaseAreaContent());
            measurePlate.setProductName(product.getName());
            measurePlate.setProductType(dicBase.getContent());
            measurePlate.setLength(measureDoorsill.getLength().toString());
            measurePlate.setWindth(measureDoorsill.getHangSideWidth().toString());
            measurePlate.setHeight(measureDoorsill.getLeftWidth().toString());
            measurePlate.setNumber("2");
            measurePlate.setRemarks(measureDoorsill.getRemarks());
            measurePlateMapper.insertSelective(measurePlate);
            //插入量尺板拆分数据
            measurePlate.setWindth(measureDoorsill.getLeftWidth().toString());
            measurePlate.setNumber("1");
            measurePlateMapper.insertSelective(measurePlate);
        }else {
            measureDoorsillMapper.insertSelective(measureDoorsill);
            //插入量尺板拆分数据
            MeasurePlate measurePlate = new MeasurePlate();
            measurePlate.setProjectId(measureDoorsill.getProjectId());
            measurePlate.setParentId(measureDoorsill.getId());
            measurePlate.setType(StoneEnums.MeasureTypeEnum.DOOR_SILL.getValue().byteValue());
            measurePlate.setArea(measureDoorsill.getDicBaseAreaContent());
            measurePlate.setProductName(product.getName());
            measurePlate.setProductType(dicBase.getContent());
            measurePlate.setLength(measureDoorsill.getLength().toString());
            measurePlate.setWindth(measureDoorsill.getRightWidth().toString());
            measurePlate.setHeight(measureDoorsill.getLeftWidth().toString());
            measurePlate.setNumber("1");
            measurePlate.setRemarks(measureDoorsill.getRemarks());
            measurePlateMapper.insertSelective(measurePlate);
        }


//        // 绑定图片
//        for (Integer image : images) {
//            PictureAttchment pictureAttchment1 = pictureAttchmentMapper.selectByPrimaryKey(image);
//            pictureAttchment1.setParentId(measureDoorsill.getId());
//            pictureAttchment1.setType(StoneEnums.PictureEnum.MEASURE_DOORSILL.getValue().byteValue());
//            pictureAttchment1.setGmtModified(new Date());
//            pictureAttchmentMapper.updateByPrimaryKey(pictureAttchment1);
//        }

        return resultDto;
    }

    /**
     * info
     * @param id
     * @return
     */
    public ResultDto info(Integer id){
        ResultDto resultDto = new ResultDto();
        Map<String, String> stringStringMap = appMeasureDoorsillExtMapper.extInfo(id);

        //查询图片
        PictureAttchmentExample pictureAttchmentExample = new PictureAttchmentExample();
        PictureAttchmentExample.Criteria criteria = pictureAttchmentExample.createCriteria();
        criteria.andParentIdEqualTo(id);
        criteria.andTypeEqualTo(StoneEnums.PictureEnum.MEASURE_DOORSILL_PROGRAMME.getValue().byteValue());
        List<PictureAttchment> imageList = pictureAttchmentMapper.selectByExample(pictureAttchmentExample);

        JSONObject object = JSONObject.parseObject(JSON.toJSONStringWithDateFormat(stringStringMap, "yyyy-MM-dd"));
        object.put("imageList", imageList);
        resultDto.setData(object);
        return resultDto;
    }

    /**
     * uodate
     * @param measureDoorsill
     * @return
     */
    public ResultDto update(MeasureDoorsill measureDoorsill){
        ResultDto resultDto = new ResultDto();
        measureDoorsill.setGmtModified(new Date());

        MeasurePlateExample measurePlateExample = new MeasurePlateExample();
        MeasurePlateExample.Criteria criteria = measurePlateExample.createCriteria();
        criteria.andParentIdEqualTo(measureDoorsill.getId());
        criteria.andTypeEqualTo(StoneEnums.MeasureTypeEnum.DOOR_SILL.getValue().byteValue());
        List<MeasurePlate> measurePlates = measurePlateMapper.selectByExample(measurePlateExample);

        //拿到加工说明,加工方式,图片ID
        MeasurePlate measurePlateOld = measurePlates.get(0);
        //删除量尺板拆分数据
        measurePlateMapper.deleteByExample(measurePlateExample);

        //设置吊边数量
        if (measureDoorsill.getHangWearSide()==StoneEnums.DoorsillHangWearSideEnum.HANG_ONE.getValue().byteValue()||
                measureDoorsill.getHangWearSide()==StoneEnums.DoorsillHangWearSideEnum.HANG_ONE_WEAR_ONE.getValue().byteValue()
                ){
            measureDoorsill.setHangSideNumber(1);
            measureDoorsillMapper.updateByPrimaryKeySelective(measureDoorsill);
            Product product = productMapper.selectByPrimaryKey(measureDoorsill.getProductId());
            DicBase dicBase = dicBaseMapper.selectByPrimaryKey(product.getDicTypeCode());
            //插入量尺板拆分数据
            MeasurePlate measurePlateNew = new MeasurePlate();
            measurePlateNew.setProjectId(measureDoorsill.getProjectId());
            measurePlateNew.setParentId(measureDoorsill.getId());
            measurePlateNew.setType(StoneEnums.MeasureTypeEnum.DOOR_SILL.getValue().byteValue());
            measurePlateNew.setArea(measureDoorsill.getDicBaseAreaContent());
            measurePlateNew.setProductName(product.getName());
            measurePlateNew.setProductType(dicBase.getContent());
            measurePlateNew.setLength(measureDoorsill.getLength().toString());
            measurePlateNew.setWindth(measureDoorsill.getRightWidth().toString());
            measurePlateNew.setHeight(measureDoorsill.getLeftWidth().toString());
            measurePlateNew.setNumber("1");
            measurePlateNew.setRemarks(measureDoorsill.getRemarks());
            //存加工说明,加工方式,图片ID
            measurePlateNew.setProcessMode(measurePlateOld.getProcessMode());
            measurePlateNew.setProcessInstruction(measurePlateOld.getProcessInstruction());
            measurePlateNew.setImageId(measurePlateOld.getImageId());
            measurePlateMapper.insertSelective(measurePlateNew);

        }
        if (measureDoorsill.getHangWearSide()==StoneEnums.DoorsillHangWearSideEnum.HANG_TWO.getValue().byteValue()
                ){
            measureDoorsill.setHangSideNumber(2);

            measureDoorsillMapper.updateByPrimaryKeySelective(measureDoorsill);
            Product product = productMapper.selectByPrimaryKey(measureDoorsill.getProductId());
            DicBase dicBase = dicBaseMapper.selectByPrimaryKey(product.getDicTypeCode());
            //插入量尺板拆分数据
            MeasurePlate measurePlateNew = new MeasurePlate();
            measurePlateNew.setProjectId(measureDoorsill.getProjectId());
            measurePlateNew.setParentId(measureDoorsill.getId());
            measurePlateNew.setType(StoneEnums.MeasureTypeEnum.DOOR_SILL.getValue().byteValue());
            measurePlateNew.setArea(measureDoorsill.getDicBaseAreaContent());
            measurePlateNew.setProductName(product.getName());
            measurePlateNew.setProductType(dicBase.getContent());
            measurePlateNew.setLength(measureDoorsill.getLength().toString());
            measurePlateNew.setWindth(measureDoorsill.getRightWidth().toString());
            measurePlateNew.setHeight(measureDoorsill.getLeftWidth().toString());
            measurePlateNew.setNumber("2");
            measurePlateNew.setRemarks(measureDoorsill.getRemarks());
            //存加工说明,加工方式,图片ID
            measurePlateNew.setProcessMode(measurePlateOld.getProcessMode());
            measurePlateNew.setProcessInstruction(measurePlateOld.getProcessInstruction());
            measurePlateNew.setImageId(measurePlateOld.getImageId());
            measurePlateMapper.insertSelective(measurePlateNew);
        }
        measureDoorsillMapper.updateByPrimaryKeySelective(measureDoorsill);
        Product product = productMapper.selectByPrimaryKey(measureDoorsill.getProductId());
        DicBase dicBase = dicBaseMapper.selectByPrimaryKey(product.getDicTypeCode());
        //插入量尺板拆分数据
        MeasurePlate measurePlateNew = new MeasurePlate();
        measurePlateNew.setProjectId(measureDoorsill.getProjectId());
        measurePlateNew.setParentId(measureDoorsill.getId());
        measurePlateNew.setType(StoneEnums.MeasureTypeEnum.DOOR_SILL.getValue().byteValue());
        measurePlateNew.setArea(measureDoorsill.getDicBaseAreaContent());
        measurePlateNew.setProductName(product.getName());
        measurePlateNew.setProductType(dicBase.getContent());
        measurePlateNew.setLength(measureDoorsill.getLength().toString());
        measurePlateNew.setWindth(measureDoorsill.getRightWidth().toString());
        measurePlateNew.setHeight(measureDoorsill.getLeftWidth().toString());
        measurePlateNew.setNumber("1");
        measurePlateNew.setRemarks(measureDoorsill.getRemarks());
        //存加工说明,加工方式,图片ID
        measurePlateNew.setProcessMode(measurePlateOld.getProcessMode());
        measurePlateNew.setProcessInstruction(measurePlateOld.getProcessInstruction());
        measurePlateNew.setImageId(measurePlateOld.getImageId());
        measurePlateMapper.insertSelective(measurePlateNew);

//        // 绑定图片
//        for (Integer image : images) {
//            PictureAttchment pictureAttchment1 = pictureAttchmentMapper.selectByPrimaryKey(image);
//            pictureAttchment1.setParentId(measureDoorsill.getId());
//            pictureAttchment1.setType(StoneEnums.PictureEnum.MEASURE_DOORSILL.getValue().byteValue());
//            pictureAttchment1.setGmtModified(new Date());
//            pictureAttchmentMapper.updateByPrimaryKey(pictureAttchment1);
//        }
        return resultDto;
    }

    /**
     * list
     * @return
     */
    public ResultDto list(Map<String, String> data) {
        ResultDto resultDto = new ResultDto();
        MeasureDoorsillExample measureDoorsillExample = new MeasureDoorsillExample();
        MeasureDoorsillExample.Criteria criteria = measureDoorsillExample.createCriteria();
        criteria.andProjectIdEqualTo(Integer.valueOf(data.get("projectId")));
        List<MeasureDoorsill> measureDoorsillList = measureDoorsillMapper.selectByExample(measureDoorsillExample);

        JSONArray resArray = new JSONArray();
        for (MeasureDoorsill measureDoorsill : measureDoorsillList) {

            MeasurePlateExample measurePlateExample = new MeasurePlateExample();
            MeasurePlateExample.Criteria criteria1 = measurePlateExample.createCriteria();
            criteria1.andParentIdEqualTo(measureDoorsill.getId());
            criteria1.andTypeEqualTo(StoneEnums.MeasureTypeEnum.DOOR_SILL.getValue().byteValue());
            List<MeasurePlate> measurePlates = measurePlateMapper.selectByExample(measurePlateExample);

            String jsonStr = JSON.toJSONStringWithDateFormat(measureDoorsill,"yyyy-MM-dd");
            JSONObject jsonObj = JSONObject.parseObject(jsonStr);
            jsonObj.put("measurePlates",measurePlates);
            resArray.add(jsonObj);
        }
        resultDto.setData(resArray);
        return resultDto;
    }

    /**
     * 查询图片
     * @param id
     * @return
     */
    public ResultDto images(Integer id) {
        ResultDto resultDto = new ResultDto();
        PictureAttchmentExample pictureAttchmentExample = new PictureAttchmentExample();
        PictureAttchmentExample.Criteria criteria = pictureAttchmentExample.createCriteria();
        criteria.andParentIdEqualTo(id);
        criteria.andTypeEqualTo(StoneEnums.PictureEnum.MEASURE_DOORSILL_PROGRAMME.getValue().byteValue());
        List<PictureAttchment> pictureAttchments = pictureAttchmentMapper.selectByExample(pictureAttchmentExample);
        resultDto.setData(pictureAttchments);
        return resultDto;
    }

    /**
     * 新增/更新方案
     * @param measureProgramme
     * @param imageId
     * @return
     */
    public ResultDto updateProgramme(MeasureProgramme measureProgramme, Integer imageId){
        ResultDto resultDto = new ResultDto();
        //查询方案
        MeasureProgrammeExample measureProgrammeExample = new MeasureProgrammeExample();
        MeasureProgrammeExample.Criteria criteria = measureProgrammeExample.createCriteria();
        criteria.andParentIdEqualTo(measureProgramme.getParentId());
        List<MeasureProgramme> measureProgrammeList = measureProgrammeMapper.selectByExample(measureProgrammeExample);
        //如果方案为空
        if (measureProgrammeList.isEmpty()){
            measureProgramme.setGmtCreate(new Date());
            measureProgramme.setType(StoneEnums.MeasureTypeEnum.DOOR_SILL.getValue().byteValue());
            measureProgrammeMapper.insertSelective(measureProgramme);
                if (imageId!=null){
                    MeasureProgrammeExample measureProgrammeExample1 = new MeasureProgrammeExample();
                    MeasureProgrammeExample.Criteria criteria1 = measureProgrammeExample1.createCriteria();
                    criteria1.andParentIdEqualTo(measureProgramme.getParentId());
                    //拿到新增的方案ID,用来绑定方案图片
                    List<MeasureProgramme> measureProgrammes = measureProgrammeMapper.selectByExample(measureProgrammeExample1);

                    PictureAttchment pictureAttchment = pictureAttchmentMapper.selectByPrimaryKey(imageId);
                    pictureAttchment.setType(StoneEnums.PictureEnum.MEASURE_DOORSILL_PROGRAMME.getValue().byteValue());
                    pictureAttchment.setParentId(measureProgrammes.get(0).getId());
                    pictureAttchment.setGmtModified(new Date());
                    pictureAttchmentMapper.updateByPrimaryKeySelective(pictureAttchment);
                }
                //拿到量尺板拆分对象更新加工方式,加工说明,图片ID
                MeasurePlateExample measurePlateExample = new MeasurePlateExample();
                MeasurePlateExample.Criteria criteria2 = measurePlateExample.createCriteria();
                criteria2.andParentIdEqualTo(measureProgramme.getParentId());
                criteria2.andTypeEqualTo(StoneEnums.MeasureTypeEnum.DOOR_SILL.getValue().byteValue());
                List<MeasurePlate> measurePlates = measurePlateMapper.selectByExample(measurePlateExample);

                for (MeasurePlate measurePlate : measurePlates) {
                    measurePlate.setProcessMode(dicProcessModeMapper.selectByPrimaryKey(measureProgramme.getDicProcessModelId()).getName());
                    measurePlate.setProcessInstruction(dicProcessInstructionMapper.selectByPrimaryKey(measureProgramme.getDicProcessInstructionId()).getName());
                    if (imageId!=null) {
                        measurePlate.setImageId(imageId.toString());
                    }
                    measurePlateMapper.updateByPrimaryKeySelective(measurePlate);
            }

        }else {
            measureProgramme.setGmtModified(new Date());
            MeasureProgrammeExample measureProgrammeExample1 = new MeasureProgrammeExample();
            MeasureProgrammeExample.Criteria criteria1 = measureProgrammeExample1.createCriteria();
            criteria1.andParentIdEqualTo(measureProgramme.getParentId());
            measureProgrammeMapper.updateByExampleSelective(measureProgramme,measureProgrammeExample1);
            if (imageId!=null) {
                PictureAttchment pictureAttchment = pictureAttchmentMapper.selectByPrimaryKey(imageId);
                pictureAttchment.setType(StoneEnums.PictureEnum.MEASURE_DOORSILL_PROGRAMME.getValue().byteValue());
                pictureAttchment.setParentId(measureProgrammeList.get(0).getId());
                pictureAttchment.setGmtModified(new Date());
                pictureAttchmentMapper.updateByPrimaryKeySelective(pictureAttchment);
            }
            //拿到量尺板拆分对象更新加工方式,加工说明,图片ID
            MeasurePlateExample measurePlateExample = new MeasurePlateExample();
            MeasurePlateExample.Criteria criteria2 = measurePlateExample.createCriteria();
            criteria2.andParentIdEqualTo(measureProgramme.getParentId());
            criteria2.andTypeEqualTo(StoneEnums.MeasureTypeEnum.DOOR_SILL.getValue().byteValue());
            List<MeasurePlate> measurePlates = measurePlateMapper.selectByExample(measurePlateExample);

            for (MeasurePlate measurePlate : measurePlates) {
            measurePlate.setProcessMode(dicProcessModeMapper.selectByPrimaryKey(measureProgramme.getDicProcessModelId()).getName());
            measurePlate.setProcessInstruction(dicProcessInstructionMapper.selectByPrimaryKey(measureProgramme.getDicProcessInstructionId()).getName());
                if (imageId!=null) {
                    measurePlate.setImageId(imageId.toString());
                }
            measurePlateMapper.updateByPrimaryKeySelective(measurePlate);
            }
        }
        return resultDto;
    }


    /**
     * 方案详情
     * @param id
     * @return
     */
    public ResultDto extProgrammeInfo(Integer id){
        ResultDto resultDto = new ResultDto();
        //通过量尺ID拿到方案ID
        MeasureProgrammeExample measureProgrammeExample = new MeasureProgrammeExample();
        MeasureProgrammeExample.Criteria criteria = measureProgrammeExample.createCriteria();
        criteria.andParentIdEqualTo(id);
        List<MeasureProgramme> measureProgrammeList = measureProgrammeMapper.selectByExample(measureProgrammeExample);
        if (measureProgrammeList.isEmpty()){
            resultDto.setCode("1");
            resultDto.setMsg("该量尺还没有方案");
            return resultDto;
        }
        Map<String, String> stringStringMap = appMeasureDoorsillExtMapper.extProgrammeInfo(measureProgrammeList.get(0).getId());
        resultDto.setData(stringStringMap);
        return resultDto;
    }

}