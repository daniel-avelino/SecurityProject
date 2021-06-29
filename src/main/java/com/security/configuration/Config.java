package com.security.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.security.entities.Role;
import com.security.entities.User;
import com.security.repositories.RoleRepository;
import com.security.repositories.UserRepository;

@Configuration
public class Config implements CommandLineRunner {

	@Autowired
	private UserRepository repository;

	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private BCryptPasswordEncoder encoder;

	@Override
	public void run(String... args) throws Exception {

		User user = new User(null, "Daniel", "daniel@daniel", encoder.encode("1234"));
		Role role = new Role(null, "ROLE_ADMIN");
		roleRepository.saveAndFlush(role);
		user.getRoles().add(role);
		repository.saveAndFlush(user);

	}

}
