package com.defitech.DefiClinique.Repository;

import com.defitech.DefiClinique.Model.Departement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DepartementRepository extends JpaRepository<Departement, Long> {
    Optional<Departement> findByNomDepartement(String nomDepartement);
}
