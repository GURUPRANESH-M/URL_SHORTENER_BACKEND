package com.example.URLShortener.dto;

import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class URLRequest {

    @NotBlank
    @URL(message = "provide a valid url")
    private String actualUrl;

    public String getActualUrl() {
        return actualUrl;
    }

    public void setActualUrl(String actualUrl) {
        this.actualUrl = actualUrl;
    }
}
