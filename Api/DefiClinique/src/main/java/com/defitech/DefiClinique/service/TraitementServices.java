package com.defitech.DefiClinique.service;

import com.defitech.DefiClinique.Model.Traitement;
import com.defitech.DefiClinique.Repository.TraitementRepository;
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

}
