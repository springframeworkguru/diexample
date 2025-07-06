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
@ActiveProfiles("spanish")
public class SpanishDiControllerTest {

    @Autowired
    private DiController diController;

    @Test
    public void testGetGreetingReturnsSpanish() {
        String greeting = diController.getGreeting();
        assertEquals("hola mundo", greeting);

        System.out.println(greeting);
    }
}