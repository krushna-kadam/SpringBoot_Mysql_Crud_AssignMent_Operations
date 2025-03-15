package com.Assignment_Crud_Operations.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Assignment_Crud_Operations.Models.Technology;
import com.Assignment_Crud_Operations.Repositories.TechnologyRepository;

@Service
public class TechnologyService {

	private TechnologyRepository technologyRepository;

	public List<Technology> getAllTechnologies() {
		return technologyRepository.findAll();
	}

	public Technology saveTechnology(Technology technology) {
		return technologyRepository.save(technology);
	}

	public void deleteTechnology(Long id) {
		technologyRepository.deleteById(id);
	}
}