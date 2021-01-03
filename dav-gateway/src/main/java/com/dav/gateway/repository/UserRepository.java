package com.dav.gateway.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dav.gateway.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	@Query("FROM User WHERE userName=:username")
	User findByUserName(@Param("username") String username); 

}
	