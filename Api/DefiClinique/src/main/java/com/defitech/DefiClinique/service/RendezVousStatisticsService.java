package com.defitech.DefiClinique.service;

import java.util.Map;

public interface RendezVousStatisticsService {
    int getTotalRendezVous();
    Map<Long, Long> getAppointmentFrequencyByDoctor();
    double getAverageWaitingTime();
}
