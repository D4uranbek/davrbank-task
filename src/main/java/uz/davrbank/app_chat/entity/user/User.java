package uz.davrbank.app_chat.entity.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import uz.davrbank.app_chat.entity.Auditable;
import uz.davrbank.app_chat.entity.chat.Chat;
import uz.davrbank.app_chat.entity.message.Message;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * User entity
 *
 * @author D4uranbek
 */
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
@Entity
@Table(name = "users")
public class User extends Auditable implements Comparable<User> {

    @Column(name = "username", unique = true)
    private String username;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "users", fetch = FetchType.EAGER)
    @JsonIgnore
    @ToString.Exclude
    private Set<Chat> chats = new HashSet<>();

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JsonIgnore
    @ToString.Exclude
    private Set<Message> messages = new HashSet<>();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(this.getId(), user.getId()) &&
                Objects.equals(username, user.username) &&
                Objects.equals(this.getCreatedAt(), user.getCreatedAt());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getId(), username, this.getCreatedAt());
    }

    @Override
    public int compareTo(User o) {
        return this.getCreatedAt().compareTo(o.getCreatedAt());
    }
}
