package danivichkin.kursovaya.repo;

import danivichkin.kursovaya.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository<Message, Long> {
}
