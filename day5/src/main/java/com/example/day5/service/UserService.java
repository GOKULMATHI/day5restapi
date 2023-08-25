package com.example.day5.service;

import java.util.List;

import com.example.day5.model.UserModel;

public interface UserService {
	public boolean addUser(UserModel user);
	public List<UserModel> getUser();
	public boolean updateUser(Long id, UserModel user);
	public boolean deleteUser(Long id);

	
	

}
