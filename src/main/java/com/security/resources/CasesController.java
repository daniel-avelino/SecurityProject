package com.security.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.security.services.FeignServices;

@RestController
@RequestMapping(path = "/")
public class CasesController {

	@Autowired
	private FeignServices feign;

	@GetMapping(path = "cases")
	public ResponseEntity<?> getCases(@RequestParam("country") String country) {
		return ResponseEntity.ok().body(feign.getCasesByCountry(country));
	}
}
