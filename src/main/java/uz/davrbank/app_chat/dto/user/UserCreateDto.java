package uz.davrbank.app_chat.dto.user;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import uz.davrbank.app_chat.dto.Dto;

@Getter
@Setter
@Builder
@ToString
public class UserCreateDto implements Dto {

    private String username;

    public UserCreateDto() {
    }

    public UserCreateDto(String username) {
        this.username = username;
    }
}
