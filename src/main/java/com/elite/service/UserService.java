package com.elite.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elite.dao.UserRepository;
import com.elite.entity.UserEntity;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public UserEntity createUser(UserEntity user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	public List<UserEntity> getUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	public UserEntity getUsers(Long userId) {
		// TODO Auto-generated method stub
		return userRepository.findById(userId).get();
	}

}
