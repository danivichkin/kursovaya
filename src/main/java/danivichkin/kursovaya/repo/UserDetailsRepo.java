package danivichkin.kursovaya.repo;

import danivichkin.kursovaya.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepo extends JpaRepository<User, String> {
}
