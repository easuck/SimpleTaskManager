import Utility.CommandsManager;
import Utility.TaskManager;

public class Main {
    public static void main(String[] args) {

        TaskManager taskManager = new TaskManager();
        CommandsManager commandsManager = new CommandsManager(taskManager);
        commandsManager.doCommands();
    }
}