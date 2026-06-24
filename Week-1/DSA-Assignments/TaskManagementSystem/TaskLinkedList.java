
public class TaskLinkedList {
    private Task head;

    public void addTask(int taskId, String taskName) {
        Task newTask = new Task(taskId, taskName);

        if (head == null) {
            head = newTask;
            return;
        }

        Task current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(newTask);
    }

    public boolean deleteTask(int taskId) {
        if (head == null) {
            return false;
        }

        if (head.getTaskId() == taskId) {
            head = head.getNext();
            return true;
        }

        Task current = head;
        while (current.getNext() != null) {
            if (current.getNext().getTaskId() == taskId) {
                current.setNext(current.getNext().getNext());
                return true;
            }
            current = current.getNext();
        }

        return false;
    }

    public void traverseTasks() {
        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        Task current = head;
        while (current != null) {
            System.out.println(current);
            current = current.getNext();
        }
    }
}
