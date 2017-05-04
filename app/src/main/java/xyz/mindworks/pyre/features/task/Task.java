package xyz.mindworks.pyre.features.task;

import java.io.Serializable;
import java.util.HashMap;

public class Task implements Serializable {

    private String title;
    private String date;
    private String category;
    private String priority;
    private String label;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public HashMap<String, String> toFirebaseObject() {
        HashMap<String, String> task = new HashMap<String, String>();
        task.put("title", title);
        task.put("date", date);
        task.put("category", category);
        task.put("priority", priority);
        task.put("label", label);

        return task;
    }

}
