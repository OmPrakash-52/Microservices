package com.micro.user.entity.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.micro.user.Repo.UserRepository;
import com.micro.user.entity.UserEntity;
import com.micro.user.service.UserService;

@Component
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRespository;

	@Override
	public List<UserEntity> getUsers() {
		return userRespository.findAll();
	}

	@Override
	public UserEntity getUserById(Long id) {
		return userRespository.findById(id).orElse(null);
	}

}
