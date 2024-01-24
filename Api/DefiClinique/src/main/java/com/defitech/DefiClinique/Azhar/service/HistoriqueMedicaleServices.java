package com.defitech.DefiClinique.Azhar.service;

import com.defitech.DefiClinique.Azhar.Model.HistoriqueMedicale;
import com.defitech.DefiClinique.Azhar.Repository.HistoriqueMedicaleRepository;
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
