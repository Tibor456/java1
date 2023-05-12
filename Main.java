import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskList tasks = new TaskList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add task");
            System.out.println("2. Complete task");
            System.out.println("3. Delete task");
            System.out.println("4. View tasks");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    System.out.print("Enter task name: ");
                    String name = scanner.nextLine();
                    tasks.addTask(name);
                    break;
                case "2":
                    System.out.print("Enter task number to complete: ");
                    int taskToComplete = scanner.nextInt();
                    tasks.completeTask(taskToComplete - 1);
                    scanner.nextLine(); 
                    break;
                case "3":
                    System.out.print("Enter task number to delete: ");
                    int taskToDelete = scanner.nextInt();
                    tasks.deleteTask(taskToDelete - 1);
                    scanner.nextLine(); 
                    break;
                case "4":
                    tasks.viewTasks();
                    break;
                case "5":
                    return; 
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }
    }
}