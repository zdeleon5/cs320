package task;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaskTest {
    @Test
    public void testValidTaskCreation() {
        Task task = new Task("12345", "Valid Name", "Valid description");
        assertEquals("12345", task.getId());
        assertEquals("Valid Name", task.getName());
        assertEquals("Valid description", task.getDescription());
    }

    @Test public void testInvalidTaskId() {

    }
}
