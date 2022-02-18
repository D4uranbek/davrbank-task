package uz.davrbank.app_chat.dto.user;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import uz.davrbank.app_chat.dto.GenericDto;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString(callSuper = true)
public class UserDto extends GenericDto {

    public LocalDateTime createdAt;
    private String username;

    @Builder(builderMethodName = "childBuilder")
    public UserDto(Long id, String username, LocalDateTime createdAt) {
        super(id);
        this.username = username;
        this.createdAt = createdAt;
    }
}

