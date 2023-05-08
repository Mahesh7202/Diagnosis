package diagnosis.repository;

import diagnosis.model.Diagnosis;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiagnosisRepository extends JpaRepository<Diagnosis, Long> {
}
