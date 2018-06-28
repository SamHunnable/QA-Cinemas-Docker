package com.qa.tracker.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.qa.tracker.entity.Booking;
import com.qa.tracker.repository.BookingRepository;
import com.qa.tracker.service.BookingService;

@Service
public class BookingServiceimpl implements BookingService {
	
	@Autowired
	BookingRepository bookingRepository;
	
	@Override
	public List<Booking> getAllBookings() {
	  return bookingRepository.findAll();
	}


	@Override
	public Booking getBookingById(Integer bookingId) {
		return bookingRepository.findOne(bookingId);
	}


	@Override
	public String editBookingById(String booking) {
		Booking newBooking = new Gson().fromJson(booking, Booking.class);
		Booking oldBooking = bookingRepository.findOne(newBooking.getBookingId());
		oldBooking.setAdultTicketNo(newBooking.getAdultTicketNo());
		oldBooking.setStudentTicketNo(newBooking.getStudentTicketNo());
		oldBooking.setChildTicketNo(newBooking.getChildTicketNo());
		oldBooking.setSeniorTicketNo(newBooking.getSeniorTicketNo());
		
		return "\"message\" :\"booking edited\"";
	}

	@Override
	public String addBooking(String booking) {
		bookingRepository.save(new Gson().fromJson(booking, Booking.class));
		return "\"message\" :\"booking added\"";
	   
	}

	@Override
	public String deletebooking(Integer bookingId) {
		
		bookingRepository.delete(bookingId);
		return "\"message\" :\"booking deleted\"";
		
	}

}
