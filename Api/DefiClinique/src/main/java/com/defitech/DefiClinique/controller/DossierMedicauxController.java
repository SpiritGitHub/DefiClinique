package com.defitech.DefiClinique.controller;

import com.defitech.DefiClinique.Model.DossiersMedicaux;
import com.defitech.DefiClinique.service.DossiersMedicauxServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("deficlinique")
public class DossierMedicauxController {

    @Autowired
    private DossiersMedicauxServices dossiersMedicauxServices;

    @GetMapping("/dossiersmedicaux")
    public Iterable<DossiersMedicaux> getDossiersMedicaux(){
        return dossiersMedicauxServices.getDossiersMedicaux();
    }

    @GetMapping("/dossiersmedicaux/{id}")
    public ResponseEntity<DossiersMedicaux> getDossierMedicauxById(@PathVariable Long id) {
        return dossiersMedicauxServices.getDossiersMedicaux(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/dossiersmedicaux")
    public DossiersMedicaux createDossier(@RequestBody DossiersMedicaux dossier) {
        return dossiersMedicauxServices.saveDossierMedicaux(dossier);
    }

    @PutMapping("/dossiersmedicaux/{id}")
    public ResponseEntity<DossiersMedicaux> updateDossier(@PathVariable Long id, @RequestBody DossiersMedicaux dossierDetails) {
        return dossiersMedicauxServices.getDossiersMedicaux(id)
                .map(dossier -> {
                    return ResponseEntity.ok(dossiersMedicauxServices.saveDossierMedicaux(dossier));
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/dossiersmedicaux/{id}")
    public ResponseEntity<Void> deleteDossier(@PathVariable Long id) {
        dossiersMedicauxServices.deleteDosssierMedicaux(id);
        return ResponseEntity.ok().build();
    }
}
