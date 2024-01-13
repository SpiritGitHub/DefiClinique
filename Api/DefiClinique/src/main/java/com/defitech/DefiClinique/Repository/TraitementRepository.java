package com.defitech.DefiClinique.Repository;

import com.defitech.DefiClinique.Model.Traitement;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TraitementRepository extends CrudRepository<Traitement, Long> {
}
