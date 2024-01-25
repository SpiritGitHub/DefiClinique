package com.defitech.DefiClinique.service;

import com.defitech.DefiClinique.model.Patient;

import java.util.List;

public interface PatientService {

    Patient savePatient(Patient patient);

    List<Patient> getAllPatients();

    Patient getPatientById(Long id);

    void deletePatient(Long id);

    int getTotalPatients();

    List<Object[]> getGenderDistribution();
}