package com.example.MeetingData.Controller;


import com.example.MeetingData.Model.Department;
import com.example.MeetingData.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping()
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/add-department")
    public Department createDepartment(@RequestBody  Department department){
        return departmentService.createDepartment(department);
    }
    @GetMapping("/find-department")
    public List<Department> findAllDepartment(){
        return departmentService.findAllDepartment();
    }

}
