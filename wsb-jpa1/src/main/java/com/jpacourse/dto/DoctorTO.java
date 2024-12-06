package com.jpacourse.dto;

import com.jpacourse.persistence.enums.Specialization;

import java.io.Serializable;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.swing.text.html.HTMLDocument;

public class DoctorTO implements Serializable {

    private Long id;
    private String first_name;
    private String last_name;
    private String telephone_number;
    private String email;
    private String doctorNumber;
    private Specialization specialization;

    // Getters and Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return first_name;
    }
    public void setFirstName(String first_name) {
        this.first_name = first_name;
    }

    public String getLastName() {
        return last_name;
    }
    public void setLastName(String last_name) {
        this.last_name = last_name;
    }

    public String getTelephoneNumber() {
        return telephone_number;
    }
    public void setTelephoneNumber(String telephone_number) {
        this.telephone_number = telephone_number;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getDoctorNumber() {
        return doctorNumber;
    }
    public void setDoctorNumber(String doctorNumber) {
        this.doctorNumber = doctorNumber;
    }

    public Specialization getSpecialization() {
        return specialization;
    }
    public void setSpecialization(Specialization specialization){
        this.specialization = specialization;
    }

}
