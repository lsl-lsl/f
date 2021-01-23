package com.lsl.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author lsl
 * @since 2021-01-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("oe_user")
@ApiModel(value="User对象", description="")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户ID")
    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;

    @ApiModelProperty(value = "用户账户")
    private Integer userAccount;

    @ApiModelProperty(value = "密码	")
    private String userPassword;

    @ApiModelProperty(value = "姓名")
    private String userName;

    @ApiModelProperty(value = "性别 0：男   1：女")
    private Integer userSex;

    @ApiModelProperty(value = "类别，0：管理员  1：教师   2：学生")
    private Integer userType;

    @ApiModelProperty(value = "头像")
    private String userPic;

    @ApiModelProperty(value = "盐值，用来加密")
    private String userSalt;

}
