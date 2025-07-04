package guru.springframework.diexample.repositories;


import guru.springframework.diexample.database.FakeDataStore;

/**
 * Created by jt, Spring Framework Guru.
 */
public class LegacyRepo {
    
    public String queryDatabase() {
        FakeDataStore store = new FakeDataStore();
        store.setUser("jt");
        store.setPassword("<PASSWORD>");
        store.setUrl("jdbc:mysql://localhost:3306/test");

        return store.queryDatabase();
    }
}
