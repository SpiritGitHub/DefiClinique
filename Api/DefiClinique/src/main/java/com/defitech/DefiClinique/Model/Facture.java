package com.defitech.DefiClinique.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "facture")
public class Facture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "facture_id")
    private Long id;

    @Column(nullable = false, unique = true, name = "numeroFacture")
    private String numeroFacture;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false, name = "dateFacture")
    private Date dateFacturation;

    @Column(name = "total")
    private Double total;

    @Column(nullable = false, name = "nomPatient")
    private String nomPatient;

    @OneToMany(mappedBy = "facture", cascade = CascadeType.ALL)
    private List<FactureElement> elementsFacture;

    public Facture() {

    }


}
