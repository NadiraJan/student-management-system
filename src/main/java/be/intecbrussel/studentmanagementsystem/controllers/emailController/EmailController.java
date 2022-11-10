package be.intecbrussel.studentmanagementsystem.controllers.emailController;

import be.intecbrussel.studentmanagementsystem.entity.EmailMessage;
import be.intecbrussel.studentmanagementsystem.services.interfaces.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class EmailController {

    @Autowired
    private EmailService emailSenderService;

    @PostMapping("/send-mail")
    public String sendEmail(@RequestBody EmailMessage emailMessage) {

        emailSenderService.sendEmail(emailMessage);

        return "redirect:/email";
        //return ResponseEntity.ok("Success");
    }

}
