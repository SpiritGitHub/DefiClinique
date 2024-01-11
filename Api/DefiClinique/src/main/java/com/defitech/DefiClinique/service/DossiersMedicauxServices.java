package com.defitech.DefiClinique.service;

import com.defitech.DefiClinique.Model.DossiersMedicaux;
import com.defitech.DefiClinique.Repository.DossierMedicauxRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class DossiersMedicauxServices {
    @Autowired
    private DossierMedicauxRepository dossierMedicauxRepository;

    public Optional<DossiersMedicaux> getDossiersMedicaux(final Long id){
        return dossierMedicauxRepository.findById(id);
    }

    public Iterable<DossiersMedicaux> getDossiersMedicaux(){
        return dossierMedicauxRepository.findAll();
    }

    public void deleteDosssierMedicaux(final Long id){
        dossierMedicauxRepository.deleteById(id);
    }

    public DossiersMedicaux saveDossierMedicaux(DossiersMedicaux dossiersMedicaux){
        DossiersMedicaux savedDossiersMedicaux = dossierMedicauxRepository.save(dossiersMedicaux);
        return savedDossiersMedicaux;
    }
}
