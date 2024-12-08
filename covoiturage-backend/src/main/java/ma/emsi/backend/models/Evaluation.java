package ma.emsi.backend.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Evaluation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer note;
    private String commentaire;

    @ManyToOne
    private User auteur;
}