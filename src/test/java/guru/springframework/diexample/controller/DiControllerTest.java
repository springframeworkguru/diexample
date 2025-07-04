package guru.springframework.diexample.controller;


import guru.springframework.diexample.database.DIDataStore;
import guru.springframework.diexample.repositories.DiRepo;
import guru.springframework.diexample.service.DiService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiControllerTest {

    private DiController diController;
    private DiService diService;
    private DiRepo diRepo;
    private DIDataStore diDataStore;

    @BeforeEach
    void setUp() {
        diDataStore = new DIDataStore("testUser", "testPassword", "testUrl");
        diRepo = new DiRepo(diDataStore);
        diService = new DiService(diRepo);
        diController = new DiController(diService);
    }

    @Test
    void getGreeting() {
        // Given
        String expectedGreeting = "hello world";

        // When
        String actualGreeting = diController.getGreeting();

        // Then
        assertEquals(expectedGreeting, actualGreeting);

        System.out.println(actualGreeting);
    }
}