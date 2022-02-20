package com.ps.cloud.security.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ps.cloud.security.model.Role;

public interface RoleRepo extends JpaRepository<Role, Long> {

}
