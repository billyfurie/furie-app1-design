package baseline;

public class FileManager {

    public void saveListsToFile(ToDoListContainer container, String filePath) {
        // have a StringBuilder
        // create the format in how we are going to save the files
        // go through each list in the container, parsing it, add that to our StringBuilder
        // write the StringBuilder into a file at specified path
    }

    public String getListFormatted(ToDoList toDoList) {
        // format the list on how we decide to format for our save files
        // return the String

        return null;
    }

    public ToDoListContainer loadListsFromFile() {
        // parse through the file based on our format
        // create a container to store each list we parse through
        // return this container

        return null;
    }
}
