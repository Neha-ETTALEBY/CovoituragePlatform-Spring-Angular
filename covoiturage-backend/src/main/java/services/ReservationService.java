package services;

import ma.emsi.backend.models.Reservation;
import ma.emsi.backend.models.Trajet;
import ma.emsi.backend.models.User;
import ma.emsi.backend.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {
    @Autowired
    private ReservationRepository reservationRepository;

    public boolean reservePlace(Trajet trajet, User passager) {
        Reservation reservation = new Reservation();
        reservation.setTrajet(trajet);
        reservation.setPassager(passager);
        reservation.setStatut("Confirmed");
        reservationRepository.save(reservation);
        return true;
    }
}
