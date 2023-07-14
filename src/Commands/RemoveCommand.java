package Commands;

import Utility.TaskManager;

import java.util.Scanner;

public class RemoveCommand implements Command{

    private TaskManager taskManager;

    public RemoveCommand(TaskManager taskManager){
        this.taskManager = taskManager;
    }

    public RemoveCommand(){};

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        ShowCommand showCommand = new ShowCommand(taskManager);
        showCommand.execute();
        System.out.print("enter index of task you want to delete: ");
        while(true){
            Integer index = scanner.nextInt();
            if (index instanceof Integer && index < taskManager.getTodolist().size() && index >= 0){
                taskManager.removeTask(index);
                break;
            }
            else{
                System.out.println("incorrect input, try enter a number");
                System.out.print("enter index of task you want to delete: ");
            }
        }

    }
}
