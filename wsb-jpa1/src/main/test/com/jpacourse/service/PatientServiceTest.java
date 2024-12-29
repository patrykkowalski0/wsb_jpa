package com.jpacourse.service;

import com.jpacourse.persistence.dao.PatientDao;
import com.jpacourse.dto.PatientTO;
import com.jpacourse.persistence.entity.*;
import com.jpacourse.persistence.entity.AddressEntity;
import com.jpacourse.service.PatientService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

import static com.jpacourse.persistence.enums.Specialization.SURGEON;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PatientServiceTest {

    @Autowired
    private PatientService patientService;

    @Autowired
    private DoctorService doctorService;

    @Transactional
    @Test
    public void testShouldFindAddressById() {
        // given
        // when
        PatientTO patientTO = patientService.findById(1L);
        // then
        assertThat(patientTO).isNotNull();
        assertThat(patientTO.getId()).isEqualTo(1L);
    }

    // Do poprawy
    @Transactional
    @Test
    public void testShouldSavePatient() {
        // given
        PatientEntity patientEntity = new PatientEntity();
        patientEntity.setId(1L);
        patientEntity.setFirstName("firstname");
        patientEntity.setLastName("lastname");
        patientEntity.setTelephoneNumber("111-111-111");
        patientEntity.setEmail("test@email.com");
        patientEntity.setPatientNumber("1");
        patientEntity.setDateOfBirth(LocalDate.of(1999, 12, 14));
        patientEntity.setVisits(patientEntity.getVisits());


        DoctorEntity doctorEntity = new DoctorEntity();
        doctorEntity.setId(1L);
        doctorEntity.setFirstName("firstname");
        doctorEntity.setLastName("lastname");
        doctorEntity.setTelephoneNumber("111-111-111");
        doctorEntity.setEmail("doctor@doctor.com");
        doctorEntity.setDoctorNumber("1");
        doctorEntity.setSpecialization(SURGEON);
        PatientTO entitiesNumBefore = patientService.findById(doctorEntity.getId());

        // when
//        final AddressEntity saved = PatientDao.save(DoctorEntity);
//
//        // then
//        assertThat(saved).isNotNull();
//        assertThat(saved.getId()).isNotNull();
//        assertThat(addressDao.count()).isEqualTo(entitiesNumBefore+1);
    }

    @Transactional
    @Test
    public void testShouldSavePatient2() {
        // given
        PatientEntity patientEntity = new PatientEntity();
        patientEntity.setId(4L);
        patientEntity.setFirstName("firstname");
        patientEntity.setLastName("lastname");
        patientEntity.setTelephoneNumber("111-111-111");
        patientEntity.setEmail("test@email.com");
        patientEntity.setPatientNumber("4");
        patientEntity.setDateOfBirth(LocalDate.of(1999, 12, 14));
        patientEntity.setAge(25);
        patientEntity.setVisits(patientEntity.getVisits());

        Long patientID = 1L;
        Long visitID = 1L;

        //patientEntity = patientService.save(patientEntity);

        // when
        //final PatientEntity saved = patientService.save(patientEntity);

        // then
       // assertThat(saved).isNotNull();
    }

    }