package be.intecbrussel.studentmanagementsystem.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class EmailMessage{
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private String subject;
    private String message;
    private String to;
    private String from;
    private LocalDateTime receivedAt;
    private LocalDateTime sentAt;

    @PrePersist
    protected void oneSent() {
        this.sentAt = LocalDateTime.now();
        this.receivedAt = LocalDateTime.now();
    }


    @Override
    public String toString() {
        return "EmailMessage{" +
                "subject='" + subject + '\'' +
                ", message='" + message + '\'' +
                ", to='" + to + '\'' +
                ", from='" + from + '\'' +
                ", receivedAt=" + receivedAt +
                ", sentAt=" + sentAt +
                '}';
    }
}
