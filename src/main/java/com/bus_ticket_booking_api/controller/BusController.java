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

import com.bus_ticket_booking_api.interface_dao.BusDAO;
import com.bus_ticket_booking_api.model_class.Bus;

@RestController

public class BusController {


		@Autowired
		BusDAO busRepository;
		
		@PostMapping("Buses/save")// create user
		public void save(@RequestBody Bus bus) 
		{
	        busRepository.save(bus);
			}
		
		@GetMapping("Buses/list")// list user
		public List<Bus> findAll() {
			List<Bus> list=busRepository.findAll();
			return list;
			
		}
		
		@PutMapping("Buses/{id}")// update user
		public void update(@PathVariable("id") Integer id,@RequestBody Bus bus)
		{
			bus.setBusId(id);
			busRepository.save(bus);
		}
		
		@DeleteMapping("Buses/{id}")// delete user
		public void delete(@PathVariable("id")Integer id)
		{
			busRepository.deleteById(id);
		}
		
		@GetMapping("Buses/{id}")
		public Bus findById(@PathVariable("id") Integer id) {
			Optional<Bus> list=busRepository.findById(id);
			if(list.isPresent()) {
				return list.get();
			}
			else {
			return null;
		     }
		}
}

//			@GetMapping("User/search")
//			public List<User> user
//			}
//		
