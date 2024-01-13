package com.defitech.DefiClinique.Repository;

import com.defitech.DefiClinique.Model.Consultation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultationRepository extends CrudRepository<Consultation, Long> {
}
