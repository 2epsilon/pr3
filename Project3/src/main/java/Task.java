import java.util.HashMap;

public class Task {

    private String taskName;
    private String taskDescription;
    private Integer taskID;
    private TaskStatus taskStatus;

    private HashMap<Integer, SubTask> subTasks;

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public Integer getTaskID() {
        return taskID;
    }

    public void setTaskID(Integer taskID) {
        this.taskID = taskID;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }

    public HashMap<Integer, SubTask> getSubTask() {
        return subTasks;
    }

    public HashMap<Integer, SubTask> getSubTasks() {
        return subTasks;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskName='" + taskName + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", taskID=" + taskID +
                ", taskStatus=" + taskStatus +
                '}';
    }
}
