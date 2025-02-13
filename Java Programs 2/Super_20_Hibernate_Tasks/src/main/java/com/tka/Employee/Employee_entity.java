package com.tka.Employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employee_entity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String firstname;
    private String lastname;
    private String emai;
    private int salary;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department_Entity department;

    // No-argument constructor
    public Employee_entity() {
        super();
    }

    // Constructor with all fields
    public Employee_entity(String firstname, String lastname, String emai, int salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.emai = emai;
        this.salary = salary;
    }

    // Constructor with department
    public Employee_entity(long id, String firstname, String lastname, String emai, int salary, Department_Entity department) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.emai = emai;
        this.salary = salary;
        this.department = department;
    }

    // Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmai() {
        return emai;
    }

    public void setEmai(String emai) {
        this.emai = emai;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Department_Entity getDepartment() {
        return department;
    }

    public void setDepartment(Department_Entity department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee_entity [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", emai=" + emai
                + ", salary=" + salary + ", department=" + department + "]";
    }
}
