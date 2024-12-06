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

	private String description;

	@Column(nullable = false)
	private LocalDateTime time;


//	//PATIENT_ID >- ManyToOne relacja jednokierunkowa, z optional ustawionym na false
//	@ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE}, optional = false)
//	@JoinColumn(name="PATIENT_ID")
//	private PatientEntity patientEntity;
//
//	//DOCTOR_ID >- ManyToOne relacja jednokierunkowa, wymagana wartość
//	@ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE}, optional = false)
//	@JoinColumn(name="DOCTOR_ID")
//	private DoctorEntity doctorEntity;
//	public PatientEntity getPatientEntity(){
//		return patientEntity;
//	}

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
