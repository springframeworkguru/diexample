package guru.springframework.diexample.repositories;


import guru.springframework.diexample.database.DataStore;
import org.springframework.stereotype.Component;

/**
 * Created by jt, Spring Framework Guru.
 */
@Component
public class DiRepoImpl implements Repo {

    private DataStore store;

    public DiRepoImpl(DataStore store) {
        this.store = store;
    }

    public String queryDatabase() {
        return store.queryDatabase();
    }
}
