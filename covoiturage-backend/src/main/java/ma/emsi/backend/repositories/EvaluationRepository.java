package ma.emsi.backend.repositories;

import ma.emsi.backend.models.Evaluation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvaluationRepository extends JpaRepository<Evaluation, Long> {
}
