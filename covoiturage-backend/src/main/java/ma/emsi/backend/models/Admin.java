package ma.emsi.backend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Admin extends User {
    @Id
    private Long id;

}