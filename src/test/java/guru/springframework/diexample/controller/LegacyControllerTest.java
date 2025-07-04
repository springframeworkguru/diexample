package guru.springframework.diexample.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class LegacyControllerTest {

    @Test
    void getGreeting() {
        LegacyController legacyController = new LegacyController();

        assertEquals("Hello World!", legacyController.getGreeting());

        System.out.println(legacyController.getGreeting());

    }
}