package be.intecbrussel.studentmanagementsystem.services.emailservice;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class EmailSenderServiceImpl implements EmailSenderService{

    private final JavaMailSender mailSender;

    public EmailSenderServiceImpl(JavaMailSender mailSender) {
        this.mailSender = mailSender;

    }

    @Override
    public void sendEmail(String to, String subject, String message, String emailMessageTo, String from,
                          LocalDateTime receivedAt, LocalDateTime sentAt) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("");
        simpleMailMessage.setTo(to);
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setText(message);

        this.mailSender.send(simpleMailMessage);

    }
}
