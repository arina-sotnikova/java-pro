package homework3;

public class Task {
    private int id;
    private String name;
    private TaskStatus status;

    public Task(int id, String name, TaskStatus status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", id: " + id + ", status: " + status;
    }
}
