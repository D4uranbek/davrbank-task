package uz.davrbank.app_chat.dto.chat;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import uz.davrbank.app_chat.dto.GenericDto;
import uz.davrbank.app_chat.entity.user.User;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString(callSuper = true)
public class ChatUpdateDto extends GenericDto {

    private String name;
    private Set<User> users = new HashSet<>();


    public ChatUpdateDto() {
    }

    public ChatUpdateDto(Long id, String name, Set<User> users) {
        super(id);
        this.name = name;
        this.users = users;
    }
}
