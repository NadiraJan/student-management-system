package be.intecbrussel.studentmanagementsystem.services.emailservice;

import be.intecbrussel.studentmanagementsystem.entity.ClassTeacher;
import be.intecbrussel.studentmanagementsystem.entity.EmailMessage;
import be.intecbrussel.studentmanagementsystem.entity.Student;
import be.intecbrussel.studentmanagementsystem.repositories.EmailMessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class EmailSenderServiceImpl implements EmailSenderService {

    private final JavaMailSender mailSender;
    private final EmailMessageRepository emailMessageRepository;

    public void sendEmail(EmailMessage emailMessage){

       emailMessage.setSentAt(LocalDateTime.now());
       //this will keep backup in database
       emailMessageRepository.save(emailMessage);
       //This will send to a real email
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom(emailMessage.getFrom());
        simpleMailMessage.setTo(emailMessage.getTo());
        simpleMailMessage.setSubject(emailMessage.getSubject());
        simpleMailMessage.setText(emailMessage.getMessage());
        this.mailSender.send(simpleMailMessage);

    }

    public void sentEmail(EmailMessage simpleMailMessage, ClassTeacher classTeacher, Student student) {
        String lastNameStudent = new Student().getLastName();
        String lastNameClassTeacher = new ClassTeacher().getLastName();
        String subject = new EmailMessage().getSubject();
        String message = new EmailMessage().getMessage();
        simpleMailMessage.setFrom(classTeacher.getFirstName());
        simpleMailMessage.setTo(student.getEmail());
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setMessage(message);
        simpleMailMessage.setFrom(lastNameClassTeacher);
        simpleMailMessage.setTo(lastNameStudent);
        emailMessageRepository.save(simpleMailMessage);

    }

}
