package com.defitech.DefiClinique.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.defitech.DefiClinique.Model.Patient;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PatientRepo extends JpaRepository<Patient, Long> {
    List<Patient> findByNomPatientContainingIgnoreCase(String nomPatient);

    @Query("SELECT COUNT(p) FROM Patient p")
    int countPatients();

    /*
    @Query("SELECT COUNT(p), p.age FROM Patient p GROUP BY p.age")
    List<Object[]> ageDistribution();

    @Query("SELECT COUNT(p), p.gender FROM Patient p GROUP BY p.gender")
    List<Object[]> genderDistribution();*/
}
