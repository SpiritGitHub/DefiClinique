package com.defitech.DefiClinique.service;

import com.defitech.DefiClinique.Model.Consultation;
import com.defitech.DefiClinique.Repository.ConsultationRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Data
@Service
public class ConsultationServices {
    @Autowired
    private ConsultationRepository consultationRepository;

    public List<Consultation> findAllConsultationsByPatient(Long patientId) {
        return consultationRepository.findByDossierMedicalPatientId(patientId);
    }

    public List<Consultation> findConsultationsByPatientAndPeriod(Long patientId, Date start, Date end) {
        return consultationRepository.findByDossierMedicalPatientIdAndDateHeureBetween(patientId, start, end);
    }
    public List<Consultation> findConsultationsByMedecin(Long medecinId) {
        return consultationRepository.findByMedecinId(medecinId);
    }

    public Consultation addConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }


    public Optional<Consultation> updateConsultation(Long id, Consultation consultationDetails) {
        return consultationRepository.findById(id)
                .map(consultation -> {
                    consultation.setStatusConsul(consultationDetails.getStatusConsul());
                    consultation.setNotes(consultationDetails.getNotes());
                    return consultationRepository.save(consultation);
                });
    }


    public boolean deleteConsultation(Long id) {
        if (consultationRepository.existsById(id)) {
            consultationRepository.deleteById(id);
            return true;
        }
        return false;
    }

}
