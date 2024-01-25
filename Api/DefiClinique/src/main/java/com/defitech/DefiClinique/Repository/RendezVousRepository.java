package com.defitech.DefiClinique.Repository;

import com.defitech.DefiClinique.Model.Patient;
import com.defitech.DefiClinique.Model.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Time;
import java.util.Date;

@Repository
public interface RendezVousRepository extends JpaRepository<RendezVous, Long> {
    boolean existsByPatientAndDateAndHeure(Patient patient, Date date, Time heure);

}
