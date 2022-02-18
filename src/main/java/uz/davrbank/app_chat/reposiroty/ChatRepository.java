package uz.davrbank.app_chat.reposiroty;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.davrbank.app_chat.entity.chat.Chat;

public interface ChatRepository extends JpaRepository<Chat, Long>, AbstractRepository {

}