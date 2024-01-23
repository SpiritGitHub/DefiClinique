package com.defitech.DefiClinique.Chahib.service;

import com.defitech.DefiClinique.Chahib.repositorie.PatientRepo;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.defitech.DefiClinique.Chahib.entite.Patient;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class PatientServiceImp implements IPatientService {

    private final PatientRepo patientRepo;

    @Override
    public Patient addPatient(Patient patient) {
        return patientRepo.save(patient);
    }

    @Override
    public Optional<Patient> getPatientById(Long idPatient) {
        return patientRepo.findById(idPatient)
                .filter(patient -> patient.getStatut() == 1);
    }

    public List<Patient> getAllPatients() {
        return patientRepo.findAll().stream()
                .filter(patient -> patient.getStatut() == 1)
                .collect(Collectors.toList());
    }

    @Override
    public boolean deletePatient(Long idPatient) {
        Patient patient = patientRepo.findById(idPatient)
                .orElseThrow(() -> new EntityNotFoundException("Patient not found with ID: " + idPatient));
        patient.softDelete();
        patientRepo.save(patient);
        return true; // Return true since the patient is successfully "soft-deleted"
    }

    @Override
    public Patient updatePatient(Long idPatient, Patient patientDetails) {
        Patient patient = patientRepo.findById(idPatient)
                .orElseThrow(() -> new EntityNotFoundException("Patient not found with ID: " + idPatient));

        patient.setNomPatient(patientDetails.getNomPatient());
        patient.setDateNaissance(patientDetails.getDateNaissance());
        patient.setTelephone(patientDetails.getTelephone());

        return patientRepo.save(patient);
    }

    @Override
    public List<Patient> searchPatientsByName(String name) {
        if (name != null && !name.isEmpty()) {
            return patientRepo.findByNomPatientContainingIgnoreCase(name);
        } else {
            return patientRepo.findAll();
        }
    }
}
