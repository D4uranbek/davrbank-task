package uz.davrbank.app_chat.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import uz.davrbank.app_chat.dto.user.UserCreateDto;
import uz.davrbank.app_chat.dto.user.UserDto;
import uz.davrbank.app_chat.dto.user.UserUpdateDto;
import uz.davrbank.app_chat.entity.user.User;

@Component
@Mapper(componentModel = "spring")
public interface UserMapper extends BaseMapper<
        User,
        UserDto,
        UserCreateDto,
        UserUpdateDto> {

    @Override
    User fromCreateDto(UserCreateDto userCreateDto);

}
