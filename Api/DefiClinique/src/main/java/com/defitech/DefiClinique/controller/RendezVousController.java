package com.defitech.DefiClinique.controller;

import com.defitech.DefiClinique.service.RendezVousService;
import com.defitech.DefiClinique.Model.RendezVous;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class RendezVousController {

    private final RendezVousService rendezVousService;

    @Autowired
    public RendezVousController(RendezVousService rendezVousService) {
        this.rendezVousService = rendezVousService;
    }

    @GetMapping("rendezVous")
    public ResponseEntity<List<RendezVous>> getAllRendezVous() {
        List<RendezVous> rendezVousList = rendezVousService.getAllRendezVous();
        return new ResponseEntity<>(rendezVousList, HttpStatus.OK);
    }

    @GetMapping("rendezVous/{id}")
    public ResponseEntity<RendezVous> getRendezVousById(@PathVariable Long id) {
        Optional<RendezVous> rendezVous = rendezVousService.getRendezVousById(id);
        return rendezVous.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("addrendezVous")
    public ResponseEntity<RendezVous> saveRendezVous(@RequestBody RendezVous rendezVous) throws Exception {
        RendezVous savedRendezVous = rendezVousService.saveRendezVous(rendezVous);
        return new ResponseEntity<>(savedRendezVous, HttpStatus.CREATED);
    }

    @DeleteMapping("/delrendezVous/{id}")
    public ResponseEntity<Void> deleteRendezVous(@PathVariable Long id) {
        rendezVousService.deleteRendezVous(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }



    @PutMapping("/updaterendezVous/{id}")
    public ResponseEntity<RendezVous> updateRendezVous(@PathVariable Long id, @RequestBody RendezVous updatedRendezVous) throws Exception {
        Optional<RendezVous> existingRendezVous = rendezVousService.getRendezVousById(id);

        if (existingRendezVous.isPresent()) {
            // Mettez à jour les propriétés nécessaires du rendez-vous existant
            RendezVous currentRendezVous = existingRendezVous.get();
            currentRendezVous.setNom(updatedRendezVous.getNom());
            currentRendezVous.setStatut(updatedRendezVous.getStatut());
            currentRendezVous.setDate(updatedRendezVous.getDate());
            currentRendezVous.setHeure(updatedRendezVous.getHeure());
            currentRendezVous.setMotif(updatedRendezVous.getMotif());

            // Enregistrez la mise à jour dans le service
            RendezVous updatedRendezVousEntity = rendezVousService.saveRendezVous(currentRendezVous);

            return new ResponseEntity<>(updatedRendezVousEntity, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
