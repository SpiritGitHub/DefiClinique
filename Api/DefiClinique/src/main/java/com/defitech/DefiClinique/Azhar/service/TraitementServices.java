package com.defitech.DefiClinique.Azhar.service;

import com.defitech.DefiClinique.Azhar.Model.DossiersMedicaux;
import com.defitech.DefiClinique.Azhar.Model.HistoriqueMedicale;
import com.defitech.DefiClinique.Azhar.Model.Traitement;
import com.defitech.DefiClinique.Azhar.Repository.TraitementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TraitementServices {

    private final TraitementRepository traitementRepository;

    @Autowired
    private HistoriqueMedicaleServices historiqueMedicaleService;

    @Autowired
    private DossiersMedicauxServices dossiersMedicauxService;

    @Autowired
    public TraitementServices(TraitementRepository traitementRepository) {
        this.traitementRepository = traitementRepository;
    }

    public Traitement getTraitementById(Long id) {
        return traitementRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Traitement non trouvé avec l'ID : " + id));
    }

    public List<Traitement> getAllTraitements() {
        return (List<Traitement>) traitementRepository.findAll();
    }

    public Traitement saveTraitement(Traitement traitement) {
        // Enregistrement du traitement
        Traitement savedTraitement = traitementRepository.save(traitement);

        DossiersMedicaux dossierMedical = dossiersMedicauxService.getDossierMedicauxByPatientId(traitement.getPatientId());

        // Création de l'objet HistoriqueMedicale
        HistoriqueMedicale historique = new HistoriqueMedicale();
        historique.setDateHistorique(savedTraitement.getDateDebut());
        historique.setTypeHistorique("Traitement");
        historique.setMedecinId(savedTraitement.getMedecinId());
        historique.setPatientId(savedTraitement.getPatientId());
        historique.setNotes(savedTraitement.getInstructions());
        historique.setDossierMedical(dossierMedical);

        // Enregistrement de l'historique
        historiqueMedicaleService.save(historique);

        return savedTraitement;
    }

    public void deleteTraitement(Long id) {
        if (!traitementRepository.existsById(id)) {
            throw new RuntimeException("Traitement non trouvé avec l'ID : " + id);
        }
        traitementRepository.deleteById(id);
    }

    public Traitement updateTraitement(Long id, Traitement traitementDetails) {
        Traitement traitement = traitementRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Traitement non trouvé avec l'ID : " + id));

        traitement.setInstructions(traitementDetails.getInstructions());
        traitement.setDateDebut(traitementDetails.getDateDebut());
        traitement.setDateFin(traitementDetails.getDateFin());
        traitement.setDescription(traitementDetails.getDescription());
        return traitementRepository.save(traitement);
    }
}
