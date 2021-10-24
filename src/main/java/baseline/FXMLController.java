/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 William Furie
 */

package baseline;

import java.net.URL;
import java.util.ResourceBundle;

import controls.ToDoListContainerControl;
import controls.ToDoListControl;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ScrollPane;


public class FXMLController implements Initializable {


    // these are already made in scene
    @FXML
    private ScrollPane ListsPane;
    @FXML
    private ScrollPane TasksPane;

    // Left pane with list of ToDoLists
    // includes ToDoListContainer
    private ToDoListContainerControl listContainerControl;
    private ToDoListControl currentListControl; // current list we are viewing

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        /*
            Empty, just GUI Mockup for now.
         */

        // start off by setting the content of the Lists Pane on the left, where the user can create / click on a list
        // once they click on a list, they will view that list in TaskViewer mode
    }

    // called when a ToDoList is clicked on
    public void setCurrentToDoList(ToDoListControl listControl) {
        // make listControl current
        // update the view
    }

    private void updateTaskView() {
        // update the task view with the tasks of our current list
    }

    public void selectTask(Task task) {
        // select the task from currentListControl
    }

    public void addTask() {
        // get the task details from the task creator panel
        // create a task with those details in the current list
        // create task based on title, description, due date
    }

    public void removeTask(Task task) {
        // remove a task from currentListControl
    }

    public void removeSelectedTasks() {
        // remove the tasks that have been selected from currentListControl

    }

    public void openAllTasks() {
        // open all the tasks views
    }

    public void collapseAllTasks() {
        // collapse all the tasks views
    }

    // create a new ToDoList
    public void addToDoList() {
        // get text from field
        // create and add a new ToDoList to the list container
    }

    // remove a ToDoList
    public void removeToDoList(ToDoListControl toDoListControl) {
        // remove specified ToDoList to the list container
    }
}

