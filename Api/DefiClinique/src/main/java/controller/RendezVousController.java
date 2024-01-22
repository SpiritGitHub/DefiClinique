package controller;

import model.RendezVous;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.RendezVousService;

import java.util.List;

@RestController
@RequestMapping("/api/rendezvous")
public class RendezVousController {

    private final RendezVousService rendezVousService;

    @Autowired
    public RendezVousController(RendezVousService rendezVousService) {
        this.rendezVousService = rendezVousService;
    }

    @GetMapping
    public List<RendezVous> getAllRendezVous() {
        return rendezVousService.getAllRendezVous();
    }

    @GetMapping("/{id}")
    public RendezVous getRendezVousById(@PathVariable Long id) {
        return rendezVousService.getRendezVousById(id);
    }

    @PostMapping
    public RendezVous addRendezVous(@RequestBody RendezVous rendezVous) {
        return rendezVousService.addRendezVous(rendezVous);
    }

    @PutMapping("/{id}")
    public RendezVous updateRendezVous(@PathVariable Long id, @RequestBody RendezVous updatedRendezVous) {
        return rendezVousService.updateRendezVous(id, updatedRendezVous);
    }

    @DeleteMapping("/{id}")
    public void deleteRendezVous(@PathVariable Long id) {
        rendezVousService.deleteRendezVous(id);
    }
}
