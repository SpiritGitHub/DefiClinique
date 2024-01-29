package com.defitech.DefiClinique.Repository;

import com.defitech.DefiClinique.Model.Patient;
import com.defitech.DefiClinique.Model.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Time;
import java.util.Date;
import java.util.List;

@Repository
public interface RendezVousRepository extends JpaRepository<RendezVous, Long> {
    boolean existsByPatientAndDateAndHeure(Patient patient, Date date, Time heure);

    @Query("SELECT COUNT(r) FROM RendezVous r")
    int countRendezVous();

    /*
    @Query("SELECT COUNT(r), r.docteur FROM RendezVous r GROUP BY r.docteur")
    List<Object[]> rendezVousFrequencyByMedecin();

    @Query("SELECT AVG(r.waitTime) FROM RendezVous r WHERE r.waitTime IS NOT NULL")
    double averageWaitTime();
*/
}
