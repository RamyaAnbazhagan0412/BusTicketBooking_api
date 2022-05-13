package com.bus_ticket_booking_api.model_class;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="booking_bus")

public class TicketBooking {
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="booking_id")
	private int bookingId;
	
	@Column(name="bus_id")
	private int  busId;
	
	
	@Column(name="user_id")
	private String userId;
	
	@Column(name="booking_date")
	private String bookingDate;
	
	
	@Column(name="date_of_travelling")
	private String dateOfTravelling;
	
	@Column(name="number_of_tickets_booked")
	private int  numberOfTicketsBooked;
	
	@Column(name="total_amount")
	private int  totalAmount;
	
	@Column(name="status")
	private String  status;
	 
	
	

}
