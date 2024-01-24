package com.defitech.DefiClinique.Azhar.Repository;

import com.defitech.DefiClinique.Azhar.Model.HistoriqueMedicale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoriqueMedicaleRepository extends JpaRepository<HistoriqueMedicale, Long> {
}
