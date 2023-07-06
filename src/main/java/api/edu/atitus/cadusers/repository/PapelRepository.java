package api.edu.atitus.cadusers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import api.edu.atitus.cadusers.model.Papel;

public interface PapelRepository extends JpaRepository<Papel, Long> {
	Papel findByPapel(String papel);
}
