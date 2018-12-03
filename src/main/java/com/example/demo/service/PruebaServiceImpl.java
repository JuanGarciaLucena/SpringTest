package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Prueba;
import com.example.demo.repository.PruebaRepository;

@Service("pruebaService")
public class PruebaServiceImpl implements PruebaService{
	
	@Autowired
	@Qualifier("pruebaRepository")
	private PruebaRepository pruebaRepository;

	@Override
	public List<Prueba> getItems() {
		return pruebaRepository.findAll();
	}
	
	@Override
	public void addItem(Prueba prueba) {
		pruebaRepository.save(prueba);
	}
	
	@Override
	public void deleteItem(Prueba prueba) {
		pruebaRepository.delete(prueba);
	}
	
	@Override
	public void clean() {
		pruebaRepository.deleteAll();
	}
}
