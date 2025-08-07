package com.example.User_demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.User_demo.Entity.User;
import com.example.User_demo.exception.ResourceNotFoundException;
import com.example.User_demo.repository.Userrepostiory;

@Service
public class Userservice {

	@Autowired
	private Userrepostiory userrepostiory;
	
	public List<User> getAllUser(){
		
		return userrepostiory.findAll();
	}
	
	public User getUserById(Long id) {
		return userrepostiory.findById(id).
				orElseThrow(()-> new ResourceNotFoundException("User Is Not Found :" +id));
	}
	
	public User createUser(User user) {
        return userrepostiory.save(user);
    }
	
	public User updateUser(Long id,User userdetails) {
		
		User exist=getUserById(id);
		
		exist.setName(userdetails.getName());
		exist.setAdress(userdetails.getAdress());
		return userrepostiory.save(exist);
		
	}
	
	public void deleteUser(Long id) {
        userrepostiory.deleteById(id);
    }
	
}
