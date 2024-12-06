package com.jpacourse.mapper;

import com.jpacourse.dto.DoctorTO;
import com.jpacourse.persistence.entity.DoctorEntity;

public final class DoctorMapper
{

    public static DoctorTO mapToTO(final DoctorEntity doctorEntity)
    {
        if (doctorEntity == null)
        {
            return null;
        }
        final DoctorTO doctorTO = new DoctorTO();
        doctorTO.setId(doctorEntity.getId());
        doctorTO.setFirstName(doctorEntity.getFirstName());
        doctorTO.setLastName(doctorEntity.getLastName());
        doctorTO.setTelephoneNumber(doctorEntity.getTelephoneNumber());
        doctorTO.setEmail(doctorEntity.getEmail());
        doctorTO.setDoctorNumber(doctorEntity.getDoctorNumber());
        doctorTO.setSpecialization(doctorEntity.getSpecialization());
        return doctorTO;
    }

    public static DoctorEntity mapToEntity(final DoctorTO doctorTO)
    {
        if(doctorTO == null)
        {
            return null;
        }
            DoctorEntity doctorEntity = new DoctorEntity();
            doctorEntity.setId(doctorTO.getId());
            doctorEntity.setFirstName(doctorTO.getFirstName());
            doctorEntity.setLastName(doctorTO.getLastName());
            doctorEntity.setTelephoneNumber(doctorTO.getTelephoneNumber());
            doctorEntity.setEmail(doctorTO.getEmail());
            doctorEntity.setDoctorNumber(doctorTO.getDoctorNumber());
            doctorEntity.setSpecialization(doctorTO.getSpecialization());
            return doctorEntity;
    }
}
