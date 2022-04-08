package com.example.departments.service;

import com.example.departments.Entity.Department;

import java.util.List;

public interface DepartmentService {

    public  Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long departmentId);

    public String deleteDepartmentById(Long departmentId);

    public Department updateDepartmentById(Long departmentId, Department department);
}
