package com.defitech.DefiClinique.Chahib.repositorie;

import org.springframework.data.jpa.repository.JpaRepository;
import com.defitech.DefiClinique.Chahib.entite.Patient;

import java.util.List;

public interface PatientRepo extends JpaRepository<Patient, Long> {
    List<Patient> findByNomPatientContainingIgnoreCase(String nomPatient);
}
