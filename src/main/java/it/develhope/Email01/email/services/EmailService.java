package it.develhope.Email01.email.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * @author Drumstyle92
 * Class used as part of a system to send automated emails
 */
@Service
public class EmailService {

    /**
     * Interface dependency interface provided by Spring framework which provides
     * methods to send email in Java via Simple Mail Transfer Protocol (SMTP).
     * This interface abstracts the complexity of sending email in Java by simplifying
     * the email sending process through the use of a well-designed API
     */
    @Autowired
    private JavaMailSender javaMailSender;

    /**
     * @param email Parameter that gets the email for the SimpleMailMessage object
     * @param title Parameter that gets the title for the SimpleMailMessage object
     * @param text  Parameter that takes the text for the SimpleMailMessage subject
     * Method that takes some parameters the email address. Inside the method, a
     * SimpleMailMessage object is created, which is used to set the email details.
     * Finally, the JavaMailSender instance is used to send the email
     */
    public void sendTo(String email, String title, String text) {

        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(email);
        message.setSubject(title);
        message.setFrom("xxxxxx@xxxxxx");
        message.setText(text);
        javaMailSender.send(message);

    }

}
