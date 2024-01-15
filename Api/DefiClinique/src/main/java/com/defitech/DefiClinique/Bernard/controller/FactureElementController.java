package com.defitech.DefiClinique.Bernard.controller;

import com.defitech.DefiClinique.Bernard.model.FactureElement;
import com.defitech.DefiClinique.Bernard.service.FactureElementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/factureElements")
public class FactureElementController {

    private final FactureElementService factureElementService;

    @Autowired
    public FactureElementController(FactureElementService factureElementService) {
        this.factureElementService = factureElementService;
    }

    @PostMapping
    public ResponseEntity<FactureElement> createFactureElement(@RequestBody FactureElement factureElement) {
        FactureElement newFactureElement = factureElementService.createFactureElement(factureElement);
        return ResponseEntity.ok(newFactureElement);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FactureElement> getFactureElementById(@PathVariable Long id) {
        return factureElementService.getFactureElementById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<FactureElement> getAllFactureElements() {
        return factureElementService.getAllFactureElements();
    }

    @PutMapping("/{id}")
    public ResponseEntity<FactureElement> updateFactureElement(@PathVariable Long id, @RequestBody FactureElement factureElement) {
        return factureElementService.getFactureElementById(id)
                .map(existingElement -> {
                    factureElement.setId(id);
                    return ResponseEntity.ok(factureElementService.updateFactureElement(factureElement));
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteFactureElement(@PathVariable Long id) {
        return factureElementService.getFactureElementById(id)
                .map(element -> {
                    factureElementService.deleteFactureElement(id);
                    return ResponseEntity.ok().build();
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }


}
