package com.defitech.DefiClinique.Repository;

import com.defitech.DefiClinique.Model.FactureElement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FactureElementRepository extends JpaRepository<FactureElement, Long> {




    List<FactureElement> findByFacture_Id(Long factureId);



    List<FactureElement> findByNom(String nom);


}
