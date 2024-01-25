package com.defitech.DefiClinique.service;

import com.defitech.DefiClinique.Model.HistoriqueMedicale;
import com.defitech.DefiClinique.Repository.HistoriqueMedicaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistoriqueMedicaleServices {

    @Autowired
    private HistoriqueMedicaleRepository historiqueMedicaleRepository;

    public HistoriqueMedicale save(HistoriqueMedicale historique) {
        return historiqueMedicaleRepository.save(historique);
    }
}
