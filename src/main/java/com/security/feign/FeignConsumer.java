package com.security.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "covid", url = "https://covid-api.mmediagroup.fr/v1/cases")
public interface FeignConsumer {

	@GetMapping
	public List<FeignEntity> getCasesByCountry(@RequestParam("country") String country);
}