package api.edu.atitus.cadusers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import api.edu.atitus.cadusers.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	Usuario findByLogin(String login);
}
