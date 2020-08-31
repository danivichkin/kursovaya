package danivichkin.kursovaya.repo;

import danivichkin.kursovaya.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepo extends JpaRepository<Comment, Long> {
}
