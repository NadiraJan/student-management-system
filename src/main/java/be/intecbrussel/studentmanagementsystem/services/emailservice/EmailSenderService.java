package be.intecbrussel.studentmanagementsystem.services.emailservice;

import java.time.LocalDateTime;

public interface EmailSenderService {
    void sendEmail(String to, String subject, String text, String emailMessageTo, String from, LocalDateTime receivedAt, LocalDateTime sentAt);
}
