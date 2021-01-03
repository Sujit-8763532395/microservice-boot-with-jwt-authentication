package com.dav.gateway.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dav.gateway.entity.User;
import com.dav.gateway.entity.UserRole;
import com.dav.gateway.repository.UserRepository;
import com.dav.gateway.repository.UserRoleRepository;

@Service
public class UserServiceImpl implements UserService {
	
	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	private UserRepository userRepository; 
	
	@Autowired
	private UserRoleRepository userRoleRepository; 
	
	@Override
	public User findUserByUserName(String username) {
		return userRepository.findByUserName(username); 
	}

	@Override
	public UserRole getPrimaryRoleByUserId(Long userId) {
		return userRoleRepository.getPrimaryRoleByUserId(userId); 
	}
	
}
	