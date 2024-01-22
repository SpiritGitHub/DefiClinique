package service;

import model.Patient;
import java.util.List;

public interface PatientService {

    List<Patient> getAllPatients();

    Patient getPatientById(Long id);

    Patient addPatient(Patient patient);

    Patient updatePatient(Long id, Patient updatedPatient);

    void deletePatient(Long id);
}