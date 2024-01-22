package service;

import model.Docteur;

import java.util.List;

public interface DocteurService {

    List<Docteur> getAllDocteurs();

    Docteur getDocteurById(Long id);

    Docteur addDocteur(Docteur docteur);

    Docteur updateDocteur(Long id, Docteur updatedDocteur);

    void deleteDocteur(Long id);
}
