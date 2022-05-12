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
@Table(name="bus_ticket_booking_app_display")
public class Bus {
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="bus_id")
	private int   busId;
	
	@Column(name="bus_name")
	private String busName;
	
	@Column(name="bus_from")
	private String busFrom;
	
	@Column(name="bus_to")
	private String busTo;
	
	@Column(name="bus_timing")
	private String busTiming;
	
	@Column(name="bus_tickets")
	private int  busTicketsAvailable;
	
	@Column(name="bus_ticket_price")
	private int  busTicketPrice;
	
	@Column(name="bus_stopping")
	private String  busStop;
	
	
}
