package uz.davrbank.app_chat.reposiroty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import uz.davrbank.app_chat.entity.message.Message;

import java.util.Set;

public interface MessageRepository extends JpaRepository<Message, Long>, AbstractRepository {

    @Query(value = "select * from messages where chat_id = :id", nativeQuery = true)
    Set<Message> getMessages(@Param("id") Long chatId);
}
