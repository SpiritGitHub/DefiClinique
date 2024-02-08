package com.defitech.DefiClinique.controller;

import com.defitech.DefiClinique.Model.PersonnelDTO;
import com.defitech.DefiClinique.service.PersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins ="http://localhost:4200")
@RequestMapping("clinique")
@RestController
public class personelControler {
    @Autowired
    private PersonnelService personnelService;

    @PostMapping("/createpersonnel")
    public ResponseEntity<PersonnelDTO> ajouterPersonnel(@RequestBody PersonnelDTO personnelDTO) {
        PersonnelDTO nouveauPersonnel = personnelService.ajouterPersonnel(personnelDTO);
        return ResponseEntity.ok(nouveauPersonnel);
    }
    @GetMapping("/allpersonnel")
    public ResponseEntity<List<PersonnelDTO>> listerTousLesPersonnels() {
        List<PersonnelDTO> personnels = personnelService.listerTousLesPersonnels();
        return ResponseEntity.ok(personnels);
    }

    @GetMapping("personnel/{id}")
    public ResponseEntity<PersonnelDTO> trouverPersonnelParId(@PathVariable Long id) {
        PersonnelDTO personnelDTO = personnelService.trouverPersonnelParId(id);
        if (personnelDTO != null) {
            return ResponseEntity.ok(personnelDTO);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @PutMapping("updatepersonnel/{id}")
    public ResponseEntity<PersonnelDTO> mettreAJourPersonnel(@PathVariable Long id, @RequestBody PersonnelDTO personnelDTO) {
        PersonnelDTO personnelMisAJour = personnelService.mettreAJourPersonnel(id, personnelDTO);
        if (personnelMisAJour != null) {
            return ResponseEntity.ok(personnelMisAJour);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("deletepersonnel/{id}")
    public ResponseEntity<Void> supprimerPersonnel(@PathVariable Long id) {
        personnelService.supprimerPersonnel(id);
        return ResponseEntity.ok().build();
    }
}
