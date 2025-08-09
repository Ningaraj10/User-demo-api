package com.example.User_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.User_demo.Entity.User;

public interface Userrepostiory extends JpaRepository<User, Long> {

}
