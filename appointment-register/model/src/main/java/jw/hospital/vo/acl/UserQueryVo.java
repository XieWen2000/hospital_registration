package jw.hospital.vo.acl;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 用户查询实体
 *
 * @author Wen Xie
 */
@Data
@ApiModel(description = "用户查询实体")
public class UserQueryVo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "用户名")
	private String username;

	@ApiModelProperty(value = "昵称")
	private String nickName;

}

