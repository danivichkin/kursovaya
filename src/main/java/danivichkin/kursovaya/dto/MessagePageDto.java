package danivichkin.kursovaya.dto;

import com.fasterxml.jackson.annotation.JsonView;
import danivichkin.kursovaya.domain.Message;
import danivichkin.kursovaya.domain.Views;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@JsonView(Views.FullMessage.class)
public class MessagePageDto {
    private List<Message> messages;
    private int currentPage;
    private int totalPages;
}