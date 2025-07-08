package guru.springframework.diexample.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created by jt, Spring Framework Guru.
 */
@Component("emailService")
@Primary
public class EmailService implements MessageService {
    
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email: " + message);
    }
}