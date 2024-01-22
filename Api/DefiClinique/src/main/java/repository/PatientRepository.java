package repository;

import model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    long countByGender(String gender);

    @Query("SELECT p.gender, COUNT(p) FROM Patient p GROUP BY p.gender")
    List<Object[]> getGenderDistribution();

    @Query("SELECT COUNT(p) FROM Patient p WHERE p.registrationDate BETWEEN ?1 AND ?2")
    long countNewPatientsByPeriod(LocalDate startDate, LocalDate endDate);

}
