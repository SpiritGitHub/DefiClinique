package com.defitech.DefiClinique.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.defitech.DefiClinique.service.RendezVousStatisticsService;

@RestController
@RequestMapping("/api/statistics/rendezvous")
public class RendezVousStatisticsController {

    private final RendezVousStatisticsService rendezVousStatisticsService;

    @Autowired
    public RendezVousStatisticsController(RendezVousStatisticsService rendezVousStatisticsService) {
        this.rendezVousStatisticsService = rendezVousStatisticsService;
    }

    @GetMapping("/totalRendezVous")
    public int getTotalRendezVous() {
        return rendezVousStatisticsService.getTotalRendezVous();
    }

    // Ajoutez d'autres méthodes pour exposer les statistiques sur les rendez-vous
}
