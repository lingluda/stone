package cn.interheart.stone.api.sys;

import cn.interheart.stone.dao.entity.RequestDto;
import cn.interheart.stone.dao.entity.ResultDto;
import cn.interheart.stone.dao.entity.SysUserRole;
import cn.interheart.stone.service.sys.SysUserRoleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 系统用户角色
 * shikai
 */
@RestController
@RequestMapping("sys/sysUserRole")
public class SysUserRoleController {
	@Resource
	SysUserRoleService sysUserRoleService;

	/**
	 * insert
	 * @return
	 */
	@RequestMapping(value = "/insert" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> insert(@RequestBody RequestDto<SysUserRole> dto){
		return new ResponseEntity<>(sysUserRoleService.insert(dto.getData()), HttpStatus.OK);
	}

	/**
	 * del
	 * @return
	 */
	@RequestMapping(value = "/del" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> del(@RequestBody RequestDto<SysUserRole> dto){
		return new ResponseEntity<>(sysUserRoleService.del(dto.getData().getId()), HttpStatus.OK);
	}

	/**
	 * update
	 * @return
	 */
	@RequestMapping(value = "/update" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> update(@RequestBody RequestDto<SysUserRole> dto){
		return new ResponseEntity<>(sysUserRoleService.update(dto.getData()), HttpStatus.OK);

	}
	/**
	 * info
	 * @return
	 */
	@RequestMapping(value = "/info" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto>  info(@RequestBody RequestDto<SysUserRole> dto){
		return new ResponseEntity<>(sysUserRoleService.info(dto.getData().getId()), HttpStatus.OK);
	}


	/**
	 * list
	 * @return
	 */
	@RequestMapping(value = "/list", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> list(@RequestBody RequestDto<Map<String, String>> dto){
		return  new ResponseEntity<>(sysUserRoleService.list(dto.getData()), HttpStatus.OK);
	}



	/**
	 * 用户角色
	 * @return
	 */
	@RequestMapping(value = "/userRoleList", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> sysUserRole(@RequestBody RequestDto<SysUserRole> dto){
		return  new ResponseEntity<>(sysUserRoleService.userRoleList(dto.getData()), HttpStatus.OK);
	}


}