package cn.interheart.stone.api.cp;

import cn.interheart.stone.dao.entity.Product;
import cn.interheart.stone.dao.entity.RequestDto;
import cn.interheart.stone.dao.entity.ResultDto;
import cn.interheart.stone.service.cp.CpProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 公司品名管理
 * shikai
 */
@RestController
@RequestMapping("cp/product")
public class CpProductController {
	@Resource
	CpProductService cpProductService;

	/**
	 * insert
	 * @return
	 */
	@RequestMapping(value = "/insert" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> insert(@RequestBody RequestDto<Product> dto){

		return new ResponseEntity<>(cpProductService.insert(dto.getData()), HttpStatus.OK);
	}

	/**
	 * del
	 * @return
	 */
	@RequestMapping(value = "/del" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> del(@RequestBody RequestDto<Product> dto){
		return new ResponseEntity<>(cpProductService.del(dto.getData().getId()), HttpStatus.OK);
	}

	/**
	 * update
	 * @return
	 */
	@RequestMapping(value = "/update" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> update(@RequestBody RequestDto<Product> dto){
		return new ResponseEntity<>(cpProductService.update(dto.getData()), HttpStatus.OK);

	}
	/**
	 * info
	 * @return
	 */
	@RequestMapping(value = "/info" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto>  info(@RequestBody RequestDto<Product> dto){
		return new ResponseEntity<>(cpProductService.info(dto.getData().getId()), HttpStatus.OK);
	}


	/**
	 * list
	 * @return
	 */
	@RequestMapping(value = "/list", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> list(@RequestBody RequestDto<Map<String, String>> dto){
		return  new ResponseEntity<>(cpProductService.list(dto.getData()), HttpStatus.OK);
	}

	/**
	 * 基础数据列表
	 * @return
	 */
	@RequestMapping(value = "/dicBaseList", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> dicBaseList(@RequestBody RequestDto<Map<String, String>> dto){
		return  new ResponseEntity<>(cpProductService.dicBaseList(dto.getData()), HttpStatus.OK);
	}

}