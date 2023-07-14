package Utility;

import Entity.Task;

import java.util.LinkedList;

public class TaskManager {

    private LinkedList<Task> todolist = new LinkedList<>();

    public TaskManager(){};

    public LinkedList<Task> getTodolist() {
        return todolist;
    }

    public void addTask(Task task){
        todolist.add(task);
    }

    public void removeTask(int index){
        todolist.remove(index);
    }
}
