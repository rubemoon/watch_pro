package com.fag.watchpro.service;

<<<<<<< HEAD
=======
import java.util.Optional;
>>>>>>> feature/omdb-api

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
@ConditionalOnProperty(name = "app.environment", havingValue = "dev")
@Service
=======
@Service
@ConditionalOnProperty(name = "app.environment", havingValue = "dev")
>>>>>>> feature/omdb-api
public class MovieRatingServiceDummyImpl implements MovieRatingService {

	@Override
	public String getMovieRating(String title) {
		
		return "9.99";
	}
<<<<<<< HEAD
}
=======

}
>>>>>>> feature/omdb-api
