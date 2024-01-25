package com.defitech.DefiClinique.controller;

import com.defitech.DefiClinique.Model.Personnel;
import com.defitech.DefiClinique.service.PersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("clinique")
@RestController
public class personelControler {
    @Autowired
    private PersonnelService personnelService;

    @GetMapping("/perso")
    public Iterable<Personnel> getPersonnel() {
        return personnelService.getPersonnel();
    }

    @GetMapping("/personnel/{id}")
    public ResponseEntity<Personnel> getPersonnelById(@PathVariable Long id) {
        return personnelService.getPersonnel(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/createpersonnel")
    public Personnel createDossier(@RequestBody Personnel dossier) {
        return personnelService.savePersonnel(dossier);
    }

    @PutMapping("/updatepersonnel/{id}")
    public ResponseEntity<Personnel> updateDossier(@PathVariable Long id, @RequestBody Personnel updatedPersonnelData) {
        Optional<Personnel> existingPersonnel = personnelService.getPersonnel(id);

        if (existingPersonnel.isPresent()) {
            Personnel existingPersonnelEntity = existingPersonnel.get();

            // Update attributes of the Personnel object with new data
            existingPersonnelEntity.setPrenom(updatedPersonnelData.getPrenom());
            existingPersonnelEntity.setNom(updatedPersonnelData.getNom());
            existingPersonnelEntity.setDepartement(updatedPersonnelData.getDepartement());
            existingPersonnelEntity.setMotdepasse(updatedPersonnelData.getMotdepasse());
            existingPersonnelEntity.setDocnum(updatedPersonnelData.getDocnum());

            // Save changes by calling savePersonnel
            Personnel updatedPersonnel = personnelService.savePersonnel(existingPersonnelEntity);

            return ResponseEntity.ok(updatedPersonnel);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/deletepersonnel/{id}")
    public ResponseEntity<Void> deleteDossier(@PathVariable Long id) {
        personnelService.deletePersonnel(id);
        return ResponseEntity.ok().build();
    }
}
