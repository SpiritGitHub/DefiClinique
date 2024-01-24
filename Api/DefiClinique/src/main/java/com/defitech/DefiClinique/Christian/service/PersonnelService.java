package com.defitech.DefiClinique.Christian.service;

import com.defitech.DefiClinique.Christian.Model.Personnel;
import com.defitech.DefiClinique.Christian.repository.PersonnelRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service

public class PersonnelService {
    @Autowired
    private PersonnelRepository personnelRepository;

    public Optional<Personnel> getPersonnel(final Long id){
        return personnelRepository.findById(id);
    }
    public Iterable<Personnel> getPersonnel(){
        return personnelRepository.findAll();
    }

    public void deletePersonnel(final Long id){
        personnelRepository.deleteById(id);
    }

    public Personnel savePersonnel(Personnel personnel){
        Personnel savedPersonnel = personnelRepository.save(personnel);
        return savedPersonnel;
    }
}