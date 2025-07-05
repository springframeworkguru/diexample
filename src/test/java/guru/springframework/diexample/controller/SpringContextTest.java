package guru.springframework.diexample.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Created by jt, Spring Framework Guru.
 */
@SpringBootTest
public class SpringContextTest {

    @Autowired
    DiController controller;

    @Test
    void testSpringController() {
        System.out.println(controller.getGreeting());
    }
}
