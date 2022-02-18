package uz.davrbank.app_chat.dto.chat;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import uz.davrbank.app_chat.dto.GenericDto;
import uz.davrbank.app_chat.entity.user.User;

import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@ToString(callSuper = true)
public class ChatDto extends GenericDto {

    public LocalDateTime createdAt;
    private String name;
    private Set<User> users;

    @Builder(builderMethodName = "childBuilder")
    public ChatDto(Long id, String name, Set<User> users, LocalDateTime createdAt) {
        super(id);
        this.name = name;
        this.users = users;
        this.createdAt = createdAt;
    }
}

