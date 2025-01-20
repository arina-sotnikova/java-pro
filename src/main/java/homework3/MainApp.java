package homework3;

import java.util.Arrays;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        Task task1 = new Task(1, "a1a1a1", TaskStatus.OPEN);
        Task task2 = new Task(2, "b1b1b1", TaskStatus.CLOSED);
        Task task3 = new Task(3, "c1c1c1", TaskStatus.IN_PROGRESS);
        Task task4 = new Task(4, "a2a2a2", TaskStatus.IN_PROGRESS);
        Task task5 = new Task(5, "b2b2b2", TaskStatus.CLOSED);
        Task task6 = new Task(6, "c2c2c2", TaskStatus.OPEN);
        Task task7 = new Task(7, "a3a3a3", TaskStatus.CLOSED);
        Task task8 = new Task(8, "b3b3b3", TaskStatus.IN_PROGRESS);

        List<Task> tasks = Arrays.asList(task1, task2, task3, task4, task5, task6, task7, task8);

        TasksProcessor.getTasksInProgress(tasks).forEach(System.out::println);
        System.out.println(TasksProcessor.getNumberOfClosedTasks(tasks));
        System.out.println(TasksProcessor.getTaskWithIdIfExists(tasks, 2));
        System.out.println(TasksProcessor.getTaskWithIdIfExists(tasks, 99));

        TasksProcessor.getSortedTasks(tasks);
        tasks.forEach(System.out::println);
    }
}
