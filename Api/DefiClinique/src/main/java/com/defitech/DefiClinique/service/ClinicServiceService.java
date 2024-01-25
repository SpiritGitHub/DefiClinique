package com.defitech.DefiClinique.service;

import com.defitech.DefiClinique.Model.ClinicService;
import com.defitech.DefiClinique.Repository.ClinicServiceRepository;
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
