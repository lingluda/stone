package cn.interheart.stone.api.app;

import cn.interheart.stone.dao.entity.CompanyStore;
import cn.interheart.stone.dao.entity.RequestDto;
import cn.interheart.stone.dao.entity.ResultDto;
import cn.interheart.stone.service.app.AppCompanyStoreService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@Api(tags = "APP公司门店管理")
@RestController
@RequestMapping("/app/store")
public class AppCompanyStoreController {
    @Resource
    AppCompanyStoreService appCompanyStoreService;

    /**
     * 更新门店草稿
     *
     * @param dto
     * @return
     */

    @RequestMapping(value = "/editDraft", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<ResultDto> editDraft(@RequestBody RequestDto<JSONObject> dto) {
        JSONObject jsonObject = dto.getData();
        CompanyStore companyStore = JSON.parseObject(jsonObject.toJSONString(),CompanyStore.class);
        JSONArray picArray = jsonObject.getJSONArray("images");
        return new ResponseEntity<>(appCompanyStoreService.editDraft(companyStore,picArray), HttpStatus.OK);
    }

    /**
     * 新增门店草稿
     *
     * @param dto
     * @return
     */

    @RequestMapping(value = "/saveDraft", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<ResultDto> saveDraft(@RequestBody RequestDto<JSONObject> dto) {
        JSONObject jsonObject = dto.getData();
        CompanyStore companyStore = JSON.parseObject(jsonObject.toJSONString(),CompanyStore.class);
        JSONArray picArray = jsonObject.getJSONArray("images");
        return new ResponseEntity<>(appCompanyStoreService.saveDraft(companyStore,picArray), HttpStatus.OK);
    }

    /**
     * 新增门店审核
     *
     * @param dto
     * @return
     */

    @RequestMapping(value = "/sendAudit", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<ResultDto> saveCheck(@RequestBody RequestDto<JSONObject> dto) {
        JSONObject jsonObject = dto.getData();
        CompanyStore companyStore = JSON.parseObject(jsonObject.toJSONString(),CompanyStore.class);
        JSONArray picArray = jsonObject.getJSONArray("images");
        return new ResponseEntity<>(appCompanyStoreService.saveCheck(companyStore,picArray), HttpStatus.OK);
    }
    /**
     * 更新门店审核
     *
     * @param dto
     * @return
     */

    @RequestMapping(value = "/editAudit", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<ResultDto> editCheck(@RequestBody RequestDto<JSONObject> dto) {
        JSONObject jsonObject = dto.getData();
        CompanyStore companyStore = JSON.parseObject(jsonObject.toJSONString(),CompanyStore.class);
        JSONArray picArray = jsonObject.getJSONArray("images");
        return new ResponseEntity<>(appCompanyStoreService.editCheck(companyStore,picArray), HttpStatus.OK);
    }

    /**
     * 门店列表
     *
     * @param dto
     * @return
     */

    @RequestMapping(value = "/list", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<ResultDto> list(@RequestBody RequestDto<Map<String, String>> dto) {
        return new ResponseEntity<>(appCompanyStoreService.list(dto.getData()), HttpStatus.OK);
    }

    /**
     * 门店详情
     *
     * @param dto
     * @return
     */

    @RequestMapping(value = "/info", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<ResultDto> info(@RequestBody RequestDto<CompanyStore> dto) {
        return new ResponseEntity<>(appCompanyStoreService.info(dto.getData().getId()), HttpStatus.OK);
    }
}
