package com.defitech.DefiClinique.controller;

import com.defitech.DefiClinique.Model.Consultation;
import com.defitech.DefiClinique.service.ConsultationServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/deficlinique")
public class ConsultationController {

    private final ConsultationServices consultationService;

    public ConsultationController(ConsultationServices consultationService) {
        this.consultationService = consultationService;
    }

    @GetMapping("/allconsultation")
    public ResponseEntity<List<Consultation>> getAllConsultations() {
        List<Consultation> consultations = consultationService.findAllConsultations();
        if (consultations.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(consultations);
    }

    @GetMapping("consultationId/{id}")
    public ResponseEntity<Consultation> getConsultationById(@PathVariable Long id) {
        Consultation consultation = consultationService.getConsultationById(id);
        if (consultation == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(consultation);
    }

    @PostMapping("/createconsultation")
    public Consultation addConsultation(@RequestBody Consultation consultation) {
        return consultationService.saveConsultation(consultation);
    }

    @PutMapping("/upconsultation/{id}")
    public ResponseEntity<Consultation> updateConsultation(@PathVariable Long id, @RequestBody Consultation consultationDetails) {
        try {
            return ResponseEntity.ok(consultationService.updateConsultation(id, consultationDetails));
        } catch (RuntimeException ex) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("delconsultation/{id}")
    public ResponseEntity<Void> deleteConsultation(@PathVariable Long id) {
        try {
            consultationService.deleteConsultation(id);
            return ResponseEntity.ok().build();
        } catch (RuntimeException ex) {
            return ResponseEntity.notFound().build();
        }
    }
}
