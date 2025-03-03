package task;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class TaskServiceTest {
    private TaskService taskService;

    @BeforeEach
    void setUp() {
        taskService = new TaskService();
    }

    @Test
    void testAddTask() {
        Task task = new Task("1", "Test Task", "This is a test task.");
        taskService.addTask(task);
        Assertions.assertEquals(task, taskService.getTask(task.getId()));
    }
}
