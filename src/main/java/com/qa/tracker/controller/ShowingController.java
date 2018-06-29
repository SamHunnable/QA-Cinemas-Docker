package com.qa.tracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.tracker.entity.Showing;
import com.qa.tracker.service.ShowingService;

@RequestMapping("/showing")
@RestController
public class ShowingController {

	@Autowired
	ShowingService showingService; 
	
	@RequestMapping("/get")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Showing> getAllShowings() {
		return showingService.getAllShowings();
	}

	@RequestMapping("/getShowing/{showingId}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Showing getShowingById(@PathVariable Integer showingId) {
		return showingService.getShowingById(showingId);
	}
}
