package bean;

import java.io.Serializable;

public class UserAccount implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String login;
    private String password;

    public UserAccount() {
    }

    public UserAccount(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public UserAccount(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
