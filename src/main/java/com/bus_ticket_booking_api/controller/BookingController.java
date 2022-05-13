package com.bus_ticket_booking_api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bus_ticket_booking_api.interface_dao.BookingDAO;
import com.bus_ticket_booking_api.model_class.TicketBooking;

@RestController
public class BookingController {
	@Autowired
	BookingDAO bookingRepository;
	
	@PostMapping("Booking/save")// create booking
	public void save(@RequestBody TicketBooking book) 
	{
		bookingRepository.save(book);
		}
	
	@GetMapping("Booking/list")// list booking
	public List<TicketBooking> findAll() {
		List<TicketBooking> list=bookingRepository.findAll();
		return list;
		
	}
	
//	@GetMapping("Booking/BusById")// get bus details
//	public Bus findByBusId(@Param("id") Integer id){
//		Optional<Bus> list=bookingRepository.findByBusId(id);
//		System.out.println(list);
//		bookingRepository.setBusId(list.busId);
//		if(list.isPresent()) {
//			return list.get();
//		}
//		else {
//		return null;
//	     }
//	}
	
	@PutMapping("Booking/id")// update user
	public void update(@RequestParam("id") Integer id,@RequestBody TicketBooking book)
	{
		book.setBookingId(id);
		bookingRepository.save(book);
	}
	
	@DeleteMapping("Booking/{id}")// delete user
	public void delete(@PathVariable("id")Integer id)
	{
		bookingRepository.deleteById(id);
	}
	
	@GetMapping("Booking/byId")
	public TicketBooking findById(@RequestParam("id") Integer id) {
		Optional<TicketBooking> list=bookingRepository.findById(id);
		System.out.println(list);
		if(list.isPresent()) {
			return list.get();
		}
		else {
		return null;
	     }
	}
}


