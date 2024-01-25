package com.defitech.DefiClinique.service;

import java.util.List;

public interface PatientStatisticsService extends StatisticsService {

    int getPatientCount();
    List<Object[]> getGenderDistribution();
    //ong getNewPatientsCountByPeriod(LocalDate startDate, LocalDate endDate);
}
