import java.util.ArrayList;

public class TaskList {
    private ArrayList<Task> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String name) {
        tasks.add(new Task(name));
    }

    public void completeTask(int index) {
        if (index < 0 || index >= tasks.size()) {
            System.out.println("Invalid task number.");
        } else {
            tasks.get(index).setCompleted(true);
        }
    }

    public void deleteTask(int index) {
        if (index < 0 || index >= tasks.size()) {
            System.out.println("Invalid task number.");
        } else {
            tasks.remove(index);
        }
    }

    public void viewTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            String status = task.isCompleted() ? "completed" : "not completed";
            System.out.println((i + 1) + ": " + task.getName() + " (" + status + ")");
        }
    }
}
