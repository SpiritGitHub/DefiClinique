package com.defitech.DefiClinique.service;

import com.defitech.DefiClinique.Model.Departement;
import com.defitech.DefiClinique.Repository.DepartementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DepartementService {

    private final DepartementRepository departementRepository;

    @Autowired
    public DepartementService(DepartementRepository departementRepository) {
        this.departementRepository = departementRepository;
    }

    public List<Departement> getAllDepartements() {
        return departementRepository.findAll();
    }

    public Optional<Departement> getDepartementById(Long id) {
        return departementRepository.findById(id);
    }

    public Departement saveDepartement(Departement departement) {
        return departementRepository.save(departement);
    }

    public void deleteDepartement(Long id) {
        departementRepository.deleteById(id);
    }

}

