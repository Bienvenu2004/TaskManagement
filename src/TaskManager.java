import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TaskManager {
    DbConnection dbConnection = new DbConnection();
    Connection conn = dbConnection.getConnection();

   // private List<Task> tasks = new ArrayList<Task>();

    public void addTask(Task task) throws SQLException {

        String sql = "INSERT INTO taches(id,titre,description,priorite) VALUES(?,?,?,?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, task.getId());
        stmt.setString(2, task.getTitre());
        stmt.setString(3, task.getDescription());
        stmt.setInt(4, task.getPriorite());
        ResultSet rs = stmt.executeQuery();


        System.out.println("task added");
    }

    public void showTasks(int id) throws SQLException {
        String sql = "SELECT * FROM taches where id = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.executeQuery();
    }

    public void deleteTask(int id) throws SQLException {
        String sql = "DELETE FROM taches WHERE id = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.executeQuery();

    }

    public void showAllTasks() throws SQLException {
        String sql = "SELECT * FROM taches";
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            System.out.println("task titre: " + rs.getString("titre") + " description: " + rs.getString("description"));
        }
    }



}
