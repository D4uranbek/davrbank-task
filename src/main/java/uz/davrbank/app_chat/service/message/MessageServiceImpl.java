package uz.davrbank.app_chat.service.message;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.davrbank.app_chat.dto.message.MessageCreateDto;
import uz.davrbank.app_chat.dto.message.MessageDto;
import uz.davrbank.app_chat.dto.message.MessageUpdateDto;
import uz.davrbank.app_chat.entity.message.Message;
import uz.davrbank.app_chat.mapper.MessageMapper;
import uz.davrbank.app_chat.reposiroty.MessageRepository;
import uz.davrbank.app_chat.service.AbstractService;

import java.util.List;
import java.util.Set;

@Service
public class MessageServiceImpl extends AbstractService<MessageRepository, MessageMapper>
        implements MessageService {

    @Autowired
    protected MessageServiceImpl(MessageRepository repository, MessageMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public Long create(MessageCreateDto createDto) {
        Message message = mapper.fromCreateDto(createDto);
        return repository.save(message).getId();
    }

    @Override
    public Set<Message> getMessages(Long chatId) {
        return repository.getMessages(chatId);
    }

    @Override
    public Boolean update(MessageUpdateDto updateDto) {
        return null;
    }

    @Override
    public Void delete(Long id) {
        return null;
    }

    @Override
    public List<MessageDto> getAll() {
        return null;
    }

    @Override
    public MessageDto get(Long id) {
        return null;
    }
}
