package com.defitech.DefiClinique.Repository;

import com.defitech.DefiClinique.Model.Analyse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnalyseRepository extends JpaRepository<Analyse, Long> {
}

