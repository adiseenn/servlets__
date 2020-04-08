package dao;

import bean.UserAccount;

import java.sql.*;
import java.util.ArrayList;

public class UserDao {
    private static String url = "jdbc:postgresql://localhost:5432/postgres";
    private static String username = "postgres";
    private static String password = "240699";

    public static ArrayList<UserAccount> select() {
        ArrayList<UserAccount> userAccounts = new ArrayList<>();
        try {
            Class.forName("org.postgresql.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)) {
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM usrs");
                while (resultSet.next()) {
                    int id = resultSet.getInt(1);
                    String login = resultSet.getString(2);
                    String password = resultSet.getString(3);
                    UserAccount userAccount = new UserAccount(id, login, password);
                    userAccounts.add(userAccount);
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return userAccounts;
    }

    public static int insert(UserAccount userAccount) {
        try {
            Class.forName("org.postgresql.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)) {
                String sql = "INSERT INTO users (login, password) Values (?, ?)";
                try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                    preparedStatement.setString(1, userAccount.getLogin());
                    preparedStatement.setString(2, userAccount.getPassword());
                    return preparedStatement.executeUpdate();
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return 0;
    }

    public static boolean findByName(ArrayList<UserAccount> userAccounts, String login, String password) {
        for (UserAccount userAccount : userAccounts) {
            if (userAccount.getLogin().equals(login) && (userAccount.getPassword().equals(password))) {
                return true;
            }
        }
        return false;
    }
}
