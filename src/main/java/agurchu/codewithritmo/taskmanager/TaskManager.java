package agurchu.codewithritmo.taskmanager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TaskManager {
    private final ArrayList<Task> listOfTasks = new ArrayList<>(Arrays.asList(
            new PersonalTask(),
            new WorkTask(),
            new UrgentTask()));
    private final String[] mainMenuOptions = {
            "View Tasks",
            "Add Task",
            "Remove Task",
            "Update Task",
            "Exit" };
    private final Scanner scanner;

    public TaskManager() {
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Welcome to Task Manager!");
        boolean exit = false;
        while (!exit) {
            exit = mainMenuOptions();
        }
        System.out.println("Thank you. Goodbye!");
    }

    private boolean mainMenuOptions() {
        displayTasks(false);
        return displayMainMenuOptions();
    }

    private boolean displayMainMenuOptions() {
        System.out.println("Main Menu:");
        for (int i = 0; i < mainMenuOptions.length; i++) {
            System.out.print("\t[");
            System.out.print(Integer.toString(i + 1));
            System.out.print("] ");
            System.out.println(mainMenuOptions[i]);
        }

        int choice = getIntegerInput("Please choose an option from the above: ");
        switch (choice) {
            case 1 -> doViewTasksMenu();
            case 2 -> doAddTaskMenu();
            case 3 -> doRemoveTaskMenu();
            case 4 -> doUpdateTaskMenu();
            case 5 -> {
                return true;
            }
            default -> {
                return false;
            }
        }
        return false;
    }

    private void doViewTasksMenu() {
        System.out.println("View Tasks");
        displayTasks(true);
    }

    private void doAddTaskMenu() {
        System.out.println("Add Task");
        String taskName = getStringInput("What would you like to name this task? ");
        String dueDate = getStringInput("Enter the due date (YYYY-MM-DD): ");
        int estimatedTime = getIntegerInput("Enter the estimated time to complete (in minutes): ");
        System.out.println("What type of task would you like to create?");
        System.out.println("\t- Personal");
        System.out.println("\t- Work");
        System.out.println("\t- Urgent");
        String taskType = getStringInput("Enter the task type: ").toLowerCase().trim();
        addTask(taskName, dueDate, estimatedTime, taskType);
        Task newTask = listOfTasks.get(listOfTasks.size() - 1);
        System.out.println("New Task '" + newTask.getTaskName() + "' created. Due: " + newTask.getDueDate() + ", Estimated Time: " + newTask.getEstimatedTime() + " mins, Priority: " + newTask.getPriority());
    }

    private void doRemoveTaskMenu() {
        System.out.println("Remove Task");
        displayTasks(false);
        String taskToRemove = getStringInput("Which task would you like to remove? (Enter Task Name) ");
        removeTask(taskToRemove);
    }

    private void doUpdateTaskMenu() {
        System.out.println("Update Task");
        displayTasks(true);
        int index = getIntegerInput("Which task would you like to update? ") - 1;
        if (index >= 0 && index < listOfTasks.size()) {
            String newName = getStringInput("Enter the new task name: ");
            String newDueDate = getStringInput("Enter the new due date (YYYY-MM-DD): ");
            int newEstimatedTime = getIntegerInput("Enter the new estimated time (in minutes): ");
            Task task = listOfTasks.get(index);
            task.setTaskName(newName);
            task.setDueDate(newDueDate);
            task.setEstimatedTime(newEstimatedTime);
            System.out.println("Task '" + task.getTaskName() + "' updated. Due: " + newDueDate + ", Estimated Time: " + newEstimatedTime + " mins.");
        } else {
            System.out.println("Invalid task selection.");
        }
    }

    private void displayTasks(boolean showOptions) {
        System.out.println("");
        if (!showOptions) {
            System.out.println("Your tasks:");
        }
        for (int i = 0; i < listOfTasks.size(); i++) {
            Task task = listOfTasks.get(i);
            if (showOptions) {
                System.out.print("\t[");
                System.out.print(Integer.toString(i + 1));
                System.out.print("] ");
            }
            System.out.print(task.getTaskName());
            System.out.print(" - Due: ");
            System.out.print(task.getDueDate());
            System.out.print(", Estimated Time: ");
            System.out.print(Integer.toString(task.getEstimatedTime()));
            System.out.print(" mins, Priority: ");
            System.out.println(task.getPriority());
        }
        System.out.println("");
    }

    public ArrayList<Task> getListOfTasks() {
        return listOfTasks;
    }

    public void addTask(String taskName, String dueDate, int estimatedTime, String taskType) {
        if (taskType.contains("personal")) {
            listOfTasks.add(taskName.isBlank() ? new PersonalTask() : new PersonalTask(taskName, dueDate, estimatedTime));
        } else if (taskType.contains("work")) {
            listOfTasks.add(taskName.isBlank() ? new WorkTask() : new WorkTask(taskName, dueDate, estimatedTime));
        } else if (taskType.contains("urgent")) {
            listOfTasks.add(taskName.isBlank() ? new UrgentTask() : new UrgentTask(taskName, dueDate, estimatedTime));
        } else {
            listOfTasks.add(new PersonalTask("New Task", dueDate, estimatedTime));
        }
    }

    public void removeTask(String taskName) {
        int index = -1;
        for (Task task : listOfTasks) {
            if (task.getTaskName().contains(taskName)) {
                index = listOfTasks.indexOf(task);
                System.out.println(task.getTaskName() + " removed.");
            }
        }
        if (index != -1) {
            listOfTasks.remove(index);
        }
    }

    private int getIntegerInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid integer.");
            System.out.print(prompt);
            scanner.next();
        }
        int value = scanner.nextInt();
        scanner.nextLine(); // Clear the newline
        return value;
    }

    private String getStringInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
}
