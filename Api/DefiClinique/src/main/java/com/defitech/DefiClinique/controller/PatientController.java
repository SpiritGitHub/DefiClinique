package com.defitech.DefiClinique.controller;

import com.defitech.DefiClinique.Model.Patient;
import com.defitech.DefiClinique.service.IPatientService;
import com.defitech.DefiClinique.service.PatientServiceImp;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/deficlinique")
public class PatientController {

    private final IPatientService patientService;

    private final PatientServiceImp patientServiceIm;

    @PostMapping("/addPatient")
    public Patient addPatient(@RequestBody Patient patient) {
        return patientService.addPatient(patient);
    }

    @GetMapping("/getPatient/{idPatient}")
    public Patient getPatient(@PathVariable("idPatient") Long idPatient) {
        return patientService.getPatientById(idPatient).orElse(null);
    }

    @GetMapping("/getAllPatients")
    public List<Patient> getAllPatients() {
        return patientService.getAllPatients();
    }

    @PutMapping("/updatePatient/{idPatient}")
    public Patient updatePatient(@PathVariable("idPatient") Long idPatient, @RequestBody Patient patientDetails) {
        return patientService.updatePatient(idPatient, patientDetails);
    }

    @DeleteMapping("/deletePatient/{idPatient}")
    public ResponseEntity<?> deletePatient(@PathVariable("idPatient") Long idPatient) {
        boolean isRemoved = patientService.deletePatient(idPatient);

        if (isRemoved) {
            return ResponseEntity.ok("Patient with ID " + idPatient + " was deleted");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/searchPatients")
    public List<Patient> searchPatients(@RequestParam(value = "name", required = false) String name) {
        return patientService.searchPatientsByName(name);
    }

    @GetMapping("/stats/total")
    public int getTotalPatients() {
        return patientServiceIm.getTotalPatients();
    }

    /*
    @GetMapping("/stats/age-distribution")
    public List<Object[]> getAgeDistribution() {
        return patientServiceIm.getAgeDistribution();
    }

    @GetMapping("/stats/gender-distribution")
    public List<Object[]> getGenderDistribution() {
        return patientServiceIm.getGenderDistribution();
    }*/

}
