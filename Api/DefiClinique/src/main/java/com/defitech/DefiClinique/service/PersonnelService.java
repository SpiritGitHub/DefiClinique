package com.defitech.DefiClinique.service;

import com.defitech.DefiClinique.Model.Departement;
import com.defitech.DefiClinique.Model.Personnel;
import com.defitech.DefiClinique.Model.PersonnelDTO;
import com.defitech.DefiClinique.Repository.DepartementRepository;
import com.defitech.DefiClinique.Repository.PersonnelRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Data
@Service

public class PersonnelService {
    @Autowired
    private PersonnelRepository personnelRepository;

    @Autowired
    private DepartementRepository departementRepository;

    private Personnel dtoToEntity(PersonnelDTO personnelDTO) {
        Personnel personnel = new Personnel();
        personnel.setNom(personnelDTO.getNom());
        personnel.setPrenom(personnelDTO.getPrenom());
        personnel.setDocnum(personnelDTO.getDocnum());
        personnel.setSpecialite(personnelDTO.getSpecialite());
        personnel.setMotdepasse(personnelDTO.getMotdepasse());
        if (personnelDTO.getIdDepartement() != null) {
            Departement departement = departementRepository.findById(personnelDTO.getIdDepartement()).orElse(null);
            personnel.setDepartement(departement);
        }
        return personnel;
    }

    public PersonnelDTO entityToDto(Personnel personnel) {
        PersonnelDTO dto = new PersonnelDTO();
        dto.setNom(personnel.getNom());
        dto.setPrenom(personnel.getPrenom());
        dto.setDocnum(personnel.getDocnum());
        dto.setSpecialite(personnel.getSpecialite());
        dto.setMotdepasse(personnel.getMotdepasse());
        if (personnel.getDepartement() != null) {
            dto.setNomDepartement(personnel.getDepartement().getNomDepartement());
        }
        return dto;
    }

    public Personnel ajouterPersonnel(PersonnelDTO personnelDTO) {
        Personnel personnel = new Personnel();

        personnel.setNom(personnelDTO.getNom());
        personnel.setPrenom(personnelDTO.getPrenom());
        personnel.setDocnum(personnelDTO.getDocnum());
        personnel.setSpecialite(personnelDTO.getSpecialite());
        personnel.setMotdepasse(personnelDTO.getMotdepasse());

        Departement departement = null;
        if (personnelDTO.getIdDepartement() != null) {
            departement = departementRepository.findById(personnelDTO.getIdDepartement())
                    .orElseThrow(() -> new RuntimeException("Département non trouvé avec l'id : " + personnelDTO.getIdDepartement()));
        } else if (personnelDTO.getNomDepartement() != null) {
            departement = departementRepository.findByNomDepartement(personnelDTO.getNomDepartement())
                    .orElseThrow(() -> new RuntimeException("Département non trouvé avec le nom : " + personnelDTO.getNomDepartement()));
        }

        if (departement != null) {
            departement.ajouterEmploye(personnel);
            departementRepository.save(departement);
        }

        return personnelRepository.save(personnel);
    }


    public List<PersonnelDTO> listerTousLesPersonnels() {
        Iterable<Personnel> iterable = personnelRepository.findAll();
        List<Personnel> personnels = new ArrayList<>();
        iterable.forEach(personnels::add);
        return personnels.stream().map(this::entityToDto).collect(Collectors.toList());
    }

    public PersonnelDTO trouverPersonnelParId(Long id) {
        Optional<Personnel> personnel = personnelRepository.findById(id);
        return personnel.map(this::entityToDto).orElse(null);
    }

    public PersonnelDTO mettreAJourPersonnel(Long id, PersonnelDTO personnelDTO) {
        if (personnelRepository.existsById(id)) {
            Personnel personnel = dtoToEntity(personnelDTO);
            personnel.setIdPersonnel(id);
            personnel = personnelRepository.save(personnel);
            return entityToDto(personnel);
        }
        return null;
    }

    public List<PersonnelDTO> getAllPersonnelWithDepartementName() {
        Iterable<Personnel> allPersonnel = personnelRepository.findAll();

        return StreamSupport.stream(allPersonnel.spliterator(), false)
                .map(this::entityToDto)
                .collect(Collectors.toList());
    }
    public void supprimerPersonnel(Long id) {
        personnelRepository.deleteById(id);
    }
}