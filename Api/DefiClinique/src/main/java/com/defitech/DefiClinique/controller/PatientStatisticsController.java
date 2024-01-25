package com.defitech.DefiClinique.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.defitech.DefiClinique.service.PatientStatisticsService;

@RestController
@RequestMapping("/api/statistics/patients")
public class PatientStatisticsController {

    private final PatientStatisticsService patientStatisticsService;

    @Autowired
    public PatientStatisticsController(PatientStatisticsService patientStatisticsService) {
        this.patientStatisticsService = patientStatisticsService;
    }

    @GetMapping("/totalPatients")
    public int getTotalPatients() {
        return patientStatisticsService.getTotalPatients();
    }

    // Ajoutez d'autres méthodes pour exposer les statistiques sur les patients
}
