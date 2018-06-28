package com.qa.tracker;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.qa.tracker.entity.Movie;
import com.qa.tracker.entity.Showing;
import com.qa.tracker.repository.MovieRepository;
import com.qa.tracker.repository.ShowingRepository;

@SpringBootApplication
public class App {
	
	@Autowired
	MovieRepository movieRepository;
	@Autowired
	ShowingRepository showingRepository;

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@PostConstruct
	public void setupDbWithData(){
		Date date = new Date();
		
		Movie film = new Movie("title1","genre1","classification1");
		film = movieRepository.save(film);
		Showing showing = new Showing(date,1);
		showing = showingRepository.save(showing);
	}
}
