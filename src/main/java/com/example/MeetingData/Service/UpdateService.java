package com.example.MeetingData.Service;


import com.example.MeetingData.Model.*;
import com.example.MeetingData.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UpdateService {
    @Autowired
    private UpdateRepository updateRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private MeetingRepository meetingRepository;

    @Autowired
    private ResponseRepository responseRepository;

    public void addUpdate(Integer id, Integer updateId, Integer responseId, Integer departmentId, Integer meetingId) {
        Department department = departmentRepository.findById(departmentId)
                .orElseThrow(() -> new IllegalArgumentException("Department not found"));
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Employee not found"));
        Response response = responseRepository.findById(responseId)
                .orElseThrow(() -> new IllegalArgumentException("response not found"));
        Meeting meeting = meetingRepository.findById(meetingId)
                .orElseThrow(() -> new IllegalArgumentException("Meeting not found"));


        Updates updates = new Updates();
        updates.setUpdateId(updateId);
        updates.setDepartment(department);
        updates.setResponse(response);
        updates.setMeeting(meeting);
        updates.setEmployee(employee);
        updateRepository.save(updates);


    }

    public List<Updates> getAllUpdate() {
        return updateRepository.findAll();
    }


}
