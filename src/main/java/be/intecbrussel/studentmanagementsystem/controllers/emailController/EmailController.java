package be.intecbrussel.studentmanagementsystem.controllers.emailController;

import be.intecbrussel.studentmanagementsystem.entity.EmailMessage;
import be.intecbrussel.studentmanagementsystem.services.emailservice.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class EmailController {

    @Autowired
    private EmailSenderService emailSenderService;

    @PostMapping("/send-mail")
    public ResponseEntity sendEmail(@RequestBody EmailMessage emailMessage) {
        this.emailSenderService.sendEmail(emailMessage.getSubject(),
                emailMessage.getMessage(), emailMessage.getSubject(),
                emailMessage.getTo(), emailMessage.getFrom(), emailMessage.getReceivedAt(),
                emailMessage.getSentAt());

        return ResponseEntity.ok("Success");
    }

}
