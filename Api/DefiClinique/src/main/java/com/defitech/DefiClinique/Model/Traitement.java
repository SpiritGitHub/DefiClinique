package com.defitech.DefiClinique.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "traitement")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Traitement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "historique_medicale_id")
    private HistoriqueMedicale historiqueMedicale;

    @ManyToOne
    @JoinColumn(name = "consultation_id")
    private Consultation consultation;

    @Column(name = "description")
    private String description;

    @Column(name = "dateDebut")
    private Date dateDebut;

    @Column(name = "dateFin")
    private Date dateFin;

    @Column(name = "instruction")
    private String instructions;

    @Column(name = "id_patient")
    private Long patientId;

    @Column(name = "medecin_id")
    private Long medecinId;
}