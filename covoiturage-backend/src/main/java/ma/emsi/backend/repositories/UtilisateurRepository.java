package ma.emsi.backend.repositories;

import ma.emsi.backend.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<User, Long> {

}
