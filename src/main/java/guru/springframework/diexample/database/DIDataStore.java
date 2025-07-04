package guru.springframework.diexample.database;

/**
 * Created by jt, Spring Framework Guru.
 */
public class DIDataStore implements DataStore {
    private String user;
    private String password;
    private String url;

    public DIDataStore(String user, String password, String url) {
        this.user = user;
        this.password = password;
        this.url = url;
    }

    public String queryDatabase() {
        return "hello world";
    }
}