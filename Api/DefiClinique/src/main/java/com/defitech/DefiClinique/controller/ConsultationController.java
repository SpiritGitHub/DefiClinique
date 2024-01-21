package com.defitech.DefiClinique.controller;

import com.defitech.DefiClinique.Model.Consultation;
import com.defitech.DefiClinique.service.ConsultationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("declinique")
public class ConsultationController {
    @Autowired
    private ConsultationServices consultationServices;

    @GetMapping("/patient/{patientId}")
    public List<Consultation> getAllConsultationsByPatient(@PathVariable Long patientId) {
        return consultationServices.findAllConsultationsByPatient(patientId);
    }

    // Récupérer les consultations dans une période donnée
    @GetMapping("/patient/{patientId}/period")
    public List<Consultation> getConsultationsByPatientAndPeriod(
            @PathVariable Long patientId,
            @RequestParam("start") Date start,
            @RequestParam("end") Date end) {
        return consultationServices.findConsultationsByPatientAndPeriod(patientId, start, end);
    }

    // Récupérer les consultations par médecin
    @GetMapping("/medecin/{medecinId}")
    public List<Consultation> getConsultationsByMedecin(@PathVariable Long medecinId) {
        return consultationServices.findConsultationsByMedecin(medecinId);
    }

    // Ajouter une nouvelle consultation
    @PostMapping("/addconsultation")
    public Consultation addConsultation(@RequestBody Consultation consultation) {
        return consultationServices.addConsultation(consultation);
    }

    // Mettre a jour une consultation
    @PutMapping("/consultation/{id}")
    public ResponseEntity<Consultation> updateConsultation(@PathVariable Long id, @RequestBody Consultation consultationDetails) {
        return consultationServices.updateConsultation(id, consultationDetails)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

}
