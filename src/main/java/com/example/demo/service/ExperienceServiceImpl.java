package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Experience;
import com.example.demo.repository.ExperienceRepository;

@Service("experienceService")
public class ExperienceServiceImpl implements ExperienceService{

	@Autowired
	@Qualifier("experienceRepository")
	private ExperienceRepository experienceRepository;
	
	@Override
	public List<Experience> getExperienceList() {
		return experienceRepository.findAll();
	}

	@Override
	public void insertExperience(Experience experience) {
		experienceRepository.save(experience);
		
	}

}
