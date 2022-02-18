package uz.davrbank.app_chat.service.message;


import uz.davrbank.app_chat.dto.message.MessageCreateDto;
import uz.davrbank.app_chat.dto.message.MessageDto;
import uz.davrbank.app_chat.dto.message.MessageUpdateDto;
import uz.davrbank.app_chat.entity.message.Message;
import uz.davrbank.app_chat.service.GenericCrudService;

import java.util.Set;

public interface MessageService extends GenericCrudService<
        MessageDto,
        MessageCreateDto,
        MessageUpdateDto,
        Long> {

    Set<Message> getMessages(Long chatId);
}
