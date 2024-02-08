package com.defitech.DefiClinique.Model;

import lombok.Data;

@Data
public class PersonnelDTO {
    private String nom;
    private String prenom;
    private Integer docnum;
    private String specialite;
    private String motdepasse;
    private String nomDepartement;

}

