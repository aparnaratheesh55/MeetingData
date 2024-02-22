package com.example.MeetingData.Service;


import com.example.MeetingData.Model.Department;
import com.example.MeetingData.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department createDepartment(Department department){
        return departmentRepository.save(department);
    }
    public List<Department> findAllDepartment(){
        return  departmentRepository.findAll();
    }


}
