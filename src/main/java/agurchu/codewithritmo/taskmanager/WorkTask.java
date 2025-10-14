package agurchu.codewithritmo.taskmanager;

public class WorkTask extends Task {
    private String taskName;
    private String dueDate;
    private int estimatedTime;
    private final String priority = "Medium";

    public WorkTask() {
        // TODO: Initialize default values
    }

    public WorkTask(String taskName, String dueDate, int estimatedTime) {
        // TODO: Initialize with provided values
    }

    @Override
    public String getTaskName() {
        // TODO: Return the task name
        return null;
    }

    @Override
    public void setTaskName(String taskName) {
        // TODO: Set the task name
    }

    @Override
    public String getDueDate() {
        // TODO: Return the due date
        return null;
    }

    @Override
    public void setDueDate(String dueDate) {
        // TODO: Set the due date
    }

    @Override
    public int getEstimatedTime() {
        // TODO: Return the estimated time
        return 0;
    }

    @Override
    public void setEstimatedTime(int estimatedTime) {
        // TODO: Set the estimated time
    }

    @Override
    public String getPriority() {
        // TODO: Return the task priority
        return null;
    }
}
