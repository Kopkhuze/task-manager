package agurchu.codewithritmo.taskmanager;

public abstract class Task {
    public abstract String getTaskName();
    public abstract void setTaskName(String taskName);
    public abstract String getDueDate();
    public abstract void setDueDate(String dueDate);
    public abstract int getEstimatedTime();
    public abstract void setEstimatedTime(int estimatedTime);
    public abstract String getPriority();
}