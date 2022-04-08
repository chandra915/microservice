package com.example.departments.service;

import com.example.departments.Entity.Department;
import com.example.departments.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;


@Service
public class DepartmentServiceImplementation implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;


    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRepository.findAll();
    }

    @Override
    public Department fetchDepartmentById(Long departmentId) {
        return departmentRepository.findById(departmentId).get();
    }

    @Override
    public String deleteDepartmentById(Long departmentId) {
        departmentRepository.deleteById(departmentId);
        return "Department Deleted !!";
    }

    @Override
    public Department updateDepartmentById(Long departmentId, Department department) {
        Department dpt=departmentRepository.findById(departmentId).get();
        if(Objects.nonNull(department.getDepartmentName()) && !"".equals(department.getDepartmentName()))
        {
            dpt.setDepartmentName(department.getDepartmentName());
        }
        if(Objects.nonNull(department.getDepartmentCode()) && !"".equals(department.getDepartmentCode()))
        {
            dpt.setDepartmentCode(department.getDepartmentCode());
        }
        if(Objects.nonNull(department.getDepartmentAddress()) && !"".equals(department.getDepartmentAddress()))
        {
            dpt.setDepartmentAddress(department.getDepartmentAddress());
        }

        return departmentRepository.save(dpt) ;
    }


}
