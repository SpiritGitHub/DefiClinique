package com.defitech.DefiClinique.service;

import com.defitech.DefiClinique.Model.Facture;
import com.defitech.DefiClinique.Model.FactureElement;
import com.defitech.DefiClinique.Repository.FactureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FactureService {

    private final FactureRepository factureRepository;

    @Autowired
    public FactureService(FactureRepository factureRepository) {
        this.factureRepository = factureRepository;
    }


    public Facture createFacture(Facture facture) {
        String numeroFacture = generateNumeroFacture();
        facture.setNumeroFacture(numeroFacture);

        if (facture.getElementsFacture() != null) {
            for (FactureElement element : facture.getElementsFacture()) {
                element.setFacture(facture);
            }
        }
        return factureRepository.save(facture);
    }

    public Optional<Facture> getFactureById(Long id) {
        return factureRepository.findById(id);
    }

    public List<Facture> getAllFactures() {
        return factureRepository.findAll();
    }

    public Facture updateFacture(Facture facture) {

        if (facture.getId() != null && factureRepository.existsById(facture.getId())) {
            return factureRepository.save(facture);
        }

        throw new RuntimeException("Facture avec l'ID " + facture.getId() + " n'existe pas.");
    }

    public void deleteFacture(Long id) {
        if (factureRepository.existsById(id)) {
            factureRepository.deleteById(id);
        } else {
            throw new RuntimeException("Facture avec l'ID " + id + " n'existe pas.");
        }
    }


    private String generateNumeroFacture() {

        Facture lastFacture = factureRepository.findTopByOrderByNumeroFactureDesc();
        String lastNumero = lastFacture != null ? lastFacture.getNumeroFacture() : "FAC-00000";
        int numero = Integer.parseInt(lastNumero.replace("FAC-", "")) + 1;
        return String.format("FAC-%05d", numero);
    }
}
