package com.example.demo.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity(name = "experience")
public class Experience {
	
	@Id
	@GeneratedValue
	@JsonProperty("id")
	@Column(name = "id")
	private int id;
	
	@JsonProperty("companyName")
	@Column(name = "company_name")
	private String companyName;
	
	@JsonProperty("startDate")
	@Column(name = "start_date")
	private String startDate;
	
	@JsonProperty("endDate")
	@Column(name = "end_date")
	private String endDate;
	
	@JsonProperty("description")
	@Column(name = "description")
	private String description;
	
	@JsonProperty("position")
	@Column(name = "position")
	private String position;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	

}
