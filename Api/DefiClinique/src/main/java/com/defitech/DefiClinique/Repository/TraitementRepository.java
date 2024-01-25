package com.defitech.DefiClinique.Repository;

import com.defitech.DefiClinique.Model.Traitement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TraitementRepository extends JpaRepository<Traitement, Long> {

}
