package com.bus_ticket_booking_api.interface_dao;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bus_ticket_booking_api.model_class.Bus;
import com.bus_ticket_booking_api.model_class.TicketBooking;

@Repository
public interface BookingDAO extends JpaRepository<TicketBooking,Integer>{
@Query("select b from Bus b where b.busId= :id")
Optional<Bus> findByBusId(@Param("id") Integer id);

}
