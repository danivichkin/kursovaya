package danivichkin.kursovaya.domain;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.EqualsAndHashCode;
import lombok.Data;

import javax.persistence.*;


@Data
@Table
@Entity
@EqualsAndHashCode(of = { "id" })
public class Comment {

    @Id
    @GeneratedValue
    @JsonView(Views.IdName.class)
    private Long id;

    @JsonView(Views.IdName.class)
    private String text;

    @ManyToOne
    @JoinColumn(name = "message_id")
    private Message message;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false, updatable = false)
    @JsonView(Views.FullMessage.class)
    private User author;
}
