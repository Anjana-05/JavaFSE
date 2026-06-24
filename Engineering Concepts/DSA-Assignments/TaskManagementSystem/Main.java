public class Main {
    public static void main(String[] args) {
        TaskLinkedList taskLinkedList = new TaskLinkedList();

        taskLinkedList.addTask(1, "Design database");
        taskLinkedList.addTask(2, "Implement login");
        taskLinkedList.addTask(3, "Test application");

        System.out.println("Tasks in the list:");
        taskLinkedList.traverseTasks();

        System.out.println();
        System.out.println("Deleting task with ID 2");
        boolean isDeleted = taskLinkedList.deleteTask(2);
        System.out.println(isDeleted ? "Task deleted successfully" : "Task not found");

        System.out.println();
        System.out.println("Tasks after deletion:");
        taskLinkedList.traverseTasks();
    }
}
