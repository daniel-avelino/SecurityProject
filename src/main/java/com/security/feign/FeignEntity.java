package com.security.feign;

import java.io.Serializable;

public class FeignEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer confirmed;
	private Integer recovered;
	private Integer deaths;
	private Integer population;

	public FeignEntity() {
	}

	public FeignEntity(Integer confirmed, Integer recovered, Integer deaths, Integer population) {
		this.confirmed = confirmed;
		this.recovered = recovered;
		this.deaths = deaths;
		this.population = population;
	}

	public Integer getConfirmed() {
		return confirmed;
	}

	public void setConfirmed(Integer confirmed) {
		this.confirmed = confirmed;
	}

	public Integer getRecovered() {
		return recovered;
	}

	public void setRecovered(Integer recovered) {
		this.recovered = recovered;
	}

	public Integer getDeaths() {
		return deaths;
	}

	public void setDeaths(Integer deaths) {
		this.deaths = deaths;
	}

	public Integer getPopulation() {
		return population;
	}

	public void setPopulation(Integer population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "FeignEntity [confirmed=" + confirmed + ", recovered=" + recovered + ", deaths=" + deaths
				+ ", population=" + population + "]";
	}

	
}
