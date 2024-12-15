package ma.emsi.backend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Conducteur extends User {
    @OneToMany(mappedBy = "conducteur")
    private List<Trajet> trajets;
    @Id
    private Long id;

}