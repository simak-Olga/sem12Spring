public class TaskFactory {
    public Task createTask(TaskType type) {
        if (type == TaskType.URGENT) {
            return new UrgentTask();
        } else if (type == TaskType.NORMAL) {
            return new NormalTask();
        }
        return null;
    }
}