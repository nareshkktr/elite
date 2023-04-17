package com.elite.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elite.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>{

}
