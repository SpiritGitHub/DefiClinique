package com.defitech.DefiClinique.Christian.repository;

import com.defitech.DefiClinique.Christian.Model.Personnel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonnelRepository extends CrudRepository<Personnel, Long> {

}
