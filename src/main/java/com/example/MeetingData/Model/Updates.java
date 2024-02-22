package com.example.MeetingData.Model;


import jakarta.persistence.*;

@Entity

public class Updates {

    @Id
    private Integer updateId;

    @ManyToOne
    @JoinColumn(name="department_id")
    private Department department;

    @ManyToOne
    @JoinColumn(name="employee_id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "meeting_id")
    private Meeting meeting;

    @ManyToOne
    @JoinColumn(name="response_id")
    private Response response;


    public Integer getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Integer updateId) {
        this.updateId = updateId;
    }

    public Integer getDepartment() {
        return department.getDepartmentId();
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Integer getEmployee() {
        return employee.getId();
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Integer getMeeting() {
        return meeting.getMeetingId();
    }

    public void setMeeting(Meeting meeting) {
        this.meeting = meeting;
    }

    public Integer getResponse() {
        return response.getResponseId();
    }

    public void setResponse(Response response) {
        this.response = response;
    }
}

