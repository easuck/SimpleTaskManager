package Commands;

import Utility.TaskManager;

public class ShowCommand implements Command{

    private TaskManager taskManager;

    public ShowCommand(TaskManager taskManager) {
        this.taskManager = taskManager;
    }

    public ShowCommand(){};

    @Override
    public void execute() {
        System.out.println("your tasks: ");
        for (int i = 0; i < taskManager.getTodolist().size(); i++ ){
            System.out.println(i + " : " + taskManager.getTodolist().get(i).getTaskText());
        }
    }
}
