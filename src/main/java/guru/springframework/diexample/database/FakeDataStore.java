package guru.springframework.diexample.database;

/**
 * Created by jt, Spring Framework Guru.
 */
public class FakeDataStore {
    private String user;
    private String password;
    private String url;

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String queryDatabase() {
        return "Hello World!";
    }

}
