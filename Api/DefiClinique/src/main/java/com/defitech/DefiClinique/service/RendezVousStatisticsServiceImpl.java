package com.defitech.DefiClinique.service;

import com.defitech.DefiClinique.model.RendezVous;
import com.defitech.DefiClinique.repository.RendezVousRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RendezVousStatisticsServiceImpl implements RendezVousStatisticsService {

    private final RendezVousRepository rendezVousRepository;

    @Autowired
    public RendezVousStatisticsServiceImpl(RendezVousRepository rendezVousRepository) {
        this.rendezVousRepository = rendezVousRepository;
    }

    @Override
    public int getTotalRendezVous() {
        return Math.toIntExact(rendezVousRepository.count());
    }

    @Override
    public Map<Long, Long> getAppointmentFrequencyByDoctor() {
        List<Object[]> doctorFrequency = rendezVousRepository.getAppointmentFrequencyByDoctor();
        Map<Long, Long> frequencyMap = new HashMap<>();

        for (Object[] row : doctorFrequency) {
            Long doctorId = (Long) row[0];
            Long count = (Long) row[1];
            frequencyMap.put(doctorId, count);
        }

        return frequencyMap;
    }

    @Override
    public double getAverageWaitingTime() {
        List<RendezVous> rendezVousList = rendezVousRepository.findAll();
        if (rendezVousList.isEmpty()) {
            return 0.0;
        }

        long totalWaitingTime = 0;
        for (RendezVous rendezVous : rendezVousList) {
            totalWaitingTime += Duration.between(rendezVous.getCreatedAt(), rendezVous.getDate()).toMinutes();
        }

        return (double) totalWaitingTime / rendezVousList.size();
    }

    // Ajoutez l'implémentation des autres statistiques spécifiques aux rendez-vous
}
