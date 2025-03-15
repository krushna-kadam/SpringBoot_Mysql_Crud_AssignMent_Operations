package com.Assignment_Crud_Operations.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Candidate {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	private String contactNumber;
	private String degreeName;
	private int degreeYear;

	@ManyToOne
	@JoinColumn(name = "technology_id")
	private Technology technology;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getDegreeName() {
		return degreeName;
	}

	public void setDegreeName(String degreeName) {
		this.degreeName = degreeName;
	}

	public int getDegreeYear() {
		return degreeYear;
	}

	public void setDegreeYear(int degreeYear) {
		this.degreeYear = degreeYear;
	}

	public Technology getTechnology() {
		return technology;
	}

	public void setTechnology(Technology technology) {
		this.technology = technology;
	}

	@Override
	public String toString() {
		return "Candidate [id=" + id + ", name=" + name + ", email=" + email + ", contactNumber=" + contactNumber
				+ ", degreeName=" + degreeName + ", degreeYear=" + degreeYear + ", technology=" + technology + "]";
	}

}
