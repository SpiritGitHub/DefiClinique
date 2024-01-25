package com.defitech.DefiClinique.Bernard.repository;

import com.defitech.DefiClinique.Bernard.model.FactureElement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FactureElementRepository extends JpaRepository<FactureElement, Long> {




    List<FactureElement> findByFacture_Id(Long factureId);



    List<FactureElement> findByNom(String nom);


}
