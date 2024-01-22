package service;

import model.Clinique;

import java.util.List;

public interface CliniqueService {

    List<Clinique> getAllCliniques();

    Clinique getCliniqueById(Long id);

    Clinique addClinique(Clinique clinique);

    Clinique updateClinique(Long id, Clinique updatedClinique);

    void deleteClinique(Long id);
}
