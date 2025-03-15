package com.Assignment_Crud_Operations.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Assignment_Crud_Operations.Models.Technology;
import com.Assignment_Crud_Operations.Services.TechnologyService;

@RestController
@RequestMapping("/technologies")
public class TechnologyController {

	@Autowired
	private TechnologyService technologyService;

	@GetMapping
	public List<Technology> getAllTechnologies() {
		return technologyService.getAllTechnologies();
	}

	@PostMapping
	public Technology addTechnology(@RequestBody Technology technology) {
		return technologyService.saveTechnology(technology);
	}

	@DeleteMapping("/{id}")
	public void deleteTechnology(@PathVariable long id) {
		technologyService.deleteTechnology(id);
	}
}
