package com.example.URLShortener.utility;

import org.springframework.stereotype.Component;

@Component
public class Base62Utility {

    public Base62Utility() {
    }

    private static final String base62Characters = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public String encode(Long id){

        StringBuilder sb = new StringBuilder();
        while(id != 0){
            sb.append(base62Characters.charAt((int) (id%62)));
            id = id / 62;
        }

        return sb.reverse().toString();
    }
}
