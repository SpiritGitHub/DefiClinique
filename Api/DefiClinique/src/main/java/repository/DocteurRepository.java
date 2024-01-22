package repository;

import model.Docteur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocteurRepository extends JpaRepository<Docteur, Long> {

}
