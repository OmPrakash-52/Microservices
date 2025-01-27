package com.micro.user.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.micro.user.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long>{

}
