package com.security.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.dto.UserDTO;
import com.security.services.UserService;

@RestController
@RequestMapping(path = "/users")
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping
	public ResponseEntity<?> insertUser(@RequestBody UserDTO dto) {
		service.insertUser(dto);
		return new ResponseEntity(HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<?> getUsers() {
		return ResponseEntity.ok().body(service.findAll());
	}

}
