package com.defitech.DefiClinique.Repository;

import com.defitech.DefiClinique.Model.Consultation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ConsultationRepository extends CrudRepository<Consultation, Long> {
    List<Consultation> findByDossierMedicalPatientId(Long patientId);
    List<Consultation> findByDossierMedicalPatientIdAndDateHeureBetween(Long patientId, Date start, Date end);
    List<Consultation> findByMedecinId(Long medecinId);
}
