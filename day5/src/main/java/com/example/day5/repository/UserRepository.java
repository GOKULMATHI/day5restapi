package com.example.day5.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day5.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long>{

	boolean existsByMailid(String mailid);
	

}
