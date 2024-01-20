package com.defitech.DefiClinique.Model;

import jakarta.persistence.*;
import lombok.*;

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

    @Column(name = "status_consul")
    private String statusConsul;
}
