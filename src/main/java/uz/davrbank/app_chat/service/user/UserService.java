package uz.davrbank.app_chat.service.user;

import uz.davrbank.app_chat.dto.user.UserCreateDto;
import uz.davrbank.app_chat.dto.user.UserDto;
import uz.davrbank.app_chat.dto.user.UserUpdateDto;
import uz.davrbank.app_chat.entity.chat.Chat;
import uz.davrbank.app_chat.service.GenericCrudService;

import java.util.Set;

public interface UserService extends GenericCrudService<
        UserDto,
        UserCreateDto,
        UserUpdateDto,
        Long> {

    Set<Chat> getChats(UserDto userDto);
}
