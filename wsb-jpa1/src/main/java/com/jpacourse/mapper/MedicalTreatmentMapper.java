package com.jpacourse.mapper;

import com.jpacourse.dto.MedicalTreatmentTO;
import com.jpacourse.persistence.entity.MedicalTreatmentEntity;

public final class MedicalTreatmentMapper
{

    public static MedicalTreatmentTO mapToTO(final MedicalTreatmentEntity medicalTreatmentEntity)
    {
        if (medicalTreatmentEntity == null)
        {
            return null;
        }
        final MedicalTreatmentTO medicalTreatmentTO = new MedicalTreatmentTO();
        medicalTreatmentTO.setId(medicalTreatmentEntity.getId());
        medicalTreatmentTO.setDescription(medicalTreatmentTO.getDescription());
        medicalTreatmentTO.setType(medicalTreatmentTO.getType());
        return medicalTreatmentTO;
    }

    public static MedicalTreatmentEntity mapToEntity(final MedicalTreatmentTO medicalTreatmentTO)
    {
        if(medicalTreatmentTO == null)
        {
            return null;
        }
        MedicalTreatmentEntity medicalTreatmentEntity = new MedicalTreatmentEntity();
        medicalTreatmentEntity.setId(medicalTreatmentTO.getId());
        medicalTreatmentEntity.setDescription(medicalTreatmentTO.getDescription());
        medicalTreatmentEntity.setType(medicalTreatmentTO.getType());
        return medicalTreatmentEntity;
    }
}
