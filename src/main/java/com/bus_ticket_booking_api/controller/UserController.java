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
import org.springframework.web.bind.annotation.RestController;

import com.bus_ticket_booking_api.interface_dao.UserDAO;
import com.bus_ticket_booking_api.model_class.User;

@RestController
public class UserController {

	@Autowired
	UserDAO userRepository;
	
	@PostMapping("User/save")// create user
	public void save(@RequestBody User user) 
	{
        userRepository.save(user);
		}
	
	@GetMapping("User/list")// list user
	public List<User> findAll() {
		List<User> list=userRepository.findAll();
		return list;
		
	}
	
	@PutMapping("User/update")// update user
	public void update(@PathVariable("id") Integer id,@RequestBody User user)
	{
		user.setId(id);
		userRepository.save(user);
	}
	
	@DeleteMapping("User/{id}")// delete user
	public void delete(@PathVariable("id")Integer id)
	{
		userRepository.deleteById(id);
	}
	
	@GetMapping("User/{id}")
	public User findById(@PathVariable("id") Integer id) {
		Optional<User> list=userRepository.findById(id);
		if(list.isPresent()) {
			return list.get();
		}
		else {
		return null;
	     }
		
}
}