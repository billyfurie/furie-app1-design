package baseline;

import java.util.ArrayList;

public class ToDoList {

    private String title;
    private static final int capacity = 256;
    private ArrayList<Task> tasks;
    private ArrayList<Task> selectedTasks;
    private ArrayList<Task> completedTasks;
    private ArrayList<Task> incompleteTasks;

    public ToDoList(String title) {
        // initialize all the variables in ToDoList
    }

    public void addTask(Task task) {
        // add task to this list
    }

    public void removeTask(Task task) {
        // remove task from this list
    }

    public void completeTask(Task task) {
        // add the task to the completed list, remove from uncompleted list
    }

    public void editTitle(String newTitle) {
        // edit the title of the list
    }

    public void toggleSelectTask(Task task) {
        // add / remove from selected list accordingly
    }

    public ArrayList<Task> getAllTasks() {
        // return the tasks
        return null;
    }

    public ArrayList<Task> getCompletedTasks() {
        // return completedTasks
        return null;
    }

    public ArrayList<Task> getIncompleteTasks() {
        // return incompleteTasks
        return null;
    }

    public ArrayList<Task> getSelectedTasks() {
        // return selectedTasks
        return null;
    }

    public void collapseAllTasks() {
        // go through the list and collapse the tasks
    }

    public void openAllTasks() {
        // go through the list and open the tasks
    }

    public String getTitle() {
        // return the title of the list
        return null;
    }


}
