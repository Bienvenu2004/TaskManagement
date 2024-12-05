import java.sql.*;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) throws SQLException {
        TaskManager taskManager = new TaskManager();

        //menu
        System.out.println("------ Systeme de Gestion de taches --------");
        System.out.println("1: creer une tache");
        System.out.println("2: Supprimer une tache");
        System.out.println("3: Mettre ajour une tache");
        System.out.println("4: Visualiser une tache");
        System.out.println("5: Visualiser toutes les taches");

        Scanner scanner = new Scanner(System.in);

      System.out.print("Entrer option : ");
      int option = scanner.nextInt();
      scanner.nextLine();

      int id = 0;
      String description = "";
      String titre = "";
      int priorite = 0;

      switch (option) {
          case 1:
              System.out.println("--------- Ajouter une tache --------");

              System.out.print("Titre : ");
              titre = scanner.nextLine();

              System.out.print("description : ");
              description = scanner.nextLine();

              System.out.print("Priorite : ");
              priorite = scanner.nextInt();
              System.out.println(priorite);

              Task task = new Task();
              task.setTitre(titre);
              task.setDescription(description);
              task.setPriorite((int) priorite);
              taskManager.addTask(task);
              break;

          case 2:
              System.out.println("--------- Supprimer une tache ---------");
              System.out.print("id : ");
              id = scanner.nextInt();

              taskManager.deleteTask(id);
              break;

          case 3:
              System.out.println("--------- Mettre ajour une tache ---------");
              System.out.println("id : ");
              id = scanner.nextInt();

              System.out.print("title : ");
              titre = scanner.nextLine();

              System.out.print("description : ");
              description = scanner.nextLine();

              System.out.print("priorite : ");
              priorite = scanner.nextInt();

              taskManager.updateTask(id, titre, description, priorite);
              break;

          case 4:
              System.out.println("--------- Visualiser une tache ---------");
              System.out.print("id : ");
              id = scanner.nextInt();

              taskManager.showTasks(id);
              break;

          case 5:
              System.out.println("--------- Visualiser toutes les taches ---------");
              taskManager.showAllTasks();
              break;

          default:
              System.out.println("Choisir une option valide");
              break;
      }


    }
}