package com.defitech.DefiClinique.Azhar.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "historique_medicales")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HistoriqueMedicale {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "date_historique")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateHistorique;

    @Column(name = "type_historique")
    private String typeHistorique; // 'Consultation', 'Traitement', 'Analyse'

    @Column(name = "medecin_id")
    private Long medecinId;

    @Column(name = "patient_id")
    private Long patientId;

    @Column(name = "notes")
    private String notes;

    @ManyToOne
    @JoinColumn(name = "dossier_medicaux_id")
    private DossiersMedicaux dossierMedical;

}
