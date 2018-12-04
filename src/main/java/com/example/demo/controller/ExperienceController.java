package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Experience;
import com.example.demo.service.ExperienceService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/")
public class ExperienceController {
	
	@Autowired
	@Qualifier("experienceService")
	private ExperienceService experienceService;
	
	@GetMapping("/getExperienceList")
	public List<Experience> getPruebas() {		
		return experienceService.getExperienceList();
	}
	
	@RequestMapping(value = "/insertExperience", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public void insertExperience(@RequestBody Experience experience) {
		experienceService.insertExperience(experience);
	}
}
