package Utility;

import Commands.AddCommand;
import Commands.Command;
import Commands.RemoveCommand;
import Commands.ShowCommand;
import java.util.HashMap;
import java.util.Scanner;

public class CommandsManager {

    private HashMap<String, Command> commands = new HashMap<>();

    public CommandsManager(TaskManager taskManager){
        commands.put("add", new AddCommand(taskManager));
        commands.put("remove", new RemoveCommand(taskManager));
        commands.put("show", new ShowCommand(taskManager));
    }

    public void doCommands(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("available commands are \"add\", \"remove\", \"show\"");
        System.out.print("enter command: ");

        while(scanner.hasNextLine()){
            String command = scanner.nextLine().trim();
            if (commands.containsKey(command)){
                commands.get(command).execute();
                System.out.print("enter command: ");
            }
            else{
                System.out.println("no such command, try again");
                System.out.print("enter command: ");
            }
        }
    }


}
