package com.defitech.DefiClinique.Repository;

import com.defitech.DefiClinique.Model.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ConsultationRepository extends JpaRepository<Consultation, Long> {

    List<Consultation> findByPatientId(Long patientId);
    List<Consultation> findByPatientIdAndDateHeureBetween(Long patientId, Date start, Date end);
    List<Consultation> findByMedecinId(Long medecinId);
}
