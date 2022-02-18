package uz.davrbank.app_chat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.davrbank.app_chat.dto.user.UserCreateDto;
import uz.davrbank.app_chat.dto.user.UserDto;
import uz.davrbank.app_chat.entity.chat.Chat;
import uz.davrbank.app_chat.service.user.UserService;

import java.util.Set;

@RestController
@RequestMapping("/user/*")
public class UserController extends AbstractController<UserService> {

    @Autowired
    public UserController(UserService service) {
        super(service);
    }

    @RequestMapping(value = "add/", method = RequestMethod.POST)
    public @ResponseBody
    Long create(@RequestBody UserCreateDto dto) {
        return service.create(dto);
    }

    @PostMapping(value = "chats/")
    public @ResponseBody
    Set<Chat> getChats(@RequestBody UserDto dto) {
        return service.getChats(dto);
    }

}
