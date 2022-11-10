package be.intecbrussel.studentmanagementsystem.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Map;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class EmailMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String recipient;
    private String subject;
    private String message;
    private String attachment;
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
                "recipient='" + recipient + '\'' +
                ", subject='" + subject + '\'' +
                ", message='" + message + '\'' +
                ", attachment='" + attachment + '\'' +
                ", receivedAt=" + receivedAt +
                ", sentAt=" + sentAt +
                '}';
    }
}
