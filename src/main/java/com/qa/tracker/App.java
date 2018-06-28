package com.qa.tracker;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.qa.tracker.entity.Movie;
import com.qa.tracker.repository.MovieRepository;

@SpringBootApplication
public class App {
	
	@Autowired
	MovieRepository movieRepository;

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@PostConstruct
	public void setupDbWithData(){

		
		Movie film = new Movie("title1","genre1","classification1");
		film = movieRepository.save(film);
	}
}
