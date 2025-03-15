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

import com.Assignment_Crud_Operations.Models.Candidate;
import com.Assignment_Crud_Operations.Services.CandidateService;

@RestController
@RequestMapping("/candidates")
public class CandidateController {

	@Autowired
	private CandidateService candidateService;

	@GetMapping
	public List<Candidate> getAllCandidates() {
		return candidateService.getAllCandidates();
	}

	@PostMapping
	public Candidate addCandidate(@RequestBody Candidate candidate) {
		return candidateService.saveCandidate(candidate);
	}

	@DeleteMapping("/{id}")
	public void deleteCandidate(@PathVariable Long id) {
		candidateService.deleteCandidate(id);
	}
}
