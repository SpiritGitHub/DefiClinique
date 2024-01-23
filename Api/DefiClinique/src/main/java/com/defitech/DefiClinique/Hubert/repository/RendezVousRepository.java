package com.defitech.DefiClinique.Hubert.repository;

import com.defitech.DefiClinique.Hubert.model.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RendezVousRepository extends JpaRepository<RendezVous, Long> {
    // Ajoutez des méthodes personnalisées si nécessaire
}
