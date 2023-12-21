package jw.hospital.model.acl;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jw.hospital.model.base.BaseEntity;
import lombok.Data;

/**
 * 角色权限
 *
 * @author Wen Xie
 */
@Data
@ApiModel(description = "角色权限")
@TableName("acl_role_permission")
public class RolePermission extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "roleid")
	@TableField("role_id")
	private Long roleId;

	@ApiModelProperty(value = "permissionId")
	@TableField("permission_id")
	private Long permissionId;

}

