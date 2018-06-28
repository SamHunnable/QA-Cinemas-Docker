package com.qa.tracker.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Showing {

	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer showingId;
	@Column
	private Date date;
	@Column
	private Integer movieId;
	
	public Showing(Date date, Integer movieId) {
		this.date = date;
		this.movieId = movieId;
	}
	
	public Integer getShowingId() {
		return showingId;
	}
	public void setShowingId(Integer showingId) {
		this.showingId = showingId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getMovieId() {
		return movieId;
	}
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

}
