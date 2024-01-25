package com.defitech.DefiClinique.Repository;

import com.defitech.DefiClinique.Model.Facture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface FactureRepository extends JpaRepository<Facture, Long> {

    List<Facture> findByNomPatient(String nomPatient);
    List<Facture> findByDateFacturation(Date dateFacturation);
    List<Facture> findByNomPatientAndDateFacturation(String nomPatient, Date date);
    Long countByNomPatient(String nomPatient);
    Optional<Facture> findByNumeroFacture(String numeroFacture);

}
