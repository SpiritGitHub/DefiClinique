package com.defitech.DefiClinique.service;

import com.defitech.DefiClinique.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientStatisticsServiceImpl implements PatientStatisticsService {

    private final PatientRepository patientRepository;

    @Autowired
    public PatientStatisticsServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public int getTotalPatients() {
        return Math.toIntExact(patientRepository.count());
    }

    @Override
    public int getPatientCount() {
        return 0;
    }

    @Override
    public List<Object[]> getGenderDistribution() {
        return patientRepository.getGenderDistribution();
    }

   // @Override
    //public long getNewPatientsCountByPeriod(LocalDate startDate, LocalDate endDate) {
     //   return patientRepository.countNewPatientsByPeriod(startDate, endDate);
    //}

}
