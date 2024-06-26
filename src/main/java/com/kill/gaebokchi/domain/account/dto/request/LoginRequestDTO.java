package com.kill.gaebokchi.domain.account.dto.request;

import io.micrometer.common.util.StringUtils;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class LoginRequestDTO {
    String socialType;
    String accessToken;
    String authorizationCode;
    public boolean hasNullFields() {
        return Objects.isNull(socialType) || Objects.isNull(accessToken) || StringUtils.isEmpty(socialType) || StringUtils.isEmpty(accessToken);
    }
}
