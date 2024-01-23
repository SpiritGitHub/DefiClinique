package com.defitech.DefiClinique.Azhar.Repository;

import com.defitech.DefiClinique.Azhar.Model.Analyse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnalyseRepository extends JpaRepository<Analyse, Long> {
}

