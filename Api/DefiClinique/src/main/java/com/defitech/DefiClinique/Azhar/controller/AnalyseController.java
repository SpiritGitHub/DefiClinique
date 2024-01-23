package com.defitech.DefiClinique.Azhar.controller;

import com.defitech.DefiClinique.Azhar.Model.Analyse;
import com.defitech.DefiClinique.Azhar.service.AnalyseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/deficlinique")
public class AnalyseController {

    @Autowired
    private AnalyseService analyseService;

    @GetMapping("allanalyse")
    public List<Analyse> getAllAnalyses() {
        return analyseService.findAll();
    }

    @GetMapping("analysebyid/{id}")
    public ResponseEntity<Analyse> getAnalyseById(@PathVariable Long id) {
        return analyseService.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("createanalyse")
    public Analyse createAnalyse(@RequestBody Analyse analyse) {
        return analyseService.saveAnalyse(analyse);
    }

    @DeleteMapping("delanalyse/{id}")
    public ResponseEntity<Void> deleteAnalyse(@PathVariable Long id) {
        analyseService.deleteById(id);
        return ResponseEntity.ok().build();
    }
}

