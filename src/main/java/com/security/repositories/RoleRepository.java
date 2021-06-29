package com.security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.security.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

	Role findByRole(String role);
}
