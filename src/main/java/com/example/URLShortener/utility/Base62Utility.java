package com.example.URLShortener.utility;

public class Base62Utility {

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
