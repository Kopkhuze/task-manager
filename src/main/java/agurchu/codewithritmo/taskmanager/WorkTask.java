package agurchu.codewithritmo.taskmanager;

public class WorkTask extends Task {
    private String taskName;
    private String dueDate;
    private int estimatedTime;
    private final String priority = "Medium";

    public WorkTask() {
        // TODO: Initialize default values
        taskName = "Work Task";
        dueDate = "2025-01-01";
        estimatedTime = 60;
    }

    public WorkTask(String taskName, String dueDate, int estimatedTime) {
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
        if (estimatedTime < 0) {
            this.estimatedTime = 0;
        } else {
            this.estimatedTime = estimatedTime;
        }
    }

    @Override
    public String getPriority() {
        // TODO: Return the task priority
        return priority;
    }
}
