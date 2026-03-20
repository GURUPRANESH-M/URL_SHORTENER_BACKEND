package com.example.URLShortener.controller;

import com.example.URLShortener.service.URLService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
public class URLController {

    private URLService urlService;

    public URLController(URLService urlService) {
        this.urlService = urlService;
    }

    @PostMapping("/shorten")
    public String shorten_url(@RequestParam String url){
        return urlService.shorten_url(url);
    }

    @GetMapping("/{url}")
    public ResponseEntity<Void> redirectURL(@PathVariable String url) {
        String actualUrl = urlService.getActualUrl(url);
        return ResponseEntity.status(HttpStatus.FOUND)
                .location(URI.create(actualUrl))
                .build();
    }
}
