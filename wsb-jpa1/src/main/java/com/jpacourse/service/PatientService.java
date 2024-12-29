package com.jpacourse.service;

import com.jpacourse.dto.*;
import com.jpacourse.persistence.entity.PatientEntity;

import java.time.LocalDate;
import java.util.List;

public interface PatientService {

    PatientTO findById(final Long id);

    PatientEntity save(PatientEntity patient);

    void delete(final Long id);

    void addVisit(final Long patientId, final Long doctorId, final String description, final LocalDate visitDate);

}

