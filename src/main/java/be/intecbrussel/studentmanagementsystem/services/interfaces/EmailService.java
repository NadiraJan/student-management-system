package be.intecbrussel.studentmanagementsystem.services.interfaces;

import be.intecbrussel.studentmanagementsystem.entity.EmailMessage;

public interface EmailService {

    String sendEmail(EmailMessage emailMessage);
}
