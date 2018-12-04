package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Experience;

public interface ExperienceService {
	
	public List<Experience> getExperienceList();
	public void insertExperience(Experience experience);

}
