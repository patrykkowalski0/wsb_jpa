package com.jpacourse.service.impl;

import com.jpacourse.dto.MedicalTreatmentTO;
import com.jpacourse.mapper.*;
import com.jpacourse.persistence.dao.*;
import com.jpacourse.persistence.entity.*;
import com.jpacourse.service.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional
public class MedicalTreatmentServiceImpl implements MedicalTreatmentService
{
    private final MedicalTreatmentDao MedicalTreatmentDao;

    @Autowired
    public MedicalTreatmentServiceImpl(MedicalTreatmentDao pMedicalTreatmentDao)
    {
        MedicalTreatmentDao = pMedicalTreatmentDao;
    }

    @Override
    public MedicalTreatmentTO findById(Long id) {
        final MedicalTreatmentEntity entity = MedicalTreatmentDao.findOne(id);
        return MedicalTreatmentMapper.mapToTO(entity);

    }
}
