package guru.springframework.diexample.controller;


import guru.springframework.diexample.database.DIDataStore;
import guru.springframework.diexample.database.DataStore;
import guru.springframework.diexample.repositories.DiRepoImpl;
import guru.springframework.diexample.repositories.Repo;
import guru.springframework.diexample.service.DiService;
import guru.springframework.diexample.service.DiServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiControllerTest {

    private DiController diController;
    private DiService diService;
    private Repo diRepo;
    private DataStore diDataStore;

    @BeforeEach
    void setUp() {
        diDataStore = new DIDataStore("testUser", "testPassword", "testUrl");
        diRepo = new DiRepoImpl(diDataStore);
        diService = new DiServiceImpl(diRepo);
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