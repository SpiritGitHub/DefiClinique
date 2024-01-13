package com.defitech.DefiClinique.controller;

import com.defitech.DefiClinique.Model.Consultation;
import com.defitech.DefiClinique.service.ConsultationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
