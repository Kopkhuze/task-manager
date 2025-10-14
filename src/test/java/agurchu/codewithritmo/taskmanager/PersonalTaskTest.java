package agurchu.codewithritmo.taskmanager;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonalTaskTest {
    @Test
    public void testGetTaskName() {
        PersonalTask task = new PersonalTask();
        assertEquals("Personal Task", task.getTaskName());
    }

    @Test
    public void testSetTaskName() {
        PersonalTask task = new PersonalTask();
        task.setTaskName("Grocery Shopping");
        assertEquals("Grocery Shopping", task.getTaskName());
    }

    @Test
    public void testGetDueDate() {
        PersonalTask task = new PersonalTask();
        assertEquals("2025-01-01", task.getDueDate());
    }

    @Test
    public void testSetDueDate() {
        PersonalTask task = new PersonalTask();
        task.setDueDate("2025-12-25");
        assertEquals("2025-12-25", task.getDueDate());
    }

    @Test
    public void testGetEstimatedTime() {
        PersonalTask task = new PersonalTask();
        assertEquals(30, task.getEstimatedTime());
    }

    @Test
    public void testSetEstimatedTime() {
        PersonalTask task = new PersonalTask();
        task.setEstimatedTime(60);
        assertEquals(60, task.getEstimatedTime());
    }

    @Test
    public void testSetNegativeEstimatedTime() {
        PersonalTask task = new PersonalTask();
        task.setEstimatedTime(-10);
        assertEquals(0, task.getEstimatedTime());
    }

    @Test
    public void testGetPriority() {
        PersonalTask task = new PersonalTask();
        assertEquals("Low", task.getPriority());
    }
}