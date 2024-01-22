package service;
import model.RendezVous;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RendezVousService {

    List<RendezVous> getAllRendezVous();

    RendezVous getRendezVousById(Long id);

    RendezVous addRendezVous(RendezVous rendezVous);

    RendezVous updateRendezVous(Long id, RendezVous updatedRendezVous);

    void deleteRendezVous(Long id);
}
