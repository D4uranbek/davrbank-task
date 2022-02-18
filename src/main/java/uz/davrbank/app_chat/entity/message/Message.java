package uz.davrbank.app_chat.entity.message;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import uz.davrbank.app_chat.entity.Auditable;
import uz.davrbank.app_chat.entity.chat.Chat;
import uz.davrbank.app_chat.entity.user.User;

import javax.persistence.*;
import java.util.Objects;

/**
 * Message entity
 *
 * @author D4uranbek
 */
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
@Entity
@Table(name = "messages")
public class Message extends Auditable implements Comparable<Message> {

    @OneToOne
    @JoinColumn(name = "chat_id", referencedColumnName = "id")
    @ToString.Exclude
    private Chat chat;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @JsonIgnore
    @ToString.Exclude
    private User author;

    @Column(name = "text")
    private String text;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return Objects.equals(this.getId(), chat.getId()) &&
                Objects.equals(chat, message.chat) &&
                Objects.equals(author, message.author) &&
                Objects.equals(text, message.text) &&
                Objects.equals(this.getCreatedAt(), chat.getCreatedAt());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), chat, author, text, getCreatedAt());
    }

    @Override
    public int compareTo(Message o) {
        return this.getCreatedAt().compareTo(o.getCreatedAt());
    }

}
