import java.sql.*;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) throws SQLException {
       /*DbConnection db = new DbConnection();
       Connection conn = db.getConnection();

       String query = "select * from taches";
       PreparedStatement ps = conn.prepareStatement(query);
       ResultSet rs = ps.executeQuery();
       while (rs.next()) {
           System.out.println("Tâche: " + rs.getString("titre"));
       }*/

       //creer tache

       TaskManager taskmanager = new TaskManager();
       Task task = new Task();
       task.setTitre("Sleep");
       task.setId(10);
       task.setDescription("For a better health");
       task.setPriorite(1);

       taskmanager.showAllTasks();

    }
}