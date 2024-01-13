package com.defitech.DefiClinique.controller;

import com.defitech.DefiClinique.Model.Traitement;
import com.defitech.DefiClinique.service.TraitementServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
