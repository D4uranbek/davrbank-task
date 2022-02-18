package uz.davrbank.app_chat.dto.message;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import uz.davrbank.app_chat.dto.GenericDto;
import uz.davrbank.app_chat.entity.chat.Chat;
import uz.davrbank.app_chat.entity.user.User;

@Getter
@Setter
@ToString(callSuper = true)
public class MessageUpdateDto extends GenericDto {

    private Chat chat;
    private User author;
    private String text;


    public MessageUpdateDto() {
    }

    public MessageUpdateDto(Long id, Chat chat, User author, String text) {
        super(id);
        this.chat = chat;
        this.author = author;
        this.text = text;
    }
}
