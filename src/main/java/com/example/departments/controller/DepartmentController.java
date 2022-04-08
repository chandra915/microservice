package com.example.departments.controller;


import com.example.departments.Entity.Department;
import com.example.departments.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department)
    {
            return departmentService.saveDepartment(department);
    }
    @GetMapping("/departments")
    public List<Department> fetchDepartmentList()
    {
        return  departmentService.fetchDepartmentList();
    }


    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId){
        return departmentService.fetchDepartmentById(departmentId);
    }


    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId){
        return departmentService.deleteDepartmentById(departmentId);
    }

    @PutMapping("/departments/{id}")
    public  Department updateDepartmentById(@PathVariable("id") Long departmentId,@RequestBody Department department)
    {
        return  departmentService.updateDepartmentById(departmentId,department);
    }





}
