package com.qa.tracker.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Booking{

	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer bookingId;
	@Column
	private Integer adultTicketNo;
	@Column
	private Integer childTicketNo;
	@Column
	private Integer studentTicketNo;
	@Column
	private Integer seniorTicketNo;
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "showingid")
	private Showing showing;
	

	public Booking() {
		
	}


	public Booking(Integer adultTicketNo, Integer childTicketNo, Integer studentTicketNo, Integer seniorTicketNo) {
		this.adultTicketNo = adultTicketNo;
		this.childTicketNo = childTicketNo;
		this.studentTicketNo = studentTicketNo;
		this.seniorTicketNo = seniorTicketNo;
	}


	public Integer getBookingId() {
		return bookingId;
	}


	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}


	public Integer getAdultTicketNo() {
		return adultTicketNo;
	}


	public void setAdultTicketNo(Integer adultTicketNo) {
		this.adultTicketNo = adultTicketNo;
	}


	public Integer getChildTicketNo() {
		return childTicketNo;
	}


	public void setChildTicketNo(Integer childTicketNo) {
		this.childTicketNo = childTicketNo;
	}


	public Integer getStudentTicketNo() {
		return studentTicketNo;
	}


	public void setStudentTicketNo(Integer studentTicketNo) {
		this.studentTicketNo = studentTicketNo;
	}


	public Integer getSeniorTicketNo() {
		return seniorTicketNo;
	}


	public void setSeniorTicketNo(Integer seniorTicketNo) {
		this.seniorTicketNo = seniorTicketNo;
	}
	
}

