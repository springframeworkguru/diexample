package guru.springframework.services;

/**
 * Created by jt on 10/28/15.
 */
public class HelloWorldServiceFrenchImpl implements HelloWorldService{
    @Override
    public String getGreeting() {
        return "Bonjour le monde";
    }
}
