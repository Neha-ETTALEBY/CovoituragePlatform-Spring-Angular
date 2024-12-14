package ma.emsi.backend.repositories;

import ma.emsi.backend.models.Trajet;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TrajetRepository extends JpaRepository<Trajet, Long> {
    public List<Trajet> findByDestinationContaining(String destination, Pageable pageable);
}
