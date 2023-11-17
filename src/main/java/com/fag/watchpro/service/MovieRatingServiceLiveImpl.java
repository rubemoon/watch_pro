package com.fag.watchpro.service;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.fag.watchpro.controller.CustomErrorController;
import com.fasterxml.jackson.databind.node.ObjectNode;

@ConditionalOnProperty(name = "app.environment", havingValue = "prod")
@Service
public class MovieRatingServiceLiveImpl implements MovieRatingService {
	
	private String apiUrl = "http://www.omdbapi.com/?apikey=26e3a6ca&t=";
	
	 private final Logger logger = LoggerFactory.getLogger(MovieRatingServiceLiveImpl.class);
	
	public String getMovieRating(String title) {
	
			try {
				RestTemplate template = new RestTemplate();
				
				ResponseEntity<ObjectNode> Response = 
						template.getForEntity(apiUrl + title, ObjectNode.class);
				
				ObjectNode jsonObject = Response.getBody();
				
				logger.debug("OMDB API response: {}", jsonObject);
				
				return jsonObject.path("imdbRating").asText();
			} catch (Exception e) {
				logger.warn("Something went wront while calling OMDb API" + e.getMessage());
				return null;
			}
	}}
