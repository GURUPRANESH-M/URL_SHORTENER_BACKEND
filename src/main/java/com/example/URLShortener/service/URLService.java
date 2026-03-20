package com.example.URLShortener.service;

import com.example.URLShortener.model.URLDetails;
import com.example.URLShortener.repository.URLRepository;
import com.example.URLShortener.utility.Base62Utility;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class URLService {


    private URLRepository urlRepository;
    private Base62Utility base62Utility;

    public URLService(URLRepository urlRepository, Base62Utility base62Utility) {
        this.urlRepository = urlRepository;
        this.base62Utility = base62Utility;
    }

    public String shorten_url(String url) {

        URLDetails urlDetails = new URLDetails();
        urlDetails.setActualUrl(url);

        URLDetails urlDetails1 = urlRepository.save(urlDetails);
        String shortenedUrl = base62Utility.encode(urlDetails1.getId());
        urlDetails.setShortenUrl(shortenedUrl);

        urlRepository.save(urlDetails);

        return "localhost:8080/"+shortenedUrl;
    }


    public String getActualUrl(String url) {

        URLDetails urlDetails = urlRepository.findByShortenUrl(url)
                .orElseThrow(() -> new RuntimeException("url is not valid"));
        String actualUrl = urlDetails.getActualUrl();

        System.out.println(actualUrl);
        return actualUrl;
    }
;}
