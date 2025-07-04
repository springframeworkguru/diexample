package guru.springframework.diexample.repositories;


import guru.springframework.diexample.database.DIDataStore;

/**
 * Created by jt, Spring Framework Guru.
 */
public class DiRepo {

    private DIDataStore store;

    public DiRepo(DIDataStore store) {
        this.store = store;
    }

    public String queryDatabase() {
        return store.queryDatabase();
    }
}
