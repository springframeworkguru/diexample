package guru.springframework.services;


/**
 * Created by jt on 10/26/15.
 */
public class HelloWorldServiceEnglishImpl implements HelloWorldService{
    @Override
    public String getGreeting() {
        return "Hello World!!!";
    }
}
