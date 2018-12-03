package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Prueba;
import com.example.demo.service.PruebaService;

@RestController
@RequestMapping("/")
public class HelloWorldController {
	
	@Autowired
	@Qualifier("pruebaService")
	private PruebaService pruebaService;
	
	@GetMapping("/getPruebas")
	public List<Prueba> getPruebas() {		
		return pruebaService.getItems();
	}
	
	@RequestMapping(value = "/insertPrueba", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public void insertPrueba(@RequestBody Prueba prueba) {
		pruebaService.addItem(prueba);
	}
	
	@GetMapping("/deletePrueba")
	public void deletePrueba(Prueba prueba) {
		pruebaService.deleteItem(prueba);
	}
	
	@GetMapping("/cleanPruebaTable")
	public void cleanPruebaTable() {
		pruebaService.clean();
	}
}
