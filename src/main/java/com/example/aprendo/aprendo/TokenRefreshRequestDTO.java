package com.example.aprendo.aprendo;

public class TokenRefreshRequestDTO {
    
    private String refreshToken;

    public TokenRefreshRequestDTO() {
    }        

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }
        
}
