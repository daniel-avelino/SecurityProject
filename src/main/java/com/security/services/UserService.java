package com.security.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.security.dto.UserDTO;
import com.security.entities.Role;
import com.security.entities.User;
import com.security.repositories.RoleRepository;
import com.security.repositories.UserRepository;

@Service
public class UserService implements UserDetailsService {

	@Autowired
	private UserRepository repository;

	@Autowired
	private RoleRepository roleRepository;

	public void insertUser(UserDTO userDTO) {
		User user = new User(userDTO);
		repository.save(user);
	}

	public List<UserDTO> findAll() {
		List<User> users = repository.findAll();
		List<UserDTO> usersDTO = users.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
		return usersDTO;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		try {
			return repository.findByEmail(username);
		} catch (Exception e) {
			throw new UsernameNotFoundException("User not found:" + username);
		}
	}

	

}
