import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static final String URL = "jdbc:postgresql://localhost:5432/task";
    private static final String USER = "user";
    private static final String PASSWORD = "password";

    public Connection getConnection() {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            if (conn != null) {
                System.out.println("Connection successful");
            }
            // Votre code ici pour interagir avec la base de données
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}