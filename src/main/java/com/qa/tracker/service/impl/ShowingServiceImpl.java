package com.qa.tracker.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.tracker.entity.Showing;
import com.qa.tracker.repository.ShowingRepository;
import com.qa.tracker.service.ShowingService;

@Service
public class ShowingServiceImpl implements ShowingService {

	@Autowired
	ShowingRepository showingRepository;
	
	
	public ShowingServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Showing> getAllShowings() {
		return showingRepository.findAll();
	}
	
	@Override
	public Showing getShowingById(Integer showingId) {
		return showingRepository.findOne(showingId);
	}

}
