package com.micro.rating.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.rating.entity.RatingEntity;
import com.micro.rating.service.RatingService;

@RestController
public class RatingController {
	
	@Autowired
	RatingService ratingService;

	@GetMapping("/getAllRating")
	public List<RatingEntity> getAllRating(){
		return ratingService.getAllRatingById();
	}
}
