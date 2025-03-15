package com.Assignment_Crud_Operations.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Assignment_Crud_Operations.Models.Technology;

@Repository
public interface TechnologyRepository extends JpaRepository<Technology, Long> {

}
