package ma.emsi.backend.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Data
@Entity
@Setter
@Getter
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
