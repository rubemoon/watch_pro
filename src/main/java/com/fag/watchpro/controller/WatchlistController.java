package com.fag.watchpro.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

<<<<<<< HEAD
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
>>>>>>> feature/omdb-api
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.fag.watchpro.domain.WatchlistItem;
import com.fag.watchpro.exception.DuplicateTitleException;
import com.fag.watchpro.service.WatchlistService;


@Controller
@ConditionalOnProperty(name="app.environment", havingValue="dev")
public class WatchlistController {
	
<<<<<<< HEAD
	Logger logger = LoggerFactory.getLogger(WatchlistController.class);
	
	@Autowired
	private WatchlistService watchlistService;
	
=======
	private final WatchlistService watchlistService;

	@Autowired
	public WatchlistController(WatchlistService watchlistService) {
		this.watchlistService = watchlistService;
	}

>>>>>>> feature/omdb-api
	@GetMapping("/watchlistItemForm")
	public ModelAndView showWatchlistItemForm(@RequestParam(required = false) Integer id) {
		
		logger.info("GET /watchlistItem called");
		
		String viewName = "watchlistItemForm";
		
<<<<<<< HEAD
		Map<String,Object> model = new HashMap<String,Object>();
=======
		Map<String, Object> model = new HashMap<>();
>>>>>>> feature/omdb-api
		
		WatchlistItem watchlistItem = watchlistService.findWatchlistItemById(id);
		
		if (watchlistItem == null) {
			model.put("watchlistItem", new WatchlistItem());	
		} else {
			model.put("watchlistItem", watchlistItem);
		}
<<<<<<< HEAD
		return new ModelAndView(viewName,model); 
=======
		return new ModelAndView(viewName, model);
>>>>>>> feature/omdb-api
	}

	@PostMapping("/watchlistItemForm")
	public ModelAndView submitWatchlistItemForm(@Valid WatchlistItem watchlistItem, BindingResult bindingResult) {
		
		logger.info("GET /watchlistItem called");
		
		if (bindingResult.hasErrors()) {
			return new ModelAndView("watchlistItemForm");
		}
		
		try {
			watchlistService.addOrUpdateWatchlistItem(watchlistItem);
		} catch (DuplicateTitleException e) {
			bindingResult.rejectValue("title", "", "This title already exists on your watchlist");
			return new ModelAndView("watchlistItemForm");
		}
		
		RedirectView redirect = new RedirectView();
		redirect.setUrl("/watchlist");
		
		return new ModelAndView(redirect);
	}
<<<<<<< HEAD
		
	@GetMapping("/watchlist")
	public ModelAndView getMovieList() {
		
		logger.info("GET /watchlist called");
		
		String viewName= "watchlist";
		
		Map<String,Object> model = new HashMap<String,Object>();
				
		model.put("watchlistItems", watchlistService.getWatchlistItems());
		model.put("numberOfMovies", watchlistService.getWatchlistItemsSize());
		
		return new ModelAndView(viewName,model);		
	}
=======
	
	@GetMapping("/watchlist")
    public ModelAndView getWatchlist() {
        String viewName = "watchlist";
        Map<String, Object> model = new HashMap<>();
       
        model.put("watchlistItems", watchlistService.getWatchlistItems());
        model.put("numberOfMovies", watchlistService.getWatchlistItemsSize());
        
        return new ModelAndView(viewName, model);
    }
>>>>>>> feature/omdb-api
}
