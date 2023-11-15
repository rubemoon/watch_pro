package com.fag.watchpro;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.fag.watchpro.domain.WatchlistItem;
import com.fag.watchpro.repository.WatchlistRepository;
import com.fag.watchpro.service.MovieRatingService;
import com.fag.watchpro.service.WatchlistService;

@RunWith(MockitoJUnitRunner.class)
public class WatchlistServiceTest {
	
	@Mock
	private WatchlistRepository watchlistRepositoryMock;
	
	@Mock
	private MovieRatingService movieRatingServiceMock;
	
	@InjectMocks
	private WatchlistService watchlistService;
	
	@Test
	public void testGetWatchlistItemsReturnsAllItemsFromRepository() {
		
		//Arrange
		WatchlistItem item1 = new WatchlistItem("Matrix", "5,7", "M", "", 1);
		WatchlistItem item2 = new WatchlistItem("Star Treck", "7,7", "M", "", 1);
		List<WatchlistItem> mockItems = Arrays.asList(item1, item2);
		
		Mockito.when(watchlistRepositoryMock.getList()).thenReturn(mockItems);
		
		// Act
		List<WatchlistItem> result = watchlistService.getWatchlistItems();
		
		//Assert
		Assert.assertTrue(result.size() == 2);
		Assert.assertTrue(result.get(0).getTitle().equals("Matrix"));
		Assert.assertTrue(result.get(1).getTitle().equals("Star Treck"));
	}
	
	
	

}
