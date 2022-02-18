package uz.davrbank.app_chat.dto.message;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import uz.davrbank.app_chat.dto.Dto;
import uz.davrbank.app_chat.entity.chat.Chat;
import uz.davrbank.app_chat.entity.user.User;

@Getter
@Setter
@Builder
@ToString
public class MessageCreateDto implements Dto {

    private Chat chat;
    private User author;
    private String text;

    public MessageCreateDto() {
    }

    public MessageCreateDto(Chat chat, User author, String text) {
        this.chat = chat;
        this.author = author;
        this.text = text;
    }
}
