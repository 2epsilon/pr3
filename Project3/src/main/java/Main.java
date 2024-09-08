import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        TaskManager taskManager = new TaskManager();

        taskManager.addTask(new Task());
        taskManager.addTask(new Task());
        taskManager.printAllTasks();

        Integer choice;

        boolean i = true;

        while (i) {
            System.out.println("Menu:");
            System.out.println("1. add new task");
            System.out.println("2. update task");
            System.out.println("3. change task status");
            System.out.println("4. print all tasks");
            System.out.println("5. print all in progress");
            System.out.println("6. print all done");
            System.out.println("9. exit");

            Scanner scanner = new Scanner(System.in);

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    taskManager.addTask(new Task());
                    break;

                case 2:
                    taskManager.updateTaskName();
                    break;

                case 3:
                    taskManager.updateTaskStatus();
                    break;

                case 4:
                    taskManager.printAllTasks();
                    break;

                case 5:
                    taskManager.printAllInProgress();
                    break;

                case 6:
                    taskManager.printAllDone();
                    break;

                case 9:
                    i = false;


            }

        }
    }
}
