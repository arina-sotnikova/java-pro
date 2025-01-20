package homework3;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TasksProcessor {
    public static List<Task> getTasksInProgress(List<Task> tasksList) {
        return tasksList.stream()
                .filter(x -> x.getStatus() == TaskStatus.IN_PROGRESS)
                .collect(Collectors.toList());
    }

    public static long getNumberOfClosedTasks(List<Task> tasksList) {
        return tasksList.stream()
                .filter(x -> x.getStatus() == TaskStatus.CLOSED)
                .count();
    }

    public static boolean getTaskWithIdIfExists(List<Task> tasksList, int idToFind) {
        return tasksList.stream()
        .anyMatch(task -> task.getId() == idToFind);
    }

    public static Stream<Task> getSortedTasks(List<Task> tasksList) {
        return tasksList.stream().sorted((t, s)-> t.getStatus().compareTo(s.getStatus()));
    }

}
