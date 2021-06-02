package com.newwebapp.newwebapp.Repository;


import java.util.List;
import java.util.Optional;

import com.newwebapp.newwebapp.Model.Patient;
 
public interface PatientRepository extends JpaRepository<Patient, Long> {
    List<Patient> findByFirstName(String firstName);

    void save(Patient patient);

    Optional<Patient> findById(long id);

    void deleteById(long id);
 
}
