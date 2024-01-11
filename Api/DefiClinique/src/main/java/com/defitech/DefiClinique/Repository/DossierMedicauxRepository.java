package com.defitech.DefiClinique.Repository;

import com.defitech.DefiClinique.Model.DossiersMedicaux;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DossierMedicauxRepository extends CrudRepository<DossiersMedicaux, Long> {

}
