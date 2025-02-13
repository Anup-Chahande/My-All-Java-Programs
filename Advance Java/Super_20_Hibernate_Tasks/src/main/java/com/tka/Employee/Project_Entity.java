

mpackage com.tka.Employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Project_Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long projid;

    private String name;
    private String description; // Changed to camelCase

    // Default constructor
    public Project_Entity() {
        super();
    }

    // Constructor with fields
    public Project_Entity(long projid, String name, String description) {
        this.projid = projid;
        this.name = name;
        this.description = description; // Fixed assignment
    }

    // Getters and Setters
    public long getProjid() {
        return projid;
    }

    public void setProjid(long projid) {
        this.projid = projid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description; // Changed to camelCase
    }

    public void setDescription(String description) {
        this.description = description; // Changed to camelCase
    }

    @Override
    public String toString() {
        return "Project_Entity [projid=" + projid + ", name=" + name + ", description=" + description + "]"; // Changed to camelCase
    }
}
