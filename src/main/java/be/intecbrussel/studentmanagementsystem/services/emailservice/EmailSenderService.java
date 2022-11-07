package be.intecbrussel.studentmanagementsystem.services.emailservice;

import be.intecbrussel.studentmanagementsystem.entity.EmailMessage;

import java.time.LocalDateTime;

public interface EmailSenderService {

    void sendEmail(EmailMessage emailMessage);
}
