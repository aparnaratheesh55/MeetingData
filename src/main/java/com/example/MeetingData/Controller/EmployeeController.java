package com.example.MeetingData.Controller;


import com.example.MeetingData.Model.Employee;
import com.example.MeetingData.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add-employee")
    public String addEmployee(@RequestParam Integer id,@RequestParam String name,@RequestParam  Integer departmentId){
        employeeService.addEmployee(id, name, departmentId);
        return "details added succesfully";
    }

    @GetMapping("/find-employee")
    public List<Employee> findAllEmployee(){
        return  employeeService.findAllEmployee();
    }

}
