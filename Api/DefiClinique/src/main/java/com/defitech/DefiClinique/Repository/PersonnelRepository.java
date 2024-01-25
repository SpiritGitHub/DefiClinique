package com.defitech.DefiClinique.Repository;

import com.defitech.DefiClinique.Model.Personnel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonnelRepository extends CrudRepository<Personnel, Long> {

}
