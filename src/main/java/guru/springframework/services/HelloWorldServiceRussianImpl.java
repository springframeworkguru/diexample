package guru.springframework.services;

/**
 * Created by jt on 10/28/15.
 */
public class HelloWorldServiceRussianImpl implements HelloWorldService {
    @Override
    public String getGreeting() {
        return "Привет мир";
    }
}
