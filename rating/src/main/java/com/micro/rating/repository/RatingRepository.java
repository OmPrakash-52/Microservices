package com.micro.rating.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.micro.rating.entity.RatingEntity;

@Repository
public interface RatingRepository extends JpaRepository<RatingEntity, Long>{

}
