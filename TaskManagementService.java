public class TaskManagementService {
    private static final TaskManagementService instance = new TaskManagementService();

    private TaskManagementService() {
    }

    public static TaskManagementService getInstance() {
        return instance;
    }

    public void addTask(Task task) {
        System.out.println("Task added: " + task.getType());
    }
}