package task;

import java.util.HashMap;
import java.util.Map;

public class TaskService {
    // Store the tasks in a map with task id as the key
    private final Map<String, Task> tasks = new HashMap<>();

    // Add a task to the map if it does not already exist
    public void addTask(Task task) {
        if (task == null) {
            throw new IllegalArgumentException("Task cannot be null");
        }

        if (tasks.containsKey(task.getId())) {
            throw new IllegalArgumentException("Task with id " + task.getId() + " already exists");
        }

        tasks.put(task.getId(), task);
    }

    // Delete a task from the map if it exists
    public void deleteTask(String id) {
        if (id == null) {
            throw new IllegalArgumentException("Id cannot be null");
        }

        if (!tasks.containsKey(id)) {
            throw new IllegalArgumentException("Task with id " + id + " does not exist");
        }

        tasks.remove(id);
    }

    // Update the name and description of a task if it exists
    public void updateTask(String id, String name, String description) {
        Task task = tasks.get(id);

        if (task == null) {
            throw new IllegalArgumentException("Task with id " + id + " does not exist");
        }

        task.setName(name);
        task.setDescription(description);
    }

    public Task getTask(String taskId) {
        if (!tasks.containsKey(taskId)) {
            throw new IllegalArgumentException("Task ID not found.");
        }
        return tasks.get(taskId);
    }
}