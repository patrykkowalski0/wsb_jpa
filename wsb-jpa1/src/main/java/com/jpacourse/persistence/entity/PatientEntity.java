package com.jpacourse.persistence.entity;

import java.time.LocalDate;
import javax.persistence.*;

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

	@Column(nullable = false)
	private LocalDate dateOfBirth;


//	//ADDRESS_ID - OneToOne - jednokierunkowa z usunięciem sierot
//	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
//	private AddressEntity addressEntity;

	// ADDRESS_ID Unilateral, non-nullable, relationship with orphan removal.
	// Patient -> parent, Address -> child.
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false, orphanRemoval = true)
	private AddressEntity address;

//	//VISIT_ID - Relacja jeden do wielu dwiukierunkowa
//	@OneToMany (cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "VISIT_ID")
//	private List<VisitEntity> visits;

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

}
