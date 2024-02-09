package com.defitech.DefiClinique.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "departement")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Departement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDepartement;

    @Column(unique = true)
    private String nomDepartement;

    private String ChefDepartement;
    private String localisation;
    private String description;
    private Integer nombreEmployes;

    @OneToMany(mappedBy = "departement", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Personnel> employes = new HashSet<>();
}
