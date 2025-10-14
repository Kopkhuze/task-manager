package agurchu.codewithritmo.taskmanager;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WorkTaskTest {
    @Test
    public void testGetTaskName() {
        WorkTask task = new WorkTask();
        assertEquals("Work Task", task.getTaskName());
    }

    @Test
    public void testSetTaskName() {
        WorkTask task = new WorkTask();
        task.setTaskName("Project Meeting");
        assertEquals("Project Meeting", task.getTaskName());
    }

    @Test
    public void testGetDueDate() {
        WorkTask task = new WorkTask();
        assertEquals("2025-01-01", task.getDueDate());
    }

    @Test
    public void testSetDueDate() {
        WorkTask task = new WorkTask();
        task.setDueDate("2025-06-15");
        assertEquals("2025-06-15", task.getDueDate());
    }

    @Test
    public void testGetEstimatedTime() {
        WorkTask task = new WorkTask();
        assertEquals(60, task.getEstimatedTime());
    }

    @Test
    public void testSetEstimatedTime() {
        WorkTask task = new WorkTask();
        task.setEstimatedTime(120);
        assertEquals(120, task.getEstimatedTime());
    }

    @Test
    public void testSetNegativeEstimatedTime() {
        WorkTask task = new WorkTask();
        task.setEstimatedTime(-10);
        assertEquals(0, task.getEstimatedTime());
    }

    @Test
    public void testGetPriority() {
        WorkTask task = new WorkTask();
        assertEquals("Medium", task.getPriority());
    }
}
