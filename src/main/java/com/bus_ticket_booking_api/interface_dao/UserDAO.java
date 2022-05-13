package com.bus_ticket_booking_api.interface_dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bus_ticket_booking_api.model_class.User;
@Repository
public interface UserDAO extends JpaRepository<User,Integer>{

}
