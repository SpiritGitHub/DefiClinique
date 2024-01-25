package com.defitech.DefiClinique.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
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

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_patient", referencedColumnName = "idPatient")
    private Patient patient;

    @Temporal(TemporalType.DATE)
    @Column(name = "lastUpDate")
    private Date dateCreation;

    private String groupeSanguin;

    @Column(name = "allergies")
    private String allergies;

    @OneToMany(mappedBy = "dossierMedical", fetch = FetchType.LAZY)
    private Set<HistoriqueMedicale> historiqueMedicale;
}