public class List {
    private String name;
    private String category;
    private int priorityLevel;
    private String isDone;

    public List() {
    }

    public List(String name, String category, int priorityLevel, String isDone) {
        this.name = name;
        this.category = category;
        this.priorityLevel = priorityLevel;
        this.isDone = isDone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(int priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public String getIsDone() {
        return isDone;
    }

    public void setIsDone(String isDone) {
        this.isDone = isDone;
    }
}
