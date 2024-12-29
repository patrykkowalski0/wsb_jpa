package com.jpacourse.mapper;

import com.jpacourse.dto.VisitTO;
import com.jpacourse.persistence.entity.MedicalTreatmentEntity;
import com.jpacourse.persistence.entity.VisitEntity;

import java.util.List;
import java.util.stream.Collectors;

public final class VisitMapper
{

    public static VisitTO mapToTO(final VisitEntity visitEntity)
    {
        if (visitEntity == null)
        {
            return null;
        }
        final VisitTO visitTO = new VisitTO();
        visitTO.setId(visitEntity.getId());
        visitTO.setDescription(visitEntity.getDescription());
        visitTO.setTime(visitEntity.getTime());
        visitTO.setDoctorName(visitEntity.getDoctor().getFirstName());
        visitTO.setDoctorLastName(visitEntity.getDoctor().getLastName());
        visitTO.setTreatmentTypes(visitEntity.getMedicalTreatments().stream().map(MedicalTreatmentEntity::getType).collect(Collectors.toList()));
        return visitTO;
    }

    public static List<VisitTO> mapToTOs(List<VisitEntity> visitEntities)
    {
        return visitEntities.stream().map(VisitMapper::mapToTO).collect(Collectors.toList());

    }

}
