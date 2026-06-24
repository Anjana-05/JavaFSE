
public class Task {
    private int taskId;
    private String taskName;
    private Task next;

    public Task(int taskId, String taskName) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.next = null;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public Task getNext() {
        return next;
    }

    public void setNext(Task next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Task ID: " + taskId + ", Task Name: " + taskName;
    }
}
