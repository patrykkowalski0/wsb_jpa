package com.jpacourse.persistance.dao;

import com.jpacourse.persistence.dao.PatientDao;
import com.jpacourse.persistence.entity.PatientEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PatientDaoTest
{
    @Autowired
    private PatientDao patientDao;

    @Transactional
    @Test
    public void testShouldFindPatientById() {
        // given
        // when
        PatientEntity patientEntity = patientDao.findOne(1L);
        // then
        assertThat(patientEntity).isNotNull();
        assertThat(patientEntity.getEmail()).isEqualTo("JDoe@patient.com");
    }

//    @Test
//    public void testShouldSavePatient() {
//        // given
//        PatientEntity patientEntity = new PatientEntity();
//        patientEntity.setFirstName("firstname");
//        patientEntity.setLastName("lastname");
//        patientEntity.setTelephoneNumber("111-111-111");
//        patientEntity.setEmail("test@email.com");
//        patientEntity.setPatientNumber("1");
//        patientEntity.setDateOfBirth(LocalDate.of(1999, 12, 14));
//        //patientEntity.setVisits(patientEntity.getVisits());
//        long entitiesNumBefore = patientDao.count();
//
//        // when
//        final PatientEntity saved = patientDao.save(patientEntity);
//
//        // then
//        assertThat(saved).isNotNull();
//        assertThat(saved.getId()).isNotNull();
//        assertThat(patientDao.count()).isEqualTo(entitiesNumBefore+1);
//    }
//
//    @Transactional
//    @Test
//    public void testShouldSaveAndRemovePatient() {
//        // given
//        PatientEntity patientEntity = new PatientEntity();
//        patientEntity.setFirstName("firstname");
//        patientEntity.setLastName("lastname");
//        patientEntity.setTelephoneNumber("111-111-111");
//        patientEntity.setEmail("test@email.com");
//        patientEntity.setPatientNumber("1");
//        patientEntity.setDateOfBirth(LocalDate.of(1999, 12, 14));
//
//        // when
//        final PatientEntity saved = patientDao.save(patientEntity);
//        assertThat(saved.getId()).isNotNull();
//        final PatientEntity newSaved = patientDao.findOne(saved.getId());
//        assertThat(newSaved).isNotNull();
//
//        patientDao.delete(saved.getId());
//
//        // then
//        final PatientEntity removed = patientDao.findOne(saved.getId());
//        assertThat(removed).isNull();
//    }


}
