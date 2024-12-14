package ma.emsi.backend.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

public class Trajet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String pointDepart;
    private String destination;
    private LocalDateTime heureDepart;
    private Integer nbPlaces;
    @ManyToOne
    private User conducteur;
}
