package com.defitech.DefiClinique.controller;

import com.defitech.DefiClinique.Model.Consultation;
import com.defitech.DefiClinique.service.ConsultationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("declinique")
public class ConsultationController {
    @Autowired
    private ConsultationServices consultationServices;

    @GetMapping("/consultation")
    public Iterable<Consultation> getConsultations(){
        return consultationServices.getConsultations();
    }

    @GetMapping("/consultation/{id}")
    public ResponseEntity<Consultation> getConsultationById(@PathVariable Long id){
        return consultationServices.getConsultation(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/consultation")
    public ResponseEntity<Consultation> addConsultation(@RequestBody Consultation consultation) {
        Consultation newConsultation = consultationServices.addConsultation(consultation);
        return ResponseEntity.ok(newConsultation);
    }

    @PutMapping("/consultation/{id}")
    public ResponseEntity<Consultation> updateConsultation(@PathVariable Long id, @RequestBody Consultation consultationDetails) {
        return consultationServices.updateConsultation(id, consultationDetails)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/consultation/{id}")
    public ResponseEntity<?> deleteConsultation(@PathVariable Long id) {
        if (consultationServices.deleteConsultation(id)) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}
