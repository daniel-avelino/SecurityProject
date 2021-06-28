package com.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.security.feign.FeignConsumer;
import com.security.feign.FeignEntity;

@Service
public class FeignServices {

	@Autowired
	private FeignConsumer feign;
	
	
	public FeignEntity getCasesByCountry(String country) {
		 feign.getCasesByCountry(country);
		 feign.getCasesByCountry(country).get(0);
		return feign.getCasesByCountry(country).get(0);
	}
}
