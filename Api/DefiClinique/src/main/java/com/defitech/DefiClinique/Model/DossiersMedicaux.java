package com.defitech.DefiClinique.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


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
    private Long idPatient;

    @Temporal(TemporalType.DATE)
    @Column(name = "date_creation")
    private Date dateCreation;

    @Column(name = "antecedents_medicaux")
    private String antecedentsMedicaux;

    @Column(name = "allergies")
    private String allergies;

    @Column(name = "traitements_en_cours")
    private String traitementsEnCours;

    @Column(name = "historique_visites")
    private String historiqueVisites;

    @Column(name = "notes_medecin")
    private String notesMedecin;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date_mise_a_jour")
    private Date dateMiseAJour;


}

