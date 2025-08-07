package com.example.User_demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.User_demo.Entity.User;
import com.example.User_demo.service.Userservice;

@RestController
@RequestMapping("/api/users")
public class Usercontoller {

	@Autowired
	private Userservice service;
	
	@GetMapping
	public List<User> getAllUser(){
		
		return service.getAllUser();
	}
	
	@GetMapping("{id}")
	public User getUserById(@PathVariable Long id) {
		return service.getUserById(id);
	}
	
	@PostMapping
	public User createUser(@RequestBody User user) {
		
		return service.createUser(user);
	}
	
	@PutMapping("{id}")
	public User updateUser(@PathVariable Long id,@RequestBody  User userdetails) {
		
		return service.updateUser(id, userdetails);
	}
	
	@DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        service.deleteUser(id);
    }
	
	
	
	
	
	
	
	
	
}
