package agurchu.codewithritmo.taskmanager;


public class UrgentTask extends Task {

    private final String priority = "High";
   // TODO
   private String taskName;
    private String dueDate;
    private int estimatedTime;

    public UrgentTask() {
        // TODO: Initialize default values
        taskName = "Urgent Task";
        dueDate = "2025-01-01";
        estimatedTime = 15;
    }

    public UrgentTask(String taskName, String dueDate, int estimatedTime) {
        // TODO: Initialize with provided values
        this.taskName = taskName;
        this.dueDate = dueDate;
        this.estimatedTime = estimatedTime;
    }

    @Override
    public String getTaskName() {
        // TODO: Return the task name
        return taskName;
    }

    @Override
    public void setTaskName(String taskName) {
        // TODO: Set the task name
        this.taskName = taskName;
    }

    @Override
    public String getDueDate() {
        // TODO: Return the due date
        return dueDate;
    }

    @Override
    public void setDueDate(String dueDate) {
        // TODO: Set the due date
        this.dueDate = dueDate;
    }

    @Override
    public int getEstimatedTime() {
        // TODO: Return the estimated time
        return estimatedTime;
    }

    @Override
    public void setEstimatedTime(int estimatedTime) {
        // TODO: Set the estimated time
        this.estimatedTime = estimatedTime;
    }

    @Override
    public String getPriority() {
        // TODO: Return the task priority
        return priority;
    }
}