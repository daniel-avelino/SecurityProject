package com.security.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class RoleDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String role;
	private Set<UserDTO> user = new HashSet<>();

	public RoleDTO() {
	}

	public RoleDTO(Long id, String role) {
		this.id = id;
		this.role = role;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Set<UserDTO> getUser() {
		return user;
	}
	

}
