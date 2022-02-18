package uz.davrbank.app_chat.service.chat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.davrbank.app_chat.dto.chat.ChatCreateDto;
import uz.davrbank.app_chat.dto.chat.ChatDto;
import uz.davrbank.app_chat.dto.chat.ChatUpdateDto;
import uz.davrbank.app_chat.entity.chat.Chat;
import uz.davrbank.app_chat.mapper.ChatMapper;
import uz.davrbank.app_chat.reposiroty.ChatRepository;
import uz.davrbank.app_chat.service.AbstractService;

import java.util.List;

@Service
public class ChatServiceImpl extends AbstractService<ChatRepository, ChatMapper>
        implements ChatService {

    @Autowired
    protected ChatServiceImpl(ChatRepository repository, ChatMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public Long create(ChatCreateDto createDto) {
        Chat chat = mapper.fromCreateDto(createDto);
        return repository.save(chat).getId();
    }

    @Override
    public Boolean update(ChatUpdateDto updateDto) {
        return null;
    }

    @Override
    public Void delete(Long id) {
        return null;
    }

    @Override
    public List<ChatDto> getAll() {
        return null;
    }

    @Override
    public ChatDto get(Long id) {
        return null;
    }
}
