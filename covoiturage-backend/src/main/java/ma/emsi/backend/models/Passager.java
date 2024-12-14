package ma.emsi.backend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
public class Passager extends User {
    @OneToMany(mappedBy = "passager")
    private List<Reservation> reservations;
    @Id
    private Long id;


}