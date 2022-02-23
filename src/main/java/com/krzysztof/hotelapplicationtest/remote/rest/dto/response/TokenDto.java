package com.krzysztof.hotelapplicationtest.remote.rest.dto.response;

public class TokenDto {
    private String token;

    public void setToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public TokenDto() {
    }

    public TokenDto(String token) {
        this.token = token;
    }
}
