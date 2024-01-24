package com.defitech.DefiClinique.Azhar.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "dossiers_medicaux")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DossiersMedicaux {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "id_patient")
    private Long patientId;

    @Temporal(TemporalType.DATE)
    @Column(name = "lastUpDate")
    private Date dateCreation;

    private String groupeSanguin;

    @Column(name = "allergies")
    private String allergies;

    @OneToMany(mappedBy = "dossierMedical", fetch = FetchType.EAGER)
    private Set<HistoriqueMedicale> historiqueMedicale;
}