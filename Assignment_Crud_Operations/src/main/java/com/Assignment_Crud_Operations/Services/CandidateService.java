package com.Assignment_Crud_Operations.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Assignment_Crud_Operations.Models.Candidate;
import com.Assignment_Crud_Operations.Repositories.CandidateRepository;

@Service
public class CandidateService {

	@Autowired
	private CandidateRepository candidateRepository;

	public List<Candidate> getAllCandidates() {
		return candidateRepository.findAll();
	}

	public Candidate saveCandidate(Candidate candidate) {
		return candidateRepository.save(candidate);
	}

	public void deleteCandidate(Long id) {
		candidateRepository.deleteById(id);
	}

}
