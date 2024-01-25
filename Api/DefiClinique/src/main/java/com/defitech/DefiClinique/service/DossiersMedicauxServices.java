package com.defitech.DefiClinique.service;

import com.defitech.DefiClinique.Model.DossiersMedicaux;
import com.defitech.DefiClinique.Repository.DossierMedicauxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DossiersMedicauxServices {

    private final DossierMedicauxRepository dossierMedicauxRepository;

    @Autowired
    public DossiersMedicauxServices(DossierMedicauxRepository dossierMedicauxRepository) {
        this.dossierMedicauxRepository = dossierMedicauxRepository;
    }

    public DossiersMedicaux getDossierMedicauxById(Long id) {
        return dossierMedicauxRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Dossier médical non trouvé avec l'ID : " + id));
    }

    public DossiersMedicaux getDossierMedicauxByPatientId(Long patientId) {
        return dossierMedicauxRepository.findByPatient_IdPatient(patientId);
    }

    public List<DossiersMedicaux> getAllDossiersMedicaux() {
        return (List<DossiersMedicaux>) dossierMedicauxRepository.findAll();
    }

    public void deleteDossierMedicaux(Long id) {
        dossierMedicauxRepository.deleteById(id);
    }

    public DossiersMedicaux updateDossierMedicaux(Long id, DossiersMedicaux dossierMedicauxDetails) {
        DossiersMedicaux existingDossier = dossierMedicauxRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Dossier médical non trouvé avec l'ID : " + id));
        existingDossier.setAllergies(dossierMedicauxDetails.getAllergies());

        return dossierMedicauxRepository.save(existingDossier);
    }

    public DossiersMedicaux saveDossierMedicaux(DossiersMedicaux dossiersMedicaux) {
        return dossierMedicauxRepository.save(dossiersMedicaux);
    }
}
