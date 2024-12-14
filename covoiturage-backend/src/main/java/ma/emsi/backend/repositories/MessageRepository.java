package ma.emsi.backend.repositories;

import ma.emsi.backend.models.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
