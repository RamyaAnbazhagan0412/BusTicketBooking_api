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
@Table(name="user")
public class User {


	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private int userId;
	
	@Column(name="user_name")
	private String  userName;
	
	@Column(name="user_emailId")
	private String emailId;
	
	@Column(name="user_password")
	private String password;
	
	@Column(name="user_phoneNumber")
	private String phoneNumber;

	public void setId(Integer id) {
		
	}
}
