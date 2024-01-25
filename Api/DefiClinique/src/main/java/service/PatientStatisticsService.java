package service;

import java.time.LocalDate;
import java.util.List;

public interface PatientStatisticsService extends StatisticsService {

    int getPatientCount();
    List<Object[]> getGenderDistribution();
    //ong getNewPatientsCountByPeriod(LocalDate startDate, LocalDate endDate);
}
