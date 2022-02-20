package com.ps.cloud.security.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ps.cloud.security.model.User;


public interface UserRepository extends JpaRepository<com.ps.cloud.security.model.User, Long> {
	User findByEmail(String email);

}
