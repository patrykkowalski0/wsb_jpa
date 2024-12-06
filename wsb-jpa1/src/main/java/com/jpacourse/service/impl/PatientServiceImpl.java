package com.jpacourse.service.impl;

import com.jpacourse.dto.PatientTO;
import com.jpacourse.mapper.*;
import com.jpacourse.persistence.dao.*;
import com.jpacourse.persistence.entity.*;
import com.jpacourse.service.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional
public class PatientServiceImpl implements PatientService
{
    private final PatientDao PatientDao;

    @Autowired
    public PatientServiceImpl(PatientDao pPatientDao)
    {
        PatientDao = pPatientDao;
    }


    @Override
    public PatientTO findById(Long id) {
        final PatientEntity entity = PatientDao.findOne(id);
        return PatientMapper.mapToTO(entity);

    }
}
