package agurchu.codewithritmo.taskmanager;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UrgentTaskTest {
    @Test
    public void testGetTaskName() {
        UrgentTask task = new UrgentTask();
        assertEquals("Urgent Task", task.getTaskName());
    }

    @Test
    public void testSetTaskName() {
        UrgentTask task = new UrgentTask();
        task.setTaskName("Fix Bug");
        assertEquals("Fix Bug", task.getTaskName());
    }

    @Test
    public void testGetDueDate() {
        UrgentTask task = new UrgentTask();
        assertEquals("2025-01-01", task.getDueDate());
    }

    @Test
    public void testSetDueDate() {
        UrgentTask task = new UrgentTask();
        task.setDueDate("2025-02-01");
        assertEquals("2025-02-01", task.getDueDate());
    }

    @Test
    public void testGetEstimatedTime() {
        UrgentTask task = new UrgentTask();
        assertEquals(15, task.getEstimatedTime());
    }

    @Test
    public void testSetEstimatedTime() {
        UrgentTask task = new UrgentTask();
        task.setEstimatedTime(30);
        assertEquals(30, task.getEstimatedTime());
    }

    @Test
    public void testSetNegativeEstimatedTime() {
        UrgentTask task = new UrgentTask();
        task.setEstimatedTime(-10);
        assertEquals(0, task.getEstimatedTime());
    }

    @Test
    public void testGetPriority() {
        UrgentTask task = new UrgentTask();
        assertEquals("High", task.getPriority());
    }
}