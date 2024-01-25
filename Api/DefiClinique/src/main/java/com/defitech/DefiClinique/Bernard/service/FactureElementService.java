package com.defitech.DefiClinique.Bernard.service;

import com.defitech.DefiClinique.Bernard.model.FactureElement;
import com.defitech.DefiClinique.Bernard.repository.FactureElementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FactureElementService {

    private final FactureElementRepository factureElementRepository;

    @Autowired
    public FactureElementService(FactureElementRepository factureElementRepository) {
        this.factureElementRepository = factureElementRepository;
    }

    public FactureElement createFactureElement(FactureElement factureElement) {
        return factureElementRepository.save(factureElement);
    }

    public Optional<FactureElement> getFactureElementById(Long id) {
        return factureElementRepository.findById(id);
    }

    public List<FactureElement> getAllFactureElements() {
        return factureElementRepository.findAll();
    }

    public FactureElement updateFactureElement(FactureElement factureElement) {
        return factureElementRepository.save(factureElement);
    }

    public void deleteFactureElement(Long id) {
        factureElementRepository.deleteById(id);
    }


}
