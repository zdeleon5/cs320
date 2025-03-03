package task;

public class Task {
    private final String id;
    private String name;
    private String description;

    public Task(String id, String name, String description) {
        // Validate the input
        if (id == null || id.length() > 10) {
            throw new IllegalArgumentException("Id cannot be null or longer than 10 characters");
        }

        if (name == null || name.length() > 20) {
            throw new IllegalArgumentException("Name cannot be null or longer than 20 characters");
        }

        if (description == null || description.length() > 50) {
            throw new IllegalArgumentException("Description cannot be null or longer than 50 characters");
        }

        this.id = id;
        this.name = name;
        this.description = description;
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    // Validate the input through the setter methods

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }

        if (name.length() > 20) {
            throw new IllegalArgumentException("Name cannot be longer than 20 characters");
        }

        this.name = name;
    }

    public void setDescription(String description) {
        if (description == null) {
            throw new IllegalArgumentException("Description cannot be null");
        }

        if (description.length() > 50) {
            throw new IllegalArgumentException("Description cannot be longer than 50 characters");
        }

        this.description = description;
    }
}