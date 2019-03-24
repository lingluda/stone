package cn.interheart.stone.dao.entity.extmapper.app.dto;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class ProjectDto implements Serializable{
    private Integer id;
    private String projectName;
    private Integer status;
    private String customerName;
    private Integer customerIntention;
    private String phone;
    @JSONField(format = "yyyy-MM-dd HH:mm")
    private Date gmtCreate;
}
