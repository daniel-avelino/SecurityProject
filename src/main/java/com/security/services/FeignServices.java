package com.security.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.security.feign.FeignConsumer;
import com.security.feign.FeignEntity;

@Service
public class FeignServices {

	@Autowired
	private FeignConsumer feign;

	public FeignEntity getCasesByCountry(String country) {
		System.out.println(stringValidator(country));
		return feign.getCasesByCountry(stringValidator(country));
	}

	public String stringValidator(String country) {
		String lowerCountry = country.toLowerCase();
		String[] words = lowerCountry.split(" ");
		if (words.length > 1) {
			StringBuilder builder = new StringBuilder();
			for (String string : words) {
				builder.append(StringUtils.capitalize(string));
				builder.append(" ");
			}
			builder = builder.delete(builder.length() - 1, builder.length());
			return builder.toString();
		} else {
			return StringUtils.capitalize(lowerCountry);
		}

	}
}
