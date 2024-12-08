package com.jpacourse.persistence.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "VISIT")
public class VisitEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String description;

	@Column(nullable = false)
	private LocalDateTime time;

//	//DOCTOR_ID >- ManyToOne relacja jednokierunkowa, wymagana wartość
//	@ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE}, optional = false)
//	@JoinColumn(name="DOCTOR_ID")
//	private DoctorEntity doctorEntity;
//	public PatientEntity getPatientEntity(){
//		return patientEntity;
//	}

	// DOCTOR_ID Bilateral, non-nullable, relationship.
	// Doctor -> parent, Visit -> child.
	@ManyToOne
	@JoinColumn(name = "DOCTOR_ID", nullable = false)
	private DoctorEntity doctor;

	// PATIENT_ID, Unilateral non-nullable, relationship,
	// Medical Treatment -> Visit -> Unilateral
	@ManyToOne
	@JoinColumn(name = "PATIENT_ID", nullable = false)
	private PatientEntity patient;

	// MEDICAL_TREATMENT_ID, Unilateral relationship, with orphan removal
	// Medical Treatment -> Visit -> Unilateral
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
	@JoinColumn(name = "VISIT_ID", nullable = false)
	private List<MedicalTreatmentEntity> medicalTreatment;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

}
