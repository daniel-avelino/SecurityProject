package com.security.feign;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FeignEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonProperty("All")
	private All all;
		
	public FeignEntity() {
	}

	public FeignEntity(All all) {
		this.all = all;
	}

	public All getAll() {
		return all;
	}

	public void setAll(All all) {
		this.all = all;
	}

	@Override
	public String toString() {
		return "FeignEntity [all=" + all + "]";
	}

	
	
}
