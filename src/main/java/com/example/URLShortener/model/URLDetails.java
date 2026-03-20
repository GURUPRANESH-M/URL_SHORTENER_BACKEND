package com.example.URLShortener.model;

import jakarta.persistence.*;

@Entity
public class URLDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "actual_url", nullable = false, length = 2048)
    private String actualUrl;
    @Column(name = "shorten_url", nullable = false)
    private String shortenUrl;

    public URLDetails() {
    }

    public URLDetails(Long id, String actualUrl, String shortenUrl) {
        this.id = id;
        this.actualUrl = actualUrl;
        this.shortenUrl = shortenUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getActualUrl() {
        return actualUrl;
    }

    public void setActualUrl(String actualUrl) {
        this.actualUrl = actualUrl;
    }

    public String getShortenUrl() {
        return shortenUrl;
    }

    public void setShortenUrl(String shortenUrl) {
        this.shortenUrl = shortenUrl;
    }
}

