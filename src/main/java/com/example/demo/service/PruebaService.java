package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Prueba;

public interface PruebaService {
	
	public List<Prueba> getItems();
	public void addItem(Prueba prueba);
	public void deleteItem(Prueba prueba);
	public void clean();
}
