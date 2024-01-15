package com.defitech.DefiClinique.Bernard.service;

import com.defitech.DefiClinique.Bernard.model.ClinicService;
import com.defitech.DefiClinique.Bernard.repository.ClinicServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClinicServiceService {

    private final ClinicServiceRepository clinicServiceRepository;

    @Autowired
    public ClinicServiceService(ClinicServiceRepository clinicServiceRepository) {
        this.clinicServiceRepository = clinicServiceRepository;
    }

    public ClinicService createService(ClinicService clinicService) {
        return clinicServiceRepository.save(clinicService);
    }

    public Optional<ClinicService> getServiceById(Long id) {
        return clinicServiceRepository.findById(id);
    }

    public List<ClinicService> getAllServices() {
        return clinicServiceRepository.findAll();
    }

    public ClinicService updateService(ClinicService clinicService) {
        return clinicServiceRepository.save(clinicService);
    }

    public void deleteService(Long id) {
        clinicServiceRepository.deleteById(id);
    }

}
