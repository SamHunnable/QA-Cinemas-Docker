package com.qa.tracker.service;

import java.util.List;

import com.qa.tracker.entity.Showing;

public interface ShowingService {
	Showing getShowingById(Integer showingId);
	List<Showing> getAllShowings();
}
