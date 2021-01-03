package com.dav.gateway.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dav.gateway.entity.UserRole;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {

	@Query("FROM UserRole WHERE user.id=:userId AND is_primary=true") 
	UserRole getPrimaryRoleByUserId(@Param("userId")Long userId); 

}
	