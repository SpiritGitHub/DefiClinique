package repository;

import model.Clinique;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CliniqueRepository extends JpaRepository<Clinique, Long> {
}
