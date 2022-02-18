package uz.davrbank.app_chat.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.davrbank.app_chat.dto.user.UserCreateDto;
import uz.davrbank.app_chat.dto.user.UserDto;
import uz.davrbank.app_chat.dto.user.UserUpdateDto;
import uz.davrbank.app_chat.entity.chat.Chat;
import uz.davrbank.app_chat.entity.user.User;
import uz.davrbank.app_chat.mapper.UserMapper;
import uz.davrbank.app_chat.reposiroty.UserRepository;
import uz.davrbank.app_chat.service.AbstractService;

import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl extends AbstractService<UserRepository, UserMapper>
        implements UserService {

    @Autowired
    protected UserServiceImpl(UserRepository repository, UserMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public Long create(UserCreateDto createDto) {
        User user = mapper.fromCreateDto(createDto);
        return repository.save(user).getId();
    }


    public Set<Chat> getChats(UserDto userDto) {
        Set<Chat> chats = repository.findById(userDto.getId()).get().getChats();
        return chats;
    }


    @Override
    public Boolean update(UserUpdateDto updateDto) {
        return null;
    }

    @Override
    public Void delete(Long id) {
        return null;
    }

    @Override
    public List<UserDto> getAll() {
        return null;
    }

    @Override
    public UserDto get(Long id) {
        return null;
    }
}
