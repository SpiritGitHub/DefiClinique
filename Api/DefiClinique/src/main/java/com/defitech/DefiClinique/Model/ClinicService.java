package com.defitech.DefiClinique.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "clinic_service")
public class ClinicService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "service_id")
    private Long id;

    @Column(nullable = false, unique = true,name = "nom")
    private String nom;

    @Column(length = 500,name = "description")
    private String description;

    @Column(nullable = false,name = "cout")
    private Double cout;

    @Column(nullable = false, name = "typeService")
    private String typeService;

    public ClinicService() {

    }


}
