package uz.davrbank.app_chat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.davrbank.app_chat.dto.chat.ChatCreateDto;
import uz.davrbank.app_chat.service.chat.ChatService;

@RestController
@RequestMapping("/chat/*")
public class ChatController extends AbstractController<ChatService> {

    @Autowired
    public ChatController(ChatService service) {
        super(service);
    }

    @RequestMapping(value = "add/", method = RequestMethod.POST)
    public @ResponseBody
    Long create(@RequestBody ChatCreateDto dto) {
        return service.create(dto);
    }


}
