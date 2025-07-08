package guru.springframework.diexample.service;

import org.springframework.stereotype.Component;

/**
 * Created by jt, Spring Framework Guru.
 */
@Component("smsService")
public class SmsService implements MessageService {
    
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}