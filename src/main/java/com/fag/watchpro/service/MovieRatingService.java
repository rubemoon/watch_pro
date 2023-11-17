package com.fag.watchpro.service;

import org.springframework.stereotype.Service;
@Service
public interface MovieRatingService {
	
	String getMovieRating(String title);

}