package com.defitech.DefiClinique.Azhar.Repository;

import com.defitech.DefiClinique.Azhar.Model.DossiersMedicaux;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DossierMedicauxRepository extends JpaRepository<DossiersMedicaux, Long> {
    DossiersMedicaux findByPatientId(Long patientId);
}
