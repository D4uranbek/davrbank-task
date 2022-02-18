package uz.davrbank.app_chat.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import uz.davrbank.app_chat.dto.message.MessageCreateDto;
import uz.davrbank.app_chat.dto.message.MessageDto;
import uz.davrbank.app_chat.dto.message.MessageUpdateDto;
import uz.davrbank.app_chat.entity.message.Message;

@Component
@Mapper(componentModel = "spring")
public interface MessageMapper extends BaseMapper<
        Message,
        MessageDto,
        MessageCreateDto,
        MessageUpdateDto> {

    @Override
    Message fromCreateDto(MessageCreateDto dto);

}