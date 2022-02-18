package uz.davrbank.app_chat.entity.chat;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import uz.davrbank.app_chat.entity.Auditable;
import uz.davrbank.app_chat.entity.user.User;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Chat entity
 *
 * @author D4uranbek
 */
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
@Entity
@Table(name = "chats")
public class Chat extends Auditable implements Comparable<Chat> {

    @Column(name = "name", unique = true)
    private String name;

    @ManyToMany(cascade = {
            CascadeType.MERGE
    }, fetch = FetchType.LAZY)
    @JsonIgnore
    @JoinTable(name = "chat_user",
            joinColumns = @JoinColumn(name = "chat_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    @ToString.Exclude
    private Set<User> users = new HashSet<>();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chat chat = (Chat) o;
        return Objects.equals(this.getId(), chat.getId()) &&
                Objects.equals(this.name, chat.name) &&
                Objects.equals(this.users, chat.users) &&
                Objects.equals(this.getCreatedAt(), chat.getCreatedAt());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getId(), name, users, this.getCreatedAt());
    }

    @Override
    public int compareTo(Chat o) {
        return this.getCreatedAt().compareTo(o.getCreatedAt());
    }
}
