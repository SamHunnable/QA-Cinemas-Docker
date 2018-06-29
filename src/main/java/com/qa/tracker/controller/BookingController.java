package com.qa.tracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.tracker.entity.Booking;
import com.qa.tracker.service.BookingService;


@RequestMapping("/booking")
@RestController
public class BookingController {
	
	@Autowired
	BookingService bookingService;
	
	@RequestMapping("/get")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Booking> getAllBookings() {
		return bookingService.getAllBookings();
	}
	
	
	@RequestMapping("/getBooking/{bookingId}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Booking getBookingById(@PathVariable Integer bookingId) {
		return bookingService.getBookingById(bookingId);
	}
	
	@RequestMapping("/save")
	@CrossOrigin(origins = "http://localhost:4200")
	public String saveBooking(@RequestBody String booking) {
		return bookingService.addBooking(booking);
	}
	
	@RequestMapping("/delete/{bookingId}")
	@CrossOrigin(origins = "http://localhost:4200")
	public String deleteBooking(@PathVariable Integer bookingId) {
		return bookingService.deletebooking(bookingId);
	}
	
	
	
	
}
