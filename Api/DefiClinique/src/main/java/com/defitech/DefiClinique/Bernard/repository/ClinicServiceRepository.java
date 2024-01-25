package com.defitech.DefiClinique.Bernard.repository;

import com.defitech.DefiClinique.Bernard.model.ClinicService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClinicServiceRepository extends JpaRepository<ClinicService, Long> {

    // Trouver un service par son nom
    Optional<ClinicService> findByNom(String nom);

    // Trouver des services par type
    List<ClinicService> findByTypeService(String typeService);


}
