package controller;

import model.Docteur;
import service.DocteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/docteurs")
public class DocteurController {

    private final DocteurService docteurService;

    @Autowired
    public DocteurController(DocteurService docteurService) {
        this.docteurService = docteurService;
    }

    @GetMapping
    public List<Docteur> getAllDocteurs() {
        return docteurService.getAllDocteurs();
    }

    @GetMapping("/{id}")
    public Docteur getDocteurById(@PathVariable Long id) {
        return docteurService.getDocteurById(id);
    }

    @PostMapping
    public Docteur addDocteur(@RequestBody Docteur docteur) {
        return docteurService.addDocteur(docteur);
    }

    @PutMapping("/{id}")
    public Docteur updateDocteur(@PathVariable Long id, @RequestBody Docteur updatedDocteur) {
        return docteurService.updateDocteur(id, updatedDocteur);
    }

    @DeleteMapping("/{id}")
    public void deleteDocteur(@PathVariable Long id) {
        docteurService.deleteDocteur(id);
    }
}
