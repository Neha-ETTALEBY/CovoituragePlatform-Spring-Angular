package ma.emsi.backend.repositories;

import ma.emsi.backend.models.Trajet;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrajetRepository extends JpaRepository<Trajet, Long> {
    public void findByDestinationContaining(String destination, Pageable pageable);
}
