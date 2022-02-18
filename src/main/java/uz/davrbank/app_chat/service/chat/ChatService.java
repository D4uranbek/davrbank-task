package uz.davrbank.app_chat.service.chat;


import uz.davrbank.app_chat.dto.chat.ChatCreateDto;
import uz.davrbank.app_chat.dto.chat.ChatDto;
import uz.davrbank.app_chat.dto.chat.ChatUpdateDto;
import uz.davrbank.app_chat.service.GenericCrudService;

public interface ChatService extends GenericCrudService<
        ChatDto,
        ChatCreateDto,
        ChatUpdateDto,
        Long> {

}
