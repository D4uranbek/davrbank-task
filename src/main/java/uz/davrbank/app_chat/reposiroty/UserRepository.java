package uz.davrbank.app_chat.reposiroty;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.davrbank.app_chat.entity.user.User;


public interface UserRepository extends JpaRepository<User, Long>, AbstractRepository {

}
