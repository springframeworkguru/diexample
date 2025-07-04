package guru.springframework.diexample.service;


import guru.springframework.diexample.repositories.Repo;

/**
 * Created by jt, Spring Framework Guru.
 */
public class DiServiceImpl implements DiService {
    private Repo repo;

    public DiServiceImpl(Repo repo) {
        this.repo = repo;
    }

    public String getGreeting() {
        return repo.queryDatabase();
    }
}
