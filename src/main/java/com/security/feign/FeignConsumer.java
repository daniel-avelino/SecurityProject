package com.security.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "covid", url = "https://covid-api.mmediagroup.fr/v1")
public interface FeignConsumer {

	@GetMapping(path = "/cases")
	public FeignEntity getCasesByCountry(@RequestParam(value = "country", defaultValue = "") String country);

	@GetMapping(path = "/vaccines")
	public FeignEntity getVaccinesByCountry(@RequestParam(value = "country", defaultValue = "") String country);
}
