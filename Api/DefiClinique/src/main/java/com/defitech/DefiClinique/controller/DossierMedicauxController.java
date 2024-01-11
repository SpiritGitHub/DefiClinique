package com.defitech.DefiClinique.controller;

import com.defitech.DefiClinique.Model.DossiersMedicaux;
import com.defitech.DefiClinique.service.DossiersMedicauxServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class DossierMedicauxController {

    @Autowired
    private DossiersMedicauxServices dossiersMedicauxServices;

    @GetMapping("/dossiersmedicaux")
    public Iterable<DossiersMedicaux> getDossiersMedicaux(){
        return dossiersMedicauxServices.getDossiersMedicaux();
    }


}
