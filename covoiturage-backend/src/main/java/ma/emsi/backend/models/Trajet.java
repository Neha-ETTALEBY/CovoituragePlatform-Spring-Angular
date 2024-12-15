package ma.emsi.backend.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
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
