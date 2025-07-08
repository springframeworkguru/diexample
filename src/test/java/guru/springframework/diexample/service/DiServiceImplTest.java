package guru.springframework.diexample.service;

import guru.springframework.diexample.repositories.Repo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

/**
 * Created by jt, Spring Framework Guru.
 */
@ExtendWith(MockitoExtension.class)
class DiServiceImplTest {

    @Mock
    private Repo repo;

    @Spy
    private EmailService emailService;

    @Spy
    private SmsService smsService;

    private DiServiceImpl diService;

    @BeforeEach
    void setUp() {
        diService = new DiServiceImpl(repo, emailService, smsService);
    }

    @Test
    void testGetGreeting() {
        // Given
        String expectedGreeting = "Hello World";
        when(repo.queryDatabase()).thenReturn(expectedGreeting);

        // When
        String actualGreeting = diService.getGreeting();

        // Then
        assertEquals(expectedGreeting, actualGreeting);
        verify(repo, times(1)).queryDatabase();
        verify(emailService, times(1)).sendMessage(expectedGreeting);
        verify(smsService, times(1)).sendMessage(expectedGreeting);
    }
}