package com.example.departments.repository;

import com.example.departments.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {


}
