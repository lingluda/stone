package cn.interheart.stone.service.common;

import cn.interheart.stone.dao.entity.PictureAttchment;
import cn.interheart.stone.dao.entity.PictureAttchmentExample;
import cn.interheart.stone.dao.entity.ResultDto;
import cn.interheart.stone.dao.entity.mapper.PictureAttchmentMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class CoPictureAttchmentService {
    @Resource
    PictureAttchmentMapper pictureAttchmentMapper;

    /**
     * 插入
     * @param pictureAttchment
     * @return
     */
    public ResultDto insert(PictureAttchment pictureAttchment){

        ResultDto resultDto = new ResultDto();
        pictureAttchment.setParentId(0);
        pictureAttchment.setGmtCreate(new Date());
        pictureAttchmentMapper.insert(pictureAttchment);
        resultDto.setData(pictureAttchment);

        return resultDto;
    }

    /**
     * 更新数据
     * @return
     */
    public ResultDto update(PictureAttchment pictureAttchment){

        ResultDto resultDto = new ResultDto();

        if(pictureAttchment.getId() == 0){
            pictureAttchment.setId(null);
            pictureAttchment.setGmtCreate(new Date());
            pictureAttchment.setGmtModified(new Date());
            pictureAttchmentMapper.insert(pictureAttchment);
        }else{
            pictureAttchmentMapper.updateByPrimaryKeySelective(pictureAttchment);
        }
        resultDto.setData(pictureAttchment);
        return resultDto;
    }



    /**
     * 删除图片
     * @return
     */
    public ResultDto delImage(Integer id){
        ResultDto resultDto = new ResultDto();
        pictureAttchmentMapper.deleteByPrimaryKey(id);
        return  resultDto;
    }
}
