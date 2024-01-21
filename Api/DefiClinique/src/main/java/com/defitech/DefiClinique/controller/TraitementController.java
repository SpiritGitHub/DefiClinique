package com.defitech.DefiClinique.controller;

import com.defitech.DefiClinique.Model.Traitement;
import com.defitech.DefiClinique.service.TraitementServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.Optional;

@RestController
@RequestMapping("deficlinique")
public class TraitementController {
    @Autowired
    private TraitementServices traitementServices;

    @GetMapping("/traitement")
    public Iterable<Traitement> getTraitements(){
        return traitementServices.getTraitements();
    }

    @GetMapping("/traitement/{id}")
    public ResponseEntity<Traitement> getTraitementById(@PathVariable Long id){
        return traitementServices.getTraitement(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/atraitement")
    public ResponseEntity<Traitement> addTraitement(@RequestBody Traitement traitement) {
        Traitement newTraitement = traitementServices.addTraitement(traitement);
        return ResponseEntity.ok(newTraitement);
    }
    @DeleteMapping("/traitement/{id}")
    public ResponseEntity<?> deleteTraitement(@PathVariable Long id) {
        if (traitementServices.deleteTraitement(id)) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/traitement/{id}")
    public ResponseEntity<Traitement> updateTraitement(@PathVariable Long id, @RequestBody Traitement traitementDetails) {
        return traitementServices.updateTraitement(id, traitementDetails)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }


}
