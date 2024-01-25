package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.temporal.Temporal;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class RendezVous {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime dateHeure;


    private Patient patient;


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
