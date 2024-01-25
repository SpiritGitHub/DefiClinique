package com.defitech.DefiClinique.service;

import com.defitech.DefiClinique.model.Clinique;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.defitech.DefiClinique.repository.CliniqueRepository;

import java.util.List;

@Service
public class CliniqueServiceImpl implements CliniqueService {

    private final CliniqueRepository cliniqueRepository;

    @Autowired
    public CliniqueServiceImpl(CliniqueRepository cliniqueRepository) {
        this.cliniqueRepository = cliniqueRepository;
    }

    @Override
    public List<Clinique> getAllCliniques() {
        return cliniqueRepository.findAll();
    }

    @Override
    public Clinique getCliniqueById(Long id) {
        return cliniqueRepository.findById(id).orElse(null);
    }

    @Override
    public Clinique addClinique(Clinique clinique) {
        return cliniqueRepository.save(clinique);
    }

    @Override
    public Clinique updateClinique(Long id, Clinique updatedClinique) {
        if (cliniqueRepository.existsById(id)) {
            updatedClinique.setId(id);
            return cliniqueRepository.save(updatedClinique);
        }
        return null; // Gérer le cas où la clinique n'existe pas
    }

    @Override
    public void deleteClinique(Long id) {
        cliniqueRepository.deleteById(id);
    }

    //List<RendezVous> rendezVousList = rendezVousRepository.findAll();

    // Vous devez définir la logique de calcul du coût pour chaque rendez-vous ou traitement
    double totalRevenue = 0.0;
        //for (RendezVous rendezVous : rendezVousList) {
        //totalRevenue += rendezVous.getCost();
    }

       // return totalRevenue;


