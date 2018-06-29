package com.qa.tracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.tracker.entity.Movie;
import com.qa.tracker.service.MovieService;

@RequestMapping("/movie")
@RestController
public class MovieController {
	
	@Autowired
	MovieService movieService;
	
	@RequestMapping("/get")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Movie> getAllMovies() {
		return movieService.getAllMovies();
	}
	
	
	@RequestMapping("/getMovie/{movieId}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Movie getMovieById(@PathVariable Integer movieId) {
		return movieService.getMovieById(movieId);
	}
	
}
