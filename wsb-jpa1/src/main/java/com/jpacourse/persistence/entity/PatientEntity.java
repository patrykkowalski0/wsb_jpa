package com.jpacourse.persistence.entity;

import java.time.LocalDate;
import javax.persistence.*;

import java.time.Period;
import java.time.LocalDate;

import java.util.List;

@Entity
@Table(name = "PATIENT")
public class PatientEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String firstName;

	@Column(nullable = false)
	private String lastName;

	@Column(nullable = false)
	private String telephoneNumber;

	@Column(nullable = false)
	private String email;

	@Column(nullable = false)
	private String patientNumber;

	@Column(nullable = true)
	private LocalDate dateOfBirth;

	@Column(nullable = false)
	private Integer age; // new field


	// ADDRESS_ID Unilateral, non-nullable, relationship with orphan removal.
	// Patient -> parent, Address -> child.
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = true, orphanRemoval = true)
	private AddressEntity address;


	// VISIT_ID Bilateral, nullable, relationship.
	// Patient -> parent, Visit -> child.
	@OneToMany(mappedBy = "patient", fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
	private List<VisitEntity> visits;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPatientNumber() {
		return patientNumber;
	}

	public void setPatientNumber(String patientNumber) {
		this.patientNumber = patientNumber;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public static int calculateAge(LocalDate dateOfBirth) {
		if (dateOfBirth == null) {
			throw new IllegalArgumentException("Date of birth cannot be null");
		}
		return Period.between(dateOfBirth, LocalDate.now()).getYears();
	}
	public int getAge(){
		if (dateOfBirth == null) {
			throw new IllegalArgumentException("Date of birth cannot be null");
		}
		return Period.between(dateOfBirth, LocalDate.now()).getYears();
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public AddressEntity getAddress() {
		return address;
	}

	public void setAddress(AddressEntity address) {
		this.address = address;
	}

	public List<VisitEntity> getVisits() {
		return visits;
	}

	public void setVisits(List<VisitEntity> visits) {
		this.visits = visits;
	}
}
