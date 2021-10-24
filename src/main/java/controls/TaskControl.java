package controls;

import baseline.Task;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TitledPane;

public class TaskControl {

    private Task task;
    private TitledPane taskTitledPane;
    private TextArea descriptionText;
    private Label dueDateLabel;
    private Button selectButton;

    
    public TaskControl(String title, String description, String dueDate) {
        // initialize the Task object based on these parameters
        // initialize the GUI objects with design properties from mockup
    }

    public void setCollapsed(boolean collapsed) {
        // set whether this window is collapsed
    }

    public Task getTask() {
        // return the Task object
        return null;
    }

    // select this task in the list its in
    public void select() {
        // needs to access the list it is a part of... interact with controller instance?
        // change color here
    }
}
