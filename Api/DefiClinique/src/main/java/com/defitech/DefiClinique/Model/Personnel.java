package com.defitech.DefiClinique.Model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "personnel")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Personnel {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idPersonnel;

        private String nom;
        private String prenom;
        private Integer docnum;
        private String specialite;
        private String motdepasse;

        @ManyToOne()
        @JoinColumn(name = "departement_id")
        private Departement departement;
    }

