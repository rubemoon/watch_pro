package com.fag.watchpro.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.node.ObjectNode;

@Service
public class MovieRatingService {
	
	String apiUrl = "http://www.omdbapi.com/?apikey=26e3a6ca&t=";
	
	public String getMovieRating(String title) {
		try {
			RestTemplate template = new RestTemplate();
			
			ResponseEntity<ObjectNode> response = 
					template.getForEntity(apiUrl + title, ObjectNode.class);
			
			ObjectNode jsonObject = response.getBody();
			
			return jsonObject.path("imdbRating").asText();
		} catch (Exception e) {
			System.out.println("Something went wront while calling ombd Api" + e.getMessage());
			return null;
		}
		
	}
	
	

}
