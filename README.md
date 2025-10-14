# Task Manager Project

## Overview
The **Task Manager** is a console-based Java application that allows users to manage tasks. Users can view, add, remove, and update tasks through a menu-driven interface. The system supports three types of tasks: `PersonalTask`, `WorkTask`, and `UrgentTask`, each with a name, due date, estimated time to complete, and priority. This project is designed to help you practice object-oriented programming (OOP) concepts, including inheritance, encapsulation, and unit testing.

## Project Structure
The project is organized in the Java package `za.co.wethinkcode.taskmanager`. The following files are included:

- **Source Files**:
    - `Task.java`: Abstract base class defining the `Task` interface.
    - `PersonalTask.java`: Represents a personal task (to be implemented).
    - `WorkTask.java`: Represents a work task (to be implemented).
    - `UrgentTask.java`: Represents an urgent task (to be implemented).
    - `TaskManager.java`: Main application class with the console interface and task management logic.
    - `Main.java`: Entry point to run the application.

- **Test Files**:
    - `PersonalTaskTest.java`: JUnit tests for `PersonalTask`.
    - `WorkTaskTest.java`: JUnit tests for `WorkTask`.
    - `UrgentTaskTest.java`: JUnit tests for `UrgentTask`.
    - `TaskManagerTest.java`: JUnit tests for `TaskManager`.

## Prerequisites
- **Java Development Kit (JDK)**: Version 8 or higher.
- **JUnit**: Version 5 (Jupiter) for running tests.
- **IDE or Build Tool**: Use an IDE like IntelliJ IDEA, Eclipse, or VS Code, or a build tool like Maven/Gradle to manage dependencies and run tests.

## Setup Instructions
1. **Create a Java Project**:
    - Set up a new Java project in your preferred IDE.
    - Use the package `za.co.wethinkcode.taskmanager` for all source and test files.
    - Place source files in the `src/main/java/za/co/wethinkcode/taskmanager` directory.
    - Place test files in the `src/test/java/za/co/wethinkcode/taskmanager` directory.

2. **Add Files**:
    - Copy the provided files (`Task.java`, `PersonalTask.java`, `WorkTask.java`, `UrgentTask.java`, `TaskManager.java`, `Main.java`) into the source directory.
    - Copy the test files (`PersonalTaskTest.java`, `WorkTaskTest.java`, `UrgentTaskTest.java`, `TaskManagerTest.java`) into the test directory.

3. **Configure JUnit**:
    - Ensure JUnit 5 is included in your project. If using Maven, add the following dependency to your `pom.xml`:
      ```xml
      <dependency>
          <groupId>org.junit.jupiter</groupId>
          <artifactId>junit-jupiter</artifactId>
          <version>5.9.0</version>
          <scope>test</scope>
      </dependency>
      ```
    - For Gradle, add:
      ```gradle
      testImplementation 'org.junit.jupiter:junit-jupiter:5.9.0'
      ```

4. **Run the Application**:
    - Run `Main.java` to start the Task Manager. Use the console menu to interact with the application.

## Your Task
Your primary task is to complete the implementation of the `PersonalTask`, `WorkTask`, and `UrgentTask` classes. These classes are currently empty templates that extend the abstract `Task` class. You must implement the constructors and methods to pass the provided unit tests.

### Implementation Guidelines
For each class (`PersonalTask`, `WorkTask`, `UrgentTask`):
- **Fields**:
    - `taskName`: A `String` for the task's name.
    - `dueDate`: A `String` for the task's due date (format: `YYYY-MM-DD`).
    - `estimatedTime`: An `int` for the estimated time to complete in minutes.
    - `priority`: A `String` with a fixed value (`Low` for `PersonalTask`, `Medium` for `WorkTask`, `High` for `UrgentTask`).

- **Constructors**:
    - Default constructor: Set default values (e.g., `"Personal Task"`, `"2025-01-01"`, `30` for `PersonalTask`).
    - Parameterized constructor: Accept `taskName`, `dueDate`, and `estimatedTime` and initialize the fields.

- **Methods**:
    - `getTaskName()`: Return the task name.
    - `setTaskName(String)`: Update the task name.
    - `getDueDate()`: Return the due date.
    - `setDueDate(String)`: Update the due date.
    - `getEstimatedTime()`: Return the estimated time.
    - `setEstimatedTime(int)`: Update the estimated time, ensuring it is non-negative (set to 0 if negative).
    - `getPriority()`: Return the fixed priority value.

### Expected Behavior
- **PersonalTask**:
    - Default: Name = "Personal Task", Due Date = "2025-01-01", Estimated Time = 30, Priority = "Low".
    - Setters should update fields, with `setEstimatedTime` rejecting negative values.
- **WorkTask**:
    - Default: Name = "Work Task", Due Date = "2025-01-01", Estimated Time = 60, Priority = "Medium".
- **UrgentTask**:
    - Default: Name = "Urgent Task", Due Date = "2025-01-01", Estimated Time = 15, Priority = "High".

### Running Tests
- Run the JUnit tests (`PersonalTaskTest`, `WorkTaskTest`, `UrgentTaskTest`, `TaskManagerTest`) to verify your implementations.
- All tests should pass once you correctly implement the task classes.
- Use your IDE's test runner or a command like `mvn test` (Maven) or `gradle test` (Gradle).

## Application Usage
Run `Main.java` to start the Task Manager. The console menu provides the following options:
1. **View Tasks**: Display all tasks with their name, due date, estimated time, and priority.
2. **Add Task**: Create a new task by specifying its name, due date, estimated time, and type (Personal, Work, or Urgent).
3. **Remove Task**: Remove a task by its name.
4. **Update Task**: Update a task's name, due date, and estimated time.
5. **Exit**: Close the application.

## Testing
The provided test files verify the following:
- **PersonalTaskTest**: Tests getters, setters, default values, and negative time handling for `PersonalTask`.
- **WorkTaskTest**: Tests getters, setters, default values, and negative time handling for `WorkTask`.
- **UrgentTaskTest**: Tests getters, setters, default values, and negative time handling for `UrgentTask`.
- **TaskManagerTest**: Tests adding and removing tasks in the `TaskManager` class.

Ensure all tests pass by implementing the task classes correctly.

## Optional Extensions
Once you complete the core implementation, consider adding these features:
1. **Date Validation**: Ensure due dates follow the `YYYY-MM-DD` format and are valid.
2. **Task Sorting**: Add a method to sort tasks by due date or priority.
3. **Task Completion**: Implement a feature to mark tasks as completed and filter them in the view.
4. **Input Validation**: Enhance input handling to prevent empty task names or invalid inputs.

## Tips
- Refer to the test files to understand the expected behavior of each method.
- Test your implementation incrementally, running tests after each method to catch errors early.
- Use the console application to manually verify that your task classes work with the `TaskManager`.

## Submission
- Submit your completed `PersonalTask.java`, `WorkTask.java`, and `UrgentTask.java` files.
- Ensure all tests pass and the application runs without errors.
- Optionally, include any extensions you implemented with a brief description.

Good luck, and have fun managing tasks!