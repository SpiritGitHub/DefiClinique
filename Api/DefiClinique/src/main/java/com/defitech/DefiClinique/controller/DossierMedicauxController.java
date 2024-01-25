package com.defitech.DefiClinique.controller;

import com.defitech.DefiClinique.Model.DossiersMedicaux;
import com.defitech.DefiClinique.service.DossiersMedicauxServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/deficlinique")
public class DossierMedicauxController {

    private final DossiersMedicauxServices dossiersMedicauxService;

    public DossierMedicauxController(DossiersMedicauxServices dossiersMedicauxService) {
        this.dossiersMedicauxService = dossiersMedicauxService;
    }

    @GetMapping("alldossiersmedicaux")
    public List<DossiersMedicaux> getAllDossiersMedicaux() {
        return dossiersMedicauxService.getAllDossiersMedicaux();
    }

    @GetMapping("dossiersmedicauxbyid/{id}")
    public ResponseEntity<DossiersMedicaux> getDossierMedicauxById(@PathVariable Long id) {
        try {
            DossiersMedicaux dossier = dossiersMedicauxService.getDossierMedicauxById(id);
            return ResponseEntity.ok(dossier);
        } catch (RuntimeException ex) {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("adddossiersmedicaux")
    public DossiersMedicaux createDossier(@RequestBody DossiersMedicaux dossier) {
        return dossiersMedicauxService.saveDossierMedicaux(dossier);
    }

    @PutMapping("updossiersmedicaux/{id}")
    public ResponseEntity<DossiersMedicaux> updateDossier(@PathVariable Long id, @RequestBody DossiersMedicaux dossierDetails) {
        try {
            return ResponseEntity.ok(dossiersMedicauxService.updateDossierMedicaux(id, dossierDetails));
        } catch (RuntimeException ex) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("deldossiersmedicaux/{id}")
    public ResponseEntity<Void> deleteDossier(@PathVariable Long id) {
        try {
            dossiersMedicauxService.deleteDossierMedicaux(id);
            return ResponseEntity.ok().build();
        } catch (RuntimeException ex) {
            return ResponseEntity.notFound().build();
        }
    }


}
