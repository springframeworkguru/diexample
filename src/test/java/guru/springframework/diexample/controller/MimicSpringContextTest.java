package guru.springframework.diexample.controller;

import guru.springframework.diexample.database.DIDataStore;
import guru.springframework.diexample.database.DataStore;
import guru.springframework.diexample.repositories.DiRepoImpl;
import guru.springframework.diexample.repositories.Repo;
import guru.springframework.diexample.service.DiService;
import guru.springframework.diexample.service.DiServiceImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jt, Spring Framework Guru.
 */
public class MimicSpringContextTest {

    public static Map<String, Object> context = new HashMap<>();
    
    public static void addBean(String beanName, Object bean) {
        context.put(beanName, bean);
    }
    
    public static Object getBean(String beanName) {
        return context.get(beanName);
    }

    @BeforeAll
    static void beforeAll() {
      
        addBean("dataStore", new DIDataStore("jt", "1234", "jdbc:mysql://localhost:3306/test"));
        addBean("repo", new DiRepoImpl(
                (DataStore) getBean("dataStore")
        ));
        addBean("diService", new DiServiceImpl((Repo) getBean("repo")));
        addBean("diController", new DiController((DiService) getBean("diService")));
    }

    @Test
    void getControllerFromContext() {
        DiController controller = (DiController) getBean("diController");
        System.out.println(controller.getGreeting());
    }


}








