package uz.davrbank.app_chat.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import uz.davrbank.app_chat.dto.chat.ChatCreateDto;
import uz.davrbank.app_chat.dto.chat.ChatDto;
import uz.davrbank.app_chat.dto.chat.ChatUpdateDto;
import uz.davrbank.app_chat.entity.chat.Chat;

@Component
@Mapper(componentModel = "spring")
public interface ChatMapper extends BaseMapper<
        Chat,
        ChatDto,
        ChatCreateDto,
        ChatUpdateDto> {

    @Override
    Chat fromCreateDto(ChatCreateDto dto);

}
