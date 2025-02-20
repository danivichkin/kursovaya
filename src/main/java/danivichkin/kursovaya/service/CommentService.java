package danivichkin.kursovaya.service;

import danivichkin.kursovaya.domain.Comment;
import danivichkin.kursovaya.domain.User;
import danivichkin.kursovaya.domain.Views;
import danivichkin.kursovaya.dto.EventType;
import danivichkin.kursovaya.dto.ObjectType;
import danivichkin.kursovaya.repo.CommentRepo;
import danivichkin.kursovaya.util.WsSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.function.BiConsumer;

@Service
public class CommentService {
    private final CommentRepo commentRepo;
    private final BiConsumer<EventType, Comment> wsSender;

    @Autowired
    public CommentService(CommentRepo commentRepo, WsSender wsSender) {
        this.commentRepo = commentRepo;
        this.wsSender = wsSender.getSender(ObjectType.COMMENT, Views.FullComment.class);
    }

    public Comment create(Comment comment, User user) {
        comment.setAuthor(user);
        Comment commentFromDb = commentRepo.save(comment);

        wsSender.accept(EventType.CREATE, commentFromDb);

        return commentFromDb;
    }
}
