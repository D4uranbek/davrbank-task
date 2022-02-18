package uz.davrbank.app_chat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.davrbank.app_chat.dto.chat.ChatDto;
import uz.davrbank.app_chat.dto.message.MessageCreateDto;
import uz.davrbank.app_chat.entity.message.Message;
import uz.davrbank.app_chat.service.message.MessageService;

import java.util.Set;

@RestController
@RequestMapping("/message/*")
public class MessageController extends AbstractController<MessageService> {

    @Autowired
    public MessageController(MessageService service) {
        super(service);
    }

    @RequestMapping(value = "add/", method = RequestMethod.POST)
    public @ResponseBody
    Long create(@RequestBody MessageCreateDto dto) {
        return service.create(dto);
    }

    @PostMapping(value = "chat-messages/")
    public @ResponseBody
    Set<Message> getChats(@RequestBody ChatDto dto) {
        return service.getMessages(dto.getId());
    }
}