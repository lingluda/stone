package cn.interheart.stone.dao.entity.extmapper.app.dto;

import lombok.Data;

/**
 * @author SHI_KAI
 * @date 2018/4/24 14:51
 * @description 项目基础信息
 */
@Data
public class ProjectBaseDto {
   private String name;
   private String customerName;
   private String phone;
   private String address;
   private Byte status;

}
