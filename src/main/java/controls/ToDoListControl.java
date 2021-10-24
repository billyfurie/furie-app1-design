package controls;

import baseline.FXMLController;
import baseline.Task;
import baseline.ToDoList;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class ToDoListControl extends StackPane {


    private Button buttonList;
    private Button buttonOptions;
    private ToDoList toDoList;
    private TaskContainerControl taskContainerControl;
    private FXMLController controller;

    public ToDoListControl(String name) {
        // create a ToDoList with the name
        // initialize and include all the GUI per mockup
    }

    public void addTask(String title, String description, String dueDate) {
        // create new TaskControl
        // get the Task object from it

        // add the Task object to our ToDoList
        // add the TaskControl to our taskContainerControl
    }

    public void removeTask(Task task) {
        // remove the task from toDoList
        // remove from taskContainerControl
    }

    public void removeSelected() {
        // get all selected tasks from todolist
        // remove all of those tasks from the list and taskContainer
    }

    public void selectTask(Task task) {
        // select the task from the todolist
    }

    public TaskContainerControl getTaskContainerControl() {
        // return taskContainerControl
        return null;
    }

    public ToDoList getToDoList() {
        // return the toDoList
        return null;
    }

    public void openAllTasks() {
        // get all the tasks from list
        // open all
    }

    public void collapseAllTasks() {
        // get all the tasks from list
        // collapse all
    }

    public void editListTitle(String newTitle) {
        // change the title in the button, and in the toDoList

    }
}
