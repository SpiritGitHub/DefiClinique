package repository;

import model.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;

public interface RendezVousRepository extends JpaRepository<RendezVous, Long> {
    @Query("SELECT r.medecin.id, COUNT(r) FROM RendezVous r GROUP BY r.medecin.id")
    List<Object[]> getAppointmentFrequencyByDoctor();
}
