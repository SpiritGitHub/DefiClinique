package com.defitech.DefiClinique.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "departement")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Departement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDepartement;

    private String nomDepartement;
    private String ChefDepartement;
    private String localisation;
    private String description;
    private int nombreEmployes;

    @OneToMany(mappedBy = "departement", fetch = FetchType.LAZY)
    private List<Personnel> personnels;
}
