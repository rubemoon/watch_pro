package com.fag.watchpro.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fag.watchpro.repository.WatchlistRepository;
import com.fag.watchpro.service.MovieRatingService;
import com.fag.watchpro.service.MovieRatingServiceImpl;
import com.fag.watchpro.service.WatchlistService;


@Configuration
public class AppConfig {
    
    @Bean
    public WatchlistRepository watchlistRepository() {
        return new WatchlistRepository();
    }
    
    @Bean
    public MovieRatingService movieRatingService() {
        return new MovieRatingServiceImpl();  // Instantiate the implementation class
    }
    
    @Bean
    public WatchlistService watchlistService() {
        return new WatchlistService(watchlistRepository(), movieRatingService()); 
    }
}

