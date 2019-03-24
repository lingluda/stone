package cn.interheart.stone.service.sys;

import cn.interheart.stone.dao.entity.PageList;
import cn.interheart.stone.dao.entity.PictureAttchment;
import cn.interheart.stone.dao.entity.PictureAttchmentExample;
import cn.interheart.stone.dao.entity.ResultDto;
import cn.interheart.stone.dao.entity.mapper.PictureAttchmentMapper;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang.math.NumberUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Map;

@Service
public class SysPictureAttchmentService {

    @Resource
    PictureAttchmentMapper pictureAttchmentMapper;



    /**
     * insert
     * @return AjaxModel
     */
    public ResultDto insert(PictureAttchment pictureAttchment){
        ResultDto resultDto = new ResultDto();
        pictureAttchment.setGmtCreate(new Date());
        int res = pictureAttchmentMapper.insertSelective(pictureAttchment);
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

        int res =  pictureAttchmentMapper.deleteByPrimaryKey(id);
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
    public ResultDto update(PictureAttchment pictureAttchment){
        ResultDto resultDto = new ResultDto();
        if(pictureAttchment.getId() == null){
            resultDto.setCode("1");
            resultDto.setMsg("参数Id 不能为空!");
            return resultDto;
        }

        int res =  pictureAttchmentMapper.updateByPrimaryKeySelective(pictureAttchment);
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
        PictureAttchment pictureAttchment = pictureAttchmentMapper.selectByPrimaryKey(id);
        resultDto.setData(pictureAttchment);
        return  resultDto;
    }
    /**
     * list
     * @return
     */
    public ResultDto list(Map<String,String> data) {
        ResultDto resultDto = new ResultDto();

        //分页下标和偏移
        PictureAttchmentExample pictureAttchmentExample = new PictureAttchmentExample();
        //查询条件
        PictureAttchmentExample.Criteria criteria = pictureAttchmentExample.createCriteria();

        //返回结果
        int pageIndex = NumberUtils.toInt(data.get("pageIndex"), 1);
        int pageSize = NumberUtils.toInt(data.get("pageSize"), 10);
        PageHelper.startPage(pageIndex,pageSize, true);
        PageList page = new PageList(pictureAttchmentMapper.selectByExample(pictureAttchmentExample));

        resultDto.setData(page);
        return resultDto;
    }


}