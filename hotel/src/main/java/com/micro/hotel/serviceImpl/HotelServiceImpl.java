package com.micro.hotel.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.micro.hotel.Repository.HotelRepository;
import com.micro.hotel.entity.HotelEntity;
import com.micro.hotel.service.HotelService;

@Component
public class HotelServiceImpl implements HotelService{
	
	@Autowired
	HotelRepository hotelRepository;

	@Override
	public List<HotelEntity> getAllHotel() {
		return hotelRepository.findAll();
	}


}
