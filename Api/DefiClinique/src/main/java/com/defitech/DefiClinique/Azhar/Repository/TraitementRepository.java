package com.defitech.DefiClinique.Azhar.Repository;

import com.defitech.DefiClinique.Azhar.Model.Traitement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TraitementRepository extends JpaRepository<Traitement, Long> {

}
