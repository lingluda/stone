package cn.interheart.stone.api.cp;

import cn.interheart.stone.dao.entity.*;
import cn.interheart.stone.service.cp.CpEmployInfoService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 公司员工
 * shikai
 */
@RestController
@RequestMapping("cp/employInfo")
public class CpEmployInfoController {
	@Resource
	CpEmployInfoService cpEmployInfoService;

	/**
	 * insert
	 * @return
	 */
	@RequestMapping(value = "/insert" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> insert(@RequestBody RequestDto<JSONObject> dto){
		JSONObject jsonObject = dto.getData();

		EmployInfo employInfo = JSON.parseObject(jsonObject.toJSONString(), EmployInfo.class);

        List<PictureAttchment> pictureAttchments = JSON.parseArray(jsonObject.getJSONArray("images").toJSONString(), PictureAttchment.class);

		return new ResponseEntity<>(cpEmployInfoService.insert(employInfo, pictureAttchments), HttpStatus.OK);
	}

	/**
	 * del
	 * @return
	 */
	@RequestMapping(value = "/del" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> del(@RequestBody RequestDto<EmployInfo> dto){
		return new ResponseEntity<>(cpEmployInfoService.del(dto.getData().getId()), HttpStatus.OK);
	}

	/**
	 * update
	 * @return
	 */
	@RequestMapping(value = "/update" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> update(@RequestBody RequestDto<EmployInfo> dto){
		return new ResponseEntity<>(cpEmployInfoService.update(dto.getData()), HttpStatus.OK);

	}
	/**
	 * info
	 * @return
	 */
	@RequestMapping(value = "/info" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto>  info(@RequestBody RequestDto<EmployInfo> dto){
		return new ResponseEntity<>(cpEmployInfoService.info(dto.getData().getId()), HttpStatus.OK);
	}

	/**
	 * 员工列表
	 * @return
	 */
	@RequestMapping(value = "/list", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> list(@RequestBody RequestDto<Map<String, String>> dto){
		return  new ResponseEntity<>(cpEmployInfoService.list(dto.getData()),  HttpStatus.OK);
	}

    /**
     *员工离职
     * @return
     */
    @RequestMapping(value = "/quit", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<ResultDto> quit(@RequestBody RequestDto<EmployInfo> dto){
        return  new ResponseEntity<>(cpEmployInfoService.quit(dto.getData()),  HttpStatus.OK);
    }
}