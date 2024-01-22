package service;

import java.time.LocalDate;
import java.util.Map;

public interface PatientStatisticsService extends StatisticsService {

    int getPatientCount();
    Map<String, Long> getGenderDistribution();
    long getNewPatientsCountByPeriod(LocalDate startDate, LocalDate endDate);
}
