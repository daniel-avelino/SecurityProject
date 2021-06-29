package com.security.feign;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Regions  implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	private String lat;
	
	@JsonProperty("long")
    private String longi;
	
    private Integer confirmed;
    private Integer recovered;
    private Integer deaths;
    private String updated;
    
    public Regions() {
    }

	public Regions(String lat, String longi, Integer confirmed, Integer recovered, Integer deaths, String updated) {
		this.lat = lat;
		this.longi = longi;
		this.confirmed = confirmed;
		this.recovered = recovered;
		this.deaths = deaths;
		this.updated = updated;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLongi() {
		return longi;
	}

	public void setLongi(String longi) {
		this.longi = longi;
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

	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}
    
    
}
