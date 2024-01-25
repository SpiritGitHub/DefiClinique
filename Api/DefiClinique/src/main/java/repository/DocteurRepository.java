package repository;

import model.Docteur;
import model.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DocteurRepository extends JpaRepository<Docteur, Long> {

}
