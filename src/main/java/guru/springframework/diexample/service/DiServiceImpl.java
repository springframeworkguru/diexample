package guru.springframework.diexample.service;


import guru.springframework.diexample.repositories.Repo;
import org.springframework.stereotype.Component;

/**
 * Created by jt, Spring Framework Guru.
 */
@Component
public class DiServiceImpl implements DiService {
    private Repo repo;

    public DiServiceImpl(Repo repo) {
        this.repo = repo;
    }

    public String getGreeting() {
        return repo.queryDatabase();
    }
}
