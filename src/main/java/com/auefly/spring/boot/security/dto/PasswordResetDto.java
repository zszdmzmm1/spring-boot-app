package com.auefly.spring.boot.security.dto;

import com.auefly.spring.boot.security.validator.PasswordConfirmation;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;


@Data
@PasswordConfirmation(
        password = "password",
        confirmPassword = "confirmPassword",
        message = "两次密码输入不一致"
)
public class PasswordResetDto {
    @NotEmpty
    private String token;

    @NotEmpty(message = "密码不可为空！")
    @Size(min = 6, max = 16, message = "请输入6~16位密码！")
    private String password;

    @NotEmpty(message = "请确认新密码！")
    @Size(min = 6, max = 16)
    private String confirmPassword;
}
