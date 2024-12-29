-- Address:
insert into address (id, address_line1, address_line2, city, postal_code)
            values (1, 'Secret', 'Location', 'city', '62-030');

-- Patients:
insert into patient (id, first_Name, last_Name, telephone_Number, email, patient_Number, date_of_birth, age, address_id)
            values (1, 'John', 'Doe', '+48987-654-321', 'JDoe@patient.com', '1', '1999-12-04', 21, 1);
insert into patient (id, first_Name, last_Name, telephone_Number, email, patient_Number, date_of_birth, age)
            values (2, 'Dohn', 'Joe', '+48-879-123-465', 'DJoe@patient.com', '2', '2005-01-14', 19);
insert into patient (id, first_Name, last_Name, telephone_Number, email, patient_Number, age)
            values (3, 'Jane', 'Smith', '+48-999-999-999', 'JSmith@patient.com', '3', 34);

-- Doctors:
insert into doctor (id, first_Name, last_Name, telephone_Number, email, DOCTOR_NUMBER, specialization)
            values (1, 'Super', 'Doctor', '+49-123-456-789', 'SDoctor@medical.net', '1', 'SURGEON');
insert into doctor (id, first_Name, last_Name, telephone_Number, email, DOCTOR_NUMBER, specialization)
            values (2, 'Robert', 'Derma', '+48-555-555-555', 'RDerma@medical.net', '2', 'DERMATOLOGIST');
insert into doctor (id, first_Name, last_Name, telephone_Number, email, DOCTOR_NUMBER, specialization)
            values (3, 'Sarah', 'Brown', '+48-123-123-123', 'SBrown@medical.net', '3', 'OCULIST');

-- Visits:
insert into visit (id, description, time, doctor_id, patient_id)
            values (1, 'Test visit', '2024-12-03T12:30:00', 1, 1);
insert into visit (id, description, time, doctor_id, patient_id)
            values (2, 'Super visit', '2024-12-24T12:00:00', 1, 2);
insert into visit (id, description, time, doctor_id, patient_id)
            values (3, 'Regular visit', '2024-12-26T08:00:00', 3, 1);
