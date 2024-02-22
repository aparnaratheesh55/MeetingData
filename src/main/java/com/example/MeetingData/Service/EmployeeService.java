package com.example.MeetingData.Service;


import com.example.MeetingData.Model.Department;
import com.example.MeetingData.Model.Employee;
import com.example.MeetingData.Repository.DepartmentRepository;
import com.example.MeetingData.Repository.EmployeeRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    @Autowired
    private DepartmentRepository departmentRepository;



    public void addEmployee(Integer id, String name, Integer departmentId) {
        Department department = departmentRepository.findById(departmentId)
                .orElseThrow(() -> new IllegalArgumentException("Department not found"));

        Employee employee = new Employee();
        employee.setId(id);
        employee.setName(name);
        employee.setDepartment(department);

        employeeRepository.save(employee);
    }


    public List<Employee> findAllEmployee(){
        return employeeRepository.findAll();
    }

}
