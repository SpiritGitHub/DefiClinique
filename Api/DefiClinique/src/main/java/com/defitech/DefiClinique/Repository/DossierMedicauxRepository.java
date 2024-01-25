package com.defitech.DefiClinique.Repository;

import com.defitech.DefiClinique.Model.DossiersMedicaux;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DossierMedicauxRepository extends JpaRepository<DossiersMedicaux, Long> {
    DossiersMedicaux findByPatient_IdPatient(Long idPatient);
}

