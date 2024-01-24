package com.defitech.DefiClinique.Azhar.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "analyse")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Analyse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long analyseId;

    @Column(name = "type_analyse")
    private String typeAnalyse;

    @Temporal(TemporalType.DATE)
    @Column(name = "date_analyse")
    private Date dateAnalyse;

    @Column(name = "resultats", columnDefinition = "TEXT")
    private String resultats;

    @Column(name = "commentaires_medecin", columnDefinition = "TEXT")
    private String commentairesMedecin;

    @Column(name = "urgence")
    private Boolean urgence;

    @Column(name = "patient_id")
    private Long patientId;

    @Column(name = "medecin_id")
    private Long medecinId;

}

