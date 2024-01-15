package com.defitech.DefiClinique.Bernard.controller;

import com.defitech.DefiClinique.Bernard.model.ClinicService;
import com.defitech.DefiClinique.Bernard.service.ClinicServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clinicServices")
public class ClinicServiceController {

    private final ClinicServiceService clinicServiceService;

    @Autowired
    public ClinicServiceController(ClinicServiceService clinicServiceService) {
        this.clinicServiceService = clinicServiceService;
    }

    @PostMapping
    public ResponseEntity<ClinicService> createClinicService(@RequestBody ClinicService clinicService) {
        ClinicService newClinicService = clinicServiceService.createService(clinicService);
        return ResponseEntity.ok(newClinicService);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClinicService> getClinicServiceById(@PathVariable Long id) {
        return clinicServiceService.getServiceById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<ClinicService> getAllClinicServices() {
        return clinicServiceService.getAllServices();
    }

    @PutMapping("/{id}")
    public ResponseEntity<ClinicService> updateClinicService(@PathVariable Long id, @RequestBody ClinicService clinicService) {
        return clinicServiceService.getServiceById(id)
                .map(existingService -> {
                    clinicService.setId(id);
                    return ResponseEntity.ok(clinicServiceService.updateService(clinicService));
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteClinicService(@PathVariable Long id) {
        return clinicServiceService.getServiceById(id)
                .map(service -> {
                    clinicServiceService.deleteService(id);
                    return ResponseEntity.ok().build();
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

}
