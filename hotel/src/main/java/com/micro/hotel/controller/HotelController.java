package com.micro.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.hotel.entity.HotelEntity;
import com.micro.hotel.service.HotelService;

@RestController
public class HotelController {
	
	@Autowired
	HotelService hotelService;
	
	@GetMapping("/getAllHotel")
	public ResponseEntity<List<HotelEntity>> getAllHotel(){
		return new ResponseEntity(hotelService.getAllHotel(),HttpStatus.OK); 
	}

}
