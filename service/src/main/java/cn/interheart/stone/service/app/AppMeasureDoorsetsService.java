package cn.interheart.stone.service.app;

import cn.interheart.stone.common.enums.StoneEnums;
import cn.interheart.stone.dao.entity.*;
import cn.interheart.stone.dao.entity.mapper.MeasureDoorsetMapper;
import cn.interheart.stone.dao.entity.mapper.PictureAttchmentMapper;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.math.RandomUtils;
import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class AppMeasureDoorsetsService {

    @Resource
    MeasureDoorsetMapper measureDoorsetMapper;

    @Resource
    PictureAttchmentMapper pictureAttchmentMapper;

    /**
     * 插入门套
     * @return ResultDto
     */
    public ResultDto insert( MeasureDoorset measureDoorset, List<Integer> doorSerImagesList){
        ResultDto resultDto = new ResultDto();
        measureDoorsetMapper.insertSelective(measureDoorset);
        saveImage(measureDoorset.getId(), doorSerImagesList);
        return  resultDto;
    }


    /**
     * 更新门套
     * @return ResultDto
     */
    public ResultDto update( MeasureDoorset measureDoorset, List<Integer> doorSerImagesList){
        ResultDto resultDto = new ResultDto();
        measureDoorsetMapper.updateByPrimaryKeySelective(measureDoorset);
        saveImage(measureDoorset.getId(), doorSerImagesList);
        return  resultDto;
    }

    /**
     * 门套量尺详情
     * @return ResultDto
     */
    public ResultDto info(Integer id){
        ResultDto resultDto = new ResultDto();
        MeasureDoorset measureDoorset = measureDoorsetMapper.selectByPrimaryKey(id);

        if(measureDoorset != null){
            PictureAttchmentExample pictureAttchmentExample = new PictureAttchmentExample();
            PictureAttchmentExample.Criteria criteria = pictureAttchmentExample.createCriteria();
            List<PictureAttchment> pictureAttchmentList = pictureAttchmentMapper.selectByExample(pictureAttchmentExample);


        }
        return  resultDto;
    }

    /**
     * 保存图片
     */
    public void saveImage(Integer id,  List<Integer> doorSerImagesList){

        for (Integer imageId : doorSerImagesList) {
            PictureAttchment pictureAttchment = new PictureAttchment();
            pictureAttchment.setId(imageId);
            pictureAttchment.setParentId(id);
            pictureAttchmentMapper.updateByPrimaryKeySelective(pictureAttchment);
        }
    }
}
