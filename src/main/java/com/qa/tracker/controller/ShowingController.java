package com.qa.tracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	public List<Showing> getAllShowings() {
		return showingService.getAllShowings();
	}

}
