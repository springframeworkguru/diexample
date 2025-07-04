package guru.springframework.diexample.service;

import guru.springframework.diexample.repositories.LegacyRepo;

/**
 * Created by jt, Spring Framework Guru.
 */
public class LegacyGreetingService {
    public String getGreeting() {
        LegacyRepo legacyRepo = new LegacyRepo();

        return legacyRepo.queryDatabase();
    }
}
