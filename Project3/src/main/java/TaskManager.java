import java.util.HashMap;
import java.util.Scanner;

public class TaskManager {


    private static  Integer taskID = 0;
    private static  Integer subTaskID = 0;

    HashMap<Integer, Task> tasks = new HashMap<>();

    public void addTask(Task task) {

        System.out.println("Enter a task name");

        Scanner scanner = new Scanner(System.in);

        task.setTaskName(scanner.nextLine());

        task.setTaskID(taskID);

        System.out.println("Enter a task description");


        task.setTaskDescription(scanner.nextLine());

        task.setTaskStatus(TaskStatus.NEW);

        //System.out.println(task.toString());

        tasks.put(taskID, task);

        taskID = taskID + 1;

        System.out.println("Would you like to add subtasks?");
        System.out.println("1. Yes");
        System.out.println("2. No");

        Integer choice = scanner.nextInt();

        switch (choice) {
            case 1:
                addSubTask(task);
                break;
            case 2:
                break;

        }

    }

    public void addSubTask(Task task) {

        SubTask subtask = new SubTask();

        subtask.setSubTaskID(subTaskID);

        subTaskID = subTaskID + 1;

        System.out.println("Enter a subtask name");

        Scanner scanner = new Scanner(System.in);

        subtask.setTaskName(scanner.nextLine());

        System.out.println("Enter a subtask description");

        subtask.setTaskDescription(scanner.nextLine());

        subtask.setTaskStatus(TaskStatus.NEW);

        tasks.get(task.getTaskID()).getSubTasks().put(subtask.getSubTaskID(), subtask);

    }

    public void printAllTasks() {
        tasks.forEach((k, v) -> System.out.println(tasks.get(k).toString()));
    }

    public Task getTaskById(Integer id) {
        return tasks.get(id);
    }

    public void updateTaskName() {

        Task task;

        System.out.println("Enter a task id");

        Scanner scanner = new Scanner(System.in);

        task = getTaskById(scanner.nextInt());

        scanner.nextLine();

        System.out.println("Enter a task new name");

        String taskNewName = scanner.nextLine();

        task.setTaskName(taskNewName);

        System.out.println("Enter a task new description");

        task.setTaskDescription(scanner.nextLine());

        tasks.put(task.getTaskID(), task);

    }

    public void updateTaskStatus() {

        Task task;

        Integer choice;

        System.out.println("Enter a task id");

        Scanner scanner = new Scanner(System.in);

        task = getTaskById(scanner.nextInt());

        System.out.println("Choose a new status:");
        System.out.println("1. In progress");
        System.out.println("2. Done");

        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                task.setTaskStatus(TaskStatus.IN_PROGRESS);
                break;
            case 2:
                task.setTaskStatus(TaskStatus.DONE);
                break;
        }

    }

    public void printAllInProgress() {
        tasks.forEach((k, v) -> {
                    if (v.getTaskStatus() == TaskStatus.IN_PROGRESS) {
                        System.out.println(v.toString());
                    }
                }
                );
    }

    public void printAllDone() {
        tasks.forEach((k, v) -> {
                    if (v.getTaskStatus() == TaskStatus.DONE) {
                        System.out.println(v.toString());
                    }
                }
        );
    }


}
