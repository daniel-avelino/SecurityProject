package com.security.feign;

import java.io.Serializable;

public class All implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer confirmed;
	private Integer recovered;
	private Integer deaths;
	private Integer population;
	private String updated;

	private Integer administered;
	private Integer people_vaccinated;
	private Integer people_partially_vaccinated;

	public All() {
	}

	public All(Integer confirmed, Integer recovered, Integer deaths, Integer population, String updated) {
		this.confirmed = confirmed;
		this.recovered = recovered;
		this.deaths = deaths;
		this.population = population;
		this.updated = updated;
	}

	public All(Integer population, String updated, Integer administered, Integer people_vaccinated,
			Integer people_partially_vaccinated) {
		this.population = population;
		this.updated = updated;
		this.administered = administered;
		this.people_vaccinated = people_vaccinated;
		this.people_partially_vaccinated = people_partially_vaccinated;
	}

	public Integer getAdministered() {
		return administered;
	}

	public void setAdministered(Integer administered) {
		this.administered = administered;
	}

	public Integer getPeople_vaccinated() {
		return people_vaccinated;
	}

	public void setPeople_vaccinated(Integer people_vaccinated) {
		this.people_vaccinated = people_vaccinated;
	}

	public Integer getPeople_partially_vaccinated() {
		return people_partially_vaccinated;
	}

	public void setPeople_partially_vaccinated(Integer people_partially_vaccinated) {
		this.people_partially_vaccinated = people_partially_vaccinated;
	}

	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
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
