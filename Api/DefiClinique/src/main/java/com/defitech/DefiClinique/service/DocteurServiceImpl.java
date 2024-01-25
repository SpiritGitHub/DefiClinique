package com.defitech.DefiClinique.service;

import com.defitech.DefiClinique.model.Docteur;
import com.defitech.DefiClinique.repository.DocteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocteurServiceImpl implements DocteurService {

    private final DocteurRepository docteurRepository;

    @Autowired
    public DocteurServiceImpl(DocteurRepository docteurRepository) {
        this.docteurRepository = docteurRepository;
    }

    @Override
    public List<Docteur> getAllDocteurs() {
        return docteurRepository.findAll();
    }

    @Override
    public Docteur getDocteurById(Long id) {
        return docteurRepository.findById(id).orElse(null);
    }

    @Override
    public Docteur addDocteur(Docteur docteur) {
        return docteurRepository.save(docteur);
    }

    @Override
    public Docteur updateDocteur(Long id, Docteur updatedDocteur) {
        if (docteurRepository.existsById(id)) {
            updatedDocteur.setId(id);
            return docteurRepository.save(updatedDocteur);
        }
        return null; // Gérer le cas où le docteur n'existe pas
    }

    @Override
    public void deleteDocteur(Long id) {
        docteurRepository.deleteById(id);
    }


    public int getTotalDocteurs() {
        return Math.toIntExact(docteurRepository.count());
    }
}