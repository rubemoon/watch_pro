package com.fag.watchpro.service;

import java.util.List;

import org.springframework.web.servlet.ModelAndView;

import com.fag.watchpro.domain.WatchlistItem;
import com.fag.watchpro.exception.DuplicateTitleException;
import com.fag.watchpro.repository.WatchlistRepository;

public class WatchlistService {
	
	WatchlistRepository watchlistRepository = new WatchlistRepository();
	
	public List<WatchlistItem> getWatchlistItems() {
		return watchlistRepository.getList();
	}
	
	public int getWatchlistItemsSize() {
		return watchlistRepository.getList().size();
	}
	
	public WatchlistItem findWatchlistItemById(Integer id) {
		return watchlistRepository.findById(id);
	}
	
	public void addOrUpdateWatchlistItem(WatchlistItem watchlistItem) throws DuplicateTitleException {
		
	WatchlistItem existingItem = findWatchlistItemById(watchlistItem.getId());
		
		if (existingItem == null) {
			if (watchlistRepository.findByTitle(watchlistItem.getTitle()) !=null) {
				throw new DuplicateTitleException();
			}
			
			watchlistRepository.addItem(watchlistItem);
		} else {
			existingItem.setComment(watchlistItem.getComment());
			existingItem.setPriority(watchlistItem.getPriority());
			existingItem.setRating(watchlistItem.getRating());
			existingItem.setTitle(watchlistItem.getTitle());  
		}
	}
}
