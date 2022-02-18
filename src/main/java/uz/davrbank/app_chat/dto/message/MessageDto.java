package uz.davrbank.app_chat.dto.message;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import uz.davrbank.app_chat.dto.GenericDto;
import uz.davrbank.app_chat.entity.chat.Chat;
import uz.davrbank.app_chat.entity.user.User;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString(callSuper = true)
public class MessageDto extends GenericDto {

    public LocalDateTime createdAt;
    private Chat chat;
    private User author;
    private String text;

    @Builder(builderMethodName = "childBuilder")
    public MessageDto(Long id, Chat chat, User author, String text, LocalDateTime createdAt) {
        super(id);
        this.chat = chat;
        this.author = author;
        this.text = text;
        this.createdAt = createdAt;
    }
}
