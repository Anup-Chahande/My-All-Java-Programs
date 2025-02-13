package com.tka.Employee;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Department_Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long depid;

    private String name;
    private String location;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Employee_entity> employees = new HashSet<>();

    // No-argument constructor
    public Department_Entity() {
        super();
    }

    // Constructor with fields
    public Department_Entity(long depid, String name, String location, Set<Employee_entity> employees) {
        this.depid = depid;
        this.name = name;
        this.location = location;
        this.employees = employees;
    }

    // Getters and Setters
    public long getDepid() {
        return depid;
    }

    public void setDepid(long depid) {
        this.depid = depid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Set<Employee_entity> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee_entity> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Department_Entity [depid=" + depid + ", name=" + name + ", location=" + location + "]";
    }
}
