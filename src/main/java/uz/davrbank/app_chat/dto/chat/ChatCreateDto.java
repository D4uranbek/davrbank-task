package uz.davrbank.app_chat.dto.chat;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import uz.davrbank.app_chat.dto.Dto;
import uz.davrbank.app_chat.entity.user.User;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Builder
@ToString
public class ChatCreateDto implements Dto {

    private String name;
    private Set<User> users = new HashSet<>();

    public ChatCreateDto() {
    }

    public ChatCreateDto(String name, Set<User> users) {
        this.name = name;
        this.users = users;
    }
}
