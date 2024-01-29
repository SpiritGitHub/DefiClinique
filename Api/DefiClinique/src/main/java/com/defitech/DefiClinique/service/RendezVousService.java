package com.defitech.DefiClinique.service;

import com.defitech.DefiClinique.Model.RendezVous;
import com.defitech.DefiClinique.Repository.RendezVousRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RendezVousService {

    private final RendezVousRepository rendezVousRepository;

    @Autowired
    public RendezVousService(RendezVousRepository rendezVousRepository) {
        this.rendezVousRepository = rendezVousRepository;
    }

    public List<RendezVous> getAllRendezVous() {
        return rendezVousRepository.findAll();
    }

    public Optional<RendezVous> getRendezVousById(Long id) {
        return rendezVousRepository.findById(id);
    }

    public RendezVous saveRendezVous(RendezVous rendezVous) throws Exception {
        // Vérifier si le patient a déjà un rendez-vous à cette date et cette heure
        boolean isRendezVousExists = rendezVousRepository.existsByPatientAndDateAndHeure(
                rendezVous.getPatient(), rendezVous.getDate(), rendezVous.getHeure());

        if (isRendezVousExists) {
            throw new Exception("Le patient a déjà un rendez-vous à cette date et heure.");
        }

        return rendezVousRepository.save(rendezVous);
    }

    public int getTotalRendezVous() {
        return rendezVousRepository.countRendezVous();
    }

    public List<Object[]> getRendezVousFrequencyByMedecin() {
        return rendezVousRepository.rendezVousFrequencyByMedecin();
    }
    public double getAverageWaitTime() {
        return rendezVousRepository.averageWaitTime();
    }

    public void deleteRendezVous(Long id) {
        rendezVousRepository.deleteById(id);
    }
}
