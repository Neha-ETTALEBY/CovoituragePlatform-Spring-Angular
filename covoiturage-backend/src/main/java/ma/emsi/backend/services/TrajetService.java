package ma.emsi.backend.services;

import ma.emsi.backend.models.Trajet;
import ma.emsi.backend.repositories.TrajetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;

import java.util.List;

@Service
public class TrajetService {
    @Autowired
    private TrajetRepository trajetRepository;

    public Trajet createTrajet(Trajet trajet) {
        return trajetRepository.save(trajet);
    }

    public List<Trajet> searchTrajets(String destination, Pageable pageable) {
        return trajetRepository.findByDestinationContaining(destination, pageable);
    }
}