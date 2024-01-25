package com.defitech.DefiClinique.repository;

import com.defitech.DefiClinique.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {

    long count();
    long countByGender(String gender);

    @Query("SELECT p.genre, COUNT(p) FROM patient p GROUP BY p.genre")
    List<Object[]> getGenderDistribution();

    // @Query("SELECT COUNT(p) FROM patient p WHERE p.registrationDate BETWEEN ?1 AND ?2")
    //long countNewPatientsByPeriod(LocalDate startDate, LocalDate endDate);

}
