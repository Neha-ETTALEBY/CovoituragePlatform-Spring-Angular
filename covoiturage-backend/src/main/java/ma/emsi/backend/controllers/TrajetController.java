package ma.emsi.backend.controllers;

import ma.emsi.backend.models.Trajet;
import ma.emsi.backend.services.TrajetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/trips")
public class TrajetController {
    @Autowired
    private TrajetService trajetService;

    @PostMapping("/create")
    public ResponseEntity<Trajet> createTrajet(@RequestBody Trajet trajet) {
        return ResponseEntity.ok(trajetService.createTrajet(trajet));
    }

    @GetMapping("/search")
    public ResponseEntity<List<Trajet>> searchTrajets(@RequestParam String destination, @RequestParam int page, @RequestParam int size) {
        Pageable pageable = PageRequest.of(page, size);
        return ResponseEntity.ok(trajetService.searchTrajets(destination, pageable));
    }
}
