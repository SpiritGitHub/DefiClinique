package com.defitech.DefiClinique.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "consultation")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Consultation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private DossiersMedicaux dossierMedical;

    @Column(name = "date_consultation")
    private Date dateHeure;

    @Column(name = "motif")
    private String motif;

    @Column(name = "diagnostic")
    private String diagnostic;

    @Column(name = "notes")
    private String notes;

    @Column(name = "recommandation")
    private String recommandations;

}
