package com.jpacourse.service.impl;

import com.jpacourse.dto.*;
import com.jpacourse.mapper.*;
import com.jpacourse.persistence.dao.*;
import com.jpacourse.persistence.entity.*;
import com.jpacourse.service.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional
public class DoctorServiceImpl implements DoctorService
{
    private final DoctorDao DoctorDao;

    @Autowired
    public DoctorServiceImpl(DoctorDao pDoctorDao)
    {
        DoctorDao = pDoctorDao;
    }


    @Override
    public DoctorTO findById(Long id) {
        final DoctorEntity entity = DoctorDao.findOne(id);
        return DoctorMapper.mapToTO(entity);

    }
}
