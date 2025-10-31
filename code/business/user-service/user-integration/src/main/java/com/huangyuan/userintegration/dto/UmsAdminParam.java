package com.huangyuan.userintegration.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;


/**
 * 用户注册参数
 * Created by macro on 2018/4/26.
 */
@Getter
@Setter
public class UmsAdminParam {
    @NotEmpty
    @Schema(description = "用户名", required = true)
    private String username;
    @NotEmpty
    @Schema(description = "密码", required = true)
    private String password;
    @Schema(description = "用户头像")
    private String icon;
    @Email
    @Schema(description = "邮箱")
    private String email;
    @Schema(description = "用户昵称")
    private String nickName;
    @Schema(description = "备注")
    private String note;
}
