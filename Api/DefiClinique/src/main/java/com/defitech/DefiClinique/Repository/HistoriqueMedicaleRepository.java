package com.defitech.DefiClinique.Repository;

import com.defitech.DefiClinique.Model.HistoriqueMedicale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoriqueMedicaleRepository extends JpaRepository<HistoriqueMedicale, Long> {
}
