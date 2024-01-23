package com.defitech.DefiClinique.Chahib.entite;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPatient;

    private String nomPatient;
    private String sexe;
    private int telephone;
    private String adresse;
    private int numAssMaladie;

    @Temporal(TemporalType.DATE)
    private Date dateNaissance;

    @Column(name = "statut")
    private int statut = 1;

    // New field for the image
    @Lob
    private byte[] image;

    public void softDelete() {
        this.statut = 0;
    }
}
