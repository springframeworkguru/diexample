package guru.springframework.services;

/**
 * Created by jt on 10/28/15.
 */
public class HelloWorldServicePolish implements HelloWorldService {
    @Override
    public String getGreeting() {
        return "Witaj świecie";
    }
}
