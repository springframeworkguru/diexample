package guru.springframework.diexample.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by jt, Spring Framework Guru.
 */
@SpringBootTest
@ActiveProfiles("polish")
public class PolishDiControllerTest {

    @Autowired
    private DiController diController;

    @Test
    public void testGetGreetingReturnsPolish() {
        String greeting = diController.getGreeting();
        assertEquals("witaj świecie", greeting);

        System.out.println(greeting);
    }
}