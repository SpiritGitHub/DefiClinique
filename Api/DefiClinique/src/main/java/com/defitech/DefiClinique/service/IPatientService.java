package com.defitech.DefiClinique.service;

import com.defitech.DefiClinique.Model.Patient;

import java.util.List;
import java.util.Optional;

public interface IPatientService {

    Patient addPatient(Patient patient);

    List<Patient> getAllPatients();

    Optional<Patient> getPatientById(Long patientId);

    boolean deletePatient(Long patientId);

    Patient updatePatient(Long idPatient, Patient patientDetails);

    List<Patient> searchPatientsByName(String name);

}
