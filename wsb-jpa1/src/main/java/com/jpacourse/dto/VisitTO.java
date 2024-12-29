package com.jpacourse.dto;

import com.jpacourse.persistence.enums.TreatmentType;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

public class VisitTO implements Serializable {

    private Long id;
    private String description;
    private LocalDateTime time;
    private String doctorName;
    private String doctorLastName;
    private List<TreatmentType> treatmentTypes;


    // Getters and Setters
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

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorLastName() {
        return doctorLastName;
    }

    public void setDoctorLastName(String doctorLastName) {
        this.doctorLastName = doctorLastName;
    }

    public List<TreatmentType> getTreatmentTypes() {
        return treatmentTypes;
    }

    public void setTreatmentTypes(List<TreatmentType> treatmentTypes) {
        this.treatmentTypes = treatmentTypes;
    }
}