package com.qa.tracker.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie {

	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer movieId;
	@Column
	private String movieTitle;
	@Column
	private String movieGenre;
	@Column
	private String movieClassification;

	public Movie() {
	}
	
	public Movie(String movieTitle, String movieGenre, String movieClassification) {
		this.movieTitle = movieTitle;
		this.movieGenre = movieGenre;
		this.movieClassification = movieClassification;
	}

	public String getMovieGenre() {
		return movieGenre;
	}

	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}

	public String getMovieClassification() {
		return movieClassification;
	}

	public void setMovieClassification(String movieClassification) {
		this.movieClassification = movieClassification;
	}

	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	public String getMovieTitle() {
		return movieTitle;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

}
