package com.defitech.DefiClinique.Azhar.controller;

import com.defitech.DefiClinique.Azhar.Model.Traitement;
import com.defitech.DefiClinique.Azhar.service.TraitementServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/deficlinique/")
public class TraitementController {

    private final TraitementServices traitementService;

    public TraitementController(TraitementServices traitementService) {
        this.traitementService = traitementService;
    }

    @GetMapping("/alltraitement")
    public List<Traitement> getAllTraitements() {
        return traitementService.getAllTraitements();
    }

    @GetMapping("/traitementbyid/{id}")
    public ResponseEntity<Traitement> getTraitementById(@PathVariable Long id) {
        try {
            Traitement traitement = traitementService.getTraitementById(id);
            return ResponseEntity.ok(traitement);
        } catch (RuntimeException ex) {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("createtraitement")
    public Traitement addTraitement(@RequestBody Traitement traitement) {
        return traitementService.saveTraitement(traitement);
    }

    @PutMapping("uptraitement/{id}")
    public ResponseEntity<Traitement> updateTraitement(@PathVariable Long id, @RequestBody Traitement traitementDetails) {
        try {
            return ResponseEntity.ok(traitementService.updateTraitement(id, traitementDetails));
        } catch (RuntimeException ex) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("deltraitement/{id}")
    public ResponseEntity<Void> deleteTraitement(@PathVariable Long id) {
        try {
            traitementService.deleteTraitement(id);
            return ResponseEntity.ok().build();
        } catch (RuntimeException ex) {
            return ResponseEntity.notFound().build();
        }
    }
}
