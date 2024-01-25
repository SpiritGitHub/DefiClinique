package com.defitech.DefiClinique.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.Set;

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
    private long telephone;
    private String adresse;
    private long numAssMaladie;

    @Temporal(TemporalType.DATE)
    private Date dateNaissance;

    @Column(name = "statut")
    private int statut = 1;

    // New field for the image
    @Lob
    private String image;

    public void softDelete() {
        this.statut = 0;
    }

    @OneToOne(mappedBy = "patient", cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
    private DossiersMedicaux dossierMedical;

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private Set<RendezVous> rendezVous;
}
