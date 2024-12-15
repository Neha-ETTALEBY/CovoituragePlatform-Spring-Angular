package ma.emsi.backend.controllers;

import ma.emsi.backend.models.Trajet;
import ma.emsi.backend.models.User;
import ma.emsi.backend.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController {
    @Autowired
    private ReservationService reservationService;

    @PostMapping("/reserve")
    public ResponseEntity<Boolean> reservePlace(@RequestBody Trajet trajetId, @RequestParam User passager) {
        return ResponseEntity.ok(reservationService.reservePlace(trajetId, passager));
    }
}