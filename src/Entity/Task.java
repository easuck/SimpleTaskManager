package Entity;

public class Task {

    private String taskText;

    public Task(String taskText) {
        this.taskText = taskText;
    }

    public Task(){};

    public String getTaskText() {
        return taskText;
    }

    public void setTaskText(String taskText) {
        this.taskText = taskText;
    }
}
