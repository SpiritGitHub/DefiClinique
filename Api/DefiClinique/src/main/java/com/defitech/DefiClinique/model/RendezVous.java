package com.defitech.DefiClinique.model;

import jakarta.persistence.*;
import java.time.temporal.Temporal;

import java.time.LocalDateTime;

@Entity
public class RendezVous {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime dateHeure;


    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "docteur_id")
    private Docteur docteur;


    private String type;

    private LocalDateTime createdAt;


    public RendezVous() {
    }

    public RendezVous(LocalDateTime dateHeure, Patient patient, Docteur docteur, String type) {
        this.dateHeure = dateHeure;
        this.patient = patient;
        this.docteur = docteur;
        this.type = type;
    }



    public Temporal getDate() {
        return null;
    }

    public Temporal getCreatedAt() {
        return null;
    }
}
