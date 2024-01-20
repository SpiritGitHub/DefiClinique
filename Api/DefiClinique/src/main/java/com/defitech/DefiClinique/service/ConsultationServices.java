package com.defitech.DefiClinique.service;

import com.defitech.DefiClinique.Model.Consultation;
import com.defitech.DefiClinique.Repository.ConsultationRepository;
import io.micrometer.observation.ObservationFilter;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class ConsultationServices {
    @Autowired
    private ConsultationRepository consultationRepository;

    public Optional<Consultation> getConsultation(final Long id){
        return consultationRepository.findById(id);
    }

    public Iterable<Consultation> getConsultations(){
        return consultationRepository.findAll();
    }

    public Consultation addConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }


    public Optional<Consultation> updateConsultation(Long id, Consultation consultationDetails) {
        return consultationRepository.findById(id)
                .map(existingConsultation -> {
                    return consultationRepository.save(existingConsultation);
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
