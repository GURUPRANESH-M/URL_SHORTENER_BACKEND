package com.example.URLShortener.repository;

import com.example.URLShortener.model.URLDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface URLRepository extends JpaRepository<URLDetails,Long> {
    public Optional<URLDetails> findByShortenUrl(String url);
}
