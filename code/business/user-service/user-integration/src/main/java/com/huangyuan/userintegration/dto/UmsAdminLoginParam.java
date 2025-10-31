package com.huangyuan.userintegration.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户登录参数
 * Created by macro on 2018/4/26.
 */
@Data
@EqualsAndHashCode
public class UmsAdminLoginParam {
    @NotEmpty
    @Schema(description = "用户名",required = true)
    private String username;
    @NotEmpty
    @Schema(description = "密码",required = true)
    private String password;
}
