package Commands;


import Entity.Task;
import Utility.TaskManager;

import java.util.Scanner;

public class AddCommand implements Command{

    private TaskManager taskManager;

    public AddCommand(TaskManager taskManager){
        this.taskManager = taskManager;
    };

    public AddCommand(){};


    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your task: ");
        String text = scanner.nextLine();
        Task task = new Task(text);
        taskManager.addTask(task);
    }
}
