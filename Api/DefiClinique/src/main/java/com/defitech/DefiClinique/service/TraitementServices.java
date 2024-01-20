package com.defitech.DefiClinique.service;

import com.defitech.DefiClinique.Model.Traitement;
import com.defitech.DefiClinique.Repository.TraitementRepository;
import io.micrometer.observation.ObservationFilter;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class TraitementServices {
    @Autowired
    private TraitementRepository traitementRepository;

    public Optional<Traitement> getTraitement(final Long id){
        return traitementRepository.findById(id);
    }

    public Iterable<Traitement> getTraitements(){
        return traitementRepository.findAll();
    }

    public Traitement addTraitement(Traitement traitement) {return traitementRepository.save(traitement);}


    public boolean deleteTraitement(Long id) {
        if (traitementRepository.existsById(id)) {
            traitementRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }


    public Optional<Traitement> updateTraitement(Long id, Traitement traitementDetails) {
        return traitementRepository.findById(id)
                .map(traitement -> {
                    traitement.setInstructions(traitementDetails.getInstructions());
                    traitement.setDateDebut(traitementDetails.getDateDebut());
                    traitement.setDateFin(traitementDetails.getDateFin());
                    traitement.setDescription(traitementDetails.getDescription());
                    return traitementRepository.save(traitement);
                });
    }

}
