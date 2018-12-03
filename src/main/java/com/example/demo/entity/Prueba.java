package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity(name = "prueba")
public class Prueba implements Serializable{
	
	private static final long serialVersionUID = 1128309062701656543L;

	@Id
	@GeneratedValue
	@JsonProperty("id")
	@Column(name = "id")
	private int id;
	
	@JsonProperty("value")
	@Column(name = "value")
	private String value;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	

}
