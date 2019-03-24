package cn.interheart.stone.api.common.controller;

import cn.interheart.stone.common.config.CpConfig;
import cn.interheart.stone.common.config.SysConfig;
import cn.interheart.stone.common.utils.CodeUtil;
import cn.interheart.stone.dao.entity.PictureAttchment;
import cn.interheart.stone.dao.entity.RequestDto;
import cn.interheart.stone.dao.entity.ResultDto;
import cn.interheart.stone.dao.entity.extmapper.common.CoDicProcessInstructionExtMapper;
import cn.interheart.stone.dao.entity.extmapper.common.CoDicProessModeExtMapper;
import cn.interheart.stone.service.app.AppProjectService;
import cn.interheart.stone.service.common.CoDicBaseService;
import cn.interheart.stone.service.common.CoPictureAttchmentService;
import cn.interheart.stone.service.sys.SysEmployUserService;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/common")
public class CommonController extends BaseController{

    @Resource
    CoPictureAttchmentService coPictureAttchmentService;

    @Resource
    SysEmployUserService sysEmployUserService;

    @Resource
    CoDicBaseService coDicBaseService;


    /**
     * 验证码
     * @param codeType
     * @param response
     * @throws IOException
     */

    @RequestMapping(value = "/verificationCode")
    public void verificationCode(String codeType , HttpServletResponse response) throws IOException {
       Map<String, Object> code = CodeUtil.generateCodeAndPic(85 ,40  );

       if(StringUtils.equals(codeType, SysConfig.SYS_VERIFICATION_CODE)){
           setSessionAttr(SysConfig.SYS_VERIFICATION_CODE, code.get("code"));
       }

       if(StringUtils.equals(codeType, CpConfig.COMPANY_VERIFICATION_CODE)){
            setSessionAttr(CpConfig.COMPANY_VERIFICATION_CODE, code.get("code"));
       }

       response.setContentType("image/png");
       OutputStream os = response.getOutputStream();
       ImageIO.write((BufferedImage)code.get("codePic"), "png", os);


    }

    /**
     * 保存图片路径
     */
    @RequestMapping(value = "/saveImage")
    public ResponseEntity<ResultDto> saveImage(@RequestBody RequestDto<PictureAttchment> dto) {
        return new ResponseEntity<>(coPictureAttchmentService.insert(dto.getData()), HttpStatus.OK);
    }

    /**
     * 更新图片路劲
     */
    @RequestMapping(value = "/updateImage")
    public ResponseEntity<ResultDto> updateImage(@RequestBody RequestDto<PictureAttchment> dto) {
        return new ResponseEntity<>(coPictureAttchmentService.update(dto.getData()), HttpStatus.OK);

    }


    /**
     *  删除图片
     */
    @RequestMapping(value = "/delImage")
    public ResponseEntity<ResultDto> delImage(@RequestBody RequestDto<PictureAttchment> dto) {
        return new ResponseEntity<>(coPictureAttchmentService.delImage(dto.getData().getId()), HttpStatus.OK);

    }


    /**
     *  户型列表
     * @return
     */
    @RequestMapping(value = "/houseTypeList" , method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<ResultDto> houseTypeList(){
        return new ResponseEntity<>(coDicBaseService.houseTypeList(), HttpStatus.OK);
    }

    /**
     *  加工方式
     * @return
     */
    @RequestMapping(value = "/processModeList" , method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<ResultDto> processModeList(@RequestBody RequestDto<Map<String, String>> dto){
        return new ResponseEntity<>(coDicBaseService.processModeList(dto.getData()), HttpStatus.OK);
    }

    /**
     *  加工说明
     * @return
     */
    @RequestMapping(value = "/processInstructionList" , method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<ResultDto> processInstructionList(@RequestBody RequestDto<Map<String, String>> dto){
        return new ResponseEntity<>(coDicBaseService.processInstructionList(dto.getData()), HttpStatus.OK);
    }
    /**
     * 量尺区域列表
     * @return
     */
    @RequestMapping(value = "/measureAreaList" , method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<ResultDto> measureAreaList(){
        return new ResponseEntity<>(coDicBaseService.measureAreaList(), HttpStatus.OK);
    }

    /**
     * 石材列表
     * @return
     */
    @RequestMapping(value = "/productList" , method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<ResultDto> productList(@RequestBody RequestDto<Map<String,String>> dto){
        return new ResponseEntity<>(coDicBaseService.productList(NumberUtils.toInt(dto.getData().get("companyId"), 0)), HttpStatus.OK);
    }

    /**
     * 根据companyId和userType查询人员列表
     * @param dto
     * @return
     */
    @RequestMapping(value = "/getEmployUserList" , method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<ResultDto> getEmployUserList(@RequestBody RequestDto<Map<String,String>> dto){
        ResultDto requestDto = sysEmployUserService.getLcUserList(dto.getData());
        return new ResponseEntity<>(requestDto,HttpStatus.OK);
    }
}
