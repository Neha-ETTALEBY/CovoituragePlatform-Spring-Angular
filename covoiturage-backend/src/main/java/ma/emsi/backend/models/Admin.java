package ma.emsi.backend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Setter
@Getter
public class Admin extends User {
    @Id
    private Long id;

}