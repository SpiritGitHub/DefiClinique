package com.defitech.DefiClinique.service;

import com.defitech.DefiClinique.Model.Analyse;
import com.defitech.DefiClinique.Model.DossiersMedicaux;
import com.defitech.DefiClinique.Model.HistoriqueMedicale;
import com.defitech.DefiClinique.Repository.AnalyseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class AnalyseService {

    @Autowired
    private AnalyseRepository analyseRepository;

    @Autowired
    private DossiersMedicauxServices dossiersMedicauxService;

    @Autowired
    private HistoriqueMedicaleServices historiqueMedicaleService;

    public List<Analyse> findAll() {
        return analyseRepository.findAll();
    }

    public Optional<Analyse> findById(Long id) {
        return analyseRepository.findById(id);
    }

    public Analyse saveAnalyse(Analyse analyse) {
        Analyse savedAnalyse = analyseRepository.save(analyse);

        DossiersMedicaux dossierMedical = dossiersMedicauxService.getDossierMedicauxByPatientId(analyse.getPatientId());

        // Création de l'objet HistoriqueMedicale
        HistoriqueMedicale historique = new HistoriqueMedicale();
        historique.setDateHistorique(new Date());
        historique.setTypeHistorique("Analyse");
        historique.setMedecinId(analyse.getMedecinId());
        historique.setPatientId(analyse.getPatientId());
        historique.setNotes(analyse.getCommentairesMedecin());
        historique.setDossierMedical(dossierMedical);

        historiqueMedicaleService.save(historique);

        return savedAnalyse;
    }


    public void deleteById(Long id) {
        analyseRepository.deleteById(id);
    }

}
