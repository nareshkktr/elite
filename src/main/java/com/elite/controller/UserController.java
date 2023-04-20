package com.elite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elite.entity.UserEntity;
import com.elite.service.UserService;

@RestController
@RequestMapping("api/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
   
	@PostMapping
    public ResponseEntity<UserEntity> createUser(@RequestBody UserEntity user){
    	UserEntity savedUser = userService.createUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }
	
	@GetMapping
    public ResponseEntity<List<UserEntity>> getUsers(){
    	List<UserEntity> getUser = userService.getUsers();
        return new ResponseEntity<>(getUser, HttpStatus.CREATED);
    }
	
	@GetMapping("{id}")
    public ResponseEntity<UserEntity> getUser(@PathVariable("id") Long userId){
    	UserEntity getUser = userService.getUsers(userId);
        return new ResponseEntity<>(getUser, HttpStatus.OK);
    }
}
