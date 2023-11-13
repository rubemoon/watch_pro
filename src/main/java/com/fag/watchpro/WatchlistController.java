package com.fag.watchpro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WatchlistController {
    
	private List<WatchlistItem> watchlistItems = new ArrayList<WatchlistItem>();
	private static int index = 1;
	
    @GetMapping("/watchlist")
    public ModelAndView getList() {
    	
    	

        String viewName = "watchlist";
        Map<String, Object> model = new HashMap<String, Object>();
        
        watchlistItems.clear();
    	watchlistItems.add(new WatchlistItem("Spartacus","8.2","high","hacuna Matata", index++));
    	watchlistItems.add(new WatchlistItem("Progress over","6.2","medium"," great to go", index++));
    	watchlistItems.add(new WatchlistItem("Chasse a lhomme","8.2","low","its not important", index++));
    	watchlistItems.add(new WatchlistItem("silence and listen","8.2","high","you are the best! ", index++));
    	watchlistItems.add(new WatchlistItem("Progress over","6.2","medium"," great to go", index++));
    	watchlistItems.add(new WatchlistItem("Chasse a lhomme","8.2","low","its not important", index++));
    	watchlistItems.add(new WatchlistItem("silence and listen","8.2","high","you are the best! ", index++));


        
        model.put("watchlistItems", watchlistItems);
        model.put("numberOfMovies", watchlistItems.size());
        
        return new ModelAndView(viewName, model);
    }
}
