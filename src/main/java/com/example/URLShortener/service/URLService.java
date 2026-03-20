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
import java.util.concurrent.ThreadLocalRandom;

@Service
public class URLService {


    private URLRepository urlRepository;
    private Base62Utility base62Utility;



    public String shorten_url(String url) {
//        String prefix = "localhost:8080/";
//        int random = ThreadLocalRandom.current().nextInt(1,10001);
//        URLDetails urlDetails = new URLDetails();
//        urlDetails.setActualUrl(url);
//        urlDetails.setShortenUrl(String.valueOf(random));
//        urlRepository.save(urlDetails);
//        return prefix+random;
    }


    public String getActualUrl(String url) {

        return "";
    }
;}
