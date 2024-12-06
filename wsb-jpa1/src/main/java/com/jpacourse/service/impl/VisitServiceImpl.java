package com.jpacourse.service.impl;

import com.jpacourse.dto.VisitTO;
import com.jpacourse.mapper.*;
import com.jpacourse.persistence.dao.*;
import com.jpacourse.persistence.entity.*;
import com.jpacourse.service.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional
public class VisitServiceImpl implements VisitService
{
    private final VisitDao VisitDao;

    @Autowired
    public VisitServiceImpl(VisitDao pVisitDao)
    {
        VisitDao = pVisitDao;
    }

    @Override
    public VisitTO findById(Long id) {
        final VisitEntity entity = VisitDao.findOne(id);
        return VisitMapper.mapToTO(entity);

    }
}
