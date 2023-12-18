package EmbeddedSystemsLab.Lab;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "todos")     // Specify  the MongoDB collection name
public class Todo {

    @Id
    private String id;
    private String title;
    private String description;
    private boolean completed;

    // Constructors

    public Todo() {
        // default constructor
    }

    public Todo(String title, String description, boolean completed) {
        this.title = title;
        this.description = description;
        this.completed = completed;
    }

    // Getters

    public String getId() {
        return id;
    }
    
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    // Setters

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
