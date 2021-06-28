package com.security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.security.entities.User;

@Repository 
public interface UserRepository extends JpaRepository<User, Long>{

}
