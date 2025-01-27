package com.micro.hotel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.micro.hotel.entity.HotelEntity;

@Repository
public interface HotelRepository extends JpaRepository<HotelEntity, Long>{

	
}
