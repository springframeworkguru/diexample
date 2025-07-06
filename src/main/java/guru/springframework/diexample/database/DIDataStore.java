package guru.springframework.diexample.database;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by jt, Spring Framework Guru.
 */
@Component
@Profile("!spanish")
public class DIDataStore implements DataStore {
    private String user;
    private String password;
    private String url;

    public DIDataStore(@Value("${guru.sfg.user}") String user,
                       @Value("${guru.sfg.password}") String password,
                       @Value("${guru.sfg.url}")String url) {
        this.user = user;
        this.password = password;
        this.url = url;
    }

    public String queryDatabase() {
        return "hello world";
    }
}