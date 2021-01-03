package com.dav.gateway.service;

import com.dav.gateway.entity.User;
import com.dav.gateway.entity.UserRole;

public interface UserService {

	User findUserByUserName(String username);

	UserRole getPrimaryRoleByUserId(Long userId);  
	
}
	