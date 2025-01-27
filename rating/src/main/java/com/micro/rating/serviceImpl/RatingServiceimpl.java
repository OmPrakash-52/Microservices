package com.micro.rating.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.micro.rating.entity.RatingEntity;
import com.micro.rating.repository.RatingRepository;
import com.micro.rating.service.RatingService;

@Component
public class RatingServiceimpl implements RatingService{

	@Autowired
	private RatingRepository ratingRepository;

	@Override
	public List<RatingEntity> getAllRatingById() {
		// TODO Auto-generated method stub
		return ratingRepository.findAll();
	}
	
	

}
