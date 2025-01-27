package com.micro.user.entity.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.micro.user.entity.Rating;
import com.micro.user.entity.UserEntity;
import com.micro.user.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/getUsers")
	public ResponseEntity<List<UserEntity>> getUser(){
		
		return new ResponseEntity(userService.getUsers(),HttpStatus.OK);
	}
	
	@GetMapping("/getUser/{id}")
	public ResponseEntity<List<UserEntity>> getUserById(@PathVariable Long id){
		
		UserEntity user = userService.getUserById(id);
		
		ArrayList<Rating> ratingresult = restTemplate.getForObject("http://localhost:8082/getAllRating", ArrayList.class);
		
		user.setRating(ratingresult);
		
		return new ResponseEntity(user,HttpStatus.OK);
	}

}
