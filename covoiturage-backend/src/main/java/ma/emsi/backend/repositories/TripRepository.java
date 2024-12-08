package ma.emsi.backend.repositories;

import ma.emsi.backend.models.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TripRepository extends JpaRepository<Trip, Long> {
    List<Trip> findByDestinationContainingIgnoreCase(String destination);
}