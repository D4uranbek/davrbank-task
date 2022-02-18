package uz.davrbank.app_chat.dto.user;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import uz.davrbank.app_chat.dto.GenericDto;

@Getter
@Setter
@ToString(callSuper = true)
public class UserUpdateDto extends GenericDto {

    private String username;

    public UserUpdateDto() {
    }

    public UserUpdateDto(Long id, String username) {
        super(id);
        this.username = username;
    }
}
