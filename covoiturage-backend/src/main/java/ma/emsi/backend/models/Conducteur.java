package ma.emsi.backend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Setter
@Getter
public class Conducteur extends User {
    @OneToMany(mappedBy = "conducteur")
    private List<Trajet> trajets;
    @Id
    private Long id;

}