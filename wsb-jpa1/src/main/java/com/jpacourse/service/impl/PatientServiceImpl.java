package com.jpacourse.service.impl;

import com.jpacourse.dto.PatientTO;
import com.jpacourse.mapper.*;
import com.jpacourse.persistence.dao.*;
import com.jpacourse.persistence.entity.*;
import com.jpacourse.service.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;


@Service
@Transactional
public class PatientServiceImpl implements PatientService
{
    private final PatientDao patientDao;

    @Autowired
    public PatientServiceImpl(PatientDao pPatientDao)
    {
        patientDao = pPatientDao;
    }

    @Override
    public PatientTO findById(Long id) {
        final PatientEntity entity = patientDao.findOne(id);
        return PatientMapper.mapToTO(entity);

    }

    @Override
    @Transactional
    public PatientEntity save(PatientEntity patient) {
        return patientDao.save(patient);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        patientDao.delete(id);
    }

    @Override
    @Transactional
    public void addVisit(Long patientId, Long doctorId, String description, LocalDate visitDate) {
        PatientEntity patient = patientDao.findOne(patientId);
        if (patient == null) {
            throw new IllegalArgumentException("Patient not found with ID: " + patientId);
        }

    }
}
