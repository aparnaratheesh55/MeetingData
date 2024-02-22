package com.example.MeetingData.Model;


import jakarta.persistence.*;

@Entity
public class Employee {

    @Id
    private Integer id;

    @Column(name = "name")
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDepartment() {
        return department.getDepartmentId();
    }

    public void setDepartment(Department department) {
        this.department = department;
    }



    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;




}
