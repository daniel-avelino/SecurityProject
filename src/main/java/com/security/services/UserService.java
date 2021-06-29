package com.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.security.dto.UserDTO;
import com.security.entities.User;
import com.security.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public void insertUser(UserDTO userDTO) {
		User user = new User(userDTO);
		repository.save(user);
	}
}
