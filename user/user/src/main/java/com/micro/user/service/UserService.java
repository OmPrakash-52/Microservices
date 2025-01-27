package com.micro.user.service;

import java.util.List;
import java.util.Optional;

import com.micro.user.entity.UserEntity;

public interface UserService {
	
	public List<UserEntity> getUsers();
	
	public UserEntity getUserById(Long id);

}
