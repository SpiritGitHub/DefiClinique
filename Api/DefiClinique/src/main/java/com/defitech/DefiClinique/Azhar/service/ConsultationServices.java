package com.defitech.DefiClinique.Azhar.service;

import com.defitech.DefiClinique.Azhar.Model.Consultation;
import com.defitech.DefiClinique.Azhar.Model.DossiersMedicaux;
import com.defitech.DefiClinique.Azhar.Model.HistoriqueMedicale;
import com.defitech.DefiClinique.Azhar.Repository.ConsultationRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@Data
public class ConsultationServices {

    private final ConsultationRepository consultationRepository;

    @Autowired
    private DossiersMedicauxServices dossiersMedicauxService;

    @Autowired
    public ConsultationServices(ConsultationRepository consultationRepository) {
        this.consultationRepository = consultationRepository;
    }

    @Autowired
    private HistoriqueMedicaleServices historiqueMedicaleService;

    public List<Consultation> findAllConsultations() {
        return consultationRepository.findAll();
    }
    public Consultation getConsultationById(Long id) {
        Optional<Consultation> consultation = consultationRepository.findById(id);
        return consultation.orElse(null);
    }

    public List<Consultation> findConsultationsByPatientAndPeriod(Long patientId, Date start, Date end) {
        return consultationRepository.findByPatientIdAndDateHeureBetween(patientId, start, end);
    }

    public List<Consultation> findConsultationsByMedecin(Long medecinId) {
        return consultationRepository.findByMedecinId(medecinId);
    }

    public Consultation saveConsultation(Consultation consultation) {
        // Enregistrement de la consultation
        Consultation savedConsultation = consultationRepository.save(consultation);

        // Récupération du dossier médical
        DossiersMedicaux dossierMedical = dossiersMedicauxService.getDossierMedicauxByPatientId(consultation.getPatientId());

        // Création et enregistrement de l'historique
        HistoriqueMedicale historique = new HistoriqueMedicale();
        historique.setDateHistorique(savedConsultation.getDateHeure());
        historique.setTypeHistorique("Consultation");
        historique.setMedecinId(savedConsultation.getMedecinId());
        historique.setPatientId(savedConsultation.getPatientId());
        historique.setNotes(savedConsultation.getNotes());
        historique.setDossierMedical(dossierMedical);
        historiqueMedicaleService.save(historique);

        return savedConsultation;
    }
    public Consultation updateConsultation(Long id, Consultation consultationDetails) {
        Consultation consultation = consultationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Consultation non trouvée avec l'ID : " + id));

        consultation.setStatusConsul(consultationDetails.getStatusConsul());
        consultation.setNotes(consultationDetails.getNotes());
        return consultationRepository.save(consultation);
    }

    public void deleteConsultation(Long id) {
        if (!consultationRepository.existsById(id)) {
            throw new RuntimeException("Consultation non trouvée avec l'ID : " + id);
        }
        consultationRepository.deleteById(id);
    }
}
